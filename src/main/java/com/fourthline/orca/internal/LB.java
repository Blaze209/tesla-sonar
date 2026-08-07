package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class LB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f26750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26751b;

    public LB(BB bb2, Provider provider) {
        this.f26750a = bb2;
        this.f26751b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3429jf get() {
        return a(this.f26750a, (XA) this.f26751b.get());
    }

    public static LB a(BB bb2, Provider provider) {
        return new LB(bb2, provider);
    }

    public static InterfaceC3429jf a(BB bb2, XA xa2) {
        return (InterfaceC3429jf) qj0.h.d(bb2.a(xa2));
    }
}
