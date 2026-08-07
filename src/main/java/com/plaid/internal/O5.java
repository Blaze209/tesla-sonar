package com.plaid.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class O5 implements qj0.e<N5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46562a;

    public O5(qj0.e eVar) {
        this.f46562a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new N5((Application) this.f46562a.get());
    }
}
