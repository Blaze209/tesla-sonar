package net.time4j.engine;

import java.io.Serializable;
import net.time4j.engine.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l<D extends l<D>> extends q<D> implements g, m0, Comparable<D>, Serializable {
    private <T> T H(k<T> kVar, String str) {
        long jH = h();
        if (kVar.c() <= jH && kVar.a() >= jH) {
            return kVar.b(jH);
        }
        throw new ArithmeticException("Cannot transform <" + jH + "> to: " + str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int compareTo(D d11) {
        long jH = h();
        long jH2 = d11.h();
        if (jH < jH2) {
            return -1;
        }
        if (jH > jH2) {
            return 1;
        }
        return q().compareTo(d11.q());
    }

    protected k<D> E() {
        return (k<D>) t().o(q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract j<D> t();

    public D G(h hVar) {
        long jF = net.time4j.base.c.f(h(), hVar.b());
        try {
            return E().b(jF);
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + jF);
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public <T extends m<?, T>> T I(Class<T> cls) {
        String name = cls.getName();
        w wVarX = w.x(cls);
        if (wVarX != null) {
            return (T) H(wVarX.n(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    public abstract boolean equals(Object obj);

    @Override // net.time4j.engine.g
    public long h() {
        return E().transform(u());
    }

    public abstract int hashCode();

    @Override // net.time4j.engine.q
    <V> y<D, V> w(p<V> pVar) {
        return pVar instanceof z ? ((z) z.class.cast(pVar)).derive(E()) : super.w(pVar);
    }
}
