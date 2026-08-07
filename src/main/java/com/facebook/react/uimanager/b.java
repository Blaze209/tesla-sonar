package com.facebook.react.uimanager;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0016\b\u0001\u0010\u0005*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00028\u00018\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/b;", "Landroid/view/View;", "T", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/uimanager/m;", Gender.UNKNOWN, "Lcom/facebook/react/uimanager/l1;", "mViewManager", "<init>", "(Lcom/facebook/react/uimanager/BaseViewManager;)V", "view", "", "propName", "", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "a", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/BaseViewManager;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b<T extends View, U extends BaseViewManager<T, ? extends m>> implements l1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    protected final U mViewManager;

    public b(U mViewManager) {
        p013kotlin.jvm.internal.s.k(mViewManager, "mViewManager");
        this.mViewManager = mViewManager;
    }

    @Override // com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: a */
    public void c(T view, String commandName, ReadableArray args) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(commandName, "commandName");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.l1
    /* JADX INFO: renamed from: d */
    public void b(T view, String propName, Object value) {
        Integer color;
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(propName, "propName");
        int iHashCode = propName.hashCode();
        float fDoubleValue = BitmapDescriptorFactory.HUE_RED;
        switch (iHashCode) {
            case -2018402664:
                if (propName.equals("mixBlendMode")) {
                    this.mViewManager.setMixBlendMode(view, (String) value);
                    break;
                }
                break;
            case -1898517556:
                if (propName.equals("onPointerEnterCapture")) {
                    Boolean bool = (Boolean) value;
                    this.mViewManager.setPointerEnterCapture(view, bool != null ? bool.booleanValue() : false);
                    break;
                }
                break;
            case -1721943862:
                if (propName.equals("translateX")) {
                    U u11 = this.mViewManager;
                    Double d11 = (Double) value;
                    if (d11 != null) {
                        fDoubleValue = (float) d11.doubleValue();
                    }
                    u11.setTranslateX(view, fDoubleValue);
                    break;
                }
                break;
            case -1721943861:
                if (propName.equals("translateY")) {
                    U u12 = this.mViewManager;
                    Double d12 = (Double) value;
                    if (d12 != null) {
                        fDoubleValue = (float) d12.doubleValue();
                    }
                    u12.setTranslateY(view, fDoubleValue);
                    break;
                }
                break;
            case -1589741021:
                if (propName.equals("shadowColor")) {
                    U u13 = this.mViewManager;
                    color = value != null ? ColorPropConverter.getColor(value, view.getContext()) : 0;
                    p013kotlin.jvm.internal.s.h(color);
                    u13.setShadowColor(view, color.intValue());
                    break;
                }
                break;
            case -1489432511:
                if (propName.equals("outlineColor")) {
                    this.mViewManager.setOutlineColor(view, (Integer) value);
                    break;
                }
                break;
            case -1474494833:
                if (propName.equals("outlineStyle")) {
                    this.mViewManager.setOutlineStyle(view, (String) value);
                    break;
                }
                break;
            case -1471148380:
                if (propName.equals("outlineWidth")) {
                    Double d13 = (Double) value;
                    this.mViewManager.setOutlineWidth(view, d13 != null ? (float) d13.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case -1351902487:
                if (propName.equals("onClick")) {
                    Boolean bool2 = (Boolean) value;
                    this.mViewManager.setClick(view, bool2 != null ? bool2.booleanValue() : false);
                    break;
                }
                break;
            case -1274492040:
                if (propName.equals("filter")) {
                    this.mViewManager.setFilter(view, (ReadableArray) value);
                    break;
                }
                break;
            case -1267206133:
                if (propName.equals("opacity")) {
                    Double d14 = (Double) value;
                    this.mViewManager.setOpacity(view, d14 != null ? (float) d14.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -1247970794:
                if (propName.equals("onPointerOutCapture")) {
                    Boolean bool3 = (Boolean) value;
                    this.mViewManager.setPointerOutCapture(view, bool3 != null ? bool3.booleanValue() : false);
                    break;
                }
                break;
            case -1228066334:
                if (propName.equals(Snapshot.BORDER_TOP_LEFT_RADIUS)) {
                    Double d15 = (Double) value;
                    this.mViewManager.setBorderTopLeftRadius(view, d15 != null ? (float) d15.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case -1219666915:
                if (propName.equals("onClickCapture")) {
                    Boolean bool4 = (Boolean) value;
                    this.mViewManager.setClickCapture(view, bool4 != null ? bool4.booleanValue() : false);
                    break;
                }
                break;
            case -1036769289:
                if (propName.equals("onPointerMoveCapture")) {
                    Boolean bool5 = (Boolean) value;
                    this.mViewManager.setPointerMoveCapture(view, bool5 != null ? bool5.booleanValue() : false);
                    break;
                }
                break;
            case -908189618:
                if (propName.equals("scaleX")) {
                    Double d16 = (Double) value;
                    this.mViewManager.setScaleX(view, d16 != null ? (float) d16.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -908189617:
                if (propName.equals("scaleY")) {
                    Double d17 = (Double) value;
                    this.mViewManager.setScaleY(view, d17 != null ? (float) d17.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -877170387:
                if (propName.equals("testID")) {
                    this.mViewManager.setTestId(view, (String) value);
                    break;
                }
                break;
            case -781597262:
                if (propName.equals("transformOrigin")) {
                    this.mViewManager.setTransformOrigin(view, (ReadableArray) value);
                    break;
                }
                break;
            case -731417480:
                if (propName.equals("zIndex")) {
                    U u14 = this.mViewManager;
                    Double d18 = (Double) value;
                    if (d18 != null) {
                        fDoubleValue = (float) d18.doubleValue();
                    }
                    u14.setZIndex(view, fDoubleValue);
                    break;
                }
                break;
            case -112141555:
                if (propName.equals("onPointerLeaveCapture")) {
                    Boolean bool6 = (Boolean) value;
                    this.mViewManager.setPointerLeaveCapture(view, bool6 != null ? bool6.booleanValue() : false);
                    break;
                }
                break;
            case -101663499:
                if (propName.equals("accessibilityHint")) {
                    this.mViewManager.setAccessibilityHint(view, (String) value);
                    break;
                }
                break;
            case -101359900:
                if (propName.equals("accessibilityRole")) {
                    this.mViewManager.setAccessibilityRole(view, (String) value);
                    break;
                }
                break;
            case -80891667:
                if (propName.equals("renderToHardwareTextureAndroid")) {
                    Boolean bool7 = (Boolean) value;
                    this.mViewManager.setRenderToHardwareTexture(view, bool7 != null ? bool7.booleanValue() : false);
                    break;
                }
                break;
            case -40300674:
                if (propName.equals("rotation")) {
                    U u15 = this.mViewManager;
                    Double d19 = (Double) value;
                    if (d19 != null) {
                        fDoubleValue = (float) d19.doubleValue();
                    }
                    u15.setRotation(view, fDoubleValue);
                    break;
                }
                break;
            case -4379043:
                if (propName.equals("elevation")) {
                    U u16 = this.mViewManager;
                    Double d21 = (Double) value;
                    if (d21 != null) {
                        fDoubleValue = (float) d21.doubleValue();
                    }
                    u16.setElevation(view, fDoubleValue);
                    break;
                }
                break;
            case 3506294:
                if (propName.equals("role")) {
                    this.mViewManager.setRole(view, (String) value);
                    break;
                }
                break;
            case 17941018:
                if (propName.equals("onPointerEnter")) {
                    Boolean bool8 = (Boolean) value;
                    this.mViewManager.setPointerEnter(view, bool8 != null ? bool8.booleanValue() : false);
                    break;
                }
                break;
            case 24119801:
                if (propName.equals("onPointerLeave")) {
                    Boolean bool9 = (Boolean) value;
                    this.mViewManager.setPointerLeave(view, bool9 != null ? bool9.booleanValue() : false);
                    break;
                }
                break;
            case 36255470:
                if (propName.equals("accessibilityLiveRegion")) {
                    this.mViewManager.setAccessibilityLiveRegion(view, (String) value);
                    break;
                }
                break;
            case 132353428:
                if (propName.equals("onPointerOverCapture")) {
                    Boolean bool10 = (Boolean) value;
                    this.mViewManager.setPointerOverCapture(view, bool10 != null ? bool10.booleanValue() : false);
                    break;
                }
                break;
            case 317346576:
                if (propName.equals("onPointerOut")) {
                    Boolean bool11 = (Boolean) value;
                    this.mViewManager.setPointerOut(view, bool11 != null ? bool11.booleanValue() : false);
                    break;
                }
                break;
            case 333432965:
                if (propName.equals(Snapshot.BORDER_TOP_RIGHT_RADIUS)) {
                    Double d22 = (Double) value;
                    this.mViewManager.setBorderTopRightRadius(view, d22 != null ? (float) d22.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 581268560:
                if (propName.equals(Snapshot.BORDER_BOTTOM_LEFT_RADIUS)) {
                    Double d23 = (Double) value;
                    this.mViewManager.setBorderBottomLeftRadius(view, d23 != null ? (float) d23.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 588239831:
                if (propName.equals(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)) {
                    Double d24 = (Double) value;
                    this.mViewManager.setBorderBottomRightRadius(view, d24 != null ? (float) d24.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 743055051:
                if (propName.equals("boxShadow")) {
                    this.mViewManager.setBoxShadow(view, (ReadableArray) value);
                    break;
                }
                break;
            case 746986311:
                if (propName.equals("importantForAccessibility")) {
                    this.mViewManager.setImportantForAccessibility(view, (String) value);
                    break;
                }
                break;
            case 1052666732:
                if (propName.equals("transform")) {
                    this.mViewManager.setTransform(view, (ReadableArray) value);
                    break;
                }
                break;
            case 1146842694:
                if (propName.equals("accessibilityLabel")) {
                    this.mViewManager.setAccessibilityLabel(view, (String) value);
                    break;
                }
                break;
            case 1153872867:
                if (propName.equals("accessibilityState")) {
                    this.mViewManager.setViewState(view, (ReadableMap) value);
                    break;
                }
                break;
            case 1156088003:
                if (propName.equals("accessibilityValue")) {
                    this.mViewManager.setAccessibilityValue(view, (ReadableMap) value);
                    break;
                }
                break;
            case 1247744079:
                if (propName.equals("onPointerMove")) {
                    Boolean bool12 = (Boolean) value;
                    this.mViewManager.setPointerMove(view, bool12 != null ? bool12.booleanValue() : false);
                    break;
                }
                break;
            case 1247809874:
                if (propName.equals("onPointerOver")) {
                    Boolean bool13 = (Boolean) value;
                    this.mViewManager.setPointerOver(view, bool13 != null ? bool13.booleanValue() : false);
                    break;
                }
                break;
            case 1287124693:
                if (propName.equals("backgroundColor")) {
                    U u17 = this.mViewManager;
                    color = value != null ? ColorPropConverter.getColor(value, view.getContext()) : 0;
                    p013kotlin.jvm.internal.s.h(color);
                    u17.setBackgroundColor(view, color.intValue());
                    break;
                }
                break;
            case 1349188574:
                if (propName.equals(Snapshot.BORDER_RADIUS)) {
                    Double d25 = (Double) value;
                    this.mViewManager.setBorderRadius(view, d25 != null ? (float) d25.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 1407295349:
                if (propName.equals("outlineOffset")) {
                    Double d26 = (Double) value;
                    this.mViewManager.setOutlineOffset(view, d26 != null ? (float) d26.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 1505602511:
                if (propName.equals("accessibilityActions")) {
                    this.mViewManager.setAccessibilityActions(view, (ReadableArray) value);
                    break;
                }
                break;
            case 1761903244:
                if (propName.equals("accessibilityCollection")) {
                    this.mViewManager.setAccessibilityCollection(view, (ReadableMap) value);
                    break;
                }
                break;
            case 1865277756:
                if (propName.equals("accessibilityLabelledBy")) {
                    this.mViewManager.setAccessibilityLabelledBy(view, new DynamicFromObject(value));
                    break;
                }
                break;
            case 1993034687:
                if (propName.equals("accessibilityCollectionItem")) {
                    this.mViewManager.setAccessibilityCollectionItem(view, (ReadableMap) value);
                    break;
                }
                break;
            case 2045685618:
                if (propName.equals("nativeID")) {
                    this.mViewManager.setNativeId(view, (String) value);
                    break;
                }
                break;
        }
    }
}
