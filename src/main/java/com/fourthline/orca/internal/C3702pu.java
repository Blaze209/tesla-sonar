package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3702pu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f34638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34639b;

    public C3702pu(C3146cu c3146cu, Provider provider) {
        this.f34638a = c3146cu;
        this.f34639b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3872tt get() {
        return a(this.f34638a, (C3104bu) this.f34639b.get());
    }

    public static C3702pu a(C3146cu c3146cu, Provider provider) {
        return new C3702pu(c3146cu, provider);
    }

    public static InterfaceC3872tt a(C3146cu c3146cu, C3104bu c3104bu) {
        return (InterfaceC3872tt) qj0.h.d(c3146cu.b(c3104bu));
    }
}
