package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3418jA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3377iA f32692a;

    public C3418jA(C3377iA c3377iA) {
        this.f32692a = c3377iA;
    }

    public static InterfaceC3703pv b(C3377iA c3377iA) {
        return (InterfaceC3703pv) qj0.h.d(c3377iA.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3703pv get() {
        return b(this.f32692a);
    }

    public static C3418jA a(C3377iA c3377iA) {
        return new C3418jA(c3377iA);
    }
}
