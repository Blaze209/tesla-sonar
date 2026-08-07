package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Pz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oz f27410a;

    public Pz(Oz oz2) {
        this.f27410a = oz2;
    }

    public static InterfaceC3624o1 b(Oz oz2) {
        return (InterfaceC3624o1) qj0.h.d(oz2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3624o1 get() {
        return b(this.f27410a);
    }

    public static Pz a(Oz oz2) {
        return new Pz(oz2);
    }
}
