package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3182dn implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f31212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31215d;

    public C3182dn(Qm qm2, Provider provider, Provider provider2, Provider provider3) {
        this.f31212a = qm2;
        this.f31213b = provider;
        this.f31214c = provider2;
        this.f31215d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gn get() {
        return a(this.f31212a, (C4104z8) this.f31213b.get(), (Kp) this.f31214c.get(), (Cm) this.f31215d.get());
    }

    public static C3182dn a(Qm qm2, Provider provider, Provider provider2, Provider provider3) {
        return new C3182dn(qm2, provider, provider2, provider3);
    }

    public static Gn a(Qm qm2, C4104z8 c4104z8, Kp kp2, Cm cm2) {
        return (Gn) qj0.h.d(qm2.a(c4104z8, kp2, cm2));
    }
}
