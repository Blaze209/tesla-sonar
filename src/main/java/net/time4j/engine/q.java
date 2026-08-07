package net.time4j.engine;

import java.util.Set;
import net.time4j.engine.q;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q<T extends q<T>> implements o {
    /* JADX WARN: Multi-variable type inference failed */
    public T A(p<Long> pVar, long j11) {
        return (T) B(pVar, Long.valueOf(j11));
    }

    public <V> T B(p<V> pVar, V v11) {
        return (T) w(pVar).withValue(u(), v11, pVar.isLenient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T C(u<T> uVar) {
        return (T) uVar.apply(u());
    }

    @Override // net.time4j.engine.o
    public net.time4j.tz.k g() {
        throw new ChronoException("Timezone not available: " + this);
    }

    @Override // net.time4j.engine.o
    public boolean j() {
        return false;
    }

    @Override // net.time4j.engine.o
    public <V> V k(p<V> pVar) {
        return (V) w(pVar).getMinimum(u());
    }

    @Override // net.time4j.engine.o
    public boolean n(p<?> pVar) {
        return t().w(pVar);
    }

    @Override // net.time4j.engine.o
    public <V> V o(p<V> pVar) {
        return (V) w(pVar).getMaximum(u());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.o
    public int p(p<Integer> pVar) {
        b0<T> b0VarS = t().s(pVar);
        try {
            return b0VarS == null ? ((Integer) s(pVar)).intValue() : b0VarS.b(u());
        } catch (ChronoException unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // net.time4j.engine.o
    public <V> V s(p<V> pVar) {
        return (V) w(pVar).getValue(u());
    }

    protected abstract w<T> t();

    protected T u() {
        w<T> wVarT = t();
        Class<T> clsP = wVarT.p();
        if (clsP.isInstance(this)) {
            return clsP.cast(this);
        }
        for (p<?> pVar : wVarT.t()) {
            if (clsP == pVar.getType()) {
                return clsP.cast(s(pVar));
            }
        }
        throw new IllegalStateException("Implementation error: Cannot find entity context.");
    }

    public Set<p<?>> v() {
        return t().t();
    }

    <V> y<T, V> w(p<V> pVar) {
        return t().u(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean x(p<Long> pVar, long j11) {
        return y(pVar, Long.valueOf(j11));
    }

    public <V> boolean y(p<V> pVar, V v11) {
        if (pVar != null) {
            return n(pVar) && w(pVar).isValid(u(), v11);
        }
        throw new NullPointerException("Missing chronological element.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T z(p<Integer> pVar, int i11) {
        b0<T> b0VarS = t().s(pVar);
        return b0VarS != null ? (T) b0VarS.a(u(), i11, pVar.isLenient()) : (T) B(pVar, Integer.valueOf(i11));
    }
}
