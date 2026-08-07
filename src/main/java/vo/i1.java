package vo;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import vo.j1;

/* JADX INFO: loaded from: classes4.dex */
public class i1<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & j1<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i1(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "primitiveUnits":
                ((j1) this.mViewManager).setPrimitiveUnits(t11, (String) obj);
                break;
            case "height":
                ((j1) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((j1) this.mViewManager).setFilterUnits(t11, (String) obj);
                break;
            case "x":
                ((j1) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case "y":
                ((j1) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case "name":
                ((j1) this.mViewManager).setName(t11, obj == null ? null : (String) obj);
                break;
            case "width":
                ((j1) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
