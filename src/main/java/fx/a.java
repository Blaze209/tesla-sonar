package fx;

/* JADX INFO: loaded from: classes5.dex */
class a {
    static double a(double d11) {
        return Math.asin(Math.sqrt(d11)) * 2.0d;
    }

    static double b(double d11) {
        double dSin = Math.sin(d11 * 0.5d);
        return dSin * dSin;
    }

    static double c(double d11, double d12, double d13) {
        return b(d11 - d12) + (b(d13) * Math.cos(d11) * Math.cos(d12));
    }
}
