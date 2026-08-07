package com.plaid.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class A5 implements qj0.e<C4479m5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46206a;

    public A5(C4515q5 c4515q5, qj0.e eVar) {
        this.f46206a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f46206a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        return (C4479m5) qj0.h.d(new C4479m5(application));
    }
}
