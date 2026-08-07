package com.fourthline.nfc.internal;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2814g0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2802a0 f24647a;

    public C2814g0(C2802a0 c2802a0) {
        this.f24647a = c2802a0;
    }

    public static K b(C2802a0 c2802a0) {
        return (K) qj0.h.d(c2802a0.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public K get() {
        return b(this.f24647a);
    }

    public static C2814g0 a(C2802a0 c2802a0) {
        return new C2814g0(c2802a0);
    }
}
