package com.fourthline.vision.selfie;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScanner;", "", "step", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "getStep", "()Lcom/fourthline/vision/selfie/SelfieScannerStep;", "getOverlayView", "Landroid/view/View;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SelfieScanner {
    View getOverlayView();

    SelfieScannerStep getStep();
}
