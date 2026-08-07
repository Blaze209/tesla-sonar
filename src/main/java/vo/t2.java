package vo;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import vo.u2;

/* JADX INFO: loaded from: classes4.dex */
public class t2<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & u2<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public t2(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        if (str.equals("name")) {
            ((u2) this.mViewManager).setName(t11, obj == null ? "" : (String) obj);
        } else {
            super.b(t11, str, obj);
        }
    }
}
