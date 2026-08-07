package com.fourthline.vision.document;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/fourthline/vision/document/DocumentScanner;", "", "Ljn0/h0;", "startScanner", "()V", "takeSnapshot", "resetCurrentStep", "moveToNextStep", "Landroid/view/View;", "getOverlayView", "()Landroid/view/View;", "Lcom/fourthline/vision/document/DocumentScannerStep;", "getStep", "()Lcom/fourthline/vision/document/DocumentScannerStep;", "step", "", "getStepsCount", "()Ljava/lang/Integer;", "stepsCount", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DocumentScanner {
    View getOverlayView();

    DocumentScannerStep getStep();

    Integer getStepsCount();

    void moveToNextStep();

    void resetCurrentStep();

    void startScanner();

    void takeSnapshot();
}
