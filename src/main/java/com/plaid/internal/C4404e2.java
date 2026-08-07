package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4404e2 implements qj0.e<v8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1 f47634a;

    public C4404e2(I1 i11, Z1 z11) {
        this.f47634a = z11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4597z7 webviewBackgroundTransparencyStore = (C4597z7) this.f47634a.get();
        p013kotlin.jvm.internal.s.k(webviewBackgroundTransparencyStore, "webviewBackgroundTransparencyStore");
        return (v8) qj0.h.d(webviewBackgroundTransparencyStore);
    }
}
