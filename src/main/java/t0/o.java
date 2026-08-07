package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.v0;
import com.google.common.util.concurrent.s;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f112005c;

    o(@NonNull CameraControlInternal cameraControlInternal, @NonNull f.a aVar) {
        super(cameraControlInternal);
        this.f112005c = aVar;
    }

    private int t(@NonNull v0 v0Var) {
        Integer num = (Integer) v0Var.g().d(v0.f3312j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int u(@NonNull v0 v0Var) {
        Integer num = (Integer) v0Var.g().d(v0.f3311i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.l1, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public s<List<Void>> d(@NonNull final List<v0> list, int i11, int i12) {
        u5.h.b(list.size() == 1, "Only support one capture config.");
        final s<e0.l> sVarO = o(i11, i12);
        return j0.n.k(Collections.singletonList(j0.d.a(sVarO).f(new j0.a() { // from class: t0.l
            @Override // j0.a
            public final s apply(Object obj) {
                return ((e0.l) sVarO.get()).a();
            }
        }, i0.c.b()).f(new j0.a() { // from class: t0.m
            @Override // j0.a
            public final s apply(Object obj) {
                o oVar = this.f112002a;
                List list2 = list;
                return oVar.f112005c.a(oVar.t((v0) list2.get(0)), oVar.u((v0) list2.get(0)));
            }
        }, i0.c.b()).f(new j0.a() { // from class: t0.n
            @Override // j0.a
            public final s apply(Object obj) {
                return ((e0.l) sVarO.get()).b();
            }
        }, i0.c.b())));
    }
}
