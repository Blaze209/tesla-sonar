package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J\u0011\u0010\u0013\u001a\u00020\u0004*\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\u0011\u0010\u0015\u001a\u00020\u0004*\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/w;", "", "<init>", "()V", "", "value", "h", "(F)F", "", "g", "(D)F", "maxFontScale", "k", "(FF)F", IntegerTokenConverter.CONVERTER_KEY, "f", "c", "()F", "b", "a", "", "e", "(I)F", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f23413a = new w();

    private w() {
    }

    public static final float c() {
        return d.e().density;
    }

    public static final float f(float value) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        return value / d.e().density;
    }

    public static final float g(double value) {
        return h((float) value);
    }

    public static final float h(float value) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, value, d.e());
    }

    public static final float i(double value) {
        return l((float) value, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public static final float j(float f11) {
        return l(f11, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public static final float k(float value, float maxFontScale) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        DisplayMetrics displayMetricsE = d.e();
        float fApplyDimension = TypedValue.applyDimension(2, value, displayMetricsE);
        return maxFontScale >= 1.0f ? Math.min(fApplyDimension, value * displayMetricsE.density * maxFontScale) : fApplyDimension;
    }

    public static /* synthetic */ float l(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = Float.NaN;
        }
        return k(f11, f12);
    }

    public final float a(double d11) {
        return h((float) d11);
    }

    public final float b(float f11) {
        return h(f11);
    }

    public final float d(float f11) {
        return f(f11);
    }

    public final float e(int i11) {
        return f(i11);
    }
}
