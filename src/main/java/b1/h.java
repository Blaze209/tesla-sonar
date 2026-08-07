package b1;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import c0.b0;
import f1.k;
import g1.m1;
import g1.o1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import z0.o;
import z0.x;

/* JADX INFO: loaded from: classes.dex */
public class h implements i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f15266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<x> f15267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<Size> f15268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<b0> f15269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r.a<m1, o1> f15270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Integer, j1> f15271h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<b0, o> f15272i = new HashMap();

    public h(@NonNull i1 i1Var, @NonNull Collection<x> collection, @NonNull Collection<b0> collection2, @NonNull Collection<Size> collection3, @NonNull r.a<m1, o1> aVar) {
        c(collection2);
        this.f15266c = i1Var;
        this.f15267d = new HashSet(collection);
        this.f15269f = new HashSet(collection2);
        this.f15268e = new HashSet(collection3);
        this.f15270g = aVar;
    }

    private static void c(@NonNull Collection<b0> collection) {
        for (b0 b0Var : collection) {
            if (!b0Var.e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + b0Var);
            }
        }
    }

    private j1 d(@NonNull x.b bVar) {
        i iVarB;
        u5.h.a(this.f15267d.contains(bVar));
        j1 j1VarA = this.f15266c.a(bVar.e());
        for (Size size : bVar.d()) {
            if (this.f15268e.contains(size)) {
                TreeMap treeMap = new TreeMap(new h0.e());
                ArrayList arrayList = new ArrayList();
                for (b0 b0Var : this.f15269f) {
                    if (!i(j1VarA, b0Var) && (iVarB = f(b0Var).b(size)) != null) {
                        j1.c cVarK = iVarB.k();
                        o1 o1VarApply = this.f15270g.apply(k.f(cVarK));
                        if (o1VarApply != null && o1VarApply.b(size.getWidth(), size.getHeight())) {
                            treeMap.put(new Size(cVarK.k(), cVarK.h()), iVarB);
                            arrayList.add(h1.c.a(cVarK, size, o1VarApply.c()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    j1 j1Var = (j1) o0.c.a(size, treeMap);
                    Objects.requireNonNull(j1Var);
                    j1 j1Var2 = j1Var;
                    return j1.b.h(j1Var2.d(), j1Var2.b(), j1Var2.c(), arrayList);
                }
            }
        }
        return null;
    }

    private x.b e(int i11) {
        Iterator<x> it = this.f15267d.iterator();
        while (it.hasNext()) {
            x.b bVar = (x.b) it.next();
            if (bVar.e() == i11) {
                return bVar;
            }
        }
        return null;
    }

    @NonNull
    private o f(@NonNull b0 b0Var) {
        if (this.f15272i.containsKey(b0Var)) {
            o oVar = this.f15272i.get(b0Var);
            Objects.requireNonNull(oVar);
            return oVar;
        }
        o oVar2 = new o(new e(this.f15266c, b0Var));
        this.f15272i.put(b0Var, oVar2);
        return oVar2;
    }

    private j1 g(int i11) {
        if (this.f15271h.containsKey(Integer.valueOf(i11))) {
            return this.f15271h.get(Integer.valueOf(i11));
        }
        j1 j1VarA = this.f15266c.a(i11);
        x.b bVarE = e(i11);
        if (bVarE != null && !h(j1VarA)) {
            j1VarA = j(j1VarA, d(bVarE));
        }
        this.f15271h.put(Integer.valueOf(i11), j1VarA);
        return j1VarA;
    }

    private boolean h(j1 j1Var) {
        if (j1Var == null) {
            return false;
        }
        Iterator<b0> it = this.f15269f.iterator();
        while (it.hasNext()) {
            if (!i(j1Var, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean i(j1 j1Var, @NonNull b0 b0Var) {
        if (j1Var == null) {
            return false;
        }
        Iterator<j1.c> it = j1Var.e().iterator();
        while (it.hasNext()) {
            if (h1.b.f(it.next(), b0Var)) {
                return true;
            }
        }
        return false;
    }

    private static j1 j(j1 j1Var, j1 j1Var2) {
        if (j1Var == null && j1Var2 == null) {
            return null;
        }
        int iD = j1Var != null ? j1Var.d() : j1Var2.d();
        int iB = j1Var != null ? j1Var.b() : j1Var2.b();
        List<j1.a> listC = j1Var != null ? j1Var.c() : j1Var2.c();
        ArrayList arrayList = new ArrayList();
        if (j1Var != null) {
            arrayList.addAll(j1Var.e());
        }
        if (j1Var2 != null) {
            arrayList.addAll(j1Var2.e());
        }
        return j1.b.h(iD, iB, listC, arrayList);
    }

    @Override // androidx.camera.core.impl.i1
    public j1 a(int i11) {
        return g(i11);
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return g(i11) != null;
    }
}
