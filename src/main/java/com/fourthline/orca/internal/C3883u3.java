package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3883u3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f35798a;

    public C3883u3(C3712q3 c3712q3) {
        this.f35798a = c3712q3;
    }

    public static A7 b(C3712q3 c3712q3) {
        return (A7) qj0.h.d(c3712q3.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public A7 get() {
        return b(this.f35798a);
    }

    public static C3883u3 a(C3712q3 c3712q3) {
        return new C3883u3(c3712q3);
    }
}
