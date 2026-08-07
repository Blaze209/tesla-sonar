package vo;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import vo.b1;

/* JADX INFO: loaded from: classes4.dex */
public class a1<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & b1<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public a1(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "floodColor":
                ((b1) this.mViewManager).setFloodColor(t11, new DynamicFromObject(obj));
                break;
            case "height":
                ((b1) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((b1) this.mViewManager).setFloodOpacity(t11, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((b1) this.mViewManager).setResult(t11, obj == null ? null : (String) obj);
                break;
            case "x":
                ((b1) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((b1) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "width":
                ((b1) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
