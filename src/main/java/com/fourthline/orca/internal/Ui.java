package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ui implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ti f28797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f28799c;

    public Ui(Ti ti2, Provider provider, Provider provider2) {
        this.f28797a = ti2;
        this.f28798b = provider;
        this.f28799c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3414j6 get() {
        return a(this.f28797a, (InterfaceC3051ak) this.f28798b.get(), (C3081bD) this.f28799c.get());
    }

    public static Ui a(Ti ti2, Provider provider, Provider provider2) {
        return new Ui(ti2, provider, provider2);
    }

    public static InterfaceC3414j6 a(Ti ti2, InterfaceC3051ak interfaceC3051ak, C3081bD c3081bD) {
        return (InterfaceC3414j6) qj0.h.d(ti2.a(interfaceC3051ak, c3081bD));
    }
}
