package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3019Za {
    Gz a(C3640ob c3640ob, DocumentScannerStepResult documentScannerStepResult, G5 g11, DocumentScannerStep documentScannerStep);

    C2973Va a(DocumentScannerResult documentScannerResult);

    DocumentValidationError a(DocumentScannerStepResult documentScannerStepResult);

    Set a();

    void a(C3640ob c3640ob, InterfaceC3921uz.b bVar, DocumentScannerStep documentScannerStep);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Za$a */
    public static final class a {
        public static DocumentValidationError a(InterfaceC3019Za interfaceC3019Za, DocumentScannerStepResult receiver) {
            p013kotlin.jvm.internal.s.k(receiver, "$receiver");
            Set<DocumentValidationError> validationErrors = receiver.getValidationErrors();
            ArrayList arrayList = new ArrayList();
            for (Object obj : validationErrors) {
                if (!interfaceC3019Za.a().contains((DocumentValidationError) obj)) {
                    arrayList.add(obj);
                }
            }
            return (DocumentValidationError) p013kotlin.collections.v.q0(arrayList);
        }

        public static Set a(InterfaceC3019Za interfaceC3019Za) {
            return p013kotlin.collections.d1.i(DocumentValidationError.MRZ_NOT_VALID, DocumentValidationError.MRZ_NOT_DETECTED, DocumentValidationError.PHOTO_DETECTED, DocumentValidationError.PHOTO_NOT_DETECTED);
        }
    }
}
