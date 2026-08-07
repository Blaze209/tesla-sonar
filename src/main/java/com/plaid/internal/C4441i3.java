package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4441i3 implements qj0.e<C4522r4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4396d3 f47731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<T3> f47732b;

    public C4441i3(C4396d3 c4396d3, Provider<T3> provider) {
        this.f47731a = c4396d3;
        this.f47732b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C4396d3 c4396d3 = this.f47731a;
        T3 localPaneStateStore = this.f47732b.get();
        c4396d3.getClass();
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        return (C4522r4) qj0.h.d(new C4522r4(localPaneStateStore));
    }
}
