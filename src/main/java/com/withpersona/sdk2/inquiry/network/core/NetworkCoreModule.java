package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import com.squareup.moshi.h;
import com.squareup.moshi.u;
import hg0.g;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkCoreModule {
    public static final Companion Companion = new Companion(null);
    private String environmentId;
    private final String locale;
    private String organizationId;
    private final boolean useServerStyle;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<h.e> provideMoshiJsonAdapterFactory() {
            return d1.i(ErrorResponse.Companion.getAdapter(), InternalErrorInfo.Companion.createAdapter());
        }

        private Companion() {
        }
    }

    public static final class NetworkConstants {
        public static final String HEADER_KEY_PERSONA_ENVIRONMENT_ID = "Persona-Organization-Id";
        public static final String HEADER_KEY_PERSONA_ORGANIZATION_ID = "Persona-Environment-Id";
        public static final NetworkConstants INSTANCE = new NetworkConstants();

        private NetworkConstants() {
        }
    }

    public NetworkCoreModule(boolean z11, String str, String str2) {
        this.useServerStyle = z11;
        this.environmentId = str;
        this.locale = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response interceptor$lambda$8(u uVar, Interceptor.Chain chain) {
        try {
            return chain.proceed(chain.request());
        } catch (ConnectException e11) {
            Response.Builder builderCode = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage = e11.getLocalizedMessage();
            return builderCode.message(localizedMessage != null ? localizedMessage : "").body(ResponseBody.INSTANCE.create(uVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e11.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (SocketTimeoutException e12) {
            Response.Builder builderCode2 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage2 = e12.getLocalizedMessage();
            return builderCode2.message(localizedMessage2 != null ? localizedMessage2 : "").body(ResponseBody.INSTANCE.create(uVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e12.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (UnknownHostException e13) {
            Response.Builder builderCode3 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage3 = e13.getLocalizedMessage();
            return builderCode3.message(localizedMessage3 != null ? localizedMessage3 : "").body(ResponseBody.INSTANCE.create(uVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e13.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (IOException e14) {
            Response.Builder builderCode4 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage4 = e14.getLocalizedMessage();
            return builderCode4.message(localizedMessage4 != null ? localizedMessage4 : "").body(ResponseBody.INSTANCE.create(uVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e14.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        }
    }

    public static final Set<h.e> provideMoshiJsonAdapterFactory() {
        return Companion.provideMoshiJsonAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response responseInterceptor$lambda$7(NetworkCoreModule networkCoreModule, Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        String str = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID);
        if (str != null) {
            networkCoreModule.organizationId = str;
        }
        String str2 = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID);
        if (str2 != null) {
            networkCoreModule.environmentId = str2;
        }
        return responseProceed;
    }

    public final Interceptor interceptor(final u uVar) {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.c
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.interceptor$lambda$8(uVar, chain);
            }
        };
    }

    public final String keyInflection() {
        return "camel";
    }

    public final u moshi(Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<h.e> set3) {
        u.b bVar = new u.b();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            bVar.b(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            bVar.c(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            bVar.a((h.e) it3.next());
        }
        return bVar.d();
    }

    public final OkHttpClient okhttpClient(Set<Interceptor> set, final Map<String, String> map, final Context context, final g gVar, final hg0.b bVar, final kh0.b bVar2) {
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().addNetworkInterceptor(new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                if (!chain.request().headers().names().contains("Accept")) {
                    builderNewBuilder = builderNewBuilder.header("Accept", "application/json");
                }
                Request.Builder builderHeader = builderNewBuilder.header("Persona-Version", "2023-08-08").header("Persona-Device-Manufacturer", bVar.b()).header("Persona-Device-Model", bVar.c()).header("Persona-Device-OS", "Android").header("Persona-Device-OS-Version", bVar.d()).header("Persona-Device-Vendor-Id", gVar.b()).header("VTDGJLGG", String.valueOf(bVar.a())).header("Persona-Style-Variant", (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light");
                String string = this.locale;
                if (string == null) {
                    string = Locale.getDefault().toString();
                }
                Request.Builder builderHeader2 = builderHeader.header("Persona-Device-Locale", string).header("Persona-App-Bundle", context.getPackageName());
                String str = this.organizationId;
                if (str != null) {
                    builderHeader2.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID, str);
                }
                String str2 = this.environmentId;
                if (str2 != null) {
                    builderHeader2.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID, str2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    builderHeader2.header((String) entry.getKey(), (String) entry.getValue());
                }
                return chain.proceed(a.a(a.f58316a, builderHeader2.build(), bVar2, 0L, 2, (Object) null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OkHttpClient.Builder builderConnectTimeout = builderAddNetworkInterceptor.readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).connectTimeout(1L, timeUnit);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builderConnectTimeout.addInterceptor((Interceptor) it.next());
        }
        return builderConnectTimeout.build();
    }

    public final Interceptor responseInterceptor() {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.b
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.responseInterceptor$lambda$7(this.f58321a, chain);
            }
        };
    }

    public final z retrofit(String str, OkHttpClient okHttpClient, u uVar) {
        return new z.b().g(okHttpClient).c(str).b(qr0.a.g(uVar)).e();
    }

    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    public /* synthetic */ NetworkCoreModule(boolean z11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, str2);
    }
}
