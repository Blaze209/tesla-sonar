package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3317gu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f32093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32094b;

    public C3317gu(C3146cu c3146cu, Provider provider) {
        this.f32093a = c3146cu;
        this.f32094b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gj get() {
        return a(this.f32093a, (C3438jo) this.f32094b.get());
    }

    public static C3317gu a(C3146cu c3146cu, Provider provider) {
        return new C3317gu(c3146cu, provider);
    }

    public static Gj a(C3146cu c3146cu, C3438jo c3438jo) {
        return (Gj) qj0.h.d(c3146cu.a(c3438jo));
    }
}
