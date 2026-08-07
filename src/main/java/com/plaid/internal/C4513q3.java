package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4513q3 implements qj0.e<G7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<C4351b1> f48065a;

    public C4513q3(C4396d3 c4396d3, Provider<C4351b1> provider) {
        this.f48065a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4351b1 featureManager = this.f48065a.get();
        p013kotlin.jvm.internal.s.k(featureManager, "featureManager");
        return (G7) qj0.h.d(new G7(new C4362c3(featureManager)));
    }
}
