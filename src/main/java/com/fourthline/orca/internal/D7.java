package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.orca.workflow.DocumentComponentResult;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.orca.workflow.WorkflowResultsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class D7 {
    public Object a(Object obj) {
        Throwable unexpected;
        OcrData ocrDataB;
        Throwable thE = jn0.s.e(obj);
        if (thE != null) {
            if (thE instanceof AbstractC3502l8.d) {
                unexpected = AbstractC4083yo.b(((AbstractC3502l8.d) thE).a());
            } else if (thE instanceof AbstractC3502l8.a) {
                unexpected = AbstractC4083yo.b(((AbstractC3502l8.a) thE).a());
            } else if (thE instanceof AbstractC3502l8.b) {
                unexpected = WorkflowError.Canceled.INSTANCE;
            } else {
                if ((thE instanceof AbstractC3502l8.c) || (thE instanceof AbstractC3502l8.e)) {
                    throw new IllegalStateException((this + " can not be a public error!").toString());
                }
                String message = thE.getMessage();
                if (message == null) {
                    message = thE instanceof Bo ? ((Bo) thE).getAlias() : thE.getClass().getSimpleName();
                }
                p013kotlin.jvm.internal.s.h(message);
                unexpected = new WorkflowError.Unexpected(message);
            }
            return jn0.s.b(jn0.t.a(unexpected));
        }
        C3467ka c3467ka = (C3467ka) obj;
        VideoRecording videoRecording = c3467ka.b().getVideoRecording();
        MrzInfo mrzInfo = c3467ka.b().getMrzInfo();
        DocumentType documentType = c3467ka.b().getDocumentType();
        List listA = AbstractC2927Ra.a(c3467ka.b().getStepResults());
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = WorkflowResultsKt.asWorkflowDataAttachment((C4103z7) it.next());
            if (attachmentAsWorkflowDataAttachment != null) {
                arrayList.add(attachmentAsWorkflowDataAttachment);
            }
        }
        WorkflowResults.Component.Document document = new WorkflowResults.Component.Document(videoRecording, mrzInfo, documentType, arrayList);
        InterfaceC3630o7.a aVarA = c3467ka.a();
        WorkflowResults.Component.DocumentAnalysis documentAnalysis = null;
        documentAnalysis = null;
        if (aVarA != null && (ocrDataB = aVarA.b()) != null) {
            String initials = ocrDataB.getInitials();
            String firstName = ocrDataB.getFirstName();
            String lastName = ocrDataB.getLastName();
            Gender genderA = A8.a(ocrDataB);
            String birthPlace = ocrDataB.getBirthPlace();
            String dateOfBirth = ocrDataB.getDateOfBirth();
            Date dateA = dateOfBirth != null ? ZC.a(dateOfBirth) : null;
            String nationality = ocrDataB.getNationality();
            String taxIdentificationNumber = ocrDataB.getTaxIdentificationNumber();
            String issueDate = ocrDataB.getIssueDate();
            Date dateA2 = issueDate != null ? ZC.a(issueDate) : null;
            String issuingCountry = ocrDataB.getIssuingCountry();
            String documentType2 = ocrDataB.getDocumentType();
            DocumentType documentType$default = documentType2 != null ? CountryNetworkModelKt.toDocumentType$default(documentType2, null, 1, null) : null;
            String documentNumber = ocrDataB.getDocumentNumber();
            String expirationDate = ocrDataB.getExpirationDate();
            documentAnalysis = new WorkflowResults.Component.DocumentAnalysis(firstName, lastName, initials, genderA, nationality, issuingCountry, dateA2, expirationDate != null ? ZC.a(expirationDate) : null, dateA, birthPlace, documentNumber, documentType$default, null, taxIdentificationNumber, 4096, null);
        }
        return jn0.s.b(new DocumentComponentResult(document, documentAnalysis));
    }
}
