package com.fourthline.nfc;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/nfc/NfcScannerError;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTION_LOST", "AUTHENTICATION_FAILED", "UNKNOWN", "NFC_NOT_ENABLED", "NFC_NOT_SUPPORTED", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum NfcScannerError {
    CONNECTION_LOST,
    AUTHENTICATION_FAILED,
    UNKNOWN,
    NFC_NOT_ENABLED,
    NFC_NOT_SUPPORTED;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24463b = on0.a.a(a());

    public static EnumEntries<NfcScannerError> getEntries() {
        return f24463b;
    }
}
