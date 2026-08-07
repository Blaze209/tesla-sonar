package ou;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f<T> {

    static final class a extends f<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f100004a = new a();

        a() {
        }

        @Override // ou.f
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // ou.f
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    static final class b extends f<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f100005a = new b();

        b() {
        }

        @Override // ou.f
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // ou.f
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected f() {
    }

    public static f<Object> c() {
        return a.f100004a;
    }

    public static f<Object> f() {
        return b.f100005a;
    }

    protected abstract boolean a(T t11, T t12);

    protected abstract int b(T t11);

    public final boolean d(T t11, T t12) {
        if (t11 == t12) {
            return true;
        }
        if (t11 == null || t12 == null) {
            return false;
        }
        return a(t11, t12);
    }

    public final int e(T t11) {
        if (t11 == null) {
            return 0;
        }
        return b(t11);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
