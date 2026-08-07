package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class k0 implements p0.a0<t0.b, p0.b0<androidx.camera.core.n>> {
    k0() {
    }

    private static p0.b0<androidx.camera.core.n> b(@NonNull u0 u0Var, h0.g gVar, @NonNull androidx.camera.core.n nVar) {
        return p0.b0.k(nVar, gVar, u0Var.b(), u0Var.f(), u0Var.h(), d(nVar));
    }

    private static p0.b0<androidx.camera.core.n> c(@NonNull u0 u0Var, @NonNull h0.g gVar, @NonNull androidx.camera.core.n nVar) {
        Size size = new Size(nVar.getWidth(), nVar.getHeight());
        int iF = u0Var.f() - gVar.s();
        Size sizeE = e(iF, size);
        Matrix matrixD = h0.s.d(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, sizeE.getWidth(), sizeE.getHeight()), iF);
        return p0.b0.l(nVar, gVar, sizeE, f(u0Var.b(), matrixD), gVar.s(), g(u0Var.h(), matrixD), d(nVar));
    }

    private static androidx.camera.core.impl.z d(@NonNull androidx.camera.core.n nVar) {
        return nVar.z() instanceof k0.b ? ((k0.b) nVar.z()).f() : androidx.camera.core.impl.z.a.l();
    }

    private static Size e(int i11, Size size) {
        return h0.s.i(h0.s.w(i11)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    @NonNull
    private static Rect f(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @NonNull
    private static Matrix g(@NonNull Matrix matrix, @NonNull Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0.b0<androidx.camera.core.n> apply(@NonNull t0.b bVar) throws ImageCaptureException {
        h0.g gVarJ;
        androidx.camera.core.n nVarA = bVar.a();
        u0 u0VarB = bVar.b();
        if (ImageUtil.j(nVarA.getFormat())) {
            try {
                gVarJ = h0.g.j(nVarA);
                nVarA.N0()[0].l().rewind();
            } catch (IOException e11) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e11);
            }
        } else {
            gVarJ = null;
        }
        if (!d0.f61290g.b(nVarA)) {
            return b(u0VarB, gVarJ, nVarA);
        }
        u5.h.h(gVarJ, "JPEG image must have exif.");
        return c(u0VarB, gVarJ, nVarA);
    }
}
