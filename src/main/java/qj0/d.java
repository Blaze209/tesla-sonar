package qj0;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes8.dex */
public final class d<T> implements i<T>, pj0.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f105602c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile i<T> f105603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f105604b = f105602c;

    private d(i<T> iVar) {
        this.f105603a = iVar;
    }

    private synchronized Object a() {
        Object obj;
        obj = this.f105604b;
        if (obj == f105602c) {
            obj = this.f105603a.get();
            this.f105604b = f(this.f105604b, obj);
            this.f105603a = null;
        }
        return obj;
    }

    public static <P extends Provider<T>, T> pj0.a<T> b(P p11) {
        return c(j.a(p11));
    }

    public static <T> pj0.a<T> c(i<T> iVar) {
        return iVar instanceof pj0.a ? (pj0.a) iVar : new d((i) h.b(iVar));
    }

    @Deprecated
    public static <P extends Provider<T>, T> Provider<T> d(P p11) {
        return e(j.a(p11));
    }

    public static <T> i<T> e(i<T> iVar) {
        h.b(iVar);
        return iVar instanceof d ? iVar : new d(iVar);
    }

    private static Object f(Object obj, Object obj2) {
        if (obj == f105602c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11 = (T) this.f105604b;
        return t11 == f105602c ? (T) a() : t11;
    }
}
