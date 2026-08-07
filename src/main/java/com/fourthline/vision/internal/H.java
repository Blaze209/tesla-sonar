package com.fourthline.vision.internal;

import android.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4312x f37736a;

    public H(C4312x cameraInfoProvider) {
        p013kotlin.jvm.internal.s.k(cameraInfoProvider, "cameraInfoProvider");
        this.f37736a = cameraInfoProvider;
    }

    @Override // com.fourthline.vision.internal.r6
    public Size getImageReaderSize() {
        return this.f37736a.getImageReaderSize();
    }

    @Override // com.fourthline.vision.internal.r6
    public int getOrientationHint() {
        return this.f37736a.getOrientationHint();
    }

    @Override // com.fourthline.vision.internal.r6
    public Size getPreviewSize() {
        return this.f37736a.getCameraPreviewSize();
    }
}
