package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class X1 implements qj0.e<C4499o7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC4517q7> f46804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W1 f46805b;

    public X1(I1 i11, Provider provider, W1 w11) {
        this.f46804a = provider;
        this.f46805b = w11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC4517q7 twilioVerifySna = this.f46804a.get();
        InterfaceC4357b7 snaApi = (InterfaceC4357b7) this.f46805b.get();
        p013kotlin.jvm.internal.s.k(twilioVerifySna, "twilioVerifySna");
        p013kotlin.jvm.internal.s.k(snaApi, "snaApi");
        return (C4499o7) qj0.h.d(new C4499o7(twilioVerifySna, snaApi));
    }
}
