package qu;

import java.math.RoundingMode;
import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f106162a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[] f106163b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f106164a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f106164a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106164a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106164a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106164a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f106164a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f106164a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f106164a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f106164a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d11, double d12, double d13) {
        f.b("tolerance", d13);
        if (Math.copySign(d11 - d12, 1.0d) <= d13 || d11 == d12) {
            return true;
        }
        return Double.isNaN(d11) && Double.isNaN(d12);
    }

    public static boolean b(double d11) {
        if (c.b(d11)) {
            return d11 == 0.0d || 52 - Long.numberOfTrailingZeros(c.a(d11)) <= Math.getExponent(d11);
        }
        return false;
    }

    public static boolean c(double d11) {
        if (d11 > 0.0d && c.b(d11)) {
            long jA = c.a(d11);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int d(double d11, RoundingMode roundingMode) {
        boolean zC;
        boolean z11 = false;
        p.e(d11 > 0.0d && c.b(d11), "x must be positive and finite");
        int exponent = Math.getExponent(d11);
        if (!c.c(d11)) {
            return d(d11 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (a.f106164a[roundingMode.ordinal()]) {
            case 1:
                f.e(c(d11));
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z11 = !c(d11);
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z11 = exponent < 0;
                zC = c(d11);
                z11 &= !zC;
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z11 = exponent >= 0;
                zC = c(d11);
                z11 &= !zC;
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double d12 = c.d(d11);
                if (d12 * d12 > 2.0d) {
                    z11 = true;
                }
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    static double e(double d11, RoundingMode roundingMode) {
        if (!c.b(d11)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f106164a[roundingMode.ordinal()]) {
            case 1:
                f.e(b(d11));
                return d11;
            case 2:
                return (d11 >= 0.0d || b(d11)) ? d11 : ((long) d11) - 1;
            case 3:
                return (d11 <= 0.0d || b(d11)) ? d11 : ((long) d11) + 1;
            case 4:
                return d11;
            case 5:
                if (b(d11)) {
                    return d11;
                }
                return ((long) d11) + ((long) (d11 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d11);
            case 7:
                double dRint = Math.rint(d11);
                return Math.abs(d11 - dRint) == 0.5d ? d11 + Math.copySign(0.5d, d11) : dRint;
            case 8:
                double dRint2 = Math.rint(d11);
                return Math.abs(d11 - dRint2) == 0.5d ? d11 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long f(double d11, RoundingMode roundingMode) {
        double dE = e(d11, roundingMode);
        f.a(((-9.223372036854776E18d) - dE < 1.0d) & (dE < 9.223372036854776E18d), d11, roundingMode);
        return (long) dE;
    }
}
