package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcData;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.PersonalDetails;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class BC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XA f25080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f25081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f25082c;

    public BC(XA tinBundle, C4104z8 documentFlowDataBundle, Set documentsWithTinInMrz) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(documentsWithTinInMrz, "documentsWithTinInMrz");
        this.f25080a = tinBundle;
        this.f25081b = documentFlowDataBundle;
        this.f25082c = documentsWithTinInMrz;
    }

    private final String a() {
        DocumentScannerResult documentScannerResultB = this.f25081b.b();
        if (documentScannerResultB != null && this.f25082c.contains(documentScannerResultB.getDocumentType())) {
            MrzInfo mrzInfo = documentScannerResultB.getMrzInfo();
            MrtdMrzInfo mrtdMrzInfo = mrzInfo instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfo : null;
            if (mrtdMrzInfo != null) {
                return mrtdMrzInfo.getOptionalData();
            }
        }
        return null;
    }

    public final void b(MA taxationCountry) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        G5 g5H = this.f25081b.h();
        if (p013kotlin.jvm.internal.s.f(g5H != null ? g5H.c() : null, taxationCountry.d())) {
            String strA = a(taxationCountry);
            if (strA == null && (strA = b()) == null) {
                strA = a();
            }
            if (strA != null) {
                this.f25080a.a(taxationCountry.d());
                this.f25080a.b(strA);
            }
        }
    }

    private final String a(MA ma2) {
        DocumentType documentTypeC;
        C4104z8 c4104z8 = this.f25081b;
        Am amJ = c4104z8.j();
        Bm bm2 = amJ instanceof Bm ? (Bm) amJ : null;
        NfcScannerResult nfcScannerResultA = bm2 != null ? bm2.a() : null;
        X7 x7O = c4104z8.o();
        if (x7O == null || (documentTypeC = x7O.c()) == null || nfcScannerResultA == null) {
            return null;
        }
        return a(nfcScannerResultA, documentTypeC, ma2);
    }

    private final String b() {
        OcrData ocrDataB;
        InterfaceC3630o7.a aVarC = this.f25081b.c();
        if (aVarC == null || (ocrDataB = aVarC.b()) == null) {
            return null;
        }
        return ocrDataB.getTaxIdentificationNumber();
    }

    private final String a(NfcScannerResult nfcScannerResult, DocumentType documentType, MA ma2) {
        Object data = nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        MrtdMrzInfo mrtdMrzInfo = data instanceof MrtdMrzInfo ? (MrtdMrzInfo) data : null;
        if (!p013kotlin.jvm.internal.s.f(mrtdMrzInfo != null ? mrtdMrzInfo.getIssuingCountry() : null, ma2.d())) {
            return null;
        }
        Object data2 = nfcScannerResult.getData(NfcData.NfcDataType.PERSONAL_DETAILS);
        PersonalDetails personalDetails = data2 instanceof PersonalDetails ? (PersonalDetails) data2 : null;
        MA ma3 = MA.ESP;
        DocumentType documentType2 = DocumentType.ID_CARD;
        DocumentType documentType3 = DocumentType.PASSPORT;
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a(ma3, p013kotlin.collections.d1.i(documentType2, DocumentType.RESIDENCE_PERMIT, documentType3)), jn0.x.a(MA.NLD, p013kotlin.collections.d1.i(documentType2, documentType3)));
        if ((personalDetails != null ? personalDetails.getPersonalNumber() : null) != null) {
            return personalDetails.getPersonalNumber();
        }
        Set set = (Set) mapM.get(ma2);
        if (set == null || !set.contains(documentType)) {
            return null;
        }
        return mrtdMrzInfo.getOptionalData();
    }
}
