package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3960vu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f36296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36297b;

    public C3960vu(C3146cu c3146cu, Provider provider) {
        this.f36296a = c3146cu;
        this.f36297b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3092bi get() {
        return a(this.f36296a, (C3438jo) this.f36297b.get());
    }

    public static C3960vu a(C3146cu c3146cu, Provider provider) {
        return new C3960vu(c3146cu, provider);
    }

    public static C3092bi a(C3146cu c3146cu, C3438jo c3438jo) {
        return (C3092bi) qj0.h.d(c3146cu.c(c3438jo));
    }
}
