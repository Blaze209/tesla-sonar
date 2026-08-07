package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class B3 implements qj0.e<C4575x3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4521r3 f46222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4423g3 f46223b;

    public B3(C4521r3 c4521r3, C4423g3 c4423g3) {
        this.f46222a = c4521r3;
        this.f46223b = c4423g3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C4575x3((d8) this.f46222a.get(), (A3) this.f46223b.get());
    }
}
