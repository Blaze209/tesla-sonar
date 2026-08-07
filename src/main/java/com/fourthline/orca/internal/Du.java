package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Du implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f25506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25508c;

    public Du(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f25506a = c3146cu;
        this.f25507b = provider;
        this.f25508c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4047xv get() {
        return a(this.f25506a, (Uj) this.f25507b.get(), (InterfaceC3732qh) this.f25508c.get());
    }

    public static Du a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Du(c3146cu, provider, provider2);
    }

    public static C4047xv a(C3146cu c3146cu, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C4047xv) qj0.h.d(c3146cu.b(uj2, interfaceC3732qh));
    }
}
