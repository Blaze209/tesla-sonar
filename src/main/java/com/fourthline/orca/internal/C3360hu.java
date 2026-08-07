package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3360hu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f32362a;

    public C3360hu(C3146cu c3146cu) {
        this.f32362a = c3146cu;
    }

    public static Lj b(C3146cu c3146cu) {
        return (Lj) qj0.h.d(c3146cu.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lj get() {
        return b(this.f32362a);
    }

    public static C3360hu a(C3146cu c3146cu) {
        return new C3360hu(c3146cu);
    }
}
