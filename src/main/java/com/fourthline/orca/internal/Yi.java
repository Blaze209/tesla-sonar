package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Yi implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xi f29887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29889c;

    public Yi(Xi xi2, Provider provider, Provider provider2) {
        this.f29887a = xi2;
        this.f29888b = provider;
        this.f29889c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3208eD get() {
        return a(this.f29887a, (C4104z8) this.f29888b.get(), (Kp) this.f29889c.get());
    }

    public static Yi a(Xi xi2, Provider provider, Provider provider2) {
        return new Yi(xi2, provider, provider2);
    }

    public static C3208eD a(Xi xi2, C4104z8 c4104z8, Kp kp2) {
        return (C3208eD) qj0.h.d(xi2.a(c4104z8, kp2));
    }
}
