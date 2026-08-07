package com.fourthline.scanners.config.orca.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.Orca;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import com.fourthline.orca.workflow.BiometricsComponentResult;
import com.fourthline.orca.workflow.DocumentComponentResult;
import com.fourthline.orca.workflow.SessionBuilderKt;
import com.fourthline.orca.workflow.WorkflowSession;
import com.fourthline.scanners.config.orca.flavor.OrcaFlavorConfig;
import com.fourthline.scanners.config.orca.flavor.extensions.OrcaFlavorConfigExtensionsKt;
import jn0.h0;
import jn0.s;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0004\u0012\u00020\u000b0\bj\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t\u0012\u0004\u0012\u00020\u000b0\bj\u0002`\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowComponentsLauncher;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fourthline/scanners/config/orca/workflow/WorkflowFlowConfig;", "workflowConfig", "Lkotlin/Function1;", "Ljn0/s;", "Lcom/fourthline/orca/workflow/WorkflowSession;", "Ljn0/h0;", "onResult", "startSession", "(Landroid/content/Context;Lcom/fourthline/scanners/config/orca/workflow/WorkflowFlowConfig;Lwn0/l;)V", "workflowSession", "Lcom/fourthline/scanners/config/orca/workflow/DocumentComponentFlowConfig;", "documentComponentFlowConfig", "Lcom/fourthline/orca/workflow/DocumentComponentResult;", "Lcom/fourthline/scanners/config/orca/workflow/DocumentComponentCompletionCallback;", "onCompleted", "startDocumentComponent", "(Landroid/content/Context;Lcom/fourthline/orca/workflow/WorkflowSession;Lcom/fourthline/scanners/config/orca/workflow/DocumentComponentFlowConfig;Lwn0/l;)V", "Lcom/fourthline/scanners/config/orca/workflow/BiometricsComponentFlowConfig;", "biometricsComponentFlowConfig", "Lcom/fourthline/orca/workflow/BiometricsComponentResult;", "Lcom/fourthline/scanners/config/orca/workflow/BiometricsComponentCompletionCallback;", "startBiometricsComponent", "(Landroid/content/Context;Lcom/fourthline/orca/workflow/WorkflowSession;Lcom/fourthline/scanners/config/orca/workflow/BiometricsComponentFlowConfig;Lwn0/l;)V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowComponentsLauncher {
    public static final WorkflowComponentsLauncher INSTANCE = new WorkflowComponentsLauncher();

    private WorkflowComponentsLauncher() {
    }

    public final void startBiometricsComponent(Context context, WorkflowSession workflowSession, BiometricsComponentFlowConfig biometricsComponentFlowConfig, final l<? super s<BiometricsComponentResult>, h0> onCompleted) {
        OrcaFlavor orcaFlavor;
        OrcaFlavorConfig flavor;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workflowSession, "workflowSession");
        p013kotlin.jvm.internal.s.k(biometricsComponentFlowConfig, "biometricsComponentFlowConfig");
        p013kotlin.jvm.internal.s.k(onCompleted, "onCompleted");
        WorkflowCustomization customization = biometricsComponentFlowConfig.getCustomization();
        if (customization == null || (flavor = customization.getFlavor()) == null || (orcaFlavor = OrcaFlavorConfigExtensionsKt.toOrcaFlavor(flavor, context)) == null) {
            orcaFlavor = new OrcaFlavor(null, null, null, null, null, 31, null);
        }
        workflowSession.biometricsComponent(context).customize(new SelfieCustomizationConfig(orcaFlavor)).present(new OnProductCompleted() { // from class: com.fourthline.scanners.config.orca.workflow.WorkflowComponentsLauncher.startBiometricsComponent.1
            @Override // com.fourthline.orca.core.OnProductCompleted
            public final void onResult(Object obj) {
                onCompleted.invoke(s.a(obj));
            }
        });
    }

    public final void startDocumentComponent(Context context, WorkflowSession workflowSession, DocumentComponentFlowConfig documentComponentFlowConfig, final l<? super s<DocumentComponentResult>, h0> onCompleted) {
        OrcaFlavor orcaFlavor;
        OrcaFlavorConfig flavor;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workflowSession, "workflowSession");
        p013kotlin.jvm.internal.s.k(documentComponentFlowConfig, "documentComponentFlowConfig");
        p013kotlin.jvm.internal.s.k(onCompleted, "onCompleted");
        WorkflowCustomization customization = documentComponentFlowConfig.getCustomization();
        if (customization == null || (flavor = customization.getFlavor()) == null || (orcaFlavor = OrcaFlavorConfigExtensionsKt.toOrcaFlavor(flavor, context)) == null) {
            orcaFlavor = new OrcaFlavor(null, null, null, null, null, 31, null);
        }
        workflowSession.documentComponent(context, documentComponentFlowConfig.getConfig()).customize(new DocumentCustomizationConfig(orcaFlavor)).present(new OnProductCompleted() { // from class: com.fourthline.scanners.config.orca.workflow.WorkflowComponentsLauncher.startDocumentComponent.1
            @Override // com.fourthline.orca.core.OnProductCompleted
            public final void onResult(Object obj) {
                onCompleted.invoke(s.a(obj));
            }
        });
    }

    public final void startSession(Context context, WorkflowFlowConfig workflowConfig, l<? super s<? extends WorkflowSession>, h0> onResult) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workflowConfig, "workflowConfig");
        p013kotlin.jvm.internal.s.k(onResult, "onResult");
        SessionBuilderKt.workflowSession(Orca.INSTANCE, context, workflowConfig.getConfiguration().getValidationCode()).configure(new com.fourthline.orca.workflow.WorkflowConfig(workflowConfig.getConfiguration().getNetworkEnvironment())).start(onResult);
    }
}
