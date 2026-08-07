package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import vo.d;

/* JADX INFO: loaded from: classes4.dex */
public class c<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & d<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    b11 = 0;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    b11 = 1;
                }
                break;
            case -676876213:
                if (str.equals(ReactProgressBarViewManager.PROP_ATTR)) {
                    b11 = 2;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 3;
                }
                break;
            case 633138363:
                if (str.equals(ReactProgressBarViewManager.PROP_INDETERMINATE)) {
                    b11 = 4;
                }
                break;
            case 1118509918:
                if (str.equals(ReactProgressBarViewManager.PROP_ANIMATING)) {
                    b11 = 5;
                }
                break;
            case 1804741442:
                if (str.equals(ReactProgressBarViewManager.PROP_STYLE)) {
                    b11 = 6;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((d) this.mViewManager).setProgress(t11, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 1:
                ((d) this.mViewManager).setTestID(t11, obj == null ? "" : (String) obj);
                break;
            case 2:
                ((d) this.mViewManager).setTypeAttr(t11, obj != null ? (String) obj : null);
                break;
            case 3:
                ((d) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 4:
                ((d) this.mViewManager).setIndeterminate(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((d) this.mViewManager).setAnimating(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 6:
                ((d) this.mViewManager).setStyleAttr(t11, obj != null ? (String) obj : null);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
