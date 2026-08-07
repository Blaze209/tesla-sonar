package i1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.r2;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import g1.m1;
import g1.o1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public class b implements i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f74041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Integer, j1> f74042d;

    public b(@NonNull i1 i1Var, @NonNull r2 r2Var, @NonNull i0 i0Var, @NonNull r.a<m1, o1> aVar) {
        this.f74041c = i1Var;
        List listC = r2Var.c(ExtraSupportedQualityQuirk.class);
        if (listC.isEmpty()) {
            return;
        }
        h.i(listC.size() == 1);
        Map<Integer, j1> mapG = ((ExtraSupportedQualityQuirk) listC.get(0)).g(i0Var, i1Var, aVar);
        if (mapG != null) {
            this.f74042d = new HashMap(mapG);
        }
    }

    private j1 c(int i11) {
        Map<Integer, j1> map = this.f74042d;
        return (map == null || !map.containsKey(Integer.valueOf(i11))) ? this.f74041c.a(i11) : this.f74042d.get(Integer.valueOf(i11));
    }

    @Override // androidx.camera.core.impl.i1
    public j1 a(int i11) {
        return c(i11);
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return c(i11) != null;
    }
}
