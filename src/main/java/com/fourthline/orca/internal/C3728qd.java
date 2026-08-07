package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3728qd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f34806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f34809d;

    public C3728qd(C3599nd c3599nd, Provider provider, Provider provider2, Provider provider3) {
        this.f34806a = c3599nd;
        this.f34807b = provider;
        this.f34808c = provider2;
        this.f34809d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3022Zd get() {
        return a(this.f34806a, (InterfaceC2891Je) this.f34807b.get(), (InterfaceC4073ye) this.f34808c.get(), (InterfaceC2889Jc) this.f34809d.get());
    }

    public static C3728qd a(C3599nd c3599nd, Provider provider, Provider provider2, Provider provider3) {
        return new C3728qd(c3599nd, provider, provider2, provider3);
    }

    public static InterfaceC3022Zd a(C3599nd c3599nd, InterfaceC2891Je interfaceC2891Je, InterfaceC4073ye interfaceC4073ye, InterfaceC2889Jc interfaceC2889Jc) {
        return (InterfaceC3022Zd) qj0.h.d(c3599nd.a(interfaceC2891Je, interfaceC4073ye, interfaceC2889Jc));
    }
}
