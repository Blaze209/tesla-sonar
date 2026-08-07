package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3754r3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f34968a;

    public C3754r3(C3712q3 c3712q3) {
        this.f34968a = c3712q3;
    }

    public static C4052y b(C3712q3 c3712q3) {
        return (C4052y) qj0.h.d(c3712q3.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4052y get() {
        return b(this.f34968a);
    }

    public static C3754r3 a(C3712q3 c3712q3) {
        return new C3754r3(c3712q3);
    }
}
