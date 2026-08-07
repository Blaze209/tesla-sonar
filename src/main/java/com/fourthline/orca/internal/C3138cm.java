package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3138cm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f30951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30952b;

    public C3138cm(Zl zl2, Provider provider) {
        this.f30951a = zl2;
        this.f30952b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ul get() {
        return a(this.f30951a, (InterfaceC3863tk) this.f30952b.get());
    }

    public static C3138cm a(Zl zl2, Provider provider) {
        return new C3138cm(zl2, provider);
    }

    public static Ul a(Zl zl2, InterfaceC3863tk interfaceC3863tk) {
        return (Ul) qj0.h.d(zl2.a(interfaceC3863tk));
    }
}
