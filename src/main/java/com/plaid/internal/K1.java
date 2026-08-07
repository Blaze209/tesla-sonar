package com.plaid.internal;

import android.app.Application;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class K1 implements qj0.e<C4443i5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f46382a;

    public K1(I1 i11, qj0.e eVar) {
        this.f46382a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f46382a.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        File cacheDir = application.getCacheDir();
        p013kotlin.jvm.internal.s.j(cacheDir, "getCacheDir(...)");
        return (C4443i5) qj0.h.d(new C4443i5(cacheDir, "plaid-sdk/images"));
    }
}
