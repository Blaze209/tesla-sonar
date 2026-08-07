package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3590nA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3377iA f33869a;

    public C3590nA(C3377iA c3377iA) {
        this.f33869a = c3377iA;
    }

    public static InterfaceC3106bw b(C3377iA c3377iA) {
        return (InterfaceC3106bw) qj0.h.d(c3377iA.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3106bw get() {
        return b(this.f33869a);
    }

    public static C3590nA a(C3377iA c3377iA) {
        return new C3590nA(c3377iA);
    }
}
