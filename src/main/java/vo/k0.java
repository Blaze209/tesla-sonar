package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import org.spongycastle.math.ec.Tnaf;
import vo.l0;

/* JADX INFO: loaded from: classes4.dex */
public class k0<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & l0<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public k0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T t11, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "cancelSearch":
                ((l0) this.mViewManager).cancelSearch(t11);
                break;
            case "clearText":
                ((l0) this.mViewManager).clearText(t11);
                break;
            case "toggleCancelButton":
                ((l0) this.mViewManager).toggleCancelButton(t11, readableArray.getBoolean(0));
                break;
            case "blur":
                ((l0) this.mViewManager).blur(t11);
                break;
            case "focus":
                ((l0) this.mViewManager).focus(t11);
                break;
            case "setText":
                ((l0) this.mViewManager).setText(t11, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1619312835:
                if (str.equals("hideNavigationBar")) {
                    b11 = 0;
                }
                break;
            case -1465798051:
                if (str.equals("headerIconColor")) {
                    b11 = 1;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    b11 = 2;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b11 = 3;
                }
                break;
            case -336520619:
                if (str.equals("barTintColor")) {
                    b11 = 4;
                }
                break;
            case -256845969:
                if (str.equals("hintTextColor")) {
                    b11 = 5;
                }
                break;
            case -186579527:
                if (str.equals("hideWhenScrolling")) {
                    b11 = 6;
                }
                break;
            case -146361959:
                if (str.equals("cancelButtonText")) {
                    b11 = 7;
                }
                break;
            case -109380883:
                if (str.equals("disableBackButtonOverride")) {
                    b11 = 8;
                }
                break;
            case -39414888:
                if (str.equals("shouldShowHintSearchIcon")) {
                    b11 = 9;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    b11 = 10;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    b11 = 11;
                }
                break;
            case 1399891586:
                if (str.equals("allowToolbarIntegration")) {
                    b11 = 12;
                }
                break;
            case 1584806451:
                if (str.equals("obscureBackground")) {
                    b11 = 13;
                }
                break;
            case 1638055017:
                if (str.equals("autoFocus")) {
                    b11 = 14;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    b11 = 15;
                }
                break;
            case 1792938725:
                if (str.equals("placement")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((l0) this.mViewManager).setHideNavigationBar(t11, (String) obj);
                break;
            case 1:
                ((l0) this.mViewManager).setHeaderIconColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 2:
                ((l0) this.mViewManager).setAutoCapitalize(t11, (String) obj);
                break;
            case 3:
                ((l0) this.mViewManager).setTextColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 4:
                ((l0) this.mViewManager).setBarTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 5:
                ((l0) this.mViewManager).setHintTextColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 6:
                ((l0) this.mViewManager).setHideWhenScrolling(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 7:
                ((l0) this.mViewManager).setCancelButtonText(t11, obj != null ? (String) obj : null);
                break;
            case 8:
                ((l0) this.mViewManager).setDisableBackButtonOverride(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((l0) this.mViewManager).setShouldShowHintSearchIcon(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((l0) this.mViewManager).setPlaceholder(t11, obj != null ? (String) obj : null);
                break;
            case 11:
                ((l0) this.mViewManager).setTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 12:
                ((l0) this.mViewManager).setAllowToolbarIntegration(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 13:
                ((l0) this.mViewManager).setObscureBackground(t11, (String) obj);
                break;
            case 14:
                ((l0) this.mViewManager).setAutoFocus(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((l0) this.mViewManager).setInputType(t11, obj != null ? (String) obj : null);
                break;
            case 16:
                ((l0) this.mViewManager).setPlacement(t11, (String) obj);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
