package qj;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import dj.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.d f105591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f105592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e<pj.c, byte[]> f105593c;

    public c(@NonNull gj.d dVar, @NonNull e<Bitmap, byte[]> eVar, @NonNull e<pj.c, byte[]> eVar2) {
        this.f105591a = dVar;
        this.f105592b = eVar;
        this.f105593c = eVar2;
    }

    @Override // qj.e
    public fj.c<byte[]> a(@NonNull fj.c<Drawable> cVar, @NonNull h hVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f105592b.a(com.bumptech.glide.load.resource.bitmap.f.c(((BitmapDrawable) drawable).getBitmap(), this.f105591a), hVar);
        }
        if (drawable instanceof pj.c) {
            return this.f105593c.a(b(cVar), hVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    private static fj.c<pj.c> b(@NonNull fj.c<Drawable> cVar) {
        return cVar;
    }
}
