package vo;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.spongycastle.math.ec.Tnaf;
import vo.h2;

/* JADX INFO: loaded from: classes4.dex */
public class g2<T extends View, U extends BaseViewManager<T, ? extends com.facebook.react.uimanager.m> & h2<T>> extends com.facebook.react.uimanager.b<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public g2(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.b, com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T t11, String str, Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    b11 = 0;
                }
                break;
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    b11 = 1;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    b11 = 2;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b11 = 3;
                }
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    b11 = 4;
                }
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    b11 = 5;
                }
                break;
            case -1228066334:
                if (str.equals(Snapshot.BORDER_TOP_LEFT_RADIUS)) {
                    b11 = 6;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    b11 = 7;
                }
                break;
            case -1122140597:
                if (str.equals("borderTopStartRadius")) {
                    b11 = 8;
                }
                break;
            case -867333731:
                if (str.equals("borderBottomStartRadius")) {
                    b11 = 9;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    b11 = 10;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    b11 = 11;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    b11 = 12;
                }
                break;
            case -483490364:
                if (str.equals("borderTopEndRadius")) {
                    b11 = 13;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    b11 = 14;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b11 = 15;
                }
                break;
            case -252105751:
                if (str.equals("removeClippedSubviews")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    b11 = 17;
                }
                break;
            case -223134121:
                if (str.equals("borderStartEndRadius")) {
                    b11 = 18;
                }
                break;
            case -148030058:
                if (str.equals("borderBottomEndRadius")) {
                    b11 = 19;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    b11 = 20;
                }
                break;
            case -27894242:
                if (str.equals("borderStartStartRadius")) {
                    b11 = 21;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b11 = 22;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b11 = 23;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b11 = 24;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 25;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b11 = 26;
                }
                break;
            case 306963138:
                if (str.equals("borderBlockStartColor")) {
                    b11 = 27;
                }
                break;
            case 333432965:
                if (str.equals(Snapshot.BORDER_TOP_RIGHT_RADIUS)) {
                    b11 = 28;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    b11 = 29;
                }
                break;
            case 581268560:
                if (str.equals(Snapshot.BORDER_BOTTOM_LEFT_RADIUS)) {
                    b11 = 30;
                }
                break;
            case 588239831:
                if (str.equals(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)) {
                    b11 = 31;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    b11 = 32;
                }
                break;
            case 684610594:
                if (str.equals("borderBlockColor")) {
                    b11 = 33;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b11 = 34;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b11 = 35;
                }
                break;
            case 762983977:
                if (str.equals("borderBlockEndColor")) {
                    b11 = 36;
                }
                break;
            case 910681861:
                if (str.equals("borderEndStartRadius")) {
                    b11 = 37;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    b11 = 38;
                }
                break;
            case 1220735892:
                if (str.equals("borderEndColor")) {
                    b11 = 39;
                }
                break;
            case 1349188574:
                if (str.equals(Snapshot.BORDER_RADIUS)) {
                    b11 = 40;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    b11 = 41;
                }
                break;
            case 1667773924:
                if (str.equals("needsOffscreenAlphaCompositing")) {
                    b11 = 42;
                }
                break;
            case 1735382270:
                if (str.equals("borderEndEndRadius")) {
                    b11 = 43;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    b11 = 44;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b11 = 45;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    b11 = 46;
                }
                break;
            case 2119889261:
                if (str.equals("borderStartColor")) {
                    b11 = 47;
                }
                break;
        }
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        switch (b11) {
            case 0:
                ((h2) this.mViewManager).setBbHeight(t11, new DynamicFromObject(obj));
                break;
            case 1:
                ((h2) this.mViewManager).setBorderRightColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 2:
                ((h2) this.mViewManager).setBackfaceVisibility(t11, obj != null ? (String) obj : null);
                break;
            case 3:
                h2 h2Var = (h2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                h2Var.setVbHeight(t11, fFloatValue);
                break;
            case 4:
                ((h2) this.mViewManager).setBorderTopColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 5:
                ((h2) this.mViewManager).setBorderBottomColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 6:
                ((h2) this.mViewManager).setBorderTopLeftRadius(t11, new DynamicFromObject(obj));
                break;
            case 7:
                ((h2) this.mViewManager).setAccessible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((h2) this.mViewManager).setBorderTopStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 9:
                ((h2) this.mViewManager).setBorderBottomStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 10:
                ((h2) this.mViewManager).setHasTVPreferredFocus(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((h2) this.mViewManager).setNextFocusDown(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 12:
                ((h2) this.mViewManager).setNextFocusLeft(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 13:
                ((h2) this.mViewManager).setBorderTopEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 14:
                ((h2) this.mViewManager).setBbWidth(t11, new DynamicFromObject(obj));
                break;
            case 15:
                ((h2) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 16:
                ((h2) this.mViewManager).setRemoveClippedSubviews(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((h2) this.mViewManager).setBorderLeftColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 18:
                ((h2) this.mViewManager).setBorderStartEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 19:
                ((h2) this.mViewManager).setBorderBottomEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 20:
                ((h2) this.mViewManager).setNativeForegroundAndroid(t11, (ReadableMap) obj);
                break;
            case 21:
                ((h2) this.mViewManager).setBorderStartStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 22:
                h2 h2Var2 = (h2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                h2Var2.setMinX(t11, fFloatValue);
                break;
            case 23:
                h2 h2Var3 = (h2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                h2Var3.setMinY(t11, fFloatValue);
                break;
            case 24:
                ((h2) this.mViewManager).setAlign(t11, obj != null ? (String) obj : null);
                break;
            case 25:
                ((h2) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 26:
                h2 h2Var4 = (h2) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                h2Var4.setVbWidth(t11, fFloatValue);
                break;
            case 27:
                ((h2) this.mViewManager).setBorderBlockStartColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 28:
                ((h2) this.mViewManager).setBorderTopRightRadius(t11, new DynamicFromObject(obj));
                break;
            case 29:
                ((h2) this.mViewManager).setNextFocusForward(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((h2) this.mViewManager).setBorderBottomLeftRadius(t11, new DynamicFromObject(obj));
                break;
            case 31:
                ((h2) this.mViewManager).setBorderBottomRightRadius(t11, new DynamicFromObject(obj));
                break;
            case 32:
                ((h2) this.mViewManager).setNextFocusUp(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((h2) this.mViewManager).setBorderBlockColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 34:
                ((h2) this.mViewManager).setBorderColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 35:
                ((h2) this.mViewManager).setBorderStyle(t11, obj != null ? (String) obj : null);
                break;
            case 36:
                ((h2) this.mViewManager).setBorderBlockEndColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 37:
                ((h2) this.mViewManager).setBorderEndStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 38:
                ((h2) this.mViewManager).setHitSlop(t11, new DynamicFromObject(obj));
                break;
            case 39:
                ((h2) this.mViewManager).setBorderEndColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 40:
                ((h2) this.mViewManager).setBorderRadius(t11, new DynamicFromObject(obj));
                break;
            case 41:
                ((h2) this.mViewManager).setFocusable(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 42:
                ((h2) this.mViewManager).setNeedsOffscreenAlphaCompositing(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 43:
                ((h2) this.mViewManager).setBorderEndEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 44:
                ((h2) this.mViewManager).setNativeBackgroundAndroid(t11, (ReadableMap) obj);
                break;
            case 45:
                ((h2) this.mViewManager).setMeetOrSlice(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 46:
                ((h2) this.mViewManager).setNextFocusRight(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 47:
                ((h2) this.mViewManager).setBorderStartColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            default:
                super.b(t11, str, obj);
                break;
        }
    }
}
