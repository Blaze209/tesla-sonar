package com.fourthline.vision.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f37665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37668d;

    public E0(A0 a11, Provider provider, Provider provider2, Provider provider3) {
        this.f37665a = a11;
        this.f37666b = provider;
        this.f37667c = provider2;
        this.f37668d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P3 get() {
        return a(this.f37665a, (dy.c) this.f37666b.get(), (S3) this.f37667c.get(), (VisionDocumentScannerFeatureConfig) this.f37668d.get());
    }

    public static E0 a(A0 a11, Provider provider, Provider provider2, Provider provider3) {
        return new E0(a11, provider, provider2, provider3);
    }

    public static P3 a(A0 a11, dy.c cVar, S3 s11, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        return (P3) qj0.h.d(a11.provideOcrTextDetector(cVar, s11, visionDocumentScannerFeatureConfig));
    }
}
