package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements fj.c<BitmapDrawable>, fj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f20856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fj.c<Bitmap> f20857b;

    private y(@NonNull Resources resources, @NonNull fj.c<Bitmap> cVar) {
        this.f20856a = (Resources) xj.k.d(resources);
        this.f20857b = (fj.c) xj.k.d(cVar);
    }

    public static fj.c<BitmapDrawable> c(@NonNull Resources resources, fj.c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new y(resources, cVar);
    }

    @Override // fj.c
    @NonNull
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // fj.c
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f20856a, this.f20857b.get());
    }

    @Override // fj.c
    public int getSize() {
        return this.f20857b.getSize();
    }

    @Override // fj.b
    public void initialize() {
        fj.c<Bitmap> cVar = this.f20857b;
        if (cVar instanceof fj.b) {
            ((fj.b) cVar).initialize();
        }
    }

    @Override // fj.c
    public void recycle() {
        this.f20857b.recycle();
    }
}
