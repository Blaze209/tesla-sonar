package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4232l2 extends T5 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.l2$a */
    public static final class a {
        public static DocumentValidationError toDocumentValidationError(InterfaceC4232l2 interfaceC4232l2, OcrValidationError receiver, List<? extends ValidationError> mrzValidationErrors) {
            p013kotlin.jvm.internal.s.k(receiver, "$receiver");
            p013kotlin.jvm.internal.s.k(mrzValidationErrors, "mrzValidationErrors");
            int i11 = b.$EnumSwitchMapping$0[receiver.ordinal()];
            if (i11 == 1) {
                if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_ISSUING_COUNTRY)) {
                    return null;
                }
                return DocumentValidationError.ISSUING_COUNTRY_NOT_SUPPORTED;
            }
            if (i11 == 2) {
                return DocumentValidationError.DOCUMENT_TYPE_NOT_SUPPORTED;
            }
            if (i11 == 3) {
                if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_NATIONALITY)) {
                    return null;
                }
                return DocumentValidationError.NATIONALITY_NOT_SUPPORTED;
            }
            if (i11 == 4) {
                if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE)) {
                    return null;
                }
                return DocumentValidationError.DOCUMENT_EXPIRED;
            }
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (mrzValidationErrors.contains(MrtdMrzInfoValidationError.INVALID_BIRTH_DATE)) {
                return null;
            }
            return DocumentValidationError.PERSON_NOT_ADULT;
        }

        public static Set<DocumentValidationError> toDocumentValidationErrors(InterfaceC4232l2 interfaceC4232l2, Set<? extends OcrValidationError> receiver, List<? extends ValidationError> mrzValidationErrors) {
            p013kotlin.jvm.internal.s.k(receiver, "$receiver");
            p013kotlin.jvm.internal.s.k(mrzValidationErrors, "mrzValidationErrors");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = receiver.iterator();
            while (it.hasNext()) {
                DocumentValidationError documentValidationError = interfaceC4232l2.toDocumentValidationError((OcrValidationError) it.next(), mrzValidationErrors);
                if (documentValidationError != null) {
                    arrayList.add(documentValidationError);
                }
            }
            return p013kotlin.collections.v.r1(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.l2$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OcrValidationError.values().length];
            try {
                iArr[OcrValidationError.ISSUING_COUNTRY_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OcrValidationError.DOCUMENT_TYPE_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OcrValidationError.NATIONALITY_NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OcrValidationError.DOCUMENT_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OcrValidationError.PERSON_NOT_ADULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    DocumentValidationError toDocumentValidationError(OcrValidationError ocrValidationError, List<? extends ValidationError> list);

    Set<DocumentValidationError> toDocumentValidationErrors(Set<? extends OcrValidationError> set, List<? extends ValidationError> list);

    @Override // com.fourthline.vision.internal.T5
    /* synthetic */ Object validate(K5 k11, I5 i11, Continuation continuation);
}
