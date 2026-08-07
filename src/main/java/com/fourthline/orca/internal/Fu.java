package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Fu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f25877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25878b;

    public Fu(C3146cu c3146cu, Provider provider) {
        this.f25877a = c3146cu;
        this.f25878b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cv get() {
        return a(this.f25877a, (C3438jo) this.f25878b.get());
    }

    public static Fu a(C3146cu c3146cu, Provider provider) {
        return new Fu(c3146cu, provider);
    }

    public static Cv a(C3146cu c3146cu, C3438jo c3438jo) {
        return (Cv) qj0.h.d(c3146cu.e(c3438jo));
    }
}
