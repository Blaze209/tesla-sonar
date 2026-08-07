package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4078yj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f37023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f37027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f37028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f37029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f37030h;

    public C4078yj(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f37023a = c3691pj;
        this.f37024b = provider;
        this.f37025c = provider2;
        this.f37026d = provider3;
        this.f37027e = provider4;
        this.f37028f = provider5;
        this.f37029g = provider6;
        this.f37030h = provider7;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f37023a, (InterfaceC3051ak) this.f37024b.get(), (C2874Gc) this.f37025c.get(), (InterfaceC3997wo) this.f37026d.get(), (InterfaceC3863tk) this.f37027e.get(), (C4087ys) this.f37028f.get(), (Uj) this.f37029g.get(), (InterfaceC3732qh) this.f37030h.get());
    }

    public static C4078yj a(C3691pj c3691pj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C4078yj(c3691pj, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static InterfaceC4044xs a(C3691pj c3691pj, InterfaceC3051ak interfaceC3051ak, C2874Gc c2874Gc, InterfaceC3997wo interfaceC3997wo, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC4044xs) qj0.h.d(c3691pj.a(interfaceC3051ak, c2874Gc, interfaceC3997wo, interfaceC3863tk, c4087ys, uj2, interfaceC3732qh));
    }
}
