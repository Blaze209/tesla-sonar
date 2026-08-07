package com.plaid.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class D5 implements qj0.e<I5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46271a;

    public D5(C4515q5 c4515q5, qj0.e eVar) {
        this.f46271a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f46271a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        return (I5) qj0.h.d(new I5(application));
    }
}
