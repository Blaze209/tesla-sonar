package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import org.spongycastle.math.ec.Tnaf;
import vo.g0;

/* JADX INFO: loaded from: classes4.dex */
public class f0<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & g0<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public f0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1822687399:
                if (str.equals("translucent")) {
                    b11 = 0;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    b11 = 1;
                }
                break;
            case -1795707688:
                if (str.equals("blurEffect")) {
                    b11 = 2;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    b11 = 3;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    b11 = 4;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    b11 = 5;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    b11 = 6;
                }
                break;
            case -1217487446:
                if (str.equals("hidden")) {
                    b11 = 7;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    b11 = 8;
                }
                break;
            case -1093089076:
                if (str.equals("backButtonDisplayMode")) {
                    b11 = 9;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    b11 = 10;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b11 = 11;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    b11 = 12;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    b11 = 13;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    b11 = 14;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 15;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    b11 = 17;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    b11 = 18;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    b11 = 19;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    b11 = 20;
                }
                break;
            case 946001674:
                if (str.equals("headerRightBarButtonItems")) {
                    b11 = 21;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    b11 = 22;
                }
                break;
            case 1249557231:
                if (str.equals("headerLeftBarButtonItems")) {
                    b11 = 23;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b11 = 24;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    b11 = 25;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    b11 = 26;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    b11 = 27;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    b11 = 28;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    b11 = 29;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((g0) this.mViewManager).setTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((g0) this.mViewManager).setTitleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 2:
                ((g0) this.mViewManager).setBlurEffect(t11, (String) obj);
                break;
            case 3:
                ((g0) this.mViewManager).setLargeTitleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 4:
                ((g0) this.mViewManager).setTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case 5:
                ((g0) this.mViewManager).setDisableBackButtonMenu(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((g0) this.mViewManager).setTitleFontWeight(t11, obj != null ? (String) obj : null);
                break;
            case 7:
                ((g0) this.mViewManager).setHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((g0) this.mViewManager).setLargeTitleFontSize(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 9:
                ((g0) this.mViewManager).setBackButtonDisplayMode(t11, (String) obj);
                break;
            case 10:
                ((g0) this.mViewManager).setBackTitleVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((g0) this.mViewManager).setDirection(t11, (String) obj);
                break;
            case 12:
                ((g0) this.mViewManager).setLargeTitleBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 13:
                ((g0) this.mViewManager).setBackButtonInCustomView(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 14:
                ((g0) this.mViewManager).setLargeTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case 15:
                ((g0) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 16:
                ((g0) this.mViewManager).setTitle(t11, obj != null ? (String) obj : null);
                break;
            case 17:
                ((g0) this.mViewManager).setBackTitleFontSize(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 18:
                ((g0) this.mViewManager).setBackTitleFontFamily(t11, obj != null ? (String) obj : null);
                break;
            case 19:
                ((g0) this.mViewManager).setHideShadow(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 20:
                ((g0) this.mViewManager).setLargeTitleFontWeight(t11, obj != null ? (String) obj : null);
                break;
            case 21:
                ((g0) this.mViewManager).setHeaderRightBarButtonItems(t11, (ReadableArray) obj);
                break;
            case 22:
                ((g0) this.mViewManager).setHideBackButton(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((g0) this.mViewManager).setHeaderLeftBarButtonItems(t11, (ReadableArray) obj);
                break;
            case 24:
                ((g0) this.mViewManager).setBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 25:
                ((g0) this.mViewManager).setBackTitle(t11, obj != null ? (String) obj : null);
                break;
            case 26:
                ((g0) this.mViewManager).setTitleFontSize(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((g0) this.mViewManager).setLargeTitleHideShadow(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((g0) this.mViewManager).setLargeTitle(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 29:
                ((g0) this.mViewManager).setTopInsetEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
