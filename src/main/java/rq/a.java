package rq;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class a<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f108690c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider<T> f108691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f108692b = f108690c;

    private a(Provider<T> provider) {
        this.f108691a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> a(P p11) {
        d.b(p11);
        return p11 instanceof a ? p11 : new a(p11);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f108690c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11;
        T t12 = (T) this.f108692b;
        Object obj = f108690c;
        if (t12 != obj) {
            return t12;
        }
        synchronized (this) {
            try {
                t11 = (T) this.f108692b;
                if (t11 == obj) {
                    t11 = this.f108691a.get();
                    this.f108692b = b(this.f108692b, t11);
                    this.f108691a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }
}
