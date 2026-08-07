package v;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class g4 extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g4 f117008c = new g4(new z.k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final z.k f117009b;

    private g4(@NonNull z.k kVar) {
        this.f117009b = kVar;
    }

    @Override // v.z0, androidx.camera.core.impl.v0.b
    public void a(@NonNull androidx.camera.core.impl.o3<?> o3Var, @NonNull androidx.camera.core.impl.v0.a aVar) {
        super.a(o3Var, aVar);
        if (!(o3Var instanceof androidx.camera.core.impl.p1)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        androidx.camera.core.impl.p1 p1Var = (androidx.camera.core.impl.p1) o3Var;
        u.a.C2464a c2464a = new u.a.C2464a();
        if (p1Var.h0()) {
            this.f117009b.a(p1Var.a0(), c2464a);
        }
        aVar.e(c2464a.a());
    }
}
