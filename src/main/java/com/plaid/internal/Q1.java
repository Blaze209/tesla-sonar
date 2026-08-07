package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class Q1 implements qj0.e<InterfaceC4542t6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1 f46628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<L4> f46629b;

    public Q1(I1 i11, Provider<L4> provider) {
        this.f46628a = i11;
        this.f46629b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i11 = this.f46628a;
        L4 paneStore = this.f46629b.get();
        i11.getClass();
        p013kotlin.jvm.internal.s.k(paneStore, "paneStore");
        return (InterfaceC4542t6) qj0.h.d(paneStore);
    }
}
