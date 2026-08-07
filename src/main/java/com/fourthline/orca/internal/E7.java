package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: loaded from: classes4.dex */
public final class E7 implements InterfaceC3554mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ms f25572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3720qB f25573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Oq f25574c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public E7(Ms primaryDocumentGraphicsProvider, C3720qB tinReferenceDocumentGraphicsProvider, Oq proofOfAddressDocumentGraphicsProvider) {
        p013kotlin.jvm.internal.s.k(primaryDocumentGraphicsProvider, "primaryDocumentGraphicsProvider");
        p013kotlin.jvm.internal.s.k(tinReferenceDocumentGraphicsProvider, "tinReferenceDocumentGraphicsProvider");
        p013kotlin.jvm.internal.s.k(proofOfAddressDocumentGraphicsProvider, "proofOfAddressDocumentGraphicsProvider");
        this.f25572a = primaryDocumentGraphicsProvider;
        this.f25573b = tinReferenceDocumentGraphicsProvider;
        this.f25574c = proofOfAddressDocumentGraphicsProvider;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3554mb
    public Tj a(DocumentType documentType, DocumentScannerStep documentScannerStep) {
        return InterfaceC3554mb.a.a(this, documentType, documentScannerStep);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3554mb
    public Fz b(DocumentType documentType, DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        p013kotlin.jvm.internal.s.k(step, "step");
        int i11 = a.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? this.f25572a.b(documentType, step) : this.f25574c.b(documentType, step);
        }
        return this.f25573b.b(documentType, step);
    }
}
