package e0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements p0.a0<p0.b0<androidx.camera.core.n>, Bitmap> {
    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(@NonNull p0.b0<androidx.camera.core.n> b0Var) throws Throwable {
        androidx.camera.core.q qVar;
        Bitmap bitmapM;
        androidx.camera.core.q qVar2 = null;
        try {
            try {
                if (b0Var.e() == 35) {
                    androidx.camera.core.n nVarC = b0Var.c();
                    boolean z11 = b0Var.f() % 180 != 0;
                    qVar = new androidx.camera.core.q(androidx.camera.core.o.a(z11 ? nVarC.getHeight() : nVarC.getWidth(), z11 ? nVarC.getWidth() : nVarC.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.n nVarG = ImageProcessingUtil.g(nVarC, qVar, ByteBuffer.allocateDirect(nVarC.getWidth() * nVarC.getHeight() * 4), b0Var.f(), false);
                        nVarC.close();
                        if (nVarG == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapM = ImageUtil.b(nVarG);
                        nVarG.close();
                    } catch (UnsupportedOperationException e11) {
                        e = e11;
                        throw new ImageCaptureException(0, "Can't convert " + (b0Var.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        qVar2 = qVar;
                        if (qVar2 != null) {
                            qVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (b0Var.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b0Var.e());
                    }
                    androidx.camera.core.n nVarC2 = b0Var.c();
                    Bitmap bitmapB = ImageUtil.b(nVarC2);
                    nVarC2.close();
                    qVar = null;
                    bitmapM = ImageUtil.m(bitmapB, b0Var.f());
                }
                if (qVar != null) {
                    qVar.close();
                }
                return bitmapM;
            } catch (UnsupportedOperationException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
