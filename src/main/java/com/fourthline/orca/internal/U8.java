package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class U8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f28702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f28704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f28705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f28706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f28707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f28708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f28709h;

    public U8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f28702a = k11;
        this.f28703b = provider;
        this.f28704c = provider2;
        this.f28705d = provider3;
        this.f28706e = provider4;
        this.f28707f = provider5;
        this.f28708g = provider6;
        this.f28709h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3803s9 get() {
        return a(this.f28702a, (wn0.a) this.f28703b.get(), (C4104z8) this.f28704c.get(), (Kp) this.f28705d.get(), (XA) this.f28706e.get(), (C3208eD) this.f28707f.get(), (C3208eD) this.f28708g.get(), (C3208eD) this.f28709h.get());
    }

    public static U8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new U8(k11, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static C3803s9 a(K8 k11, wn0.a aVar, C4104z8 c4104z8, Kp kp2, XA xa2, C3208eD c3208eD, C3208eD c3208eD2, C3208eD c3208eD3) {
        return (C3803s9) qj0.h.d(k11.a(aVar, c4104z8, kp2, xa2, c3208eD, c3208eD2, c3208eD3));
    }
}
