package com.withpersona.sdk2.inquiry.network.core;

import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_KeyInflectionFactory implements qj0.e<String> {
    private final NetworkCoreModule module;

    public NetworkCoreModule_KeyInflectionFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_KeyInflectionFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_KeyInflectionFactory(networkCoreModule);
    }

    public static String keyInflection(NetworkCoreModule networkCoreModule) {
        return (String) h.d(networkCoreModule.keyInflection());
    }

    @Override // javax.inject.Provider
    public String get() {
        return keyInflection(this.module);
    }
}
