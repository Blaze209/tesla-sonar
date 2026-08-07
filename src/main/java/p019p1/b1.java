package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "b", "(FFFFF)J", "", "a", "(DDDDD)J", "Lp1/v;", "firstRoot", "p0", "v0", "g", "(Lp1/v;DDD)D", "c", "secondRoot", "e", "(Lp1/v;Lp1/v;DDD)D", "initialPosition", DateTokenConverter.CONVERTER_KEY, "(Lp1/v;Lp1/v;DDDD)J", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b1 {
    public static final long a(double d11, double d12, double d13, double d14, double d15) {
        double dSqrt = 2.0d * d12 * Math.sqrt(d11);
        double d16 = (dSqrt * dSqrt) - (d11 * 4.0d);
        double d17 = -dSqrt;
        ComplexDouble complexDoubleA = w.a(d16);
        complexDoubleA._real += d17;
        complexDoubleA._real *= 0.5d;
        complexDoubleA._imaginary *= 0.5d;
        ComplexDouble complexDoubleA2 = w.a(d16);
        double d18 = -1;
        complexDoubleA2._real *= d18;
        complexDoubleA2._imaginary *= d18;
        complexDoubleA2._real += d17;
        complexDoubleA2._real *= 0.5d;
        complexDoubleA2._imaginary *= 0.5d;
        return d(complexDoubleA, complexDoubleA2, d12, d13, d14, d15);
    }

    public static final long b(float f11, float f12, float f13, float f14, float f15) {
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return 9223372036854L;
        }
        return a(f11, f12, f13, f14, f15);
    }

    private static final double c(ComplexDouble complexDouble, double d11, double d12, double d13) {
        double d14 = d13;
        double d15 = complexDouble.get_real();
        double d16 = d15 * d11;
        double d17 = d12 - d16;
        double dLog = Math.log(Math.abs(d14 / d11)) / d15;
        double dLog2 = Math.log(Math.abs(d14 / d17));
        double dLog3 = dLog2;
        for (int i11 = 0; i11 < 6; i11++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d15));
        }
        double d18 = dLog3 / d15;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d18;
        } else if ((Double.isInfinite(d18) || Double.isNaN(d18)) ? false : true) {
            dLog = Math.max(dLog, d18);
        }
        double d19 = (-(d16 + d17)) / (d15 * d17);
        double d21 = d15 * d19;
        double dExp = (Math.exp(d21) * d11) + (d17 * d19 * Math.exp(d21));
        if (Double.isNaN(d19) || d19 <= 0.0d) {
            d14 = -d14;
        } else if (d19 <= 0.0d || (-dExp) >= d14) {
            dLog = (-(2.0d / d15)) - (d11 / d17);
        } else {
            if (d17 < 0.0d && d11 > 0.0d) {
                dLog = 0.0d;
            }
            d14 = -d14;
        }
        double dAbs = Double.MAX_VALUE;
        int i12 = 0;
        while (dAbs > 0.001d && i12 < 100) {
            i12++;
            double d22 = d15 * dLog;
            double d23 = d14;
            double dExp2 = dLog - ((((d11 + (d17 * dLog)) * Math.exp(d22)) + d14) / ((((((double) 1) + d22) * d17) + d16) * Math.exp(d22)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d14 = d23;
        }
        return dLog;
    }

    private static final long d(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d11, double d12, double d13, double d14) {
        double dG;
        if (d13 == 0.0d && d12 == 0.0d) {
            return 0L;
        }
        if (d13 < 0.0d) {
            d12 = -d12;
        }
        double d15 = d12;
        double dAbs = Math.abs(d13);
        if (d11 > 1.0d) {
            dG = e(complexDouble, complexDouble2, dAbs, d15, d14);
        } else {
            dG = d11 < 1.0d ? g(complexDouble, dAbs, d15, d14) : c(complexDouble, dAbs, d15, d14);
        }
        return (long) (dG * 1000.0d);
    }

    private static final double e(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d11, double d12, double d13) {
        double d14 = d13;
        double d15 = complexDouble.get_real();
        double d16 = complexDouble2.get_real();
        double d17 = d15 - d16;
        double d18 = ((d15 * d11) - d12) / d17;
        double d19 = d11 - d18;
        double dLog = Math.log(Math.abs(d14 / d19)) / d15;
        double dLog2 = Math.log(Math.abs(d14 / d18)) / d16;
        if ((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true) {
            if ((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true) {
                dLog = Math.max(dLog, dLog2);
            }
            dLog2 = dLog;
        }
        double d21 = d19 * d15;
        double dLog3 = Math.log(d21 / ((-d18) * d16)) / (d16 - d15);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d14 = -d14;
        } else if (dLog3 <= 0.0d || (-f(d19, d15, dLog3, d18, d16)) >= d14) {
            dLog2 = Math.log((-((d18 * d16) * d16)) / (d21 * d15)) / d17;
        } else {
            if (d18 > 0.0d && d19 < 0.0d) {
                dLog2 = 0.0d;
            }
            d14 = -d14;
        }
        double d22 = d18 * d16;
        if (Math.abs((Math.exp(d15 * dLog2) * d21) + (Math.exp(d16 * dLog2) * d22)) < 1.0E-4d) {
            return dLog2;
        }
        double d23 = Double.MAX_VALUE;
        double d24 = d14;
        int i11 = 0;
        while (d23 > 0.001d && i11 < 100) {
            i11++;
            double d25 = d15 * dLog2;
            double d26 = d16 * dLog2;
            double dExp = dLog2 - ((((Math.exp(d25) * d19) + (Math.exp(d26) * d18)) + d24) / ((Math.exp(d25) * d21) + (Math.exp(d26) * d22)));
            double dAbs = Math.abs(dLog2 - dExp);
            dLog2 = dExp;
            d23 = dAbs;
        }
        return dLog2;
    }

    private static final double f(double d11, double d12, double d13, double d14, double d15) {
        return (d11 * Math.exp(d12 * d13)) + (d14 * Math.exp(d15 * d13));
    }

    private static final double g(ComplexDouble complexDouble, double d11, double d12, double d13) {
        double d14 = complexDouble.get_real();
        double d15 = (d12 - (d14 * d11)) / complexDouble.get_imaginary();
        return Math.log(d13 / Math.sqrt((d11 * d11) + (d15 * d15))) / d14;
    }
}
