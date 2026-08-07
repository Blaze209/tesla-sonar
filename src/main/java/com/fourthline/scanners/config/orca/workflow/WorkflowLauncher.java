package com.fourthline.scanners.config.orca.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.Orca;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowBuilder;
import com.fourthline.orca.workflow.WorkflowBuilderFields;
import com.fourthline.orca.workflow.WorkflowCustomizationConfig;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import com.fourthline.scanners.config.orca.flavor.OrcaFlavorConfig;
import com.fourthline.scanners.config.orca.flavor.extensions.OrcaFlavorConfigExtensionsKt;
import jn0.h0;
import jn0.s;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowLauncher;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fourthline/scanners/config/orca/workflow/WorkflowFlowConfig;", "flowConfig", "Lcom/fourthline/orca/workflow/WorkflowDataDelegate;", WorkflowBuilderFields.DATA_DELEGATE, "Lkotlin/Function1;", "Ljn0/s;", "Ljn0/h0;", "Lcom/fourthline/orca/workflow/WorkflowResult;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowCompletionCallback;", "onWorkflowCompleted", "launch", "(Landroid/content/Context;Lcom/fourthline/scanners/config/orca/workflow/WorkflowFlowConfig;Lcom/fourthline/orca/workflow/WorkflowDataDelegate;Lwn0/l;)V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowLauncher {
    public static final WorkflowLauncher INSTANCE = new WorkflowLauncher();

    private WorkflowLauncher() {
    }

    public final void launch(Context context, WorkflowFlowConfig flowConfig, WorkflowDataDelegate dataDelegate, final l<? super s<h0>, h0> onWorkflowCompleted) {
        OrcaFlavor orcaFlavor;
        OrcaFlavorConfig flavor;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(dataDelegate, "dataDelegate");
        p013kotlin.jvm.internal.s.k(onWorkflowCompleted, "onWorkflowCompleted");
        ProductCustomizationStep<WorkflowCustomizationConfig, h0> productCustomizationStepWorkflow = WorkflowBuilder.workflow(Orca.INSTANCE, context, flowConfig.getConfiguration().getValidationCode(), flowConfig.getConfiguration().getNetworkEnvironment());
        WorkflowCustomization customization = flowConfig.getCustomization();
        if (customization == null || (flavor = customization.getFlavor()) == null || (orcaFlavor = OrcaFlavorConfigExtensionsKt.toOrcaFlavor(flavor, context)) == null) {
            orcaFlavor = new OrcaFlavor(null, null, null, null, null, 31, null);
        }
        WorkflowBuilder.addDelegate(productCustomizationStepWorkflow.customize(new WorkflowCustomizationConfig(orcaFlavor)), dataDelegate).present(new OnProductCompleted() { // from class: com.fourthline.scanners.config.orca.workflow.WorkflowLauncher$launch$1$1
            @Override // com.fourthline.orca.core.OnProductCompleted
            public final void onResult(Object obj) {
                onWorkflowCompleted.invoke(s.a(obj));
            }
        });
    }
}
