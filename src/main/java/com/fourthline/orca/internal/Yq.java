package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Yq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tq f29932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29934c;

    public Yq(Tq tq2, Provider provider, Provider provider2) {
        this.f29932a = tq2;
        this.f29933b = provider;
        this.f29934c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3186ds get() {
        return a(this.f29932a, (InterfaceC3059as) this.f29933b.get(), (InterfaceC3732qh) this.f29934c.get());
    }

    public static Yq a(Tq tq2, Provider provider, Provider provider2) {
        return new Yq(tq2, provider, provider2);
    }

    public static C3186ds a(Tq tq2, InterfaceC3059as interfaceC3059as, InterfaceC3732qh interfaceC3732qh) {
        return (C3186ds) qj0.h.d(tq2.a(interfaceC3059as, interfaceC3732qh));
    }
}
