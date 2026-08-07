package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import com.plaid.link.Plaid;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4532s5 implements qj0.e<C4364c5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f48109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<E5> f48110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<C4479m5> f48111c;

    public C4532s5(C4515q5 c4515q5, qj0.e eVar, Provider provider, Provider provider2) {
        this.f48109a = eVar;
        this.f48110b = provider;
        this.f48111c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f48109a.get();
        E5 plaidRetrofit = this.f48110b.get();
        C4479m5 plaidGlobalValuesStore = this.f48111c.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(plaidRetrofit, "plaidRetrofit");
        p013kotlin.jvm.internal.s.k(plaidGlobalValuesStore, "plaidGlobalValuesStore");
        return (C4364c5) qj0.h.d(new C4364c5(application, SentryProject.LinkSdk.INSTANCE, Plaid.getVERSION_NAME(), Z.a.f46840a, plaidRetrofit, plaidGlobalValuesStore, new M2(application)));
    }
}
