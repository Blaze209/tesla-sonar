package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C4148a3 implements InterfaceC4227k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerConfig f38134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38136c;

    public C4148a3(SelfieScannerConfig config, wn0.a<j3.i> faceDetectionAreaProvider, wn0.a<k3.n3> imageToScreenCoordsMatrixFactory) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrixFactory, "imageToScreenCoordsMatrixFactory");
        this.f38134a = config;
        this.f38135b = faceDetectionAreaProvider;
        this.f38136c = imageToScreenCoordsMatrixFactory;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4, com.fourthline.vision.internal.InterfaceC4234l4
    public C4165c4 contentDetectionArea() {
        float[] fArrB = k3.n3.b((float[]) ((k3.n3) this.f38136c.invoke()).getValues().clone());
        k3.n3.f(fArrB);
        return AbstractC4173d4.toRectangle(k3.z3.a(k3.n3.h(fArrB, (j3.i) this.f38135b.invoke())));
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public boolean getShouldStartAutomatically() {
        return InterfaceC4227k4.a.getShouldStartAutomatically(this);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public SelfieScannerConfig config() {
        return this.f38134a;
    }
}
