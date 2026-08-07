package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Zp implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f30101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30102b;

    public Zp(Sp sp2, Provider provider) {
        this.f30101a = sp2;
        this.f30102b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3956vq get() {
        return a(this.f30101a, (Kp) this.f30102b.get());
    }

    public static Zp a(Sp sp2, Provider provider) {
        return new Zp(sp2, provider);
    }

    public static InterfaceC3956vq a(Sp sp2, Kp kp2) {
        return (InterfaceC3956vq) qj0.h.d(sp2.a(kp2));
    }
}
