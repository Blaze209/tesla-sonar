package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class UB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f28726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28727b;

    public UB(BB bb2, Provider provider) {
        this.f28726a = bb2;
        this.f28727b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3335hB get() {
        return a(this.f28726a, (XA) this.f28727b.get());
    }

    public static UB a(BB bb2, Provider provider) {
        return new UB(bb2, provider);
    }

    public static InterfaceC3335hB a(BB bb2, XA xa2) {
        return (InterfaceC3335hB) qj0.h.d(bb2.b(xa2));
    }
}
