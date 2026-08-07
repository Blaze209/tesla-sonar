package com.plaid.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class J1 implements qj0.e<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1 f46367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<T3> f46368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<wo0.b> f46369c;

    public J1(I1 i11, Provider<T3> provider, Provider<wo0.b> provider2) {
        this.f46367a = i11;
        this.f46368b = provider;
        this.f46369c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i11 = this.f46367a;
        T3 localPaneStateStore = this.f46368b.get();
        wo0.b json = this.f46369c.get();
        i11.getClass();
        p013kotlin.jvm.internal.s.k(localPaneStateStore, "localPaneStateStore");
        p013kotlin.jvm.internal.s.k(json, "json");
        return (C) qj0.h.d(new C(localPaneStateStore, json));
    }
}
