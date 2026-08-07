package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import vo.q;

/* JADX INFO: loaded from: classes4.dex */
public class p<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & q<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public p(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "rippleRadius":
                ((q) this.mViewManager).setRippleRadius(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "enabled":
                ((q) this.mViewManager).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "rippleColor":
                ((q) this.mViewManager).setRippleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "borderColor":
                ((q) this.mViewManager).setBorderColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "borderStyle":
                ((q) this.mViewManager).setBorderStyle(t11, obj == null ? "solid" : (String) obj);
                break;
            case "borderWidth":
                ((q) this.mViewManager).setBorderWidth(t11, obj == null ? BitmapDescriptorFactory.HUE_RED : ((Double) obj).floatValue());
                break;
            case "touchSoundDisabled":
                ((q) this.mViewManager).setTouchSoundDisabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "exclusive":
                ((q) this.mViewManager).setExclusive(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "borderless":
                ((q) this.mViewManager).setBorderless(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "foreground":
                ((q) this.mViewManager).setForeground(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
