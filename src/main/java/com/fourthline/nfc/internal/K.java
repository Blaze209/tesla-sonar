package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.NfcScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public interface K {
    void a();

    void a(NfcScannerStep nfcScannerStep, NfcScannerError nfcScannerError, Throwable th2);

    void onStepUpdate(NfcScannerStep nfcScannerStep);

    void onSuccess(NfcScannerResult nfcScannerResult);
}
