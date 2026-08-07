package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Zx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yx f30243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30244b;

    public Zx(Yx yx2, Provider provider) {
        this.f30243a = yx2;
        this.f30244b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Oy get() {
        return a(this.f30243a, (InterfaceC3863tk) this.f30244b.get());
    }

    public static Zx a(Yx yx2, Provider provider) {
        return new Zx(yx2, provider);
    }

    public static Oy a(Yx yx2, InterfaceC3863tk interfaceC3863tk) {
        return (Oy) qj0.h.d(yx2.a(interfaceC3863tk));
    }
}
