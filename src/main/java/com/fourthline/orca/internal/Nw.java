package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Nw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jw f27099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27100b;

    public Nw(Jw jw2, Provider provider) {
        this.f27099a = jw2;
        this.f27100b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Iw get() {
        return a(this.f27099a, (InterfaceC3051ak) this.f27100b.get());
    }

    public static Nw a(Jw jw2, Provider provider) {
        return new Nw(jw2, provider);
    }

    public static Iw a(Jw jw2, InterfaceC3051ak interfaceC3051ak) {
        return (Iw) qj0.h.d(jw2.a(interfaceC3051ak));
    }
}
