package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import vo.f;

/* JADX INFO: loaded from: classes4.dex */
public class e<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & f<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public e(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T t11, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeRefreshing")) {
            ((f) this.mViewManager).setNativeRefreshing(t11, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "enabled":
                ((f) this.mViewManager).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "colors":
                ((f) this.mViewManager).setColors(t11, (ReadableArray) obj);
                break;
            case "progressBackgroundColor":
                ((f) this.mViewManager).setProgressBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "progressViewOffset":
                ((f) this.mViewManager).setProgressViewOffset(t11, obj == null ? BitmapDescriptorFactory.HUE_RED : ((Double) obj).floatValue());
                break;
            case "refreshing":
                ((f) this.mViewManager).setRefreshing(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "size":
                ((f) this.mViewManager).setSize(t11, (String) obj);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
