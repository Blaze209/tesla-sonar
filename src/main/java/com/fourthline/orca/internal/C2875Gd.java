package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2875Gd implements InterfaceC2869Fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3257fd f25945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkEnvironment f25946b;

    public C2875Gd(C3257fd eidFlowConfig, NetworkEnvironment networkEnvironment) {
        p013kotlin.jvm.internal.s.k(eidFlowConfig, "eidFlowConfig");
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        this.f25945a = eidFlowConfig;
        this.f25946b = networkEnvironment;
    }

    @Override // com.fourthline.orca.internal.InterfaceC2869Fd
    public boolean a() {
        return p013kotlin.jvm.internal.s.f(this.f25946b, NetworkEnvironment.Sandbox.INSTANCE) && this.f25945a.getBoxCardSimulation();
    }
}
