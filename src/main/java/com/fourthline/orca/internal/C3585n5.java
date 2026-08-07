package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3585n5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f33818a;

    public C3585n5(C3286g5 c3286g5) {
        this.f33818a = c3286g5;
    }

    public static P5 b(C3286g5 c3286g5) {
        return (P5) qj0.h.d(c3286g5.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P5 get() {
        return b(this.f33818a);
    }

    public static C3585n5 a(C3286g5 c3286g5) {
        return new C3585n5(c3286g5);
    }
}
