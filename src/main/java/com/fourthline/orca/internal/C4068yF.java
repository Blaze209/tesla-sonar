package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4068yF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4025xF f36970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36973d;

    public C4068yF(C4025xF c4025xF, Provider provider, Provider provider2, Provider provider3) {
        this.f36970a = c4025xF;
        this.f36971b = provider;
        this.f36972c = provider2;
        this.f36973d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3852tF get() {
        return a(this.f36970a, (NetworkEnvironment) this.f36971b.get(), (Gl) this.f36972c.get(), this.f36973d);
    }

    public static C4068yF a(C4025xF c4025xF, Provider provider, Provider provider2, Provider provider3) {
        return new C4068yF(c4025xF, provider, provider2, provider3);
    }

    public static InterfaceC3852tF a(C4025xF c4025xF, NetworkEnvironment networkEnvironment, Gl gl2, Provider provider) {
        return (InterfaceC3852tF) qj0.h.d(c4025xF.a(networkEnvironment, gl2, provider));
    }
}
