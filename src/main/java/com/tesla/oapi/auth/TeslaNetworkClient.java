package com.tesla.oapi.auth;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.modules.network.n;
import com.tesla.logging.g;
import ie0.f;
import ie0.x;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.c0;
import okio.i;
import okio.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0003\u000e\u000f\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tesla/oapi/auth/TeslaNetworkClient;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "authRepository", "Lcom/tesla/oapi/auth/AuthRepository;", "<init>", "(Landroid/content/Context;Lcom/tesla/oapi/auth/AuthRepository;)V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "appContext", "buildClient", "GzipRequestInterceptor", "DefaultHeadersInjectionInterceptor", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaNetworkClient {
    public static final String HEADER_COMPRESSION_DISABLED = "CompressionDisabled";
    private static volatile TeslaNetworkClient instance;
    private final Context appContext;
    private final OkHttpClient client;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final g oapiLogger = g.INSTANCE.a("OwnerAPI");

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/tesla/oapi/auth/TeslaNetworkClient$Companion;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/oapi/auth/AuthRepository;", "authRepository", "Lcom/tesla/oapi/auth/TeslaNetworkClient;", "getInstance", "(Landroid/content/Context;Lcom/tesla/oapi/auth/AuthRepository;)Lcom/tesla/oapi/auth/TeslaNetworkClient;", "", "getOwnerapiBaseURL", "()Ljava/lang/String;", "getHermesURL", "Lcom/tesla/logging/g;", "oapiLogger", "Lcom/tesla/logging/g;", "HEADER_COMPRESSION_DISABLED", "Ljava/lang/String;", "instance", "Lcom/tesla/oapi/auth/TeslaNetworkClient;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getHermesURL() {
            return "wss://signaling.vn.teslamotors.com:443/v1/mobile";
        }

        public final TeslaNetworkClient getInstance(Context context, AuthRepository authRepository) {
            s.k(context, "context");
            s.k(authRepository, "authRepository");
            if (TeslaNetworkClient.instance == null) {
                synchronized (this) {
                    try {
                        if (TeslaNetworkClient.instance == null) {
                            TeslaNetworkClient.instance = new TeslaNetworkClient(context, authRepository, null);
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            TeslaNetworkClient teslaNetworkClient = TeslaNetworkClient.instance;
            s.h(teslaNetworkClient);
            return teslaNetworkClient;
        }

        public final String getOwnerapiBaseURL() {
            return "https://owner-api.teslamotors.com/";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/auth/TeslaNetworkClient$DefaultHeadersInjectionInterceptor;", "Lokhttp3/Interceptor;", "<init>", "(Lcom/tesla/oapi/auth/TeslaNetworkClient;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class DefaultHeadersInjectionInterceptor implements Interceptor {
        public DefaultHeadersInjectionInterceptor() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x007a  */
        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            s.k(chain, "chain");
            Request request = chain.request();
            Request.Builder builderNewBuilder = request.newBuilder();
            TeslaNetworkClient teslaNetworkClient = TeslaNetworkClient.this;
            if (request.headers().get("X-TXID") == null) {
                String string = UUID.randomUUID().toString();
                s.j(string, "toString(...)");
                builderNewBuilder.header("X-TXID", string);
            }
            qb0.a.Companion companion = qb0.a.INSTANCE;
            builderNewBuilder.header("X-Tesla-User-Agent", companion.b().c());
            builderNewBuilder.header("User-Agent", companion.b().c());
            builderNewBuilder.header("X-App-State", f.INSTANCE.a(teslaNetworkClient.appContext).c());
            if (request.headers().get("Content-Type") != null) {
                TeslaNetworkClient.oapiLogger.a("Content-Type already present on request, not setting.");
            } else {
                RequestBody requestBodyBody = request.body();
                if ((requestBodyBody != null ? requestBodyBody.getF22850a() : null) == null) {
                    builderNewBuilder.header("Content-Type", "application/json");
                } else {
                    TeslaNetworkClient.oapiLogger.a("Content-Type already present on request, not setting.");
                }
            }
            builderNewBuilder.header("accept", "*/*");
            builderNewBuilder.header("charset", "utf-8");
            builderNewBuilder.header("cache-control", "no-cache");
            String strD = companion.b().d();
            if (strD != null) {
                builderNewBuilder.header("X-Tesla-App-Key", strD);
            }
            builderNewBuilder.header("Accept-Language", x.f77622a.b());
            return chain.proceed(builderNewBuilder.build());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/tesla/oapi/auth/TeslaNetworkClient$GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "gzip", "Lokhttp3/RequestBody;", "body", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class GzipRequestInterceptor implements Interceptor {
        public static final GzipRequestInterceptor INSTANCE = new GzipRequestInterceptor();

        private GzipRequestInterceptor() {
        }

        private final RequestBody gzip(final RequestBody body) {
            return new RequestBody() { // from class: com.tesla.oapi.auth.TeslaNetworkClient$GzipRequestInterceptor$gzip$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType */
                public MediaType getF22850a() {
                    return body.getF22850a();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(i sink) {
                    s.k(sink, "sink");
                    i iVarC = c0.c(new t(sink));
                    body.writeTo(iVarC);
                    iVarC.close();
                }
            };
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            s.k(chain, "chain");
            Request request = chain.request();
            if (request.body() == null || request.header("Content-Encoding") != null) {
                return chain.proceed(request);
            }
            if (request.header(TeslaNetworkClient.HEADER_COMPRESSION_DISABLED) != null) {
                return chain.proceed(request.newBuilder().removeHeader(TeslaNetworkClient.HEADER_COMPRESSION_DISABLED).build());
            }
            Request.Builder builderHeader = request.newBuilder().header("Content-Encoding", "gzip");
            String strMethod = request.method();
            RequestBody requestBodyBody = request.body();
            s.h(requestBodyBody);
            return chain.proceed(builderHeader.method(strMethod, gzip(requestBodyBody)).build());
        }
    }

    public /* synthetic */ TeslaNetworkClient(Context context, AuthRepository authRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authRepository);
    }

    private final OkHttpClient buildClient(AuthRepository authRepository, Context context) {
        TeslaLoggingInterceptor teslaLoggingInterceptor = new TeslaLoggingInterceptor(oapiLogger);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderAuthenticator = builder.connectTimeout(0L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).cookieJar(new n()).addInterceptor(new DefaultHeadersInjectionInterceptor()).addInterceptor(teslaLoggingInterceptor).authenticator(new TeslaAuthenticator(authRepository));
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof InterceptorProvider) {
            Iterator<T> it = ((InterceptorProvider) applicationContext).provideInterceptor().iterator();
            while (it.hasNext()) {
                builderAuthenticator.addInterceptor((Interceptor) it.next());
            }
        }
        builderAuthenticator.addInterceptor(GzipRequestInterceptor.INSTANCE);
        builderAuthenticator.retryOnConnectionFailure(false);
        return builderAuthenticator.build();
    }

    public static final String getHermesURL() {
        return INSTANCE.getHermesURL();
    }

    public static final TeslaNetworkClient getInstance(Context context, AuthRepository authRepository) {
        return INSTANCE.getInstance(context, authRepository);
    }

    public static final String getOwnerapiBaseURL() {
        return INSTANCE.getOwnerapiBaseURL();
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    private TeslaNetworkClient(Context context, AuthRepository authRepository) {
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.client = buildClient(authRepository, applicationContext);
        Context applicationContext2 = context.getApplicationContext();
        s.j(applicationContext2, "getApplicationContext(...)");
        this.appContext = applicationContext2;
    }
}
