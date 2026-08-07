package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import vo.z;

/* JADX INFO: loaded from: classes4.dex */
public class y<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & z<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public y(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        if (str.equals("insetType")) {
            ((z) this.mViewManager).setInsetType(t11, (String) obj);
        } else if (str.equals("edges")) {
            ((z) this.mViewManager).setEdges(t11, (ReadableMap) obj);
        } else {
            super.b(t11, str, obj);
        }
    }
}
