package p0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.internal.utils.ImageUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0<T> {
    @NonNull
    public static b0<Bitmap> j(@NonNull Bitmap bitmap, @NonNull h0.g gVar, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull androidx.camera.core.impl.z zVar) {
        return new b(bitmap, gVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i11, matrix, zVar);
    }

    @NonNull
    public static b0<androidx.camera.core.n> k(@NonNull androidx.camera.core.n nVar, h0.g gVar, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull androidx.camera.core.impl.z zVar) {
        return l(nVar, gVar, new Size(nVar.getWidth(), nVar.getHeight()), rect, i11, matrix, zVar);
    }

    @NonNull
    public static b0<androidx.camera.core.n> l(@NonNull androidx.camera.core.n nVar, h0.g gVar, @NonNull Size size, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull androidx.camera.core.impl.z zVar) {
        if (ImageUtil.j(nVar.getFormat())) {
            u5.h.h(gVar, "JPEG image must have Exif.");
        }
        return new b(nVar, gVar, nVar.getFormat(), size, rect, i11, matrix, zVar);
    }

    @NonNull
    public static b0<byte[]> m(@NonNull byte[] bArr, @NonNull h0.g gVar, int i11, @NonNull Size size, @NonNull Rect rect, int i12, @NonNull Matrix matrix, @NonNull androidx.camera.core.impl.z zVar) {
        return new b(bArr, gVar, i11, size, rect, i12, matrix, zVar);
    }

    @NonNull
    public abstract androidx.camera.core.impl.z a();

    @NonNull
    public abstract Rect b();

    @NonNull
    public abstract T c();

    public abstract h0.g d();

    public abstract int e();

    public abstract int f();

    @NonNull
    public abstract Matrix g();

    @NonNull
    public abstract Size h();

    public boolean i() {
        return h0.s.h(b(), h());
    }
}
