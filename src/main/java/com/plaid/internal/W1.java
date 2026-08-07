package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class W1 implements qj0.e<InterfaceC4357b7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<E5> f46784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C4479m5> f46785b;

    public W1(I1 i11, Provider<E5> provider, Provider<C4479m5> provider2) {
        this.f46784a = provider;
        this.f46785b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E5 retrofitFactory = this.f46784a.get();
        C4479m5 plaidEnvironmentStore = this.f46785b.get();
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
        Object objB = retrofitFactory.a(str, new G5(null, 3)).b(InterfaceC4357b7.class);
        p013kotlin.jvm.internal.s.j(objB, "create(...)");
        return (InterfaceC4357b7) qj0.h.d((InterfaceC4357b7) objB);
    }
}
