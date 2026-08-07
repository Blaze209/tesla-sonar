package com.fourthline.scanners.config.orca.workflow;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowFlowConfig;", "", "configuration", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowConfig;", "customization", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "<init>", "(Lcom/fourthline/scanners/config/orca/workflow/WorkflowConfig;Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;)V", "getConfiguration$annotations", "()V", "getConfiguration", "()Lcom/fourthline/scanners/config/orca/workflow/WorkflowConfig;", "getCustomization$annotations", "getCustomization", "()Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WorkflowFlowConfig {
    private final WorkflowConfig configuration;
    private final WorkflowCustomization customization;

    public WorkflowFlowConfig(WorkflowConfig configuration, WorkflowCustomization workflowCustomization) {
        s.k(configuration, "configuration");
        this.configuration = configuration;
        this.customization = workflowCustomization;
    }

    public static /* synthetic */ WorkflowFlowConfig copy$default(WorkflowFlowConfig workflowFlowConfig, WorkflowConfig workflowConfig, WorkflowCustomization workflowCustomization, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            workflowConfig = workflowFlowConfig.configuration;
        }
        if ((i11 & 2) != 0) {
            workflowCustomization = workflowFlowConfig.customization;
        }
        return workflowFlowConfig.copy(workflowConfig, workflowCustomization);
    }

    @o("configuration")
    public static /* synthetic */ void getConfiguration$annotations() {
    }

    @o("customization")
    public static /* synthetic */ void getCustomization$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WorkflowConfig getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkflowCustomization getCustomization() {
        return this.customization;
    }

    public final WorkflowFlowConfig copy(WorkflowConfig configuration, WorkflowCustomization customization) {
        s.k(configuration, "configuration");
        return new WorkflowFlowConfig(configuration, customization);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowFlowConfig)) {
            return false;
        }
        WorkflowFlowConfig workflowFlowConfig = (WorkflowFlowConfig) other;
        return s.f(this.configuration, workflowFlowConfig.configuration) && s.f(this.customization, workflowFlowConfig.customization);
    }

    public final WorkflowConfig getConfiguration() {
        return this.configuration;
    }

    public final WorkflowCustomization getCustomization() {
        return this.customization;
    }

    public int hashCode() {
        int iHashCode = this.configuration.hashCode() * 31;
        WorkflowCustomization workflowCustomization = this.customization;
        return iHashCode + (workflowCustomization == null ? 0 : workflowCustomization.hashCode());
    }

    public String toString() {
        return "WorkflowFlowConfig(configuration=" + this.configuration + ", customization=" + this.customization + ")";
    }

    public /* synthetic */ WorkflowFlowConfig(WorkflowConfig workflowConfig, WorkflowCustomization workflowCustomization, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(workflowConfig, (i11 & 2) != 0 ? null : workflowCustomization);
    }
}
