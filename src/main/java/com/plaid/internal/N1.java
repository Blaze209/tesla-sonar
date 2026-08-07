package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class N1 implements qj0.e<Z5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1 f46469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<T3> f46470b;

    public N1(I1 i11, Provider<T3> provider) {
        this.f46469a = i11;
        this.f46470b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i11 = this.f46469a;
        T3 localPaneStateStore = this.f46470b.get();
        i11.getClass();
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        return (Z5) qj0.h.d(new Z5(localPaneStateStore));
    }
}
