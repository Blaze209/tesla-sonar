package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ny implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f27103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27105c;

    public Ny(Provider provider, Provider provider2, Provider provider3) {
        this.f27103a = provider;
        this.f27104b = provider2;
        this.f27105c = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public My get() {
        return a((InterfaceC3863tk) this.f27103a.get(), (W6) this.f27104b.get(), (C3392ik) this.f27105c.get());
    }

    public static Ny a(Provider provider, Provider provider2, Provider provider3) {
        return new Ny(provider, provider2, provider3);
    }

    public static My a(InterfaceC3863tk interfaceC3863tk, W6 w11, C3392ik c3392ik) {
        return new My(interfaceC3863tk, w11, c3392ik);
    }
}
