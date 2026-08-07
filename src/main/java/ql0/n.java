package ql0;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sq0.u;
import sq0.v;
import sq0.w;
import sq0.x;

/* JADX INFO: loaded from: classes8.dex */
class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f105667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f105668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f105669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends sq0.r>, l.c<? extends sq0.r>> f105670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l.a f105671e;

    static class a implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<? extends sq0.r>, l.c<? extends sq0.r>> f105672a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l.a f105673b;

        a() {
        }

        @Override // ql0.l.b
        @NonNull
        public l a(@NonNull g gVar, @NonNull q qVar) {
            l.a bVar = this.f105673b;
            if (bVar == null) {
                bVar = new b();
            }
            return new n(gVar, qVar, new t(), Collections.unmodifiableMap(this.f105672a), bVar);
        }

        @Override // ql0.l.b
        @NonNull
        public <N extends sq0.r> l.b b(@NonNull Class<N> cls, l.c<? super N> cVar) {
            if (cVar == null) {
                this.f105672a.remove(cls);
                return this;
            }
            this.f105672a.put(cls, cVar);
            return this;
        }
    }

    n(@NonNull g gVar, @NonNull q qVar, @NonNull t tVar, @NonNull Map<Class<? extends sq0.r>, l.c<? extends sq0.r>> map, @NonNull l.a aVar) {
        this.f105667a = gVar;
        this.f105668b = qVar;
        this.f105669c = tVar;
        this.f105670d = map;
        this.f105671e = aVar;
    }

    private void G(@NonNull sq0.r rVar) {
        l.c<? extends sq0.r> cVar = this.f105670d.get(rVar.getClass());
        if (cVar != null) {
            cVar.a(this, rVar);
        } else {
            i(rVar);
        }
    }

    @Override // sq0.y
    public void A(sq0.g gVar) {
        G(gVar);
    }

    @Override // ql0.l
    public void B() {
        this.f105669c.append('\n');
    }

    @Override // sq0.y
    public void C(x xVar) {
        G(xVar);
    }

    @Override // sq0.y
    public void D(sq0.j jVar) {
        G(jVar);
    }

    @Override // sq0.y
    public void E(w wVar) {
        G(wVar);
    }

    public <N extends sq0.r> void F(@NonNull Class<N> cls, int i11) {
        s sVarA = this.f105667a.c().a(cls);
        if (sVarA != null) {
            b(i11, sVarA.a(this.f105667a, this.f105668b));
        }
    }

    @Override // sq0.y
    public void a(sq0.e eVar) {
        G(eVar);
    }

    @Override // ql0.l
    public void b(int i11, Object obj) {
        t tVar = this.f105669c;
        t.j(tVar, obj, i11, tVar.length());
    }

    @Override // ql0.l
    @NonNull
    public t builder() {
        return this.f105669c;
    }

    @Override // ql0.l
    public void c(@NonNull sq0.r rVar) {
        this.f105671e.a(this, rVar);
    }

    @Override // sq0.y
    public void d(sq0.q qVar) {
        G(qVar);
    }

    @Override // ql0.l
    public <N extends sq0.r> void e(@NonNull N n11, int i11) {
        F(n11.getClass(), i11);
    }

    @Override // sq0.y
    public void f(sq0.n nVar) {
        G(nVar);
    }

    @Override // sq0.y
    public void g(sq0.d dVar) {
        G(dVar);
    }

    @Override // ql0.l
    @NonNull
    public q h() {
        return this.f105668b;
    }

    @Override // ql0.l
    public void i(@NonNull sq0.r rVar) {
        sq0.r rVarC = rVar.c();
        while (rVarC != null) {
            sq0.r rVarE = rVarC.e();
            rVarC.a(this);
            rVarC = rVarE;
        }
    }

    @Override // sq0.y
    public void j(sq0.f fVar) {
        G(fVar);
    }

    @Override // sq0.y
    public void k(sq0.k kVar) {
        G(kVar);
    }

    @Override // ql0.l
    @NonNull
    public g l() {
        return this.f105667a;
    }

    @Override // ql0.l
    public int length() {
        return this.f105669c.length();
    }

    @Override // ql0.l
    public boolean m(@NonNull sq0.r rVar) {
        return rVar.e() != null;
    }

    @Override // sq0.y
    public void n(v vVar) {
        G(vVar);
    }

    @Override // sq0.y
    public void o(sq0.t tVar) {
        G(tVar);
    }

    @Override // ql0.l
    public void p() {
        if (this.f105669c.length() <= 0 || '\n' == this.f105669c.h()) {
            return;
        }
        this.f105669c.append('\n');
    }

    @Override // sq0.y
    public void q(sq0.m mVar) {
        G(mVar);
    }

    @Override // sq0.y
    public void r(sq0.l lVar) {
        G(lVar);
    }

    @Override // ql0.l
    public void s(@NonNull sq0.r rVar) {
        this.f105671e.b(this, rVar);
    }

    @Override // sq0.y
    public void t(sq0.h hVar) {
        G(hVar);
    }

    @Override // sq0.y
    public void u(sq0.b bVar) {
        G(bVar);
    }

    @Override // sq0.y
    public void v(sq0.o oVar) {
        G(oVar);
    }

    @Override // sq0.y
    public void w(sq0.i iVar) {
        G(iVar);
    }

    @Override // sq0.y
    public void x(sq0.s sVar) {
        G(sVar);
    }

    @Override // sq0.y
    public void y(u uVar) {
        G(uVar);
    }

    @Override // sq0.y
    public void z(sq0.c cVar) {
        G(cVar);
    }
}
