package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Ms implements InterfaceC3554mb {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
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
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return AbstractC3597nb.l(step);
            case 2:
                return AbstractC3597nb.f(step);
            case 3:
            case 4:
                return AbstractC3597nb.j(step);
            case 5:
                return AbstractC3597nb.k(step);
            case 6:
                return AbstractC3597nb.h(step);
            case 7:
                return AbstractC3597nb.g(step);
            case 8:
            case 9:
                AbstractC3989wg.a("Not a primary document!");
                throw new KotlinNothingValueException();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
