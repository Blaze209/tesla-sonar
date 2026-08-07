package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Nu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f27096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27097b;

    public Nu(C3146cu c3146cu, Provider provider) {
        this.f27096a = c3146cu;
        this.f27097b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3321gy get() {
        return a(this.f27096a, (C3438jo) this.f27097b.get());
    }

    public static Nu a(C3146cu c3146cu, Provider provider) {
        return new Nu(c3146cu, provider);
    }

    public static C3321gy a(C3146cu c3146cu, C3438jo c3438jo) {
        return (C3321gy) qj0.h.d(c3146cu.g(c3438jo));
    }
}
