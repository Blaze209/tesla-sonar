package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class V1 implements qj0.e<InterfaceC4578x6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4352b2 f46763a;

    public V1(I1 i11, C4352b2 c4352b2) {
        this.f46763a = c4352b2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J7 webviewFallbackUriStore = (J7) this.f46763a.get();
        p013kotlin.jvm.internal.s.k(webviewFallbackUriStore, "webviewFallbackUriStore");
        return (InterfaceC4578x6) qj0.h.d(webviewFallbackUriStore);
    }
}
