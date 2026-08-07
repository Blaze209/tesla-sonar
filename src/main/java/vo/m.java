package vo;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import vo.n;

/* JADX INFO: loaded from: classes4.dex */
public class m<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & n<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public m(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        if (str.equals("iOSPresentationStyle")) {
            ((n) this.mViewManager).setIOSPresentationStyle(t11, obj != null ? (String) obj : null);
        } else if (str.equals("token")) {
            ((n) this.mViewManager).setToken(t11, obj != null ? (String) obj : null);
        } else {
            super.b(t11, str, obj);
        }
    }
}
