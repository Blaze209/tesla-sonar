package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Rm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f27635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27636b;

    public Rm(Qm qm2, Provider provider) {
        this.f27635a = qm2;
        this.f27636b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Jm get() {
        return a(this.f27635a, (InterfaceC3051ak) this.f27636b.get());
    }

    public static Rm a(Qm qm2, Provider provider) {
        return new Rm(qm2, provider);
    }

    public static Jm a(Qm qm2, InterfaceC3051ak interfaceC3051ak) {
        return (Jm) qj0.h.d(qm2.a(interfaceC3051ak));
    }
}
