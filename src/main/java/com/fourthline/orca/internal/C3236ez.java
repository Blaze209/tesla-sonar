package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3236ez implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f31555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31558d;

    public C3236ez(C3066az c3066az, Provider provider, Provider provider2, Provider provider3) {
        this.f31555a = c3066az;
        this.f31556b = provider;
        this.f31557c = provider2;
        this.f31558d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4049xx get() {
        return a(this.f31555a, (NetworkEnvironment) this.f31556b.get(), (Gl) this.f31557c.get(), this.f31558d);
    }

    public static C3236ez a(C3066az c3066az, Provider provider, Provider provider2, Provider provider3) {
        return new C3236ez(c3066az, provider, provider2, provider3);
    }

    public static InterfaceC4049xx a(C3066az c3066az, NetworkEnvironment networkEnvironment, Gl gl2, Provider provider) {
        return (InterfaceC4049xx) qj0.h.d(c3066az.c(networkEnvironment, gl2, provider));
    }
}
