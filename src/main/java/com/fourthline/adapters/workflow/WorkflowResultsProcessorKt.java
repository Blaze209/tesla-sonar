package com.fourthline.adapters.workflow;

import com.fourthline.adapters.common.MrzJsonProducer;
import com.fourthline.adapters.kyc.BitmapSaver;
import com.fourthline.orca.workflow.WorkflowResults;
import com.google.android.libraries.places.api.model.PlaceTypes;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a!\u0010\u0000\u001a\n \u0007*\u0004\u0018\u00010\u00010\u0001*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"toJson", "Lorg/json/JSONObject;", "Lcom/fourthline/orca/workflow/WorkflowResults$Component;", "mrzJsonProducer", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "bitmapSaver", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "kotlin.jvm.PlatformType", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowResultsProcessorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject toJson(WorkflowResults.Component component, MrzJsonProducer mrzJsonProducer, BitmapSaver bitmapSaver) throws JSONException {
        if (component instanceof WorkflowResults.Component.Document) {
            JSONObject jSONObjectPut = new JSONObject().put("document", WorkflowResultsComponentModelsKt.componentDocumentToJson((WorkflowResults.Component.Document) component, mrzJsonProducer, bitmapSaver));
            s.j(jSONObjectPut, "put(...)");
            return jSONObjectPut;
        }
        if (!(component instanceof WorkflowResults.Component.DocumentAnalysis)) {
            throw new NoWhenBranchMatchedException();
        }
        JSONObject jSONObjectPut2 = new JSONObject().put("documentAnalysis", WorkflowResultsComponentModelsKt.componentDocumentAnalysisToJson((WorkflowResults.Component.DocumentAnalysis) component));
        s.j(jSONObjectPut2, "put(...)");
        return jSONObjectPut2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject toJson(WorkflowResults.IDV idv, BitmapSaver bitmapSaver) {
        if (idv instanceof WorkflowResults.IDV.Document) {
            return new JSONObject().put("document", WorkflowResultsIdvModelsKt.documentToJson((WorkflowResults.IDV.Document) idv, bitmapSaver));
        }
        if (idv instanceof WorkflowResults.IDV.SecondaryDocument) {
            return new JSONObject().put("secondaryDocument", WorkflowResultsIdvModelsKt.secondaryDocumentToJson((WorkflowResults.IDV.SecondaryDocument) idv, bitmapSaver));
        }
        if (idv instanceof WorkflowResults.IDV.Address) {
            return new JSONObject().put(PlaceTypes.ADDRESS, WorkflowResultsIdvModelsKt.addressToJson((WorkflowResults.IDV.Address) idv));
        }
        if (idv instanceof WorkflowResults.IDV.Geolocation) {
            return new JSONObject().put("geolocation", WorkflowResultsIdvModelsKt.geolocationToJson((WorkflowResults.IDV.Geolocation) idv));
        }
        if (idv instanceof WorkflowResults.IDV.DeviceMetadata) {
            return new JSONObject().put("deviceMetadata", WorkflowResultsIdvModelsKt.metadataToJson((WorkflowResults.IDV.DeviceMetadata) idv));
        }
        if (idv instanceof WorkflowResults.IDV.DocumentVideo) {
            return new JSONObject().put("documentVideo", WorkflowResultsIdvModelsKt.recordingToJson(((WorkflowResults.IDV.DocumentVideo) idv).getRecording()));
        }
        if (idv instanceof WorkflowResults.IDV.Nfc) {
            return new JSONObject().put("nfc", WorkflowResultsIdvModelsKt.nfcToJson((WorkflowResults.IDV.Nfc) idv, bitmapSaver));
        }
        if (idv instanceof WorkflowResults.IDV.Person) {
            return new JSONObject().put("person", WorkflowResultsIdvModelsKt.personToJson((WorkflowResults.IDV.Person) idv));
        }
        if (idv instanceof WorkflowResults.IDV.Selfie) {
            return new JSONObject().put("selfie", WorkflowResultsIdvModelsKt.selfieToJson((WorkflowResults.IDV.Selfie) idv, bitmapSaver));
        }
        if (idv instanceof WorkflowResults.IDV.SelfieVideo) {
            return new JSONObject().put("selfieVideo", WorkflowResultsIdvModelsKt.recordingToJson(((WorkflowResults.IDV.SelfieVideo) idv).getRecording()));
        }
        if (idv instanceof WorkflowResults.IDV.TaxInfo) {
            return new JSONObject().put("taxInfo", WorkflowResultsIdvModelsKt.texInfoToJson((WorkflowResults.IDV.TaxInfo) idv));
        }
        if (idv instanceof WorkflowResults.IDV.Contacts) {
            return new JSONObject().put("contacts", WorkflowResultsIdvModelsKt.contactsToJson((WorkflowResults.IDV.Contacts) idv));
        }
        throw new NoWhenBranchMatchedException();
    }
}
