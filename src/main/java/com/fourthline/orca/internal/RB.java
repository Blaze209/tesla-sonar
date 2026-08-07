package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class RB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27610b;

    public RB(BB bb2, Provider provider) {
        this.f27609a = bb2;
        this.f27610b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4093yy get() {
        return a(this.f27609a, (InterfaceC3429jf) this.f27610b.get());
    }

    public static RB a(BB bb2, Provider provider) {
        return new RB(bb2, provider);
    }

    public static C4093yy a(BB bb2, InterfaceC3429jf interfaceC3429jf) {
        return (C4093yy) qj0.h.d(bb2.a(interfaceC3429jf));
    }
}
