package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Wq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tq f29591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29592b;

    public Wq(Tq tq2, Provider provider) {
        this.f29591a = tq2;
        this.f29592b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3858tf get() {
        return a(this.f29591a, (C3497l3) this.f29592b.get());
    }

    public static Wq a(Tq tq2, Provider provider) {
        return new Wq(tq2, provider);
    }

    public static InterfaceC3858tf a(Tq tq2, C3497l3 c3497l3) {
        return (InterfaceC3858tf) qj0.h.d(tq2.a(c3497l3));
    }
}
