package com.google.firebase.sessions;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;
import u6.h;
import yw.SessionConfigs;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xw.b<h<SessionConfigs>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f44808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CoroutineContext> f44809b;

    public d(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.f44808a = provider;
        this.f44809b = provider2;
    }

    public static d a(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new d(provider, provider2);
    }

    public static h<SessionConfigs> c(Context context, CoroutineContext coroutineContext) {
        return (h) xw.d.d(b.InterfaceC0699b.INSTANCE.j(context, coroutineContext));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h<SessionConfigs> get() {
        return c(this.f44808a.get(), this.f44809b.get());
    }
}
