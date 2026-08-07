package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ku implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f26679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26683e;

    public Ku(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f26679a = c3146cu;
        this.f26680b = provider;
        this.f26681c = provider2;
        this.f26682d = provider3;
        this.f26683e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3874tv get() {
        return a(this.f26679a, (InterfaceC3863tk) this.f26680b.get(), (Fp) this.f26681c.get(), (C4087ys) this.f26682d.get(), (Uj) this.f26683e.get());
    }

    public static Ku a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new Ku(c3146cu, provider, provider2, provider3, provider4);
    }

    public static C3874tv a(C3146cu c3146cu, InterfaceC3863tk interfaceC3863tk, Fp fp2, C4087ys c4087ys, Uj uj2) {
        return (C3874tv) qj0.h.d(c3146cu.a(interfaceC3863tk, fp2, c4087ys, uj2));
    }
}
