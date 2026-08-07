package v;

import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class m2 implements androidx.camera.core.impl.x2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final m2 f117116a = new m2();

    m2() {
    }

    @Override // androidx.camera.core.impl.x2.e
    public void a(@NonNull Size size, @NonNull androidx.camera.core.impl.o3<?> o3Var, @NonNull androidx.camera.core.impl.x2.b bVar) {
        androidx.camera.core.impl.x2 x2VarL = o3Var.l(null);
        androidx.camera.core.impl.x0 x0VarA0 = androidx.camera.core.impl.i2.a0();
        int iP = androidx.camera.core.impl.x2.b().p();
        if (x2VarL != null) {
            iP = x2VarL.p();
            bVar.b(x2VarL.c());
            bVar.d(x2VarL.l());
            bVar.c(x2VarL.j());
            x0VarA0 = x2VarL.f();
        }
        bVar.w(x0VarA0);
        if (o3Var instanceof androidx.camera.core.impl.l2) {
            z.p.b(size, bVar);
        }
        u.a aVar = new u.a(o3Var);
        bVar.B(aVar.b0(iP));
        bVar.f(aVar.c0(q2.b()));
        bVar.l(aVar.f0(p2.b()));
        bVar.e(w2.f(aVar.e0(y0.c())));
        bVar.C(o3Var.r());
        bVar.z(o3Var.t());
        androidx.camera.core.impl.d2 d2VarC0 = androidx.camera.core.impl.d2.c0();
        d2VarC0.K(u.a.R, aVar.d0(null));
        d2VarC0.K(u.a.M, Long.valueOf(aVar.g0(-1L)));
        bVar.g(d2VarC0);
        bVar.g(aVar.a0());
    }
}
