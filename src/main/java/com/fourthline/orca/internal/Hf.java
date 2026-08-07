package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Hf implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2847Bf f26110a;

    public Hf(C2847Bf c2847Bf) {
        this.f26110a = c2847Bf;
    }

    public static C3765rE b(C2847Bf c2847Bf) {
        return (C3765rE) qj0.h.d(c2847Bf.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3765rE get() {
        return b(this.f26110a);
    }

    public static Hf a(C2847Bf c2847Bf) {
        return new Hf(c2847Bf);
    }
}
