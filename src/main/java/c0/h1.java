package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.x2;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends a2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f18320y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Executor f18321z = i0.c.e();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f18322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    private Executor f18323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    x2.b f18324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DeferrableSurface f18325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p0.n0 f18326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    z1 f18327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p0.v0 f18328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private x2.c f18329x;

    public static final class a implements o3.b<h1, l2, a>, androidx.camera.core.impl.r1.a<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.d2 f18330a;

        public a() {
            this(androidx.camera.core.impl.d2.c0());
        }

        @NonNull
        static a f(@NonNull androidx.camera.core.impl.x0 x0Var) {
            return new a(androidx.camera.core.impl.d2.d0(x0Var));
        }

        @Override // c0.d0
        @NonNull
        public androidx.camera.core.impl.c2 b() {
            return this.f18330a;
        }

        @NonNull
        public h1 e() {
            l2 l2VarD = d();
            androidx.camera.core.impl.r1.N(l2VarD);
            return new h1(l2VarD);
        }

        @Override // androidx.camera.core.impl.o3.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public l2 d() {
            return new l2(i2.b0(this.f18330a));
        }

        @NonNull
        public a h(@NonNull p3.b bVar) {
            b().K(o3.C, bVar);
            return this;
        }

        @NonNull
        public a i(@NonNull b0 b0Var) {
            b().K(androidx.camera.core.impl.q1.f3283j, b0Var);
            return this;
        }

        @NonNull
        public a j(boolean z11) {
            b().K(o3.B, Boolean.valueOf(z11));
            return this;
        }

        @NonNull
        public a k(boolean z11) {
            b().K(o3.D, Integer.valueOf(z11 ? 2 : 1));
            return this;
        }

        @NonNull
        public a l(@NonNull s0.c cVar) {
            b().K(androidx.camera.core.impl.r1.f3294s, cVar);
            return this;
        }

        @NonNull
        public a m(@NonNull List<Pair<Integer, Size[]>> list) {
            b().K(androidx.camera.core.impl.r1.f3293r, list);
            return this;
        }

        @NonNull
        public a n(int i11) {
            b().K(o3.f3270y, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        @Deprecated
        public a o(int i11) {
            if (i11 == -1) {
                i11 = 0;
            }
            b().K(androidx.camera.core.impl.r1.f3286k, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public a p(@NonNull Class<h1> cls) {
            b().K(k0.k.I, cls);
            if (b().d(k0.k.H, null) == null) {
                r(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @NonNull
        public a q(@NonNull Range<Integer> range) {
            b().K(o3.f3271z, range);
            return this;
        }

        @NonNull
        public a r(@NonNull String str) {
            b().K(k0.k.H, str);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a c(@NonNull Size size) {
            b().K(androidx.camera.core.impl.r1.f3290o, size);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a a(int i11) {
            b().K(androidx.camera.core.impl.r1.f3287l, Integer.valueOf(i11));
            b().K(androidx.camera.core.impl.r1.f3288m, Integer.valueOf(i11));
            return this;
        }

        private a(androidx.camera.core.impl.d2 d2Var) {
            this.f18330a = d2Var;
            Class cls = (Class) d2Var.d(k0.k.I, null);
            if (cls != null && !cls.equals(h1.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            h(p3.b.PREVIEW);
            p(h1.class);
            androidx.camera.core.impl.x0.a<Integer> aVar = androidx.camera.core.impl.r1.f3289n;
            if (((Integer) d2Var.d(aVar, -1)).intValue() == -1) {
                d2Var.K(aVar, 2);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s0.c f18331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final l2 f18332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b0 f18333c;

        static {
            s0.c cVarA = new s0.c.a().d(s0.a.f109283c).f(s0.d.f109295c).a();
            f18331a = cVarA;
            b0 b0Var = b0.f18254c;
            f18333c = b0Var;
            f18332b = new a().n(2).o(0).l(cVarA).i(b0Var).d();
        }

        @NonNull
        public l2 a() {
            return f18332b;
        }
    }

    public interface c {
        void a(@NonNull z1 z1Var);
    }

    h1(@NonNull l2 l2Var) {
        super(l2Var);
        this.f18323r = f18321z;
    }

    public static /* synthetic */ void b0(h1 h1Var, x2 x2Var, x2.g gVar) {
        if (h1Var.h() == null) {
            return;
        }
        h1Var.p0((l2) h1Var.k(), h1Var.f());
        h1Var.H();
    }

    private void e0(@NonNull x2.b bVar, @NonNull c3 c3Var) {
        if (this.f18322q != null) {
            bVar.n(this.f18325t, c3Var.b(), q(), o());
        }
        x2.c cVar = this.f18329x;
        if (cVar != null) {
            cVar.b();
        }
        x2.c cVar2 = new x2.c(new x2.d() { // from class: c0.g1
            @Override // androidx.camera.core.impl.x2.d
            public final void a(x2 x2Var, x2.g gVar) {
                h1.b0(this.f18313a, x2Var, gVar);
            }
        });
        this.f18329x = cVar2;
        bVar.u(cVar2);
    }

    private void f0() {
        x2.c cVar = this.f18329x;
        if (cVar != null) {
            cVar.b();
            this.f18329x = null;
        }
        DeferrableSurface deferrableSurface = this.f18325t;
        if (deferrableSurface != null) {
            deferrableSurface.d();
            this.f18325t = null;
        }
        p0.v0 v0Var = this.f18328w;
        if (v0Var != null) {
            v0Var.f();
            this.f18328w = null;
        }
        p0.n0 n0Var = this.f18326u;
        if (n0Var != null) {
            n0Var.i();
            this.f18326u = null;
        }
        this.f18327v = null;
    }

    @NonNull
    private x2.b g0(@NonNull l2 l2Var, @NonNull c3 c3Var) {
        h0.r.b();
        androidx.camera.core.impl.j0 j0VarH = h();
        Objects.requireNonNull(j0VarH);
        final androidx.camera.core.impl.j0 j0Var = j0VarH;
        f0();
        u5.h.i(this.f18326u == null);
        Matrix matrixW = w();
        boolean zQ = j0Var.q();
        Rect rectH0 = h0(c3Var.e());
        Objects.requireNonNull(rectH0);
        this.f18326u = new p0.n0(1, 34, c3Var, matrixW, zQ, rectH0, s(j0Var, D(j0Var)), e(), o0(j0Var));
        j jVarM = m();
        if (jVarM != null) {
            this.f18328w = new p0.v0(j0Var, jVarM.a());
            this.f18326u.e(new Runnable() { // from class: c0.d1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18290a.H();
                }
            });
            r0.f fVarJ = r0.f.j(this.f18326u);
            p0.n0 n0Var = this.f18328w.j(p0.v0.b.c(this.f18326u, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n0Var);
            n0Var.e(new Runnable() { // from class: c0.e1
                @Override // java.lang.Runnable
                public final void run() {
                    h1 h1Var = this.f18304a;
                    h1Var.i0(h1Var.f18326u, j0Var);
                }
            });
            this.f18327v = n0Var.k(j0Var);
            this.f18325t = this.f18326u.o();
        } else {
            this.f18326u.e(new Runnable() { // from class: c0.d1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18290a.H();
                }
            });
            z1 z1VarK = this.f18326u.k(j0Var);
            this.f18327v = z1VarK;
            this.f18325t = z1VarK.m();
        }
        if (this.f18322q != null) {
            j0();
        }
        x2.b bVarR = x2.b.r(l2Var, c3Var.e());
        b(bVarR, c3Var);
        bVarR.z(l2Var.t());
        if (c3Var.d() != null) {
            bVarR.g(c3Var.d());
        }
        e0(bVarR, c3Var);
        return bVarR;
    }

    private Rect h0(Size size) {
        if (B() != null) {
            return B();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(@NonNull p0.n0 n0Var, @NonNull androidx.camera.core.impl.j0 j0Var) {
        h0.r.b();
        if (j0Var == h()) {
            n0Var.v();
        }
    }

    private void j0() {
        k0();
        final c cVar = (c) u5.h.g(this.f18322q);
        final z1 z1Var = (z1) u5.h.g(this.f18327v);
        this.f18323r.execute(new Runnable() { // from class: c0.f1
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(z1Var);
            }
        });
    }

    private void k0() {
        androidx.camera.core.impl.j0 j0VarH = h();
        p0.n0 n0Var = this.f18326u;
        if (j0VarH == null || n0Var == null) {
            return;
        }
        n0Var.z(s(j0VarH, D(j0VarH)), e());
    }

    private boolean o0(@NonNull androidx.camera.core.impl.j0 j0Var) {
        return j0Var.q() && D(j0Var);
    }

    private void p0(@NonNull l2 l2Var, @NonNull c3 c3Var) {
        x2.b bVarG0 = g0(l2Var, c3Var);
        this.f18324s = bVarG0;
        Y(h0.a(new Object[]{bVarG0.p()}));
    }

    @Override // c0.a2
    @NonNull
    public o3.b<?, ?, ?> A(@NonNull androidx.camera.core.impl.x0 x0Var) {
        return a.f(x0Var);
    }

    @Override // c0.a2
    @NonNull
    protected o3<?> M(@NonNull androidx.camera.core.impl.i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        bVar.b().K(androidx.camera.core.impl.q1.f3281h, 34);
        return bVar.d();
    }

    @Override // c0.a2
    @NonNull
    protected c3 P(@NonNull androidx.camera.core.impl.x0 x0Var) {
        this.f18324s.g(x0Var);
        Y(h0.a(new Object[]{this.f18324s.p()}));
        return f().g().d(x0Var).a();
    }

    @Override // c0.a2
    @NonNull
    protected c3 Q(@NonNull c3 c3Var, c3 c3Var2) {
        p0((l2) k(), c3Var);
        return c3Var;
    }

    @Override // c0.a2
    public void R() {
        f0();
    }

    @Override // c0.a2
    public void W(@NonNull Rect rect) {
        super.W(rect);
        k0();
    }

    @Override // c0.a2
    public o3<?> l(boolean z11, @NonNull p3 p3Var) {
        b bVar = f18320y;
        androidx.camera.core.impl.x0 x0VarA = p3Var.a(bVar.a().U(), 1);
        if (z11) {
            x0VarA = androidx.camera.core.impl.x0.V(x0VarA, bVar.a());
        }
        if (x0VarA == null) {
            return null;
        }
        return A(x0VarA).d();
    }

    public void l0(c cVar) {
        m0(f18321z, cVar);
    }

    public void m0(@NonNull Executor executor, c cVar) {
        h0.r.b();
        if (cVar == null) {
            this.f18322q = null;
            G();
            return;
        }
        this.f18322q = cVar;
        this.f18323r = executor;
        if (g() != null) {
            p0((l2) k(), f());
            H();
        }
        F();
    }

    public void n0(int i11) {
        if (V(i11)) {
            k0();
        }
    }

    @NonNull
    public String toString() {
        return "Preview:" + p();
    }

    @Override // c0.a2
    @NonNull
    public Set<Integer> y() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }
}
