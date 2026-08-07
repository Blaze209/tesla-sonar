package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Wl implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vl f29582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29583b;

    public Wl(Vl vl2, Provider provider) {
        this.f29582a = vl2;
        this.f29583b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gm get() {
        return a(this.f29582a, (InterfaceC3732qh) this.f29583b.get());
    }

    public static Wl a(Vl vl2, Provider provider) {
        return new Wl(vl2, provider);
    }

    public static Gm a(Vl vl2, InterfaceC3732qh interfaceC3732qh) {
        return (Gm) qj0.h.d(vl2.a(interfaceC3732qh));
    }
}
