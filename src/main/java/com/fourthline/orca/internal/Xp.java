package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Xp implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f29757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29759c;

    public Xp(Sp sp2, Provider provider, Provider provider2) {
        this.f29757a = sp2;
        this.f29758b = provider;
        this.f29759c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3741qq get() {
        return a(this.f29757a, (InterfaceC3051ak) this.f29758b.get(), (C3208eD) this.f29759c.get());
    }

    public static Xp a(Sp sp2, Provider provider, Provider provider2) {
        return new Xp(sp2, provider, provider2);
    }

    public static C3741qq a(Sp sp2, InterfaceC3051ak interfaceC3051ak, C3208eD c3208eD) {
        return (C3741qq) qj0.h.d(sp2.a(interfaceC3051ak, c3208eD));
    }
}
