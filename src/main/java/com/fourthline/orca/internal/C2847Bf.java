package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.Orca;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowCustomizationConfig;
import com.fourthline.orca.workflow.WorkflowDataDelegate;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2847Bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowConfig f25093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WorkflowDataDelegate f25094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnProductCompleted f25095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final If f25096e;

    public C2847Bf(String validationCode, WorkflowConfig workflowConfig, WorkflowDataDelegate workflowDataDelegate, OnProductCompleted completionBlock, WorkflowCustomizationConfig customizationConfig) {
        p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
        p013kotlin.jvm.internal.s.k(workflowConfig, "workflowConfig");
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        p013kotlin.jvm.internal.s.k(customizationConfig, "customizationConfig");
        this.f25092a = validationCode;
        this.f25093b = workflowConfig;
        this.f25094c = workflowDataDelegate;
        this.f25095d = completionBlock;
        this.f25096e = new If(workflowConfig, workflowDataDelegate, customizationConfig.getFlavor());
    }

    public final Orca.a a() {
        return Orca.a.Workflow;
    }

    public final InterfaceC3051ak b() {
        return this.f25096e;
    }

    public final NetworkEnvironment c() {
        return this.f25093b.getNetworkEnvironment();
    }

    public final Ts d() {
        return new Kf(this.f25095d);
    }

    public final Wf e() {
        return new Wf("NavigationDestination.Workflow::class.java");
    }

    public final C3765rE f() {
        return new C3765rE(this.f25092a, null, 2, null);
    }
}
