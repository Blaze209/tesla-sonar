package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;

/* JADX INFO: loaded from: classes4.dex */
public final class V1 implements InterfaceC4227k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerDataSource f38020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f38022c;

    public V1(DocumentScannerDataSource dataSource, wn0.a<? extends Matrix> imageToScreenCoordsMatrix) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        this.f38020a = dataSource;
        this.f38021b = imageToScreenCoordsMatrix;
        this.f38022c = new Matrix();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4, com.fourthline.vision.internal.InterfaceC4234l4
    public C4165c4 contentDetectionArea() {
        RectF rectF = AbstractC4173d4.toRectF(this.f38020a.getDocumentDetectionArea());
        ((Matrix) this.f38021b.invoke()).invert(this.f38022c);
        this.f38022c.mapRect(rectF);
        return AbstractC4173d4.toRectangle(AbstractC4173d4.toIntRect(rectF));
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public boolean getShouldStartAutomatically() {
        return InterfaceC4227k4.a.getShouldStartAutomatically(this);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public DocumentScannerConfig config() {
        return this.f38020a.getConfig();
    }
}
