package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = ScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001lB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0014\u0010\u001eJ!\u0010+\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b3\u0010,J!\u00105\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010,J!\u00107\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u0010,J!\u00109\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b<\u0010,J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010=\u001a\u00020/H\u0017¢\u0006\u0004\b>\u00102J\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010?\u001a\u00020/H\u0017¢\u0006\u0004\b@\u00102J!\u0010B\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bB\u0010:J\u001f\u0010D\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010C\u001a\u00020/H\u0017¢\u0006\u0004\bD\u00102J\u001f\u0010F\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010E\u001a\u00020/H\u0017¢\u0006\u0004\bF\u00102J\u001f\u0010H\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010G\u001a\u00020/H\u0017¢\u0006\u0004\bH\u00102J!\u0010J\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bJ\u0010\u001eJ#\u0010K\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bK\u0010,J!\u0010L\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bL\u00102J!\u0010M\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0019H\u0016¢\u0006\u0004\bM\u0010\u001eJ!\u0010N\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bN\u00102J!\u0010O\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bO\u00102J#\u0010Q\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bQ\u0010RJ!\u0010S\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bS\u00102J!\u0010T\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bT\u00102J#\u0010U\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bU\u0010,J#\u0010V\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bV\u0010,J#\u0010W\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bW\u0010,J#\u0010X\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bX\u0010,J#\u0010Y\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u0010,J!\u0010[\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010ZH\u0017¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\b]\u0010\u001eJ\u001f\u0010^\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020/H\u0017¢\u0006\u0004\b^\u00102J\u001f\u0010_\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0012H\u0017¢\u0006\u0004\b_\u0010\u0015J\u001f\u0010`\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020/H\u0017¢\u0006\u0004\b`\u00102J\u001f\u0010a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\ba\u0010\u001eJ!\u0010b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bb\u0010,J\u001b\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0cH\u0016¢\u0006\u0004\bd\u0010eJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020fH\u0014¢\u0006\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/t;", "Lvo/e0;", "<init>", "()V", "", "propName", "Ljn0/h0;", "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/rnscreens/t;", "view", "", "activityState", "setActivityState", "(Lcom/swmansion/rnscreens/t;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/t;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/t;I)V", "removeView", "(Lcom/swmansion/rnscreens/t;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/k0;", "props", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/t;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/t;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/t;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/t;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/t;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/t;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/t;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ScreenViewManager extends ViewGroupManager<t> implements vo.e0<t> {
    public static final String REACT_CLASS = "RNSScreen";
    private final l1<t> delegate = new vo.d0(this);

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<t> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return p013kotlin.collections.v0.o(jn0.x.a(com.swmansion.rnscreens.events.h.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onDismissed"))), jn0.x.a("topWillAppear", p013kotlin.collections.v0.k(jn0.x.a("registrationName", com.swmansion.rnscreens.gamma.tabs.event.c.EVENT_REGISTRATION_NAME))), jn0.x.a(com.swmansion.rnscreens.events.f.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onAppear"))), jn0.x.a("topWillDisappear", p013kotlin.collections.v0.k(jn0.x.a("registrationName", com.swmansion.rnscreens.gamma.tabs.event.d.EVENT_REGISTRATION_NAME))), jn0.x.a(com.swmansion.rnscreens.events.g.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onDisappear"))), jn0.x.a(com.swmansion.rnscreens.events.d.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onHeaderHeightChange"))), jn0.x.a(com.swmansion.rnscreens.events.b.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onHeaderBackButtonClicked"))), jn0.x.a(com.swmansion.rnscreens.events.j.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onTransitionProgress"))), jn0.x.a(com.swmansion.rnscreens.events.s.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // vo.e0
    public void setBottomScrollEdgeEffect(t view, String value) {
    }

    @Override // vo.e0
    public void setCustomAnimationOnSwipe(t view, boolean value) {
    }

    @Override // vo.e0
    public void setFullScreenSwipeEnabled(t view, String value) {
    }

    @Override // vo.e0
    public void setFullScreenSwipeShadowEnabled(t view, boolean value) {
    }

    @Override // vo.e0
    public void setGestureResponseDistance(t view, ReadableMap value) {
    }

    @Override // vo.e0
    public void setHideKeyboardOnSwipe(t view, boolean value) {
    }

    @Override // vo.e0
    public void setHomeIndicatorHidden(t view, boolean value) {
    }

    @Override // vo.e0
    public void setLeftScrollEdgeEffect(t view, String value) {
    }

    @Override // vo.e0
    public void setPreventNativeDismiss(t view, boolean value) {
    }

    @Override // vo.e0
    public void setRightScrollEdgeEffect(t view, String value) {
    }

    @Override // vo.e0
    public void setSwipeDirection(t view, String value) {
    }

    @Override // vo.e0
    public void setTopScrollEdgeEffect(t view, String value) {
    }

    @Override // vo.e0
    public void setTransitionDuration(t view, int value) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public t createViewInstance(com.facebook.react.uimanager.v0 reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        return new t(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(t view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.onFinalizePropsUpdate$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(t parent, View view) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        p013kotlin.jvm.internal.s.k(view, "view");
        super.removeView(parent, view);
        if (view instanceof y) {
            parent.setFooter(null);
        }
    }

    @Override // vo.e0
    public void setActivityState(t view, float activityState) {
        p013kotlin.jvm.internal.s.k(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // vo.e0
    @no.a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(t view, boolean gestureEnabled) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // vo.e0
    @no.a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(t view, boolean nativeBackButtonDismissalEnabled) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // vo.e0
    @no.a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(t view, Integer navigationBarColor) {
        p013kotlin.jvm.internal.s.k(view, "view");
        logNotAvailable("navigationBarColor");
    }

    @Override // vo.e0
    @no.a(name = "navigationBarHidden")
    public void setNavigationBarHidden(t view, boolean navigationBarHidden) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // vo.e0
    @no.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(t view, boolean navigationBarTranslucent) {
        p013kotlin.jvm.internal.s.k(view, "view");
        logNotAvailable("navigationBarTranslucent");
    }

    @Override // vo.e0
    @no.a(name = "replaceAnimation")
    public void setReplaceAnimation(t view, String animation) {
        t.c cVar;
        p013kotlin.jvm.internal.s.k(view, "view");
        if (animation == null || p013kotlin.jvm.internal.s.f(animation, "pop")) {
            cVar = t.c.POP;
        } else {
            if (!p013kotlin.jvm.internal.s.f(animation, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + animation);
            }
            cVar = t.c.PUSH;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // vo.e0
    public void setScreenId(t view, String value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // vo.e0
    @no.a(name = "screenOrientation")
    public void setScreenOrientation(t view, String screenOrientation) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    @Override // vo.e0
    @no.a(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(t view, final ReadableArray value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.getSheetDetents().clear();
        if (value == null || value.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
        } else {
            ho0.l.b0(ho0.l.U(p013kotlin.collections.v.e0(bo0.h.INSTANCE.a(0, value.size() - 1, 1)), new wn0.l() { // from class: com.swmansion.rnscreens.z0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Double.valueOf(value.getDouble(((Integer) obj).intValue()));
                }
            }), view.getSheetDetents());
        }
    }

    @Override // vo.e0
    @no.a(name = "sheetCornerRadius")
    public void setSheetCornerRadius(t view, float value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // vo.e0
    @no.a(name = "sheetElevation")
    public void setSheetElevation(t view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // vo.e0
    @no.a(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(t view, boolean value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // vo.e0
    @no.a(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(t view, boolean value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // vo.e0
    @no.a(name = "sheetInitialDetent")
    public void setSheetInitialDetent(t view, int value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // vo.e0
    @no.a(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(t view, int value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // vo.e0
    @no.a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackAnimation(com.swmansion.rnscreens.t r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.t, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r4.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4 = com.swmansion.rnscreens.t.e.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.swmansion.rnscreens.t.e.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // vo.e0
    @no.a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackPresentation(com.swmansion.rnscreens.t r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p013kotlin.jvm.internal.s.k(r3, r0)
            if (r4 == 0) goto L62
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L54;
                case 3452698: goto L49;
                case 104069805: goto L3e;
                case 438078970: goto L35;
                case 872434704: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L62
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.t.e.FORM_SHEET
            goto L5e
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L5c
        L2c:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L35:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L3e:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L46:
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.t.e.MODAL
            goto L5e
        L49:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.t.e.PUSH
            goto L5e
        L54:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L5c:
            com.swmansion.rnscreens.t$e r4 = com.swmansion.rnscreens.t.e.TRANSPARENT_MODAL
        L5e:
            r3.setStackPresentation(r4)
            return
        L62:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.t, java.lang.String):void");
    }

    @Override // vo.e0
    @no.a(name = "statusBarAnimation")
    public void setStatusBarAnimation(t view, String statusBarAnimation) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || p013kotlin.jvm.internal.s.f("none", statusBarAnimation)) ? false : true));
    }

    @Override // vo.e0
    @no.a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(t view, Integer statusBarColor) {
        p013kotlin.jvm.internal.s.k(view, "view");
        logNotAvailable("statusBarColor");
    }

    @Override // vo.e0
    @no.a(name = "statusBarHidden")
    public void setStatusBarHidden(t view, boolean statusBarHidden) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // vo.e0
    @no.a(name = "statusBarStyle")
    public void setStatusBarStyle(t view, String statusBarStyle) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // vo.e0
    @no.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(t view, boolean statusBarTranslucent) {
        p013kotlin.jvm.internal.s.k(view, "view");
        logNotAvailable("statusBarTranslucent");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(t view, com.facebook.react.uimanager.k0 props, com.facebook.react.uimanager.u0 stateWrapper) {
        p013kotlin.jvm.internal.s.k(view, "view");
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(t parent, View child, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        p013kotlin.jvm.internal.s.k(child, "child");
        if (child instanceof w) {
            parent.registerLayoutCallbackForWrapper((w) child);
        } else if (child instanceof y) {
            parent.setFooter((y) child);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(t parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        if (parent.getChildAt(index) instanceof y) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @no.a(name = "activityState")
    public final void setActivityState(t view, int activityState) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(t.a.INACTIVE);
        } else if (activityState == 1) {
            view.setActivityState(t.a.TRANSITIONING_OR_BELOW_TOP);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(t.a.ON_TOP);
        }
    }
}
