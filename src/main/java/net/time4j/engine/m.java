package net.time4j.engine;

import net.time4j.engine.m;

/* JADX INFO: loaded from: classes9.dex */
public abstract class m<U, D extends m<U, D>> extends i0<U, D> implements g {
    private k<D> L() {
        return (k<D>) t().n();
    }

    private <T> T P(k<T> kVar, String str) {
        long jH = h();
        if (kVar.c() <= jH && kVar.a() >= jH) {
            return kVar.b(jH);
        }
        throw new ArithmeticException("Cannot transform <" + jH + "> to: " + str);
    }

    protected int J(g gVar) {
        long jH = h();
        long jH2 = gVar.h();
        if (jH < jH2) {
            return -1;
        }
        return jH == jH2 ? 0 : 1;
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public int compareTo(D d11) {
        if (t().p() == d11.t().p()) {
            return J(d11);
        }
        throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
    }

    public boolean M(g gVar) {
        return J(gVar) > 0;
    }

    public boolean N(g gVar) {
        return J(gVar) < 0;
    }

    public D O(h hVar) {
        long jF = net.time4j.base.c.f(h(), hVar.b());
        try {
            return L().b(jF);
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + jF);
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public <T extends l<T>> T Q(Class<T> cls, String str) {
        String name = cls.getName();
        w wVarX = w.x(cls);
        if (wVarX != null) {
            return (T) P(wVarX.o(str), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    public <T extends m<?, T>> T R(Class<T> cls) {
        String name = cls.getName();
        w wVarX = w.x(cls);
        if (wVarX != null) {
            return (T) P(wVarX.n(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (t().p() == mVar.t().p() && h() == mVar.h()) {
                return true;
            }
        }
        return false;
    }

    public long h() {
        return L().transform(u());
    }

    public int hashCode() {
        long jH = h();
        return (int) (jH ^ (jH >>> 32));
    }
}
