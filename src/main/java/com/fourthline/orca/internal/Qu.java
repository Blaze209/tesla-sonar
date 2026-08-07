package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Qu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f27537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27539c;

    public Qu(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f27537a = c3146cu;
        this.f27538b = provider;
        this.f27539c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f27537a, (InterfaceC3051ak) this.f27538b.get(), (InterfaceC3645og) this.f27539c.get());
    }

    public static Qu a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Qu(c3146cu, provider, provider2);
    }

    public static ED a(C3146cu c3146cu, InterfaceC3051ak interfaceC3051ak, InterfaceC3645og interfaceC3645og) {
        return (ED) qj0.h.d(c3146cu.a(interfaceC3051ak, interfaceC3645og));
    }
}
