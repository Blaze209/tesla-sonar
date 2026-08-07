package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Xx implements InterfaceC3051ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OrcaFlavor f29775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rf f29776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnProductCompleted f29777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3619nx f29778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WorkflowConfigurationResponse f29779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final XE f29780f;

    public Xx(OrcaFlavor flavor, Rf firstFlow, OnProductCompleted completionBlock, C3619nx selfieConfig, WorkflowConfigurationResponse tenantConfig, XE networkConfig) {
        p013kotlin.jvm.internal.s.k(flavor, "flavor");
        p013kotlin.jvm.internal.s.k(firstFlow, "firstFlow");
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        p013kotlin.jvm.internal.s.k(selfieConfig, "selfieConfig");
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        this.f29775a = flavor;
        this.f29776b = firstFlow;
        this.f29777c = completionBlock;
        this.f29778d = selfieConfig;
        this.f29779e = tenantConfig;
        this.f29780f = networkConfig;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public boolean a() {
        return InterfaceC3051ak.a.b(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public WorkflowDataDelegate b() {
        return InterfaceC3051ak.a.c(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public DeviceDataCollection c() {
        return InterfaceC3051ak.a.a(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public Rf d() {
        return this.f29776b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public WorkflowConfigurationResponse e() {
        return this.f29779e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xx)) {
            return false;
        }
        Xx xx2 = (Xx) obj;
        return p013kotlin.jvm.internal.s.f(this.f29775a, xx2.f29775a) && p013kotlin.jvm.internal.s.f(this.f29776b, xx2.f29776b) && p013kotlin.jvm.internal.s.f(this.f29777c, xx2.f29777c) && p013kotlin.jvm.internal.s.f(this.f29778d, xx2.f29778d) && p013kotlin.jvm.internal.s.f(this.f29779e, xx2.f29779e) && p013kotlin.jvm.internal.s.f(this.f29780f, xx2.f29780f);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public XE f() {
        return this.f29780f;
    }

    public final OnProductCompleted g() {
        return this.f29777c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public OrcaFlavor getFlavor() {
        return this.f29775a;
    }

    public final C3619nx h() {
        return this.f29778d;
    }

    public int hashCode() {
        return (((((((((this.f29775a.hashCode() * 31) + this.f29776b.hashCode()) * 31) + this.f29777c.hashCode()) * 31) + this.f29778d.hashCode()) * 31) + this.f29779e.hashCode()) * 31) + this.f29780f.hashCode();
    }

    public String toString() {
        return "SelfieMainRepository(flavor=" + this.f29775a + ", firstFlow=" + this.f29776b + ", completionBlock=" + this.f29777c + ", selfieConfig=" + this.f29778d + ", tenantConfig=" + this.f29779e + ", networkConfig=" + this.f29780f + ")";
    }

    @Override // com.fourthline.orca.internal.InterfaceC3552mF
    public void a(PE pe2) {
        InterfaceC3051ak.a.a(this, pe2);
    }

    public /* synthetic */ Xx(OrcaFlavor orcaFlavor, Rf rf2, OnProductCompleted onProductCompleted, C3619nx c3619nx, WorkflowConfigurationResponse workflowConfigurationResponse, XE xe2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(orcaFlavor, (i11 & 2) != 0 ? new C3192dy() : rf2, onProductCompleted, c3619nx, workflowConfigurationResponse, xe2);
    }
}
