package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3804sA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3676pA f35227a;

    public C3804sA(C3676pA c3676pA) {
        this.f35227a = c3676pA;
    }

    public static C4063yA b(C3676pA c3676pA) {
        return (C4063yA) qj0.h.d(c3676pA.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4063yA get() {
        return b(this.f35227a);
    }

    public static C3804sA a(C3676pA c3676pA) {
        return new C3804sA(c3676pA);
    }
}
