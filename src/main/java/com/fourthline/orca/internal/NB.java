package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class NB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27037b;

    public NB(BB bb2, Provider provider) {
        this.f27036a = bb2;
        this.f27037b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3014Ya get() {
        return a(this.f27036a, (InterfaceC3732qh) this.f27037b.get());
    }

    public static NB a(BB bb2, Provider provider) {
        return new NB(bb2, provider);
    }

    public static C3014Ya a(BB bb2, InterfaceC3732qh interfaceC3732qh) {
        return (C3014Ya) qj0.h.d(bb2.b(interfaceC3732qh));
    }
}
