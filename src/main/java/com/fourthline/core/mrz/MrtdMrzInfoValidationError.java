package com.fourthline.core.mrz;

import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/mrz/MrtdMrzInfoValidationError;", "Lcom/fourthline/core/mrz/ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_DOCUMENT_CODE", "INVALID_ISSUING_COUNTRY", "INVALID_DOCUMENT_NUMBER", "INVALID_EXPIRATION_DATE", "INVALID_FIRST_NAMES", "INVALID_LAST_NAMES", "TRUNCATED_NAMES", "INVALID_BIRTH_DATE", "INVALID_NATIONALITY", "INVALID_GENDER", "INVALID_TOTAL_CHECKSUM", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum MrtdMrzInfoValidationError implements ValidationError {
    INVALID_DOCUMENT_CODE,
    INVALID_ISSUING_COUNTRY,
    INVALID_DOCUMENT_NUMBER,
    INVALID_EXPIRATION_DATE,
    INVALID_FIRST_NAMES,
    INVALID_LAST_NAMES,
    TRUNCATED_NAMES,
    INVALID_BIRTH_DATE,
    INVALID_NATIONALITY,
    INVALID_GENDER,
    INVALID_TOTAL_CHECKSUM;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24197b = a.a(a());

    public static EnumEntries<MrtdMrzInfoValidationError> getEntries() {
        return f24197b;
    }
}
