package com.fourthline.orca.workflow;

import com.fourthline.orca.internal.AbstractC3594nE;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/fourthline/orca/internal/nE;", "Lcom/fourthline/orca/workflow/WorkflowError;", "getPublic", "(Lcom/fourthline/orca/internal/nE;)Lcom/fourthline/orca/workflow/WorkflowError;", "public", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowErrorKt {
    public static final WorkflowError getPublic(AbstractC3594nE abstractC3594nE) {
        s.k(abstractC3594nE, "<this>");
        if (abstractC3594nE instanceof AbstractC3594nE.a) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (abstractC3594nE instanceof AbstractC3594nE.d) {
            return new WorkflowError.InvalidSession(((AbstractC3594nE.d) abstractC3594nE).getMessage());
        }
        if (abstractC3594nE instanceof AbstractC3594nE.f) {
            return new WorkflowError.ModuleError(((AbstractC3594nE.f) abstractC3594nE).b() + ".KycRequired");
        }
        if (abstractC3594nE instanceof AbstractC3594nE.g) {
            return new WorkflowError.ModuleError(((AbstractC3594nE.g) abstractC3594nE).b() + ".PendingVerification");
        }
        if (abstractC3594nE instanceof AbstractC3594nE.e) {
            return WorkflowError.InvalidWorkflowStatus.INSTANCE;
        }
        if (abstractC3594nE instanceof AbstractC3594nE.c) {
            return new WorkflowError.ConfigurationNotSupported(((AbstractC3594nE.c) abstractC3594nE).getMessage());
        }
        if (abstractC3594nE instanceof AbstractC3594nE.h) {
            return new WorkflowError.Unexpected(((AbstractC3594nE.h) abstractC3594nE).getMessage());
        }
        throw new NoWhenBranchMatchedException();
    }
}
