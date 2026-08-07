package net.time4j;

import net.time4j.engine.ChronoException;

/* JADX INFO: loaded from: classes9.dex */
public final class s<C> implements net.time4j.engine.o, net.time4j.engine.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.l<?> f94719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.m<?, ?> f94720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f94721c;

    private s(net.time4j.engine.l<?> lVar, net.time4j.engine.m<?, ?> mVar, h0 h0Var) {
        if (h0Var.c() != 24) {
            this.f94719a = lVar;
            this.f94720b = mVar;
            this.f94721c = h0Var;
        } else {
            if (lVar == null) {
                this.f94719a = null;
                this.f94720b = mVar.O(net.time4j.engine.h.c(1L));
            } else {
                this.f94719a = lVar.G(net.time4j.engine.h.c(1L));
                this.f94720b = null;
            }
            this.f94721c = h0.E0();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lnet/time4j/engine/l<TC;>;>(TC;Lnet/time4j/h0;)Lnet/time4j/s<TC;>; */
    public static s b(net.time4j.engine.l lVar, h0 h0Var) {
        if (lVar != null) {
            return new s(lVar, null, h0Var);
        }
        throw new NullPointerException("Missing date component.");
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lnet/time4j/engine/m<*TC;>;>(TC;Lnet/time4j/h0;)Lnet/time4j/s<TC;>; */
    public static s c(net.time4j.engine.m mVar, h0 h0Var) {
        if (mVar != null) {
            return new s(null, mVar, h0Var);
        }
        throw new NullPointerException("Missing date component.");
    }

    private net.time4j.engine.o e() {
        net.time4j.engine.l<?> lVar = this.f94719a;
        return lVar == null ? this.f94720b : lVar;
    }

    public b0 a(net.time4j.tz.l lVar, net.time4j.engine.d0 d0Var) {
        net.time4j.engine.l<?> lVar2 = this.f94719a;
        i0 i0VarN0 = lVar2 == null ? ((g0) this.f94720b.R(g0.class)).n0(this.f94721c) : ((g0) lVar2.I(g0.class)).n0(this.f94721c);
        int iIntValue = ((Integer) this.f94721c.s(h0.f94535z)).intValue() - d0Var.b(i0VarN0.S(), lVar.z());
        if (iIntValue >= 86400) {
            i0VarN0 = i0VarN0.G(1L, f.DAYS);
        } else if (iIntValue < 0) {
            i0VarN0 = i0VarN0.H(1L, f.DAYS);
        }
        return i0VarN0.V(lVar);
    }

    public C d() {
        C c11 = (C) this.f94719a;
        return c11 == null ? (C) this.f94720b : c11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) s.class.cast(obj);
            if (!this.f94721c.equals(sVar.f94721c)) {
                return false;
            }
            net.time4j.engine.l<?> lVar = this.f94719a;
            if (lVar == null) {
                return sVar.f94719a == null && this.f94720b.equals(sVar.f94720b);
            }
            if (sVar.f94720b == null && lVar.equals(sVar.f94719a)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.engine.o
    public net.time4j.tz.k g() {
        throw new ChronoException("Timezone not available: " + this);
    }

    public int hashCode() {
        net.time4j.engine.l<?> lVar = this.f94719a;
        return (lVar == null ? this.f94720b.hashCode() : lVar.hashCode()) + this.f94721c.hashCode();
    }

    @Override // net.time4j.engine.o
    public boolean j() {
        return false;
    }

    @Override // net.time4j.engine.o
    public <V> V k(net.time4j.engine.p<V> pVar) {
        return pVar.isDateElement() ? (V) e().k(pVar) : (V) this.f94721c.k(pVar);
    }

    @Override // net.time4j.engine.o
    public boolean n(net.time4j.engine.p<?> pVar) {
        return pVar.isDateElement() ? e().n(pVar) : this.f94721c.n(pVar);
    }

    @Override // net.time4j.engine.o
    public <V> V o(net.time4j.engine.p<V> pVar) {
        return pVar.isDateElement() ? (V) e().o(pVar) : (V) this.f94721c.o(pVar);
    }

    @Override // net.time4j.engine.o
    public int p(net.time4j.engine.p<Integer> pVar) {
        return pVar.isDateElement() ? e().p(pVar) : this.f94721c.p(pVar);
    }

    @Override // net.time4j.engine.o
    public <V> V s(net.time4j.engine.p<V> pVar) {
        return pVar.isDateElement() ? (V) e().s(pVar) : (V) this.f94721c.s(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        net.time4j.engine.l<?> lVar = this.f94719a;
        if (lVar == null) {
            sb2.append(this.f94720b);
        } else {
            sb2.append(lVar);
        }
        sb2.append(this.f94721c);
        return sb2.toString();
    }
}
