package vo;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import vo.d1;

/* JADX INFO: loaded from: classes4.dex */
public class c1<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & d1<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c1(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals(Snapshot.HEIGHT)) {
                    b11 = 0;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    b11 = 1;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b11 = 2;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b11 = 3;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b11 = 4;
                }
                break;
            case 113126854:
                if (str.equals(Snapshot.WIDTH)) {
                    b11 = 5;
                }
                break;
            case 1530721536:
                if (str.equals("edgeMode")) {
                    b11 = 6;
                }
                break;
            case 1837475450:
                if (str.equals("stdDeviationX")) {
                    b11 = 7;
                }
                break;
            case 1837475451:
                if (str.equals("stdDeviationY")) {
                    b11 = 8;
                }
                break;
        }
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        switch (b11) {
            case 0:
                ((d1) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case 1:
                ((d1) this.mViewManager).setResult(t11, obj != null ? (String) obj : null);
                break;
            case 2:
                ((d1) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case 3:
                ((d1) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case 4:
                ((d1) this.mViewManager).setIn1(t11, obj != null ? (String) obj : null);
                break;
            case 5:
                ((d1) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            case 6:
                ((d1) this.mViewManager).setEdgeMode(t11, (String) obj);
                break;
            case 7:
                d1 d1Var = (d1) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                d1Var.setStdDeviationX(t11, fFloatValue);
                break;
            case 8:
                d1 d1Var2 = (d1) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                d1Var2.setStdDeviationY(t11, fFloatValue);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
