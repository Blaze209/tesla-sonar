package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3873tu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f35732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f35736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f35737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f35738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f35739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f35740i;

    public C3873tu(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f35732a = c3146cu;
        this.f35733b = provider;
        this.f35734c = provider2;
        this.f35735d = provider3;
        this.f35736e = provider4;
        this.f35737f = provider5;
        this.f35738g = provider6;
        this.f35739h = provider7;
        this.f35740i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3061au get() {
        return a(this.f35732a, (InterfaceC3863tk) this.f35733b.get(), (C3874tv) this.f35734c.get(), (C3961vv) this.f35735d.get(), (C3572mt) this.f35736e.get(), (C3402iv) this.f35737f.get(), (Hv) this.f35738g.get(), (C4087ys) this.f35739h.get(), (InterfaceC3732qh) this.f35740i.get());
    }

    public static C3873tu a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C3873tu(c3146cu, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static C3061au a(C3146cu c3146cu, InterfaceC3863tk interfaceC3863tk, C3874tv c3874tv, C3961vv c3961vv, C3572mt c3572mt, C3402iv c3402iv, Hv hv2, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (C3061au) qj0.h.d(c3146cu.a(interfaceC3863tk, c3874tv, c3961vv, c3572mt, c3402iv, hv2, c4087ys, interfaceC3732qh));
    }
}
