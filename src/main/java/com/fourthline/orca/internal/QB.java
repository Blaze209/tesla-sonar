package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class QB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f27441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27442b;

    public QB(BB bb2, Provider provider) {
        this.f27441a = bb2;
        this.f27442b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gy get() {
        return a(this.f27441a, (C3208eD) this.f27442b.get());
    }

    public static QB a(BB bb2, Provider provider) {
        return new QB(bb2, provider);
    }

    public static Gy a(BB bb2, C3208eD c3208eD) {
        return (Gy) qj0.h.d(bb2.a(c3208eD));
    }
}
