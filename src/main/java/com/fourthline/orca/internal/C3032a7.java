package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3032a7 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z6 f30311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30313c;

    public C3032a7(Z6 z11, Provider provider, Provider provider2) {
        this.f30311a = z11;
        this.f30312b = provider;
        this.f30313c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3837t0 get() {
        return a(this.f30311a, (InterfaceC3212eb) this.f30312b.get(), (WC) this.f30313c.get());
    }

    public static C3032a7 a(Z6 z11, Provider provider, Provider provider2) {
        return new C3032a7(z11, provider, provider2);
    }

    public static InterfaceC3837t0 a(Z6 z11, InterfaceC3212eb interfaceC3212eb, WC wc2) {
        return (InterfaceC3837t0) qj0.h.d(z11.a(interfaceC3212eb, wc2));
    }
}
