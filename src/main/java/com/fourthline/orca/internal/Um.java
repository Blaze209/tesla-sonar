package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Um implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f28806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f28808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f28809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f28810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f28811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f28812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f28813h;

    public Um(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f28806a = qm2;
        this.f28807b = provider;
        this.f28808c = provider2;
        this.f28809d = provider3;
        this.f28810e = provider4;
        this.f28811f = provider5;
        this.f28812g = provider6;
        this.f28813h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3395in get() {
        return a(this.f28806a, (wn0.a) this.f28807b.get(), (C4104z8) this.f28808c.get(), (Kp) this.f28809d.get(), (XA) this.f28810e.get(), (C3208eD) this.f28811f.get(), (C3208eD) this.f28812g.get(), (C3208eD) this.f28813h.get());
    }

    public static Um a(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new Um(qm2, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static C3395in a(Qm qm2, wn0.a aVar, C4104z8 c4104z8, Kp kp2, XA xa2, C3208eD c3208eD, C3208eD c3208eD2, C3208eD c3208eD3) {
        return (C3395in) qj0.h.d(qm2.a(aVar, c4104z8, kp2, xa2, c3208eD, c3208eD2, c3208eD3));
    }
}
