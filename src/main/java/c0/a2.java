package c0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.x2;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o3<?> f18239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private o3<?> f18240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private o3<?> f18241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c3 f18242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o3<?> f18243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f18244i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.camera.core.impl.j0 f18246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.camera.core.impl.j0 f18247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f18248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f18249n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f18236a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18237b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f18238c = a.INACTIVE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private Matrix f18245j = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    private x2 f18250o = x2.b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private x2 f18251p = x2.b();

    enum a {
        ACTIVE,
        INACTIVE
    }

    public interface b {
        void d(@NonNull a2 a2Var);

        void f(@NonNull a2 a2Var);

        void j(@NonNull a2 a2Var);

        void k(@NonNull a2 a2Var);
    }

    protected a2(@NonNull o3<?> o3Var) {
        this.f18240e = o3Var;
        this.f18241f = o3Var;
    }

    private void S(@NonNull b bVar) {
        this.f18236a.remove(bVar);
    }

    private void a(@NonNull b bVar) {
        this.f18236a.add(bVar);
    }

    @NonNull
    public abstract o3.b<?, ?, ?> A(@NonNull androidx.camera.core.impl.x0 x0Var);

    public Rect B() {
        return this.f18244i;
    }

    public boolean C(int i11) {
        Iterator<Integer> it = y().iterator();
        while (it.hasNext()) {
            if (p0.z0.e(i11, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean D(@NonNull androidx.camera.core.impl.j0 j0Var) {
        int iO = o();
        if (iO == -1 || iO == 0) {
            return false;
        }
        if (iO == 1) {
            return true;
        }
        if (iO == 2) {
            return j0Var.g();
        }
        throw new AssertionError("Unknown mirrorMode: " + iO);
    }

    @NonNull
    public o3<?> E(@NonNull androidx.camera.core.impl.i0 i0Var, o3<?> o3Var, o3<?> o3Var2) {
        androidx.camera.core.impl.d2 d2VarC0;
        if (o3Var2 != null) {
            d2VarC0 = androidx.camera.core.impl.d2.d0(o3Var2);
            d2VarC0.e0(k0.k.H);
        } else {
            d2VarC0 = androidx.camera.core.impl.d2.c0();
        }
        if (this.f18240e.e(androidx.camera.core.impl.r1.f3286k) || this.f18240e.e(androidx.camera.core.impl.r1.f3290o)) {
            androidx.camera.core.impl.x0.a<s0.c> aVar = androidx.camera.core.impl.r1.f3294s;
            if (d2VarC0.e(aVar)) {
                d2VarC0.e0(aVar);
            }
        }
        o3<?> o3Var3 = this.f18240e;
        androidx.camera.core.impl.x0.a<s0.c> aVar2 = androidx.camera.core.impl.r1.f3294s;
        if (o3Var3.e(aVar2)) {
            androidx.camera.core.impl.x0.a<Size> aVar3 = androidx.camera.core.impl.r1.f3292q;
            if (d2VarC0.e(aVar3) && ((s0.c) this.f18240e.a(aVar2)).d() != null) {
                d2VarC0.e0(aVar3);
            }
        }
        Iterator<androidx.camera.core.impl.x0.a<?>> it = this.f18240e.g().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.x0.v(d2VarC0, d2VarC0, this.f18240e, it.next());
        }
        if (o3Var != null) {
            for (androidx.camera.core.impl.x0.a<?> aVar4 : o3Var.g()) {
                if (!aVar4.c().equals(k0.k.H.c())) {
                    androidx.camera.core.impl.x0.v(d2VarC0, d2VarC0, o3Var, aVar4);
                }
            }
        }
        if (d2VarC0.e(androidx.camera.core.impl.r1.f3290o)) {
            androidx.camera.core.impl.x0.a<Integer> aVar5 = androidx.camera.core.impl.r1.f3286k;
            if (d2VarC0.e(aVar5)) {
                d2VarC0.e0(aVar5);
            }
        }
        androidx.camera.core.impl.x0.a<s0.c> aVar6 = androidx.camera.core.impl.r1.f3294s;
        if (d2VarC0.e(aVar6) && ((s0.c) d2VarC0.a(aVar6)).a() != 0) {
            d2VarC0.K(o3.A, Boolean.TRUE);
        }
        return M(i0Var, A(d2VarC0));
    }

    protected final void F() {
        this.f18238c = a.ACTIVE;
        I();
    }

    protected final void G() {
        this.f18238c = a.INACTIVE;
        I();
    }

    protected final void H() {
        Iterator<b> it = this.f18236a.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
    }

    public final void I() {
        int iOrdinal = this.f18238c.ordinal();
        if (iOrdinal == 0) {
            Iterator<b> it = this.f18236a.iterator();
            while (it.hasNext()) {
                it.next().d(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<b> it2 = this.f18236a.iterator();
            while (it2.hasNext()) {
                it2.next().j(this);
            }
        }
    }

    protected final void J() {
        Iterator<b> it = this.f18236a.iterator();
        while (it.hasNext()) {
            it.next().k(this);
        }
    }

    @NonNull
    protected o3<?> M(@NonNull androidx.camera.core.impl.i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        return bVar.d();
    }

    @NonNull
    protected c3 P(@NonNull androidx.camera.core.impl.x0 x0Var) {
        c3 c3Var = this.f18242g;
        if (c3Var != null) {
            return c3Var.g().d(x0Var).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public void T(j jVar) {
        u5.h.a(jVar == null || C(jVar.g()));
        this.f18248m = jVar;
    }

    public void U(@NonNull Matrix matrix) {
        this.f18245j = new Matrix(matrix);
    }

    protected boolean V(int i11) {
        int iU = ((androidx.camera.core.impl.r1) k()).u(-1);
        if (iU != -1 && iU == i11) {
            return false;
        }
        o3.b<?, ?, ?> bVarA = A(this.f18240e);
        o0.d.a(bVarA, i11);
        this.f18240e = bVarA.d();
        androidx.camera.core.impl.j0 j0VarH = h();
        if (j0VarH == null) {
            this.f18241f = this.f18240e;
            return true;
        }
        this.f18241f = E(j0VarH.e(), this.f18239d, this.f18243h);
        return true;
    }

    public void W(@NonNull Rect rect) {
        this.f18244i = rect;
    }

    public final void X(@NonNull androidx.camera.core.impl.j0 j0Var) {
        R();
        synchronized (this.f18237b) {
            try {
                androidx.camera.core.impl.j0 j0Var2 = this.f18246k;
                if (j0Var == j0Var2) {
                    S(j0Var2);
                    this.f18246k = null;
                }
                androidx.camera.core.impl.j0 j0Var3 = this.f18247l;
                if (j0Var == j0Var3) {
                    S(j0Var3);
                    this.f18247l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18242g = null;
        this.f18244i = null;
        this.f18241f = this.f18240e;
        this.f18239d = null;
        this.f18243h = null;
    }

    protected void Y(@NonNull List<x2> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f18250o = list.get(0);
        if (list.size() > 1) {
            this.f18251p = list.get(1);
        }
        Iterator<x2> it = list.iterator();
        while (it.hasNext()) {
            for (DeferrableSurface deferrableSurface : it.next().o()) {
                if (deferrableSurface.g() == null) {
                    deferrableSurface.p(getClass());
                }
            }
        }
    }

    public void Z(@NonNull c3 c3Var, c3 c3Var2) {
        this.f18242g = Q(c3Var, c3Var2);
    }

    public void a0(@NonNull androidx.camera.core.impl.x0 x0Var) {
        this.f18242g = P(x0Var);
    }

    protected void b(@NonNull x2.b bVar, @NonNull c3 c3Var) {
        if (!c3.f3148a.equals(c3Var.c())) {
            bVar.v(c3Var.c());
            return;
        }
        synchronized (this.f18237b) {
            try {
                List listC = ((androidx.camera.core.impl.j0) u5.h.g(this.f18246k)).e().r().c(AeFpsRangeQuirk.class);
                boolean z11 = true;
                if (listC.size() > 1) {
                    z11 = false;
                }
                u5.h.b(z11, "There should not have more than one AeFpsRangeQuirk.");
                if (!listC.isEmpty()) {
                    bVar.v(((AeFpsRangeQuirk) listC.get(0)).d());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void c(@NonNull androidx.camera.core.impl.j0 j0Var, androidx.camera.core.impl.j0 j0Var2, o3<?> o3Var, o3<?> o3Var2) {
        synchronized (this.f18237b) {
            try {
                this.f18246k = j0Var;
                this.f18247l = j0Var2;
                a(j0Var);
                if (j0Var2 != null) {
                    a(j0Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18239d = o3Var;
        this.f18243h = o3Var2;
        this.f18241f = E(j0Var.e(), this.f18239d, this.f18243h);
        K();
    }

    @NonNull
    protected o3<?> d() {
        return this.f18240e;
    }

    protected int e() {
        return ((androidx.camera.core.impl.r1) this.f18241f).p(-1);
    }

    public c3 f() {
        return this.f18242g;
    }

    public Size g() {
        c3 c3Var = this.f18242g;
        if (c3Var != null) {
            return c3Var.e();
        }
        return null;
    }

    public androidx.camera.core.impl.j0 h() {
        androidx.camera.core.impl.j0 j0Var;
        synchronized (this.f18237b) {
            j0Var = this.f18246k;
        }
        return j0Var;
    }

    @NonNull
    protected CameraControlInternal i() {
        synchronized (this.f18237b) {
            try {
                androidx.camera.core.impl.j0 j0Var = this.f18246k;
                if (j0Var == null) {
                    return CameraControlInternal.f3082a;
                }
                return j0Var.l();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    protected String j() {
        return ((androidx.camera.core.impl.j0) u5.h.h(h(), "No camera attached to use case: " + this)).e().d();
    }

    @NonNull
    public o3<?> k() {
        return this.f18241f;
    }

    public abstract o3<?> l(boolean z11, @NonNull p3 p3Var);

    public j m() {
        return this.f18248m;
    }

    public int n() {
        return this.f18241f.getInputFormat();
    }

    protected int o() {
        return ((androidx.camera.core.impl.r1) this.f18241f).H(-1);
    }

    @NonNull
    public String p() {
        String strQ = this.f18241f.q("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strQ);
        return strQ;
    }

    public String q() {
        return this.f18249n;
    }

    protected int r(@NonNull androidx.camera.core.impl.j0 j0Var) {
        return s(j0Var, false);
    }

    protected int s(@NonNull androidx.camera.core.impl.j0 j0Var, boolean z11) {
        int i11 = j0Var.e().i(z());
        return (j0Var.q() || !z11) ? i11 : h0.s.w(-i11);
    }

    public androidx.camera.core.impl.j0 t() {
        androidx.camera.core.impl.j0 j0Var;
        synchronized (this.f18237b) {
            j0Var = this.f18247l;
        }
        return j0Var;
    }

    protected String u() {
        if (t() == null) {
            return null;
        }
        return t().e().d();
    }

    @NonNull
    public x2 v() {
        return this.f18251p;
    }

    @NonNull
    public Matrix w() {
        return this.f18245j;
    }

    @NonNull
    public x2 x() {
        return this.f18250o;
    }

    @NonNull
    protected Set<Integer> y() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    protected int z() {
        return ((androidx.camera.core.impl.r1) this.f18241f).u(0);
    }

    public void K() {
    }

    public void L() {
    }

    public void N() {
    }

    public void O() {
    }

    public void R() {
    }

    @NonNull
    protected c3 Q(@NonNull c3 c3Var, c3 c3Var2) {
        return c3Var;
    }
}
