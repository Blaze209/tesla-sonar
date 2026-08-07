package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.u;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import qj0.h;
import qj0.i;
import qj0.j;
import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_RetrofitFactory implements qj0.e<z> {
    private final NetworkCoreModule module;
    private final i<u> moshiProvider;
    private final i<OkHttpClient> okHttpClientProvider;
    private final i<String> serverEndpointProvider;

    public NetworkCoreModule_RetrofitFactory(NetworkCoreModule networkCoreModule, i<String> iVar, i<OkHttpClient> iVar2, i<u> iVar3) {
        this.module = networkCoreModule;
        this.serverEndpointProvider = iVar;
        this.okHttpClientProvider = iVar2;
        this.moshiProvider = iVar3;
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<u> provider3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, j.a(provider), j.a(provider2), j.a(provider3));
    }

    public static z retrofit(NetworkCoreModule networkCoreModule, String str, OkHttpClient okHttpClient, u uVar) {
        return (z) h.d(networkCoreModule.retrofit(str, okHttpClient, uVar));
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, i<String> iVar, i<OkHttpClient> iVar2, i<u> iVar3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, iVar, iVar2, iVar3);
    }

    @Override // javax.inject.Provider
    public z get() {
        return retrofit(this.module, this.serverEndpointProvider.get(), this.okHttpClientProvider.get(), this.moshiProvider.get());
    }
}
