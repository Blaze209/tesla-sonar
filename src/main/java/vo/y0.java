package vo;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import vo.z0;

/* JADX INFO: loaded from: classes4.dex */
public class y0<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & z0<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public y0(BaseViewManager baseViewManager) {
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
            case 3366:
                if (str.equals("k1")) {
                    b11 = 4;
                }
                break;
            case 3367:
                if (str.equals("k2")) {
                    b11 = 5;
                }
                break;
            case 3368:
                if (str.equals("k3")) {
                    b11 = 6;
                }
                break;
            case 3369:
                if (str.equals("k4")) {
                    b11 = 7;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b11 = 8;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b11 = 9;
                }
                break;
            case 113126854:
                if (str.equals(Snapshot.WIDTH)) {
                    b11 = 10;
                }
                break;
            case 1662708749:
                if (str.equals("operator1")) {
                    b11 = 11;
                }
                break;
        }
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        switch (b11) {
            case 0:
                ((z0) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case 1:
                ((z0) this.mViewManager).setResult(t11, obj != null ? (String) obj : null);
                break;
            case 2:
                ((z0) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case 3:
                ((z0) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case 4:
                z0 z0Var = (z0) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                z0Var.setK1(t11, fFloatValue);
                break;
            case 5:
                z0 z0Var2 = (z0) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                z0Var2.setK2(t11, fFloatValue);
                break;
            case 6:
                z0 z0Var3 = (z0) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                z0Var3.setK3(t11, fFloatValue);
                break;
            case 7:
                z0 z0Var4 = (z0) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                z0Var4.setK4(t11, fFloatValue);
                break;
            case 8:
                ((z0) this.mViewManager).setIn1(t11, obj != null ? (String) obj : null);
                break;
            case 9:
                ((z0) this.mViewManager).setIn2(t11, obj != null ? (String) obj : null);
                break;
            case 10:
                ((z0) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            case 11:
                ((z0) this.mViewManager).setOperator1(t11, (String) obj);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
