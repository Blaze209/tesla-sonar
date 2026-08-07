package yu;

/* JADX INFO: loaded from: classes5.dex */
public final class z {
    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t11) {
        t11.getClass();
        return t11;
    }

    public static <T> T c(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z11, String str) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }
}
