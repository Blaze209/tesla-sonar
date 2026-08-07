package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3270fq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f31836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31840e;

    public C3270fq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f31836a = sp2;
        this.f31837b = provider;
        this.f31838c = provider2;
        this.f31839d = provider3;
        this.f31840e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3698pq get() {
        return a(this.f31836a, (wn0.a) this.f31837b.get(), (Kp) this.f31838c.get(), (XA) this.f31839d.get(), (C3208eD) this.f31840e.get());
    }

    public static C3270fq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3270fq(sp2, provider, provider2, provider3, provider4);
    }

    public static C3698pq a(Sp sp2, wn0.a aVar, Kp kp2, XA xa2, C3208eD c3208eD) {
        return (C3698pq) qj0.h.d(sp2.a(aVar, kp2, xa2, c3208eD));
    }
}
