package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import net.time4j.format.expert.t;

/* JADX INFO: loaded from: classes9.dex */
abstract class t<T extends t<T>> extends net.time4j.engine.q<T> {
    t() {
    }

    abstract <E> E D();

    abstract void E(net.time4j.engine.p<?> pVar, int i11);

    abstract void F(net.time4j.engine.p<?> pVar, Object obj);

    abstract void G(Object obj);

    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public T z(net.time4j.engine.p<Integer> pVar, int i11) {
        E(pVar, i11);
        return this;
    }

    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public <V> T B(net.time4j.engine.p<V> pVar, V v11) {
        F(pVar, v11);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        Set<net.time4j.engine.p<?>> setV = v();
        Set<net.time4j.engine.p<?>> setV2 = tVar.v();
        if (setV.size() != setV2.size()) {
            return false;
        }
        for (net.time4j.engine.p<?> pVar : setV) {
            if (!setV2.contains(pVar) || !s(pVar).equals(tVar.s(pVar))) {
                return false;
            }
        }
        Object objD = D();
        Object objD2 = tVar.D();
        if (objD == null) {
            return objD2 == null;
        }
        return objD.equals(objD2);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public final net.time4j.tz.k g() {
        Object objS;
        b0 b0Var = b0.TIMEZONE_ID;
        if (n(b0Var)) {
            objS = s(b0Var);
        } else {
            b0 b0Var2 = b0.TIMEZONE_OFFSET;
            objS = n(b0Var2) ? s(b0Var2) : null;
        }
        return objS instanceof net.time4j.tz.k ? (net.time4j.tz.k) net.time4j.tz.k.class.cast(objS) : super.g();
    }

    public final int hashCode() {
        int iHashCode = v().hashCode();
        Object objD = D();
        return objD != null ? iHashCode + (objD.hashCode() * 31) : iHashCode;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public final boolean j() {
        return n(b0.TIMEZONE_ID) || n(b0.TIMEZONE_OFFSET);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V k(net.time4j.engine.p<V> pVar) {
        return pVar.getDefaultMinimum();
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V o(net.time4j.engine.p<V> pVar) {
        return pVar.getDefaultMaximum();
    }

    @Override // net.time4j.engine.q
    protected final net.time4j.engine.w<T> t() {
        throw new UnsupportedOperationException("Parsed values do not have any chronology.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (net.time4j.engine.p<?> pVar : v()) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(s(pVar));
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        Object objD = D();
        if (objD != null) {
            sb2.append(">>>result=");
            sb2.append(objD);
        }
        return sb2.toString();
    }

    @Override // net.time4j.engine.q
    public <V> boolean y(net.time4j.engine.p<V> pVar, V v11) {
        if (pVar != null) {
            return true;
        }
        throw new NullPointerException("Missing chronological element.");
    }
}
