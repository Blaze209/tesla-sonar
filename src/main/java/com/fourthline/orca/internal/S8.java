package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class S8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f27728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f27729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f27730i;

    public S8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f27722a = k11;
        this.f27723b = provider;
        this.f27724c = provider2;
        this.f27725d = provider3;
        this.f27726e = provider4;
        this.f27727f = provider5;
        this.f27728g = provider6;
        this.f27729h = provider7;
        this.f27730i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4061y8 get() {
        return a(this.f27722a, (InterfaceC3863tk) this.f27723b.get(), (wn0.a) this.f27724c.get(), (wn0.a) this.f27725d.get(), (InterfaceC4124zm) this.f27726e.get(), (Fp) this.f27727f.get(), (InterfaceC4044xs) this.f27728g.get(), (C3392ik) this.f27729h.get(), (C4104z8) this.f27730i.get());
    }

    public static S8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new S8(k11, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static C4061y8 a(K8 k11, InterfaceC3863tk interfaceC3863tk, wn0.a aVar, wn0.a aVar2, InterfaceC4124zm interfaceC4124zm, Fp fp2, InterfaceC4044xs interfaceC4044xs, C3392ik c3392ik, C4104z8 c4104z8) {
        return (C4061y8) qj0.h.d(k11.a(interfaceC3863tk, aVar, aVar2, interfaceC4124zm, fp2, interfaceC4044xs, c3392ik, c4104z8));
    }
}
