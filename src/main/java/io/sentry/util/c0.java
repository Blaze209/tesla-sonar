package io.sentry.util;

import io.sentry.y8;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {
    public static y8 a(y8 y8Var) {
        if (y8Var.c() != null) {
            return y8Var;
        }
        return new y8(y8Var.e(), y8Var.d(), b(null, y8Var.d(), y8Var.e()), y8Var.b(), y8Var.a());
    }

    public static Double b(Double d11, Double d12, Boolean bool) {
        if (d11 != null) {
            return d11;
        }
        double dC = d0.a().c();
        if (d12 == null || bool == null) {
            return Double.valueOf(dC);
        }
        return bool.booleanValue() ? Double.valueOf(dC * d12.doubleValue()) : Double.valueOf(d12.doubleValue() + (dC * (1.0d - d12.doubleValue())));
    }

    public static boolean c(Double d11) {
        return e(d11, true);
    }

    public static boolean d(Double d11) {
        return e(d11, true);
    }

    private static boolean e(Double d11, boolean z11) {
        if (d11 == null) {
            return z11;
        }
        return !d11.isNaN() && d11.doubleValue() >= 0.0d && d11.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d11) {
        return e(d11, true);
    }

    public static boolean g(Double d11) {
        return h(d11, true);
    }

    public static boolean h(Double d11, boolean z11) {
        return e(d11, z11);
    }
}
