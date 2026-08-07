package com.fourthline.nfc.internal;

import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 implements NfcScannerCallback {
    public abstract NfcScannerStep a();

    public abstract void a(NfcScannerError nfcScannerError, Throwable th2);

    @Override // com.fourthline.nfc.NfcScannerCallback
    public void onFail(NfcScannerError error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        a(error, null);
    }
}
