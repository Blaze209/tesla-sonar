package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Sr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f27800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27801b;

    public Sr(Hr hr2, Provider provider) {
        this.f27800a = hr2;
        this.f27801b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3014Ya get() {
        return a(this.f27800a, (InterfaceC3732qh) this.f27801b.get());
    }

    public static Sr a(Hr hr2, Provider provider) {
        return new Sr(hr2, provider);
    }

    public static C3014Ya a(Hr hr2, InterfaceC3732qh interfaceC3732qh) {
        return (C3014Ya) qj0.h.d(hr2.b(interfaceC3732qh));
    }
}
