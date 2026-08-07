package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Nm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mm f27065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27066b;

    public Nm(Mm mm2, Provider provider) {
        this.f27065a = mm2;
        this.f27066b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gm get() {
        return a(this.f27065a, (InterfaceC3732qh) this.f27066b.get());
    }

    public static Nm a(Mm mm2, Provider provider) {
        return new Nm(mm2, provider);
    }

    public static Gm a(Mm mm2, InterfaceC3732qh interfaceC3732qh) {
        return (Gm) qj0.h.d(mm2.a(interfaceC3732qh));
    }
}
