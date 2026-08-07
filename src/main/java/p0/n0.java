package p0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c3;
import androidx.core.util.Consumer;
import c0.o1;
import c0.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f100137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f100138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f100139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f100140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f100141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f100142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f100143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f100145i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z1 f100147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private a f100148l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f100146j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final Set<Runnable> f100149m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f100150n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<Consumer<z1.h>> f100151o = new ArrayList();

    static class a extends DeferrableSurface {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final com.google.common.util.concurrent.s<Surface> f100152o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        androidx.concurrent.futures.c.a<Surface> f100153p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private DeferrableSurface f100154q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private q0 f100155r;

        a(@NonNull Size size, int i11) {
            super(size, i11);
            this.f100152o = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: p0.l0
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return n0.a.r(this.f100133a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            q0 q0Var = aVar.f100155r;
            if (q0Var != null) {
                q0Var.B();
            }
            if (aVar.f100154q == null) {
                aVar.f100153p.d();
            }
        }

        public static /* synthetic */ Object r(a aVar, androidx.concurrent.futures.c.a aVar2) {
            aVar.f100153p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void d() {
            super.d();
            h0.r.e(new Runnable() { // from class: p0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.q(this.f100130a);
                }
            });
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @NonNull
        protected com.google.common.util.concurrent.s<Surface> o() {
            return this.f100152o;
        }

        boolean s() {
            h0.r.b();
            return this.f100154q == null && !m();
        }

        public void t(@NonNull q0 q0Var) {
            u5.h.j(this.f100155r == null, "Consumer can only be linked once.");
            this.f100155r = q0Var;
        }

        public boolean u(@NonNull final DeferrableSurface deferrableSurface, @NonNull Runnable runnable) {
            h0.r.b();
            u5.h.g(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.f100154q;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            u5.h.j(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            u5.h.b(h().equals(deferrableSurface.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), deferrableSurface.h()));
            u5.h.b(i() == deferrableSurface.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(deferrableSurface.i())));
            u5.h.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f100154q = deferrableSurface;
            j0.n.t(deferrableSurface.j(), this.f100153p);
            deferrableSurface.l();
            k().b(new Runnable() { // from class: p0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    deferrableSurface.e();
                }
            }, i0.c.b());
            deferrableSurface.f().b(runnable, i0.c.e());
            return true;
        }
    }

    public n0(int i11, int i12, @NonNull c3 c3Var, @NonNull Matrix matrix, boolean z11, @NonNull Rect rect, int i13, int i14, boolean z12) {
        this.f100142f = i11;
        this.f100137a = i12;
        this.f100143g = c3Var;
        this.f100138b = matrix;
        this.f100139c = z11;
        this.f100140d = rect;
        this.f100145i = i13;
        this.f100144h = i14;
        this.f100141e = z12;
        this.f100148l = new a(c3Var.e(), i12);
    }

    public static /* synthetic */ void a(final n0 n0Var) {
        n0Var.getClass();
        i0.c.e().execute(new Runnable() { // from class: p0.i0
            @Override // java.lang.Runnable
            public final void run() {
                n0.b(this.f100125a);
            }
        });
    }

    public static /* synthetic */ void b(n0 n0Var) {
        if (n0Var.f100150n) {
            return;
        }
        n0Var.v();
    }

    public static /* synthetic */ void c(n0 n0Var, int i11, int i12) {
        boolean z11;
        boolean z12 = true;
        if (n0Var.f100145i != i11) {
            n0Var.f100145i = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        if (n0Var.f100144h != i12) {
            n0Var.f100144h = i12;
        } else {
            z12 = z11;
        }
        if (z12) {
            n0Var.x();
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.s d(n0 n0Var, final a aVar, int i11, o1.a aVar2, o1.a aVar3, Surface surface) {
        n0Var.getClass();
        u5.h.g(surface);
        try {
            aVar.l();
            q0 q0Var = new q0(surface, n0Var.t(), i11, n0Var.f100143g.e(), aVar2, aVar3, n0Var.f100138b);
            q0Var.t().b(new Runnable() { // from class: p0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, i0.c.b());
            aVar.t(q0Var);
            return j0.n.p(q0Var);
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            return j0.n.n(e11);
        }
    }

    private void g() {
        u5.h.j(!this.f100146j, "Consumer can only be linked once.");
        this.f100146j = true;
    }

    private void h() {
        u5.h.j(!this.f100150n, "Edge is already closed.");
    }

    private void x() {
        h0.r.b();
        z1.h hVarG = z1.h.g(this.f100140d, this.f100145i, this.f100144h, u(), this.f100138b, this.f100141e);
        z1 z1Var = this.f100147k;
        if (z1Var != null) {
            z1Var.w(hVarG);
        }
        Iterator<Consumer<z1.h>> it = this.f100151o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarG);
        }
    }

    public void e(@NonNull Runnable runnable) {
        h0.r.b();
        h();
        this.f100149m.add(runnable);
    }

    public void f(@NonNull Consumer<z1.h> consumer) {
        u5.h.g(consumer);
        this.f100151o.add(consumer);
    }

    public final void i() {
        h0.r.b();
        this.f100148l.d();
        this.f100150n = true;
    }

    @NonNull
    public com.google.common.util.concurrent.s<o1> j(final int i11, @NonNull final o1.a aVar, final o1.a aVar2) {
        h0.r.b();
        h();
        g();
        final a aVar3 = this.f100148l;
        return j0.n.y(aVar3.j(), new j0.a() { // from class: p0.h0
            @Override // j0.a
            public final com.google.common.util.concurrent.s apply(Object obj) {
                return n0.d(this.f100119a, aVar3, i11, aVar, aVar2, (Surface) obj);
            }
        }, i0.c.e());
    }

    @NonNull
    public z1 k(@NonNull androidx.camera.core.impl.j0 j0Var) {
        return l(j0Var, true);
    }

    @NonNull
    public z1 l(@NonNull androidx.camera.core.impl.j0 j0Var, boolean z11) {
        h0.r.b();
        h();
        z1 z1Var = new z1(this.f100143g.e(), j0Var, z11, this.f100143g.b(), this.f100143g.c(), new Runnable() { // from class: p0.d0
            @Override // java.lang.Runnable
            public final void run() {
                n0.a(this.f100105a);
            }
        });
        try {
            final DeferrableSurface deferrableSurfaceM = z1Var.m();
            a aVar = this.f100148l;
            Objects.requireNonNull(aVar);
            if (aVar.u(deferrableSurfaceM, new e0(aVar))) {
                com.google.common.util.concurrent.s<Void> sVarK = aVar.k();
                Objects.requireNonNull(deferrableSurfaceM);
                sVarK.b(new Runnable() { // from class: p0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        deferrableSurfaceM.d();
                    }
                }, i0.c.b());
            }
            this.f100147k = z1Var;
            x();
            return z1Var;
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        } catch (RuntimeException e12) {
            z1Var.x();
            throw e12;
        }
    }

    public final void m() {
        h0.r.b();
        h();
        this.f100148l.d();
    }

    @NonNull
    public Rect n() {
        return this.f100140d;
    }

    @NonNull
    public DeferrableSurface o() {
        h0.r.b();
        h();
        g();
        return this.f100148l;
    }

    public int p() {
        return this.f100137a;
    }

    public int q() {
        return this.f100145i;
    }

    @NonNull
    public Matrix r() {
        return this.f100138b;
    }

    @NonNull
    public c3 s() {
        return this.f100143g;
    }

    public int t() {
        return this.f100142f;
    }

    public boolean u() {
        return this.f100139c;
    }

    public void v() {
        h0.r.b();
        h();
        if (this.f100148l.s()) {
            return;
        }
        this.f100146j = false;
        this.f100148l.d();
        this.f100148l = new a(this.f100143g.e(), this.f100137a);
        Iterator<Runnable> it = this.f100149m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean w() {
        return this.f100141e;
    }

    public void y(@NonNull DeferrableSurface deferrableSurface) {
        h0.r.b();
        h();
        a aVar = this.f100148l;
        Objects.requireNonNull(aVar);
        aVar.u(deferrableSurface, new e0(aVar));
    }

    public void z(final int i11, final int i12) {
        h0.r.e(new Runnable() { // from class: p0.g0
            @Override // java.lang.Runnable
            public final void run() {
                n0.c(this.f100114a, i11, i12);
            }
        });
    }
}
