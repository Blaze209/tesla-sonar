package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3547mA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3377iA f33524a;

    public C3547mA(C3377iA c3377iA) {
        this.f33524a = c3377iA;
    }

    public static Zv b(C3377iA c3377iA) {
        return (Zv) qj0.h.d(c3377iA.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Zv get() {
        return b(this.f33524a);
    }

    public static C3547mA a(C3377iA c3377iA) {
        return new C3547mA(c3377iA);
    }
}
