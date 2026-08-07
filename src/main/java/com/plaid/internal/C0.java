package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class C0 implements qj0.e<A0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC4542t6> f46235a;

    public C0(Provider<InterfaceC4542t6> provider) {
        this.f46235a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A0(this.f46235a.get());
    }
}
