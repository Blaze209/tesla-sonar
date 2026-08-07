package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2871Ff implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2847Bf f25820a;

    public C2871Ff(C2847Bf c2847Bf) {
        this.f25820a = c2847Bf;
    }

    public static Ts b(C2847Bf c2847Bf) {
        return (Ts) qj0.h.d(c2847Bf.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ts get() {
        return b(this.f25820a);
    }

    public static C2871Ff a(C2847Bf c2847Bf) {
        return new C2871Ff(c2847Bf);
    }
}
