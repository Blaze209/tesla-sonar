package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class MB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f26913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26915c;

    public MB(BB bb2, Provider provider, Provider provider2) {
        this.f26913a = bb2;
        this.f26914b = provider;
        this.f26915c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3336hC get() {
        return a(this.f26913a, (InterfaceC3051ak) this.f26914b.get(), (Gy) this.f26915c.get());
    }

    public static MB a(BB bb2, Provider provider, Provider provider2) {
        return new MB(bb2, provider, provider2);
    }

    public static C3336hC a(BB bb2, InterfaceC3051ak interfaceC3051ak, Gy gy2) {
        return (C3336hC) qj0.h.d(bb2.a(interfaceC3051ak, gy2));
    }
}
