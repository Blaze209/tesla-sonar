package com.fourthline.orca.workflow;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowConfig;", "Lcom/fourthline/orca/core/ProductConfig;", "Lcom/fourthline/networking/NetworkEnvironment;", WorkflowKeys.NETWORK_ENVIRONMENT, "<init>", "(Lcom/fourthline/networking/NetworkEnvironment;)V", "component1", "()Lcom/fourthline/networking/NetworkEnvironment;", "copy", "(Lcom/fourthline/networking/NetworkEnvironment;)Lcom/fourthline/orca/workflow/WorkflowConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/networking/NetworkEnvironment;", "getNetworkEnvironment", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WorkflowConfig implements ProductConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NetworkEnvironment networkEnvironment;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WorkflowConfig copy$default(WorkflowConfig workflowConfig, NetworkEnvironment networkEnvironment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            networkEnvironment = workflowConfig.networkEnvironment;
        }
        return workflowConfig.copy(networkEnvironment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkEnvironment getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    public final WorkflowConfig copy(NetworkEnvironment networkEnvironment) {
        s.k(networkEnvironment, "networkEnvironment");
        return new WorkflowConfig(networkEnvironment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WorkflowConfig) && s.f(this.networkEnvironment, ((WorkflowConfig) other).networkEnvironment);
    }

    public final NetworkEnvironment getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    public int hashCode() {
        return this.networkEnvironment.hashCode();
    }

    public String toString() {
        return "WorkflowConfig(networkEnvironment=" + this.networkEnvironment + ")";
    }

    public WorkflowConfig(NetworkEnvironment networkEnvironment) {
        s.k(networkEnvironment, "networkEnvironment");
        this.networkEnvironment = networkEnvironment;
    }

    public /* synthetic */ WorkflowConfig(NetworkEnvironment networkEnvironment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? NetworkEnvironment.Production.INSTANCE : networkEnvironment);
    }
}
