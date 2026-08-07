package qj0;

/* JADX INFO: loaded from: classes8.dex */
public final class f<T> implements e<T>, pj0.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f<Object> f105605b = new f<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f105606a;

    private f(T t11) {
        this.f105606a = t11;
    }

    public static <T> e<T> a(T t11) {
        return new f(h.c(t11, "instance cannot be null"));
    }

    public static <T> e<T> b(T t11) {
        return t11 == null ? c() : new f(t11);
    }

    private static <T> f<T> c() {
        return (f<T>) f105605b;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f105606a;
    }
}
