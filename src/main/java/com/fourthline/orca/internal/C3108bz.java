package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3108bz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f30733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30736d;

    public C3108bz(C3066az c3066az, Provider provider, Provider provider2, Provider provider3) {
        this.f30733a = c3066az;
        this.f30734b = provider;
        this.f30735c = provider2;
        this.f30736d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3625o2 get() {
        return a(this.f30733a, (NetworkEnvironment) this.f30734b.get(), (Gl) this.f30735c.get(), this.f30736d);
    }

    public static C3108bz a(C3066az c3066az, Provider provider, Provider provider2, Provider provider3) {
        return new C3108bz(c3066az, provider, provider2, provider3);
    }

    public static InterfaceC3625o2 a(C3066az c3066az, NetworkEnvironment networkEnvironment, Gl gl2, Provider provider) {
        return (InterfaceC3625o2) qj0.h.d(c3066az.a(networkEnvironment, gl2, provider));
    }
}
