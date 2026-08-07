package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4395d2 implements qj0.e<u8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N1 f47614a;

    public C4395d2(I1 i11, N1 n11) {
        this.f47614a = n11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Z5 preCompletionResultStore = (Z5) this.f47614a.get();
        p013kotlin.jvm.internal.s.k(preCompletionResultStore, "preCompletionResultStore");
        return (u8) qj0.h.d(preCompletionResultStore);
    }
}
