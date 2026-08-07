package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ot implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27227d;

    public Ot(Et et2, Provider provider, Provider provider2, Provider provider3) {
        this.f27224a = et2;
        this.f27225b = provider;
        this.f27226c = provider2;
        this.f27227d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2931Re get() {
        return a(this.f27224a, (InterfaceC2931Re) this.f27225b.get(), (InterfaceC2931Re) this.f27226c.get(), (InterfaceC2931Re) this.f27227d.get());
    }

    public static Ot a(Et et2, Provider provider, Provider provider2, Provider provider3) {
        return new Ot(et2, provider, provider2, provider3);
    }

    public static InterfaceC2931Re a(Et et2, InterfaceC2931Re interfaceC2931Re, InterfaceC2931Re interfaceC2931Re2, InterfaceC2931Re interfaceC2931Re3) {
        return (InterfaceC2931Re) qj0.h.d(et2.a(interfaceC2931Re, interfaceC2931Re2, interfaceC2931Re3));
    }
}
