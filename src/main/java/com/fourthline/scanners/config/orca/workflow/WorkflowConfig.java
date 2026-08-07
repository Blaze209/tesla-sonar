package com.fourthline.scanners.config.orca.workflow;

import com.fourthline.networking.NetworkEnvironment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowConfig;", "", WorkflowKeys.VALIDATION_CODE, "", WorkflowKeys.NETWORK_ENVIRONMENT, "Lcom/fourthline/networking/NetworkEnvironment;", "<init>", "(Ljava/lang/String;Lcom/fourthline/networking/NetworkEnvironment;)V", "getValidationCode$annotations", "()V", "getValidationCode", "()Ljava/lang/String;", "getNetworkEnvironment$annotations", "getNetworkEnvironment", "()Lcom/fourthline/networking/NetworkEnvironment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WorkflowConfig {
    private final NetworkEnvironment networkEnvironment;
    private final String validationCode;

    public WorkflowConfig(String validationCode, NetworkEnvironment networkEnvironment) {
        s.k(validationCode, "validationCode");
        s.k(networkEnvironment, "networkEnvironment");
        this.validationCode = validationCode;
        this.networkEnvironment = networkEnvironment;
    }

    public static /* synthetic */ WorkflowConfig copy$default(WorkflowConfig workflowConfig, String str, NetworkEnvironment networkEnvironment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = workflowConfig.validationCode;
        }
        if ((i11 & 2) != 0) {
            networkEnvironment = workflowConfig.networkEnvironment;
        }
        return workflowConfig.copy(str, networkEnvironment);
    }

    @o(WorkflowKeys.NETWORK_ENVIRONMENT)
    public static /* synthetic */ void getNetworkEnvironment$annotations() {
    }

    @o(WorkflowKeys.VALIDATION_CODE)
    public static /* synthetic */ void getValidationCode$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValidationCode() {
        return this.validationCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkEnvironment getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    public final WorkflowConfig copy(String validationCode, NetworkEnvironment networkEnvironment) {
        s.k(validationCode, "validationCode");
        s.k(networkEnvironment, "networkEnvironment");
        return new WorkflowConfig(validationCode, networkEnvironment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowConfig)) {
            return false;
        }
        WorkflowConfig workflowConfig = (WorkflowConfig) other;
        return s.f(this.validationCode, workflowConfig.validationCode) && s.f(this.networkEnvironment, workflowConfig.networkEnvironment);
    }

    public final NetworkEnvironment getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    public final String getValidationCode() {
        return this.validationCode;
    }

    public int hashCode() {
        return (this.validationCode.hashCode() * 31) + this.networkEnvironment.hashCode();
    }

    public String toString() {
        return "WorkflowConfig(validationCode=" + this.validationCode + ", networkEnvironment=" + this.networkEnvironment + ")";
    }
}
