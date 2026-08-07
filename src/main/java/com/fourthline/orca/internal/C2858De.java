package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2858De implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4116ze f25462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25463b;

    public C2858De(C4116ze c4116ze, Provider provider) {
        this.f25462a = c4116ze;
        this.f25463b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TC get() {
        return a(this.f25462a, (Uj) this.f25463b.get());
    }

    public static C2858De a(C4116ze c4116ze, Provider provider) {
        return new C2858De(c4116ze, provider);
    }

    public static TC a(C4116ze c4116ze, Uj uj2) {
        return (TC) qj0.h.d(c4116ze.a(uj2));
    }
}
