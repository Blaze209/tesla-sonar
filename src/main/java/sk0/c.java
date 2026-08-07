package sk0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lsk0/c;", "Lrk0/f;", "<init>", "()V", "Lkotlin/Function1;", "Lokhttp3/OkHttpClient$Builder;", "Ljn0/h0;", "block", "b", "(Lwn0/l;)V", "c", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/l;", "setConfig$ktor_client_okhttp", "config", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "e", "()Lokhttp3/OkHttpClient;", "setPreconfigured", "(Lokhttp3/OkHttpClient;)V", "preconfigured", "", "I", "()I", "setClientCacheSize", "(I)V", "clientCacheSize", "Lokhttp3/WebSocket$Factory;", "f", "Lokhttp3/WebSocket$Factory;", "()Lokhttp3/WebSocket$Factory;", "setWebSocketFactory", "(Lokhttp3/WebSocket$Factory;)V", "webSocketFactory", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends rk0.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private OkHttpClient preconfigured;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private WebSocket.Factory webSocketFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l<? super OkHttpClient.Builder, h0> config = a.f111340c;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int clientCacheSize = 10;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "Ljn0/h0;", "a", "(Lokhttp3/OkHttpClient$Builder;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<OkHttpClient.Builder, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f111340c = new a();

        a() {
            super(1);
        }

        public final void a(OkHttpClient.Builder builder) {
            s.k(builder, "$this$null");
            builder.followRedirects(false);
            builder.followSslRedirects(false);
            builder.retryOnConnectionFailure(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(OkHttpClient.Builder builder) {
            a(builder);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "Ljn0/h0;", "a", "(Lokhttp3/OkHttpClient$Builder;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<OkHttpClient.Builder, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<OkHttpClient.Builder, h0> f111341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<OkHttpClient.Builder, h0> f111342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super OkHttpClient.Builder, h0> lVar, l<? super OkHttpClient.Builder, h0> lVar2) {
            super(1);
            this.f111341c = lVar;
            this.f111342d = lVar2;
        }

        public final void a(OkHttpClient.Builder builder) {
            s.k(builder, "$this$null");
            this.f111341c.invoke(builder);
            this.f111342d.invoke(builder);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(OkHttpClient.Builder builder) {
            a(builder);
            return h0.f84049a;
        }
    }

    public final void b(l<? super OkHttpClient.Builder, h0> block) {
        s.k(block, "block");
        this.config = new b(this.config, block);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getClientCacheSize() {
        return this.clientCacheSize;
    }

    public final l<OkHttpClient.Builder, h0> d() {
        return this.config;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OkHttpClient getPreconfigured() {
        return this.preconfigured;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final WebSocket.Factory getWebSocketFactory() {
        return this.webSocketFactory;
    }
}
