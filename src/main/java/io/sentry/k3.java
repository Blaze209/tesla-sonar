package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class k3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f80711a;

    private k3(Class<T> cls) {
        this.f80711a = cls;
    }

    public static <T> k3<T> a(Class<T> cls) {
        return new k3<>(cls);
    }

    public T b() {
        return this.f80711a.getDeclaredConstructor(null).newInstance(null);
    }
}
