package com.plaid.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Y1 implements qj0.e<InterfaceC4517q7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46820a;

    public Y1(I1 i11, qj0.e eVar) {
        this.f46820a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f46820a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        Context context = application.getApplicationContext();
        p013kotlin.jvm.internal.s.j(context, "getApplicationContext(...)");
        p013kotlin.jvm.internal.s.k(context, "context");
        return (InterfaceC4517q7) qj0.h.d(new N(new L(context, new J())));
    }
}
