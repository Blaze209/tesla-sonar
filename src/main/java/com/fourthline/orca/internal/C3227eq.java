package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3227eq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f31499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f31504f;

    public C3227eq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f31499a = sp2;
        this.f31500b = provider;
        this.f31501c = provider2;
        this.f31502d = provider3;
        this.f31503e = provider4;
        this.f31504f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rp get() {
        return a(this.f31499a, (InterfaceC3863tk) this.f31500b.get(), (C3208eD) this.f31501c.get(), (C3208eD) this.f31502d.get(), (C4087ys) this.f31503e.get(), (InterfaceC3732qh) this.f31504f.get());
    }

    public static C3227eq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C3227eq(sp2, provider, provider2, provider3, provider4, provider5);
    }

    public static Rp a(Sp sp2, InterfaceC3863tk interfaceC3863tk, C3208eD c3208eD, C3208eD c3208eD2, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (Rp) qj0.h.d(sp2.a(interfaceC3863tk, c3208eD, c3208eD2, c4087ys, interfaceC3732qh));
    }
}
