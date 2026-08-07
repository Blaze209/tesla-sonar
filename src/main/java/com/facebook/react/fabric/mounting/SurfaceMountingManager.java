package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.collection.y0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.g0;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.p1;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private mo.a mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private y0<Object> mTagSetForStoppedSurface;
    private v0 mThemedReactContext;
    private p1 mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();

    private static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i11, boolean z11) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i11;
            this.mCanCoalesceEvent = z11;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    static {
        ln.a aVar = ln.a.f90481a;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i11, @NonNull mo.a aVar, @NonNull p1 p1Var, @NonNull RootViewManager rootViewManager, @NonNull MountingManager.MountItemExecutor mountItemExecutor, @NonNull v0 v0Var) {
        this.mSurfaceId = i11;
        this.mJSResponderHandler = aVar;
        this.mViewManagerRegistry = p1Var;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = v0Var;
    }

    private void addRootView(@NonNull final View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true));
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f22593a.lambda$addRootView$0(view);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    private void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    private ViewState getNullableViewState(int i11) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i11));
    }

    @NonNull
    private static h<ViewGroup> getViewGroupManager(@NonNull ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (h) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    @NonNull
    private ViewState getViewState(int i11) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i11));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i11 + ". Surface stopped: " + isStopped());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$addRootView$0(View view) {
        if (isStopped()) {
            return;
        }
        if (view.getId() == this.mSurfaceId) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + this.mSurfaceId + "] on the RootView, but that id has already been set. "));
        } else if (view.getId() != -1) {
            String str = TAG;
            qk.a.o(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.mSurfaceId));
            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
        }
        view.setId(this.mSurfaceId);
        if (view instanceof g0) {
            ((g0) view).setRootViewTag(this.mSurfaceId);
        }
        executeMountItemsOnViewAttach();
        this.mRootViewAttached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$1() {
        if (tn.b.j()) {
            this.mViewManagerRegistry.g(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new y0<>();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.i(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        qk.a.m(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z11) {
        int id2 = viewGroup.getId();
        qk.a.m(TAG, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            qk.a.m(TAG, "     <View idx=" + i11 + " tag=" + viewGroup.getChildAt(i11).getId() + " class=" + viewGroup.getChildAt(i11).getClass().toString() + ">");
        }
        String str = TAG;
        qk.a.m(str, "  </ViewGroup tag=" + id2 + ">");
        if (z11) {
            qk.a.m(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                qk.a.m(TAG, "<ViewParent tag=" + id3 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    private void onViewStateDeleted(ViewState viewState) {
        u0 u0Var = viewState.mStateWrapper;
        if (u0Var != null) {
            u0Var.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    public void addViewAt(final int i11, final int i12, final int i13) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        View view = viewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i12 + " - Index: " + i13;
            qk.a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        ViewState viewState2 = getViewState(i12);
        View view2 = viewState2.mView;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i12);
        }
        boolean z11 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z11) {
            qk.a.m(TAG, "addViewAt: [" + i12 + "] -> [" + i11 + "] idx: " + i13 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z12 = parent instanceof ViewGroup;
            int id2 = z12 ? ((ViewGroup) parent).getId() : -1;
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i12 + "] into parent [" + i11 + "]: View already has a parent: [" + id2 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z12) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i12));
        }
        try {
            getViewGroupManager(viewState).addView(viewGroup, view2, i13);
            if (z11) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qk.a.m(SurfaceMountingManager.TAG, "addViewAt: [" + i12 + "] -> [" + i11 + "] idx: " + i13 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (IllegalStateException | IndexOutOfBoundsException e11) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i12 + "] into parent [" + i11 + "] at index " + i13, e11);
        }
    }

    public void attachRootView(View view, v0 v0Var) {
        this.mThemedReactContext = v0Var;
        addRootView(view);
    }

    public void createView(@NonNull String str, int i11, ReadableMap readableMap, u0 u0Var, EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i11, readableMap, u0Var, eventEmitterWrapper, z11);
        }
    }

    public void createViewUnsafe(@NonNull String str, int i11, ReadableMap readableMap, u0 u0Var, EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        ep.a.c(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            k0 k0Var = new k0(readableMap);
            ViewState viewState = new ViewState(i11);
            viewState.mCurrentProps = k0Var;
            viewState.mStateWrapper = u0Var;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i11), viewState);
            if (z11) {
                ViewManager viewManagerC = this.mViewManagerRegistry.c(str);
                viewState.mView = viewManagerC.createView(i11, this.mThemedReactContext, k0Var, u0Var, this.mJSResponderHandler);
                viewState.mViewManager = viewManagerC;
            }
        } finally {
            ep.a.i(0L);
        }
    }

    public void deleteView(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag: " + i11 + " for deleteView"));
            return;
        }
        if (this.mViewsWithActiveTouches.contains(Integer.valueOf(i11))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i11));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i11));
            onViewStateDeleted(nullableViewState);
        }
    }

    public void enqueuePendingEvent(int i11, String str, boolean z11, WritableMap writableMap, int i12) {
        final ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i11))) == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(str, writableMap, i12, z11);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewState viewState2 = viewState;
                EventEmitterWrapper eventEmitterWrapper = viewState2.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    pendingViewEvent.dispatch(eventEmitterWrapper);
                    return;
                }
                if (viewState2.mPendingEventQueue == null) {
                    viewState2.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    public v0 getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i11) {
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i11) {
        ViewState nullableViewState = getNullableViewState(i11);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException("Trying to resolve view with tag " + i11 + " which doesn't exist");
    }

    public boolean getViewExists(int i11) {
        y0<Object> y0Var = this.mTagSetForStoppedSurface;
        if (y0Var != null && y0Var.d(i11)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i11));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i11) {
        this.mViewsWithActiveTouches.add(Integer.valueOf(i11));
    }

    public void preallocateView(@NonNull String str, int i11, ReadableMap readableMap, u0 u0Var, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i11) == null) {
            createViewUnsafe(str, i11, readableMap, u0Var, null, z11);
        }
    }

    public void printSurfaceState() {
        qk.a.o(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            qk.a.o(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i11, int i12, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i11 + "] for commandId: " + i12);
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i11);
        }
        View view = nullableViewState.mView;
        if (view != null) {
            viewManager.receiveCommand(view, i12, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
    }

    public void removeViewAt(final int i11, final int i12, int i13) {
        final int i14;
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i11))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i11 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i12);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i12 + "] for removeViewAt"));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i12 + " - Tag: " + i11 + " - Index: " + i13;
            qk.a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i12 + "]");
        }
        int i15 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            qk.a.m(TAG, "removeViewAt: [" + i11 + "] -> [" + i12 + "] idx: " + i13 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        h<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i13);
        int id2 = childAt != null ? childAt.getId() : -1;
        if (id2 != i11) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i15 >= childCount) {
                    i15 = -1;
                    break;
                } else if (viewGroup.getChildAt(i15).getId() == i11) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 == -1) {
                qk.a.m(TAG, "removeViewAt: [" + i11 + "] -> [" + i12 + "] @" + i13 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            logViewHierarchy(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i11 + "] of parent [" + i12 + "] at index " + i13 + ", but got view tag " + id2 + " - actual index of view: " + i15));
            i14 = i15;
        } else {
            i14 = i13;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i14);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        qk.a.m(SurfaceMountingManager.TAG, "removeViewAt: [" + i11 + "] -> [" + i12 + "] idx: " + i14 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (RuntimeException e11) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i14 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e11);
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i11, int i12) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i11);
        }
        View view = viewState.mView;
        if (view != null) {
            view.sendAccessibilityEvent(i12);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i11, int i12, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z11) {
            this.mJSResponderHandler.d(i12, null);
            return;
        }
        ViewState viewState = getViewState(i11);
        View view = viewState.mView;
        if (i12 != i11 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.d(i12, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i11 + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i11 + "] that is a root view");
        }
        this.mJSResponderHandler.d(i12, view.getParent());
    }

    public void stopSurface() {
        qk.a.m(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            u0 u0Var = viewState.mStateWrapper;
            if (u0Var != null) {
                u0Var.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f22595a.lambda$stopSurface$1();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void sweepActiveTouchForTag(int i11) {
        this.mViewsWithActiveTouches.remove(Integer.valueOf(i11));
        if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i11))) {
            this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i11));
            deleteView(i11);
        }
    }

    public void updateEventEmitter(int i11, @NonNull EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i11));
        if (viewState == null) {
            viewState = new ViewState(i11);
            this.mTagToViewState.put(Integer.valueOf(i11), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    public void updateLayout(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i11);
        }
        int i19 = 1;
        if (i18 == 1) {
            i19 = 0;
        } else if (i18 != 2) {
            i19 = 2;
        }
        view.setLayoutDirection(i19);
        view.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof q0) {
            parent.requestLayout();
        }
        NativeModule nativeModule = getViewState(i12).mViewManager;
        h hVar = nativeModule != null ? (h) nativeModule : null;
        if (hVar == null || !hVar.needsCustomLayoutForChildren()) {
            view.layout(i13, i14, i15 + i13, i16 + i14);
        }
        int i21 = i17 == 0 ? 4 : 0;
        if (view.getVisibility() != i21) {
            view.setVisibility(i21);
        }
    }

    public void updateOverflowInset(int i11, int i12, int i13, int i14, int i15) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        if (viewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = viewState.mView;
        if (callback != null) {
            if (callback instanceof e0) {
                ((e0) callback).setOverflowInset(i12, i13, i14, i15);
            }
        } else {
            throw new IllegalStateException("Unable to find View for tag: " + i11);
        }
    }

    public void updatePadding(int i11, int i12, int i13, int i14, int i15) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i11);
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            viewManager.setPadding(view, i12, i13, i14, i15);
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    public void updateProps(int i11, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        viewState.mCurrentProps = new k0(readableMap);
        View view = viewState.mView;
        if (view != null) {
            ((ViewManager) gn.a.c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
    }

    public void updateState(int i11, u0 u0Var) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        u0 u0Var2 = viewState.mStateWrapper;
        viewState.mStateWrapper = u0Var;
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i11);
        }
        Object objUpdateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, u0Var);
        if (objUpdateState != null) {
            viewManager.updateExtraData(viewState.mView, objUpdateState);
        }
        if (u0Var2 != null) {
            u0Var2.destroyState();
        }
    }

    private static class ViewState {
        ReadableMap mCurrentLocalData;
        k0 mCurrentProps;
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        u0 mStateWrapper;
        View mView;
        ViewManager mViewManager;

        @NonNull
        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }

        private ViewState(int i11) {
            this(i11, null, null, false);
        }

        private ViewState(int i11, View view, ViewManager viewManager, boolean z11) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i11;
            this.mView = view;
            this.mIsRoot = z11;
            this.mViewManager = viewManager;
        }
    }

    public void receiveCommand(int i11, @NonNull String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState != null) {
            ViewManager viewManager = nullableViewState.mViewManager;
            if (viewManager != null) {
                View view = nullableViewState.mView;
                if (view != null) {
                    viewManager.receiveCommand(view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i11);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i11 + " for commandId: " + str);
    }
}
