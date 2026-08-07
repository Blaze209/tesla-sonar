package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f28945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f28946b;

    public V(O o11, Provider provider) {
        this.f28945a = o11;
        this.f28946b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public L get() {
        return a(this.f28945a, (InterfaceC3051ak) this.f28946b.get());
    }

    public static V a(O o11, Provider provider) {
        return new V(o11, provider);
    }

    public static L a(O o11, InterfaceC3051ak interfaceC3051ak) {
        return (L) qj0.h.d(o11.a(interfaceC3051ak));
    }
}
