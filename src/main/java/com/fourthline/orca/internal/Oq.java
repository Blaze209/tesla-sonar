package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public final class Oq implements InterfaceC3554mb {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3554mb
    public Tj a(DocumentType documentType, DocumentScannerStep documentScannerStep) {
        return InterfaceC3554mb.a.a(this, documentType, documentScannerStep);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3554mb
    public Fz b(DocumentType documentType, DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        p013kotlin.jvm.internal.s.k(step, "step");
        AbstractC3989wg.a(documentType == DocumentType.PROOF_OF_ADDRESS, "Wrong document type (" + documentType + ") provided to POA Scanner Mask Provider");
        return a(step);
    }

    private final Fz a(DocumentScannerStep documentScannerStep) {
        if (a.$EnumSwitchMapping$0[documentScannerStep.getFileSide().ordinal()] == 1) {
            return new Fz(EnumC3689ph.f34541f0, EnumC3689ph.f34543g0, EnumC3689ph.f34545h0);
        }
        throw new IllegalStateException(("Mask for type: " + DocumentType.PROOF_OF_ADDRESS + " and file side: " + documentScannerStep.getFileSide() + " doesn't exists!").toString());
    }
}
