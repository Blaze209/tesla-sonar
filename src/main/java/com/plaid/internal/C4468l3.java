package com.plaid.internal;

import android.app.Application;

/* JADX INFO: renamed from: com.plaid.internal.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4468l3 implements qj0.e<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f47834a;

    public C4468l3(C4396d3 c4396d3, qj0.e eVar) {
        this.f47834a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f47834a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        String strA = N4.f46538a.a(application);
        if (strA == null) {
            strA = "";
        }
        return (String) qj0.h.d(strA);
    }
}
