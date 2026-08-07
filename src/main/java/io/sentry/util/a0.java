package io.sentry.util;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f81450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f81451b;

    static {
        try {
            f81450a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f81450a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f81451b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f81451b = false;
            }
        } catch (Throwable unused2) {
            f81451b = false;
        }
    }

    public static boolean a() {
        return f81450a;
    }

    public static boolean b() {
        return f81451b;
    }

    public static boolean c() {
        return !f81450a;
    }
}
