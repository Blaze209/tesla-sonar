package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3097bn implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qm f30678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f30682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f30683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f30684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f30685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f30686i;

    public C3097bn(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f30678a = qm2;
        this.f30679b = provider;
        this.f30680c = provider2;
        this.f30681d = provider3;
        this.f30682e = provider4;
        this.f30683f = provider5;
        this.f30684g = provider6;
        this.f30685h = provider7;
        this.f30686i = provider8;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082yn get() {
        return a(this.f30678a, (C4039xn) this.f30679b.get(), (InterfaceC3909un) this.f30680c.get(), (C2874Gc) this.f30681d.get(), (C3523ln) this.f30682e.get(), (Lm) this.f30683f.get(), (C4084yp) this.f30684g.get(), (InterfaceC4044xs) this.f30685h.get(), (CoroutineScope) this.f30686i.get());
    }

    public static C3097bn a(Qm qm2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C3097bn(qm2, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static C4082yn a(Qm qm2, C4039xn c4039xn, InterfaceC3909un interfaceC3909un, C2874Gc c2874Gc, C3523ln c3523ln, Lm lm2, C4084yp c4084yp, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (C4082yn) qj0.h.d(qm2.a(c4039xn, interfaceC3909un, c2874Gc, c3523ln, lm2, c4084yp, interfaceC4044xs, coroutineScope));
    }
}
