package com.withpersona.sdk2.inquiry.network.core;

import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_UseServerStylesFactory implements qj0.e<String> {
    private final NetworkCoreModule module;

    public NetworkCoreModule_UseServerStylesFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_UseServerStylesFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_UseServerStylesFactory(networkCoreModule);
    }

    public static String useServerStyles(NetworkCoreModule networkCoreModule) {
        return (String) h.d(networkCoreModule.useServerStyles());
    }

    @Override // javax.inject.Provider
    public String get() {
        return useServerStyles(this.module);
    }
}
