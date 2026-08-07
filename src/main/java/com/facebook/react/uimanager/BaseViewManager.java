package com.facebook.react.uimanager;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseViewManager<T extends View, C extends m> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final q.a sMatrixDecompositionContext = new q.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    private static class a {
        public static void a(@NonNull View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (e.t(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(e.v(readableArray));
            } else {
                if (i11 >= 31) {
                    view.setRenderEffect(e.w(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        qk.a.K("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f11) {
        if (f11 >= -3.4028235E38f && f11 <= Float.MAX_VALUE) {
            return f11;
        }
        if (f11 < -3.4028235E38f || f11 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f11 > Float.MAX_VALUE || f11 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f11)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalStateException("Invalid float property value: " + f11);
    }

    private static void setPointerEventsFlag(@NonNull View view, com.facebook.react.uimanager.events.o.a aVar, boolean z11) {
        Integer num = (Integer) view.getTag(com.facebook.react.m.f22669s);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << aVar.ordinal();
        view.setTag(com.facebook.react.m.f22669s, Integer.valueOf(z11 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(@NonNull T t11) {
        Dynamic dynamic;
        String str = (String) t11.getTag(com.facebook.react.m.f22655e);
        ReadableMap readableMap = (ReadableMap) t11.getTag(com.facebook.react.m.f22658h);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t11.getTag(com.facebook.react.m.f22660j);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t11.getContext().getString(com.facebook.react.p.G));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t11.getContext().getString(com.facebook.react.p.F));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t11.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        jn.c.a aVarB = jn.c.a().b("topPointerCancel", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(aVarB.b("topPointerEnter", jn.c.d("phasedRegistrationNames", jn.c.f("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", jn.c.d("phasedRegistrationNames", jn.c.f("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onClick", "captured", "onClickCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(jn.c.a().b("topAccessibilityAction", jn.c.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(@NonNull T t11) {
        super.onAfterUpdateTransaction(t11);
        updateViewAccessibility(t11);
        Boolean bool = (Boolean) t11.getTag(com.facebook.react.m.f22666p);
        if (bool != null && bool.booleanValue()) {
            t11.addOnLayoutChangeListener(this);
            setTransformProperty(t11, (ReadableArray) t11.getTag(com.facebook.react.m.E), (ReadableArray) t11.getTag(com.facebook.react.m.F));
            t11.setTag(com.facebook.react.m.f22666p, Boolean.FALSE);
        }
        a.a(t11, (ReadableArray) t11.getTag(com.facebook.react.m.f22664n), (Boolean) t11.getTag(com.facebook.react.m.G));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17 - i15;
        int i21 = i13 - i11;
        if (i14 - i12 == i18 - i16 && i21 == i19) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(com.facebook.react.m.F);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(com.facebook.react.m.E);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(@NonNull v0 v0Var, T t11) {
        t11.setTag(null);
        t11.setTag(com.facebook.react.m.f22669s, null);
        t11.setTag(com.facebook.react.m.f22670t, null);
        t11.setTag(com.facebook.react.m.J, null);
        t11.setTag(com.facebook.react.m.f22667q, null);
        t11.setTag(com.facebook.react.m.f22655e, null);
        t11.setTag(com.facebook.react.m.f22654d, null);
        t11.setTag(com.facebook.react.m.f22657g, null);
        t11.setTag(com.facebook.react.m.f22658h, null);
        t11.setTag(com.facebook.react.m.f22651a, null);
        t11.setTag(com.facebook.react.m.f22660j, null);
        t11.setTag(com.facebook.react.m.f22659i, null);
        t11.setTag(com.facebook.react.m.H, null);
        setTransformProperty(t11, null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            return null;
        }
        t11.resetPivot();
        t11.setTop(0);
        t11.setBottom(0);
        t11.setLeft(0);
        t11.setRight(0);
        t11.setElevation(BitmapDescriptorFactory.HUE_RED);
        if (i11 >= 29) {
            t11.setAnimationMatrix(null);
        }
        t11.setTag(com.facebook.react.m.E, null);
        t11.setTag(com.facebook.react.m.F, null);
        t11.setTag(com.facebook.react.m.f22666p, null);
        t11.removeOnLayoutChangeListener(this);
        t11.setTag(com.facebook.react.m.G, null);
        t11.setTag(com.facebook.react.m.f22664n, null);
        t11.setTag(com.facebook.react.m.f22668r, null);
        a.a(t11, null, null);
        if (i11 >= 28) {
            t11.setOutlineAmbientShadowColor(-16777216);
            t11.setOutlineSpotShadowColor(-16777216);
        }
        t11.setNextFocusDownId(-1);
        t11.setNextFocusForwardId(-1);
        t11.setNextFocusRightId(-1);
        t11.setNextFocusUpId(-1);
        t11.setFocusable(false);
        t11.setFocusableInTouchMode(false);
        t11.setElevation(BitmapDescriptorFactory.HUE_RED);
        t11.setAlpha(1.0f);
        setPadding(t11, 0, 0, 0, 0);
        t11.setForeground(null);
        return t11;
    }

    @no.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t11, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t11.setTag(com.facebook.react.m.f22651a, readableArray);
    }

    @no.a(name = "accessibilityCollection")
    public void setAccessibilityCollection(@NonNull T t11, ReadableMap readableMap) {
        t11.setTag(com.facebook.react.m.f22652b, readableMap);
    }

    @no.a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(@NonNull T t11, ReadableMap readableMap) {
        t11.setTag(com.facebook.react.m.f22653c, readableMap);
    }

    @no.a(name = "accessibilityHint")
    public void setAccessibilityHint(@NonNull T t11, String str) {
        t11.setTag(com.facebook.react.m.f22654d, str);
        updateViewContentDescription(t11);
    }

    @no.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(@NonNull T t11, String str) {
        t11.setTag(com.facebook.react.m.f22655e, str);
        updateViewContentDescription(t11);
    }

    @no.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(@NonNull T t11, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t11.setTag(com.facebook.react.m.f22667q, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t11.setTag(com.facebook.react.m.f22667q, dynamic.asArray().getString(0));
        }
    }

    @no.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(@NonNull T t11, String str) {
        if (str == null || str.equals("none")) {
            ViewCompat.r0(t11, 0);
        } else if (str.equals("polite")) {
            ViewCompat.r0(t11, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.r0(t11, 2);
        }
    }

    @no.a(name = "accessibilityRole")
    public void setAccessibilityRole(@NonNull T t11, String str) {
        if (str == null) {
            t11.setTag(com.facebook.react.m.f22657g, null);
        } else {
            t11.setTag(com.facebook.react.m.f22657g, y.d.fromValue(str));
        }
    }

    @no.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t11, ReadableMap readableMap) {
        if (readableMap == null) {
            t11.setTag(com.facebook.react.m.f22660j, null);
            t11.setContentDescription(null);
        } else {
            t11.setTag(com.facebook.react.m.f22660j, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t11);
            }
        }
    }

    @no.a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@NonNull T t11, int i11) {
        com.facebook.react.uimanager.a.o(t11, Integer.valueOf(i11));
    }

    public void setBorderBottomLeftRadius(T t11, float f11) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_LEFT_RADIUS);
    }

    public void setBorderBottomRightRadius(T t11, float f11) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    public void setBorderRadius(T t11, float f11) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_RADIUS);
    }

    public void setBorderTopLeftRadius(T t11, float f11) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_LEFT_RADIUS);
    }

    public void setBorderTopRightRadius(T t11, float f11) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_RIGHT_RADIUS);
    }

    @no.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(T t11, ReadableArray readableArray) {
        com.facebook.react.uimanager.a.u(t11, readableArray);
    }

    @no.a(name = "onClick")
    public void setClick(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.CLICK, z11);
    }

    @no.a(name = "onClickCapture")
    public void setClickCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.CLICK_CAPTURE, z11);
    }

    @no.a(name = "elevation")
    public void setElevation(@NonNull T t11, float f11) {
        ViewCompat.x0(t11, w.h(f11));
    }

    @no.a(customType = "Filter", name = "filter")
    public void setFilter(@NonNull T t11, ReadableArray readableArray) {
        if (oo.a.c(t11) == 2) {
            t11.setTag(com.facebook.react.m.f22664n, readableArray);
        }
    }

    @no.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(@NonNull T t11, String str) {
        if (str == null || str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            ViewCompat.z0(t11, 0);
            return;
        }
        if (str.equals("yes")) {
            ViewCompat.z0(t11, 1);
        } else if (str.equals("no")) {
            ViewCompat.z0(t11, 2);
        } else if (str.equals("no-hide-descendants")) {
            ViewCompat.z0(t11, 4);
        }
    }

    @no.a(name = "mixBlendMode")
    public void setMixBlendMode(@NonNull T t11, String str) {
        if (oo.a.c(t11) == 2) {
            t11.setTag(com.facebook.react.m.f22668r, c.b(str));
            if (t11.getParent() instanceof View) {
                ((View) t11.getParent()).invalidate();
            }
        }
    }

    @no.a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "nativeID")
    public void setNativeId(@NonNull T t11, String str) {
        t11.setTag(com.facebook.react.m.J, str);
        to.a.c(t11);
    }

    @no.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(@NonNull T t11, float f11) {
        t11.setAlpha(f11);
    }

    @no.a(customType = "Color", name = "outlineColor")
    public void setOutlineColor(T t11, Integer num) {
        com.facebook.react.uimanager.a.x(t11, num);
    }

    @no.a(name = "outlineOffset")
    public void setOutlineOffset(T t11, float f11) {
        com.facebook.react.uimanager.a.y(t11, f11);
    }

    @no.a(name = "outlineStyle")
    public void setOutlineStyle(T t11, String str) {
        com.facebook.react.uimanager.a.z(t11, str == null ? null : so.o.fromString(str));
    }

    @no.a(name = "outlineWidth")
    public void setOutlineWidth(T t11, float f11) {
        com.facebook.react.uimanager.a.A(t11, f11);
    }

    @no.a(name = "onPointerEnter")
    public void setPointerEnter(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.ENTER, z11);
    }

    @no.a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.ENTER_CAPTURE, z11);
    }

    @no.a(name = "onPointerLeave")
    public void setPointerLeave(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.LEAVE, z11);
    }

    @no.a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.LEAVE_CAPTURE, z11);
    }

    @no.a(name = "onPointerMove")
    public void setPointerMove(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.MOVE, z11);
    }

    @no.a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.MOVE_CAPTURE, z11);
    }

    @no.a(name = "onPointerOut")
    public void setPointerOut(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.OUT, z11);
    }

    @no.a(name = "onPointerOutCapture")
    public void setPointerOutCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.OUT_CAPTURE, z11);
    }

    @no.a(name = "onPointerOver")
    public void setPointerOver(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.OVER, z11);
    }

    @no.a(name = "onPointerOverCapture")
    public void setPointerOverCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, com.facebook.react.uimanager.events.o.a.OVER_CAPTURE, z11);
    }

    @no.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(@NonNull T t11, boolean z11) {
        t11.setTag(com.facebook.react.m.G, Boolean.valueOf(z11));
    }

    @no.a(name = "onResponderEnd")
    public void setResponderEnd(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderGrant")
    public void setResponderGrant(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderMove")
    public void setResponderMove(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderReject")
    public void setResponderReject(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderRelease")
    public void setResponderRelease(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderStart")
    public void setResponderStart(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderTerminate")
    public void setResponderTerminate(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "role")
    public void setRole(@NonNull T t11, String str) {
        if (str == null) {
            t11.setTag(com.facebook.react.m.D, null);
        } else {
            t11.setTag(com.facebook.react.m.D, y.e.fromValue(str));
        }
    }

    @no.a(name = "rotation")
    @Deprecated
    public void setRotation(@NonNull T t11, float f11) {
        t11.setRotation(f11);
    }

    @no.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(@NonNull T t11, float f11) {
        t11.setScaleX(f11);
    }

    @no.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(@NonNull T t11, float f11) {
        t11.setScaleY(f11);
    }

    @no.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(@NonNull T t11, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            t11.setOutlineAmbientShadowColor(i11);
            t11.setOutlineSpotShadowColor(i11);
        }
    }

    @no.a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "testID")
    public void setTestId(@NonNull T t11, String str) {
        t11.setTag(com.facebook.react.m.f22670t, str);
        t11.setTag(str);
    }

    @no.a(name = "onTouchCancel")
    public void setTouchCancel(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onTouchEnd")
    public void setTouchEnd(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onTouchMove")
    public void setTouchMove(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "onTouchStart")
    public void setTouchStart(@NonNull T t11, boolean z11) {
    }

    @no.a(name = "transform")
    public void setTransform(@NonNull T t11, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t11.getTag(com.facebook.react.m.E), readableArray)) {
            return;
        }
        t11.setTag(com.facebook.react.m.E, readableArray);
        t11.setTag(com.facebook.react.m.f22666p, Boolean.TRUE);
    }

    @no.a(name = "transformOrigin")
    public void setTransformOrigin(@NonNull T t11, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t11.getTag(com.facebook.react.m.F), readableArray)) {
            return;
        }
        t11.setTag(com.facebook.react.m.F, readableArray);
        t11.setTag(com.facebook.react.m.f22666p, Boolean.TRUE);
    }

    protected void setTransformProperty(@NonNull T t11, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t11.setTranslationX(w.h(BitmapDescriptorFactory.HUE_RED));
            t11.setTranslationY(w.h(BitmapDescriptorFactory.HUE_RED));
            t11.setRotation(BitmapDescriptorFactory.HUE_RED);
            t11.setRotationX(BitmapDescriptorFactory.HUE_RED);
            t11.setRotationY(BitmapDescriptorFactory.HUE_RED);
            t11.setScaleX(1.0f);
            t11.setScaleY(1.0f);
            t11.setCameraDistance(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        boolean z11 = oo.a.c(t11) == 2;
        q.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        y0.d(readableArray, dArr, w.f(t11.getWidth()), w.f(t11.getHeight()), readableArray2, z11);
        q.k(dArr, aVar);
        t11.setTranslationX(w.h(sanitizeFloatPropertyValue((float) aVar.translation[0])));
        t11.setTranslationY(w.h(sanitizeFloatPropertyValue((float) aVar.translation[1])));
        t11.setRotation(sanitizeFloatPropertyValue((float) aVar.rotationDegrees[2]));
        t11.setRotationX(sanitizeFloatPropertyValue((float) aVar.rotationDegrees[0]));
        t11.setRotationY(sanitizeFloatPropertyValue((float) aVar.rotationDegrees[1]));
        t11.setScaleX(sanitizeFloatPropertyValue((float) aVar.scale[0]));
        t11.setScaleY(sanitizeFloatPropertyValue((float) aVar.scale[1]));
        double[] dArr2 = aVar.perspective;
        if (dArr2.length > 2) {
            float f11 = (float) dArr2[2];
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                f11 = 7.8125E-4f;
            }
            float f12 = (-1.0f) / f11;
            float f13 = d.c().density;
            t11.setCameraDistance(sanitizeFloatPropertyValue(f13 * f13 * f12 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "translateX")
    @Deprecated
    public void setTranslateX(@NonNull T t11, float f11) {
        t11.setTranslationX(w.h(f11));
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "translateY")
    @Deprecated
    public void setTranslateY(@NonNull T t11, float f11) {
        t11.setTranslationY(w.h(f11));
    }

    @no.a(name = "accessibilityState")
    public void setViewState(@NonNull T t11, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t11.setTag(com.facebook.react.m.f22659i, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t11.isSelected();
            boolean z11 = readableMap.getBoolean("selected");
            t11.setSelected(z11);
            if (t11.isAccessibilityFocused() && zIsSelected && !z11) {
                t11.announceForAccessibility(t11.getContext().getString(com.facebook.react.p.H));
            }
        } else {
            t11.setSelected(false);
        }
        t11.setTag(com.facebook.react.m.f22658h, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t11.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t11);
                return;
            } else if (t11.isAccessibilityFocused()) {
                t11.sendAccessibilityEvent(1);
            }
        }
    }

    @no.a(name = "zIndex")
    public void setZIndex(@NonNull T t11, float f11) {
        ViewGroupManager.setViewZIndex(t11, Math.round(f11));
        ViewParent parent = t11.getParent();
        if (parent instanceof o0) {
            ((o0) parent).updateDrawingOrder();
        }
    }

    protected void updateViewAccessibility(@NonNull T t11) {
        y.i0(t11, t11.isFocusable(), t11.getImportantForAccessibility());
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
