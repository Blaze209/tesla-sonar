package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3401iu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f32605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32606b;

    public C3401iu(C3146cu c3146cu, Provider provider) {
        this.f32605a = c3146cu;
        this.f32606b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nj get() {
        return a(this.f32605a, (Uj) this.f32606b.get());
    }

    public static C3401iu a(C3146cu c3146cu, Provider provider) {
        return new C3401iu(c3146cu, provider);
    }

    public static Nj a(C3146cu c3146cu, Uj uj2) {
        return (Nj) qj0.h.d(c3146cu.b(uj2));
    }
}
