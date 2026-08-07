package com.fourthline.scanners.config.orca.workflow;

import com.fourthline.orca.workflow.DocumentComponentConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/DocumentComponentFlowConfig;", "", "config", "Lcom/fourthline/orca/workflow/DocumentComponentConfig;", "customization", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "<init>", "(Lcom/fourthline/orca/workflow/DocumentComponentConfig;Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;)V", "getConfig", "()Lcom/fourthline/orca/workflow/DocumentComponentConfig;", "getCustomization$annotations", "()V", "getCustomization", "()Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentComponentFlowConfig {
    private final DocumentComponentConfig config;
    private final WorkflowCustomization customization;

    public DocumentComponentFlowConfig(DocumentComponentConfig config, WorkflowCustomization workflowCustomization) {
        s.k(config, "config");
        this.config = config;
        this.customization = workflowCustomization;
    }

    public static /* synthetic */ DocumentComponentFlowConfig copy$default(DocumentComponentFlowConfig documentComponentFlowConfig, DocumentComponentConfig documentComponentConfig, WorkflowCustomization workflowCustomization, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentComponentConfig = documentComponentFlowConfig.config;
        }
        if ((i11 & 2) != 0) {
            workflowCustomization = documentComponentFlowConfig.customization;
        }
        return documentComponentFlowConfig.copy(documentComponentConfig, workflowCustomization);
    }

    @o("customization")
    public static /* synthetic */ void getCustomization$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentComponentConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkflowCustomization getCustomization() {
        return this.customization;
    }

    public final DocumentComponentFlowConfig copy(DocumentComponentConfig config, WorkflowCustomization customization) {
        s.k(config, "config");
        return new DocumentComponentFlowConfig(config, customization);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentComponentFlowConfig)) {
            return false;
        }
        DocumentComponentFlowConfig documentComponentFlowConfig = (DocumentComponentFlowConfig) other;
        return s.f(this.config, documentComponentFlowConfig.config) && s.f(this.customization, documentComponentFlowConfig.customization);
    }

    public final DocumentComponentConfig getConfig() {
        return this.config;
    }

    public final WorkflowCustomization getCustomization() {
        return this.customization;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        WorkflowCustomization workflowCustomization = this.customization;
        return iHashCode + (workflowCustomization == null ? 0 : workflowCustomization.hashCode());
    }

    public String toString() {
        return "DocumentComponentFlowConfig(config=" + this.config + ", customization=" + this.customization + ")";
    }

    public /* synthetic */ DocumentComponentFlowConfig(DocumentComponentConfig documentComponentConfig, WorkflowCustomization workflowCustomization, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentComponentConfig, (i11 & 2) != 0 ? null : workflowCustomization);
    }
}
