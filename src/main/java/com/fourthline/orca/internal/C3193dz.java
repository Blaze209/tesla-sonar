package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3193dz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f31274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31277d;

    public C3193dz(C3066az c3066az, Provider provider, Provider provider2, Provider provider3) {
        this.f31274a = c3066az;
        this.f31275b = provider;
        this.f31276c = provider2;
        this.f31277d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4018x8 get() {
        return a(this.f31274a, (NetworkEnvironment) this.f31275b.get(), (Gl) this.f31276c.get(), this.f31277d);
    }

    public static C3193dz a(C3066az c3066az, Provider provider, Provider provider2, Provider provider3) {
        return new C3193dz(c3066az, provider, provider2, provider3);
    }

    public static InterfaceC4018x8 a(C3066az c3066az, NetworkEnvironment networkEnvironment, Gl gl2, Provider provider) {
        return (InterfaceC4018x8) qj0.h.d(c3066az.b(networkEnvironment, gl2, provider));
    }
}
