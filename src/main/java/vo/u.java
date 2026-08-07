package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.math.ec.Tnaf;
import vo.v;

/* JADX INFO: loaded from: classes4.dex */
public class u<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & v<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public u(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1873119606:
                if (str.equals("tabBarTintColor")) {
                    b11 = 0;
                }
                break;
            case -1716883528:
                if (str.equals("tabBarItemLabelVisibilityMode")) {
                    b11 = 1;
                }
                break;
            case -1583805635:
                if (str.equals("tabBarControllerMode")) {
                    b11 = 2;
                }
                break;
            case -1167805191:
                if (str.equals("tabBarItemIconColor")) {
                    b11 = 3;
                }
                break;
            case -1140765365:
                if (str.equals("tabBarItemActiveIndicatorColor")) {
                    b11 = 4;
                }
                break;
            case -727132909:
                if (str.equals("tabBarItemTitleFontColorActive")) {
                    b11 = 5;
                }
                break;
            case -149697865:
                if (str.equals("tabBarBackgroundColor")) {
                    b11 = 6;
                }
                break;
            case -141083017:
                if (str.equals("tabBarItemTitleFontSize")) {
                    b11 = 7;
                }
                break;
            case -93216851:
                if (str.equals("tabBarItemTitleFontColor")) {
                    b11 = 8;
                }
                break;
            case -78279173:
                if (str.equals("tabBarItemTitleFontStyle")) {
                    b11 = 9;
                }
                break;
            case 144476014:
                if (str.equals("tabBarMinimizeBehavior")) {
                    b11 = 10;
                }
                break;
            case 676974377:
                if (str.equals("tabBarItemActiveIndicatorEnabled")) {
                    b11 = 11;
                }
                break;
            case 697418079:
                if (str.equals("tabBarItemIconColorActive")) {
                    b11 = 12;
                }
                break;
            case 1458977038:
                if (str.equals("controlNavigationStateInJS")) {
                    b11 = 13;
                }
                break;
            case 1478227034:
                if (str.equals("tabBarItemTitleFontFamily")) {
                    b11 = 14;
                }
                break;
            case 1935822306:
                if (str.equals("tabBarItemRippleColor")) {
                    b11 = 15;
                }
                break;
            case 1968495470:
                if (str.equals("tabBarItemTitleFontWeight")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2018161757:
                if (str.equals("tabBarItemTitleFontSizeActive")) {
                    b11 = 17;
                }
                break;
        }
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        switch (b11) {
            case 0:
                ((v) this.mViewManager).setTabBarTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 1:
                ((v) this.mViewManager).setTabBarItemLabelVisibilityMode(t11, (String) obj);
                break;
            case 2:
                ((v) this.mViewManager).setTabBarControllerMode(t11, (String) obj);
                break;
            case 3:
                ((v) this.mViewManager).setTabBarItemIconColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 4:
                ((v) this.mViewManager).setTabBarItemActiveIndicatorColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 5:
                ((v) this.mViewManager).setTabBarItemTitleFontColorActive(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 6:
                ((v) this.mViewManager).setTabBarBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 7:
                v vVar = (v) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                vVar.setTabBarItemTitleFontSize(t11, fFloatValue);
                break;
            case 8:
                ((v) this.mViewManager).setTabBarItemTitleFontColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 9:
                ((v) this.mViewManager).setTabBarItemTitleFontStyle(t11, obj != null ? (String) obj : null);
                break;
            case 10:
                ((v) this.mViewManager).setTabBarMinimizeBehavior(t11, (String) obj);
                break;
            case 11:
                ((v) this.mViewManager).setTabBarItemActiveIndicatorEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 12:
                ((v) this.mViewManager).setTabBarItemIconColorActive(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 13:
                ((v) this.mViewManager).setControlNavigationStateInJS(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 14:
                ((v) this.mViewManager).setTabBarItemTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case 15:
                ((v) this.mViewManager).setTabBarItemRippleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 16:
                ((v) this.mViewManager).setTabBarItemTitleFontWeight(t11, obj != null ? (String) obj : null);
                break;
            case 17:
                v vVar2 = (v) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                vVar2.setTabBarItemTitleFontSizeActive(t11, fFloatValue);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
