package com.fourthline.vision.internal;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.fourthline.vision.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4236m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f38546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38547b;

    public C4236m(Bitmap bitmap, int i11) {
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        this.f38546a = bitmap;
        this.f38547b = i11;
    }

    public static /* synthetic */ C4236m copy$default(C4236m c4236m, Bitmap bitmap, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bitmap = c4236m.f38546a;
        }
        if ((i12 & 2) != 0) {
            i11 = c4236m.f38547b;
        }
        return c4236m.copy(bitmap, i11);
    }

    public final Bitmap component1() {
        return this.f38546a;
    }

    public final int component2() {
        return this.f38547b;
    }

    public final C4236m copy(Bitmap bitmap, int i11) {
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        return new C4236m(bitmap, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4236m)) {
            return false;
        }
        C4236m c4236m = (C4236m) obj;
        return p013kotlin.jvm.internal.s.f(this.f38546a, c4236m.f38546a) && this.f38547b == c4236m.f38547b;
    }

    public final Bitmap getBitmap() {
        return this.f38546a;
    }

    public final int getRotationDegrees() {
        return this.f38547b;
    }

    public int hashCode() {
        return (this.f38546a.hashCode() * 31) + Integer.hashCode(this.f38547b);
    }

    public String toString() {
        return "BitmapWithRotation(bitmap=" + this.f38546a + ", rotationDegrees=" + this.f38547b + ")";
    }
}
