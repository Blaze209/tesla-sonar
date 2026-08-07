package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3150cy implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yx f31031a;

    public C3150cy(Yx yx2) {
        this.f31031a = yx2;
    }

    public static ED b(Yx yx2) {
        return (ED) qj0.h.d(yx2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return b(this.f31031a);
    }

    public static C3150cy a(Yx yx2) {
        return new C3150cy(yx2);
    }
}
