package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Zi implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xi f30078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30080c;

    public Zi(Xi xi2, Provider provider, Provider provider2) {
        this.f30078a = xi2;
        this.f30079b = provider;
        this.f30080c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3208eD get() {
        return a(this.f30078a, (C4104z8) this.f30079b.get(), (Kp) this.f30080c.get());
    }

    public static Zi a(Xi xi2, Provider provider, Provider provider2) {
        return new Zi(xi2, provider, provider2);
    }

    public static C3208eD a(Xi xi2, C4104z8 c4104z8, Kp kp2) {
        return (C3208eD) qj0.h.d(xi2.c(c4104z8, kp2));
    }
}
