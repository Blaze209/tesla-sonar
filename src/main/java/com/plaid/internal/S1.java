package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class S1 implements qj0.e<InterfaceC4533s6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4441i3 f46681a;

    public S1(I1 i11, C4441i3 c4441i3) {
        this.f46681a = c4441i3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4522r4 oAuthRedirectUriStore = (C4522r4) this.f46681a.get();
        p013kotlin.jvm.internal.s.k(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (InterfaceC4533s6) qj0.h.d(oAuthRedirectUriStore);
    }
}
