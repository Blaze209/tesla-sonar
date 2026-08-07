package qu;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
final class f {
    static void a(boolean z11, double d11, RoundingMode roundingMode) {
        if (z11) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d11 + " and rounding mode " + roundingMode);
    }

    static double b(String str, double d11) {
        if (d11 >= 0.0d) {
            return d11;
        }
        throw new IllegalArgumentException(str + " (" + d11 + ") must be >= 0");
    }

    static long c(String str, long j11) {
        if (j11 >= 0) {
            return j11;
        }
        throw new IllegalArgumentException(str + " (" + j11 + ") must be >= 0");
    }

    static int d(String str, int i11) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " (" + i11 + ") must be > 0");
    }

    static void e(boolean z11) {
        if (!z11) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
