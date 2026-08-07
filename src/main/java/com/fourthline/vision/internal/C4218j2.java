package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4218j2 implements InterfaceC4232l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f38441a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j2$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
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

    public C4218j2(DocumentType type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        this.f38441a = type;
    }

    private final boolean isMatchingType(MrzInfo mrzInfo, DocumentType documentType) {
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
            case 2:
                return mrzInfo.getRawMrz().length() == 92;
            case 3:
                return mrzInfo.getRawMrz().length() == 73;
            case 4:
                return mrzInfo.getRawMrz().length() == 89;
            case 5:
                return mrzInfo.getRawMrz().length() == 30;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2
    public DocumentValidationError toDocumentValidationError(OcrValidationError ocrValidationError, List<? extends ValidationError> list) {
        return InterfaceC4232l2.a.toDocumentValidationError(this, ocrValidationError, list);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2
    public Set<DocumentValidationError> toDocumentValidationErrors(Set<? extends OcrValidationError> set, List<? extends ValidationError> list) {
        return InterfaceC4232l2.a.toDocumentValidationErrors(this, set, list);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2, com.fourthline.vision.internal.T5
    public Object validate(K5 k11, I5 i11, Continuation<? super Set<? extends DocumentValidationError>> continuation) {
        MrzInfo mrz;
        InterfaceC4163c2.b bVar = k11 instanceof InterfaceC4163c2.b ? (InterfaceC4163c2.b) k11 : null;
        if (bVar != null && (mrz = bVar.getMrz()) != null) {
            Set setD = isMatchingType(mrz, this.f38441a) ? p013kotlin.collections.d1.d() : p013kotlin.collections.d1.c(DocumentValidationError.DOCUMENT_TYPE_INVALID);
            if (setD != null) {
                return setD;
            }
        }
        return p013kotlin.collections.d1.d();
    }
}
