package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3509lF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3423jF f33265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33266b;

    public C3509lF(C3423jF c3423jF, Provider provider) {
        this.f33265a = c3423jF;
        this.f33266b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f33265a, (C3765rE) this.f33266b.get());
    }

    public static C3509lF a(C3423jF c3423jF, Provider provider) {
        return new C3509lF(c3423jF, provider);
    }

    public static wn0.a a(C3423jF c3423jF, C3765rE c3765rE) {
        return (wn0.a) qj0.h.d(c3423jF.c(c3765rE));
    }
}
