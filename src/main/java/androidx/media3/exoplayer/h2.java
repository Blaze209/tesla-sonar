package androidx.media3.exoplayer;

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

/* JADX INFO: loaded from: classes.dex */
final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a8.o2 f9878a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f9882e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a8.a f9885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s7.p f9886i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v7.q f9889l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n8.t f9887j = new n8.t.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<androidx.media3.exoplayer.source.q, c> f9880c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f9881d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f9879b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f9883f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<c> f9884g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements androidx.media3.exoplayer.source.s, androidx.media3.exoplayer.drm.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f9890a;

        public a(c cVar) {
            this.f9890a = cVar;
        }

        private Pair<Integer, androidx.media3.exoplayer.source.r.b> S(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            androidx.media3.exoplayer.source.r.b bVar2 = null;
            if (bVar != null) {
                androidx.media3.exoplayer.source.r.b bVarN = h2.n(this.f9890a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(h2.s(this.f9890a, i11)), bVar2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void I(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f11404a;
                        Pair pair = pairS;
                        h2.this.f9885h.I(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void L(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f11174a;
                        Pair pair = pairS;
                        h2.this.f9885h.L(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) s7.a.f((androidx.media3.exoplayer.source.r.b) pair.second), jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final int i12) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9825a;
                        Pair pair = pairS;
                        h2.this.f9885h.M(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar, i12);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void N(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9540a;
                        Pair pair = pairS;
                        h2.this.f9885h.N(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void O(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar, final IOException iOException, final boolean z11) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.f2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9834a;
                        Pair pair = pairS;
                        h2.this.f9885h.O(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar, iOException, z11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void T(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.i iVar, final n8.j jVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9548a;
                        Pair pair = pairS;
                        h2.this.f9885h.T(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void W(int i11, androidx.media3.exoplayer.source.r.b bVar, final int i12) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9573a;
                        Pair pair = pairS;
                        h2.this.f9885h.W(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, i12);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void X(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9853a;
                        Pair pair = pairS;
                        h2.this.f9885h.X(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Y(int i11, androidx.media3.exoplayer.source.r.b bVar, final Exception exc) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f11410a;
                        Pair pair = pairS;
                        h2.this.f9885h.Y(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void b0(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f11388a;
                        Pair pair = pairS;
                        h2.this.f9885h.b0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void n(int i11, androidx.media3.exoplayer.source.r.b bVar, final n8.j jVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f9333a;
                        Pair pair = pairS;
                        h2.this.f9885h.n(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void z(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.r.b> pairS = S(i11, bVar);
            if (pairS != null) {
                h2.this.f9886i.g(new Runnable() { // from class: androidx.media3.exoplayer.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h2.a aVar = this.f11396a;
                        Pair pair = pairS;
                        h2.this.f9885h.z(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r f9892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.c f9893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f9894c;

        public b(androidx.media3.exoplayer.source.r rVar, androidx.media3.exoplayer.source.r.c cVar, a aVar) {
            this.f9892a = rVar;
            this.f9893b = cVar;
            this.f9894c = aVar;
        }
    }

    static final class c implements t1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.p f9895a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9899e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<androidx.media3.exoplayer.source.r.b> f9897c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9896b = new Object();

        public c(androidx.media3.exoplayer.source.r rVar, boolean z11) {
            this.f9895a = new androidx.media3.exoplayer.source.p(rVar, z11);
        }

        @Override // androidx.media3.exoplayer.t1
        public Object a() {
            return this.f9896b;
        }

        @Override // androidx.media3.exoplayer.t1
        public p7.r0 b() {
            return this.f9895a.a0();
        }

        public void c(int i11) {
            this.f9898d = i11;
            this.f9899e = false;
            this.f9897c.clear();
        }
    }

    public interface d {
        void c();
    }

    public h2(d dVar, a8.a aVar, s7.p pVar, a8.o2 o2Var) {
        this.f9878a = o2Var;
        this.f9882e = dVar;
        this.f9885h = aVar;
        this.f9886i = pVar;
    }

    private void B(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            c cVarRemove = this.f9879b.remove(i13);
            this.f9881d.remove(cVarRemove.f9896b);
            g(i13, -cVarRemove.f9895a.a0().t());
            cVarRemove.f9899e = true;
            if (this.f9888k) {
                u(cVarRemove);
            }
        }
    }

    private void g(int i11, int i12) {
        while (i11 < this.f9879b.size()) {
            this.f9879b.get(i11).f9898d += i12;
            i11++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f9883f.get(cVar);
        if (bVar != null) {
            bVar.f9892a.u(bVar.f9893b);
        }
    }

    private void k() {
        Iterator<c> it = this.f9884g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f9897c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f9884g.add(cVar);
        b bVar = this.f9883f.get(cVar);
        if (bVar != null) {
            bVar.f9892a.t(bVar.f9893b);
        }
    }

    private static Object m(Object obj) {
        return z7.a.A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.r.b n(c cVar, androidx.media3.exoplayer.source.r.b bVar) {
        for (int i11 = 0; i11 < cVar.f9897c.size(); i11++) {
            if (cVar.f9897c.get(i11).f11106d == bVar.f11106d) {
                return bVar.a(p(cVar, bVar.f11103a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return z7.a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return z7.a.D(cVar.f9896b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i11) {
        return i11 + cVar.f9898d;
    }

    private void u(c cVar) {
        if (cVar.f9899e && cVar.f9897c.isEmpty()) {
            b bVar = (b) s7.a.f(this.f9883f.remove(cVar));
            bVar.f9892a.j(bVar.f9893b);
            bVar.f9892a.l(bVar.f9894c);
            bVar.f9892a.o(bVar.f9894c);
            this.f9884g.remove(cVar);
        }
    }

    private void x(c cVar) {
        androidx.media3.exoplayer.source.p pVar = cVar.f9895a;
        androidx.media3.exoplayer.source.r.c cVar2 = new androidx.media3.exoplayer.source.r.c() { // from class: androidx.media3.exoplayer.u1
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar, p7.r0 r0Var) {
                this.f11134a.f9882e.c();
            }
        };
        a aVar = new a(cVar);
        this.f9883f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.e(s7.q0.E(), aVar);
        pVar.f(s7.q0.E(), aVar);
        pVar.n(cVar2, this.f9889l, this.f9878a);
    }

    public p7.r0 A(int i11, int i12, n8.t tVar) {
        s7.a.a(i11 >= 0 && i11 <= i12 && i12 <= r());
        this.f9887j = tVar;
        B(i11, i12);
        return i();
    }

    public p7.r0 C(List<c> list, n8.t tVar) {
        B(0, this.f9879b.size());
        return f(this.f9879b.size(), list, tVar);
    }

    public p7.r0 D(n8.t tVar) {
        int iR = r();
        if (tVar.getLength() != iR) {
            tVar = tVar.d().g(0, iR);
        }
        this.f9887j = tVar;
        return i();
    }

    public p7.r0 E(int i11, int i12, List<p7.y> list) {
        s7.a.a(i11 >= 0 && i11 <= i12 && i12 <= r());
        s7.a.a(list.size() == i12 - i11);
        for (int i13 = i11; i13 < i12; i13++) {
            this.f9879b.get(i13).f9895a.i(list.get(i13 - i11));
        }
        return i();
    }

    public p7.r0 f(int i11, List<c> list, n8.t tVar) {
        if (!list.isEmpty()) {
            this.f9887j = tVar;
            for (int i12 = i11; i12 < list.size() + i11; i12++) {
                c cVar = list.get(i12 - i11);
                if (i12 > 0) {
                    c cVar2 = this.f9879b.get(i12 - 1);
                    cVar.c(cVar2.f9898d + cVar2.f9895a.a0().t());
                } else {
                    cVar.c(0);
                }
                g(i12, cVar.f9895a.a0().t());
                this.f9879b.add(i12, cVar);
                this.f9881d.put(cVar.f9896b, cVar);
                if (this.f9888k) {
                    x(cVar);
                    if (this.f9880c.isEmpty()) {
                        this.f9884g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public androidx.media3.exoplayer.source.q h(androidx.media3.exoplayer.source.r.b bVar, s8.b bVar2, long j11) {
        Object objO = o(bVar.f11103a);
        androidx.media3.exoplayer.source.r.b bVarA = bVar.a(m(bVar.f11103a));
        c cVar = (c) s7.a.f(this.f9881d.get(objO));
        l(cVar);
        cVar.f9897c.add(bVarA);
        androidx.media3.exoplayer.source.o oVarR = cVar.f9895a.r(bVarA, bVar2, j11);
        this.f9880c.put(oVarR, cVar);
        k();
        return oVarR;
    }

    public p7.r0 i() {
        if (this.f9879b.isEmpty()) {
            return p7.r0.f101451a;
        }
        int iT = 0;
        for (int i11 = 0; i11 < this.f9879b.size(); i11++) {
            c cVar = this.f9879b.get(i11);
            cVar.f9898d = iT;
            iT += cVar.f9895a.a0().t();
        }
        return new k2(this.f9879b, this.f9887j);
    }

    public n8.t q() {
        return this.f9887j;
    }

    public int r() {
        return this.f9879b.size();
    }

    public boolean t() {
        return this.f9888k;
    }

    public p7.r0 v(int i11, int i12, int i13, n8.t tVar) {
        s7.a.a(i11 >= 0 && i11 <= i12 && i12 <= r() && i13 >= 0);
        this.f9887j = tVar;
        if (i11 == i12 || i11 == i13) {
            return i();
        }
        int iMin = Math.min(i11, i13);
        int iMax = Math.max(((i12 - i11) + i13) - 1, i12 - 1);
        int iT = this.f9879b.get(iMin).f9898d;
        s7.q0.a1(this.f9879b, i11, i12, i13);
        while (iMin <= iMax) {
            c cVar = this.f9879b.get(iMin);
            cVar.f9898d = iT;
            iT += cVar.f9895a.a0().t();
            iMin++;
        }
        return i();
    }

    public void w(v7.q qVar) {
        s7.a.h(!this.f9888k);
        this.f9889l = qVar;
        for (int i11 = 0; i11 < this.f9879b.size(); i11++) {
            c cVar = this.f9879b.get(i11);
            x(cVar);
            this.f9884g.add(cVar);
        }
        this.f9888k = true;
    }

    public void y() {
        for (b bVar : this.f9883f.values()) {
            try {
                bVar.f9892a.j(bVar.f9893b);
            } catch (RuntimeException e11) {
                s7.t.e("MediaSourceList", "Failed to release child source.", e11);
            }
            bVar.f9892a.l(bVar.f9894c);
            bVar.f9892a.o(bVar.f9894c);
        }
        this.f9883f.clear();
        this.f9884g.clear();
        this.f9888k = false;
    }

    public void z(androidx.media3.exoplayer.source.q qVar) {
        c cVar = (c) s7.a.f(this.f9880c.remove(qVar));
        cVar.f9895a.h(qVar);
        cVar.f9897c.remove(((androidx.media3.exoplayer.source.o) qVar).f11081a);
        if (!this.f9880c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
