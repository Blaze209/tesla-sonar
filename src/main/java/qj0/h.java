package qj0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static <T> void a(T t11, Class<T> cls) {
        if (t11 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
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

    public static <T> T d(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
