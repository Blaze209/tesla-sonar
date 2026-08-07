package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Vm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f29134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29136c;

    public Vm(Qm qm2, Provider provider, Provider provider2) {
        this.f29134a = qm2;
        this.f29135b = provider;
        this.f29136c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3437jn get() {
        return a(this.f29134a, (wn0.a) this.f29135b.get(), (InterfaceC3645og) this.f29136c.get());
    }

    public static Vm a(Qm qm2, Provider provider, Provider provider2) {
        return new Vm(qm2, provider, provider2);
    }

    public static C3437jn a(Qm qm2, wn0.a aVar, InterfaceC3645og interfaceC3645og) {
        return (C3437jn) qj0.h.d(qm2.a(aVar, interfaceC3645og));
    }
}
