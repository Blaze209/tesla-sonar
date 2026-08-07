package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4426g6 implements qj0.e<C4417f6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Z2> f47686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Y2> f47687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<N5> f47688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<C4351b1> f47689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4444i6 f47690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<G7> f47691f;

    public C4426g6(Provider provider, Provider provider2, Provider provider3, Provider provider4, C4444i6 c4444i6, Provider provider5) {
        this.f47686a = provider;
        this.f47687b = provider2;
        this.f47688c = provider3;
        this.f47689d = provider4;
        this.f47690e = c4444i6;
        this.f47691f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C4417f6(this.f47686a.get(), this.f47687b.get(), this.f47688c.get(), this.f47689d.get(), (C4435h6) this.f47690e.get(), this.f47691f.get());
    }
}
