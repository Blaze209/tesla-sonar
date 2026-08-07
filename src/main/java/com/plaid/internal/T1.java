package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class T1 implements qj0.e<InterfaceC4560v6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1 f46706a;

    public T1(I1 i11, Z1 z11) {
        this.f46706a = z11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4597z7 webviewBackgroundTransparencyStore = (C4597z7) this.f46706a.get();
        p013kotlin.jvm.internal.s.k(webviewBackgroundTransparencyStore, "webviewBackgroundTransparencyStore");
        return (InterfaceC4560v6) qj0.h.d(webviewBackgroundTransparencyStore);
    }
}
