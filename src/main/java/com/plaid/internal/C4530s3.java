package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4530s3 implements qj0.e<t8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4441i3 f48106a;

    public C4530s3(C4396d3 c4396d3, C4441i3 c4441i3) {
        this.f48106a = c4441i3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4522r4 oAuthRedirectUriStore = (C4522r4) this.f48106a.get();
        p013kotlin.jvm.internal.s.k(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (t8) qj0.h.d(oAuthRedirectUriStore);
    }
}
