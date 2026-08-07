package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class Z1 implements qj0.e<C4597z7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1 f46843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<T3> f46844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<C4351b1> f46845c;

    public Z1(I1 i11, Provider<T3> provider, Provider<C4351b1> provider2) {
        this.f46843a = i11;
        this.f46844b = provider;
        this.f46845c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i11 = this.f46843a;
        T3 localPaneStateStore = this.f46844b.get();
        C4351b1 featureManager = this.f46845c.get();
        i11.getClass();
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        p013kotlin.jvm.internal.s.k(featureManager, "featureManager");
        return (C4597z7) qj0.h.d(new C4597z7(localPaneStateStore, featureManager));
    }
}
