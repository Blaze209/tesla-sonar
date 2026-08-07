package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3797s3 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3712q3 f35196a;

    public C3797s3(C3712q3 c3712q3) {
        this.f35196a = c3712q3;
    }

    public static W0 b(C3712q3 c3712q3) {
        return (W0) qj0.h.d(c3712q3.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public W0 get() {
        return b(this.f35196a);
    }

    public static C3797s3 a(C3712q3 c3712q3) {
        return new C3797s3(c3712q3);
    }
}
