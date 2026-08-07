package com.google.android.exoplayer2;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cr.q1 f40289a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f40293e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final cr.a f40296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ts.q f40297i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f40299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ss.z f40300l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private es.r f40298j = new es.r.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<com.google.android.exoplayer2.source.n, c> f40291c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f40292d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f40290b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f40294f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<c> f40295g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements com.google.android.exoplayer2.source.p, com.google.android.exoplayer2.drm.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f40301a;

        public a(c cVar) {
            this.f40301a = cVar;
        }

        private Pair<Integer, com.google.android.exoplayer2.source.o.b> T(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            com.google.android.exoplayer2.source.o.b bVar2 = null;
            if (bVar != null) {
                com.google.android.exoplayer2.source.o.b bVarN = q1.n(this.f40301a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(q1.s(this.f40301a, i11)), bVar2);
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void A(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f39960a;
                        Pair pair = pairT;
                        q1.this.f40296h.A(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void B(int i11, com.google.android.exoplayer2.source.o.b bVar, final int i12) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40128a;
                        Pair pair = pairT;
                        q1.this.f40296h.B(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, i12);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void C(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40121a;
                        Pair pair = pairT;
                        q1.this.f40296h.C(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, hVar, iVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void D(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40281a;
                        Pair pair = pairT;
                        q1.this.f40296h.D(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void E(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40285a;
                        Pair pair = pairT;
                        q1.this.f40296h.E(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void G(int i11, com.google.android.exoplayer2.source.o.b bVar, final Exception exc) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40091a;
                        Pair pair = pairT;
                        q1.this.f40296h.G(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void I(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40070a;
                        Pair pair = pairT;
                        q1.this.f40296h.I(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void n(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f39907a;
                        Pair pair = pairT;
                        q1.this.f40296h.n(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, hVar, iVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void u(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.m1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40133a;
                        Pair pair = pairT;
                        q1.this.f40296h.u(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, hVar, iVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void v(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.h hVar, final es.i iVar, final IOException iOException, final boolean z11) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40273a;
                        Pair pair = pairT;
                        q1.this.f40296h.v(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, hVar, iVar, iOException, z11);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void y(int i11, com.google.android.exoplayer2.source.o.b bVar, final es.i iVar) {
            final Pair<Integer, com.google.android.exoplayer2.source.o.b> pairT = T(i11, bVar);
            if (pairT != null) {
                q1.this.f40297i.g(new Runnable() { // from class: com.google.android.exoplayer2.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a aVar = this.f40003a;
                        Pair pair = pairT;
                        q1.this.f40296h.y(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.o.b) pair.second, iVar);
                    }
                });
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o f40303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o.c f40304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f40305c;

        public b(com.google.android.exoplayer2.source.o oVar, com.google.android.exoplayer2.source.o.c cVar, a aVar) {
            this.f40303a = oVar;
            this.f40304b = cVar;
            this.f40305c = aVar;
        }
    }

    static final class c implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.m f40306a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40310e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.google.android.exoplayer2.source.o.b> f40308c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f40307b = new Object();

        public c(com.google.android.exoplayer2.source.o oVar, boolean z11) {
            this.f40306a = new com.google.android.exoplayer2.source.m(oVar, z11);
        }

        @Override // com.google.android.exoplayer2.d1
        public Object a() {
            return this.f40307b;
        }

        @Override // com.google.android.exoplayer2.d1
        public f2 b() {
            return this.f40306a.T();
        }

        public void c(int i11) {
            this.f40309d = i11;
            this.f40310e = false;
            this.f40308c.clear();
        }
    }

    public interface d {
        void c();
    }

    public q1(d dVar, cr.a aVar, ts.q qVar, cr.q1 q1Var) {
        this.f40289a = q1Var;
        this.f40293e = dVar;
        this.f40296h = aVar;
        this.f40297i = qVar;
    }

    private void B(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            c cVarRemove = this.f40290b.remove(i13);
            this.f40292d.remove(cVarRemove.f40307b);
            g(i13, -cVarRemove.f40306a.T().t());
            cVarRemove.f40310e = true;
            if (this.f40299k) {
                u(cVarRemove);
            }
        }
    }

    private void g(int i11, int i12) {
        while (i11 < this.f40290b.size()) {
            this.f40290b.get(i11).f40309d += i12;
            i11++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f40294f.get(cVar);
        if (bVar != null) {
            bVar.f40303a.l(bVar.f40304b);
        }
    }

    private void k() {
        Iterator<c> it = this.f40295g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f40308c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f40295g.add(cVar);
        b bVar = this.f40294f.get(cVar);
        if (bVar != null) {
            bVar.f40303a.j(bVar.f40304b);
        }
    }

    private static Object m(Object obj) {
        return com.google.android.exoplayer2.a.z(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.source.o.b n(c cVar, com.google.android.exoplayer2.source.o.b bVar) {
        for (int i11 = 0; i11 < cVar.f40308c.size(); i11++) {
            if (cVar.f40308c.get(i11).f63160d == bVar.f63160d) {
                return bVar.c(p(cVar, bVar.f63157a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return com.google.android.exoplayer2.a.A(obj);
    }

    private static Object p(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.C(cVar.f40307b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i11) {
        return i11 + cVar.f40309d;
    }

    private void u(c cVar) {
        if (cVar.f40310e && cVar.f40308c.isEmpty()) {
            b bVar = (b) ts.a.e(this.f40294f.remove(cVar));
            bVar.f40303a.e(bVar.f40304b);
            bVar.f40303a.f(bVar.f40305c);
            bVar.f40303a.o(bVar.f40305c);
            this.f40295g.remove(cVar);
        }
    }

    private void x(c cVar) {
        com.google.android.exoplayer2.source.m mVar = cVar.f40306a;
        com.google.android.exoplayer2.source.o.c cVar2 = new com.google.android.exoplayer2.source.o.c() { // from class: com.google.android.exoplayer2.e1
            @Override // com.google.android.exoplayer2.source.o.c
            public final void a(com.google.android.exoplayer2.source.o oVar, f2 f2Var) {
                this.f39854a.f40293e.c();
            }
        };
        a aVar = new a(cVar);
        this.f40294f.put(cVar, new b(mVar, cVar2, aVar));
        mVar.h(ts.p0.x(), aVar);
        mVar.n(ts.p0.x(), aVar);
        mVar.k(cVar2, this.f40300l, this.f40289a);
    }

    public f2 A(int i11, int i12, es.r rVar) {
        ts.a.a(i11 >= 0 && i11 <= i12 && i12 <= r());
        this.f40298j = rVar;
        B(i11, i12);
        return i();
    }

    public f2 C(List<c> list, es.r rVar) {
        B(0, this.f40290b.size());
        return f(this.f40290b.size(), list, rVar);
    }

    public f2 D(es.r rVar) {
        int iR = r();
        if (rVar.getLength() != iR) {
            rVar = rVar.d().g(0, iR);
        }
        this.f40298j = rVar;
        return i();
    }

    public f2 f(int i11, List<c> list, es.r rVar) {
        if (!list.isEmpty()) {
            this.f40298j = rVar;
            for (int i12 = i11; i12 < list.size() + i11; i12++) {
                c cVar = list.get(i12 - i11);
                if (i12 > 0) {
                    c cVar2 = this.f40290b.get(i12 - 1);
                    cVar.c(cVar2.f40309d + cVar2.f40306a.T().t());
                } else {
                    cVar.c(0);
                }
                g(i12, cVar.f40306a.T().t());
                this.f40290b.add(i12, cVar);
                this.f40292d.put(cVar.f40307b, cVar);
                if (this.f40299k) {
                    x(cVar);
                    if (this.f40291c.isEmpty()) {
                        this.f40295g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public com.google.android.exoplayer2.source.n h(com.google.android.exoplayer2.source.o.b bVar, ss.b bVar2, long j11) {
        Object objO = o(bVar.f63157a);
        com.google.android.exoplayer2.source.o.b bVarC = bVar.c(m(bVar.f63157a));
        c cVar = (c) ts.a.e(this.f40292d.get(objO));
        l(cVar);
        cVar.f40308c.add(bVarC);
        com.google.android.exoplayer2.source.l lVarG = cVar.f40306a.g(bVarC, bVar2, j11);
        this.f40291c.put(lVarG, cVar);
        k();
        return lVarG;
    }

    public f2 i() {
        if (this.f40290b.isEmpty()) {
            return f2.f39911a;
        }
        int iT = 0;
        for (int i11 = 0; i11 < this.f40290b.size(); i11++) {
            c cVar = this.f40290b.get(i11);
            cVar.f40309d = iT;
            iT += cVar.f40306a.T().t();
        }
        return new x1(this.f40290b, this.f40298j);
    }

    public es.r q() {
        return this.f40298j;
    }

    public int r() {
        return this.f40290b.size();
    }

    public boolean t() {
        return this.f40299k;
    }

    public f2 v(int i11, int i12, int i13, es.r rVar) {
        ts.a.a(i11 >= 0 && i11 <= i12 && i12 <= r() && i13 >= 0);
        this.f40298j = rVar;
        if (i11 == i12 || i11 == i13) {
            return i();
        }
        int iMin = Math.min(i11, i13);
        int iMax = Math.max(((i12 - i11) + i13) - 1, i12 - 1);
        int iT = this.f40290b.get(iMin).f40309d;
        ts.p0.C0(this.f40290b, i11, i12, i13);
        while (iMin <= iMax) {
            c cVar = this.f40290b.get(iMin);
            cVar.f40309d = iT;
            iT += cVar.f40306a.T().t();
            iMin++;
        }
        return i();
    }

    public void w(ss.z zVar) {
        ts.a.g(!this.f40299k);
        this.f40300l = zVar;
        for (int i11 = 0; i11 < this.f40290b.size(); i11++) {
            c cVar = this.f40290b.get(i11);
            x(cVar);
            this.f40295g.add(cVar);
        }
        this.f40299k = true;
    }

    public void y() {
        for (b bVar : this.f40294f.values()) {
            try {
                bVar.f40303a.e(bVar.f40304b);
            } catch (RuntimeException e11) {
                ts.u.d("MediaSourceList", "Failed to release child source.", e11);
            }
            bVar.f40303a.f(bVar.f40305c);
            bVar.f40303a.o(bVar.f40305c);
        }
        this.f40294f.clear();
        this.f40295g.clear();
        this.f40299k = false;
    }

    public void z(com.google.android.exoplayer2.source.n nVar) {
        c cVar = (c) ts.a.e(this.f40291c.remove(nVar));
        cVar.f40306a.i(nVar);
        cVar.f40308c.remove(((com.google.android.exoplayer2.source.l) nVar).f40482a);
        if (!this.f40291c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
