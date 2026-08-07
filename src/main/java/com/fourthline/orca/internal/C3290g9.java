package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3290g9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f31957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31958b;

    public C3290g9(K8 k11, Provider provider) {
        this.f31957a = k11;
        this.f31958b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3429jf get() {
        return a(this.f31957a, (XA) this.f31958b.get());
    }

    public static C3290g9 a(K8 k11, Provider provider) {
        return new C3290g9(k11, provider);
    }

    public static InterfaceC3429jf a(K8 k11, XA xa2) {
        return (InterfaceC3429jf) qj0.h.d(k11.a(xa2));
    }
}
