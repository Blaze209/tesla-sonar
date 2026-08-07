package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3367i0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3798s4 b(DocumentScannerStep documentScannerStep) {
        return new C3798s4(documentScannerStep.getFileSide(), documentScannerStep.isAngled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3893uD b(DocumentRecognitionData documentRecognitionData) {
        DocumentRecognitionValue value = documentRecognitionData.getValue();
        return new C3893uD(value != null ? new C4023xD(value.getIssuingCountry(), value.getDocumentType(), null, value.getDocumentSide(), 4, null) : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3936vD b(Gz gz2) {
        String strB = gz2.b();
        if (strB != null) {
            return new C3936vD(strB, gz2.a(), gz2.c().getFileSide(), Boolean.valueOf(gz2.c().isAngled()));
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strB) + " must not be null."))).toString());
    }
}
