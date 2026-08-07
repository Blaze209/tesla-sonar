package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3942vd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f36076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36078c;

    public C3942vd(C3599nd c3599nd, Provider provider, Provider provider2) {
        this.f36076a = c3599nd;
        this.f36077b = provider;
        this.f36078c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3430jg get() {
        return a(this.f36076a, (InterfaceC3732qh) this.f36077b.get(), (InterfaceC3346hg) this.f36078c.get());
    }

    public static C3942vd a(C3599nd c3599nd, Provider provider, Provider provider2) {
        return new C3942vd(c3599nd, provider, provider2);
    }

    public static C3430jg a(C3599nd c3599nd, InterfaceC3732qh interfaceC3732qh, InterfaceC3346hg interfaceC3346hg) {
        return (C3430jg) qj0.h.d(c3599nd.a(interfaceC3732qh, interfaceC3346hg));
    }
}
