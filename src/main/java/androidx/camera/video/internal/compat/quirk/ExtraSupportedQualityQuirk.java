package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.m2;
import f1.k;
import g1.m1;
import g1.o1;
import h1.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z0.e2;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements m2 {
    private Map<Integer, j1> h(@NonNull i0 i0Var, @NonNull i1 i1Var, @NonNull r.a<m1, o1> aVar) {
        j1 j1VarA;
        j1.c cVarB;
        if (!"1".equals(i0Var.d()) || i1Var.b(4) || (cVarB = c.b((j1VarA = i1Var.a(1)))) == null) {
            return null;
        }
        Range<Integer> rangeI = i(cVarB, aVar);
        Size size = o0.c.f95564d;
        j1.b bVarH = j1.b.h(j1VarA.d(), j1VarA.b(), j1VarA.c(), Collections.singletonList(c.a(cVarB, size, rangeI)));
        HashMap map = new HashMap();
        map.put(4, bVarH);
        if (o0.c.c(size) > o0.c.c(new Size(cVarB.k(), cVarB.h()))) {
            map.put(1, bVarH);
        }
        return map;
    }

    @NonNull
    private static Range<Integer> i(@NonNull j1.c cVar, @NonNull r.a<m1, o1> aVar) {
        o1 o1VarApply = aVar.apply(k.f(cVar));
        return o1VarApply != null ? o1VarApply.c() : e2.f126118b;
    }

    private static boolean j() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return j();
    }

    public Map<Integer, j1> g(@NonNull i0 i0Var, @NonNull i1 i1Var, @NonNull r.a<m1, o1> aVar) {
        return j() ? h(i0Var, i1Var, aVar) : Collections.EMPTY_MAP;
    }
}
