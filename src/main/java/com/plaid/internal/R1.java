package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class R1 implements qj0.e<InterfaceC4551u6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N1 f46642a;

    public R1(I1 i11, N1 n11) {
        this.f46642a = n11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Z5 preCompletionResultStore = (Z5) this.f46642a.get();
        p013kotlin.jvm.internal.s.k(preCompletionResultStore, "preCompletionResultStore");
        return (InterfaceC4551u6) qj0.h.d(preCompletionResultStore);
    }
}
