package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Yp implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f29924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f29930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f29931h;

    public Yp(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f29924a = sp2;
        this.f29925b = provider;
        this.f29926c = provider2;
        this.f29927d = provider3;
        this.f29928e = provider4;
        this.f29929f = provider5;
        this.f29930g = provider6;
        this.f29931h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gi get() {
        return a(this.f29924a, (InterfaceC3869tq) this.f29925b.get(), (InterfaceC3956vq) this.f29926c.get(), (InterfaceC3732qh) this.f29927d.get(), (C4085yq) this.f29928e.get(), (InterfaceC3606nk) this.f29929f.get(), (wn0.a) this.f29930g.get(), (C3438jo) this.f29931h.get());
    }

    public static Yp a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new Yp(sp2, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static Gi a(Sp sp2, InterfaceC3869tq interfaceC3869tq, InterfaceC3956vq interfaceC3956vq, InterfaceC3732qh interfaceC3732qh, C4085yq c4085yq, InterfaceC3606nk interfaceC3606nk, wn0.a aVar, C3438jo c3438jo) {
        return (Gi) qj0.h.d(sp2.a(interfaceC3869tq, interfaceC3956vq, interfaceC3732qh, c4085yq, interfaceC3606nk, aVar, c3438jo));
    }
}
