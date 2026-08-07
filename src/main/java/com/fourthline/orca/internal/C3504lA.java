package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3504lA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3377iA f33258a;

    public C3504lA(C3377iA c3377iA) {
        this.f33258a = c3377iA;
    }

    public static Uv b(C3377iA c3377iA) {
        return (Uv) qj0.h.d(c3377iA.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Uv get() {
        return b(this.f33258a);
    }

    public static C3504lA a(C3377iA c3377iA) {
        return new C3504lA(c3377iA);
    }
}
