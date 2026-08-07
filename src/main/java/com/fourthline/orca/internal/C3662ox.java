package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3662ox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xx f34394a;

    public C3662ox(C3619nx selfieConfig, SelfieCustomizationConfig customizationConfig, OnProductCompleted completionBlock, WorkflowConfigurationResponse tenantConfig, XE networkConfig) {
        p013kotlin.jvm.internal.s.k(selfieConfig, "selfieConfig");
        p013kotlin.jvm.internal.s.k(customizationConfig, "customizationConfig");
        p013kotlin.jvm.internal.s.k(completionBlock, "completionBlock");
        p013kotlin.jvm.internal.s.k(tenantConfig, "tenantConfig");
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        this.f34394a = new Xx(customizationConfig.getFlavor(), null, completionBlock, selfieConfig, tenantConfig, networkConfig, 2, null);
    }

    public final InterfaceC3051ak a() {
        return this.f34394a;
    }

    public final Ts b() {
        return new C3235ey(this.f34394a.g());
    }

    public final Wf c() {
        return new Wf("NavigationDestination.Selfie::class.java");
    }

    public final Xx d() {
        return this.f34394a;
    }
}
