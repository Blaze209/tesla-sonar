package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4550u5 implements qj0.e<C4351b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4515q5 f48160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<AbstractC4394d1> f48161b;

    public C4550u5(C4515q5 c4515q5, Provider<AbstractC4394d1> provider) {
        this.f48160a = c4515q5;
        this.f48161b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4515q5 c4515q5 = this.f48160a;
        AbstractC4394d1 featureStore = this.f48161b.get();
        c4515q5.getClass();
        p013kotlin.jvm.internal.s.k(featureStore, "featureStore");
        return (C4351b1) qj0.h.d(new C4351b1(featureStore));
    }
}
