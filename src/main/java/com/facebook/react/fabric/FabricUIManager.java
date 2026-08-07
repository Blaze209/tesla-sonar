package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.k;
import com.facebook.react.uimanager.events.p;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.g0;
import com.facebook.react.uimanager.h0;
import com.facebook.react.uimanager.m1;
import com.facebook.react.uimanager.p1;
import com.facebook.react.uimanager.r0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.text.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, p {
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER = new DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener() { // from class: com.facebook.react.fabric.b
        @Override // com.facebook.react.fabric.DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener
        public final void onFabricCommitEnd(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
            FabricUIManager.a(fabricCommitPoint);
        }
    };
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";

    @NonNull
    private final com.facebook.react.uimanager.events.a mBatchEventDispatchedListener;
    private FabricUIManagerBinding mBinding;
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;

    @NonNull
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;

    @NonNull
    private final EventDispatcher mEventDispatcher;
    private InteropUIBlockListener mInteropUIBlockListener;

    @NonNull
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;

    @NonNull
    private final MountingManager mMountingManager;

    @NonNull
    private final ReactApplicationContext mReactApplicationContext;

    @NonNull
    private final p1 mViewManagerRegistry;

    @NonNull
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private List<Integer> mSurfaceIdsWithPendingMountNotification = new ArrayList();

    @NonNull
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;

    private class DispatchUIFrameCallback extends g {
        private volatile boolean mIsMountingEnabled;
        private boolean mIsScheduled;
        private boolean mShouldSchedule;

        private void schedule() {
            if (this.mIsScheduled || !this.mShouldSchedule) {
                return;
            }
            this.mIsScheduled = true;
            com.facebook.react.modules.core.b.h().k(com.facebook.react.modules.core.b.a.DISPATCH_UI, this);
        }

        @Override // com.facebook.react.uimanager.g
        public void doFrameGuarded(long j11) {
            this.mIsScheduled = false;
            if (!this.mIsMountingEnabled) {
                qk.a.I(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                qk.a.I(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j11);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    schedule();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e11) {
                    qk.a.n(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e11);
                    this.mIsMountingEnabled = false;
                    throw new RuntimeException("Exception thrown when executing UIFrameGuarded", e11);
                }
            } catch (Throwable th2) {
                schedule();
                throw th2;
            }
        }

        void pause() {
            com.facebook.react.modules.core.b.h().n(com.facebook.react.modules.core.b.a.DISPATCH_UI, this);
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        void resume() {
            this.mShouldSchedule = true;
            schedule();
        }

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }
    }

    private class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {
        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && !FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.contains(Integer.valueOf(mountItem.get_surfaceId()))) {
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.add(Integer.valueOf(mountItem.get_surfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.isEmpty()) {
                return;
            }
            FabricUIManager.this.mMountNotificationScheduled = true;
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.react.fabric.FabricUIManager.MountItemDispatchListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FabricUIManager.this.mMountNotificationScheduled = false;
                    List list2 = FabricUIManager.this.mSurfaceIdsWithPendingMountNotification;
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification = new ArrayList();
                    FabricUIManagerBinding fabricUIManagerBinding = FabricUIManager.this.mBinding;
                    if (fabricUIManagerBinding == null || FabricUIManager.this.mDestroyed) {
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        fabricUIManagerBinding.reportMount(((Integer) it2.next()).intValue());
                    }
                }
            });
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void willMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }

        private MountItemDispatchListener() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public FabricUIManager(@NonNull ReactApplicationContext reactApplicationContext, @NonNull p1 p1Var, @NonNull com.facebook.react.uimanager.events.a aVar) {
        MountingManager.MountItemExecutor mountItemExecutor = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = mountItemExecutor;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(p1Var, mountItemExecutor);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener());
        this.mEventDispatcher = new k(reactApplicationContext);
        this.mBatchEventDispatchedListener = aVar;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = p1Var;
        reactApplicationContext.registerComponentCallbacks(p1Var);
    }

    public static /* synthetic */ void a(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        LongStreamingStats longStreamingStats = DevToolsReactPerfLogger.mStreamingCommitStats;
        longStreamingStats.add(commitDuration);
        LongStreamingStats longStreamingStats2 = DevToolsReactPerfLogger.mStreamingLayoutStats;
        longStreamingStats2.add(layoutDuration);
        LongStreamingStats longStreamingStats3 = DevToolsReactPerfLogger.mStreamingDiffStats;
        longStreamingStats3.add(diffDuration);
        LongStreamingStats longStreamingStats4 = DevToolsReactPerfLogger.mStreamingTransactionEndStats;
        longStreamingStats4.add(transactionEndDuration);
        LongStreamingStats longStreamingStats5 = DevToolsReactPerfLogger.mStreamingBatchExecutionStats;
        longStreamingStats5.add(batchExecutionDuration);
        qk.a.v(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(longStreamingStats.getAverage()), Double.valueOf(longStreamingStats.getMedian()), Long.valueOf(longStreamingStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(longStreamingStats2.getAverage()), Double.valueOf(longStreamingStats2.getMedian()), Long.valueOf(longStreamingStats2.getMax()), Long.valueOf(diffDuration), Double.valueOf(longStreamingStats3.getAverage()), Double.valueOf(longStreamingStats3.getMedian()), Long.valueOf(longStreamingStats3.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(longStreamingStats4.getAverage()), Double.valueOf(longStreamingStats4.getMedian()), Long.valueOf(longStreamingStats4.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(longStreamingStats5.getAverage()), Double.valueOf(longStreamingStats5.getMedian()), Long.valueOf(longStreamingStats5.getMax()));
    }

    private MountItem createIntBufferBatchMountItem(int i11, int[] iArr, Object[] objArr, int i12) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i11, iArr, objArr, i12);
    }

    private void destroyUnmountedView(int i11, int i12) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createDestroyViewMountItem(i11, i12));
    }

    @NonNull
    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    @SuppressLint({"NotInvokedPrivateMethod"})
    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    private long measure(int i11, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, float f12, float f13, float f14) {
        return measure(i11, str, readableMap, readableMap2, readableMap3, f11, f12, f13, f14, null);
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f11, float f12) {
        return (NativeArray) o.m(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, w.h(f11), w.h(f12));
    }

    private long measureMapBuffer(int i11, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, ReadableMapBuffer readableMapBuffer3, float f11, float f12, float f13, float f14, float[] fArr) {
        ReactContext context;
        if (i11 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i11, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measureMapBuffer(context, str, readableMapBuffer, readableMapBuffer2, readableMapBuffer3, LayoutMetricsConversions.getYogaSize(f11, f12), LayoutMetricsConversions.getYogaMeasureMode(f11, f12), LayoutMetricsConversions.getYogaSize(f13, f14), LayoutMetricsConversions.getYogaMeasureMode(f13, f14), fArr);
    }

    private void preallocateView(int i11, int i12, String str, Object obj, Object obj2, boolean z11) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i11, i12, str, (ReadableMap) obj, (u0) obj2, z11));
    }

    private void scheduleMountItem(MountItem mountItem, int i11, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z11 = mountItem instanceof BatchMountItem;
        boolean z12 = (z11 && !((BatchMountItem) mountItem).isBatchEmpty()) || !(z11 || mountItem == null);
        Iterator<UIManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().didScheduleMountItems(this);
        }
        if (z11) {
            this.mCommitStartTime = j11;
            this.mLayoutTime = j15 - j14;
            this.mFinishTransactionCPPTime = j17 - j16;
            this.mFinishTransactionTime = jUptimeMillis - j16;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z12) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            GuardedRunnable guardedRunnable = new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.3
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                guardedRunnable.run();
            }
        }
        if (z11) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i11, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i11, j16);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i11, j17);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i11, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i11, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i11, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i11, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i11, j15, i12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t11, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        g0 g0Var = (g0) t11;
        int rootViewTag = g0Var.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new v0(this.mReactApplicationContext, t11.getContext(), g0Var.getSurfaceID(), rootViewTag), t11);
        String jSModuleName = g0Var.getJSModuleName();
        if (tn.b.e()) {
            qk.a.d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (tn.b.n()) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(rn.b bVar, View view) {
        this.mMountingManager.attachRootView(bVar.getSurfaceId(), view, new v0(this.mReactApplicationContext, view.getContext(), bVar.getModuleName(), bVar.getSurfaceId()));
        bVar.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.5
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(@NonNull MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* JADX INFO: renamed from: getSurfaceId */
            public int get_surfaceId() {
                return -1;
            }

            @NonNull
            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }
        });
    }

    DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i11, int i12, String str, ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i11, i12, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i11, i12, str, readableArray);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, int i12, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public void experimental_prefetchResource(String str, int i11, int i12, ReadableMapBuffer readableMapBuffer) {
        this.mMountingManager.experimental_prefetchResource(this.mReactApplicationContext, str, i11, i12, readableMapBuffer);
    }

    public int getColor(int i11, String[] strArr) {
        v0 context = this.mMountingManager.getSurfaceManagerEnforced(i11, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    @NonNull
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public boolean getThemeData(int i11, float[] fArr) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        v0 context = surfaceManager != null ? surfaceManager.getContext() : null;
        if (context == null) {
            qk.a.K(TAG, "Couldn't get context for surfaceId %d in getThemeData", Integer.valueOf(i11));
            return false;
        }
        float[] fArrA = b1.a(context);
        fArr[0] = fArrA[0];
        fArr[1] = fArrA[1];
        fArr[2] = fArrA[2];
        fArr[3] = fArrA[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.j(2, new FabricEventEmitter(this));
        this.mEventDispatcher.e(this.mBatchEventDispatchedListener);
        if (tn.b.e()) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (tn.b.n()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        qk.a.s(str, "FabricUIManager.invalidate");
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mEventDispatcher.i(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.f(2);
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.f();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mBinding.unregister();
        this.mBinding = null;
        m1.b();
        if (tn.b.c()) {
            return;
        }
        this.mEventDispatcher.b();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i11, int i12) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        if (surfaceManager != null) {
            surfaceManager.markActiveTouchForTag(i12);
        }
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mDispatchUIFrameCallback.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mDispatchUIFrameCallback.resume();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.d();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (tn.b.n()) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        receiveEvent(-1, i11, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("top")) {
            return str;
        }
        return DebugKt.DEBUG_PROPERTY_VALUE_ON + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i11) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i11);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i11, int i12) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i11, i12));
    }

    public void sendAccessibilityEventFromJS(int i11, int i12, String str) {
        int i13;
        if ("focus".equals(str)) {
            i13 = 8;
        } else if ("windowStateChange".equals(str)) {
            i13 = 32;
        } else if ("click".equals(str)) {
            i13 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
            }
            i13 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i11, i12, i13));
    }

    void setBinding(FabricUIManagerBinding fabricUIManagerBinding) {
        this.mBinding = fabricUIManagerBinding;
    }

    public void setJSResponder(final int i11, final int i12, final int i13, final boolean z11) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(@NonNull MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i11);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i12, i13, z11);
                    return;
                }
                qk.a.m(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i11 + "]");
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* JADX INFO: renamed from: getSurfaceId */
            public int get_surfaceId() {
                return i11;
            }

            @NonNull
            @SuppressLint({"DefaultLocale"})
            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i12), Integer.valueOf(i11));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12) {
        int rootViewTag = ((g0) t11).getRootViewTag();
        Context context = t11.getContext();
        v0 v0Var = new v0(this.mReactApplicationContext, context, str, rootViewTag);
        if (tn.b.e()) {
            qk.a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, v0Var, t11);
        Point pointB = UiThreadUtil.isOnUiThread() ? r0.b(t11) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), LayoutMetricsConversions.getMinSize(i12), LayoutMetricsConversions.getMaxSize(i12), pointB.x, pointB.y, com.facebook.react.modules.i18nmanager.a.f().i(context), com.facebook.react.modules.i18nmanager.a.f().d(context));
        return rootViewTag;
    }

    public void stopSurface(rn.b bVar) {
        if (!bVar.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(bVar.getSurfaceId());
        if (!(bVar instanceof SurfaceHandlerBinding)) {
            throw new IllegalArgumentException("Invalid SurfaceHandler");
        }
        this.mBinding.stopSurfaceWithSurfaceHandler((SurfaceHandlerBinding) bVar);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i11, int i12) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        if (surfaceManager != null) {
            surfaceManager.sweepActiveTouchForTag(i12);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(final int i11, @NonNull final ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i12 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i12 + 1;
        MountItem mountItem = new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.2
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(@NonNull MountingManager mountingManager) {
                try {
                    mountingManager.updateProps(i11, readableMap);
                } catch (Exception unused) {
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* JADX INFO: renamed from: getSurfaceId */
            public int get_surfaceId() {
                return -1;
            }

            @NonNull
            public String toString() {
                return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i11), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
            }
        };
        if (!this.mMountingManager.getViewExists(i11)) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i12);
        if (tn.b.e()) {
            qk.a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i11), IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
        }
        mountItem.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i11, int i12, int i13, int i14, int i15) {
        boolean z11;
        boolean zD;
        if (tn.b.e()) {
            qk.a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i11));
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i11));
            return;
        }
        v0 context = surfaceManager.getContext();
        if (context != null) {
            boolean zI = com.facebook.react.modules.i18nmanager.a.f().i(context);
            zD = com.facebook.react.modules.i18nmanager.a.f().d(context);
            z11 = zI;
        } else {
            z11 = false;
            zD = false;
        }
        this.mBinding.setConstraints(i11, LayoutMetricsConversions.getMinSize(i12), LayoutMetricsConversions.getMaxSize(i12), LayoutMetricsConversions.getMinSize(i13), LayoutMetricsConversions.getMaxSize(i13), i14, i15, z11, zD);
    }

    private long measure(int i11, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, float f12, float f13, float f14, float[] fArr) {
        ReactContext context;
        if (i11 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i11, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(context, str, readableMap, readableMap2, readableMap3, LayoutMetricsConversions.getYogaSize(f11, f12), LayoutMetricsConversions.getYogaMeasureMode(f11, f12), LayoutMetricsConversions.getYogaSize(f13, f14), LayoutMetricsConversions.getYogaMeasureMode(f13, f14), fArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, int i12, String str, WritableMap writableMap) {
        receiveEvent(i11, i12, str, false, writableMap, 2);
    }

    @Deprecated
    public void dispatchCommand(int i11, int i12, int i13, ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i11, i12, i13, readableArray));
    }

    public void receiveEvent(int i11, int i12, String str, boolean z11, WritableMap writableMap, int i13) {
        receiveEvent(i11, i12, str, z11, writableMap, i13, false);
    }

    @Override // com.facebook.react.uimanager.events.p
    public void receiveEvent(int i11, int i12, @NonNull String str, boolean z11, WritableMap writableMap, int i13, boolean z12) {
        if (ln.a.DEBUG && i11 == -1) {
            qk.a.d(TAG, "Emitted event without surfaceId: [%d] %s", Integer.valueOf(i12), str);
        }
        if (this.mDestroyed) {
            qk.a.m(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i11, i12);
        if (eventEmitter == null) {
            if (this.mMountingManager.getViewExists(i12)) {
                this.mMountingManager.enqueuePendingEvent(i11, i12, str, z11, writableMap, i13);
                return;
            }
            qk.a.s(TAG, "Unable to invoke event: " + str + " for reactTag: " + i12);
            return;
        }
        if (z12) {
            UiThreadUtil.assertOnUiThread();
            if (this.mSynchronousEvents.add(new SynchronousEvent(i11, i12, str))) {
                eventEmitter.dispatchEventSynchronously(str, writableMap);
                return;
            }
            return;
        }
        if (z11) {
            eventEmitter.dispatchUnique(str, writableMap);
        } else {
            eventEmitter.dispatch(str, writableMap, i13);
        }
    }

    public void dispatchCommand(int i11, int i12, String str, ReadableArray readableArray) {
        if (tn.b.n()) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i11, i12, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i11, i12, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i11) {
        this.mMountingManager.stopSurface(i11);
        this.mBinding.stopSurface(i11);
    }

    public void startSurface(rn.b bVar, Context context, View view) {
        int iA = h0.a();
        this.mMountingManager.startSurface(iA, new v0(this.mReactApplicationContext, context, bVar.getModuleName(), iA), view);
        if (bVar instanceof SurfaceHandlerBinding) {
            this.mBinding.startSurfaceWithSurfaceHandler(iA, (SurfaceHandlerBinding) bVar, view != null);
            return;
        }
        throw new IllegalArgumentException("Invalid SurfaceHandler");
    }
}
