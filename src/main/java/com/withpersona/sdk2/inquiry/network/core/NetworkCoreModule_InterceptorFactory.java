package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.u;
import javax.inject.Provider;
import okhttp3.Interceptor;
import qj0.h;
import qj0.i;
import qj0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_InterceptorFactory implements qj0.e<Interceptor> {
    private final NetworkCoreModule module;
    private final i<u> moshiProvider;

    public NetworkCoreModule_InterceptorFactory(NetworkCoreModule networkCoreModule, i<u> iVar) {
        this.module = networkCoreModule;
        this.moshiProvider = iVar;
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, Provider<u> provider) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, j.a(provider));
    }

    public static Interceptor interceptor(NetworkCoreModule networkCoreModule, u uVar) {
        return (Interceptor) h.d(networkCoreModule.interceptor(uVar));
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, i<u> iVar) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, iVar);
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return interceptor(this.module, this.moshiProvider.get());
    }
}
