package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class X2 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f29651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29652b;

    public X2(S2 s11, Provider provider) {
        this.f29651a = s11;
        this.f29652b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public N2 get() {
        return a(this.f29651a, (Gl) this.f29652b.get());
    }

    public static X2 a(S2 s11, Provider provider) {
        return new X2(s11, provider);
    }

    public static N2 a(S2 s11, Gl gl2) {
        return (N2) qj0.h.d(s11.c(gl2));
    }
}
