package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.NfcScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerCallback f24726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f24727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NfcScannerStep f24728c;

    public u0(NfcScannerCallback callback, K nfcAnalytics) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(nfcAnalytics, "nfcAnalytics");
        this.f24726a = callback;
        this.f24727b = nfcAnalytics;
        nfcAnalytics.a();
    }

    @Override // com.fourthline.nfc.internal.v0
    public NfcScannerStep a() {
        NfcScannerStep nfcScannerStep = this.f24728c;
        return nfcScannerStep != null ? nfcScannerStep : NfcScannerStep.LOOKING_FOR_DOCUMENT;
    }

    @Override // com.fourthline.nfc.NfcScannerCallback
    public void onStepUpdate(NfcScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        this.f24728c = step;
        this.f24727b.onStepUpdate(step);
        this.f24726a.onStepUpdate(step);
    }

    @Override // com.fourthline.nfc.NfcScannerCallback
    public void onSuccess(NfcScannerResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        this.f24727b.onSuccess(result);
        this.f24726a.onSuccess(result);
    }

    @Override // com.fourthline.nfc.internal.v0
    public void a(NfcScannerError error, Throwable th2) {
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f24727b.a(a(), error, th2);
        this.f24726a.onFail(error);
    }
}
