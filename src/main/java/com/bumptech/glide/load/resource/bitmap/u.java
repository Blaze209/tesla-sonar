package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class u extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f20837b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(dj.e.f60683a);

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f20837b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.g
    protected Bitmap c(@NonNull gj.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return d0.f(dVar, bitmap, i11, i12);
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // dj.e
    public int hashCode() {
        return 1572326941;
    }
}
