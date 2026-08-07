package i1;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.r2;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final i1 f74043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final r2 f74044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Map<Integer, j1> f74045e = new HashMap();

    public c(@NonNull i1 i1Var, @NonNull r2 r2Var) {
        this.f74043c = i1Var;
        this.f74044d = r2Var;
    }

    private j1 c(@NonNull j1 j1Var, @NonNull Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<j1.c> it = j1Var.e().iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return j1.b.h(j1Var.d(), j1Var.b(), j1Var.c(), arrayList);
    }

    @NonNull
    private static j1.c d(@NonNull j1.c cVar, @NonNull Size size) {
        return j1.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private Size e(int i11) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f74044d.c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.g(i11);
            }
        }
        return null;
    }

    private j1 f(int i11) {
        j1 j1VarC;
        if (this.f74045e.containsKey(Integer.valueOf(i11))) {
            return this.f74045e.get(Integer.valueOf(i11));
        }
        if (this.f74043c.b(i11)) {
            j1 j1VarA = this.f74043c.a(i11);
            Objects.requireNonNull(j1VarA);
            j1VarC = j1VarA;
            Size sizeE = e(i11);
            if (sizeE != null) {
                j1VarC = c(j1VarC, sizeE);
            }
        } else {
            j1VarC = null;
        }
        this.f74045e.put(Integer.valueOf(i11), j1VarC);
        return j1VarC;
    }

    @Override // androidx.camera.core.impl.i1
    public j1 a(int i11) {
        return f(i11);
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return this.f74043c.b(i11) && f(i11) != null;
    }
}
