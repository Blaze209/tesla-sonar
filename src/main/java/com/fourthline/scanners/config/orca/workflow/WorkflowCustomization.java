package com.fourthline.scanners.config.orca.workflow;

import com.fourthline.scanners.config.orca.flavor.OrcaFlavorConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "", "flavor", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "<init>", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;)V", "getFlavor$annotations", "()V", "getFlavor", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WorkflowCustomization {
    private final OrcaFlavorConfig flavor;

    public WorkflowCustomization(OrcaFlavorConfig orcaFlavorConfig) {
        this.flavor = orcaFlavorConfig;
    }

    public static /* synthetic */ WorkflowCustomization copy$default(WorkflowCustomization workflowCustomization, OrcaFlavorConfig orcaFlavorConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaFlavorConfig = workflowCustomization.flavor;
        }
        return workflowCustomization.copy(orcaFlavorConfig);
    }

    @o("flavor")
    public static /* synthetic */ void getFlavor$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaFlavorConfig getFlavor() {
        return this.flavor;
    }

    public final WorkflowCustomization copy(OrcaFlavorConfig flavor) {
        return new WorkflowCustomization(flavor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WorkflowCustomization) && s.f(this.flavor, ((WorkflowCustomization) other).flavor);
    }

    public final OrcaFlavorConfig getFlavor() {
        return this.flavor;
    }

    public int hashCode() {
        OrcaFlavorConfig orcaFlavorConfig = this.flavor;
        if (orcaFlavorConfig == null) {
            return 0;
        }
        return orcaFlavorConfig.hashCode();
    }

    public String toString() {
        return "WorkflowCustomization(flavor=" + this.flavor + ")";
    }
}
