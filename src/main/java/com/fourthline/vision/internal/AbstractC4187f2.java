package com.fourthline.vision.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.vision.internal.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4187f2 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.f2$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<DocumentScannerStep> documentSteps(DocumentType documentType, boolean z11) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return front(z11, true);
            case 2:
                return frontAndBack(z11, true, false);
            case 3:
                return frontAndBack(z11, false, true);
            case 4:
                return frontAndBack(z11, true, false);
            case 5:
                return frontAndBack(z11, false, false);
            case 6:
                return frontAndBack(z11, true, true);
            case 7:
                return front(z11, false);
            case 8:
                return front(z11, false);
            case 9:
                return paperIdSteps(z11);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final List<DocumentScannerStep> fixIndexes(List<DocumentScannerStep> list) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            arrayList.add(DocumentScannerStep.copy$default((DocumentScannerStep) obj, i11, null, false, false, 14, null));
            i11 = i12;
        }
        return arrayList;
    }

    private static final List<DocumentScannerStep> front(boolean z11, boolean z12) {
        return fixIndexes(populateAngledSteps(p013kotlin.collections.v.e(new DocumentScannerStep(0, DocumentFileSide.FRONT, false, z12)), z11));
    }

    private static final List<DocumentScannerStep> frontAndBack(boolean z11, boolean z12, boolean z13) {
        return fixIndexes(populateAngledSteps(p013kotlin.collections.v.p(new DocumentScannerStep(0, DocumentFileSide.FRONT, false, z12), new DocumentScannerStep(0, DocumentFileSide.BACK, false, z13)), z11));
    }

    private static final List<DocumentScannerStep> paperIdSteps(boolean z11) {
        DocumentFileSide documentFileSide = DocumentFileSide.INSIDE_LEFT;
        Boolean bool = Boolean.FALSE;
        Pair pairA = jn0.x.a(documentFileSide, bool);
        DocumentFileSide documentFileSide2 = DocumentFileSide.INSIDE_RIGHT;
        List listR = p013kotlin.collections.v.r(pairA, jn0.x.a(documentFileSide2, bool), z11 ? jn0.x.a(documentFileSide2, Boolean.TRUE) : null, jn0.x.a(DocumentFileSide.BACK, bool));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listR, 10));
        int i11 = 0;
        for (Object obj : listR) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            Pair pair = (Pair) obj;
            arrayList.add(new DocumentScannerStep(i11, (DocumentFileSide) pair.e(), ((Boolean) pair.f()).booleanValue(), false));
            i11 = i12;
        }
        return arrayList;
    }

    private static final List<DocumentScannerStep> populateAngledSteps(List<DocumentScannerStep> list, boolean z11) {
        if (!z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (DocumentScannerStep documentScannerStep : list) {
            arrayList.add(p013kotlin.collections.v.p(documentScannerStep, DocumentScannerStep.copy$default(documentScannerStep, 0, null, true, false, 3, null)));
        }
        return p013kotlin.collections.v.A(arrayList);
    }
}
