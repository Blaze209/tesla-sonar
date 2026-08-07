package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Kt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26678b;

    public Kt(Et et2, Provider provider) {
        this.f26677a = et2;
        this.f26678b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3744qt get() {
        return a(this.f26677a, (InterfaceC3732qh) this.f26678b.get());
    }

    public static Kt a(Et et2, Provider provider) {
        return new Kt(et2, provider);
    }

    public static C3744qt a(Et et2, InterfaceC3732qh interfaceC3732qh) {
        return (C3744qt) qj0.h.d(et2.b(interfaceC3732qh));
    }
}
