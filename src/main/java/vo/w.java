package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import org.spongycastle.math.ec.Tnaf;
import vo.x;

/* JADX INFO: loaded from: classes4.dex */
public class w<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & x<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public w(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    b11 = 0;
                }
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    b11 = 1;
                }
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    b11 = 2;
                }
                break;
            case -1770963447:
                if (str.equals("specialEffects")) {
                    b11 = 3;
                }
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    b11 = 4;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    b11 = 5;
                }
                break;
            case -1270820115:
                if (str.equals("isFocused")) {
                    b11 = 6;
                }
                break;
            case -1186468415:
                if (str.equals("overrideScrollViewContentInsetAdjustmentBehavior")) {
                    b11 = 7;
                }
                break;
            case -881409398:
                if (str.equals("tabKey")) {
                    b11 = 8;
                }
                break;
            case -776576227:
                if (str.equals("iconImageSource")) {
                    b11 = 9;
                }
                break;
            case -737911981:
                if (str.equals("iconType")) {
                    b11 = 10;
                }
                break;
            case -569869622:
                if (str.equals("selectedIconSfSymbolName")) {
                    b11 = 11;
                }
                break;
            case -270334418:
                if (str.equals("scrollEdgeAppearance")) {
                    b11 = 12;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    b11 = 13;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    b11 = 14;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    b11 = 15;
                }
                break;
            case 143186447:
                if (str.equals("iconSfSymbolName")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 642560482:
                if (str.equals("systemItem")) {
                    b11 = 17;
                }
                break;
            case 1001537282:
                if (str.equals("selectedIconImageSource")) {
                    b11 = 18;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    b11 = 19;
                }
                break;
            case 1519110851:
                if (str.equals("tabBarItemBadgeBackgroundColor")) {
                    b11 = 20;
                }
                break;
            case 1595935908:
                if (str.equals("tabBarItemBadgeTextColor")) {
                    b11 = 21;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    b11 = 22;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((x) this.mViewManager).setBottomScrollEdgeEffect(t11, (String) obj);
                break;
            case 1:
                ((x) this.mViewManager).setTopScrollEdgeEffect(t11, (String) obj);
                break;
            case 2:
                ((x) this.mViewManager).setLeftScrollEdgeEffect(t11, (String) obj);
                break;
            case 3:
                ((x) this.mViewManager).setSpecialEffects(t11, (ReadableMap) obj);
                break;
            case 4:
                ((x) this.mViewManager).setRightScrollEdgeEffect(t11, (String) obj);
                break;
            case 5:
                ((x) this.mViewManager).setOrientation(t11, (String) obj);
                break;
            case 6:
                ((x) this.mViewManager).setIsFocused(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((x) this.mViewManager).setOverrideScrollViewContentInsetAdjustmentBehavior(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 8:
                ((x) this.mViewManager).setTabKey(t11, obj != null ? (String) obj : null);
                break;
            case 9:
                ((x) this.mViewManager).setIconImageSource(t11, (ReadableMap) obj);
                break;
            case 10:
                ((x) this.mViewManager).setIconType(t11, (String) obj);
                break;
            case 11:
                ((x) this.mViewManager).setSelectedIconSfSymbolName(t11, obj != null ? (String) obj : null);
                break;
            case 12:
                ((x) this.mViewManager).setScrollEdgeAppearance(t11, new DynamicFromObject(obj));
                break;
            case 13:
                ((x) this.mViewManager).setDrawableIconResourceName(t11, obj != null ? (String) obj : null);
                break;
            case 14:
                ((x) this.mViewManager).setStandardAppearance(t11, new DynamicFromObject(obj));
                break;
            case 15:
                ((x) this.mViewManager).setTitle(t11, obj != null ? (String) obj : null);
                break;
            case 16:
                ((x) this.mViewManager).setIconSfSymbolName(t11, obj != null ? (String) obj : null);
                break;
            case 17:
                ((x) this.mViewManager).setSystemItem(t11, (String) obj);
                break;
            case 18:
                ((x) this.mViewManager).setSelectedIconImageSource(t11, (ReadableMap) obj);
                break;
            case 19:
                ((x) this.mViewManager).setBadgeValue(t11, obj != null ? (String) obj : null);
                break;
            case 20:
                ((x) this.mViewManager).setTabBarItemBadgeBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 21:
                ((x) this.mViewManager).setTabBarItemBadgeTextColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 22:
                ((x) this.mViewManager).setImageIconResource(t11, (ReadableMap) obj);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
