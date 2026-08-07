package e0;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.s1;
import androidx.camera.core.impl.t1;
import androidx.core.util.Consumer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.camera.core.q f61403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    androidx.camera.core.q f61404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.camera.core.q f61405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t0.a f61406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f61407f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    u0 f61402a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j0 f61408g = null;

    class a extends androidx.camera.core.impl.p {
        a() {
        }

        public static /* synthetic */ void f(a aVar) {
            u0 u0Var = x.this.f61402a;
            if (u0Var != null) {
                u0Var.p();
            }
        }

        public static /* synthetic */ void g(a aVar, int i11) {
            u0 u0Var = x.this.f61402a;
            if (u0Var != null) {
                u0Var.o(i11);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void d(int i11, final int i12) {
            i0.c.e().execute(new Runnable() { // from class: e0.v
                @Override // java.lang.Runnable
                public final void run() {
                    x.a.g(this.f61397a, i12);
                }
            });
        }

        @Override // androidx.camera.core.impl.p
        public void e(int i11) {
            i0.c.e().execute(new Runnable() { // from class: e0.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a.f(this.f61400a);
                }
            });
        }
    }

    static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.camera.core.impl.p f61413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DeferrableSurface f61414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DeferrableSurface f61415d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private androidx.camera.core.impl.p f61412a = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DeferrableSurface f61416e = null;

        class a extends androidx.camera.core.impl.p {
            a() {
            }
        }

        c() {
        }

        @NonNull
        static c o(@NonNull Size size, int i11, @NonNull List<Integer> list, boolean z11, c0.w0 w0Var, Size size2, int i12) {
            return new e0.b(size, i11, list, z11, w0Var, size2, i12, new p0.u(), new p0.u());
        }

        @NonNull
        androidx.camera.core.impl.p a() {
            return this.f61412a;
        }

        @NonNull
        abstract p0.u<a1.a> b();

        abstract c0.w0 c();

        abstract int d();

        @NonNull
        abstract List<Integer> e();

        abstract int f();

        abstract Size g();

        DeferrableSurface h() {
            return this.f61416e;
        }

        @NonNull
        abstract p0.u<u0> i();

        androidx.camera.core.impl.p j() {
            return this.f61413b;
        }

        DeferrableSurface k() {
            return this.f61415d;
        }

        @NonNull
        abstract Size l();

        @NonNull
        DeferrableSurface m() {
            DeferrableSurface deferrableSurface = this.f61414c;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        abstract boolean n();

        void p(@NonNull androidx.camera.core.impl.p pVar) {
            this.f61412a = pVar;
        }

        void q(@NonNull Surface surface, @NonNull Size size, int i11) {
            this.f61416e = new t1(surface, size, i11);
        }

        void r(@NonNull androidx.camera.core.impl.p pVar) {
            this.f61413b = pVar;
        }

        void s(@NonNull Surface surface) {
            u5.h.j(this.f61415d == null, "The secondary surface is already set.");
            this.f61415d = new t1(surface, l(), d());
        }

        void t(@NonNull Surface surface) {
            u5.h.j(this.f61414c == null, "The surface is already set.");
            this.f61414c = new t1(surface, l(), d());
        }
    }

    x() {
    }

    public static /* synthetic */ void a(x xVar, s1 s1Var) {
        xVar.getClass();
        try {
            androidx.camera.core.n nVarD = s1Var.d();
            if (nVarD != null) {
                xVar.k(nVarD);
                return;
            }
            u0 u0Var = xVar.f61402a;
            if (u0Var != null) {
                xVar.p(a1.a.c(u0Var.e(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e11) {
            u0 u0Var2 = xVar.f61402a;
            if (u0Var2 != null) {
                xVar.p(a1.a.c(u0Var2.e(), new ImageCaptureException(2, "Failed to acquire latest image", e11)));
            }
        }
    }

    public static /* synthetic */ void b(x xVar, u0 u0Var) {
        xVar.l(u0Var);
        xVar.f61408g.h(u0Var);
    }

    public static /* synthetic */ void d(androidx.camera.core.q qVar) {
        if (qVar != null) {
            qVar.j();
        }
    }

    public static /* synthetic */ void e(x xVar, s1 s1Var) {
        xVar.getClass();
        try {
            androidx.camera.core.n nVarD = s1Var.d();
            if (nVarD != null) {
                xVar.m(nVarD);
            }
        } catch (IllegalStateException e11) {
            c0.y0.d("CaptureNode", "Failed to acquire latest image of postview", e11);
        }
    }

    public static /* synthetic */ void f(androidx.camera.core.q qVar) {
        if (qVar != null) {
            qVar.j();
        }
    }

    @NonNull
    private static s1 h(c0.w0 w0Var, int i11, int i12, int i13) {
        return w0Var != null ? w0Var.a(i11, i12, i13, 4, 0L) : androidx.camera.core.o.a(i11, i12, i13, 4);
    }

    private void j(@NonNull androidx.camera.core.n nVar) {
        u0 u0Var;
        u0 u0Var2;
        h0.r.b();
        t0.a aVar = this.f61406e;
        Objects.requireNonNull(aVar);
        aVar.a().accept(t0.b.c(this.f61402a, nVar));
        u0 u0Var3 = this.f61402a;
        c cVar = this.f61407f;
        boolean z11 = cVar != null && cVar.e().size() > 1;
        if (z11 && (u0Var2 = this.f61402a) != null) {
            u0Var2.k().u(nVar.getFormat(), true);
        }
        if (!z11 || ((u0Var = this.f61402a) != null && u0Var.k().s())) {
            this.f61402a = null;
        }
        u0Var3.s();
    }

    private void m(@NonNull androidx.camera.core.n nVar) {
        if (this.f61402a == null) {
            c0.y0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            nVar.close();
        } else {
            t0.a aVar = this.f61406e;
            Objects.requireNonNull(aVar);
            aVar.d().accept(t0.b.c(this.f61402a, nVar));
        }
    }

    private void o(@NonNull c cVar, @NonNull final androidx.camera.core.q qVar, final androidx.camera.core.q qVar2, final androidx.camera.core.q qVar3) {
        cVar.m().d();
        cVar.m().k().b(new Runnable() { // from class: e0.r
            @Override // java.lang.Runnable
            public final void run() {
                qVar.j();
            }
        }, i0.c.e());
        if (cVar.h() != null) {
            cVar.h().d();
            cVar.h().k().b(new Runnable() { // from class: e0.s
                @Override // java.lang.Runnable
                public final void run() {
                    x.f(qVar3);
                }
            }, i0.c.e());
        }
        if (cVar.e().size() <= 1 || cVar.k() == null) {
            return;
        }
        cVar.k().d();
        cVar.k().k().b(new Runnable() { // from class: e0.t
            @Override // java.lang.Runnable
            public final void run() {
                x.d(qVar2);
            }
        }, i0.c.e());
    }

    private void q(@NonNull s1 s1Var) {
        s1Var.g(new s1.a() { // from class: e0.u
            @Override // androidx.camera.core.impl.s1.a
            public final void a(s1 s1Var2) {
                x.a(this.f61383a, s1Var2);
            }
        }, i0.c.e());
    }

    public int i() {
        h0.r.b();
        u5.h.j(this.f61403b != null, "The ImageReader is not initialized.");
        return this.f61403b.i();
    }

    void k(@NonNull androidx.camera.core.n nVar) {
        h0.r.b();
        if (this.f61402a == null) {
            c0.y0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + nVar);
            nVar.close();
            return;
        }
        if (((Integer) nVar.z().c().d(this.f61402a.j())) != null) {
            j(nVar);
        } else {
            c0.y0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            nVar.close();
        }
    }

    void l(@NonNull u0 u0Var) {
        h0.r.b();
        u5.h.j(u0Var.i().size() == 1, "only one capture stage is supported.");
        u5.h.j(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f61402a = u0Var;
        j0.n.j(u0Var.a(), new b(u0Var), i0.c.b());
    }

    public void n() {
        h0.r.b();
        c cVar = this.f61407f;
        Objects.requireNonNull(cVar);
        androidx.camera.core.q qVar = this.f61403b;
        Objects.requireNonNull(qVar);
        o(cVar, qVar, this.f61404c, this.f61405d);
    }

    void p(@NonNull a1.a aVar) {
        h0.r.b();
        u0 u0Var = this.f61402a;
        if (u0Var == null || u0Var.e() != aVar.b()) {
            return;
        }
        this.f61402a.n(aVar.a());
    }

    public void r(androidx.camera.core.e.a aVar) {
        h0.r.b();
        u5.h.j(this.f61403b != null, "The ImageReader is not initialized.");
        this.f61403b.k(aVar);
    }

    @NonNull
    public t0.a s(@NonNull c cVar) {
        Consumer<u0> consumer;
        s1 s1Var;
        androidx.camera.core.p pVar;
        s1 s1Var2;
        u5.h.j(this.f61407f == null && this.f61403b == null, "CaptureNode does not support recreation yet.");
        this.f61407f = cVar;
        Size sizeL = cVar.l();
        int iD = cVar.d();
        boolean zN = cVar.n();
        androidx.camera.core.impl.p aVar = new a();
        boolean z11 = cVar.e().size() > 1;
        androidx.camera.core.impl.p pVarB = null;
        if (zN || cVar.c() != null) {
            j0 j0Var = new j0(h(cVar.c(), sizeL.getWidth(), sizeL.getHeight(), iD));
            this.f61408g = j0Var;
            consumer = new Consumer() { // from class: e0.o
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    x.b(this.f61351a, (u0) obj);
                }
            };
            s1Var = j0Var;
            pVar = null;
        } else {
            if (z11) {
                androidx.camera.core.p pVar2 = new androidx.camera.core.p(sizeL.getWidth(), sizeL.getHeight(), 256, 4);
                androidx.camera.core.impl.p pVarB2 = androidx.camera.core.impl.q.b(aVar, pVar2.m());
                pVar = new androidx.camera.core.p(sizeL.getWidth(), sizeL.getHeight(), 32, 4);
                androidx.camera.core.impl.p[] pVarArr = {aVar, pVar.m()};
                aVar = pVarB2;
                pVarB = androidx.camera.core.impl.q.b(pVarArr);
                s1Var2 = pVar2;
            } else {
                androidx.camera.core.p pVar3 = new androidx.camera.core.p(sizeL.getWidth(), sizeL.getHeight(), iD, 4);
                aVar = androidx.camera.core.impl.q.b(aVar, pVar3.m());
                s1Var2 = pVar3;
                pVar = null;
            }
            consumer = new Consumer() { // from class: e0.n
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f61348a.l((u0) obj);
                }
            };
            s1Var = s1Var2;
        }
        cVar.p(aVar);
        if (z11 && pVarB != null) {
            cVar.r(pVarB);
        }
        Surface surface = s1Var.getSurface();
        Objects.requireNonNull(surface);
        cVar.t(surface);
        this.f61403b = new androidx.camera.core.q(s1Var);
        q(s1Var);
        if (cVar.g() != null) {
            s1 s1VarH = h(cVar.c(), cVar.g().getWidth(), cVar.g().getHeight(), cVar.f());
            s1VarH.g(new s1.a() { // from class: e0.p
                @Override // androidx.camera.core.impl.s1.a
                public final void a(s1 s1Var3) {
                    x.e(this.f61354a, s1Var3);
                }
            }, i0.c.e());
            this.f61405d = new androidx.camera.core.q(s1VarH);
            cVar.q(s1VarH.getSurface(), cVar.g(), cVar.f());
        }
        if (z11 && pVar != null) {
            cVar.s(pVar.getSurface());
            this.f61404c = new androidx.camera.core.q(pVar);
            q(pVar);
        }
        cVar.i().a(consumer);
        cVar.b().a(new Consumer() { // from class: e0.q
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f61357a.p((a1.a) obj);
            }
        });
        t0.a aVarE = t0.a.e(cVar.d(), cVar.e());
        this.f61406e = aVarE;
        return aVarE;
    }

    class b implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0 f61410a;

        b(u0 u0Var) {
            this.f61410a = u0Var;
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            h0.r.b();
            if (this.f61410a == x.this.f61402a) {
                c0.y0.l("CaptureNode", "request aborted, id=" + x.this.f61402a.e());
                if (x.this.f61408g != null) {
                    x.this.f61408g.i();
                }
                x.this.f61402a = null;
            }
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
        }
    }
}
