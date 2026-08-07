package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Bu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f25129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f25135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f25136h;

    public Bu(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f25129a = c3146cu;
        this.f25130b = provider;
        this.f25131c = provider2;
        this.f25132d = provider3;
        this.f25133e = provider4;
        this.f25134f = provider5;
        this.f25135g = provider6;
        this.f25136h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3574mv get() {
        return a(this.f25129a, (C3531lv) this.f25130b.get(), (C3061au) this.f25131c.get(), (InterfaceC3147cv) this.f25132d.get(), (InterfaceC3730qf) this.f25133e.get(), (InterfaceC3772rf) this.f25134f.get(), (Bp) this.f25135g.get(), (C3232ev) this.f25136h.get());
    }

    public static Bu a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new Bu(c3146cu, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static C3574mv a(C3146cu c3146cu, C3531lv c3531lv, C3061au c3061au, InterfaceC3147cv interfaceC3147cv, InterfaceC3730qf interfaceC3730qf, InterfaceC3772rf interfaceC3772rf, Bp bp2, C3232ev c3232ev) {
        return (C3574mv) qj0.h.d(c3146cu.a(c3531lv, c3061au, interfaceC3147cv, interfaceC3730qf, interfaceC3772rf, bp2, c3232ev));
    }
}
