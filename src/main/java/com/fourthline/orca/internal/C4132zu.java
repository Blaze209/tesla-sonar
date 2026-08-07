package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4132zu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f37365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37366b;

    public C4132zu(C3146cu c3146cu, Provider provider) {
        this.f37365a = c3146cu;
        this.f37366b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3232ev get() {
        return a(this.f37365a, (C3438jo) this.f37366b.get());
    }

    public static C4132zu a(C3146cu c3146cu, Provider provider) {
        return new C4132zu(c3146cu, provider);
    }

    public static C3232ev a(C3146cu c3146cu, C3438jo c3438jo) {
        return (C3232ev) qj0.h.d(c3146cu.d(c3438jo));
    }
}
