package com.facebook.react.fabric.mounting;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.p1;
import com.facebook.react.uimanager.v0;
import com.facebook.yoga.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MountingManager {
    private static final int MAX_STOPPED_SURFACE_IDS_LENGTH = 15;
    public static final String TAG = "MountingManager";
    private SurfaceMountingManager mLastQueriedSurfaceMountingManager;
    private SurfaceMountingManager mMostRecentSurfaceMountingManager;

    @NonNull
    private final MountItemExecutor mMountItemExecutor;

    @NonNull
    private final p1 mViewManagerRegistry;

    @NonNull
    private final ConcurrentHashMap<Integer, SurfaceMountingManager> mSurfaceIdToManager = new ConcurrentHashMap<>();
    private final CopyOnWriteArrayList<Integer> mStoppedSurfaceIds = new CopyOnWriteArrayList<>();

    @NonNull
    private final mo.a mJSResponderHandler = new mo.a();

    @NonNull
    private final RootViewManager mRootViewManager = new RootViewManager();

    public interface MountItemExecutor {
        void executeItems(Queue<MountItem> queue);
    }

    public MountingManager(@NonNull p1 p1Var, @NonNull MountItemExecutor mountItemExecutor) {
        this.mViewManagerRegistry = p1Var;
        this.mMountItemExecutor = mountItemExecutor;
    }

    private SurfaceMountingManager getSurfaceMountingManager(int i11, int i12) {
        return i11 == -1 ? getSurfaceManagerForView(i12) : getSurfaceManager(i11);
    }

    public void attachRootView(int i11, @NonNull View view, v0 v0Var) {
        SurfaceMountingManager surfaceManagerEnforced = getSurfaceManagerEnforced(i11, "attachView");
        if (surfaceManagerEnforced.isStopped()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            surfaceManagerEnforced.attachRootView(view, v0Var);
        }
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    public void enqueuePendingEvent(int i11, int i12, String str, boolean z11, WritableMap writableMap, int i13) {
        SurfaceMountingManager surfaceMountingManager = getSurfaceMountingManager(i11, i12);
        if (surfaceMountingManager == null) {
            qk.a.d(TAG, "Cannot queue event without valid surface mounting manager for tag: %d, surfaceId: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        } else {
            surfaceMountingManager.enqueuePendingEvent(i12, str, z11, writableMap, i13);
        }
    }

    public void experimental_prefetchResource(ReactContext reactContext, String str, int i11, int i12, com.facebook.react.common.mapbuffer.a aVar) {
        this.mViewManagerRegistry.c(str).experimental_prefetchResource(reactContext, i11, i12, aVar);
    }

    public EventEmitterWrapper getEventEmitter(int i11, int i12) {
        SurfaceMountingManager surfaceMountingManager = getSurfaceMountingManager(i11, i12);
        if (surfaceMountingManager == null) {
            return null;
        }
        return surfaceMountingManager.getEventEmitter(i12);
    }

    public SurfaceMountingManager getSurfaceManager(int i11) {
        SurfaceMountingManager surfaceMountingManager = this.mLastQueriedSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getSurfaceId() == i11) {
            return this.mLastQueriedSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager2 = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager2 != null && surfaceMountingManager2.getSurfaceId() == i11) {
            return this.mMostRecentSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager3 = this.mSurfaceIdToManager.get(Integer.valueOf(i11));
        this.mLastQueriedSurfaceMountingManager = surfaceMountingManager3;
        return surfaceMountingManager3;
    }

    @NonNull
    public SurfaceMountingManager getSurfaceManagerEnforced(int i11, String str) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i11);
        if (surfaceManager != null) {
            return surfaceManager;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i11 + "]. Context: " + str);
    }

    public SurfaceMountingManager getSurfaceManagerForView(int i11) {
        SurfaceMountingManager surfaceMountingManager = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getViewExists(i11)) {
            return this.mMostRecentSurfaceMountingManager;
        }
        Iterator<Map.Entry<Integer, SurfaceMountingManager>> it = this.mSurfaceIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            SurfaceMountingManager value = it.next().getValue();
            if (value != this.mMostRecentSurfaceMountingManager && value.getViewExists(i11)) {
                if (this.mMostRecentSurfaceMountingManager == null) {
                    this.mMostRecentSurfaceMountingManager = value;
                }
                return value;
            }
        }
        return null;
    }

    @NonNull
    public SurfaceMountingManager getSurfaceManagerForViewEnforced(int i11) {
        SurfaceMountingManager surfaceManagerForView = getSurfaceManagerForView(i11);
        if (surfaceManagerForView != null) {
            return surfaceManagerForView;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i11 + "]");
    }

    public boolean getViewExists(int i11) {
        return getSurfaceManagerForView(i11) != null;
    }

    public boolean isWaitingForViewAttach(int i11) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i11);
        if (surfaceManager == null || surfaceManager.isStopped()) {
            return false;
        }
        return !surfaceManager.isRootViewAttached();
    }

    public long measure(@NonNull ReactContext reactContext, @NonNull String str, @NonNull ReadableMap readableMap, @NonNull ReadableMap readableMap2, @NonNull ReadableMap readableMap3, float f11, @NonNull p pVar, float f12, @NonNull p pVar2, float[] fArr) {
        return this.mViewManagerRegistry.c(str).measure(reactContext, readableMap, readableMap2, readableMap3, f11, pVar, f12, pVar2, fArr);
    }

    public long measureMapBuffer(@NonNull ReactContext reactContext, @NonNull String str, @NonNull com.facebook.react.common.mapbuffer.a aVar, @NonNull com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f11, @NonNull p pVar, float f12, @NonNull p pVar2, float[] fArr) {
        return this.mViewManagerRegistry.c(str).measure(reactContext, aVar, aVar2, aVar3, f11, pVar, f12, pVar2, fArr);
    }

    @Deprecated
    public void receiveCommand(int i11, int i12, int i13, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i11, "receiveCommand:int").receiveCommand(i12, i13, readableArray);
    }

    public void sendAccessibilityEvent(int i11, int i12, int i13) {
        UiThreadUtil.assertOnUiThread();
        if (i11 == -1) {
            getSurfaceManagerForViewEnforced(i12).sendAccessibilityEvent(i12, i13);
        } else {
            getSurfaceManagerEnforced(i11, "sendAccessibilityEvent").sendAccessibilityEvent(i12, i13);
        }
    }

    public SurfaceMountingManager startSurface(int i11, v0 v0Var, View view) {
        SurfaceMountingManager surfaceMountingManager = new SurfaceMountingManager(i11, this.mJSResponderHandler, this.mViewManagerRegistry, this.mRootViewManager, this.mMountItemExecutor, v0Var);
        this.mSurfaceIdToManager.putIfAbsent(Integer.valueOf(i11), surfaceMountingManager);
        if (this.mSurfaceIdToManager.get(Integer.valueOf(i11)) != surfaceMountingManager) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i11 + "]"));
        }
        this.mMostRecentSurfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i11));
        if (view != null) {
            surfaceMountingManager.attachRootView(view, v0Var);
        }
        return surfaceMountingManager;
    }

    public void stopSurface(int i11) {
        SurfaceMountingManager surfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i11));
        if (surfaceMountingManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i11 + "]"));
            return;
        }
        while (this.mStoppedSurfaceIds.size() >= 15) {
            Integer num = this.mStoppedSurfaceIds.get(0);
            ConcurrentHashMap<Integer, SurfaceMountingManager> concurrentHashMap = this.mSurfaceIdToManager;
            num.intValue();
            concurrentHashMap.remove(num);
            this.mStoppedSurfaceIds.remove(num);
            qk.a.c(TAG, "Removing stale SurfaceMountingManager: [%d]", num);
        }
        this.mStoppedSurfaceIds.add(Integer.valueOf(i11));
        surfaceMountingManager.stopSurface();
        if (this.mMostRecentSurfaceMountingManager == surfaceMountingManager) {
            this.mMostRecentSurfaceMountingManager = null;
        }
        if (this.mLastQueriedSurfaceMountingManager == surfaceMountingManager) {
            this.mLastQueriedSurfaceMountingManager = null;
        }
    }

    public boolean surfaceIsStopped(int i11) {
        if (this.mStoppedSurfaceIds.contains(Integer.valueOf(i11))) {
            return true;
        }
        SurfaceMountingManager surfaceManager = getSurfaceManager(i11);
        return surfaceManager != null && surfaceManager.isStopped();
    }

    public void updateProps(int i11, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        getSurfaceManagerForViewEnforced(i11).updateProps(i11, readableMap);
    }

    public void receiveCommand(int i11, int i12, @NonNull String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i11, "receiveCommand:string").receiveCommand(i12, str, readableArray);
    }
}
