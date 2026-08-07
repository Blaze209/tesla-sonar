package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Pm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mm f27350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27351b;

    public Pm(Mm mm2, Provider provider) {
        this.f27350a = mm2;
        this.f27351b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fm get() {
        return a(this.f27350a, (ND) this.f27351b.get());
    }

    public static Pm a(Mm mm2, Provider provider) {
        return new Pm(mm2, provider);
    }

    public static Fm a(Mm mm2, ND nd2) {
        return (Fm) qj0.h.d(mm2.a(nd2));
    }
}
