package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a<DataType> implements dj.j<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dj.j<DataType, Bitmap> f20767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f20768b;

    public a(@NonNull Resources resources, @NonNull dj.j<DataType, Bitmap> jVar) {
        this.f20768b = (Resources) xj.k.d(resources);
        this.f20767a = (dj.j) xj.k.d(jVar);
    }

    @Override // dj.j
    public fj.c<BitmapDrawable> a(@NonNull DataType datatype, int i11, int i12, @NonNull dj.h hVar) {
        return y.c(this.f20768b, this.f20767a.a(datatype, i11, i12, hVar));
    }

    @Override // dj.j
    public boolean b(@NonNull DataType datatype, @NonNull dj.h hVar) {
        return this.f20767a.b(datatype, hVar);
    }
}
