package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3530lu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f33444a;

    public C3530lu(C3146cu c3146cu) {
        this.f33444a = c3146cu;
    }

    public static C3187dt b(C3146cu c3146cu) {
        return (C3187dt) qj0.h.d(c3146cu.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3187dt get() {
        return b(this.f33444a);
    }

    public static C3530lu a(C3146cu c3146cu) {
        return new C3530lu(c3146cu);
    }
}
