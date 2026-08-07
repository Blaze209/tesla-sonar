package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.f2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class c<T> extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f40398h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f40399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ss.z f40400j;

    private final class a implements p, com.google.android.exoplayer2.drm.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f40401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.a f40402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.i.a f40403c;

        public a(T t11) {
            this.f40402b = c.this.s(null);
            this.f40403c = c.this.q(null);
            this.f40401a = t11;
        }

        private es.i J(es.i iVar) {
            long jC = c.this.C(this.f40401a, iVar.f63155f);
            long jC2 = c.this.C(this.f40401a, iVar.f63156g);
            return (jC == iVar.f63155f && jC2 == iVar.f63156g) ? iVar : new es.i(iVar.f63150a, iVar.f63151b, iVar.f63152c, iVar.f63153d, iVar.f63154e, jC, jC2);
        }

        private boolean q(int i11, o.b bVar) {
            o.b bVarB;
            if (bVar != null) {
                bVarB = c.this.B(this.f40401a, bVar);
                if (bVarB == null) {
                    return false;
                }
            } else {
                bVarB = null;
            }
            int iD = c.this.D(this.f40401a, i11);
            p.a aVar = this.f40402b;
            if (aVar.f40504a != iD || !p0.c(aVar.f40505b, bVarB)) {
                this.f40402b = c.this.r(iD, bVarB);
            }
            com.google.android.exoplayer2.drm.i.a aVar2 = this.f40403c;
            if (aVar2.f39829a == iD && p0.c(aVar2.f39830b, bVarB)) {
                return true;
            }
            this.f40403c = c.this.p(iD, bVarB);
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void A(int i11, o.b bVar) {
            if (q(i11, bVar)) {
                this.f40403c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void B(int i11, o.b bVar, int i12) {
            if (q(i11, bVar)) {
                this.f40403c.k(i12);
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void C(int i11, o.b bVar, es.h hVar, es.i iVar) {
            if (q(i11, bVar)) {
                this.f40402b.p(hVar, J(iVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void D(int i11, o.b bVar) {
            if (q(i11, bVar)) {
                this.f40403c.j();
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void E(int i11, o.b bVar) {
            if (q(i11, bVar)) {
                this.f40403c.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void G(int i11, o.b bVar, Exception exc) {
            if (q(i11, bVar)) {
                this.f40403c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void I(int i11, o.b bVar) {
            if (q(i11, bVar)) {
                this.f40403c.m();
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void n(int i11, o.b bVar, es.h hVar, es.i iVar) {
            if (q(i11, bVar)) {
                this.f40402b.l(hVar, J(iVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void u(int i11, o.b bVar, es.h hVar, es.i iVar) {
            if (q(i11, bVar)) {
                this.f40402b.j(hVar, J(iVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void v(int i11, o.b bVar, es.h hVar, es.i iVar, IOException iOException, boolean z11) {
            if (q(i11, bVar)) {
                this.f40402b.n(hVar, J(iVar), iOException, z11);
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void y(int i11, o.b bVar, es.i iVar) {
            if (q(i11, bVar)) {
                this.f40402b.h(J(iVar));
            }
        }
    }

    private static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f40405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o.c f40406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>.a f40407c;

        public b(o oVar, o.c cVar, c<T>.a aVar) {
            this.f40405a = oVar;
            this.f40406b = cVar;
            this.f40407c = aVar;
        }
    }

    protected c() {
    }

    protected abstract o.b B(T t11, o.b bVar);

    protected long C(T t11, long j11) {
        return j11;
    }

    protected int D(T t11, int i11) {
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void E(T t11, o oVar, f2 f2Var);

    protected final void F(final T t11, o oVar) {
        ts.a.a(!this.f40398h.containsKey(t11));
        o.c cVar = new o.c() { // from class: es.b
            @Override // com.google.android.exoplayer2.source.o.c
            public final void a(com.google.android.exoplayer2.source.o oVar2, f2 f2Var) {
                this.f63138a.E(t11, oVar2, f2Var);
            }
        };
        a aVar = new a(t11);
        this.f40398h.put(t11, new b<>(oVar, cVar, aVar));
        oVar.h((Handler) ts.a.e(this.f40399i), aVar);
        oVar.n((Handler) ts.a.e(this.f40399i), aVar);
        oVar.k(cVar, this.f40400j, v());
        if (w()) {
            return;
        }
        oVar.l(cVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void b() {
        Iterator<b<T>> it = this.f40398h.values().iterator();
        while (it.hasNext()) {
            it.next().f40405a.b();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void t() {
        for (b<T> bVar : this.f40398h.values()) {
            bVar.f40405a.l(bVar.f40406b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void u() {
        for (b<T> bVar : this.f40398h.values()) {
            bVar.f40405a.j(bVar.f40406b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void x(ss.z zVar) {
        this.f40400j = zVar;
        this.f40399i = p0.v();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void z() {
        for (b<T> bVar : this.f40398h.values()) {
            bVar.f40405a.e(bVar.f40406b);
            bVar.f40405a.f(bVar.f40407c);
            bVar.f40405a.o(bVar.f40407c);
        }
        this.f40398h.clear();
    }
}
