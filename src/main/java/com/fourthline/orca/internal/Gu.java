package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Gu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f26010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26011b;

    public Gu(C3146cu c3146cu, Provider provider) {
        this.f26010a = c3146cu;
        this.f26011b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mv get() {
        return a(this.f26010a, (C3104bu) this.f26011b.get());
    }

    public static Gu a(C3146cu c3146cu, Provider provider) {
        return new Gu(c3146cu, provider);
    }

    public static Mv a(C3146cu c3146cu, C3104bu c3104bu) {
        return (Mv) qj0.h.d(c3146cu.d(c3104bu));
    }
}
