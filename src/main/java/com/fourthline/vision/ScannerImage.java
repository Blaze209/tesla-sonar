package com.fourthline.vision;

import android.graphics.Bitmap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/fourthline/vision/ScannerImage;", "", "Landroid/graphics/Bitmap;", "full", "cropped", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "copy", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Lcom/fourthline/vision/ScannerImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "getFull", "b", "getCropped", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScannerImage {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap full;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap cropped;

    public ScannerImage(Bitmap full, Bitmap cropped) {
        s.k(full, "full");
        s.k(cropped, "cropped");
        this.full = full;
        this.cropped = cropped;
    }

    public static /* synthetic */ ScannerImage copy$default(ScannerImage scannerImage, Bitmap bitmap, Bitmap bitmap2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bitmap = scannerImage.full;
        }
        if ((i11 & 2) != 0) {
            bitmap2 = scannerImage.cropped;
        }
        return scannerImage.copy(bitmap, bitmap2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getFull() {
        return this.full;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bitmap getCropped() {
        return this.cropped;
    }

    public final ScannerImage copy(Bitmap full, Bitmap cropped) {
        s.k(full, "full");
        s.k(cropped, "cropped");
        return new ScannerImage(full, cropped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannerImage)) {
            return false;
        }
        ScannerImage scannerImage = (ScannerImage) other;
        return s.f(this.full, scannerImage.full) && s.f(this.cropped, scannerImage.cropped);
    }

    public final Bitmap getCropped() {
        return this.cropped;
    }

    public final Bitmap getFull() {
        return this.full;
    }

    public int hashCode() {
        return (this.full.hashCode() * 31) + this.cropped.hashCode();
    }

    public String toString() {
        return "ScannerImage(full=" + this.full + ", cropped=" + this.cropped + ")";
    }
}
