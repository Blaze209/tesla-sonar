package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Mu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f26967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26971e;

    public Mu(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f26967a = c3146cu;
        this.f26968b = provider;
        this.f26969c = provider2;
        this.f26970d = provider3;
        this.f26971e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tx get() {
        return a(this.f26967a, (C3061au) this.f26968b.get(), (Mx) this.f26969c.get(), (Sx) this.f26970d.get(), (InterfaceC4044xs) this.f26971e.get());
    }

    public static Mu a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new Mu(c3146cu, provider, provider2, provider3, provider4);
    }

    public static Tx a(C3146cu c3146cu, C3061au c3061au, Mx mx2, Sx sx2, InterfaceC4044xs interfaceC4044xs) {
        return (Tx) qj0.h.d(c3146cu.a(c3061au, mx2, sx2, interfaceC4044xs));
    }
}
