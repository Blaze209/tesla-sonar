package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import org.spongycastle.math.ec.Tnaf;
import vo.e0;

/* JADX INFO: loaded from: classes4.dex */
public class d0<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & e0<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public d0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        byte b11;
        str.getClass();
        switch (str) {
            case "bottomScrollEdgeEffect":
                b11 = 0;
                break;
            case "homeIndicatorHidden":
                b11 = 1;
                break;
            case "topScrollEdgeEffect":
                b11 = 2;
                break;
            case "gestureEnabled":
                b11 = 3;
                break;
            case "leftScrollEdgeEffect":
                b11 = 4;
                break;
            case "hideKeyboardOnSwipe":
                b11 = 5;
                break;
            case "rightScrollEdgeEffect":
                b11 = 6;
                break;
            case "sheetCornerRadius":
                b11 = 7;
                break;
            case "navigationBarHidden":
                b11 = 8;
                break;
            case "statusBarTranslucent":
                b11 = 9;
                break;
            case "stackPresentation":
                b11 = 10;
                break;
            case "activityState":
                b11 = 11;
                break;
            case "statusBarColor":
                b11 = 12;
                break;
            case "statusBarStyle":
                b11 = 13;
                break;
            case "fullScreenSwipeShadowEnabled":
                b11 = 14;
                break;
            case "stackAnimation":
                b11 = 15;
                break;
            case "navigationBarColor":
                b11 = Tnaf.POW_2_WIDTH;
                break;
            case "screenId":
                b11 = 17;
                break;
            case "sheetInitialDetent":
                b11 = 18;
                break;
            case "sheetAllowedDetents":
                b11 = 19;
                break;
            case "replaceAnimation":
                b11 = 20;
                break;
            case "preventNativeDismiss":
                b11 = 21;
                break;
            case "statusBarHidden":
                b11 = 22;
                break;
            case "fullScreenSwipeEnabled":
                b11 = 23;
                break;
            case "gestureResponseDistance":
                b11 = 24;
                break;
            case "screenOrientation":
                b11 = 25;
                break;
            case "sheetLargestUndimmedDetent":
                b11 = 26;
                break;
            case "transitionDuration":
                b11 = 27;
                break;
            case "swipeDirection":
                b11 = 28;
                break;
            case "customAnimationOnSwipe":
                b11 = 29;
                break;
            case "navigationBarTranslucent":
                b11 = 30;
                break;
            case "sheetElevation":
                b11 = 31;
                break;
            case "sheetGrabberVisible":
                b11 = 32;
                break;
            case "statusBarAnimation":
                b11 = 33;
                break;
            case "nativeBackButtonDismissalEnabled":
                b11 = 34;
                break;
            case "sheetExpandsWhenScrolledToEdge":
                b11 = 35;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                ((e0) this.mViewManager).setBottomScrollEdgeEffect(t11, (String) obj);
                break;
            case 1:
                ((e0) this.mViewManager).setHomeIndicatorHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((e0) this.mViewManager).setTopScrollEdgeEffect(t11, (String) obj);
                break;
            case 3:
                ((e0) this.mViewManager).setGestureEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 4:
                ((e0) this.mViewManager).setLeftScrollEdgeEffect(t11, (String) obj);
                break;
            case 5:
                ((e0) this.mViewManager).setHideKeyboardOnSwipe(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((e0) this.mViewManager).setRightScrollEdgeEffect(t11, (String) obj);
                break;
            case 7:
                ((e0) this.mViewManager).setSheetCornerRadius(t11, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 8:
                ((e0) this.mViewManager).setNavigationBarHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((e0) this.mViewManager).setStatusBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((e0) this.mViewManager).setStackPresentation(t11, (String) obj);
                break;
            case 11:
                ((e0) this.mViewManager).setActivityState(t11, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 12:
                ((e0) this.mViewManager).setStatusBarColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 13:
                ((e0) this.mViewManager).setStatusBarStyle(t11, obj != null ? (String) obj : null);
                break;
            case 14:
                ((e0) this.mViewManager).setFullScreenSwipeShadowEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 15:
                ((e0) this.mViewManager).setStackAnimation(t11, (String) obj);
                break;
            case 16:
                ((e0) this.mViewManager).setNavigationBarColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 17:
                ((e0) this.mViewManager).setScreenId(t11, obj == null ? "" : (String) obj);
                break;
            case 18:
                ((e0) this.mViewManager).setSheetInitialDetent(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 19:
                ((e0) this.mViewManager).setSheetAllowedDetents(t11, (ReadableArray) obj);
                break;
            case 20:
                ((e0) this.mViewManager).setReplaceAnimation(t11, (String) obj);
                break;
            case 21:
                ((e0) this.mViewManager).setPreventNativeDismiss(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 22:
                ((e0) this.mViewManager).setStatusBarHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((e0) this.mViewManager).setFullScreenSwipeEnabled(t11, (String) obj);
                break;
            case 24:
                ((e0) this.mViewManager).setGestureResponseDistance(t11, (ReadableMap) obj);
                break;
            case 25:
                ((e0) this.mViewManager).setScreenOrientation(t11, obj != null ? (String) obj : null);
                break;
            case 26:
                ((e0) this.mViewManager).setSheetLargestUndimmedDetent(t11, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 27:
                ((e0) this.mViewManager).setTransitionDuration(t11, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 28:
                ((e0) this.mViewManager).setSwipeDirection(t11, (String) obj);
                break;
            case 29:
                ((e0) this.mViewManager).setCustomAnimationOnSwipe(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((e0) this.mViewManager).setNavigationBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 31:
                ((e0) this.mViewManager).setSheetElevation(t11, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 32:
                ((e0) this.mViewManager).setSheetGrabberVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 33:
                ((e0) this.mViewManager).setStatusBarAnimation(t11, obj != null ? (String) obj : null);
                break;
            case 34:
                ((e0) this.mViewManager).setNativeBackButtonDismissalEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 35:
                ((e0) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
