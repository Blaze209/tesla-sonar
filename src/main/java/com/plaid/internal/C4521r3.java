package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4521r3 implements qj0.e<d8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<E5> f48090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C4479m5> f48091b;

    public C4521r3(C4396d3 c4396d3, Provider<E5> provider, Provider<C4479m5> provider2) {
        this.f48090a = provider;
        this.f48091b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E5 retrofitFactory = this.f48090a.get();
        C4479m5 plaidEnvironmentStore = this.f48091b.get();
        p013kotlin.jvm.internal.s.k(retrofitFactory, "retrofitFactory");
        p013kotlin.jvm.internal.s.k(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC4452j5 env = plaidEnvironmentStore.b();
        p013kotlin.jvm.internal.s.k(env, "env");
        int i11 = C4461k5.f47800a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i11 != 1) {
            if (i11 == 2) {
                str = "https://development.plaid.com/";
            } else if (i11 == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object objB = retrofitFactory.a(str, new G5(null, 3)).b(d8.class);
        p013kotlin.jvm.internal.s.j(objB, "create(...)");
        return (d8) qj0.h.d((d8) objB);
    }
}
