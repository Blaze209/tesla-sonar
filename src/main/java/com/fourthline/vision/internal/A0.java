package com.fourthline.vision.internal;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 {
    public final InterfaceC4287t2 provideAccurateFaceDetector(zx.d detector, S3 playServicesAvailabilityDataSource) {
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        return new C4152b(detector, playServicesAvailabilityDataSource);
    }

    public final sx.a provideBarcodeScanner() {
        sx.a aVarA = sx.c.a();
        p013kotlin.jvm.internal.s.j(aVarA, "getClient(...)");
        return aVarA;
    }

    public final InterfaceC4287t2 provideFastFaceDetector(zx.d detector, S3 playServicesAvailabilityDataSource) {
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        return new A2(detector, playServicesAvailabilityDataSource);
    }

    public final zx.d provideMlKitAccurateFaceDetector() {
        zx.d dVarA = zx.c.a(new zx.e.a().f(2).d(2).c(2).b(2).a());
        p013kotlin.jvm.internal.s.j(dVarA, "getClient(...)");
        return dVarA;
    }

    public final zx.d provideMlKitFastFaceDetector(C4213i4 scannerConfig) {
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        zx.d dVarA = zx.c.a(new zx.e.a().f(1).d(1).c(1).b(2).e(scannerConfig.getFastFaceDetectorMinFaceSize()).a());
        p013kotlin.jvm.internal.s.j(dVarA, "getClient(...)");
        return dVarA;
    }

    public final P3 provideOcrTextDetector(dy.c textRecognizer, S3 playServicesAvailabilityDataSource, VisionDocumentScannerFeatureConfig featureConfig) {
        p013kotlin.jvm.internal.s.k(textRecognizer, "textRecognizer");
        p013kotlin.jvm.internal.s.k(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        return new P3(textRecognizer, new B3(null, 1, null), new I3(new C4330z3(), new K3()), playServicesAvailabilityDataSource, featureConfig.isAutoDetectFallbackEnabled() ? P3.a.DISABLE : P3.a.FAIL);
    }

    public final W3 provideQrCodeTextDetector(sx.a barcodeScanner, S3 playServicesAvailabilityDataSource) {
        p013kotlin.jvm.internal.s.k(barcodeScanner, "barcodeScanner");
        p013kotlin.jvm.internal.s.k(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        return new W3(barcodeScanner, playServicesAvailabilityDataSource);
    }

    public final dy.c provideTextRecognizer(VisionDocumentScannerFeatureConfig featureConfig) {
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        try {
            return dy.b.a(fy.a.f66714d);
        } catch (MlKitException unused) {
            return new J0();
        }
    }
}
