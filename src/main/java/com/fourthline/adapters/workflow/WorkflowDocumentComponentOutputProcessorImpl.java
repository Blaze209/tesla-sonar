package com.fourthline.adapters.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.common.KycMrzJsonProducer;
import com.fourthline.adapters.common.MrzJsonProducer;
import com.fourthline.adapters.kyc.BitmapSaver;
import com.fourthline.adapters.kyc.BitmapSaverImpl;
import com.fourthline.orca.workflow.DocumentComponentResult;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowJsonError;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowDocumentComponentOutputProcessorImpl;", "Lcom/fourthline/adapters/workflow/WorkflowDocumentComponentOutputProcessor;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fourthline/adapters/kyc/BitmapSaver;", "bitmapSaver", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "mrzJsonProducer", "<init>", "(Landroid/content/Context;Lcom/fourthline/adapters/kyc/BitmapSaver;Lcom/fourthline/adapters/common/MrzJsonProducer;)V", "Ljn0/s;", "Lcom/fourthline/orca/workflow/DocumentComponentResult;", "documentComponentResult", "", "handle", "(Ljava/lang/Object;)Ljava/lang/String;", "Landroid/content/Context;", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowDocumentComponentOutputProcessorImpl implements WorkflowDocumentComponentOutputProcessor {
    private final BitmapSaver bitmapSaver;
    private final Context context;
    private final MrzJsonProducer mrzJsonProducer;

    public WorkflowDocumentComponentOutputProcessorImpl(Context context, BitmapSaver bitmapSaver, MrzJsonProducer mrzJsonProducer) {
        s.k(context, "context");
        s.k(bitmapSaver, "bitmapSaver");
        s.k(mrzJsonProducer, "mrzJsonProducer");
        this.context = context;
        this.bitmapSaver = bitmapSaver;
        this.mrzJsonProducer = mrzJsonProducer;
    }

    @Override // com.fourthline.adapters.workflow.WorkflowDocumentComponentOutputProcessor
    public String handle(Object documentComponentResult) throws JSONException, WorkflowJsonError.ClientRejected, CommonJsonError.Unexpected, WorkflowJsonError.ModuleError, WorkflowJsonError.InvalidWorkflowStatus, CommonJsonError.UserCanceled, WorkflowJsonError.InvalidSession, WorkflowJsonError.ConfigurationNotSupported {
        Throwable thE = jn0.s.e(documentComponentResult);
        if (thE != null) {
            WorkflowOutputProcessorKt.handleWorkflowError(thE);
            return "";
        }
        DocumentComponentResult documentComponentResult2 = (DocumentComponentResult) documentComponentResult;
        JSONObject jSONObjectPut = new JSONObject().put("document", WorkflowResultsComponentModelsKt.componentDocumentToJson(documentComponentResult2.getDocument(), this.mrzJsonProducer, this.bitmapSaver));
        WorkflowResults.Component.DocumentAnalysis documentAnalysis = documentComponentResult2.getDocumentAnalysis();
        return jSONObjectPut.putOpt("documentAnalysis", documentAnalysis != null ? WorkflowResultsComponentModelsKt.componentDocumentAnalysisToJson(documentAnalysis) : null).toString();
    }

    public /* synthetic */ WorkflowDocumentComponentOutputProcessorImpl(Context context, BitmapSaver bitmapSaver, MrzJsonProducer mrzJsonProducer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new BitmapSaverImpl(context) : bitmapSaver, (i11 & 4) != 0 ? new KycMrzJsonProducer() : mrzJsonProducer);
    }
}
