package vo;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import vo.f1;

/* JADX INFO: loaded from: classes4.dex */
public class e1<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & f1<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public e1(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "height":
                ((f1) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "result":
                ((f1) this.mViewManager).setResult(t11, obj == null ? null : (String) obj);
                break;
            case "x":
                ((f1) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((f1) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((f1) this.mViewManager).setNodes(t11, (ReadableArray) obj);
                break;
            case "width":
                ((f1) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
