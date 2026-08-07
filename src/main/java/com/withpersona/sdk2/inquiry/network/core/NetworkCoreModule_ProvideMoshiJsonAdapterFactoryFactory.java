package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.h;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory implements qj0.e<Set<h.e>> {

    public static final class InstanceHolder {
        static final NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) qj0.h.d(NetworkCoreModule.provideMoshiJsonAdapterFactory());
    }

    @Override // javax.inject.Provider
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
