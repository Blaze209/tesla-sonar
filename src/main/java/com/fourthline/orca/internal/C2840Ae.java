package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2840Ae implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4116ze f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24945c;

    public C2840Ae(C4116ze c4116ze, Provider provider, Provider provider2) {
        this.f24943a = c4116ze;
        this.f24944b = provider;
        this.f24945c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3087bd get() {
        return a(this.f24943a, (InterfaceC3051ak) this.f24944b.get(), (Gl) this.f24945c.get());
    }

    public static C2840Ae a(C4116ze c4116ze, Provider provider, Provider provider2) {
        return new C2840Ae(c4116ze, provider, provider2);
    }

    public static InterfaceC3087bd a(C4116ze c4116ze, InterfaceC3051ak interfaceC3051ak, Gl gl2) {
        return (InterfaceC3087bd) qj0.h.d(c4116ze.a(interfaceC3051ak, gl2));
    }
}
