package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class d1 {
    static Map a() {
        return jn.c.a().b("topChange", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(com.facebook.react.uimanager.events.s.getJSEventName(com.facebook.react.uimanager.events.s.START), jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(com.facebook.react.uimanager.events.s.getJSEventName(com.facebook.react.uimanager.events.s.MOVE), jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(com.facebook.react.uimanager.events.s.getJSEventName(com.facebook.react.uimanager.events.s.END), jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(com.facebook.react.uimanager.events.s.getJSEventName(com.facebook.react.uimanager.events.s.CANCEL), jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map<String, Object> b() {
        HashMap mapB = jn.c.b();
        mapB.put("UIView", jn.c.d("ContentMode", jn.c.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        mapB.put("StyleConstants", jn.c.d("PointerEventsValues", jn.c.g("none", Integer.valueOf(x.NONE.ordinal()), "boxNone", Integer.valueOf(x.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(x.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(x.AUTO.ordinal()))));
        mapB.put("AccessibilityEventTypes", jn.c.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return mapB;
    }

    static Map c() {
        return jn.c.a().b("topContentSizeChange", jn.c.d("registrationName", "onContentSizeChange")).b("topLayout", jn.c.d("registrationName", "onLayout")).b("topLoadingError", jn.c.d("registrationName", "onLoadingError")).b("topLoadingFinish", jn.c.d("registrationName", "onLoadingFinish")).b("topLoadingStart", jn.c.d("registrationName", "onLoadingStart")).b("topSelectionChange", jn.c.d("registrationName", "onSelectionChange")).b("topMessage", jn.c.d("registrationName", "onMessage")).b("topScrollBeginDrag", jn.c.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", jn.c.d("registrationName", "onScrollEndDrag")).b("topScroll", jn.c.d("registrationName", "onScroll")).b("topMomentumScrollBegin", jn.c.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", jn.c.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
