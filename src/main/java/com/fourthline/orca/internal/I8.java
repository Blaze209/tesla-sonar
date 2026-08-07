package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class I8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f26264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26266c;

    public I8(C8 c11, Provider provider, Provider provider2) {
        this.f26264a = c11;
        this.f26265b = provider;
        this.f26266c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3297ga get() {
        return a(this.f26264a, (C3085bb) this.f26265b.get(), (InterfaceC3732qh) this.f26266c.get());
    }

    public static I8 a(C8 c11, Provider provider, Provider provider2) {
        return new I8(c11, provider, provider2);
    }

    public static C3297ga a(C8 c11, C3085bb c3085bb, InterfaceC3732qh interfaceC3732qh) {
        return (C3297ga) qj0.h.d(c11.a(c3085bb, interfaceC3732qh));
    }
}
