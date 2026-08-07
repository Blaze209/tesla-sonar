package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class U1 implements qj0.e<InterfaceC4569w6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4343a2 f46730a;

    public U1(I1 i11, C4343a2 c4343a2) {
        this.f46730a = c4343a2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H7 webviewFallbackIdStore = (H7) this.f46730a.get();
        p013kotlin.jvm.internal.s.k(webviewFallbackIdStore, "webviewFallbackIdStore");
        return (InterfaceC4569w6) qj0.h.d(webviewFallbackIdStore);
    }
}
