package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.h;
import com.squareup.moshi.u;
import java.util.Set;
import javax.inject.Provider;
import qj0.i;
import qj0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_MoshiFactory implements qj0.e<u> {
    private final i<Set<JsonAdapterBinding<?>>> jsonAdapterBindingsProvider;
    private final i<Set<h.e>> jsonAdapterFactoryProvider;
    private final i<Set<Object>> jsonAdaptersProvider;
    private final NetworkCoreModule module;

    public NetworkCoreModule_MoshiFactory(NetworkCoreModule networkCoreModule, i<Set<Object>> iVar, i<Set<JsonAdapterBinding<?>>> iVar2, i<Set<h.e>> iVar3) {
        this.module = networkCoreModule;
        this.jsonAdaptersProvider = iVar;
        this.jsonAdapterBindingsProvider = iVar2;
        this.jsonAdapterFactoryProvider = iVar3;
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, Provider<Set<Object>> provider, Provider<Set<JsonAdapterBinding<?>>> provider2, Provider<Set<h.e>> provider3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, j.a(provider), j.a(provider2), j.a(provider3));
    }

    public static u moshi(NetworkCoreModule networkCoreModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<h.e> set3) {
        return (u) qj0.h.d(networkCoreModule.moshi(set, set2, set3));
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, i<Set<Object>> iVar, i<Set<JsonAdapterBinding<?>>> iVar2, i<Set<h.e>> iVar3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, iVar, iVar2, iVar3);
    }

    @Override // javax.inject.Provider
    public u get() {
        return moshi(this.module, this.jsonAdaptersProvider.get(), this.jsonAdapterBindingsProvider.get(), this.jsonAdapterFactoryProvider.get());
    }
}
