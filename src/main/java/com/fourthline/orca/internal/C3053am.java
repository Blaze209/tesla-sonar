package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3053am implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f30448a;

    public C3053am(Zl zl2) {
        this.f30448a = zl2;
    }

    public static C3085bb b(Zl zl2) {
        return (C3085bb) qj0.h.d(zl2.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3085bb get() {
        return b(this.f30448a);
    }

    public static C3053am a(Zl zl2) {
        return new C3053am(zl2);
    }
}
