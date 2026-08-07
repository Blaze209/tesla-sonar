package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowDataDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class A9 implements InterfaceC3051ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XE f24905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowConfigurationResponse f24906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OrcaFlavor f24907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rf f24908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OnProductCompleted f24909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3340ha f24910f;

    public A9(XE xe2, WorkflowConfigurationResponse tenantConfig, OrcaFlavor flavor, Rf firstFlow, OnProductCompleted completionBlock, C3340ha documentConfig) {
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        p013kotlin.jvm.internal.s.k(flavor, "flavor");
        p013kotlin.jvm.internal.s.k(firstFlow, "firstFlow");
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        p013kotlin.jvm.internal.s.k(documentConfig, "documentConfig");
        this.f24905a = xe2;
        this.f24906b = tenantConfig;
        this.f24907c = flavor;
        this.f24908d = firstFlow;
        this.f24909e = completionBlock;
        this.f24910f = documentConfig;
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
        return this.f24908d;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public WorkflowConfigurationResponse e() {
        return this.f24906b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A9)) {
            return false;
        }
        A9 a11 = (A9) obj;
        return p013kotlin.jvm.internal.s.f(this.f24905a, a11.f24905a) && p013kotlin.jvm.internal.s.f(this.f24906b, a11.f24906b) && p013kotlin.jvm.internal.s.f(this.f24907c, a11.f24907c) && p013kotlin.jvm.internal.s.f(this.f24908d, a11.f24908d) && p013kotlin.jvm.internal.s.f(this.f24909e, a11.f24909e) && p013kotlin.jvm.internal.s.f(this.f24910f, a11.f24910f);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public XE f() {
        return this.f24905a;
    }

    public final OnProductCompleted g() {
        return this.f24909e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public OrcaFlavor getFlavor() {
        return this.f24907c;
    }

    public final C3340ha h() {
        return this.f24910f;
    }

    public int hashCode() {
        XE xe2 = this.f24905a;
        return ((((((((((xe2 == null ? 0 : xe2.hashCode()) * 31) + this.f24906b.hashCode()) * 31) + this.f24907c.hashCode()) * 31) + this.f24908d.hashCode()) * 31) + this.f24909e.hashCode()) * 31) + this.f24910f.hashCode();
    }

    public String toString() {
        return "DocumentMainRepository(networkConfig=" + this.f24905a + ", tenantConfig=" + this.f24906b + ", flavor=" + this.f24907c + ", firstFlow=" + this.f24908d + ", completionBlock=" + this.f24909e + ", documentConfig=" + this.f24910f + ")";
    }

    @Override // com.fourthline.orca.internal.InterfaceC3552mF
    public void a(PE pe2) {
        InterfaceC3051ak.a.a(this, pe2);
    }
}
