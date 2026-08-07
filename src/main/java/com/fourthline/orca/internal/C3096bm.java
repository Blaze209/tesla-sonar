package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3096bm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f30674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30676c;

    public C3096bm(Zl zl2, Provider provider, Provider provider2) {
        this.f30674a = zl2;
        this.f30675b = provider;
        this.f30676c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4039xn get() {
        return a(this.f30674a, (Uj) this.f30675b.get(), (InterfaceC3732qh) this.f30676c.get());
    }

    public static C3096bm a(Zl zl2, Provider provider, Provider provider2) {
        return new C3096bm(zl2, provider, provider2);
    }

    public static C4039xn a(Zl zl2, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C4039xn) qj0.h.d(zl2.a(uj2, interfaceC3732qh));
    }
}
