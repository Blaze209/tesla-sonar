package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2927Ra {
    public static final void a(A7 a11, DocumentScannerResult result) {
        p013kotlin.jvm.internal.s.k(a11, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        MrzInfo mrzInfo = result.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo;
            a11.b(mrtdMrzInfo.getValidationErrors().contains(MrtdMrzInfoValidationError.INVALID_DOCUMENT_NUMBER) ? null : mrtdMrzInfo.getDocumentNumber());
            a11.a(mrtdMrzInfo.getValidationErrors().contains(MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE) ? null : mrtdMrzInfo.getExpirationDate());
        } else if (mrzInfo instanceof IdlMrzInfo) {
            IdlMrzInfo idlMrzInfo = (IdlMrzInfo) mrzInfo;
            a11.b(idlMrzInfo.getValidationErrors().contains(IdlMrzInfoValidationError.INVALID_DOCUMENT_NUMBER) ? null : idlMrzInfo.getDocumentNumber());
        }
        a11.a(result.getDocumentType());
        a11.a(result.getVideoRecording());
        a11.a(a(result.getStepResults()));
    }

    public static final void a(C3363hx c3363hx, DocumentScannerResult result) {
        p013kotlin.jvm.internal.s.k(c3363hx, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        c3363hx.a(result.getDocumentType());
        MrzInfo mrzInfo = result.getMrzInfo();
        MrtdMrzInfo mrtdMrzInfo = mrzInfo instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfo : null;
        c3363hx.a(mrtdMrzInfo != null ? mrtdMrzInfo.getExpirationDate() : null);
        c3363hx.a(a(result.getStepResults()));
    }

    public static final List a(List list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DocumentScannerStepResult documentScannerStepResult = (DocumentScannerStepResult) it.next();
            DocumentScannerStepMetadata metadata = documentScannerStepResult.getMetadata();
            DocumentFileSide fileSide = metadata.getFileSide();
            boolean zIsAngled = metadata.isAngled();
            Bitmap full = documentScannerStepResult.getImage().getFull();
            long time = metadata.getTimestamp().getTime();
            arrayList.add(new C4103z7(full, null, fileSide, zIsAngled, Long.valueOf(time), metadata.getLocation(), 2, null));
        }
        return arrayList;
    }
}
