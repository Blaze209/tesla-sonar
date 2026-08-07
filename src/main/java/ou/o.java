package ou;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f100015a = d();

    private static final class b implements n {
        private b() {
        }
    }

    static String a(String str) {
        if (f(str)) {
            return null;
        }
        return str;
    }

    static String b(double d11) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d11));
    }

    static String c(String str, Object... objArr) {
        return w.b(str, objArr);
    }

    private static n d() {
        return new b();
    }

    static String e(String str) {
        return str == null ? "" : str;
    }

    static boolean f(String str) {
        return str == null || str.isEmpty();
    }

    static String g(Object obj) {
        return String.valueOf(obj);
    }
}
