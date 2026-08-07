package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class O8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f27126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27127b;

    public O8(K8 k11, Provider provider) {
        this.f27126a = k11;
        this.f27127b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Z7 get() {
        return a(this.f27126a, (InterfaceC3546m9) this.f27127b.get());
    }

    public static O8 a(K8 k11, Provider provider) {
        return new O8(k11, provider);
    }

    public static Z7 a(K8 k11, InterfaceC3546m9 interfaceC3546m9) {
        return (Z7) qj0.h.d(k11.a(interfaceC3546m9));
    }
}
