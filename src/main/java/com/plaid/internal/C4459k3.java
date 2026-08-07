package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4459k3 implements qj0.e<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4396d3 f47796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<I5> f47797b;

    public C4459k3(C4396d3 c4396d3, Provider<I5> provider) {
        this.f47796a = c4396d3;
        this.f47797b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4396d3 c4396d3 = this.f47796a;
        I5 sdkVersionDetails = this.f47797b.get();
        c4396d3.getClass();
        p013kotlin.jvm.internal.s.k(sdkVersionDetails, "sdkVersionDetails");
        return (I) qj0.h.d(new I(sdkVersionDetails));
    }
}
