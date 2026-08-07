package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3719qA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3676pA f34752a;

    public C3719qA(C3676pA c3676pA) {
        this.f34752a = c3676pA;
    }

    public static Lz b(C3676pA c3676pA) {
        return (Lz) qj0.h.d(c3676pA.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lz get() {
        return b(this.f34752a);
    }

    public static C3719qA a(C3676pA c3676pA) {
        return new C3719qA(c3676pA);
    }
}
