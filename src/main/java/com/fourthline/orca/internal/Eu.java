package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Eu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f25653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25654b;

    public Eu(C3146cu c3146cu, Provider provider) {
        this.f25653a = c3146cu;
        this.f25654b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4133zv get() {
        return a(this.f25653a, (C3104bu) this.f25654b.get());
    }

    public static Eu a(C3146cu c3146cu, Provider provider) {
        return new Eu(c3146cu, provider);
    }

    public static InterfaceC4133zv a(C3146cu c3146cu, C3104bu c3104bu) {
        return (InterfaceC4133zv) qj0.h.d(c3146cu.c(c3104bu));
    }
}
