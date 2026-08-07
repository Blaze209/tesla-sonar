package com.withpersona.sdk2.inquiry.network.core;

import okhttp3.Interceptor;
import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_ResponseInterceptorFactory implements qj0.e<Interceptor> {
    private final NetworkCoreModule module;

    public NetworkCoreModule_ResponseInterceptorFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_ResponseInterceptorFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_ResponseInterceptorFactory(networkCoreModule);
    }

    public static Interceptor responseInterceptor(NetworkCoreModule networkCoreModule) {
        return (Interceptor) h.d(networkCoreModule.responseInterceptor());
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return responseInterceptor(this.module);
    }
}
