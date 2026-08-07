package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4361c2 implements qj0.e<s8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1 f46899a;

    public C4361c2(I1 i11, J1 j11) {
        this.f46899a = j11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C channelInfoStore = (C) this.f46899a.get();
        p013kotlin.jvm.internal.s.k(channelInfoStore, "channelInfoStore");
        return (s8) qj0.h.d(channelInfoStore);
    }
}
