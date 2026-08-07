package com.fourthline.adapters.workflow;

import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowJsonError;
import jn0.s;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowOutputProcessorImpl;", "Lcom/fourthline/adapters/workflow/WorkflowOutputProcessor;", "<init>", "()V", "Ljn0/s;", "Ljn0/h0;", "Lcom/fourthline/orca/workflow/WorkflowResult;", "workflowResult", "", "handle", "(Ljava/lang/Object;)Ljava/lang/String;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowOutputProcessorImpl implements WorkflowOutputProcessor {
    @Override // com.fourthline.adapters.workflow.WorkflowOutputProcessor
    public String handle(Object workflowResult) throws WorkflowJsonError.ClientRejected, CommonJsonError.Unexpected, WorkflowJsonError.ModuleError, WorkflowJsonError.InvalidWorkflowStatus, CommonJsonError.UserCanceled, WorkflowJsonError.InvalidSession, WorkflowJsonError.ConfigurationNotSupported {
        Throwable thE = s.e(workflowResult);
        if (thE == null) {
            return "";
        }
        WorkflowOutputProcessorKt.handleWorkflowError(thE);
        return "";
    }
}
