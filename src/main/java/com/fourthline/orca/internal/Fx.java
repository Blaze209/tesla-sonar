package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Fx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ax f25881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25883c;

    public Fx(Ax ax2, Provider provider, Provider provider2) {
        this.f25881a = ax2;
        this.f25882b = provider;
        this.f25883c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Sx get() {
        return a(this.f25881a, (Uj) this.f25882b.get(), (InterfaceC3732qh) this.f25883c.get());
    }

    public static Fx a(Ax ax2, Provider provider, Provider provider2) {
        return new Fx(ax2, provider, provider2);
    }

    public static Sx a(Ax ax2, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Sx) qj0.h.d(ax2.a(uj2, interfaceC3732qh));
    }
}
