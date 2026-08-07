package com.fourthline.adapters.workflow;

import com.fourthline.adapters.common.MrzJsonProducer;
import com.fourthline.adapters.kyc.BitmapSaver;
import com.fourthline.orca.workflow.WorkflowResults;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/fourthline/adapters/workflow/JsonWorkflowResultsProcessor;", "Lcom/fourthline/adapters/workflow/WorkflowResultsProcessor;", "bitmapSaver", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "mrzJsonProducer", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "<init>", "(Lcom/fourthline/adapters/kyc/BitmapSaver;Lcom/fourthline/adapters/common/MrzJsonProducer;)V", "handle", "", "workflowResult", "Lcom/fourthline/orca/workflow/WorkflowResults;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonWorkflowResultsProcessor implements WorkflowResultsProcessor {
    private final BitmapSaver bitmapSaver;
    private final MrzJsonProducer mrzJsonProducer;

    public JsonWorkflowResultsProcessor(BitmapSaver bitmapSaver, MrzJsonProducer mrzJsonProducer) {
        s.k(bitmapSaver, "bitmapSaver");
        s.k(mrzJsonProducer, "mrzJsonProducer");
        this.bitmapSaver = bitmapSaver;
        this.mrzJsonProducer = mrzJsonProducer;
    }

    @Override // com.fourthline.adapters.workflow.WorkflowResultsProcessor
    public String handle(WorkflowResults workflowResult) {
        String string;
        s.k(workflowResult, "workflowResult");
        if (workflowResult instanceof WorkflowResults.IDV) {
            string = new JSONObject().put("idv", WorkflowResultsProcessorKt.toJson((WorkflowResults.IDV) workflowResult, this.bitmapSaver)).toString();
        } else {
            if (!(workflowResult instanceof WorkflowResults.Component)) {
                throw new NoWhenBranchMatchedException();
            }
            string = new JSONObject().put("component", WorkflowResultsProcessorKt.toJson((WorkflowResults.Component) workflowResult, this.mrzJsonProducer, this.bitmapSaver)).toString();
        }
        s.h(string);
        return string;
    }
}
