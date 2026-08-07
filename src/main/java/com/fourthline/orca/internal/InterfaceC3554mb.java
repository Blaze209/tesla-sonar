package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3554mb {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mb$a */
    public static final class a {
        public static Tj a(InterfaceC3554mb interfaceC3554mb, DocumentType documentType, DocumentScannerStep step) {
            p013kotlin.jvm.internal.s.k(documentType, "documentType");
            p013kotlin.jvm.internal.s.k(step, "step");
            DocumentFileSide fileSide = step.getFileSide();
            DocumentFileSide documentFileSide = DocumentFileSide.BACK;
            if (fileSide == documentFileSide && step.isAngled()) {
                return AbstractC3597nb.d(step, documentType);
            }
            if (step.getFileSide() == documentFileSide) {
                return AbstractC3597nb.e(step, documentType);
            }
            return step.isAngled() ? AbstractC3597nb.f(step, documentType) : AbstractC3597nb.g(step, documentType);
        }
    }

    Tj a(DocumentType documentType, DocumentScannerStep documentScannerStep);

    Fz b(DocumentType documentType, DocumentScannerStep documentScannerStep);
}
