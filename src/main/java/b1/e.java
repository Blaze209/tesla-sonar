package b1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import c0.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e implements i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f15261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f15262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Integer, j1> f15263e = new HashMap();

    public e(@NonNull i1 i1Var, @NonNull b0 b0Var) {
        this.f15261c = i1Var;
        this.f15262d = b0Var;
    }

    private static j1 c(j1 j1Var, @NonNull b0 b0Var) {
        if (j1Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (j1.c cVar : j1Var.e()) {
            if (h1.b.f(cVar, b0Var)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return j1.b.h(j1Var.d(), j1Var.b(), j1Var.c(), arrayList);
    }

    private j1 d(int i11) {
        if (this.f15263e.containsKey(Integer.valueOf(i11))) {
            return this.f15263e.get(Integer.valueOf(i11));
        }
        if (!this.f15261c.b(i11)) {
            return null;
        }
        j1 j1VarC = c(this.f15261c.a(i11), this.f15262d);
        this.f15263e.put(Integer.valueOf(i11), j1VarC);
        return j1VarC;
    }

    @Override // androidx.camera.core.impl.i1
    public j1 a(int i11) {
        return d(i11);
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return this.f15261c.b(i11) && d(i11) != null;
    }
}
