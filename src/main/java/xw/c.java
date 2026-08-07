package xw;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T> implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<Object> f124041b = new c<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f124042a;

    private c(T t11) {
        this.f124042a = t11;
    }

    public static <T> b<T> a(T t11) {
        return new c(d.c(t11, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f124042a;
    }
}
