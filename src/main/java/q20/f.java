package q20;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u0001:\u0002\u001a\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001a\u0010(\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b\u001a\u0010'R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\"\u00103\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lq20/f;", "Lq20/d;", "Lq20/f$b;", "builder", "<init>", "(Lq20/f$b;)V", "Lq20/h;", "request", "", "userAgent", "Lokhttp3/Request;", DateTokenConverter.CONVERTER_KEY, "(Lq20/h;Ljava/lang/String;)Lokhttp3/Request;", "e", "Ljava/util/concurrent/Callable;", "", "f", "(Lokhttp3/Request;)Ljava/util/concurrent/Callable;", "h", "(Lokhttp3/Request;)I", "", "requests", "Lq20/j;", "b", "(Ljava/util/List;)Ljava/util/List;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Lokhttp3/MediaType;", "Lokhttp3/MediaType;", "JSON", "c", "networkUri", "Lq20/g;", "Lq20/g;", "protocol", "Lq20/c;", "Lq20/c;", "()Lq20/c;", "httpMethod", "I", "emitTimeout", "g", "customPostPath", "", "Z", "serverAnonymisation", "", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "requestHeaders", "Lokhttp3/OkHttpClient;", "j", "Lokhttp3/OkHttpClient;", "client", "Landroid/net/Uri$Builder;", "k", "Landroid/net/Uri$Builder;", "uriBuilder", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "l", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f104672m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MediaType JSON;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String networkUri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g protocol;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c httpMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int emitTimeout;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String customPostPath;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean serverAnonymisation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> requestHeaders;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private OkHttpClient client;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Uri.Builder uriBuilder;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u00002\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010$¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bA\u0010C\"\u0004\bD\u0010ER$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010+\u001a\u0004\bK\u0010-\"\u0004\bL\u0010MR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lq20/f$b;", "", "", "uri", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/lang/String;Landroid/content/Context;)V", "Lq20/c;", "httpMethod", "p", "(Lq20/c;)Lq20/f$b;", "Ljava/util/EnumSet;", "Lz10/j;", "versions", "s", "(Ljava/util/EnumSet;)Lq20/f$b;", "", "emitTimeout", "e", "(I)Lq20/f$b;", "Lokhttp3/OkHttpClient;", "client", "b", "(Lokhttp3/OkHttpClient;)Lq20/f$b;", "Lokhttp3/CookieJar;", "cookieJar", "c", "(Lokhttp3/CookieJar;)Lq20/f$b;", "customPostPath", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lq20/f$b;", "", "serverAnonymisation", "r", "(Z)Lq20/f$b;", "", "requestHeaders", "q", "(Ljava/util/Map;)Lq20/f$b;", "Lq20/f;", "a", "()Lq20/f;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "Lq20/c;", "k", "()Lq20/c;", "setHttpMethod", "(Lq20/c;)V", "Ljava/util/EnumSet;", "n", "()Ljava/util/EnumSet;", "setTlsVersions", "(Ljava/util/EnumSet;)V", "tlsVersions", "I", "j", "()I", "setEmitTimeout", "(I)V", "f", "Lokhttp3/OkHttpClient;", "()Lokhttp3/OkHttpClient;", "setClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/CookieJar;", "h", "()Lokhttp3/CookieJar;", "setCookieJar", "(Lokhttp3/CookieJar;)V", IntegerTokenConverter.CONVERTER_KEY, "setCustomPostPath", "(Ljava/lang/String;)V", "Z", "m", "()Z", "setServerAnonymisation", "(Z)V", "Ljava/util/Map;", "l", "()Ljava/util/Map;", "setRequestHeaders", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private c httpMethod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private EnumSet<z10.j> tlsVersions;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int emitTimeout;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private OkHttpClient client;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private CookieJar cookieJar;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String customPostPath;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean serverAnonymisation;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> requestHeaders;

        public b(String uri, Context context) {
            s.k(uri, "uri");
            s.k(context, "context");
            this.uri = uri;
            this.context = context;
            z10.d dVar = z10.d.f126471a;
            this.httpMethod = dVar.h();
            this.tlsVersions = dVar.p();
            this.emitTimeout = dVar.e();
            this.serverAnonymisation = dVar.m();
        }

        public final f a() {
            return new f(this, null);
        }

        public final b b(OkHttpClient client) {
            this.client = client;
            return this;
        }

        public final b c(CookieJar cookieJar) {
            this.cookieJar = cookieJar;
            return this;
        }

        public final b d(String customPostPath) {
            this.customPostPath = customPostPath;
            return this;
        }

        public final b e(int emitTimeout) {
            this.emitTimeout = emitTimeout;
            return this;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final OkHttpClient getClient() {
            return this.client;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getCustomPostPath() {
            return this.customPostPath;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getEmitTimeout() {
            return this.emitTimeout;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final c getHttpMethod() {
            return this.httpMethod;
        }

        public final Map<String, String> l() {
            return this.requestHeaders;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getServerAnonymisation() {
            return this.serverAnonymisation;
        }

        public final EnumSet<z10.j> n() {
            return this.tlsVersions;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final b p(c httpMethod) {
            s.k(httpMethod, "httpMethod");
            this.httpMethod = httpMethod;
            return this;
        }

        public final b q(Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }

        public final b r(boolean serverAnonymisation) {
            this.serverAnonymisation = serverAnonymisation;
            return this;
        }

        public final b s(EnumSet<z10.j> versions) {
            s.k(versions, "versions");
            this.tlsVersions = versions;
            return this;
        }
    }

    static {
        t0 t0Var = t0.f86535a;
        String str = String.format("snowplow/%s android/%s", Arrays.copyOf(new Object[]{"andr-6.0.3", Build.VERSION.RELEASE}, 2));
        s.j(str, "format(format, *args)");
        f104672m = str;
    }

    public /* synthetic */ f(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    private final Request d(h request, String userAgent) {
        this.uriBuilder.clearQuery();
        Map<String, Object> map = request.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String().getMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            this.uriBuilder.appendQueryParameter(str, obj instanceof String ? (String) obj : null);
        }
        String string = this.uriBuilder.build().toString();
        s.j(string, "uriBuilder.build().toString()");
        Request.Builder builder = new Request.Builder().url(string).header("User-Agent", userAgent).get();
        if (this.serverAnonymisation) {
            builder.header("SP-Anonymous", Marker.ANY_MARKER);
        }
        Map<String, String> map2 = this.requestHeaders;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                builder.header(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    private final Request e(h request, String userAgent) {
        String string = this.uriBuilder.build().toString();
        s.j(string, "uriBuilder.build().toString()");
        Request.Builder builderPost = new Request.Builder().url(string).header("User-Agent", userAgent).post(RequestBody.INSTANCE.create(request.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String().toString(), this.JSON));
        if (this.serverAnonymisation) {
            builderPost.header("SP-Anonymous", Marker.ANY_MARKER);
        }
        Map<String, String> map = this.requestHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderPost.header(entry.getKey(), entry.getValue());
            }
        }
        return builderPost.build();
    }

    private final Callable<Integer> f(final Request request) {
        return new Callable() { // from class: q20.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.g(this.f104669a, request);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer g(f this$0, Request request) {
        s.k(this$0, "this$0");
        s.k(request, "$request");
        return Integer.valueOf(this$0.h(request));
    }

    private final int h(Request request) {
        Call callNewCall;
        try {
            String TAG = this.TAG;
            s.j(TAG, "TAG");
            h20.g.j(TAG, "Sending request: %s", request);
            TrafficStats.setThreadStatsTag(1);
            OkHttpClient okHttpClient = this.client;
            Response responseExecute = (okHttpClient == null || (callNewCall = okHttpClient.newCall(request)) == null) ? null : FirebasePerfOkHttpClient.execute(callNewCall);
            if (responseExecute == null) {
                return -1;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody != null) {
                responseBodyBody.close();
            }
            return responseExecute.code();
        } catch (IOException e11) {
            String TAG2 = this.TAG;
            s.j(TAG2, "TAG");
            h20.g.b(TAG2, "Request sending failed: %s", e11.toString());
            return -1;
        }
    }

    @Override // q20.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public c getHttpMethod() {
        return this.httpMethod;
    }

    @Override // q20.d
    public List<j> b(List<h> requests) {
        int iIntValue;
        s.k(requests, "requests");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (h hVar : requests) {
            String customUserAgent = hVar.getCustomUserAgent();
            if (customUserAgent == null) {
                customUserAgent = f104672m;
            }
            arrayList.add(z10.g.h(f(getHttpMethod() == c.GET ? d(hVar, customUserAgent) : e(hVar, customUserAgent))));
        }
        String TAG = this.TAG;
        s.j(TAG, "TAG");
        h20.g.a(TAG, "Request Futures: %s", Integer.valueOf(arrayList.size()));
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                Object obj = ((Future) arrayList.get(i11)).get(this.emitTimeout, TimeUnit.SECONDS);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = num != null ? num.intValue() : -1;
            } catch (InterruptedException e11) {
                String TAG2 = this.TAG;
                s.j(TAG2, "TAG");
                h20.g.b(TAG2, "Request Future was interrupted: %s", e11.getMessage());
            } catch (ExecutionException e12) {
                String TAG3 = this.TAG;
                s.j(TAG3, "TAG");
                h20.g.b(TAG3, "Request Future failed: %s", e12.getMessage());
            } catch (TimeoutException e13) {
                String TAG4 = this.TAG;
                s.j(TAG4, "TAG");
                h20.g.b(TAG4, "Request Future had a timeout: %s", e13.getMessage());
            }
            h hVar2 = requests.get(i11);
            List<Long> listB = hVar2.b();
            arrayList2.add(new j(iIntValue, hVar2.getOversize(), listB));
            if (hVar2.getOversize()) {
                String TAG5 = this.TAG;
                s.j(TAG5, "TAG");
                h20.g.h(TAG5, "Request is oversized for emitter event IDs: %s", listB.toString());
            }
        }
        return arrayList2;
    }

    @Override // q20.d
    public Uri getUri() {
        Uri uriBuild = this.uriBuilder.clearQuery().build();
        s.j(uriBuild, "uriBuilder.clearQuery().build()");
        return uriBuild;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0069, please report this as an issue */
    private f(b bVar) {
        OkHttpClient client;
        this.TAG = f.class.getSimpleName();
        this.JSON = MediaType.INSTANCE.parse("application/json; charset=utf-8");
        String uri = bVar.getUri();
        Uri uri2 = Uri.parse(bVar.getUri());
        g gVar = g.HTTPS;
        if (uri2.getScheme() == null) {
            uri = "https://" + bVar.getUri();
        } else {
            String scheme = uri2.getScheme();
            if (scheme == null) {
                uri = "https://" + bVar.getUri();
            } else {
                int iHashCode = scheme.hashCode();
                if (iHashCode != 3213448) {
                    if (iHashCode != 99617003 || !scheme.equals("https")) {
                        uri = "https://" + bVar.getUri();
                    }
                } else if (scheme.equals("http")) {
                    gVar = g.HTTP;
                } else {
                    uri = "https://" + bVar.getUri();
                }
            }
        }
        this.networkUri = uri;
        this.protocol = gVar;
        this.httpMethod = bVar.getHttpMethod();
        this.emitTimeout = bVar.getEmitTimeout();
        String customPostPath = bVar.getCustomPostPath();
        this.customPostPath = customPostPath;
        this.serverAnonymisation = bVar.getServerAnonymisation();
        this.requestHeaders = bVar.l();
        z10.h hVar = new z10.h(bVar.n());
        Uri.Builder builderBuildUpon = Uri.parse(uri).buildUpon();
        s.j(builderBuildUpon, "parse(networkUri).buildUpon()");
        this.uriBuilder = builderBuildUpon;
        if (getHttpMethod() == c.GET) {
            builderBuildUpon.appendPath(IntegerTokenConverter.CONVERTER_KEY);
        } else if (customPostPath == null) {
            builderBuildUpon.appendEncodedPath("com.snowplowanalytics.snowplow/tp2");
        } else {
            builderBuildUpon.appendEncodedPath(customPostPath);
        }
        if (bVar.getClient() == null) {
            OkHttpClient.Builder builderSslSocketFactory = new OkHttpClient.Builder().sslSocketFactory(hVar.a(), hVar.b());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder timeout = builderSslSocketFactory.connectTimeout(15L, timeUnit).readTimeout(15L, timeUnit);
            CookieJar cookieJar = bVar.getCookieJar();
            client = timeout.cookieJar(cookieJar == null ? new q20.b(bVar.getContext()) : cookieJar).build();
        } else {
            client = bVar.getClient();
        }
        this.client = client;
    }
}
