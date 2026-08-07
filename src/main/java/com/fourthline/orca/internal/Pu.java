package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Pu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f27393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f27395c;

    public Pu(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f27393a = c3146cu;
        this.f27394b = provider;
        this.f27395c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f27393a, (InterfaceC4133zv) this.f27394b.get(), (Zv) this.f27395c.get());
    }

    public static Pu a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Pu(c3146cu, provider, provider2);
    }

    public static ED a(C3146cu c3146cu, InterfaceC4133zv interfaceC4133zv, Zv zv2) {
        return (ED) qj0.h.d(c3146cu.a(interfaceC4133zv, zv2));
    }
}
