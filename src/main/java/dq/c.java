package dq;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static int a(float f11) {
        return ((int) (((double) f11) + 16384.999999999996d)) - 16384;
    }

    public static int b(float f11) {
        return ((int) (((double) f11) + 16384.0d)) - 16384;
    }

    public static float c(float f11, float f12, float f13) {
        if (f11 <= f12) {
            return f12;
        }
        return f11 >= f13 ? f13 : f11;
    }

    public static float d(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    public static float e(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }
}
