package com.fourthline.vision.selfie;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerCallback;", "", "Lcom/fourthline/vision/selfie/SelfieScannerError;", AnalyticsAttribute.Error, "Ljn0/h0;", "onFail", "(Lcom/fourthline/vision/selfie/SelfieScannerError;)V", "Lcom/fourthline/vision/selfie/SelfieScannerResult;", "result", "onSuccess", "(Lcom/fourthline/vision/selfie/SelfieScannerResult;)V", "", "Lcom/fourthline/vision/selfie/SelfieScannerWarning;", "warnings", "onWarnings", "(Ljava/util/List;)V", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "step", "onStepUpdate", "(Lcom/fourthline/vision/selfie/SelfieScannerStep;)V", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SelfieScannerCallback {
    void onFail(SelfieScannerError error);

    void onStepUpdate(SelfieScannerStep step);

    void onSuccess(SelfieScannerResult result);

    void onWarnings(List<? extends SelfieScannerWarning> warnings);
}
