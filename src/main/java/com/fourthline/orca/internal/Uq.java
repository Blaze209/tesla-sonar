package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Uq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tq f28831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28832b;

    public Uq(Tq tq2, Provider provider) {
        this.f28831a = tq2;
        this.f28832b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3059as get() {
        return a(this.f28831a, (C3058ar) this.f28832b.get());
    }

    public static Uq a(Tq tq2, Provider provider) {
        return new Uq(tq2, provider);
    }

    public static InterfaceC3059as a(Tq tq2, C3058ar c3058ar) {
        return (InterfaceC3059as) qj0.h.d(tq2.a(c3058ar));
    }
}
