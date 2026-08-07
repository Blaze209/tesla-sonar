package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class B1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f25051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25052b;

    public B1(C4097z1 c4097z1, Provider provider) {
        this.f25051a = c4097z1;
        this.f25052b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3069b1 get() {
        return a(this.f25051a, (W0) this.f25052b.get());
    }

    public static B1 a(C4097z1 c4097z1, Provider provider) {
        return new B1(c4097z1, provider);
    }

    public static InterfaceC3069b1 a(C4097z1 c4097z1, W0 w11) {
        return (InterfaceC3069b1) qj0.h.d(c4097z1.a(w11));
    }
}
