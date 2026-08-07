package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XE f27323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowConfigurationResponse f27324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3724qF f27325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f27326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rf f27327e;

    public PE(XE networkConfig, WorkflowConfigurationResponse tenantConfig, C3724qF status, List modules, Rf rf2) {
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(modules, "modules");
        this.f27323a = networkConfig;
        this.f27324b = tenantConfig;
        this.f27325c = status;
        this.f27326d = modules;
        this.f27327e = rf2;
    }

    public final Rf a() {
        return this.f27327e;
    }

    public final List b() {
        return this.f27326d;
    }

    public final XE c() {
        return this.f27323a;
    }

    public final C3724qF d() {
        return this.f27325c;
    }

    public final WorkflowConfigurationResponse e() {
        return this.f27324b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PE)) {
            return false;
        }
        PE pe2 = (PE) obj;
        return p013kotlin.jvm.internal.s.f(this.f27323a, pe2.f27323a) && p013kotlin.jvm.internal.s.f(this.f27324b, pe2.f27324b) && p013kotlin.jvm.internal.s.f(this.f27325c, pe2.f27325c) && p013kotlin.jvm.internal.s.f(this.f27326d, pe2.f27326d) && p013kotlin.jvm.internal.s.f(this.f27327e, pe2.f27327e);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f27323a.hashCode() * 31) + this.f27324b.hashCode()) * 31) + this.f27325c.hashCode()) * 31) + this.f27326d.hashCode()) * 31;
        Rf rf2 = this.f27327e;
        return iHashCode + (rf2 == null ? 0 : rf2.hashCode());
    }

    public String toString() {
        return "WorkflowMobileSession(networkConfig=" + this.f27323a + ", tenantConfig=" + this.f27324b + ", status=" + this.f27325c + ", modules=" + this.f27326d + ", firstFlow=" + this.f27327e + ")";
    }
}
