package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements dj.j<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f20858a;

    public z(q qVar) {
        this.f20858a = qVar;
    }

    private boolean e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Bitmap> a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, @NonNull dj.h hVar) {
        return this.f20858a.d(parcelFileDescriptor, i11, i12, hVar);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull dj.h hVar) {
        return e(parcelFileDescriptor) && this.f20858a.o(parcelFileDescriptor);
    }
}
