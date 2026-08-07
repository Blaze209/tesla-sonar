package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
class d1<V> implements net.time4j.engine.s<b0, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<V> f94112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.tz.l f94113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final net.time4j.tz.p f94114c;

    d1(net.time4j.engine.p<V> pVar, net.time4j.tz.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Missing timezone.");
        }
        this.f94112a = pVar;
        this.f94113b = lVar;
        this.f94114c = null;
    }

    @Override // net.time4j.engine.s
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public V apply(b0 b0Var) {
        net.time4j.tz.p pVarB = this.f94114c;
        if (pVarB == null) {
            pVarB = this.f94113b.B(b0Var);
        }
        return (this.f94112a == h0.f94534y && b0Var.i0() && pVarB.i() == 0 && pVarB.h() % 60 == 0) ? this.f94112a.getType().cast(60) : (V) i0.R(b0Var, pVarB).s(this.f94112a);
    }

    d1(net.time4j.engine.p<V> pVar, net.time4j.tz.p pVar2) {
        if (pVar2 != null) {
            this.f94112a = pVar;
            this.f94113b = null;
            this.f94114c = pVar2;
            return;
        }
        throw new NullPointerException("Missing timezone offset.");
    }
}
