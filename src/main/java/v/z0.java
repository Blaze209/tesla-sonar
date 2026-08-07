package v;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class z0 implements androidx.camera.core.impl.v0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final z0 f117419a = new z0();

    z0() {
    }

    @Override // androidx.camera.core.impl.v0.b
    public void a(@NonNull androidx.camera.core.impl.o3<?> o3Var, @NonNull androidx.camera.core.impl.v0.a aVar) {
        androidx.camera.core.impl.v0 v0VarL = o3Var.L(null);
        androidx.camera.core.impl.x0 x0VarA0 = androidx.camera.core.impl.i2.a0();
        int iK = androidx.camera.core.impl.v0.b().k();
        if (v0VarL != null) {
            iK = v0VarL.k();
            aVar.a(v0VarL.c());
            x0VarA0 = v0VarL.g();
        }
        aVar.s(x0VarA0);
        u.a aVar2 = new u.a(o3Var);
        aVar.v(aVar2.b0(iK));
        aVar.c(w2.f(aVar2.e0(y0.c())));
        aVar.e(aVar2.a0());
    }
}
