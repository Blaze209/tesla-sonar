package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.Orca;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3279fz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f31898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f31903f;

    public C3279fz(C3066az c3066az, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f31898a = c3066az;
        this.f31899b = provider;
        this.f31900c = provider2;
        this.f31901d = provider3;
        this.f31902e = provider4;
        this.f31903f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3508lE get() {
        return a(this.f31898a, (NetworkEnvironment) this.f31899b.get(), (Gl) this.f31900c.get(), this.f31901d, (Orca.a) this.f31902e.get(), (C3438jo) this.f31903f.get());
    }

    public static C3279fz a(C3066az c3066az, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3279fz(c3066az, provider, provider2, provider3, provider4, provider5);
    }

    public static InterfaceC3508lE a(C3066az c3066az, NetworkEnvironment networkEnvironment, Gl gl2, Provider provider, Orca.a aVar, C3438jo c3438jo) {
        return (InterfaceC3508lE) qj0.h.d(c3066az.a(networkEnvironment, gl2, provider, aVar, c3438jo));
    }
}
