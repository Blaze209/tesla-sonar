package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerDataSource;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4228k5 implements InterfaceC4227k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerDataSource f38508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f38509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38510c;

    public C4228k5(SelfieScannerDataSource dataSource, Matrix screenToImageCoordsMatrix, wn0.a<? extends Matrix> imageToScreenCoordsMatrix) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        p013kotlin.jvm.internal.s.k(screenToImageCoordsMatrix, "screenToImageCoordsMatrix");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        this.f38508a = dataSource;
        this.f38509b = screenToImageCoordsMatrix;
        this.f38510c = imageToScreenCoordsMatrix;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4, com.fourthline.vision.internal.InterfaceC4234l4
    public C4165c4 contentDetectionArea() {
        RectF rectF = AbstractC4173d4.toRectF(this.f38508a.getFaceDetectionArea());
        ((Matrix) this.f38510c.invoke()).invert(this.f38509b);
        this.f38509b.mapRect(rectF);
        return AbstractC4173d4.toRectangle(AbstractC4173d4.toIntRect(rectF));
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public boolean getShouldStartAutomatically() {
        return InterfaceC4227k4.a.getShouldStartAutomatically(this);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4227k4
    public SelfieScannerConfig config() {
        return this.f38508a.getConfig();
    }

    public /* synthetic */ C4228k5(SelfieScannerDataSource selfieScannerDataSource, Matrix matrix, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(selfieScannerDataSource, (i11 & 2) != 0 ? new Matrix() : matrix, aVar);
    }
}
