package com.fourthline.adapters.workflow;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowJsonError;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "handleWorkflowError", "(Ljava/lang/Throwable;)V", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowOutputProcessorKt {
    public static final void handleWorkflowError(Throwable error) throws WorkflowJsonError.ClientRejected, CommonJsonError.Unexpected, WorkflowJsonError.ModuleError, WorkflowJsonError.InvalidWorkflowStatus, CommonJsonError.UserCanceled, WorkflowJsonError.InvalidSession, WorkflowJsonError.ConfigurationNotSupported {
        s.k(error, "error");
        if (!(error instanceof WorkflowError)) {
            throw new CommonJsonError.Unexpected("Workflow finished with error which is not WorkflowError: " + error);
        }
        WorkflowError workflowError = (WorkflowError) error;
        if (workflowError instanceof WorkflowError.Canceled) {
            throw CommonJsonError.UserCanceled.INSTANCE;
        }
        if (workflowError instanceof WorkflowError.ClientRejected) {
            throw WorkflowJsonError.ClientRejected.INSTANCE;
        }
        if (workflowError instanceof WorkflowError.InvalidSession) {
            throw new WorkflowJsonError.InvalidSession(((WorkflowError.InvalidSession) error).getReason());
        }
        if (workflowError instanceof WorkflowError.InvalidWorkflowStatus) {
            throw WorkflowJsonError.InvalidWorkflowStatus.INSTANCE;
        }
        if (workflowError instanceof WorkflowError.ConfigurationNotSupported) {
            throw new WorkflowJsonError.ConfigurationNotSupported(((WorkflowError.ConfigurationNotSupported) error).getReason());
        }
        if (workflowError instanceof WorkflowError.ModuleError) {
            throw new WorkflowJsonError.ModuleError(((WorkflowError.ModuleError) error).getReason());
        }
        if (!(workflowError instanceof WorkflowError.Unexpected)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
