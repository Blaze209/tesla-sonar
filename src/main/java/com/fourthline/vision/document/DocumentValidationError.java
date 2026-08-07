package com.fourthline.vision.document;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/vision/document/DocumentValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "ISSUING_COUNTRY_NOT_SUPPORTED", "DOCUMENT_TYPE_NOT_SUPPORTED", "NATIONALITY_NOT_SUPPORTED", "DOCUMENT_EXPIRED", "PERSON_NOT_ADULT", "DOCUMENT_TYPE_INVALID", "MRZ_NOT_VALID", "MRZ_NOT_DETECTED", "PHOTO_DETECTED", "PHOTO_NOT_DETECTED", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DocumentValidationError {
    ISSUING_COUNTRY_NOT_SUPPORTED,
    DOCUMENT_TYPE_NOT_SUPPORTED,
    NATIONALITY_NOT_SUPPORTED,
    DOCUMENT_EXPIRED,
    PERSON_NOT_ADULT,
    DOCUMENT_TYPE_INVALID,
    MRZ_NOT_VALID,
    MRZ_NOT_DETECTED,
    PHOTO_DETECTED,
    PHOTO_NOT_DETECTED;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37600b = on0.a.a(values());

    public static EnumEntries<DocumentValidationError> getEntries() {
        return f37600b;
    }
}
