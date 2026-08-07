package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3119c9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f30811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30812b;

    public C3119c9(K8 k11, Provider provider) {
        this.f30811a = k11;
        this.f30812b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3085bb get() {
        return a(this.f30811a, (C4104z8) this.f30812b.get());
    }

    public static C3119c9 a(K8 k11, Provider provider) {
        return new C3119c9(k11, provider);
    }

    public static C3085bb a(K8 k11, C4104z8 c4104z8) {
        return (C3085bb) qj0.h.d(k11.a(c4104z8));
    }
}
