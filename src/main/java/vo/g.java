package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import vo.h;

/* JADX INFO: loaded from: classes4.dex */
public class g<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & h<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public g(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T t11, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeValue")) {
            ((h) this.mViewManager).setNativeValue(t11, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "thumbColor":
                ((h) this.mViewManager).setThumbColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "enabled":
                ((h) this.mViewManager).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((h) this.mViewManager).setTrackTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "on":
                ((h) this.mViewManager).setOn(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((h) this.mViewManager).setValue(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((h) this.mViewManager).setDisabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((h) this.mViewManager).setTrackColorForFalse(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "thumbTintColor":
                ((h) this.mViewManager).setThumbTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "trackColorForTrue":
                ((h) this.mViewManager).setTrackColorForTrue(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
