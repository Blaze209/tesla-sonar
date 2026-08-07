package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4591z1 implements qj0.e<C4582y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<H5> f48262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<wo0.b> f48263b;

    public C4591z1(Provider<H5> provider, Provider<wo0.b> provider2) {
        this.f48262a = provider;
        this.f48263b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C4582y1(this.f48262a.get(), qj0.d.b(this.f48263b));
    }
}
