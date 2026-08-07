package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class F1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f25692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25695d;

    public F1(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3) {
        this.f25692a = c4097z1;
        this.f25693b = provider;
        this.f25694c = provider2;
        this.f25695d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4054y1 get() {
        return a(this.f25692a, (InterfaceC3863tk) this.f25693b.get(), (C4087ys) this.f25694c.get(), (InterfaceC3732qh) this.f25695d.get());
    }

    public static F1 a(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3) {
        return new F1(c4097z1, provider, provider2, provider3);
    }

    public static C4054y1 a(C4097z1 c4097z1, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (C4054y1) qj0.h.d(c4097z1.a(interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
