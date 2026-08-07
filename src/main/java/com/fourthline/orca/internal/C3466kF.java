package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3466kF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3423jF f32948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32949b;

    public C3466kF(C3423jF c3423jF, Provider provider) {
        this.f32948a = c3423jF;
        this.f32949b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f32948a, (C3765rE) this.f32949b.get());
    }

    public static C3466kF a(C3423jF c3423jF, Provider provider) {
        return new C3466kF(c3423jF, provider);
    }

    public static wn0.a a(C3423jF c3423jF, C3765rE c3765rE) {
        return (wn0.a) qj0.h.d(c3423jF.a(c3765rE));
    }
}
