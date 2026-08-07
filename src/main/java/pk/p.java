package pk;

/* JADX INFO: loaded from: classes3.dex */
public final class p {
    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static RuntimeException a(Throwable th2) throws X {
        c((Throwable) k.g(th2));
        throw new RuntimeException(th2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void b(Throwable th2, Class<X> cls) throws X {
        if (th2 != null && cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void c(Throwable th2) throws X {
        b(th2, Error.class);
        b(th2, RuntimeException.class);
    }
}
