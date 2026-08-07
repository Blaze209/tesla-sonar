package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3100bq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f30698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30699b;

    public C3100bq(Sp sp2, Provider provider) {
        this.f30698a = sp2;
        this.f30699b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3606nk get() {
        return a(this.f30698a, (EA) this.f30699b.get());
    }

    public static C3100bq a(Sp sp2, Provider provider) {
        return new C3100bq(sp2, provider);
    }

    public static InterfaceC3606nk a(Sp sp2, EA ea2) {
        return (InterfaceC3606nk) qj0.h.d(sp2.a(ea2));
    }
}
