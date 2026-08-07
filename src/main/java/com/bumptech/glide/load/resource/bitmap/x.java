package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements dj.j<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f20855a = new e();

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull dj.h hVar) {
        return this.f20855a.c(ImageDecoder.createSource(xj.a.b(inputStream)), i11, i12, hVar);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull dj.h hVar) {
        return true;
    }
}
