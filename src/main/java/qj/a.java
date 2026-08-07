package qj;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import dj.h;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f105588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f105589b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // qj.e
    public fj.c<byte[]> a(@NonNull fj.c<Bitmap> cVar, @NonNull h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f105588a, this.f105589b, byteArrayOutputStream);
        cVar.recycle();
        return new mj.b(byteArrayOutputStream.toByteArray());
    }

    public a(@NonNull Bitmap.CompressFormat compressFormat, int i11) {
        this.f105588a = compressFormat;
        this.f105589b = i11;
    }
}
