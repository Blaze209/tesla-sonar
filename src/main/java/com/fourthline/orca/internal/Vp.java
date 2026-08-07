package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Vp implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f29190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29192c;

    public Vp(Sp sp2, Provider provider, Provider provider2) {
        this.f29190a = sp2;
        this.f29191b = provider;
        this.f29192c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P5 get() {
        return a(this.f29190a, (InterfaceC3869tq) this.f29191b.get(), (InterfaceC3606nk) this.f29192c.get());
    }

    public static Vp a(Sp sp2, Provider provider, Provider provider2) {
        return new Vp(sp2, provider, provider2);
    }

    public static P5 a(Sp sp2, InterfaceC3869tq interfaceC3869tq, InterfaceC3606nk interfaceC3606nk) {
        return (P5) qj0.h.d(sp2.a(interfaceC3869tq, interfaceC3606nk));
    }
}
