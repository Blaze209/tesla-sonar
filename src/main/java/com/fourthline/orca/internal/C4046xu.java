package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4046xu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f36823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f36827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f36828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f36829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f36830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f36831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider f36832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider f36833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider f36834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Provider f36835m;

    public C4046xu(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        this.f36823a = c3146cu;
        this.f36824b = provider;
        this.f36825c = provider2;
        this.f36826d = provider3;
        this.f36827e = provider4;
        this.f36828f = provider5;
        this.f36829g = provider6;
        this.f36830h = provider7;
        this.f36831i = provider8;
        this.f36832j = provider9;
        this.f36833k = provider10;
        this.f36834l = provider11;
        this.f36835m = provider12;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oj get() {
        return a(this.f36823a, (Lj) this.f36824b.get(), (Nj) this.f36825c.get(), (C4087ys) this.f36826d.get(), (C3061au) this.f36827e.get(), (ED) this.f36828f.get(), (LocationProvider) this.f36829g.get(), (Gj) this.f36830h.get(), (CoroutineScope) this.f36831i.get(), (C3104bu) this.f36832j.get(), (InterfaceC3997wo) this.f36833k.get(), (Uj) this.f36834l.get(), (InterfaceC3732qh) this.f36835m.get());
    }

    public static C4046xu a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        return new C4046xu(c3146cu, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static Oj a(C3146cu c3146cu, Lj lj2, Nj nj2, C4087ys c4087ys, C3061au c3061au, ED ed2, LocationProvider locationProvider, Gj gj2, CoroutineScope coroutineScope, C3104bu c3104bu, InterfaceC3997wo interfaceC3997wo, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Oj) qj0.h.d(c3146cu.a(lj2, nj2, c4087ys, c3061au, ed2, locationProvider, gj2, coroutineScope, c3104bu, interfaceC3997wo, uj2, interfaceC3732qh));
    }
}
