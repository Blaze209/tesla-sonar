package fp0;

/* JADX INFO: loaded from: classes9.dex */
public enum f {
    POSIX,
    UTC,
    TAI,
    GPS,
    TT,
    UT;

    public static double deltaT(int i11, int i12) {
        if (i12 >= 1 && i12 <= 12) {
            return deltaT(i11, ((double) i11) + ((((double) i12) - 0.5d) / 12.0d));
        }
        throw new IllegalArgumentException("Month out of range: " + i12);
    }

    public static double deltaT(net.time4j.base.a aVar) {
        int iB = aVar.b();
        int i11 = net.time4j.base.b.e(iB) ? 366 : 365;
        int iR = aVar.r();
        int i12 = 1;
        int iD = 0;
        for (int i13 = 1; i13 < iR; i13++) {
            iD += net.time4j.base.b.d(iB, i13);
        }
        int iF = iD + aVar.f();
        if (iF <= i11) {
            if (iB == -2001 && iF == 365) {
                iB = -2000;
            } else {
                i12 = iF;
            }
            return deltaT(iB, ((double) iB) + ((((double) i12) - 1.0d) / ((double) i11)));
        }
        throw new IllegalArgumentException(aVar.toString());
    }

    private static double deltaT(int i11, double d11) {
        double d12;
        double d13;
        if (i11 < -2000 || i11 > 3000) {
            throw new IllegalArgumentException("Year out of range: " + i11);
        }
        if (i11 <= 2050) {
            if (i11 >= 2018) {
                double d14 = d11 - 2000.0d;
                d12 = ((0.012125d * d14) + 0.0533d) * d14;
                d13 = 64.16d;
            } else if (i11 >= 2005) {
                double d15 = d11 - 2000.0d;
                d12 = ((((((4.2060317E-5d * d15) - 0.00112745d) * d15) + 0.014201d) * d15) + 0.171417d) * d15;
                d13 = 63.5934d;
            } else if (i11 >= 1986) {
                double d16 = d11 - 2000.0d;
                d12 = ((((((((2.373599E-5d * d16) + 6.51814E-4d) * d16) + 0.0017275d) * d16) - 0.060374d) * d16) + 0.3345d) * d16;
                d13 = 63.86d;
            } else {
                if (i11 >= 1961) {
                    double d17 = d11 - 1975.0d;
                    return ((((0.0d - (d17 / 718.0d)) * d17) + 1.067d) * d17) + 45.45d;
                }
                if (i11 >= 1941) {
                    double d18 = d11 - 1950.0d;
                    d12 = ((((d18 / 2547.0d) + 0.0d) * d18) + 0.407d) * d18;
                    d13 = 29.07d;
                } else if (i11 >= 1920) {
                    double d19 = d11 - 1920.0d;
                    d12 = ((((0.0020936d * d19) - 0.0761d) * d19) + 0.84493d) * d19;
                    d13 = 21.2d;
                } else {
                    if (i11 >= 1900) {
                        double d21 = d11 - 1900.0d;
                        return ((((((0.0061966d - (1.97E-4d * d21)) * d21) - 0.0598939d) * d21) + 1.494119d) * d21) - 2.79d;
                    }
                    if (i11 >= 1860) {
                        double d22 = d11 - 1860.0d;
                        d12 = ((((((((d22 / 233174.0d) - 4.473624E-4d) * d22) + 0.01680668d) * d22) - 0.251754d) * d22) + 0.5737d) * d22;
                        d13 = 7.62d;
                    } else if (i11 >= 1800) {
                        double d23 = d11 - 1800.0d;
                        d12 = ((((((((((((8.75E-10d * d23) - 1.699E-7d) * d23) + 1.21272E-5d) * d23) - 3.7436E-4d) * d23) + 0.0041116d) * d23) + 0.0068612d) * d23) - 0.332447d) * d23;
                        d13 = 13.72d;
                    } else if (i11 >= 1700) {
                        double d24 = d11 - 1700.0d;
                        d12 = ((((((d24 / 1174000.0d) + 1.3336E-4d) * d24) - 0.0059285d) * d24) + 0.1603d) * d24;
                        d13 = 8.83d;
                    } else if (i11 >= 1600) {
                        double d25 = d11 - 1600.0d;
                        d12 = ((((d25 / 7129.0d) - 0.01532d) * d25) - 0.9808d) * d25;
                        d13 = 120.0d;
                    } else if (i11 >= 500) {
                        double d26 = (d11 - 1000.0d) / 100.0d;
                        d12 = ((((((((((0.0083572073d * d26) - 0.005050998d) * d26) - 0.8503463d) * d26) + 0.319781d) * d26) + 71.23472d) * d26) - 556.01d) * d26;
                        d13 = 1574.2d;
                    } else if (i11 >= -500) {
                        double d27 = d11 / 100.0d;
                        d12 = ((((((((((0.0090316521d * d27) + 0.022174192d) * d27) - 0.1798452d) * d27) - 5.952053d) * d27) + 33.78311d) * d27) - 1014.41d) * d27;
                        d13 = 10583.6d;
                    }
                }
            }
            return d12 + d13;
        }
        double d28 = (d11 - 1820.0d) / 100.0d;
        return ((32.0d * d28) * d28) - 20.0d;
    }
}
