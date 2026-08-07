package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Qz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oz f27581a;

    public Qz(Oz oz2) {
        this.f27581a = oz2;
    }

    public static InterfaceC3700ps b(Oz oz2) {
        return (InterfaceC3700ps) qj0.h.d(oz2.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3700ps get() {
        return b(this.f27581a);
    }

    public static Qz a(Oz oz2) {
        return new Qz(oz2);
    }
}
