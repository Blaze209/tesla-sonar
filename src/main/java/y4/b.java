package y4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "stop", "fraction", "b", "(FFF)F", "", "c", "(IIF)I", "x", "a", "(F)F", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final float a(float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f11)) & 8589934591L) / ((long) 3))) + 709952852);
        float f12 = fIntBitsToFloat - ((fIntBitsToFloat - (f11 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f12 - ((f12 - (f11 / (f12 * f12))) * 0.33333334f);
    }

    public static final float b(float f11, float f12, float f13) {
        return ((1 - f13) * f11) + (f13 * f12);
    }

    public static final int c(int i11, int i12, float f11) {
        return i11 + ((int) Math.round(((double) (i12 - i11)) * ((double) f11)));
    }
}
