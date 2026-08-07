package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Cu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f25276a;

    public Cu(C3146cu c3146cu) {
        this.f25276a = c3146cu;
    }

    public static InterfaceC3663oy b(C3146cu c3146cu) {
        return (InterfaceC3663oy) qj0.h.d(c3146cu.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3663oy get() {
        return b(this.f25276a);
    }

    public static Cu a(C3146cu c3146cu) {
        return new Cu(c3146cu);
    }
}
