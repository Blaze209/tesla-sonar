package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4343a2 implements qj0.e<H7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1 f46859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<T3> f46860b;

    public C4343a2(I1 i11, Provider<T3> provider) {
        this.f46859a = i11;
        this.f46860b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i11 = this.f46859a;
        T3 localPaneStateStore = this.f46860b.get();
        i11.getClass();
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        return (H7) qj0.h.d(new H7(localPaneStateStore));
    }
}
