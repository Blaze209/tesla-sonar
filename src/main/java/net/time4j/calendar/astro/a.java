package net.time4j.calendar.astro;

/* JADX INFO: loaded from: classes9.dex */
class a {
    static int a(double d11) {
        long jDoubleToLongBits = Double.doubleToLongBits(d11);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    static double b(int i11) {
        return Math.pow(1.0d - ((((double) i11) * 0.0065d) / 288.15d), 4.255d);
    }

    static double c(double d11) {
        while (Double.compare(0.0d, d11) > 0) {
            d11 += 360.0d;
        }
        while (Double.compare(d11, 360.0d) >= 0) {
            d11 -= 360.0d;
        }
        return d11;
    }
}
