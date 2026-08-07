package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4413f2 implements qj0.e<w8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4343a2 f47648a;

    public C4413f2(I1 i11, C4343a2 c4343a2) {
        this.f47648a = c4343a2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H7 webviewFallbackIdStore = (H7) this.f47648a.get();
        p013kotlin.jvm.internal.s.k(webviewFallbackIdStore, "webviewFallbackIdStore");
        return (w8) qj0.h.d(webviewFallbackIdStore);
    }
}
