package e0;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.r2;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class b0 implements p0.a0<a, p0.b0<byte[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0.d f61280a;

    static abstract class a {
        a() {
        }

        @NonNull
        static a c(@NonNull p0.b0<androidx.camera.core.n> b0Var, int i11) {
            return new d(b0Var, i11);
        }

        abstract int a();

        abstract p0.b0<androidx.camera.core.n> b();
    }

    b0(@NonNull r2 r2Var) {
        this.f61280a = new n0.d(r2Var);
    }

    private static h0.g b(@NonNull byte[] bArr) throws ImageCaptureException {
        try {
            return h0.g.k(new ByteArrayInputStream(bArr));
        } catch (IOException e11) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e11);
        }
    }

    private p0.b0<byte[]> c(@NonNull a aVar, int i11) {
        p0.b0<androidx.camera.core.n> b0VarB = aVar.b();
        byte[] bArrA = this.f61280a.a(b0VarB.c());
        h0.g gVarD = b0VarB.d();
        Objects.requireNonNull(gVarD);
        return p0.b0.m(bArrA, gVarD, i11, b0VarB.h(), b0VarB.b(), b0VarB.f(), b0VarB.g(), b0VarB.a());
    }

    private p0.b0<byte[]> d(@NonNull a aVar) throws ImageCaptureException {
        p0.b0<androidx.camera.core.n> b0VarB = aVar.b();
        androidx.camera.core.n nVarC = b0VarB.c();
        Rect rectB = b0VarB.b();
        try {
            byte[] bArrN = ImageUtil.n(nVarC, rectB, aVar.a(), b0VarB.f());
            return p0.b0.m(bArrN, b(bArrN), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), b0VarB.f(), h0.s.v(b0VarB.g(), rectB), b0VarB.a());
        } catch (ImageUtil.CodecFailedException e11) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e11);
        }
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0.b0<byte[]> apply(@NonNull a aVar) {
        p0.b0<byte[]> b0VarD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                b0VarD = c(aVar, iE);
            } else {
                b0VarD = d(aVar);
            }
            aVar.b().c().close();
            return b0VarD;
        } catch (Throwable th2) {
            aVar.b().c().close();
            throw th2;
        }
    }
}
