package net.time4j.calendar.astro;

import com.plaid.internal.EnumC4419g;
import net.time4j.b0;
import net.time4j.tz.p;

/* JADX INFO: loaded from: classes9.dex */
public enum b {
    VERNAL_EQUINOX,
    SUMMER_SOLSTICE,
    AUTUMNAL_EQUINOX,
    WINTER_SOLSTICE;

    private static final int[] A = {485, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 182, 156, 136, 77, 74, 70, 58, 52, 50, 45, 44, 29, 18, 17, 16, 14, 12, 12, 12, 9, 8};
    private static final double[] B = {324.96d, 337.23d, 342.08d, 27.85d, 73.14d, 171.52d, 222.54d, 296.72d, 243.58d, 119.81d, 297.17d, 21.02d, 247.54d, 325.15d, 60.93d, 155.12d, 288.79d, 198.04d, 199.76d, 95.39d, 287.11d, 320.81d, 227.73d, 15.45d};
    private static final double[] C = {1934.136d, 32964.467d, 20.186d, 445267.112d, 45036.886d, 22518.443d, 65928.934d, 3034.906d, 9037.513d, 33718.147d, 150.678d, 2281.226d, 29929.562d, 31555.956d, 4443.417d, 67555.328d, 4562.452d, 62894.029d, 31436.921d, 14577.848d, 31931.756d, 34777.259d, 1222.114d, 16859.074d};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94002a;

        static {
            int[] iArr = new int[b.values().length];
            f94002a = iArr;
            try {
                iArr[b.VERNAL_EQUINOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94002a[b.SUMMER_SOLSTICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94002a[b.AUTUMNAL_EQUINOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94002a[b.WINTER_SOLSTICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void checkYear(int i11) {
        if (i11 < -2000 || i11 > 3000) {
            throw new IllegalArgumentException("Year out of supported range: -2000 <= " + i11 + " <= +3000");
        }
    }

    private static double cos(double d11) {
        return Math.cos((d11 * 3.141592653589793d) / 180.0d);
    }

    private double jdEphemerisDays(int i11) {
        double dJdMean = jdMean(i11);
        double d11 = (dJdMean - 2451545.0d) / 36525.0d;
        double d12 = (35999.373d * d11) - 2.47d;
        return dJdMean + ((periodic24(d11) * 1.0E-5d) / (((cos(d12) * 0.0334d) + 1.0d) + (cos(d12 * 2.0d) * 7.0E-4d)));
    }

    private double jdMean(int i11) {
        double d11;
        double d12;
        double d13;
        double d14;
        if (i11 < 1000) {
            double d15 = ((double) i11) / 1000.0d;
            int i12 = a.f94002a[ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    d13 = ((((((2.5E-4d * d15) + 0.00907d) * d15) - 0.05323d) * d15) + 365241.72562d) * d15;
                    d14 = 1721233.25401d;
                } else if (i12 == 3) {
                    d13 = ((((((7.4E-4d * d15) - 0.00297d) * d15) - 0.11677d) * d15) + 365242.49558d) * d15;
                    d14 = 1721325.70455d;
                } else {
                    if (i12 != 4) {
                        throw new AssertionError(this);
                    }
                    d11 = ((((((-0.00933d) - (6.0E-5d * d15)) * d15) - 0.00769d) * d15) + 365242.88257d) * d15;
                    d12 = 1721414.39987d;
                }
                return d13 + d14;
            }
            d11 = (((((0.00111d - (7.1E-4d * d15)) * d15) + 0.06134d) * d15) + 365242.1374d) * d15;
            d12 = 1721139.29189d;
            return d11 + d12;
        }
        double d16 = ((double) (i11 - 2000)) / 1000.0d;
        int i13 = a.f94002a[ordinal()];
        if (i13 == 1) {
            d11 = ((((((-0.00411d) - (5.7E-4d * d16)) * d16) + 0.05169d) * d16) + 365242.37404d) * d16;
            d12 = 2451623.80984d;
        } else {
            if (i13 != 2) {
                if (i13 == 3) {
                    d13 = ((((((7.8E-4d * d16) + 0.00337d) * d16) - 0.11575d) * d16) + 365242.01767d) * d16;
                    d14 = 2451810.21715d;
                } else {
                    if (i13 != 4) {
                        throw new AssertionError(this);
                    }
                    d13 = ((((((3.2E-4d * d16) - 0.00823d) * d16) - 0.06223d) * d16) + 365242.74049d) * d16;
                    d14 = 2451900.05952d;
                }
                return d13 + d14;
            }
            d11 = (((((0.00888d - (3.0E-4d * d16)) * d16) + 0.00325d) * d16) + 365241.62603d) * d16;
            d12 = 2451716.56767d;
        }
        return d11 + d12;
    }

    public static b of(b0 b0Var) {
        int iB = b0Var.t0(p.f94822k).b();
        checkYear(iB);
        b bVar = VERNAL_EQUINOX;
        if (b0Var.h0(bVar.inYear(iB))) {
            return WINTER_SOLSTICE;
        }
        b bVar2 = SUMMER_SOLSTICE;
        if (b0Var.h0(bVar2.inYear(iB))) {
            return bVar;
        }
        b bVar3 = AUTUMNAL_EQUINOX;
        if (b0Var.h0(bVar3.inYear(iB))) {
            return bVar2;
        }
        b bVar4 = WINTER_SOLSTICE;
        return b0Var.h0(bVar4.inYear(iB)) ? bVar3 : bVar4;
    }

    private static double periodic24(double d11) {
        double dCos = 0.0d;
        for (int i11 = 0; i11 < 24; i11++) {
            dCos += ((double) A[i11]) * cos(B[i11] + (C[i11] * d11));
        }
        return dCos;
    }

    public b0 inYear(int i11) {
        double dDeltaT;
        fp0.f fVar;
        checkYear(i11);
        double dJdEphemerisDays = (jdEphemerisDays(i11) - 2441317.5d) * 86400.0d;
        boolean zR = fp0.d.n().r();
        if (!zR || i11 < 1972) {
            dDeltaT = dJdEphemerisDays - fp0.f.deltaT(i11, (ordinal() + 1) * 3);
            fVar = fp0.f.UT;
        } else {
            dDeltaT = dJdEphemerisDays - 42.184d;
            fVar = fp0.f.UTC;
        }
        long jFloor = (long) Math.floor(dDeltaT);
        int i12 = (int) ((dDeltaT - jFloor) * 1.0E9d);
        if (!zR) {
            jFloor += 63072000;
            fVar = fp0.f.POSIX;
        }
        return b0.k0(jFloor, i12, fVar);
    }

    public c julianDay(int i11) {
        checkYear(i11);
        return c.g(jdEphemerisDays(i11));
    }

    public b onNorthernHemisphere() {
        return this;
    }

    public b onSouthernHemisphere() {
        return values()[(ordinal() + 2) % 4];
    }
}
