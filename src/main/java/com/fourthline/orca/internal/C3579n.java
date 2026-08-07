package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3579n implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f33755a;

    public C3579n(C3152d c3152d) {
        this.f33755a = c3152d;
    }

    public static C3902ug b(C3152d c3152d) {
        return (C3902ug) qj0.h.d(c3152d.i());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3902ug get() {
        return b(this.f33755a);
    }

    public static C3579n a(C3152d c3152d) {
        return new C3579n(c3152d);
    }
}
