package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Lu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f26858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26860c;

    public Lu(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f26858a = c3146cu;
        this.f26859b = provider;
        this.f26860c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Sx get() {
        return a(this.f26858a, (Uj) this.f26859b.get(), (InterfaceC3732qh) this.f26860c.get());
    }

    public static Lu a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Lu(c3146cu, provider, provider2);
    }

    public static Sx a(C3146cu c3146cu, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Sx) qj0.h.d(c3146cu.c(uj2, interfaceC3732qh));
    }
}
