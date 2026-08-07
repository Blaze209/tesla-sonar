package e0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k implements p0.a0<p0.b0<Bitmap>, p0.b0<Bitmap>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0.y f61341a;

    k(p0.y yVar) {
        this.f61341a = yVar;
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0.b0<Bitmap> apply(@NonNull p0.b0<Bitmap> b0Var) {
        androidx.camera.core.n nVarA = this.f61341a.c(new p0.v(new y0(b0Var), 1)).a();
        Objects.requireNonNull(nVarA);
        Bitmap bitmapD = ImageUtil.d(nVarA.N0(), nVarA.getWidth(), nVarA.getHeight());
        h0.g gVarD = b0Var.d();
        Objects.requireNonNull(gVarD);
        return p0.b0.j(bitmapD, gVarD, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}
