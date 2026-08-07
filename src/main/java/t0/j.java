package t0;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.r1;
import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.z;
import c0.a2;
import c0.b0;
import c0.h1;
import c0.r0;
import c0.y0;
import h0.r;
import h0.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p0.n0;

/* JADX INFO: loaded from: classes.dex */
class j implements a2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Set<a2> f111985a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final p3 f111989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final j0 f111990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j0 f111991g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final Set<o3<?>> f111993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final Map<a2, o3<?>> f111994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final b f111995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f111996l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final Map<a2, n0> f111986b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Map<a2, i> f111987c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final Map<a2, Boolean> f111988d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.p f111992h = t();

    class a extends androidx.camera.core.impl.p {
        a() {
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull z zVar) {
            super.b(i11, zVar);
            Iterator<a2> it = j.this.f111985a.iterator();
            while (it.hasNext()) {
                j.L(zVar, it.next().x(), i11);
            }
        }
    }

    j(@NonNull j0 j0Var, j0 j0Var2, @NonNull Set<a2> set, @NonNull p3 p3Var, @NonNull f.a aVar) {
        this.f111990f = j0Var;
        this.f111991g = j0Var2;
        this.f111989e = p3Var;
        this.f111985a = set;
        Map<a2, o3<?>> mapN = N(j0Var, set, p3Var);
        this.f111994j = mapN;
        HashSet hashSet = new HashSet(mapN.values());
        this.f111993i = hashSet;
        this.f111995k = new b(j0Var, hashSet);
        if (j0Var2 != null) {
            this.f111996l = new b(j0Var2, hashSet);
        }
        for (a2 a2Var : set) {
            this.f111988d.put(a2Var, Boolean.FALSE);
            this.f111987c.put(a2Var, new i(j0Var, this, aVar));
        }
    }

    private static int C(Set<o3<?>> set) {
        Iterator<o3<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().s(0));
        }
        return iMax;
    }

    @NonNull
    private n0 E(@NonNull a2 a2Var) {
        n0 n0Var = this.f111986b.get(a2Var);
        Objects.requireNonNull(n0Var);
        return n0Var;
    }

    private boolean F(@NonNull a2 a2Var) {
        Boolean bool = this.f111988d.get(a2Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @NonNull
    private static Range<Integer> K(@NonNull Set<o3<?>> set) {
        Range<Integer> rangeIntersect = c3.f3148a;
        Iterator<o3<?>> it = set.iterator();
        while (it.hasNext()) {
            Range<Integer> rangeO = it.next().O(rangeIntersect);
            if (c3.f3148a.equals(rangeIntersect)) {
                rangeIntersect = rangeO;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(rangeO);
                } catch (IllegalArgumentException unused) {
                    y0.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + rangeO);
                    return rangeIntersect.extend(rangeO);
                }
            }
        }
        return rangeIntersect;
    }

    static void L(@NonNull z zVar, @NonNull x2 x2Var, int i11) {
        Iterator<androidx.camera.core.impl.p> it = x2Var.j().iterator();
        while (it.hasNext()) {
            it.next().b(i11, new k(x2Var.k().j(), zVar));
        }
    }

    @NonNull
    private static Map<a2, o3<?>> N(@NonNull j0 j0Var, @NonNull Set<a2> set, @NonNull p3 p3Var) {
        HashMap map = new HashMap();
        for (a2 a2Var : set) {
            map.put(a2Var, a2Var.E(j0Var.e(), null, a2Var.l(true, p3Var)));
        }
        return map;
    }

    @NonNull
    private r0.f s(@NonNull a2 a2Var, @NonNull b bVar, @NonNull j0 j0Var, n0 n0Var, int i11, boolean z11) {
        int i12 = j0Var.c().i(i11);
        boolean zL = s.l(n0Var.r());
        o3<?> o3Var = this.f111994j.get(a2Var);
        Objects.requireNonNull(o3Var);
        Pair<Rect, Size> pairS = bVar.s(o3Var, n0Var.n(), s.g(n0Var.r()), z11);
        Rect rect = (Rect) pairS.first;
        Size size = (Size) pairS.second;
        int iW = w(a2Var, this.f111990f);
        i iVar = this.f111987c.get(a2Var);
        Objects.requireNonNull(iVar);
        iVar.r(iW);
        int iW2 = s.w((n0Var.q() + iW) - i12);
        return r0.f.h(y(a2Var), v(a2Var), rect, s.q(size, iW2), iW2, a2Var.D(j0Var) ^ zL);
    }

    private static void u(@NonNull n0 n0Var, @NonNull DeferrableSurface deferrableSurface, @NonNull x2 x2Var) {
        n0Var.v();
        try {
            n0Var.y(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            if (x2Var.d() != null) {
                x2Var.d().a(x2Var, x2.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int v(@NonNull a2 a2Var) {
        return a2Var instanceof r0 ? 256 : 34;
    }

    private int w(@NonNull a2 a2Var, @NonNull j0 j0Var) {
        return j0Var.c().i(((r1) a2Var.k()).u(0));
    }

    static DeferrableSurface x(@NonNull a2 a2Var) {
        List<DeferrableSurface> listO = a2Var instanceof r0 ? a2Var.x().o() : a2Var.x().k().i();
        u5.h.i(listO.size() <= 1);
        if (listO.size() == 1) {
            return listO.get(0);
        }
        return null;
    }

    private static int y(@NonNull a2 a2Var) {
        if (a2Var instanceof h1) {
            return 1;
        }
        return a2Var instanceof r0 ? 4 : 2;
    }

    @NonNull
    Map<a2, r0.f> A(@NonNull n0 n0Var, int i11, boolean z11) {
        HashMap map = new HashMap();
        for (a2 a2Var : this.f111985a) {
            n0 n0Var2 = n0Var;
            map.put(a2Var, s(a2Var, this.f111995k, this.f111990f, n0Var2, i11, z11));
            n0Var = n0Var2;
        }
        return map;
    }

    @NonNull
    Map<a2, q0.d> B(@NonNull n0 n0Var, @NonNull n0 n0Var2, int i11, boolean z11) {
        HashMap map = new HashMap();
        for (a2 a2Var : this.f111985a) {
            n0 n0Var3 = n0Var;
            int i12 = i11;
            boolean z12 = z11;
            r0.f fVarS = s(a2Var, this.f111995k, this.f111990f, n0Var3, i12, z12);
            b bVar = this.f111996l;
            j0 j0Var = this.f111991g;
            Objects.requireNonNull(j0Var);
            n0 n0Var4 = n0Var2;
            map.put(a2Var, q0.d.c(fVarS, s(a2Var, bVar, j0Var, n0Var4, i12, z12)));
            n0Var = n0Var3;
            n0Var2 = n0Var4;
            i11 = i12;
            z11 = z12;
        }
        return map;
    }

    @NonNull
    androidx.camera.core.impl.p D() {
        return this.f111992h;
    }

    void G(@NonNull c2 c2Var) {
        c2Var.K(r1.f3295t, this.f111995k.o(c2Var));
        c2Var.K(o3.f3270y, Integer.valueOf(C(this.f111993i)));
        b0 b0VarD = t0.a.d(this.f111993i);
        if (b0VarD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        c2Var.K(q1.f3283j, b0VarD);
        c2Var.K(o3.f3271z, K(this.f111993i));
        for (a2 a2Var : this.f111985a) {
            if (a2Var.k().r() != 0) {
                c2Var.K(o3.E, Integer.valueOf(a2Var.k().r()));
            }
            if (a2Var.k().t() != 0) {
                c2Var.K(o3.D, Integer.valueOf(a2Var.k().t()));
            }
        }
    }

    void H() {
        for (a2 a2Var : this.f111985a) {
            a2Var.N();
            a2Var.L();
        }
    }

    void I() {
        Iterator<a2> it = this.f111985a.iterator();
        while (it.hasNext()) {
            it.next().O();
        }
    }

    void J() {
        r.b();
        Iterator<a2> it = this.f111985a.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    void M(@NonNull Map<a2, n0> map) {
        this.f111986b.clear();
        this.f111986b.putAll(map);
        for (Map.Entry<a2, n0> entry : this.f111986b.entrySet()) {
            a2 key = entry.getKey();
            n0 value = entry.getValue();
            key.W(value.n());
            key.U(value.r());
            key.Z(value.s(), null);
            key.I();
        }
    }

    void O() {
        for (a2 a2Var : this.f111985a) {
            i iVar = this.f111987c.get(a2Var);
            Objects.requireNonNull(iVar);
            a2Var.X(iVar);
        }
    }

    @Override // c0.a2.b
    public void d(@NonNull a2 a2Var) {
        r.b();
        if (F(a2Var)) {
            return;
        }
        this.f111988d.put(a2Var, Boolean.TRUE);
        DeferrableSurface deferrableSurfaceX = x(a2Var);
        if (deferrableSurfaceX != null) {
            u(E(a2Var), deferrableSurfaceX, a2Var.x());
        }
    }

    @Override // c0.a2.b
    public void f(@NonNull a2 a2Var) {
        DeferrableSurface deferrableSurfaceX;
        r.b();
        n0 n0VarE = E(a2Var);
        if (F(a2Var) && (deferrableSurfaceX = x(a2Var)) != null) {
            u(n0VarE, deferrableSurfaceX, a2Var.x());
        }
    }

    @Override // c0.a2.b
    public void j(@NonNull a2 a2Var) {
        r.b();
        if (F(a2Var)) {
            this.f111988d.put(a2Var, Boolean.FALSE);
            E(a2Var).m();
        }
    }

    @Override // c0.a2.b
    public void k(@NonNull a2 a2Var) {
        r.b();
        if (F(a2Var)) {
            n0 n0VarE = E(a2Var);
            DeferrableSurface deferrableSurfaceX = x(a2Var);
            if (deferrableSurfaceX != null) {
                u(n0VarE, deferrableSurfaceX, a2Var.x());
            } else {
                n0VarE.m();
            }
        }
    }

    void r() {
        for (a2 a2Var : this.f111985a) {
            i iVar = this.f111987c.get(a2Var);
            Objects.requireNonNull(iVar);
            a2Var.c(iVar, null, null, a2Var.l(true, this.f111989e));
        }
    }

    androidx.camera.core.impl.p t() {
        return new a();
    }

    @NonNull
    Set<a2> z() {
        return this.f111985a;
    }
}
