package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Sm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f27789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27791c;

    public Sm(Qm qm2, Provider provider, Provider provider2) {
        this.f27789a = qm2;
        this.f27790b = provider;
        this.f27791c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4039xn get() {
        return a(this.f27789a, (Uj) this.f27790b.get(), (InterfaceC3732qh) this.f27791c.get());
    }

    public static Sm a(Qm qm2, Provider provider, Provider provider2) {
        return new Sm(qm2, provider, provider2);
    }

    public static C4039xn a(Qm qm2, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C4039xn) qj0.h.d(qm2.a(uj2, interfaceC3732qh));
    }
}
