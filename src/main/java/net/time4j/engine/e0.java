package net.time4j.engine;

import net.time4j.engine.q;

/* JADX INFO: loaded from: classes9.dex */
public final class e0<T extends q<T>> implements u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p<?> f94122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f94123c;

    private e0(int i11, p<?> pVar) {
        this(i11, pVar, null);
    }

    private static <U, T extends i0<U, T>> T a(i0<U, T> i0Var, p<?> pVar, boolean z11) {
        U uE = i0Var.t().E(pVar);
        return z11 ? i0Var.H(1L, uE) : i0Var.G(1L, uE);
    }

    public static <T extends q<T>> u<T> c(p<?> pVar) {
        return new e0(4, pVar);
    }

    public static <T extends q<T>> u<T> d(p<?> pVar) {
        return new e0(3, pVar);
    }

    private <V> T e(q<T> qVar, p<V> pVar) {
        T t11 = (T) qVar.u();
        while (true) {
            pVar = (p<V>) t11.t().u(pVar).getChildAtCeiling(t11);
            if (pVar == null) {
                return t11;
            }
            t11 = (T) q(t11, pVar);
        }
    }

    public static <T extends q<T>> u<T> f(p<?> pVar) {
        return new e0(6, pVar);
    }

    private <V> T g(q<T> qVar, p<V> pVar) {
        T t11 = (T) qVar.u();
        while (true) {
            pVar = (p<V>) t11.t().u(pVar).getChildAtFloor(t11);
            if (pVar == null) {
                return t11;
            }
            t11 = (T) r(t11, pVar);
        }
    }

    public static <T extends q<T>> u<T> h(p<?> pVar) {
        return new e0(7, pVar);
    }

    private <V> T i(q<T> qVar, p<V> pVar) {
        return (T) qVar.B(pVar, qVar.o(pVar));
    }

    public static <T extends q<T>> u<T> j(p<?> pVar) {
        return new e0(2, pVar);
    }

    private <V> T k(q<T> qVar, p<V> pVar) {
        return (T) qVar.B(pVar, qVar.k(pVar));
    }

    public static <T extends q<T>> u<T> l(p<?> pVar) {
        return new e0(1, pVar);
    }

    private T m(T t11, boolean z11) {
        if (t11 instanceof i0) {
            return t11.t().p().cast(a((i0) i0.class.cast(t11), this.f94122b, z11));
        }
        throw new ChronoException("Base units not supported by: " + t11.t().p());
    }

    public static <T extends q<T>, V> u<T> n(V v11, p<V> pVar) {
        return new e0(0, pVar, v11);
    }

    public static <T extends q<T>, V> u<T> o(V v11, p<V> pVar) {
        return new e0(5, pVar, v11);
    }

    private <V> T p(q<T> qVar, p<V> pVar, Object obj, boolean z11) {
        q qVarU = qVar.u();
        return (T) qVarU.t().u(pVar).withValue(qVarU, pVar.getType().cast(obj), z11);
    }

    private <V> T q(T t11, p<V> pVar) {
        y<T, V> yVarU = t11.t().u(pVar);
        return yVarU.withValue(t11, yVarU.getMaximum(t11), pVar.isLenient());
    }

    private <V> T r(T t11, p<V> pVar) {
        y<T, V> yVarU = t11.t().u(pVar);
        return yVarU.withValue(t11, yVarU.getMinimum(t11), pVar.isLenient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.u
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T apply(T t11) {
        switch (this.f94121a) {
            case 0:
                return (T) p(t11, this.f94122b, this.f94123c, false);
            case 1:
                return (T) k(t11, this.f94122b);
            case 2:
                return (T) i(t11, this.f94122b);
            case 3:
                return (T) g(t11, this.f94122b);
            case 4:
                return (T) e(t11, this.f94122b);
            case 5:
                return (T) p(t11, this.f94122b, this.f94123c, true);
            case 6:
                return (T) m(t11, false);
            case 7:
                return (T) m(t11, true);
            default:
                throw new UnsupportedOperationException("Unknown mode: " + this.f94121a);
        }
    }

    private e0(int i11, p<?> pVar, Object obj) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        this.f94121a = i11;
        this.f94122b = pVar;
        this.f94123c = obj;
    }
}
