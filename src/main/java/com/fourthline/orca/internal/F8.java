package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class F8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f25782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25783b;

    public F8(C8 c11, Provider provider) {
        this.f25782a = c11;
        this.f25783b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3211ea get() {
        return a(this.f25782a, (InterfaceC3732qh) this.f25783b.get());
    }

    public static F8 a(C8 c11, Provider provider) {
        return new F8(c11, provider);
    }

    public static C3211ea a(C8 c11, InterfaceC3732qh interfaceC3732qh) {
        return (C3211ea) qj0.h.d(c11.a(interfaceC3732qh));
    }
}
