package com.fourthline.vision.document;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerCallback;", "", "Lcom/fourthline/vision/document/DocumentScannerError;", AnalyticsAttribute.Error, "Ljn0/h0;", "onFail", "(Lcom/fourthline/vision/document/DocumentScannerError;)V", "Lcom/fourthline/vision/document/DocumentScannerResult;", "result", "onSuccess", "(Lcom/fourthline/vision/document/DocumentScannerResult;)V", "Lcom/fourthline/vision/document/DocumentScannerStep;", "step", "onStepUpdate", "(Lcom/fourthline/vision/document/DocumentScannerStep;)V", "Lcom/fourthline/vision/document/DocumentScannerStepError;", "onStepFail", "(Lcom/fourthline/vision/document/DocumentScannerStepError;)V", "Lcom/fourthline/vision/document/DocumentScannerStepResult;", "onStepSuccess", "(Lcom/fourthline/vision/document/DocumentScannerStepResult;)V", "", "Lcom/fourthline/vision/document/DocumentScannerStepWarning;", "warnings", "onWarnings", "(Ljava/util/List;)V", "", "count", "onStepsCountUpdate", "(I)V", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DocumentScannerCallback {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onStepsCountUpdate(DocumentScannerCallback documentScannerCallback, int i11) {
        }
    }

    void onFail(DocumentScannerError error);

    void onStepFail(DocumentScannerStepError error);

    void onStepSuccess(DocumentScannerStepResult result);

    void onStepUpdate(DocumentScannerStep step);

    void onStepsCountUpdate(int count);

    void onSuccess(DocumentScannerResult result);

    void onWarnings(List<? extends DocumentScannerStepWarning> warnings);
}
