package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import hg0.g;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import qj0.h;
import qj0.i;
import qj0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule_OkhttpClientFactory implements qj0.e<OkHttpClient> {
    private final i<Context> contextProvider;
    private final i<hg0.b> deviceInfoProvider;
    private final i<g> deviceVendorIDProvider;
    private final i<Map<String, String>> headersProvider;
    private final i<Set<Interceptor>> interceptorsProvider;
    private final i<kh0.b> loggerProvider;
    private final NetworkCoreModule module;

    public NetworkCoreModule_OkhttpClientFactory(NetworkCoreModule networkCoreModule, i<Set<Interceptor>> iVar, i<Map<String, String>> iVar2, i<Context> iVar3, i<g> iVar4, i<hg0.b> iVar5, i<kh0.b> iVar6) {
        this.module = networkCoreModule;
        this.interceptorsProvider = iVar;
        this.headersProvider = iVar2;
        this.contextProvider = iVar3;
        this.deviceVendorIDProvider = iVar4;
        this.deviceInfoProvider = iVar5;
        this.loggerProvider = iVar6;
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, Provider<Set<Interceptor>> provider, Provider<Map<String, String>> provider2, Provider<Context> provider3, Provider<g> provider4, Provider<hg0.b> provider5, Provider<kh0.b> provider6) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, j.a(provider), j.a(provider2), j.a(provider3), j.a(provider4), j.a(provider5), j.a(provider6));
    }

    public static OkHttpClient okhttpClient(NetworkCoreModule networkCoreModule, Set<Interceptor> set, Map<String, String> map, Context context, g gVar, hg0.b bVar, kh0.b bVar2) {
        return (OkHttpClient) h.d(networkCoreModule.okhttpClient(set, map, context, gVar, bVar, bVar2));
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, i<Set<Interceptor>> iVar, i<Map<String, String>> iVar2, i<Context> iVar3, i<g> iVar4, i<hg0.b> iVar5, i<kh0.b> iVar6) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return okhttpClient(this.module, this.interceptorsProvider.get(), this.headersProvider.get(), this.contextProvider.get(), this.deviceVendorIDProvider.get(), this.deviceInfoProvider.get(), this.loggerProvider.get());
    }
}
