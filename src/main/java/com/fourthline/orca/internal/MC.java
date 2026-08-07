package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class MC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LC f26916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26919d;

    public MC(LC lc2, Provider provider, Provider provider2, Provider provider3) {
        this.f26916a = lc2;
        this.f26917b = provider;
        this.f26918c = provider2;
        this.f26919d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KC get() {
        return a(this.f26916a, (InterfaceC3863tk) this.f26917b.get(), (C4087ys) this.f26918c.get(), (InterfaceC3732qh) this.f26919d.get());
    }

    public static MC a(LC lc2, Provider provider, Provider provider2, Provider provider3) {
        return new MC(lc2, provider, provider2, provider3);
    }

    public static KC a(LC lc2, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (KC) qj0.h.d(lc2.a(interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
