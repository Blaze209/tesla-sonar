package t0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.r1;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.x2;
import c0.a2;
import c0.h0;
import c0.z;
import com.google.common.util.concurrent.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p0.n0;
import p0.t;
import p0.v0;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
public class f extends a2 {
    private n0 A;
    x2.b B;
    x2.b C;
    private x2.c D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final h f111970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    private final j f111971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    private final z f111972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final z f111973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private v0 f111974u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private v0 f111975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private r f111976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private n0 f111977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private n0 f111978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private n0 f111979z;

    interface a {
        @NonNull
        s<Void> a(int i11, int i12);
    }

    public f(@NonNull j0 j0Var, j0 j0Var2, @NonNull z zVar, @NonNull z zVar2, @NonNull Set<a2> set, @NonNull p3 p3Var) {
        super(o0(set));
        this.f111970q = o0(set);
        this.f111972s = zVar;
        this.f111973t = zVar2;
        this.f111971r = new j(j0Var, j0Var2, set, p3Var, new a() { // from class: t0.d
            @Override // t0.f.a
            public final s a(int i11, int i12) {
                return f.c0(this.f111963a, i11, i12);
            }
        });
    }

    public static /* synthetic */ void b0(f fVar, String str, String str2, o3 o3Var, c3 c3Var, c3 c3Var2, x2 x2Var, x2.g gVar) {
        if (fVar.h() == null) {
            return;
        }
        fVar.e0();
        fVar.Y(fVar.f0(str, str2, o3Var, c3Var, c3Var2));
        fVar.H();
        fVar.f111971r.J();
    }

    public static /* synthetic */ s c0(f fVar, int i11, int i12) {
        v0 v0Var = fVar.f111975v;
        return v0Var != null ? v0Var.e().a(i11, i12) : j0.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void d0(@NonNull x2.b bVar, @NonNull final String str, final String str2, @NonNull final o3<?> o3Var, @NonNull final c3 c3Var, final c3 c3Var2) {
        x2.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
        }
        x2.c cVar2 = new x2.c(new x2.d() { // from class: t0.e
            @Override // androidx.camera.core.impl.x2.d
            public final void a(x2 x2Var, x2.g gVar) {
                f.b0(this.f111964a, str, str2, o3Var, c3Var, c3Var2, x2Var, gVar);
            }
        });
        this.D = cVar2;
        bVar.u(cVar2);
    }

    private void e0() {
        x2.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
            this.D = null;
        }
        n0 n0Var = this.f111977x;
        if (n0Var != null) {
            n0Var.i();
            this.f111977x = null;
        }
        n0 n0Var2 = this.f111978y;
        if (n0Var2 != null) {
            n0Var2.i();
            this.f111978y = null;
        }
        n0 n0Var3 = this.f111979z;
        if (n0Var3 != null) {
            n0Var3.i();
            this.f111979z = null;
        }
        n0 n0Var4 = this.A;
        if (n0Var4 != null) {
            n0Var4.i();
            this.A = null;
        }
        v0 v0Var = this.f111975v;
        if (v0Var != null) {
            v0Var.f();
            this.f111975v = null;
        }
        r rVar = this.f111976w;
        if (rVar != null) {
            rVar.d();
            this.f111976w = null;
        }
        v0 v0Var2 = this.f111974u;
        if (v0Var2 != null) {
            v0Var2.f();
            this.f111974u = null;
        }
    }

    @NonNull
    private List<x2> f0(@NonNull String str, String str2, @NonNull o3<?> o3Var, @NonNull c3 c3Var, c3 c3Var2) {
        h0.r.b();
        if (c3Var2 != null) {
            g0(str, str2, o3Var, c3Var, c3Var2);
            h0(str, str2, o3Var, c3Var, c3Var2);
            this.f111976w = p0(h(), t(), c3Var, this.f111972s, this.f111973t);
            Map<a2, q0.d> mapB = this.f111971r.B(this.f111979z, this.A, z(), B() != null);
            r.c cVarG = this.f111976w.g(r.b.d(this.f111979z, this.A, new ArrayList(mapB.values())));
            HashMap map = new HashMap();
            for (Map.Entry<a2, q0.d> entry : mapB.entrySet()) {
                map.put(entry.getKey(), cVarG.get(entry.getValue()));
            }
            this.f111971r.M(map);
            return h0.a(new Object[]{this.B.p(), this.C.p()});
        }
        g0(str, str2, o3Var, c3Var, null);
        j0 j0VarH = h();
        Objects.requireNonNull(j0VarH);
        this.f111975v = t0(j0VarH, c3Var);
        Map<a2, r0.f> mapA = this.f111971r.A(this.f111979z, z(), B() != null);
        v0.c cVarJ = this.f111975v.j(v0.b.c(this.f111979z, new ArrayList(mapA.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry<a2, r0.f> entry2 : mapA.entrySet()) {
            map2.put(entry2.getKey(), cVarJ.get(entry2.getValue()));
        }
        this.f111971r.M(map2);
        return h0.a(new Object[]{this.B.p()});
    }

    private void g0(@NonNull String str, String str2, @NonNull o3<?> o3Var, @NonNull c3 c3Var, c3 c3Var2) {
        Matrix matrixW = w();
        j0 j0VarH = h();
        Objects.requireNonNull(j0VarH);
        boolean zQ = j0VarH.q();
        Rect rectM0 = m0(c3Var.e());
        Objects.requireNonNull(rectM0);
        j0 j0VarH2 = h();
        Objects.requireNonNull(j0VarH2);
        int iR = r(j0VarH2);
        j0 j0VarH3 = h();
        Objects.requireNonNull(j0VarH3);
        n0 n0Var = new n0(3, 34, c3Var, matrixW, zQ, rectM0, iR, -1, D(j0VarH3));
        this.f111977x = n0Var;
        j0 j0VarH4 = h();
        Objects.requireNonNull(j0VarH4);
        this.f111979z = s0(n0Var, j0VarH4);
        x2.b bVarI0 = i0(this.f111977x, o3Var, c3Var);
        this.B = bVarI0;
        d0(bVarI0, str, str2, o3Var, c3Var, c3Var2);
    }

    private void h0(@NonNull String str, String str2, @NonNull o3<?> o3Var, @NonNull c3 c3Var, c3 c3Var2) {
        Matrix matrixW = w();
        j0 j0VarT = t();
        Objects.requireNonNull(j0VarT);
        boolean zQ = j0VarT.q();
        Rect rectM0 = m0(c3Var2.e());
        Objects.requireNonNull(rectM0);
        j0 j0VarT2 = t();
        Objects.requireNonNull(j0VarT2);
        int iR = r(j0VarT2);
        j0 j0VarT3 = t();
        Objects.requireNonNull(j0VarT3);
        n0 n0Var = new n0(3, 34, c3Var2, matrixW, zQ, rectM0, iR, -1, D(j0VarT3));
        this.f111978y = n0Var;
        j0 j0VarT4 = t();
        Objects.requireNonNull(j0VarT4);
        this.A = s0(n0Var, j0VarT4);
        x2.b bVarI0 = i0(this.f111978y, o3Var, c3Var2);
        this.C = bVarI0;
        d0(bVarI0, str, str2, o3Var, c3Var, c3Var2);
    }

    @NonNull
    private x2.b i0(@NonNull n0 n0Var, @NonNull o3<?> o3Var, @NonNull c3 c3Var) {
        x2.b bVarR = x2.b.r(o3Var, c3Var.e());
        w0(bVarR);
        v0(c3Var.e(), bVarR);
        bVarR.n(n0Var.o(), c3Var.b(), null, -1);
        bVarR.k(this.f111971r.D());
        if (c3Var.d() != null) {
            bVarR.g(c3Var.d());
        }
        b(bVarR, c3Var);
        return bVarR;
    }

    @NonNull
    public static List<p3.b> j0(@NonNull a2 a2Var) {
        ArrayList arrayList = new ArrayList();
        if (!u0(a2Var)) {
            arrayList.add(a2Var.k().U());
            return arrayList;
        }
        Iterator<a2> it = ((f) a2Var).l0().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k().U());
        }
        return arrayList;
    }

    private static int k0(@NonNull a2 a2Var) {
        return a2Var.k().A().p();
    }

    private Rect m0(@NonNull Size size) {
        return B() != null ? B() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private Rect n0(n0 n0Var) {
        return ((c0.j) u5.h.g(m())).h() == 1 ? h0.s.r(n0Var.s().e()) : n0Var.n();
    }

    private static h o0(Set<a2> set) {
        c2 c2VarB = new g().b();
        c2VarB.K(q1.f3281h, 34);
        ArrayList arrayList = new ArrayList();
        for (a2 a2Var : set) {
            if (a2Var.k().e(o3.C)) {
                arrayList.add(a2Var.k().U());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        c2VarB.K(h.L, arrayList);
        c2VarB.K(r1.f3289n, 2);
        return new h(i2.b0(c2VarB));
    }

    @NonNull
    private r p0(@NonNull j0 j0Var, @NonNull j0 j0Var2, @NonNull c3 c3Var, @NonNull z zVar, @NonNull z zVar2) {
        return new r(j0Var, j0Var2, q0.o.a.a(c3Var.b(), zVar, zVar2));
    }

    private boolean q0() {
        if (((c0.j) u5.h.g(m())).h() == 1) {
            j0 j0Var = (j0) u5.h.g(h());
            if (j0Var.g() && j0Var.q()) {
                return true;
            }
        }
        return false;
    }

    private int r0() {
        if (((c0.j) u5.h.g(m())).h() == 1) {
            return r((j0) u5.h.g(h()));
        }
        return 0;
    }

    @NonNull
    private n0 s0(@NonNull n0 n0Var, @NonNull j0 j0Var) {
        if (m() == null || m().h() == 2 || m().e() == 1) {
            return n0Var;
        }
        this.f111974u = new v0(j0Var, m().a());
        int iR0 = r0();
        Rect rectN0 = n0(n0Var);
        r0.f fVarI = r0.f.i(n0Var.t(), n0Var.p(), rectN0, h0.s.f(rectN0, iR0), iR0, q0(), true);
        n0 n0Var2 = this.f111974u.j(v0.b.c(n0Var, Collections.singletonList(fVarI))).get(fVarI);
        Objects.requireNonNull(n0Var2);
        return n0Var2;
    }

    @NonNull
    private v0 t0(@NonNull j0 j0Var, @NonNull c3 c3Var) {
        if (m() == null || m().e() != 1) {
            return new v0(j0Var, t.a.a(c3Var.b()));
        }
        v0 v0Var = new v0(j0Var, m().a());
        this.f111974u = v0Var;
        return v0Var;
    }

    public static boolean u0(a2 a2Var) {
        return a2Var instanceof f;
    }

    private void v0(@NonNull Size size, @NonNull x2.b bVar) {
        Iterator<a2> it = l0().iterator();
        while (it.hasNext()) {
            x2 x2VarP = x2.b.r(it.next().k(), size).p();
            bVar.c(x2VarP.j());
            bVar.a(x2VarP.n());
            bVar.d(x2VarP.l());
            bVar.b(x2VarP.c());
            bVar.g(x2VarP.f());
        }
    }

    private void w0(@NonNull x2.b bVar) {
        Iterator<a2> it = l0().iterator();
        int iE = -1;
        while (it.hasNext()) {
            iE = x2.e(iE, k0(it.next()));
        }
        if (iE != -1) {
            bVar.B(iE);
        }
    }

    @Override // c0.a2
    @NonNull
    public o3.b<?, ?, ?> A(@NonNull x0 x0Var) {
        return new g(d2.d0(x0Var));
    }

    @Override // c0.a2
    public void K() {
        super.K();
        this.f111971r.r();
    }

    @Override // c0.a2
    @NonNull
    protected o3<?> M(@NonNull i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        this.f111971r.G(bVar.b());
        return bVar.d();
    }

    @Override // c0.a2
    public void N() {
        super.N();
        this.f111971r.H();
    }

    @Override // c0.a2
    public void O() {
        super.O();
        this.f111971r.I();
    }

    @Override // c0.a2
    @NonNull
    protected c3 P(@NonNull x0 x0Var) {
        this.B.g(x0Var);
        Y(h0.a(new Object[]{this.B.p()}));
        return f().g().d(x0Var).a();
    }

    @Override // c0.a2
    @NonNull
    protected c3 Q(@NonNull c3 c3Var, c3 c3Var2) {
        Y(f0(j(), u(), k(), c3Var, c3Var2));
        F();
        return c3Var;
    }

    @Override // c0.a2
    public void R() {
        super.R();
        e0();
        this.f111971r.O();
    }

    @Override // c0.a2
    public o3<?> l(boolean z11, @NonNull p3 p3Var) {
        x0 x0VarA = p3Var.a(this.f111970q.U(), 1);
        if (z11) {
            x0VarA = x0.V(x0VarA, this.f111970q.getConfig());
        }
        if (x0VarA == null) {
            return null;
        }
        return A(x0VarA).d();
    }

    @NonNull
    public Set<a2> l0() {
        return this.f111971r.z();
    }

    @Override // c0.a2
    @NonNull
    public Set<Integer> y() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }
}
