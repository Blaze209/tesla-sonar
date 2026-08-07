package vo;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import vo.i0;

/* JADX INFO: loaded from: classes4.dex */
public class h0<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & i0<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public h0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        if (str.equals("type")) {
            ((i0) this.mViewManager).setType(t11, (String) obj);
        } else if (str.equals("hidesSharedBackground")) {
            ((i0) this.mViewManager).setHidesSharedBackground(t11, obj == null ? false : ((Boolean) obj).booleanValue());
        } else {
            super.b(t11, str, obj);
        }
    }
}
