package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class P1 implements qj0.e<InterfaceC4524r6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1 f46574a;

    public P1(I1 i11, J1 j11) {
        this.f46574a = j11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C channelInfoStore = (C) this.f46574a.get();
        p013kotlin.jvm.internal.s.k(channelInfoStore, "channelInfoStore");
        return (InterfaceC4524r6) qj0.h.d(channelInfoStore);
    }
}
