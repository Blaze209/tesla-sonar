package com.fourthline.vision.document.ocr;

import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "ISSUING_COUNTRY_NOT_SUPPORTED", "DOCUMENT_TYPE_NOT_SUPPORTED", "NATIONALITY_NOT_SUPPORTED", "DOCUMENT_EXPIRED", "PERSON_NOT_ADULT", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum OcrValidationError {
    ISSUING_COUNTRY_NOT_SUPPORTED,
    DOCUMENT_TYPE_NOT_SUPPORTED,
    NATIONALITY_NOT_SUPPORTED,
    DOCUMENT_EXPIRED,
    PERSON_NOT_ADULT;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    public static EnumEntries<OcrValidationError> getEntries() {
        return $ENTRIES;
    }
}
