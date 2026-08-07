package e0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements p0.a0<p0.b0<byte[]>, p0.b0<Bitmap>> {
    e0() {
    }

    @NonNull
    private Bitmap b(@NonNull byte[] bArr, @NonNull Rect rect) throws ImageCaptureException {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e11);
        }
    }

    @Override // p0.a0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0.b0<Bitmap> apply(@NonNull p0.b0<byte[]> b0Var) throws ImageCaptureException {
        Rect rectB = b0Var.b();
        Bitmap bitmapB = b(b0Var.c(), rectB);
        h0.g gVarD = b0Var.d();
        Objects.requireNonNull(gVarD);
        return p0.b0.j(bitmapB, gVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), b0Var.f(), h0.s.v(b0Var.g(), rectB), b0Var.a());
    }
}
