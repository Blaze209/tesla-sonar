package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Xq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tq f29760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29761b;

    public Xq(Tq tq2, Provider provider) {
        this.f29760a = tq2;
        this.f29761b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3102bs get() {
        return a(this.f29760a, (C3528ls) this.f29761b.get());
    }

    public static Xq a(Tq tq2, Provider provider) {
        return new Xq(tq2, provider);
    }

    public static InterfaceC3102bs a(Tq tq2, C3528ls c3528ls) {
        return (InterfaceC3102bs) qj0.h.d(tq2.a(c3528ls));
    }
}
