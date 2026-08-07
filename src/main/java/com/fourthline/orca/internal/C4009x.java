package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4009x implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f36633a;

    public C4009x(C3152d c3152d) {
        this.f36633a = c3152d;
    }

    public static androidx.p003lifecycle.f1 b(C3152d c3152d) {
        return (androidx.p003lifecycle.f1) qj0.h.d(c3152d.p());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.p003lifecycle.f1 get() {
        return b(this.f36633a);
    }

    public static C4009x a(C3152d c3152d) {
        return new C4009x(c3152d);
    }
}
