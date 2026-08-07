package e0;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements p0.a0<p0.b0<byte[]>, p0.b0<androidx.camera.core.n>> {
    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0.b0<androidx.camera.core.n> apply(@NonNull p0.b0<byte[]> b0Var) {
        androidx.camera.core.q qVar = new androidx.camera.core.q(androidx.camera.core.o.a(b0Var.h().getWidth(), b0Var.h().getHeight(), 256, 2));
        androidx.camera.core.n nVarE = ImageProcessingUtil.e(qVar, b0Var.c());
        qVar.j();
        Objects.requireNonNull(nVarE);
        h0.g gVarD = b0Var.d();
        Objects.requireNonNull(gVarD);
        return p0.b0.k(nVarE, gVarD, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}
