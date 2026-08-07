package com.plaid.internal;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public final class E5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46295c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile E5 f46296d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f46298b = new LinkedHashMap();

    public static final class a {
        public final E5 a(String str) {
            E5 e11;
            E5 e12 = E5.f46296d;
            if (e12 != null) {
                return e12;
            }
            synchronized (this) {
                e11 = E5.f46296d;
                if (e11 == null) {
                    e11 = new E5(str);
                    E5.f46296d = e11;
                }
            }
            return e11;
        }
    }

    public E5(String str) {
        this.f46297a = str;
    }

    public final retrofit2.z a(String baseUrl, G5 options) {
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        p013kotlin.jvm.internal.s.k(options, "options");
        retrofit2.z zVar = (retrofit2.z) this.f46298b.get(baseUrl);
        if (zVar != null) {
            return zVar;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new F5(this));
        builder.readTimeout(10L, TimeUnit.MINUTES);
        SocketFactory socketFactory = options.f46327b;
        if (socketFactory != null) {
            builder.socketFactory(socketFactory);
        }
        OkHttpClient okHttpClientBuild = builder.build();
        com.google.gson.f fVar = options.f46326a;
        pr0.a aVarF = fVar == null ? pr0.a.f() : pr0.a.g(fVar);
        retrofit2.z.b bVarA = new retrofit2.z.b().g(okHttpClientBuild).a(new T());
        p013kotlin.jvm.internal.s.j(bVarA, "addCallAdapterFactory(...)");
        bVarA.c(baseUrl);
        bVarA.b(rr0.a.f());
        bVarA.b(aVarF);
        retrofit2.z zVarE = bVarA.e();
        LinkedHashMap linkedHashMap = this.f46298b;
        p013kotlin.jvm.internal.s.h(zVarE);
        linkedHashMap.put(baseUrl, zVarE);
        return zVarE;
    }
}
