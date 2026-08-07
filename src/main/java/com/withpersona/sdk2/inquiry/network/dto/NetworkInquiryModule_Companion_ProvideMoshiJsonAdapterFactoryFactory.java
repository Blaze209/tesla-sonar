package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.h;
import java.util.Set;
import qj0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements e<Set<h.e>> {

    private static final class InstanceHolder {
        static final NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) qj0.h.d(NetworkInquiryModule.INSTANCE.provideMoshiJsonAdapterFactory());
    }

    @Override // javax.inject.Provider
    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
