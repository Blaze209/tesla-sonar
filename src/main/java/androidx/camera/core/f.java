package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.r1;
import androidx.camera.core.impl.t1;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.x2;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import c0.a2;
import c0.b0;
import c0.h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f3036w = new d();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Boolean f3037x = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final i f3038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f3039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f3040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    x2.b f3041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DeferrableSurface f3042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private x2.c f3043v;

    public interface a {
        void analyze(@NonNull n nVar);

        default Size getDefaultTargetResolution() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements r1.a<c>, o3.b<f, o1, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d2 f3044a;

        public c() {
            this(d2.c0());
        }

        @NonNull
        static c f(@NonNull x0 x0Var) {
            return new c(d2.d0(x0Var));
        }

        @Override // c0.d0
        @NonNull
        public c2 b() {
            return this.f3044a;
        }

        @NonNull
        public f e() {
            o1 o1VarD = d();
            r1.N(o1VarD);
            return new f(o1VarD);
        }

        @Override // androidx.camera.core.impl.o3.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o1 d() {
            return new o1(i2.b0(this.f3044a));
        }

        @NonNull
        public c h(int i11) {
            b().K(o1.L, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public c i(@NonNull p3.b bVar) {
            b().K(o3.C, bVar);
            return this;
        }

        @NonNull
        public c j(@NonNull Size size) {
            b().K(r1.f3291p, size);
            return this;
        }

        @NonNull
        public c k(@NonNull b0 b0Var) {
            if (!Objects.equals(b0.f18255d, b0Var)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            b().K(q1.f3283j, b0Var);
            return this;
        }

        @NonNull
        public c l(int i11) {
            b().K(o1.M, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public c m(int i11) {
            b().K(o1.O, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public c n(@NonNull s0.c cVar) {
            b().K(r1.f3294s, cVar);
            return this;
        }

        @NonNull
        public c o(@NonNull List<Pair<Integer, Size[]>> list) {
            b().K(r1.f3293r, list);
            return this;
        }

        @NonNull
        public c p(int i11) {
            b().K(o3.f3270y, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        @Deprecated
        public c q(int i11) {
            if (i11 == -1) {
                i11 = 0;
            }
            b().K(r1.f3286k, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public c r(@NonNull Class<f> cls) {
            b().K(k0.k.I, cls);
            if (b().d(k0.k.H, null) == null) {
                s(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @NonNull
        public c s(@NonNull String str) {
            b().K(k0.k.H, str);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c c(@NonNull Size size) {
            b().K(r1.f3290o, size);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c a(int i11) {
            b().K(r1.f3287l, Integer.valueOf(i11));
            return this;
        }

        private c(d2 d2Var) {
            this.f3044a = d2Var;
            Class cls = (Class) d2Var.d(k0.k.I, null);
            if (cls == null || cls.equals(f.class)) {
                i(p3.b.IMAGE_ANALYSIS);
                r(f.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Size f3045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b0 f3046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final s0.c f3047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o1 f3048d;

        static {
            Size size = new Size(640, 480);
            f3045a = size;
            b0 b0Var = b0.f18255d;
            f3046b = b0Var;
            s0.c cVarA = new s0.c.a().d(s0.a.f109283c).f(new s0.d(o0.c.f95563c, 1)).a();
            f3047c = cVarA;
            f3048d = new c().j(size).p(1).q(0).n(cVarA).k(b0Var).d();
        }

        @NonNull
        public o1 a() {
            return f3048d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    f(@NonNull o1 o1Var) {
        super(o1Var);
        this.f3039r = new Object();
        if (((o1) k()).Z(0) == 1) {
            this.f3038q = new j();
        } else {
            this.f3038q = new k(o1Var.G(i0.c.c()));
        }
        this.f3038q.r(k0());
        this.f3038q.s(m0());
    }

    public static /* synthetic */ void b0(f fVar, x2 x2Var, x2.g gVar) {
        if (fVar.h() == null) {
            return;
        }
        fVar.f0();
        fVar.f3038q.g();
        x2.b bVarG0 = fVar.g0(fVar.j(), (o1) fVar.k(), (c3) u5.h.g(fVar.f()));
        fVar.f3041t = bVarG0;
        fVar.Y(h0.a(new Object[]{bVarG0.p()}));
        fVar.H();
    }

    public static /* synthetic */ void c0(q qVar, q qVar2) {
        qVar.j();
        if (qVar2 != null) {
            qVar2.j();
        }
    }

    public static /* synthetic */ List e0(Size size, List list, int i11) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private boolean l0(@NonNull j0 j0Var) {
        return m0() && r(j0Var) % 180 != 0;
    }

    private void p0() {
        j0 j0VarH = h();
        if (j0VarH != null) {
            this.f3038q.u(r(j0VarH));
        }
    }

    @Override // c0.a2
    @NonNull
    public o3.b<?, ?, ?> A(@NonNull x0 x0Var) {
        return c.f(x0Var);
    }

    @Override // c0.a2
    public void K() {
        this.f3038q.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c0.a2
    @NonNull
    protected o3<?> M(@NonNull i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        final Size defaultTargetResolution;
        Boolean boolJ0 = j0();
        boolean zA = i0Var.r().a(OnePixelShiftQuirk.class);
        i iVar = this.f3038q;
        if (boolJ0 != null) {
            zA = boolJ0.booleanValue();
        }
        iVar.q(zA);
        synchronized (this.f3039r) {
            try {
                a aVar = this.f3040s;
                defaultTargetResolution = aVar != null ? aVar.getDefaultTargetResolution() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (defaultTargetResolution == null) {
            return bVar.d();
        }
        if (i0Var.i(((Integer) bVar.b().d(r1.f3287l, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        o3 o3VarD = bVar.d();
        x0.a<Size> aVar2 = r1.f3290o;
        if (!o3VarD.e(aVar2)) {
            bVar.b().K(aVar2, defaultTargetResolution);
        }
        o3 o3VarD2 = bVar.d();
        x0.a aVar3 = r1.f3294s;
        if (o3VarD2.e(aVar3)) {
            s0.c cVar = (s0.c) d().d(aVar3, null);
            s0.c.a aVar4 = cVar == null ? new s0.c.a() : s0.c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new s0.d(defaultTargetResolution, 1));
            }
            if (cVar == null) {
                aVar4.e(new s0.b() { // from class: c0.j0
                    @Override // s0.b
                    public final List a(List list, int i11) {
                        return androidx.camera.core.f.e0(defaultTargetResolution, list, i11);
                    }
                });
            }
            bVar.b().K(aVar3, aVar4.a());
        }
        return bVar.d();
    }

    @Override // c0.a2
    @NonNull
    protected c3 P(@NonNull x0 x0Var) {
        this.f3041t.g(x0Var);
        Y(h0.a(new Object[]{this.f3041t.p()}));
        return f().g().d(x0Var).a();
    }

    @Override // c0.a2
    @NonNull
    protected c3 Q(@NonNull c3 c3Var, c3 c3Var2) {
        x2.b bVarG0 = g0(j(), (o1) k(), c3Var);
        this.f3041t = bVarG0;
        Y(h0.a(new Object[]{bVarG0.p()}));
        return c3Var;
    }

    @Override // c0.a2
    public void R() {
        f0();
        this.f3038q.j();
    }

    @Override // c0.a2
    public void U(@NonNull Matrix matrix) {
        super.U(matrix);
        this.f3038q.v(matrix);
    }

    @Override // c0.a2
    public void W(@NonNull Rect rect) {
        super.W(rect);
        this.f3038q.w(rect);
    }

    void f0() {
        h0.r.b();
        x2.c cVar = this.f3043v;
        if (cVar != null) {
            cVar.b();
            this.f3043v = null;
        }
        DeferrableSurface deferrableSurface = this.f3042u;
        if (deferrableSurface != null) {
            deferrableSurface.d();
            this.f3042u = null;
        }
    }

    x2.b g0(@NonNull String str, @NonNull o1 o1Var, @NonNull c3 c3Var) {
        h0.r.b();
        Size sizeE = c3Var.e();
        Executor executor = (Executor) u5.h.g(o1Var.G(i0.c.c()));
        boolean z11 = true;
        int iI0 = h0() == 1 ? i0() : 4;
        final q qVar = o1Var.b0() != null ? new q(o1Var.b0().a(sizeE.getWidth(), sizeE.getHeight(), n(), iI0, 0L)) : new q(o.a(sizeE.getWidth(), sizeE.getHeight(), n(), iI0));
        boolean zL0 = h() != null ? l0(h()) : false;
        int height = zL0 ? sizeE.getHeight() : sizeE.getWidth();
        int width = zL0 ? sizeE.getWidth() : sizeE.getHeight();
        int i11 = k0() == 2 ? 1 : 35;
        boolean z12 = n() == 35 && k0() == 2;
        if (n() != 35 || ((h() == null || r(h()) == 0) && !Boolean.TRUE.equals(j0()))) {
            z11 = false;
        }
        final q qVar2 = (z12 || z11) ? new q(o.a(height, width, i11, qVar.b())) : null;
        if (qVar2 != null) {
            this.f3038q.t(qVar2);
        }
        p0();
        qVar.g(this.f3038q, executor);
        x2.b bVarR = x2.b.r(o1Var, c3Var.e());
        if (c3Var.d() != null) {
            bVarR.g(c3Var.d());
        }
        DeferrableSurface deferrableSurface = this.f3042u;
        if (deferrableSurface != null) {
            deferrableSurface.d();
        }
        t1 t1Var = new t1(qVar.getSurface(), sizeE, n());
        this.f3042u = t1Var;
        t1Var.k().b(new Runnable() { // from class: c0.k0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.f.c0(qVar, qVar2);
            }
        }, i0.c.e());
        b(bVarR, c3Var);
        bVarR.n(this.f3042u, c3Var.b(), null, -1);
        x2.c cVar = this.f3043v;
        if (cVar != null) {
            cVar.b();
        }
        x2.c cVar2 = new x2.c(new x2.d() { // from class: c0.l0
            @Override // androidx.camera.core.impl.x2.d
            public final void a(x2 x2Var, x2.g gVar) {
                androidx.camera.core.f.b0(this.f18362a, x2Var, gVar);
            }
        });
        this.f3043v = cVar2;
        bVarR.u(cVar2);
        return bVarR;
    }

    public int h0() {
        return ((o1) k()).Z(0);
    }

    public int i0() {
        return ((o1) k()).a0(6);
    }

    public Boolean j0() {
        return ((o1) k()).c0(f3037x);
    }

    public int k0() {
        return ((o1) k()).d0(1);
    }

    @Override // c0.a2
    public o3<?> l(boolean z11, @NonNull p3 p3Var) {
        d dVar = f3036w;
        x0 x0VarA = p3Var.a(dVar.a().U(), 1);
        if (z11) {
            x0VarA = x0.V(x0VarA, dVar.a());
        }
        if (x0VarA == null) {
            return null;
        }
        return A(x0VarA).d();
    }

    public boolean m0() {
        return ((o1) k()).e0(Boolean.FALSE).booleanValue();
    }

    public void n0(@NonNull Executor executor, @NonNull final a aVar) {
        synchronized (this.f3039r) {
            try {
                this.f3038q.p(executor, new a() { // from class: c0.i0
                    @Override // androidx.camera.core.f.a
                    public final void analyze(androidx.camera.core.n nVar) {
                        aVar.analyze(nVar);
                    }
                });
                if (this.f3040s == null) {
                    F();
                }
                this.f3040s = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o0(int i11) {
        if (V(i11)) {
            p0();
        }
    }

    @NonNull
    public String toString() {
        return "ImageAnalysis:" + p();
    }
}
