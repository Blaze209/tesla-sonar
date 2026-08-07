package com.plaid.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class O1 implements qj0.e<C4480m6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W1 f46548b;

    public O1(I1 i11, qj0.e eVar, W1 w11) {
        this.f46547a = eVar;
        this.f46548b = w11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f46547a.get();
        InterfaceC4357b7 snaApi = (InterfaceC4357b7) this.f46548b.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(snaApi, "snaApi");
        return (C4480m6) qj0.h.d(new C4480m6(application.getApplicationContext(), snaApi));
    }
}
