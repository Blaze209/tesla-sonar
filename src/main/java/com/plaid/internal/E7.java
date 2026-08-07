package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class E7 implements qj0.e<D7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<C4575x3> f46301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC4569w6> f46302b;

    public E7(Provider<C4575x3> provider, Provider<InterfaceC4569w6> provider2) {
        this.f46301a = provider;
        this.f46302b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D7(this.f46301a.get(), this.f46302b.get());
    }
}
