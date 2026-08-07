package com.fourthline.orca.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.Orca;
import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.ProductPresentationStep;
import com.fourthline.orca.internal.AbstractC3481ko;
import com.fourthline.orca.internal.C3209eE;
import com.fourthline.orca.internal.D6;
import com.fourthline.orca.internal.Jf;
import com.fourthline.orca.internal.Os;
import com.fourthline.orca.internal.XE;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n0\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0012\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\u000f*\f\u0012\b\u0012\u00060\tj\u0002`\n0\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/fourthline/orca/Orca;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", WorkflowKeys.VALIDATION_CODE, "Lcom/fourthline/networking/NetworkEnvironment;", WorkflowKeys.NETWORK_ENVIRONMENT, "Lcom/fourthline/orca/core/ProductCustomizationStep;", "Lcom/fourthline/orca/workflow/WorkflowCustomizationConfig;", "Ljn0/h0;", "Lcom/fourthline/orca/workflow/WorkflowResult;", AnalyticsContext.Workflow, "(Lcom/fourthline/orca/Orca;Landroid/content/Context;Ljava/lang/String;Lcom/fourthline/networking/NetworkEnvironment;)Lcom/fourthline/orca/core/ProductCustomizationStep;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/fourthline/networking/NetworkEnvironment;)Lcom/fourthline/orca/core/ProductCustomizationStep;", "Lcom/fourthline/orca/core/ProductPresentationStep;", "Lcom/fourthline/orca/workflow/WorkflowDataDelegate;", "delegate", "addDelegate", "(Lcom/fourthline/orca/core/ProductPresentationStep;Lcom/fourthline/orca/workflow/WorkflowDataDelegate;)Lcom/fourthline/orca/core/ProductPresentationStep;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/workflow/WorkflowError;", "getWorkflowError", "(Lcom/fourthline/orca/qes/internal/error/QesError;)Lcom/fourthline/orca/workflow/WorkflowError;", "workflowError", "Lcom/fourthline/orca/bav/internal/error/BavError;", "(Lcom/fourthline/orca/bav/internal/error/BavError;)Lcom/fourthline/orca/workflow/WorkflowError;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "(Lcom/fourthline/orca/kyc/internal/error/KycError;)Lcom/fourthline/orca/workflow/WorkflowError;", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowBuilder {
    private static final ProductCustomizationStep a(Context context, String str, NetworkEnvironment networkEnvironment) {
        Jf jf2 = new Jf(str);
        return new Os(context, new WorkflowConfig(networkEnvironment), new D6(jf2), new WorkflowCustomizationConfig(null, 1, null), new XE(networkEnvironment, AnalyticsAttribute.NotAvailable, AnalyticsAttribute.NotAvailable, AnalyticsAttribute.NotAvailable), new C3209eE());
    }

    public static final ProductPresentationStep<h0> addDelegate(ProductPresentationStep<h0> productPresentationStep, WorkflowDataDelegate delegate) {
        s.k(productPresentationStep, "<this>");
        s.k(delegate, "delegate");
        if (productPresentationStep instanceof Os) {
            ((Os) productPresentationStep).a(WorkflowBuilderFields.DATA_DELEGATE, delegate);
        }
        return productPresentationStep;
    }

    public static final WorkflowError getWorkflowError(QesError qesError) {
        s.k(qesError, "<this>");
        if (qesError instanceof QesError.Canceled) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (qesError instanceof QesError.Rejected) {
            return WorkflowError.ClientRejected.INSTANCE;
        }
        if (qesError instanceof QesError.Unexpected) {
            return new WorkflowError.Unexpected(((QesError.Unexpected) qesError).getMessage());
        }
        return new WorkflowError.ModuleError("QualifiedElectronicSignature." + qesError.getAlias());
    }

    public static final ProductCustomizationStep<WorkflowCustomizationConfig, h0> workflow(Orca orca, Context context, String validationCode, NetworkEnvironment networkEnvironment) throws Throwable {
        s.k(orca, "<this>");
        s.k(context, "context");
        s.k(validationCode, "validationCode");
        s.k(networkEnvironment, "networkEnvironment");
        AbstractC3481ko.a(context);
        return a(context, validationCode, networkEnvironment);
    }

    public static /* synthetic */ ProductCustomizationStep workflow$default(Orca orca, Context context, String str, NetworkEnvironment networkEnvironment, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            networkEnvironment = NetworkEnvironment.Production.INSTANCE;
        }
        return workflow(orca, context, str, networkEnvironment);
    }

    public static final WorkflowError getWorkflowError(BavError bavError) {
        s.k(bavError, "<this>");
        if (bavError instanceof BavError.Canceled) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (bavError instanceof BavError.Unexpected) {
            return new WorkflowError.Unexpected(((BavError.Unexpected) bavError).getMessage());
        }
        if (bavError instanceof BavError.Generic) {
            return new WorkflowError.ModuleError("BankAccountVerification.Failed");
        }
        if (bavError instanceof BavError.KycRequired) {
            return new WorkflowError.ModuleError("BankAccountVerification.KycRequired");
        }
        if (bavError instanceof BavError.InvalidStatus) {
            return new WorkflowError.Unexpected("BankAccountVerification.InvalidStatus");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final WorkflowError getWorkflowError(KycError kycError) {
        s.k(kycError, "<this>");
        if (kycError instanceof KycError.Canceled) {
            return WorkflowError.Canceled.INSTANCE;
        }
        if (kycError instanceof KycError.Unexpected) {
            return new WorkflowError.Unexpected(((KycError.Unexpected) kycError).getMessage());
        }
        return new WorkflowError.ModuleError("IdentityVerification." + kycError.getAlias());
    }
}
