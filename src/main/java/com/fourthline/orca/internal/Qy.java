package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.Orca;
import com.fourthline.orca.workflow.WorkflowConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class Qy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowConfig f27580b;

    public Qy(String validationCode, WorkflowConfig workflowConfig) {
        p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
        p013kotlin.jvm.internal.s.k(workflowConfig, "workflowConfig");
        this.f27579a = validationCode;
        this.f27580b = workflowConfig;
    }

    public final WorkflowConfig a() {
        return this.f27580b;
    }

    public final Orca.a b() {
        return Orca.a.Components;
    }

    public final NetworkEnvironment c() {
        return this.f27580b.getNetworkEnvironment();
    }

    public final C3765rE d() {
        return new C3765rE(this.f27579a, null, 2, null);
    }
}
