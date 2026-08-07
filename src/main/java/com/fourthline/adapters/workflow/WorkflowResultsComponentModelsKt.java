package com.fourthline.adapters.workflow;

import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.adapters.common.FourthlineOutputProcessor;
import com.fourthline.adapters.common.MrzJsonProducer;
import com.fourthline.adapters.extensions.StringExtensionsKt;
import com.fourthline.adapters.kyc.BitmapSaver;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.Iterator;
import jn0.h0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\b\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"componentDocumentToJson", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "mrzJsonProducer", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "bitmapSaver", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "(Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;Lcom/fourthline/adapters/common/MrzJsonProducer;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "componentDocumentAnalysisToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowResultsComponentModelsKt {
    public static final JSONObject componentDocumentAnalysisToJson(WorkflowResults.Component.DocumentAnalysis documentAnalysis) throws JSONException {
        s.k(documentAnalysis, "<this>");
        JSONObject jSONObjectPutOpt = new JSONObject().putOpt(EContextPaymentMethod.FIRST_NAME, documentAnalysis.getFirstName()).putOpt(EContextPaymentMethod.LAST_NAME, documentAnalysis.getLastName()).putOpt("initials", documentAnalysis.getInitials()).putOpt("gender", documentAnalysis.getGender()).putOpt("nationality", documentAnalysis.getNationality()).putOpt(WorkflowKeys.ISSUING_COUNTRY, documentAnalysis.getIssuingCountry()).putOpt("issueDate", documentAnalysis.getIssueDate()).putOpt("expirationDate", documentAnalysis.getExpirationDate()).putOpt("dateOfBirth", documentAnalysis.getDateOfBirth()).putOpt("birthPlace", documentAnalysis.getBirthPlace()).putOpt("documentNumber", documentAnalysis.getDocumentNumber()).putOpt("documentType", documentAnalysis.getDocumentType()).putOpt("taxIdentificationNumber", documentAnalysis.getTaxIdentificationNumber());
        s.j(jSONObjectPutOpt, "putOpt(...)");
        return jSONObjectPutOpt;
    }

    public static final JSONObject componentDocumentToJson(WorkflowResults.Component.Document document, MrzJsonProducer mrzJsonProducer, BitmapSaver bitmapSaver) throws JSONException {
        s.k(document, "<this>");
        s.k(mrzJsonProducer, "mrzJsonProducer");
        s.k(bitmapSaver, "bitmapSaver");
        JSONObject jSONObjectPut = new JSONObject().put("type", StringExtensionsKt.toLowerCamelCase(document.getDocumentType().name()));
        VideoRecording videoRecording = document.getVideoRecording();
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("videoRecording", videoRecording != null ? FourthlineOutputProcessor.INSTANCE.provideJsonVideoRecording$fourthline_adapters_json_release(videoRecording) : null);
        MrzInfo mrzInfo = document.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            jSONObjectPutOpt.put("mrtdMrzInfo", mrzJsonProducer.produceMrtdMrzInfoJsonObject((MrtdMrzInfo) mrzInfo));
        } else if (mrzInfo instanceof IdlMrzInfo) {
            jSONObjectPutOpt.put("idlMrzInfo", mrzJsonProducer.produceIdlMrzInfoJsonObject((IdlMrzInfo) mrzInfo));
        } else {
            h0 h0Var = h0.f84049a;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = document.getImages().iterator();
        while (it.hasNext()) {
            jSONArray.put(WorkflowResultsIdvModelsKt.attachmentToJson((WorkflowResults.IDV.Attachment) it.next(), bitmapSaver));
        }
        h0 h0Var2 = h0.f84049a;
        return jSONObjectPutOpt.put("images", jSONArray);
    }
}
