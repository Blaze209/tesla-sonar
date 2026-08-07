package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3838t1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3795s1 f35512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f35516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f35517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f35518g;

    public C3838t1(C3795s1 c3795s1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f35512a = c3795s1;
        this.f35513b = provider;
        this.f35514c = provider2;
        this.f35515d = provider3;
        this.f35516e = provider4;
        this.f35517f = provider5;
        this.f35518g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f35512a, (InterfaceC3051ak) this.f35513b.get(), (C4087ys) this.f35514c.get(), (C4054y1) this.f35515d.get(), (InterfaceC3997wo) this.f35516e.get(), (InterfaceC3863tk) this.f35517f.get(), (InterfaceC3732qh) this.f35518g.get());
    }

    public static C3838t1 a(C3795s1 c3795s1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C3838t1(c3795s1, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static InterfaceC4044xs a(C3795s1 c3795s1, InterfaceC3051ak interfaceC3051ak, C4087ys c4087ys, C4054y1 c4054y1, InterfaceC3997wo interfaceC3997wo, InterfaceC3863tk interfaceC3863tk, InterfaceC3732qh interfaceC3732qh) {
        return (InterfaceC4044xs) qj0.h.d(c3795s1.a(interfaceC3051ak, c4087ys, c4054y1, interfaceC3997wo, interfaceC3863tk, interfaceC3732qh));
    }
}
