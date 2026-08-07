package vo;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import org.spongycastle.math.ec.Tnaf;
import vo.d2;

/* JADX INFO: loaded from: classes4.dex */
public class c2<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & d2<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c2(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1932235233:
                if (str.equals("gradientUnits")) {
                    b11 = 0;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b11 = 1;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b11 = 2;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b11 = 3;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b11 = 4;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b11 = 5;
                }
                break;
            case 3189:
                if (str.equals("cx")) {
                    b11 = 6;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    b11 = 7;
                }
                break;
            case 3282:
                if (str.equals("fx")) {
                    b11 = 8;
                }
                break;
            case 3283:
                if (str.equals("fy")) {
                    b11 = 9;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    b11 = 10;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
                    b11 = 11;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = 12;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 13;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    b11 = 14;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b11 = 15;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b11 = 17;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b11 = 18;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    b11 = 19;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = 20;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((d2) this.mViewManager).setGradientUnits(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                this.mViewManager.setOpacity(t11, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 2:
                ((d2) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 3:
                ((d2) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 4:
                ((d2) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 5:
                ((d2) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 6:
                ((d2) this.mViewManager).setCx(t11, new DynamicFromObject(obj));
                break;
            case 7:
                ((d2) this.mViewManager).setCy(t11, new DynamicFromObject(obj));
                break;
            case 8:
                ((d2) this.mViewManager).setFx(t11, new DynamicFromObject(obj));
                break;
            case 9:
                ((d2) this.mViewManager).setFy(t11, new DynamicFromObject(obj));
                break;
            case 10:
                ((d2) this.mViewManager).setRx(t11, new DynamicFromObject(obj));
                break;
            case 11:
                ((d2) this.mViewManager).setRy(t11, new DynamicFromObject(obj));
                break;
            case 12:
                ((d2) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 13:
                ((d2) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 14:
                ((d2) this.mViewManager).setGradient(t11, (ReadableArray) obj);
                break;
            case 15:
                ((d2) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 16:
                ((d2) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 17:
                ((d2) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 18:
                ((d2) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 19:
                ((d2) this.mViewManager).setGradientTransform(t11, (ReadableArray) obj);
                break;
            case 20:
                ((d2) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
