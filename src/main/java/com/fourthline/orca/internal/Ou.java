package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Ou implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f27228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f27232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f27233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f27234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f27235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f27236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f27237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f27238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider f27239l;

    public Ou(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f27228a = c3146cu;
        this.f27229b = provider;
        this.f27230c = provider2;
        this.f27231d = provider3;
        this.f27232e = provider4;
        this.f27233f = provider5;
        this.f27234g = provider6;
        this.f27235h = provider7;
        this.f27236i = provider8;
        this.f27237j = provider9;
        this.f27238k = provider10;
        this.f27239l = provider11;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3834sy get() {
        return a(this.f27228a, (C3104bu) this.f27229b.get(), (C4047xv) this.f27230c.get(), (InterfaceC3663oy) this.f27231d.get(), (ED) this.f27232e.get(), (InterfaceC2931Re) this.f27233f.get(), (C3061au) this.f27234g.get(), (C3321gy) this.f27235h.get(), (C4087ys) this.f27236i.get(), (CoroutineScope) this.f27237j.get(), (InterfaceC3997wo) this.f27238k.get(), (InterfaceC3732qh) this.f27239l.get());
    }

    public static Ou a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        return new Ou(c3146cu, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static C3834sy a(C3146cu c3146cu, C3104bu c3104bu, C4047xv c4047xv, InterfaceC3663oy interfaceC3663oy, ED ed2, InterfaceC2931Re interfaceC2931Re, C3061au c3061au, C3321gy c3321gy, C4087ys c4087ys, CoroutineScope coroutineScope, InterfaceC3997wo interfaceC3997wo, InterfaceC3732qh interfaceC3732qh) {
        return (C3834sy) qj0.h.d(c3146cu.a(c3104bu, c4047xv, interfaceC3663oy, ed2, interfaceC2931Re, c3061au, c3321gy, c4087ys, coroutineScope, interfaceC3997wo, interfaceC3732qh));
    }
}
