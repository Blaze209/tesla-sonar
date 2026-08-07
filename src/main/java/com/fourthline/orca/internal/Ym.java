package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ym implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f29895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f29900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f29901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f29902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f29903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f29904j;

    public Ym(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f29895a = qm2;
        this.f29896b = provider;
        this.f29897c = provider2;
        this.f29898d = provider3;
        this.f29899e = provider4;
        this.f29900f = provider5;
        this.f29901g = provider6;
        this.f29902h = provider7;
        this.f29903i = provider8;
        this.f29904j = provider9;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f29895a, (InterfaceC3051ak) this.f29896b.get(), (C4104z8) this.f29897c.get(), (C2874Gc) this.f29898d.get(), (C4087ys) this.f29899e.get(), (InterfaceC3997wo) this.f29900f.get(), (InterfaceC3863tk) this.f29901g.get(), (Uj) this.f29902h.get(), (InterfaceC3732qh) this.f29903i.get(), (C3523ln) this.f29904j.get());
    }

    public static Ym a(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new Ym(qm2, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static InterfaceC4044xs a(Qm qm2, InterfaceC3051ak interfaceC3051ak, C4104z8 c4104z8, C2874Gc c2874Gc, C4087ys c4087ys, InterfaceC3997wo interfaceC3997wo, InterfaceC3863tk interfaceC3863tk, Uj uj2, InterfaceC3732qh interfaceC3732qh, C3523ln c3523ln) {
        return (InterfaceC4044xs) qj0.h.d(qm2.a(interfaceC3051ak, c4104z8, c2874Gc, c4087ys, interfaceC3997wo, interfaceC3863tk, uj2, interfaceC3732qh, c3523ln));
    }
}
