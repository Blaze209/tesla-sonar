package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.math.ec.Tnaf;
import vo.j2;

/* JADX INFO: loaded from: classes4.dex */
public class i2<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & j2<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i2(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b11 = 0;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b11 = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b11 = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b11 = 3;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b11 = 4;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b11 = 5;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b11 = 6;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b11 = 7;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b11 = 8;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b11 = 9;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b11 = 10;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b11 = 11;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b11 = 12;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b11 = 13;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b11 = 14;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b11 = 15;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b11 = 17;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b11 = 18;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 19;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b11 = 20;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b11 = 21;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 22;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b11 = 23;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b11 = 24;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b11 = 25;
                }
                break;
            case 365601008:
                if (str.equals(OrcaFlavourKeys.FONT_SIZE)) {
                    b11 = 26;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b11 = 27;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b11 = 28;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b11 = 29;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b11 = 30;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b11 = 31;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b11 = 32;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = 33;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b11 = 34;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b11 = 35;
                }
                break;
        }
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        switch (b11) {
            case 0:
                j2 j2Var = (j2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                j2Var.setVbHeight(t11, fFloatValue);
                break;
            case 1:
                ((j2) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case 2:
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((j2) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 4:
                ((j2) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case 5:
                ((j2) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 6:
                ((j2) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 7:
                ((j2) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case 8:
                ((j2) this.mViewManager).setFontWeight(t11, new DynamicFromObject(obj));
                break;
            case 9:
                ((j2) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 10:
                ((j2) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((j2) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 12:
                ((j2) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 13:
                j2 j2Var2 = (j2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                j2Var2.setStrokeDashoffset(t11, fFloatValue);
                break;
            case 14:
                ((j2) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case 15:
                ((j2) this.mViewManager).setFont(t11, new DynamicFromObject(obj));
                break;
            case 16:
                ((j2) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 17:
                j2 j2Var3 = (j2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                j2Var3.setMinX(t11, fFloatValue);
                break;
            case 18:
                j2 j2Var4 = (j2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                j2Var4.setMinY(t11, fFloatValue);
                break;
            case 19:
                ((j2) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 20:
                j2 j2Var5 = (j2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                j2Var5.setStrokeMiterlimit(t11, fFloatValue);
                break;
            case 21:
                ((j2) this.mViewManager).setAlign(t11, obj != null ? (String) obj : null);
                break;
            case 22:
                ((j2) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 23:
                ((j2) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 24:
                ((j2) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 25:
                j2 j2Var6 = (j2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                j2Var6.setVbWidth(t11, fFloatValue);
                break;
            case 26:
                ((j2) this.mViewManager).setFontSize(t11, new DynamicFromObject(obj));
                break;
            case 27:
                ((j2) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case 28:
                ((j2) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 29:
                ((j2) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((j2) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 31:
                ((j2) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 32:
                ((j2) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((j2) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 34:
                ((j2) this.mViewManager).setMeetOrSlice(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((j2) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
