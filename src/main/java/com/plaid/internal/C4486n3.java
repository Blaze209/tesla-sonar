package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4486n3 implements qj0.e<I6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4521r3 f47924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<String> f47925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<I> f47926c;

    public C4486n3(C4396d3 c4396d3, C4521r3 c4521r3, Provider provider, Provider provider2) {
        this.f47924a = c4521r3;
        this.f47925b = provider;
        this.f47926c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d8 workflowApi = (d8) this.f47924a.get();
        String persistentLinkId = this.f47925b.get();
        I clientTypeProvider = this.f47926c.get();
        p013kotlin.jvm.internal.s.k(workflowApi, "workflowApi");
        p013kotlin.jvm.internal.s.k(persistentLinkId, "persistentLinkId");
        p013kotlin.jvm.internal.s.k(clientTypeProvider, "clientTypeProvider");
        return (I6) qj0.h.d(new I6(workflowApi, persistentLinkId, clientTypeProvider));
    }
}
