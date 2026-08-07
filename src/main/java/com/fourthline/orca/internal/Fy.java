package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Fy {
    public static final DocumentScannerStep a(DocumentScannerStep documentScannerStep) {
        p013kotlin.jvm.internal.s.k(documentScannerStep, "<this>");
        int index = documentScannerStep.getIndex();
        if (index == 0) {
            return DocumentScannerStep.copy$default(documentScannerStep, 0, DocumentFileSide.INSIDE_LEFT, false, false, 13, null);
        }
        if (index == 1) {
            return DocumentScannerStep.copy$default(documentScannerStep, 0, DocumentFileSide.INSIDE_RIGHT, false, false, 1, null);
        }
        if (index == 2) {
            return DocumentScannerStep.copy$default(documentScannerStep, 0, DocumentFileSide.INSIDE_LEFT, true, false, 1, null);
        }
        if (index == 3) {
            return DocumentScannerStep.copy$default(documentScannerStep, 0, DocumentFileSide.BACK, false, false, 1, null);
        }
        throw new IllegalStateException(("Unexpected Step Index for recognized type: " + DocumentType.PAPER_ID).toString());
    }
}
