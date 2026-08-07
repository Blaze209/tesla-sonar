package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3188du implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f31244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31245b;

    public C3188du(C3146cu c3146cu, Provider provider) {
        this.f31244a = c3146cu;
        this.f31245b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Yu get() {
        return a(this.f31244a, (Uj) this.f31245b.get());
    }

    public static C3188du a(C3146cu c3146cu, Provider provider) {
        return new C3188du(c3146cu, provider);
    }

    public static Yu a(C3146cu c3146cu, Uj uj2) {
        return (Yu) qj0.h.d(c3146cu.a(uj2));
    }
}
