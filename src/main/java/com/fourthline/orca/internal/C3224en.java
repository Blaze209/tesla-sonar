package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3224en implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f31479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31483e;

    public C3224en(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f31479a = qm2;
        this.f31480b = provider;
        this.f31481c = provider2;
        this.f31482d = provider3;
        this.f31483e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f31479a, (Jm) this.f31480b.get(), (Vf) this.f31481c.get(), (C3395in) this.f31482d.get(), (C3437jn) this.f31483e.get());
    }

    public static C3224en a(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3224en(qm2, provider, provider2, provider3, provider4);
    }

    public static ED a(Qm qm2, Jm jm2, Vf vf2, C3395in c3395in, C3437jn c3437jn) {
        return (ED) qj0.h.d(qm2.b(jm2, vf2, c3395in, c3437jn));
    }
}
