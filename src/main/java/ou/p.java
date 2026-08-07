package ou;

/* JADX INFO: loaded from: classes5.dex */
public final class p {
    private static String a(int i11, int i12, String str) {
        if (i11 < 0) {
            return w.b("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return w.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    private static String b(int i11, int i12, String str) {
        if (i11 < 0) {
            return w.b("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return w.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    private static String c(int i11, int i12, int i13) {
        if (i11 < 0 || i11 > i13) {
            return b(i11, i13, "start index");
        }
        return (i12 < 0 || i12 > i13) ? b(i12, i13, "end index") : w.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public static void d(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(o.g(obj));
        }
    }

    public static void f(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(w.b(str, Character.valueOf(c11)));
        }
    }

    public static void g(boolean z11, String str, int i11) {
        if (!z11) {
            throw new IllegalArgumentException(w.b(str, Integer.valueOf(i11)));
        }
    }

    public static void h(boolean z11, String str, int i11, int i12) {
        if (!z11) {
            throw new IllegalArgumentException(w.b(str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static void i(boolean z11, String str, long j11) {
        if (!z11) {
            throw new IllegalArgumentException(w.b(str, Long.valueOf(j11)));
        }
    }

    public static void j(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(o.c(str, obj));
        }
    }

    public static int k(int i11, int i12) {
        return l(i11, i12, "index");
    }

    public static int l(int i11, int i12, String str) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(a(i11, i12, str));
        }
        return i11;
    }

    public static <T> T m(T t11) {
        t11.getClass();
        return t11;
    }

    public static <T> T n(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(o.g(obj));
    }

    public static int o(int i11, int i12) {
        return p(i11, i12, "index");
    }

    public static int p(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(b(i11, i12, str));
        }
        return i11;
    }

    public static void q(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException(c(i11, i12, i13));
        }
    }

    public static void r(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void s(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(o.g(obj));
        }
    }

    public static void t(boolean z11, String str, long j11) {
        if (!z11) {
            throw new IllegalStateException(w.b(str, Long.valueOf(j11)));
        }
    }

    public static void u(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalStateException(o.c(str, obj));
        }
    }
}
