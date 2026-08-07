package com.facebook.react.fabric.mounting;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactIgnorableMountingException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public class MountItemDispatcher {
    private static final long FRAME_TIME_NS = 16666666;
    private static final String TAG = "MountItemDispatcher";
    private final ItemDispatchListener mItemDispatchListener;
    private final MountingManager mMountingManager;

    @NonNull
    private final ConcurrentLinkedQueue<DispatchCommandMountItem> mViewCommandMountItems = new ConcurrentLinkedQueue<>();

    @NonNull
    private final ConcurrentLinkedQueue<MountItem> mMountItems = new ConcurrentLinkedQueue<>();

    @NonNull
    private final ConcurrentLinkedQueue<MountItem> mPreMountItems = new ConcurrentLinkedQueue<>();
    private boolean mInDispatch = false;
    private long mBatchedExecutionTime = 0;
    private long mRunStartTime = 0;
    private long mLastFrameTimeNanos = 0;
    private boolean mIsPremountScheduled = false;
    private final Runnable mPremountRunnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f22592a.lambda$new$0();
        }
    };

    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(List<MountItem> list);

        void willMountItems(List<MountItem> list);
    }

    public MountItemDispatcher(MountingManager mountingManager, ItemDispatchListener itemDispatchListener) {
        this.mMountingManager = mountingManager;
        this.mItemDispatchListener = itemDispatchListener;
    }

    private void dispatchPreMountItemsImpl(long j11) {
        MountItem mountItemPoll;
        ep.a.c(0L, "MountItemDispatcher::premountViews");
        this.mInDispatch = true;
        while (System.nanoTime() <= j11 && (mountItemPoll = this.mPreMountItems.poll()) != null) {
            try {
                if (tn.b.e()) {
                    printMountItem(mountItemPoll, "dispatchPreMountItems");
                }
                executeOrEnqueue(mountItemPoll);
            } catch (Throwable th2) {
                this.mInDispatch = false;
                throw th2;
            }
        }
        this.mInDispatch = false;
        ep.a.i(0L);
    }

    private static <E> List<E> drainConcurrentItemQueue(ConcurrentLinkedQueue<E> concurrentLinkedQueue) {
        if (concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            E ePoll = concurrentLinkedQueue.poll();
            if (ePoll != null) {
                arrayList.add(ePoll);
            }
        } while (!concurrentLinkedQueue.isEmpty());
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void executeOrEnqueue(MountItem mountItem) {
        if (!this.mMountingManager.isWaitingForViewAttach(mountItem.get_surfaceId())) {
            mountItem.execute(this.mMountingManager);
            return;
        }
        if (tn.b.e()) {
            qk.a.o(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.get_surfaceId()));
        }
        this.mMountingManager.getSurfaceManager(mountItem.get_surfaceId()).scheduleMountItemOnViewAttach(mountItem);
    }

    private List<MountItem> getAndResetMountItems() {
        return drainConcurrentItemQueue(this.mMountItems);
    }

    private List<MountItem> getAndResetPreMountItems() {
        return drainConcurrentItemQueue(this.mPreMountItems);
    }

    private List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return drainConcurrentItemQueue(this.mViewCommandMountItems);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.mIsPremountScheduled = false;
        if (this.mPreMountItems.isEmpty()) {
            return;
        }
        dispatchPreMountItemsImpl(this.mLastFrameTimeNanos + 8333333);
    }

    private static void printMountItem(MountItem mountItem, String str) {
        for (String str2 : mountItem.toString().split("\n")) {
            qk.a.m(TAG, str + ": " + str2);
        }
    }

    public void addMountItem(MountItem mountItem) {
        this.mMountItems.add(mountItem);
    }

    public void addPreAllocateMountItem(MountItem mountItem) {
        if (!this.mMountingManager.surfaceIsStopped(mountItem.get_surfaceId())) {
            this.mPreMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            qk.a.o(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.get_surfaceId()), mountItem.toString());
        }
    }

    public void addViewCommandMountItem(DispatchCommandMountItem dispatchCommandMountItem) {
        this.mViewCommandMountItems.add(dispatchCommandMountItem);
    }

    public void dispatchMountItems(Queue<MountItem> queue) {
        while (!queue.isEmpty()) {
            MountItem mountItemPoll = queue.poll();
            try {
                mountItemPoll.execute(this.mMountingManager);
            } catch (RetryableMountingLayerException e11) {
                if (mountItemPoll instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) mountItemPoll;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    printMountItem(mountItemPoll, "dispatchExternalMountItems: mounting failed with " + e11.getMessage());
                }
            }
        }
    }

    public void dispatchPreMountItems(long j11) {
        this.mLastFrameTimeNanos = j11;
        if (this.mPreMountItems.isEmpty()) {
            return;
        }
        if (!tn.b.i()) {
            dispatchPreMountItemsImpl(this.mLastFrameTimeNanos + 8333333);
        } else {
            if (this.mIsPremountScheduled) {
                return;
            }
            this.mIsPremountScheduled = true;
            UiThreadUtil.getUiThreadHandler().post(this.mPremountRunnable);
        }
    }

    public long getBatchedExecutionTime() {
        return this.mBatchedExecutionTime;
    }

    public long getRunStartTime() {
        return this.mRunStartTime;
    }

    public void tryDispatchMountItems() {
        if (this.mInDispatch) {
            return;
        }
        this.mInDispatch = true;
        try {
            dispatchMountItems();
            this.mInDispatch = false;
            this.mItemDispatchListener.didDispatchMountItems();
        } catch (Throwable th2) {
            this.mInDispatch = false;
            throw th2;
        }
    }

    private void dispatchMountItems() {
        SurfaceMountingManager surfaceManager;
        this.mBatchedExecutionTime = 0L;
        this.mRunStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return;
        }
        this.mItemDispatchListener.willMountItems(andResetMountItems);
        if (andResetViewCommandMountItems != null) {
            ep.a.c(0L, "MountItemDispatcher::mountViews viewCommandMountItems");
            for (DispatchCommandMountItem dispatchCommandMountItem : andResetViewCommandMountItems) {
                if (tn.b.e()) {
                    printMountItem(dispatchCommandMountItem, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    executeOrEnqueue(dispatchCommandMountItem);
                } catch (RetryableMountingLayerException e11) {
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    } else {
                        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + dispatchCommandMountItem.toString(), e11));
                    }
                } catch (Throwable th2) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + dispatchCommandMountItem.toString(), th2));
                }
            }
            ep.a.i(0L);
        }
        List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            ep.a.c(0L, "MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : andResetPreMountItems) {
                if (tn.b.e()) {
                    printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                executeOrEnqueue(mountItem);
            }
            ep.a.i(0L);
        }
        if (andResetMountItems != null) {
            ep.a.c(0L, "MountItemDispatcher::mountViews mountItems to execute");
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (MountItem mountItem2 : andResetMountItems) {
                if (tn.b.e()) {
                    printMountItem(mountItem2, "dispatchMountItems: Executing mountItem");
                }
                try {
                    executeOrEnqueue(mountItem2);
                } catch (Throwable th3) {
                    qk.a.n(TAG, "dispatchMountItems: caught exception, displaying mount state", th3);
                    for (MountItem mountItem3 : andResetMountItems) {
                        if (mountItem3 == mountItem2) {
                            qk.a.m(TAG, "dispatchMountItems: mountItem: next mountItem triggered exception!");
                        }
                        printMountItem(mountItem3, "dispatchMountItems: mountItem");
                    }
                    if (mountItem2.get_surfaceId() != -1 && (surfaceManager = this.mMountingManager.getSurfaceManager(mountItem2.get_surfaceId())) != null) {
                        surfaceManager.printSurfaceState();
                    }
                    if (ReactIgnorableMountingException.isIgnorable(th3)) {
                        ReactSoftExceptionLogger.logSoftException(TAG, th3);
                    } else {
                        throw th3;
                    }
                }
            }
            this.mBatchedExecutionTime += SystemClock.uptimeMillis() - jUptimeMillis;
            ep.a.i(0L);
        }
        this.mItemDispatchListener.didMountItems(andResetMountItems);
    }
}
