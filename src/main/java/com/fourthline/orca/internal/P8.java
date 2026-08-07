package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class P8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27289b;

    public P8(K8 k11, Provider provider) {
        this.f27288a = k11;
        this.f27289b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3289g8 get() {
        return a(this.f27288a, (InterfaceC3546m9) this.f27289b.get());
    }

    public static P8 a(K8 k11, Provider provider) {
        return new P8(k11, provider);
    }

    public static InterfaceC3289g8 a(K8 k11, InterfaceC3546m9 interfaceC3546m9) {
        return (InterfaceC3289g8) qj0.h.d(k11.b(interfaceC3546m9));
    }
}
