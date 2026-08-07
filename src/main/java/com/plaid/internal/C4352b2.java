package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4352b2 implements qj0.e<J7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1 f46883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<T3> f46884b;

    public C4352b2(I1 i11, Provider<T3> provider) {
        this.f46883a = i11;
        this.f46884b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i11 = this.f46883a;
        T3 localPaneStateStore = this.f46884b.get();
        i11.getClass();
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        return (J7) qj0.h.d(new J7(localPaneStateStore));
    }
}
