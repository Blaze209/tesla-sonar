package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Q1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f27414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27415b;

    public Q1(C4097z1 c4097z1, Provider provider) {
        this.f27414a = c4097z1;
        this.f27415b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3155d2 get() {
        return a(this.f27414a, (W0) this.f27415b.get());
    }

    public static Q1 a(C4097z1 c4097z1, Provider provider) {
        return new Q1(c4097z1, provider);
    }

    public static InterfaceC3155d2 a(C4097z1 c4097z1, W0 w11) {
        return (InterfaceC3155d2) qj0.h.d(c4097z1.c(w11));
    }
}
