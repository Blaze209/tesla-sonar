package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Su implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27809b;

    public Su(C3146cu c3146cu, Provider provider) {
        this.f27808a = c3146cu;
        this.f27809b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ND get() {
        return a(this.f27808a, (C3061au) this.f27809b.get());
    }

    public static Su a(C3146cu c3146cu, Provider provider) {
        return new Su(c3146cu, provider);
    }

    public static ND a(C3146cu c3146cu, C3061au c3061au) {
        return (ND) qj0.h.d(c3146cu.a(c3061au));
    }
}
