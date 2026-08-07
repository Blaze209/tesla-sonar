package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3569mq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f33692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f33696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f33697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f33698g;

    public C3569mq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f33692a = sp2;
        this.f33693b = provider;
        this.f33694c = provider2;
        this.f33695d = provider3;
        this.f33696e = provider4;
        this.f33697f = provider5;
        this.f33698g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f33692a, (InterfaceC3051ak) this.f33693b.get(), (Rp) this.f33694c.get(), (InterfaceC3997wo) this.f33695d.get(), (InterfaceC3863tk) this.f33696e.get(), (C4087ys) this.f33697f.get(), (InterfaceC3732qh) this.f33698g.get());
    }

    public static C3569mq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C3569mq(sp2, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static InterfaceC4044xs a(Sp sp2, InterfaceC3051ak interfaceC3051ak, Rp rp2, InterfaceC3997wo interfaceC3997wo, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC4044xs) qj0.h.d(sp2.a(interfaceC3051ak, rp2, interfaceC3997wo, interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
