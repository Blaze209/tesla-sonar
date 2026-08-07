package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Tp implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f27958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27961d;

    public Tp(Sp sp2, Provider provider, Provider provider2, Provider provider3) {
        this.f27958a = sp2;
        this.f27959b = provider;
        this.f27960c = provider2;
        this.f27961d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3411j3 get() {
        return a(this.f27958a, (Kp) this.f27959b.get(), (InterfaceC3732qh) this.f27960c.get(), (C3438jo) this.f27961d.get());
    }

    public static Tp a(Sp sp2, Provider provider, Provider provider2, Provider provider3) {
        return new Tp(sp2, provider, provider2, provider3);
    }

    public static C3411j3 a(Sp sp2, Kp kp2, InterfaceC3732qh interfaceC3732qh, C3438jo c3438jo) {
        return (C3411j3) qj0.h.d(sp2.a(kp2, interfaceC3732qh, c3438jo));
    }
}
