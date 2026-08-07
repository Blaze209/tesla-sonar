package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3916uu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f35955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35956b;

    public C3916uu(C3146cu c3146cu, Provider provider) {
        this.f35955a = c3146cu;
        this.f35956b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3104bu get() {
        return a(this.f35955a, (wn0.a) this.f35956b.get());
    }

    public static C3916uu a(C3146cu c3146cu, Provider provider) {
        return new C3916uu(c3146cu, provider);
    }

    public static C3104bu a(C3146cu c3146cu, wn0.a aVar) {
        return (C3104bu) qj0.h.d(c3146cu.a(aVar));
    }
}
