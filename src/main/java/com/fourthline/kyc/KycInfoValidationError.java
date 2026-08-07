package com.fourthline.kyc;

import jn0.e;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/kyc/KycInfoValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_PROVIDER", "INVALID_PERSON", "INVALID_ADDRESS", "INVALID_CONTACTS", "INVALID_SELFIE", "INVALID_DOCUMENT", "INVALID_SECONDARY_DOCUMENT", "INVALID_METADATA", "INVALID_DOCUMENTS_TO_SIGN", "INVALID_TAX_INFO", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum KycInfoValidationError {
    INVALID_PROVIDER,
    INVALID_PERSON,
    INVALID_ADDRESS,
    INVALID_CONTACTS,
    INVALID_SELFIE,
    INVALID_DOCUMENT,
    INVALID_SECONDARY_DOCUMENT,
    INVALID_METADATA,
    INVALID_DOCUMENTS_TO_SIGN,
    INVALID_TAX_INFO;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24385b = a.a(a());

    public static EnumEntries<KycInfoValidationError> getEntries() {
        return f24385b;
    }
}
