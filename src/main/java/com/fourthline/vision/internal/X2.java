package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
final class X2 implements InterfaceC4227k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentScannerDataSource f38074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DocumentScannerConfig f38076d;

    public X2(boolean z11, DocumentScannerDataSource dataSource, wn0.a<k3.n3> imageToScreenCoordsMatrixFactory) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrixFactory, "imageToScreenCoordsMatrixFactory");
        this.f38073a = z11;
        this.f38074b = dataSource;
        this.f38075c = imageToScreenCoordsMatrixFactory;
        this.f38076d = dataSource.getConfig();
    }

    private final DocumentScannerConfig get_config() {
        if (this.f38073a) {
            this.f38076d = this.f38074b.getConfig();
            this.f38073a = false;
        }
        return this.f38076d;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4, com.fourthline.vision.internal.InterfaceC4234l4
    public C4165c4 contentDetectionArea() {
        float[] fArrB = k3.n3.b((float[]) ((k3.n3) this.f38075c.invoke()).getValues().clone());
        k3.n3.f(fArrB);
        return AbstractC4173d4.toRectangle(k3.z3.a(k3.n3.h(fArrB, k3.z3.e(this.f38074b.getDocumentDetectionArea()))));
    }

    public final boolean getShouldReloadConfigOnce() {
        return this.f38073a;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public boolean getShouldStartAutomatically() {
        return this.f38074b.getShouldStartAutomatically();
    }

    public final void setShouldReloadConfigOnce(boolean z11) {
        this.f38073a = z11;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public DocumentScannerConfig config() {
        return get_config();
    }

    public /* synthetic */ X2(boolean z11, DocumentScannerDataSource documentScannerDataSource, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, documentScannerDataSource, aVar);
    }
}
