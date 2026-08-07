package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class X8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f29699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29701c;

    public X8(K8 k11, Provider provider, Provider provider2) {
        this.f29699a = k11;
        this.f29700b = provider;
        this.f29701c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3853ta get() {
        return a(this.f29699a, (Uj) this.f29700b.get(), (InterfaceC3732qh) this.f29701c.get());
    }

    public static X8 a(K8 k11, Provider provider, Provider provider2) {
        return new X8(k11, provider, provider2);
    }

    public static C3853ta a(K8 k11, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C3853ta) qj0.h.d(k11.a(uj2, interfaceC3732qh));
    }
}
