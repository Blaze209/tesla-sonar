package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class PB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27322c;

    public PB(BB bb2, Provider provider, Provider provider2) {
        this.f27320a = bb2;
        this.f27321b = provider;
        this.f27322c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cy get() {
        return a(this.f27320a, (C4104z8) this.f27321b.get(), (Dy) this.f27322c.get());
    }

    public static PB a(BB bb2, Provider provider, Provider provider2) {
        return new PB(bb2, provider, provider2);
    }

    public static Cy a(BB bb2, C4104z8 c4104z8, Dy dy2) {
        return (Cy) qj0.h.d(bb2.a(c4104z8, dy2));
    }
}
