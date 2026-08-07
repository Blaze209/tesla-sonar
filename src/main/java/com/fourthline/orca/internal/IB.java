package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class IB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f26271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26272b;

    public IB(BB bb2, Provider provider) {
        this.f26271a = bb2;
        this.f26272b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ni get() {
        return a(this.f26271a, (C3934vB) this.f26272b.get());
    }

    public static IB a(BB bb2, Provider provider) {
        return new IB(bb2, provider);
    }

    public static Ni a(BB bb2, C3934vB c3934vB) {
        return (Ni) qj0.h.d(bb2.b(c3934vB));
    }
}
