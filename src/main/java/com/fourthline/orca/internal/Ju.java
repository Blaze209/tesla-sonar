package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ju implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f26505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26506b;

    public Ju(C3146cu c3146cu, Provider provider) {
        this.f26505a = c3146cu;
        this.f26506b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mx get() {
        return a(this.f26505a, (C3438jo) this.f26506b.get());
    }

    public static Ju a(C3146cu c3146cu, Provider provider) {
        return new Ju(c3146cu, provider);
    }

    public static Mx a(C3146cu c3146cu, C3438jo c3438jo) {
        return (Mx) qj0.h.d(c3146cu.f(c3438jo));
    }
}
