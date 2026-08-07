package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class KB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f26558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26559b;

    public KB(BB bb2, Provider provider) {
        this.f26558a = bb2;
        this.f26559b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3297ga get() {
        return a(this.f26558a, (InterfaceC3732qh) this.f26559b.get());
    }

    public static KB a(BB bb2, Provider provider) {
        return new KB(bb2, provider);
    }

    public static C3297ga a(BB bb2, InterfaceC3732qh interfaceC3732qh) {
        return (C3297ga) qj0.h.d(bb2.a(interfaceC3732qh));
    }
}
