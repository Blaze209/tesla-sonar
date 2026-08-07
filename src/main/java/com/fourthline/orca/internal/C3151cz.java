package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3151cz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f31032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31034c;

    public C3151cz(C3066az c3066az, Provider provider, Provider provider2) {
        this.f31032a = c3066az;
        this.f31033b = provider;
        this.f31034c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3457k6 get() {
        return a(this.f31032a, (NetworkEnvironment) this.f31033b.get(), (Gl) this.f31034c.get());
    }

    public static C3151cz a(C3066az c3066az, Provider provider, Provider provider2) {
        return new C3151cz(c3066az, provider, provider2);
    }

    public static InterfaceC3457k6 a(C3066az c3066az, NetworkEnvironment networkEnvironment, Gl gl2) {
        return (InterfaceC3457k6) qj0.h.d(c3066az.a(networkEnvironment, gl2));
    }
}
