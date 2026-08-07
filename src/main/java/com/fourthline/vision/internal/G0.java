package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class G0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f37710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37711b;

    public G0(A0 a11, Provider provider) {
        this.f37710a = a11;
        this.f37711b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dy.c get() {
        return a(this.f37710a, (VisionDocumentScannerFeatureConfig) this.f37711b.get());
    }

    public static G0 a(A0 a11, Provider provider) {
        return new G0(a11, provider);
    }

    public static dy.c a(A0 a11, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        return (dy.c) qj0.h.d(a11.provideTextRecognizer(visionDocumentScannerFeatureConfig));
    }
}
