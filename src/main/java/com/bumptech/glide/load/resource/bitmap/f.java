package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class f implements fj.c<Bitmap>, fj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f20793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.d f20794b;

    public f(@NonNull Bitmap bitmap, @NonNull gj.d dVar) {
        this.f20793a = (Bitmap) xj.k.e(bitmap, "Bitmap must not be null");
        this.f20794b = (gj.d) xj.k.e(dVar, "BitmapPool must not be null");
    }

    public static f c(Bitmap bitmap, @NonNull gj.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // fj.c
    @NonNull
    public Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // fj.c
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f20793a;
    }

    @Override // fj.c
    public int getSize() {
        return xj.l.i(this.f20793a);
    }

    @Override // fj.b
    public void initialize() {
        this.f20793a.prepareToDraw();
    }

    @Override // fj.c
    public void recycle() {
        this.f20794b.c(this.f20793a);
    }
}
