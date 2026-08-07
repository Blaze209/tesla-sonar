package z0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.i1 f126130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f126131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<c0.b0, o> f126132d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<c0.b0, o> f126133e = new HashMap();

    f1(int i11, @NonNull androidx.camera.core.impl.i0 i0Var, @NonNull r.a<g1.m1, g1.o1> aVar) {
        r.a<g1.m1, g1.o1> aVar2;
        u5.h.b(i11 == 0 || i11 == 1, "Not a supported video capabilities source: " + i11);
        androidx.camera.core.impl.i1 i1VarK = i0Var.k();
        r2 r2VarC = androidx.camera.video.internal.compat.quirk.a.c();
        androidx.camera.core.impl.i1 bVar = new i1.b(i1VarK, r2VarC, i0Var, aVar);
        if (i11 == 1) {
            aVar2 = aVar;
            bVar = new b1.h(bVar, x.b(), Collections.singleton(c0.b0.f18255d), i0Var.s(34), aVar2);
        } else {
            aVar2 = aVar;
        }
        androidx.camera.core.impl.i1 cVar = new i1.c(bVar, r2VarC);
        this.f126130b = new i1.d(i(i0Var) ? new b1.b(cVar, aVar2) : cVar, i0Var, r2VarC);
        for (c0.b0 b0Var : i0Var.b()) {
            o oVar = new o(new b1.e(this.f126130b, b0Var));
            if (!oVar.f().isEmpty()) {
                this.f126132d.put(b0Var, oVar);
            }
        }
        this.f126131c = i0Var.t();
    }

    private o g(@NonNull c0.b0 b0Var) {
        if (androidx.camera.core.impl.h1.c(b0Var, b())) {
            return new o(new b1.e(this.f126130b, b0Var));
        }
        return null;
    }

    private o h(@NonNull c0.b0 b0Var) {
        if (b0Var.e()) {
            return this.f126132d.get(b0Var);
        }
        if (this.f126133e.containsKey(b0Var)) {
            return this.f126133e.get(b0Var);
        }
        o oVarG = g(b0Var);
        this.f126133e.put(b0Var, oVarG);
        return oVarG;
    }

    private static boolean i(@NonNull androidx.camera.core.impl.i0 i0Var) {
        for (c0.b0 b0Var : i0Var.b()) {
            Integer numValueOf = Integer.valueOf(b0Var.b());
            int iA = b0Var.a();
            if (numValueOf.equals(3) && iA == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.j1
    public boolean a() {
        return this.f126131c;
    }

    @Override // z0.j1
    @NonNull
    public Set<c0.b0> b() {
        return this.f126132d.keySet();
    }

    @Override // z0.j1
    @NonNull
    public x c(@NonNull Size size, @NonNull c0.b0 b0Var) {
        o oVarH = h(b0Var);
        return oVarH == null ? x.f126363g : oVarH.c(size);
    }

    @Override // z0.j1
    public b1.i d(@NonNull Size size, @NonNull c0.b0 b0Var) {
        o oVarH = h(b0Var);
        if (oVarH == null) {
            return null;
        }
        return oVarH.b(size);
    }

    @Override // z0.j1
    public b1.i e(@NonNull x xVar, @NonNull c0.b0 b0Var) {
        o oVarH = h(b0Var);
        if (oVarH == null) {
            return null;
        }
        return oVarH.e(xVar);
    }

    @Override // z0.j1
    @NonNull
    public List<x> f(@NonNull c0.b0 b0Var) {
        o oVarH = h(b0Var);
        return oVarH == null ? new ArrayList() : oVarH.f();
    }
}
