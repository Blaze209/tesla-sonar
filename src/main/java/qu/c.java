package qu;

import ou.p;

/* JADX INFO: loaded from: classes5.dex */
final class c {
    static long a(double d11) {
        p.e(b(d11), "not a normal value");
        int exponent = Math.getExponent(d11);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d11) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d11) {
        return Math.getExponent(d11) <= 1023;
    }

    static boolean c(double d11) {
        return Math.getExponent(d11) >= -1022;
    }

    static double d(double d11) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d11) & 4503599627370495L) | 4607182418800017408L);
    }
}
