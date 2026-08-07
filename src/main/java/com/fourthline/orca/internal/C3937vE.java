package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3937vE implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3808sE f36057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36058b;

    public C3937vE(C3808sE c3808sE, Provider provider) {
        this.f36057a = c3808sE;
        this.f36058b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Xk get() {
        return a(this.f36057a, (C3765rE) this.f36058b.get());
    }

    public static C3937vE a(C3808sE c3808sE, Provider provider) {
        return new C3937vE(c3808sE, provider);
    }

    public static Xk a(C3808sE c3808sE, C3765rE c3765rE) {
        return (Xk) qj0.h.d(c3808sE.a(c3765rE));
    }
}
