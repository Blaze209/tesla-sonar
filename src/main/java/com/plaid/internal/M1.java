package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class M1 implements qj0.e<F> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4521r3 f46452a;

    public M1(I1 i11, C4521r3 c4521r3) {
        this.f46452a = c4521r3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d8 workflowApi = (d8) this.f46452a.get();
        p013kotlin.jvm.internal.s.k(workflowApi, "workflowApi");
        return (F) qj0.h.d(new F(workflowApi));
    }
}
