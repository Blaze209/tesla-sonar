package com.fourthline.nfc;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/nfc/NfcScannerStep;", "", "<init>", "(Ljava/lang/String;I)V", "LOOKING_FOR_DOCUMENT", "CONNECTING_TO_DOCUMENT", "AUTHENTICATING", "READING_DATA", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum NfcScannerStep {
    LOOKING_FOR_DOCUMENT,
    CONNECTING_TO_DOCUMENT,
    AUTHENTICATING,
    READING_DATA;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24474b = on0.a.a(a());

    public static EnumEntries<NfcScannerStep> getEntries() {
        return f24474b;
    }
}
