package e0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.x2;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f61289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final n0.b f61290g = new n0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final p1 f61291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.v0 f61292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final x f61293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final t0 f61294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final x.c f61295e;

    public d0(@NonNull p1 p1Var, @NonNull Size size, CameraCharacteristics cameraCharacteristics, c0.j jVar, boolean z11, Size size2, int i11) {
        h0.r.b();
        this.f61291a = p1Var;
        this.f61292b = androidx.camera.core.impl.v0.a.j(p1Var).h();
        x xVar = new x();
        this.f61293c = xVar;
        Executor executorE0 = p1Var.e0(i0.c.d());
        Objects.requireNonNull(executorE0);
        t0 t0Var = new t0(executorE0, cameraCharacteristics, jVar != null ? new p0.y(jVar) : null);
        this.f61294d = t0Var;
        ArrayList arrayList = new ArrayList();
        if (p1Var.W() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        x.c cVarO = x.c.o(size, p1Var.getInputFormat(), arrayList, z11, p1Var.d0(), size2, i11);
        this.f61295e = cVarO;
        t0Var.r(xVar.s(cVarO));
    }

    private m b(int i11, @NonNull androidx.camera.core.impl.u0 u0Var, @NonNull k1 k1Var, @NonNull z0 z0Var) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(u0Var.hashCode());
        List<androidx.camera.core.impl.w0> listA = u0Var.a();
        Objects.requireNonNull(listA);
        for (androidx.camera.core.impl.w0 w0Var : listA) {
            androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
            aVar.v(this.f61292b.k());
            aVar.e(this.f61292b.g());
            aVar.a(k1Var.q());
            aVar.f(this.f61295e.m());
            if (this.f61295e.e().size() > 1 && this.f61295e.k() != null) {
                aVar.f(this.f61295e.k());
            }
            aVar.t(l());
            if (ImageUtil.j(this.f61295e.d()) || ImageUtil.k(this.f61295e.d())) {
                if (f61290g.a()) {
                    aVar.d(androidx.camera.core.impl.v0.f3311i, Integer.valueOf(k1Var.n()));
                }
                aVar.d(androidx.camera.core.impl.v0.f3312j, Integer.valueOf(g(k1Var)));
            }
            aVar.e(w0Var.a().g());
            aVar.g(strValueOf, Integer.valueOf(w0Var.getId()));
            aVar.r(i11);
            aVar.c(this.f61295e.a());
            if (this.f61295e.e().size() > 1 && this.f61295e.j() != null) {
                aVar.c(this.f61295e.j());
            }
            arrayList.add(aVar.h());
        }
        return new m(arrayList, z0Var);
    }

    @NonNull
    private androidx.camera.core.impl.u0 c() {
        androidx.camera.core.impl.u0 u0VarZ = this.f61291a.Z(c0.y.b());
        Objects.requireNonNull(u0VarZ);
        return u0VarZ;
    }

    @NonNull
    private u0 d(int i11, @NonNull androidx.camera.core.impl.u0 u0Var, @NonNull k1 k1Var, @NonNull z0 z0Var, @NonNull com.google.common.util.concurrent.s<Void> sVar) {
        return new u0(u0Var, k1Var, z0Var, sVar, i11);
    }

    private int i() {
        Integer num = (Integer) this.f61291a.d(p1.O, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f61291a.d(q1.f3281h, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    private boolean l() {
        return this.f61295e.h() != null;
    }

    public void a() {
        h0.r.b();
        this.f61293c.n();
        this.f61294d.n();
    }

    @NonNull
    u5.d<m, u0> e(@NonNull k1 k1Var, @NonNull z0 z0Var, @NonNull com.google.common.util.concurrent.s<Void> sVar) {
        h0.r.b();
        androidx.camera.core.impl.u0 u0VarC = c();
        int i11 = f61289f;
        f61289f = i11 + 1;
        return new u5.d<>(b(i11, u0VarC, k1Var, z0Var), d(i11, u0VarC, k1Var, z0Var, sVar));
    }

    @NonNull
    public x2.b f(@NonNull Size size) {
        x2.b bVarR = x2.b.r(this.f61291a, size);
        bVarR.h(this.f61295e.m());
        if (this.f61295e.e().size() > 1 && this.f61295e.k() != null) {
            bVarR.h(this.f61295e.k());
        }
        if (this.f61295e.h() != null) {
            bVarR.y(this.f61295e.h());
        }
        return bVarR;
    }

    int g(@NonNull k1 k1Var) {
        boolean z11 = k1Var.l() != null;
        boolean zH = h0.s.h(k1Var.i(), this.f61295e.l());
        if (z11 && zH) {
            return k1Var.h() == 0 ? 100 : 95;
        }
        return k1Var.k();
    }

    public int h() {
        h0.r.b();
        return this.f61293c.i();
    }

    void j(@NonNull a1.a aVar) {
        h0.r.b();
        this.f61295e.b().accept(aVar);
    }

    public void k(@NonNull androidx.camera.core.e.a aVar) {
        h0.r.b();
        this.f61293c.r(aVar);
    }

    void m(@NonNull u0 u0Var) {
        h0.r.b();
        this.f61295e.i().accept(u0Var);
    }
}
