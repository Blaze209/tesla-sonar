package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Rr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f27676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27677b;

    public Rr(Hr hr2, Provider provider) {
        this.f27676a = hr2;
        this.f27677b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mq get() {
        return a(this.f27676a, (InterfaceC3863tk) this.f27677b.get());
    }

    public static Rr a(Hr hr2, Provider provider) {
        return new Rr(hr2, provider);
    }

    public static Mq a(Hr hr2, InterfaceC3863tk interfaceC3863tk) {
        return (Mq) qj0.h.d(hr2.a(interfaceC3863tk));
    }
}
