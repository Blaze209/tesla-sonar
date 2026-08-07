package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.orca.workflow.WorkflowError;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3396io {
    public static final Map a(Throwable th2) {
        String strC;
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        String strB = b(th2);
        if ((th2 instanceof WorkflowError.Unexpected) || (th2 instanceof AbstractC3594nE.h) || (th2 instanceof KycError.Unexpected) || (th2 instanceof BavError.Unexpected) || (th2 instanceof QesError.Unexpected) || (th2 instanceof C3393il)) {
            strC = c(th2);
        } else {
            strC = th2 instanceof ZD.b ? ((ZD.b) th2).getMessage() : null;
        }
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put(AnalyticsAttribute.Error, strB);
        if (strC != null) {
            mapC.put(AnalyticsAttribute.Reason, strC);
        }
        return p013kotlin.collections.v0.b(mapC);
    }

    public static final String b(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        if (th2 instanceof WorkflowError.ModuleError) {
            return ((WorkflowError.ModuleError) th2).getReason();
        }
        return th2 instanceof Bo ? ((Bo) th2).getAlias() : d(th2);
    }

    private static final String c(Throwable th2) {
        String strD;
        Throwable cause = th2.getCause();
        if (cause != null && (strD = d(cause)) != null) {
            return strD;
        }
        String message = th2.getMessage();
        return message == null ? AnalyticsAttribute.NotAvailable : message;
    }

    private static final String d(Throwable th2) {
        if (th2 instanceof Bo) {
            return ((Bo) th2).getAlias();
        }
        if (!(th2 instanceof WorkflowError)) {
            String simpleName = th2.getClass().getSimpleName();
            p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
            return simpleName;
        }
        WorkflowError workflowError = (WorkflowError) th2;
        if (workflowError instanceof WorkflowError.Canceled) {
            return "canceled";
        }
        if (workflowError instanceof WorkflowError.ModuleError) {
            return "module_error";
        }
        if (workflowError instanceof WorkflowError.InvalidWorkflowStatus) {
            return "invalid_workflow_status";
        }
        if (workflowError instanceof WorkflowError.InvalidSession) {
            return "invalid_session";
        }
        if (workflowError instanceof WorkflowError.ClientRejected) {
            return "client_rejected";
        }
        if (workflowError instanceof WorkflowError.ConfigurationNotSupported) {
            return "configuration_not_supported";
        }
        if (workflowError instanceof WorkflowError.Unexpected) {
            return "unexpected";
        }
        throw new NoWhenBranchMatchedException();
    }
}
