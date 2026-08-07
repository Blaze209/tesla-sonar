package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.sdk.R;
import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public final class Nq implements InterfaceC3511lb {
    @Override // com.fourthline.orca.internal.InterfaceC3511lb
    public QA a(DocumentScannerStep step, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        return QA.a.a(QA.f27433a, R.string.step_poa_capture_message, 0, 2, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3511lb
    public QA a(DocumentScannerStep step, DocumentType documentType, boolean z11) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        return QA.b.f27435b;
    }
}
