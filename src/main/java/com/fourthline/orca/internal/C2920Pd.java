package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2920Pd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2905Md f27331a;

    public C2920Pd(C2905Md c2905Md) {
        this.f27331a = c2905Md;
    }

    public static C2976Vd b(C2905Md c2905Md) {
        return (C2976Vd) qj0.h.d(c2905Md.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2976Vd get() {
        return b(this.f27331a);
    }

    public static C2920Pd a(C2905Md c2905Md) {
        return new C2920Pd(c2905Md);
    }
}
