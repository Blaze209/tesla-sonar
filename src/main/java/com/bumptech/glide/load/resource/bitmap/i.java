package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements dj.j<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f20807a = new e();

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull dj.h hVar) {
        return this.f20807a.c(ImageDecoder.createSource(byteBuffer), i11, i12, hVar);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull dj.h hVar) {
        return true;
    }
}
