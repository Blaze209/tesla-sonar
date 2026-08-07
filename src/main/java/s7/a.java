package s7;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @Pure
    public static void a(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void b(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    public static int c(int i11, int i12, int i13) {
        if (i11 < i12 || i11 >= i13) {
            throw new IndexOutOfBoundsException();
        }
        return i11;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String e(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T f(T t11) {
        t11.getClass();
        return t11;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T g(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    public static void h(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void i(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T j(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T k(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
