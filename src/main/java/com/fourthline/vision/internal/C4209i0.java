package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4209i0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f38394a;

    public C4209i0(L l11) {
        this.f38394a = l11;
    }

    public static VisionDocumentScannerFeatureConfig b(L l11) {
        return (VisionDocumentScannerFeatureConfig) qj0.h.d(l11.providesFeatureConfig$fourthline_vision_release());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VisionDocumentScannerFeatureConfig get() {
        return b(this.f38394a);
    }

    public static C4209i0 a(L l11) {
        return new C4209i0(l11);
    }
}
