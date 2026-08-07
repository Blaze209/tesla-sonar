package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ak implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4079yk f24961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f24964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f24965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f24966f;

    public Ak(C4079yk c4079yk, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f24961a = c4079yk;
        this.f24962b = provider;
        this.f24963c = provider2;
        this.f24964d = provider3;
        this.f24965e = provider4;
        this.f24966f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Zj get() {
        return a(this.f24961a, (InterfaceC3051ak) this.f24962b.get(), (InterfaceC3997wo) this.f24963c.get(), (Fk) this.f24964d.get(), (HA) this.f24965e.get(), (InterfaceC3692pk) this.f24966f.get());
    }

    public static Ak a(C4079yk c4079yk, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Ak(c4079yk, provider, provider2, provider3, provider4, provider5);
    }

    public static Zj a(C4079yk c4079yk, InterfaceC3051ak interfaceC3051ak, InterfaceC3997wo interfaceC3997wo, Fk fk2, HA ha2, InterfaceC3692pk interfaceC3692pk) {
        return (Zj) qj0.h.d(c4079yk.a(interfaceC3051ak, interfaceC3997wo, fk2, ha2, interfaceC3692pk));
    }
}
