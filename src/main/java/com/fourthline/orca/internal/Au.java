package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Au implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f25031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25033c;

    public Au(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f25031a = c3146cu;
        this.f25032b = provider;
        this.f25033c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3531lv get() {
        return a(this.f25031a, (InterfaceC3147cv) this.f25032b.get(), (InterfaceC3732qh) this.f25033c.get());
    }

    public static Au a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new Au(c3146cu, provider, provider2);
    }

    public static C3531lv a(C3146cu c3146cu, InterfaceC3147cv interfaceC3147cv, InterfaceC3732qh interfaceC3732qh) {
        return (C3531lv) qj0.h.d(c3146cu.a(interfaceC3147cv, interfaceC3732qh));
    }
}
