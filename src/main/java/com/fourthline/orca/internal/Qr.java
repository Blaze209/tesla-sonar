package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Qr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f27533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27534b;

    public Qr(Hr hr2, Provider provider) {
        this.f27533a = hr2;
        this.f27534b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3297ga get() {
        return a(this.f27533a, (InterfaceC3732qh) this.f27534b.get());
    }

    public static Qr a(Hr hr2, Provider provider) {
        return new Qr(hr2, provider);
    }

    public static C3297ga a(Hr hr2, InterfaceC3732qh interfaceC3732qh) {
        return (C3297ga) qj0.h.d(hr2.a(interfaceC3732qh));
    }
}
