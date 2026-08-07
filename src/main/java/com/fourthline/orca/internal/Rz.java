package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Rz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oz f27693a;

    public Rz(Oz oz2) {
        this.f27693a = oz2;
    }

    public static InterfaceC3839t2 b(Oz oz2) {
        return (InterfaceC3839t2) qj0.h.d(oz2.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3839t2 get() {
        return b(this.f27693a);
    }

    public static Rz a(Oz oz2) {
        return new Rz(oz2);
    }
}
