package com.fourthline.vision.internal;

import com.fourthline.vision.ScannerImage;

/* JADX INFO: renamed from: com.fourthline.vision.internal.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4256o5 implements K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScannerImage f38697a;

    public C4256o5(ScannerImage image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        this.f38697a = image;
    }

    public static /* synthetic */ C4256o5 copy$default(C4256o5 c4256o5, ScannerImage scannerImage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            scannerImage = c4256o5.f38697a;
        }
        return c4256o5.copy(scannerImage);
    }

    public final ScannerImage component1() {
        return this.f38697a;
    }

    public final C4256o5 copy(ScannerImage image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return new C4256o5(image);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4256o5) && p013kotlin.jvm.internal.s.f(this.f38697a, ((C4256o5) obj).f38697a);
    }

    @Override // com.fourthline.vision.internal.K5
    public ScannerImage getImage() {
        return this.f38697a;
    }

    public int hashCode() {
        return this.f38697a.hashCode();
    }

    public String toString() {
        return "SelfieStepResult(image=" + this.f38697a + ")";
    }
}
