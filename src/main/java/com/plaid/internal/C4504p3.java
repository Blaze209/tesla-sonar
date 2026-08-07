package com.plaid.internal;

import android.app.Application;
import android.content.res.Resources;

/* JADX INFO: renamed from: com.plaid.internal.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4504p3 implements qj0.e<Resources> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f48034a;

    public C4504p3(C4396d3 c4396d3, qj0.e eVar) {
        this.f48034a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f48034a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        Resources resources = application.getResources();
        p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
        return (Resources) qj0.h.d(resources);
    }
}
