package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4477m3 implements qj0.e<C6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<I6> f47870a;

    public C4477m3(C4396d3 c4396d3, Provider<I6> provider) {
        this.f47870a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I6 eventSender = this.f47870a.get();
        p013kotlin.jvm.internal.s.k(eventSender, "eventSender");
        return (C6) qj0.h.d(new C6(eventSender));
    }
}
