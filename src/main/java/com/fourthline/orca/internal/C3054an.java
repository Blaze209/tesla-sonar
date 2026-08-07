package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3054an implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f30449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f30453e;

    public C3054an(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f30449a = qm2;
        this.f30450b = provider;
        this.f30451c = provider2;
        this.f30452d = provider3;
        this.f30453e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4084yp get() {
        return a(this.f30449a, (Jm) this.f30450b.get(), (Vf) this.f30451c.get(), (C3395in) this.f30452d.get(), (C3437jn) this.f30453e.get());
    }

    public static C3054an a(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3054an(qm2, provider, provider2, provider3, provider4);
    }

    public static C4084yp a(Qm qm2, Jm jm2, Vf vf2, C3395in c3395in, C3437jn c3437jn) {
        return (C4084yp) qj0.h.d(qm2.a(jm2, vf2, c3395in, c3437jn));
    }
}
