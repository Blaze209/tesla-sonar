package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3573mu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f33715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33716b;

    public C3573mu(C3146cu c3146cu, Provider provider) {
        this.f33715a = c3146cu;
        this.f33716b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3230et get() {
        return a(this.f33715a, (C3187dt) this.f33716b.get());
    }

    public static C3573mu a(C3146cu c3146cu, Provider provider) {
        return new C3573mu(c3146cu, provider);
    }

    public static InterfaceC3230et a(C3146cu c3146cu, C3187dt c3187dt) {
        return (InterfaceC3230et) qj0.h.d(c3146cu.a(c3187dt));
    }
}
