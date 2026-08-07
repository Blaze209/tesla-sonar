package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3633oA implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3377iA f34105a;

    public C3633oA(C3377iA c3377iA) {
        this.f34105a = c3377iA;
    }

    public static InterfaceC3233ew b(C3377iA c3377iA) {
        return (InterfaceC3233ew) qj0.h.d(c3377iA.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3233ew get() {
        return b(this.f34105a);
    }

    public static C3633oA a(C3377iA c3377iA) {
        return new C3633oA(c3377iA);
    }
}
