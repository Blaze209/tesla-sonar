package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import vo.j;

/* JADX INFO: loaded from: classes4.dex */
public class i<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & j<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T t11, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "clearElementsHighlights":
                ((j) this.mViewManager).clearElementsHighlights(t11);
                break;
            case "highlightTraceUpdates":
                ((j) this.mViewManager).highlightTraceUpdates(t11, readableArray.getArray(0));
                break;
            case "highlightElements":
                ((j) this.mViewManager).highlightElements(t11, readableArray.getArray(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        super.b(t11, str, obj);
    }
}
