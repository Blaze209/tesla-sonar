package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3080bC implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f30586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30587b;

    public C3080bC(BB bb2, Provider provider) {
        this.f30586a = bb2;
        this.f30587b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3934vB get() {
        return a(this.f30586a, (InterfaceC3863tk) this.f30587b.get());
    }

    public static C3080bC a(BB bb2, Provider provider) {
        return new C3080bC(bb2, provider);
    }

    public static C3934vB a(BB bb2, InterfaceC3863tk interfaceC3863tk) {
        return (C3934vB) qj0.h.d(bb2.a(interfaceC3863tk));
    }
}
