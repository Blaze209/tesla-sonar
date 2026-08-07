package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Tm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f27953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27954b;

    public Tm(Qm qm2, Provider provider) {
        this.f27953a = qm2;
        this.f27954b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lm get() {
        return a(this.f27953a, (InterfaceC3863tk) this.f27954b.get());
    }

    public static Tm a(Qm qm2, Provider provider) {
        return new Tm(qm2, provider);
    }

    public static Lm a(Qm qm2, InterfaceC3863tk interfaceC3863tk) {
        return (Lm) qj0.h.d(qm2.a(interfaceC3863tk));
    }
}
