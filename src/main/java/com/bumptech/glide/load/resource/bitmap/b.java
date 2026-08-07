package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class b implements dj.k<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.d f20775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj.k<Bitmap> f20776b;

    public b(gj.d dVar, dj.k<Bitmap> kVar) {
        this.f20775a = dVar;
        this.f20776b = kVar;
    }

    @Override // dj.k
    @NonNull
    public dj.c a(@NonNull dj.h hVar) {
        return this.f20776b.a(hVar);
    }

    @Override // dj.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull fj.c<BitmapDrawable> cVar, @NonNull File file, @NonNull dj.h hVar) {
        return this.f20776b.b((Bitmap) new f(cVar.get().getBitmap(), this.f20775a), file, hVar);
    }
}
