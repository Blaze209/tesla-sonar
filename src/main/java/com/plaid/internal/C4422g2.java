package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4422g2 implements qj0.e<x8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4352b2 f47677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<G7> f47678b;

    public C4422g2(I1 i11, C4352b2 c4352b2, Provider provider) {
        this.f47677a = c4352b2;
        this.f47678b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J7 webviewFallbackUriStore = (J7) this.f47677a.get();
        G7 webviewFallbackBaseUrlOverWriter = this.f47678b.get();
        p013kotlin.jvm.internal.s.k(webviewFallbackUriStore, "webviewFallbackUriStore");
        p013kotlin.jvm.internal.s.k(webviewFallbackBaseUrlOverWriter, "webviewFallbackBaseUrlOverWriter");
        return (x8) qj0.h.d(webviewFallbackUriStore);
    }
}
