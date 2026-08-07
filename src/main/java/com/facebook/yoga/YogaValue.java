package com.facebook.yoga;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final YogaValue f23991c = new YogaValue(Float.NaN, w.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final YogaValue f23992d = new YogaValue(BitmapDescriptorFactory.HUE_RED, w.POINT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final YogaValue f23993e = new YogaValue(Float.NaN, w.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f23995b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23996a;

        static {
            int[] iArr = new int[w.values().length];
            f23996a = iArr;
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23996a[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23996a[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23996a[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f11, w wVar) {
        this.f23994a = f11;
        this.f23995b = wVar;
    }

    public static YogaValue a(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return f23991c;
        }
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str)) {
            return f23993e;
        }
        return str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), w.PERCENT) : new YogaValue(Float.parseFloat(str), w.POINT);
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            w wVar = this.f23995b;
            if (wVar == yogaValue.f23995b) {
                return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f23994a, yogaValue.f23994a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f23994a) + this.f23995b.intValue();
    }

    public String toString() {
        int i11 = a.f23996a[this.f23995b.ordinal()];
        if (i11 == 1) {
            return "undefined";
        }
        if (i11 == 2) {
            return Float.toString(this.f23994a);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            throw new IllegalStateException();
        }
        return this.f23994a + "%";
    }

    YogaValue(float f11, int i11) {
        this(f11, w.fromInt(i11));
    }
}
