package com.plaid.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class C5 implements qj0.e<H5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46240a;

    public C5(C4515q5 c4515q5, qj0.e eVar) {
        this.f46240a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application context = (Application) this.f46240a.get();
        p013kotlin.jvm.internal.s.k(context, "application");
        H5.a aVar = H5.f46335b;
        p013kotlin.jvm.internal.s.k(context, "context");
        H5 h11 = H5.f46336c;
        if (h11 == null) {
            synchronized (aVar) {
                h11 = H5.f46336c;
                if (h11 == null) {
                    Context applicationContext = context.getApplicationContext();
                    p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
                    h11 = new H5(applicationContext);
                    H5.f46336c = h11;
                }
            }
        }
        return (H5) qj0.h.d(h11);
    }
}
