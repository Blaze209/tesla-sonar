package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public interface e0<T extends View> {
    void setActivityState(T t11, float f11);

    void setBottomScrollEdgeEffect(T t11, String str);

    void setCustomAnimationOnSwipe(T t11, boolean z11);

    void setFullScreenSwipeEnabled(T t11, String str);

    void setFullScreenSwipeShadowEnabled(T t11, boolean z11);

    void setGestureEnabled(T t11, boolean z11);

    void setGestureResponseDistance(T t11, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t11, boolean z11);

    void setHomeIndicatorHidden(T t11, boolean z11);

    void setLeftScrollEdgeEffect(T t11, String str);

    void setNativeBackButtonDismissalEnabled(T t11, boolean z11);

    void setNavigationBarColor(T t11, Integer num);

    void setNavigationBarHidden(T t11, boolean z11);

    void setNavigationBarTranslucent(T t11, boolean z11);

    void setPreventNativeDismiss(T t11, boolean z11);

    void setReplaceAnimation(T t11, String str);

    void setRightScrollEdgeEffect(T t11, String str);

    void setScreenId(T t11, String str);

    void setScreenOrientation(T t11, String str);

    void setSheetAllowedDetents(T t11, ReadableArray readableArray);

    void setSheetCornerRadius(T t11, float f11);

    void setSheetElevation(T t11, int i11);

    void setSheetExpandsWhenScrolledToEdge(T t11, boolean z11);

    void setSheetGrabberVisible(T t11, boolean z11);

    void setSheetInitialDetent(T t11, int i11);

    void setSheetLargestUndimmedDetent(T t11, int i11);

    void setStackAnimation(T t11, String str);

    void setStackPresentation(T t11, String str);

    void setStatusBarAnimation(T t11, String str);

    void setStatusBarColor(T t11, Integer num);

    void setStatusBarHidden(T t11, boolean z11);

    void setStatusBarStyle(T t11, String str);

    void setStatusBarTranslucent(T t11, boolean z11);

    void setSwipeDirection(T t11, String str);

    void setTopScrollEdgeEffect(T t11, String str);

    void setTransitionDuration(T t11, int i11);
}
