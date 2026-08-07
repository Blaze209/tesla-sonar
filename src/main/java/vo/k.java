package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import vo.l;

/* JADX INFO: loaded from: classes4.dex */
public class k<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & l<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public k(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "presentationStyle":
                ((l) this.mViewManager).setPresentationStyle(t11, (String) obj);
                break;
            case "supportedOrientations":
                ((l) this.mViewManager).setSupportedOrientations(t11, (ReadableArray) obj);
                break;
            case "transparent":
                ((l) this.mViewManager).setTransparent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((l) this.mViewManager).setIdentifier(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((l) this.mViewManager).setStatusBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((l) this.mViewManager).setAnimated(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((l) this.mViewManager).setVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((l) this.mViewManager).setNavigationBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((l) this.mViewManager).setHardwareAccelerated(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((l) this.mViewManager).setAnimationType(t11, (String) obj);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
