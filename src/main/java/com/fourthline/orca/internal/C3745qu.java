package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3745qu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f34893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f34895c;

    public C3745qu(C3146cu c3146cu, Provider provider, Provider provider2) {
        this.f34893a = c3146cu;
        this.f34894b = provider;
        this.f34895c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4002wt get() {
        return a(this.f34893a, (Uj) this.f34894b.get(), (InterfaceC3732qh) this.f34895c.get());
    }

    public static C3745qu a(C3146cu c3146cu, Provider provider, Provider provider2) {
        return new C3745qu(c3146cu, provider, provider2);
    }

    public static C4002wt a(C3146cu c3146cu, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (C4002wt) qj0.h.d(c3146cu.a(uj2, interfaceC3732qh));
    }
}
