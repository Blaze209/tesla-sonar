package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4024xE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f36695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36696b;

    public C4024xE(C3808sE c3808sE, Provider provider) {
        this.f36695a = c3808sE;
        this.f36696b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3723qE get() {
        return a(this.f36695a, (InterfaceC3863tk) this.f36696b.get());
    }

    public static C4024xE a(C3808sE c3808sE, Provider provider) {
        return new C4024xE(c3808sE, provider);
    }

    public static C3723qE a(C3808sE c3808sE, InterfaceC3863tk interfaceC3863tk) {
        return (C3723qE) qj0.h.d(c3808sE.a(interfaceC3863tk));
    }
}
