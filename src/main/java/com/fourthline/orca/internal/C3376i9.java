package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3376i9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f32452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32453b;

    public C3376i9(K8 k11, Provider provider) {
        this.f32452a = k11;
        this.f32453b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f32452a, (C4104z8) this.f32453b.get());
    }

    public static C3376i9 a(K8 k11, Provider provider) {
        return new C3376i9(k11, provider);
    }

    public static wn0.a a(K8 k11, C4104z8 c4104z8) {
        return (wn0.a) qj0.h.d(k11.b(c4104z8));
    }
}
