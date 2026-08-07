package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Rt implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Et f27678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27679b;

    public Rt(Et et2, Provider provider) {
        this.f27678a = et2;
        this.f27679b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lv get() {
        return a(this.f27678a, (InterfaceC3732qh) this.f27679b.get());
    }

    public static Rt a(Et et2, Provider provider) {
        return new Rt(et2, provider);
    }

    public static Lv a(Et et2, InterfaceC3732qh interfaceC3732qh) {
        return (Lv) qj0.h.d(et2.d(interfaceC3732qh));
    }
}
