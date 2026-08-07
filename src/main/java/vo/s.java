package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.math.ec.Tnaf;
import vo.t;

/* JADX INFO: loaded from: classes4.dex */
public class s<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & t<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public s(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T t11, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativePage")) {
            ((t) this.mViewManager).setNativePage(t11, readableArray.getInt(0));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -2012158909:
                if (str.equals("spacing")) {
                    b11 = 0;
                }
                break;
            case -1790919953:
                if (str.equals("enablePaging")) {
                    b11 = 1;
                }
                break;
            case -1379690984:
                if (str.equals("minScale")) {
                    b11 = 2;
                }
                break;
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    b11 = 3;
                }
                break;
            case -922092170:
                if (str.equals("showsVerticalScrollIndicator")) {
                    b11 = 4;
                }
                break;
            case -657951334:
                if (str.equals("enableAnnotationRendering")) {
                    b11 = 5;
                }
                break;
            case -631667225:
                if (str.equals("enableRTL")) {
                    b11 = 6;
                }
                break;
            case 3433103:
                if (str.equals("page")) {
                    b11 = 7;
                }
                break;
            case 3433509:
                if (str.equals("path")) {
                    b11 = 8;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b11 = 9;
                }
                break;
            case 396505670:
                if (str.equals("maxScale")) {
                    b11 = 10;
                }
                break;
            case 902106275:
                if (str.equals("fitPolicy")) {
                    b11 = 11;
                }
                break;
            case 913503991:
                if (str.equals("singlePage")) {
                    b11 = 12;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    b11 = 13;
                }
                break;
            case 1308044823:
                if (str.equals("enableAntialiasing")) {
                    b11 = 14;
                }
                break;
            case 1387629604:
                if (str.equals("horizontal")) {
                    b11 = 15;
                }
                break;
            case 1539343426:
                if (str.equals("enableDoubleTapZoom")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1915931784:
                if (str.equals("showsHorizontalScrollIndicator")) {
                    b11 = 17;
                }
                break;
        }
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        switch (b11) {
            case 0:
                ((t) this.mViewManager).setSpacing(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                ((t) this.mViewManager).setEnablePaging(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                t tVar = (t) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                tVar.setMinScale(t11, fFloatValue);
                break;
            case 3:
                ((t) this.mViewManager).setScrollEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((t) this.mViewManager).setShowsVerticalScrollIndicator(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((t) this.mViewManager).setEnableAnnotationRendering(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((t) this.mViewManager).setEnableRTL(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((t) this.mViewManager).setPage(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 8:
                ((t) this.mViewManager).setPath(t11, obj != null ? (String) obj : null);
                break;
            case 9:
                t tVar2 = (t) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                tVar2.setScale(t11, fFloatValue);
                break;
            case 10:
                t tVar3 = (t) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                tVar3.setMaxScale(t11, fFloatValue);
                break;
            case 11:
                ((t) this.mViewManager).setFitPolicy(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 12:
                ((t) this.mViewManager).setSinglePage(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 13:
                ((t) this.mViewManager).setPassword(t11, obj != null ? (String) obj : null);
                break;
            case 14:
                ((t) this.mViewManager).setEnableAntialiasing(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((t) this.mViewManager).setHorizontal(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((t) this.mViewManager).setEnableDoubleTapZoom(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((t) this.mViewManager).setShowsHorizontalScrollIndicator(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
