package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class U2 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f27992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27993b;

    public U2(S2 s11, Provider provider) {
        this.f27992a = s11;
        this.f27993b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3700ps get() {
        return a(this.f27992a, (G2) this.f27993b.get());
    }

    public static U2 a(S2 s11, Provider provider) {
        return new U2(s11, provider);
    }

    public static InterfaceC3700ps a(S2 s11, G2 g11) {
        return (InterfaceC3700ps) qj0.h.d(s11.a(g11));
    }
}
