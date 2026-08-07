package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3116c6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f30790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30792c;

    public C3116c6(Y5 y11, Provider provider, Provider provider2) {
        this.f30790a = y11;
        this.f30791b = provider;
        this.f30792c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public G6 get() {
        return a(this.f30790a, (H6) this.f30791b.get(), (wn0.a) this.f30792c.get());
    }

    public static C3116c6 a(Y5 y11, Provider provider, Provider provider2) {
        return new C3116c6(y11, provider, provider2);
    }

    public static G6 a(Y5 y11, H6 h11, wn0.a aVar) {
        return (G6) qj0.h.d(y11.a(h11, aVar));
    }
}
