package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class B5 implements qj0.e<E5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<I5> f46228a;

    public B5(C4515q5 c4515q5, Provider<I5> provider) {
        this.f46228a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I5 sdkVersionDetails = this.f46228a.get();
        p013kotlin.jvm.internal.s.k(sdkVersionDetails, "sdkVersionDetails");
        return (E5) qj0.h.d(E5.f46295c.a(sdkVersionDetails.a()));
    }
}
