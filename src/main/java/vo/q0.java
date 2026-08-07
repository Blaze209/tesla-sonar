package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import vo.r0;

/* JADX INFO: loaded from: classes4.dex */
public class q0<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & r0<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public q0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    b11 = 0;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b11 = 1;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b11 = 2;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b11 = 3;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b11 = 4;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = 5;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 6;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b11 = 7;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b11 = 8;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b11 = 9;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b11 = 10;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = 11;
                }
                break;
        }
        switch (b11) {
            case 0:
                this.mViewManager.setOpacity(t11, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 1:
                ((r0) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 2:
                ((r0) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 3:
                ((r0) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 4:
                ((r0) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 5:
                ((r0) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 6:
                ((r0) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 7:
                ((r0) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 8:
                ((r0) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 9:
                ((r0) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 10:
                ((r0) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 11:
                ((r0) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
