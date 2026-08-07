package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Gf implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2847Bf f25951a;

    public Gf(C2847Bf c2847Bf) {
        this.f25951a = c2847Bf;
    }

    public static Wf b(C2847Bf c2847Bf) {
        return (Wf) qj0.h.d(c2847Bf.e());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Wf get() {
        return b(this.f25951a);
    }

    public static Gf a(C2847Bf c2847Bf) {
        return new Gf(c2847Bf);
    }
}
