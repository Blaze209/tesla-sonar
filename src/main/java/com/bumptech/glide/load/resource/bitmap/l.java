package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f20810b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(dj.e.f60683a);

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f20810b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.g
    protected Bitmap c(@NonNull gj.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return d0.d(dVar, bitmap, i11, i12);
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // dj.e
    public int hashCode() {
        return 1101716364;
    }
}
