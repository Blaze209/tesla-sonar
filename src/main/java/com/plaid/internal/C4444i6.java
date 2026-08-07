package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4444i6 implements qj0.e<C4435h6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<N5> f47739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C4364c5> f47740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<wo0.b> f47741c;

    public C4444i6(Provider<N5> provider, Provider<C4364c5> provider2, Provider<wo0.b> provider3) {
        this.f47739a = provider;
        this.f47740b = provider2;
        this.f47741c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C4435h6(this.f47739a.get(), this.f47740b.get(), this.f47741c.get());
    }
}
