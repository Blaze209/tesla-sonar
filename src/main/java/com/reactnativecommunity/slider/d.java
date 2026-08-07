package com.reactnativecommunity.slider;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static a a(v0 v0Var) {
        a aVar = new a(v0Var, null);
        aVar.setSplitTrack(false);
        return aVar;
    }

    public static Map<String, Object> b() {
        return jn.c.d("topChange", jn.c.d("registrationName", "topChange"));
    }

    public static Map<String, Object> c() {
        return jn.c.e("onRNCSliderSlidingStart", jn.c.d("registrationName", "onRNCSliderSlidingStart"), "onRNCSliderSlidingComplete", jn.c.d("registrationName", "onRNCSliderSlidingComplete"));
    }

    public static void d(a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    public static void e(a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    public static void f(a aVar, boolean z11) {
        aVar.setEnabled(!z11);
    }

    public static void g(a aVar, boolean z11) {
        if (z11) {
            aVar.setScaleX(-1.0f);
        } else {
            aVar.setScaleX(1.0f);
        }
    }

    public static void h(a aVar, double d11) {
        aVar.setLowerLimit(d11);
    }

    public static void i(a aVar, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.background);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void j(a aVar, double d11) {
        aVar.setMaxValue(d11);
    }

    public static void k(a aVar, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.progress);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void l(a aVar, double d11) {
        aVar.setMinValue(d11);
    }

    public static void m(a aVar, double d11) {
        aVar.setStep(d11);
    }

    public static void n(a aVar, ReadableMap readableMap) {
        aVar.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    public static void o(a aVar, Integer num) {
        if (aVar.getThumb() != null) {
            if (num == null) {
                aVar.getThumb().clearColorFilter();
            } else {
                aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public static void p(a aVar, double d11) {
        aVar.setUpperLimit(d11);
    }

    public static void q(a aVar, double d11) {
        if (aVar.e()) {
            return;
        }
        aVar.setValue(d11);
        if (!aVar.isAccessibilityFocused() || Build.VERSION.SDK_INT <= 29) {
            return;
        }
        aVar.setupAccessibility((int) d11);
    }
}
