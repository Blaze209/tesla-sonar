package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3247f9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f31645a;

    public C3247f9(K8 k11) {
        this.f31645a = k11;
    }

    public static Ms b(K8 k11) {
        return (Ms) qj0.h.d(k11.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ms get() {
        return b(this.f31645a);
    }

    public static C3247f9 a(K8 k11) {
        return new C3247f9(k11);
    }
}
