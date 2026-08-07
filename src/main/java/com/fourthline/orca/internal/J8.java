package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class J8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f26440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26441b;

    public J8(C8 c11, Provider provider) {
        this.f26440a = c11;
        this.f26441b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3014Ya get() {
        return a(this.f26440a, (InterfaceC3732qh) this.f26441b.get());
    }

    public static J8 a(C8 c11, Provider provider) {
        return new J8(c11, provider);
    }

    public static C3014Ya a(C8 c11, InterfaceC3732qh interfaceC3732qh) {
        return (C3014Ya) qj0.h.d(c11.b(interfaceC3732qh));
    }
}
