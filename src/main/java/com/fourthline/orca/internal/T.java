package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f27819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27822d;

    public T(O o11, Provider provider, Provider provider2, Provider provider3) {
        this.f27819a = o11;
        this.f27820b = provider;
        this.f27821c = provider2;
        this.f27822d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public N get() {
        return a(this.f27819a, (InterfaceC3863tk) this.f27820b.get(), (C4087ys) this.f27821c.get(), (InterfaceC3732qh) this.f27822d.get());
    }

    public static T a(O o11, Provider provider, Provider provider2, Provider provider3) {
        return new T(o11, provider, provider2, provider3);
    }

    public static N a(O o11, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (N) qj0.h.d(o11.a(interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
