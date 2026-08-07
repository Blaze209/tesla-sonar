package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3720qB implements InterfaceC3554mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MA f34753a;

    public C3720qB(MA taxationCountry) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        this.f34753a = taxationCountry;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3554mb
    public Tj a(DocumentType documentType, DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        p013kotlin.jvm.internal.s.k(step, "step");
        AbstractC3989wg.a(documentType == DocumentType.TIN_REFERENCE_DOCUMENT, "Wrong document type (" + documentType + ") provided to TIN Scanner Mask Provider");
        if (this.f34753a == MA.NLD) {
            return Tj.PassportBackQr;
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3554mb
    public Fz b(DocumentType documentType, DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        p013kotlin.jvm.internal.s.k(step, "step");
        AbstractC3989wg.a(documentType == DocumentType.TIN_REFERENCE_DOCUMENT, "Wrong document type (" + documentType + ") provided to TIN Scanner Mask Provider");
        return a(step);
    }

    private final Fz a(DocumentScannerStep documentScannerStep) {
        if (this.f34753a == MA.NLD) {
            return new Fz(EnumC3689ph.f34578y, EnumC3689ph.f34580z, EnumC3689ph.A);
        }
        return AbstractC3597nb.j(documentScannerStep);
    }
}
