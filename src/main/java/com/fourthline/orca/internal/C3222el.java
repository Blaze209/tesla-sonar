package com.fourthline.orca.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3222el implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dg f31464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f31465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3974w7 f31466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f31467e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.el$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f31471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f31472e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31474g;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31472e = obj;
            this.f31474g |= Integer.MIN_VALUE;
            return C3222el.this.a((String) null, this);
        }
    }

    public C3222el(String workflowId, Dg getDocumentAnalysisResultWorker, wn0.a documentExpectations, InterfaceC3974w7 validator) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(getDocumentAnalysisResultWorker, "getDocumentAnalysisResultWorker");
        p013kotlin.jvm.internal.s.k(documentExpectations, "documentExpectations");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        this.f31463a = workflowId;
        this.f31464b = getDocumentAnalysisResultWorker;
        this.f31465c = documentExpectations;
        this.f31466d = validator;
        this.f31467e = new LinkedHashMap();
    }

    @Override // com.fourthline.orca.internal.Y6
    public void a(String documentId, wn0.l onResults) {
        p013kotlin.jvm.internal.s.k(documentId, "documentId");
        p013kotlin.jvm.internal.s.k(onResults, "onResults");
        this.f31467e.put(documentId, onResults);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Y6
    public Object a(String str, Continuation continuation) {
        a aVar;
        Object objA;
        C3222el c3222el;
        C3222el c3222el2;
        OcrData ocrData;
        String str2;
        DocumentRecognitionData documentRecognitionData;
        InterfaceC3630o7.a aVar2;
        wn0.l lVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f31474g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f31474g = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA2 = aVar.f31472e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f31474g;
        if (i12 == 0) {
            jn0.t.b(objA2);
            Dg dg2 = this.f31464b;
            Dg.a aVar3 = new Dg.a(this.f31463a, str);
            aVar.f31468a = this;
            aVar.f31469b = str;
            aVar.f31474g = 1;
            objA = dg2.a(aVar3, aVar);
            if (objA != coroutine_suspended) {
                c3222el = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = (String) aVar.f31469b;
            c3222el = (C3222el) aVar.f31468a;
            jn0.t.b(objA2);
            objA = ((jn0.s) objA2).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            documentRecognitionData = (DocumentRecognitionData) aVar.f31471d;
            ocrData = (OcrData) aVar.f31470c;
            str2 = (String) aVar.f31469b;
            c3222el2 = (C3222el) aVar.f31468a;
            jn0.t.b(objA2);
        }
        aVar2 = new InterfaceC3630o7.a(documentRecognitionData, ocrData, (List) objA2);
        lVar = (wn0.l) c3222el2.f31467e.get(str2);
        if (lVar != null) {
            lVar.invoke(aVar2);
        }
        return jn0.h0.f84049a;
        Throwable thE = jn0.s.e(objA);
        if (thE == null) {
            Dg.b bVar = (Dg.b) objA;
            if (bVar instanceof Dg.b.a) {
                Dg.b.a aVar4 = (Dg.b.a) bVar;
                DocumentRecognitionData documentRecognitionData2 = aVar4.a().getDocumentRecognitionData();
                OcrData ocrData2 = aVar4.a().getOcrData();
                InterfaceC3974w7 interfaceC3974w7 = c3222el.f31466d;
                C3893uD c3893uDA = c3222el.a(aVar4.a());
                C3936vD c3936vD = (C3936vD) c3222el.f31465c.invoke();
                aVar.f31468a = c3222el;
                aVar.f31469b = str;
                aVar.f31470c = ocrData2;
                aVar.f31471d = documentRecognitionData2;
                aVar.f31474g = 2;
                objA2 = interfaceC3974w7.a(c3893uDA, c3936vD, aVar);
                if (objA2 != coroutine_suspended) {
                    c3222el2 = c3222el;
                    ocrData = ocrData2;
                    str2 = str;
                    documentRecognitionData = documentRecognitionData2;
                    aVar2 = new InterfaceC3630o7.a(documentRecognitionData, ocrData, (List) objA2);
                    lVar = (wn0.l) c3222el2.f31467e.get(str2);
                    if (lVar != null) {
                        lVar.invoke(aVar2);
                    }
                }
                return coroutine_suspended;
            }
        } else {
            InterfaceC3630o7.b bVar2 = new InterfaceC3630o7.b(thE);
            wn0.l lVar2 = (wn0.l) c3222el.f31467e.get(str);
            if (lVar2 != null) {
                lVar2.invoke(bVar2);
            }
        }
        return jn0.h0.f84049a;
    }

    private final C3893uD a(GetDocumentAnalysisResultResponse getDocumentAnalysisResultResponse) {
        DocumentRecognitionData documentRecognitionData = getDocumentAnalysisResultResponse.getDocumentRecognitionData();
        String issuingCountry = documentRecognitionData != null ? documentRecognitionData.getIssuingCountry() : null;
        DocumentRecognitionData documentRecognitionData2 = getDocumentAnalysisResultResponse.getDocumentRecognitionData();
        String documentType = documentRecognitionData2 != null ? documentRecognitionData2.getDocumentType() : null;
        DocumentRecognitionData documentRecognitionData3 = getDocumentAnalysisResultResponse.getDocumentRecognitionData();
        C4023xD c4023xD = new C4023xD(issuingCountry, documentType, documentRecognitionData3 != null ? documentRecognitionData3.getDocumentModel() : null, null, 8, null);
        OcrData ocrData = getDocumentAnalysisResultResponse.getOcrData();
        String firstName = ocrData != null ? ocrData.getFirstName() : null;
        OcrData ocrData2 = getDocumentAnalysisResultResponse.getOcrData();
        String lastName = ocrData2 != null ? ocrData2.getLastName() : null;
        OcrData ocrData3 = getDocumentAnalysisResultResponse.getOcrData();
        String initials = ocrData3 != null ? ocrData3.getInitials() : null;
        OcrData ocrData4 = getDocumentAnalysisResultResponse.getOcrData();
        String gender = ocrData4 != null ? ocrData4.getGender() : null;
        OcrData ocrData5 = getDocumentAnalysisResultResponse.getOcrData();
        String nationality = ocrData5 != null ? ocrData5.getNationality() : null;
        OcrData ocrData6 = getDocumentAnalysisResultResponse.getOcrData();
        String issuingCountry2 = ocrData6 != null ? ocrData6.getIssuingCountry() : null;
        OcrData ocrData7 = getDocumentAnalysisResultResponse.getOcrData();
        String issueDate = ocrData7 != null ? ocrData7.getIssueDate() : null;
        OcrData ocrData8 = getDocumentAnalysisResultResponse.getOcrData();
        String expirationDate = ocrData8 != null ? ocrData8.getExpirationDate() : null;
        OcrData ocrData9 = getDocumentAnalysisResultResponse.getOcrData();
        String dateOfBirth = ocrData9 != null ? ocrData9.getDateOfBirth() : null;
        OcrData ocrData10 = getDocumentAnalysisResultResponse.getOcrData();
        String birthPlace = ocrData10 != null ? ocrData10.getBirthPlace() : null;
        OcrData ocrData11 = getDocumentAnalysisResultResponse.getOcrData();
        String documentNumber = ocrData11 != null ? ocrData11.getDocumentNumber() : null;
        OcrData ocrData12 = getDocumentAnalysisResultResponse.getOcrData();
        String documentType2 = ocrData12 != null ? ocrData12.getDocumentType() : null;
        OcrData ocrData13 = getDocumentAnalysisResultResponse.getOcrData();
        return new C3893uD(c4023xD, new C3980wD(firstName, lastName, initials, gender, nationality, issuingCountry2, issueDate, expirationDate, dateOfBirth, birthPlace, documentNumber, documentType2, ocrData13 != null ? ocrData13.getTaxIdentificationNumber() : null));
    }
}
