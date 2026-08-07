package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Iu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f26386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26388c;

    public Iu(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f26386a = c3146cu;
        this.f26387b = provider;
        this.f26388c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rv get() {
        return a(this.f26386a, (C3104bu) this.f26387b.get(), (InterfaceC3051ak) this.f26388c.get());
    }

    public static Iu a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Iu(c3146cu, provider, provider2);
    }

    public static Rv a(C3146cu c3146cu, C3104bu c3104bu, InterfaceC3051ak interfaceC3051ak) {
        return (Rv) qj0.h.d(c3146cu.a(c3104bu, interfaceC3051ak));
    }
}
