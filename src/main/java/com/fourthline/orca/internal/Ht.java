package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ht implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f26149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26150b;

    public Ht(Et et2, Provider provider) {
        this.f26149a = et2;
        this.f26150b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3534ly get() {
        return a(this.f26149a, (InterfaceC3732qh) this.f26150b.get());
    }

    public static Ht a(Et et2, Provider provider) {
        return new Ht(et2, provider);
    }

    public static C3534ly a(Et et2, InterfaceC3732qh interfaceC3732qh) {
        return (C3534ly) qj0.h.d(et2.a(interfaceC3732qh));
    }
}
