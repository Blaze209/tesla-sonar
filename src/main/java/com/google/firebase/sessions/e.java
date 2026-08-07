package com.google.firebase.sessions;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import u6.h;
import vw.SessionData;
import vw.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements xw.b<h<SessionData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f44810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f44811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<f0> f44812c;

    public e(Provider<Context> provider, Provider<CoroutineContext> provider2, Provider<f0> provider3) {
        this.f44810a = provider;
        this.f44811b = provider2;
        this.f44812c = provider3;
    }

    public static e a(Provider<Context> provider, Provider<CoroutineContext> provider2, Provider<f0> provider3) {
        return new e(provider, provider2, provider3);
    }

    public static h<SessionData> c(Context context, CoroutineContext coroutineContext, f0 f0Var) {
        return (h) xw.d.d(b.InterfaceC0699b.INSTANCE.m(context, coroutineContext, f0Var));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h<SessionData> get() {
        return c(this.f44810a.get(), this.f44811b.get(), this.f44812c.get());
    }
}
