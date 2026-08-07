package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.g;
import com.facebook.react.uimanager.t;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
class ReaLayoutAnimator extends ro.e {
    private final ReactApplicationContext mContext;
    private final WeakReference<t> mWeakNativeViewHierarchyManager;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;
    private final ArrayList<View> viewsToSnapshot = new ArrayList<>();

    ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, t tVar) {
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManager = new WeakReference<>(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteView$0(com.facebook.react.uimanager.events.d dVar) {
        if (dVar.getEventName().equals("topWillDisappear")) {
            getAnimationsManager().notifyAboutScreenWillDisappear();
        }
    }

    @Override // ro.e
    public void applyLayoutUpdate(View view, int i11, int i12, int i13, int i14) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i11, i12, i13, i14);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManager.get());
            view.layout(i11, i12, i13 + i11, i14 + i12);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
            return;
        }
        if (!this.mAnimationsManager.hasAnimationForTag(view.getId(), 1)) {
            super.applyLayoutUpdate(view, i11, i12, i13, i14);
            this.mAnimationsManager.maybeRegisterSharedView(view);
        } else {
            view.layout(i11, i12, i13 + i11, i14 + i12);
            if (view.getId() != -1) {
                this.viewsToSnapshot.add(view);
            }
        }
    }

    @Override // ro.e
    public void deleteView(View view, final ro.f fVar) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, fVar);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        t tVar = this.mWeakNativeViewHierarchyManager.get();
        try {
            if (tVar.resolveViewManager(view.getId()).getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (tVar.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        this.mAnimationsManager.cancelAnimationsInSubviews(view);
                        super.deleteView(view, fVar);
                        EventDispatcher eventDispatcherC = b1.c((ReactContext) view.getContext(), view.getId());
                        if (eventDispatcherC != null) {
                            eventDispatcherC.g(new g() { // from class: com.swmansion.reanimated.layoutReanimation.a
                                @Override // com.facebook.react.uimanager.events.g
                                public final void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
                                    this.f55471a.lambda$deleteView$0(dVar);
                                }
                            });
                            return;
                        }
                        return;
                    }
                } catch (IllegalViewOperationException e11) {
                    e11.printStackTrace();
                    this.mAnimationsManager.cancelAnimationsInSubviews(view);
                    super.deleteView(view, fVar);
                    return;
                }
            }
            maybeInit();
            AnimationsManager animationsManager = this.mAnimationsManager;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            Objects.requireNonNull(fVar);
            animationsManager.onViewRemoval(view, viewGroup, new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.b
                @Override // java.lang.Runnable
                public final void run() {
                    fVar.a();
                }
            });
        } catch (IllegalViewOperationException e12) {
            e12.printStackTrace();
            this.mAnimationsManager.cancelAnimationsInSubviews(view);
            super.deleteView(view, fVar);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationsManager;
    }

    public boolean isLayoutAnimationEnabled() {
        if (!this.mContext.hasActiveReactInstance()) {
            return false;
        }
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mAnimationsManager = animationsManager;
        animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManager.get());
    }

    @Override // ro.e
    public void reset() {
        super.reset();
        for (View view : this.viewsToSnapshot) {
            this.mAnimationsManager.onViewCreate(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
        }
        this.viewsToSnapshot.clear();
    }

    @Override // ro.e
    public boolean shouldAnimateLayout(View view) {
        if (isLayoutAnimationEnabled()) {
            return (view == null || view.getParent() == null) ? false : true;
        }
        return super.shouldAnimateLayout(view);
    }
}
