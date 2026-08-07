package ti;

import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import ji.HttpHeader;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J&\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lti/a;", "Lti/d;", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "<init>", "(Lokhttp3/WebSocket$Factory;)V", "()V", "", ImagesContract.URL, "", "Lji/d;", "headers", "Lti/c;", "a", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/WebSocket$Factory;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements ti.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WebSocket.Factory webSocketFactory;

    /* JADX INFO: renamed from: ti.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", i = {0, 0}, l = {74}, m = "open", n = {"messageChannel", "webSocket"}, s = {"L$0", "L$1"})
    static final class C2439a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f114508n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f114509o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114510p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f114512r;

        C2439a(Continuation<? super C2439a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114510p = obj;
            this.f114512r |= Integer.MIN_VALUE;
            return a.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebSocket f114513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WebSocket webSocket) {
            super(1);
            this.f114513c = webSocket;
        }

        public final void a(Throwable th2) {
            this.f114513c.close(1001, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"ti/a$d", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Ljn0/h0;", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "", "text", "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "Lokio/k;", "bytes", "(Lokhttp3/WebSocket;Lokio/k;)V", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "code", AnalyticsAttribute.Reason, "onClosing", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosed", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends WebSocketListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CompletableDeferred<h0> f114516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pi.b<String> f114517b;

        d(CompletableDeferred<h0> completableDeferred, pi.b<String> bVar) {
            this.f114516a = completableDeferred;
            this.f114517b = bVar;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int code, String reason) {
            s.k(webSocket, "webSocket");
            s.k(reason, "reason");
            SendChannel.DefaultImpls.close$default(this.f114517b, null, 1, null);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int code, String reason) {
            s.k(webSocket, "webSocket");
            s.k(reason, "reason");
            this.f114516a.complete(h0.f84049a);
            this.f114517b.close(new ApolloWebSocketClosedException(code, reason, null, 4, null));
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t11, Response response) {
            s.k(webSocket, "webSocket");
            s.k(t11, "t");
            this.f114516a.complete(h0.f84049a);
            this.f114517b.close(t11);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            s.k(webSocket, "webSocket");
            s.k(text, "text");
            this.f114517b.mo85trySendJP2dKIU(text);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            s.k(webSocket, "webSocket");
            s.k(response, "response");
            this.f114516a.complete(h0.f84049a);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, k bytes) {
            s.k(webSocket, "webSocket");
            s.k(bytes, "bytes");
            this.f114517b.mo85trySendJP2dKIU(bytes.K());
        }
    }

    public a(WebSocket.Factory webSocketFactory) {
        s.k(webSocketFactory, "webSocketFactory");
        this.webSocketFactory = webSocketFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ti.d
    public Object a(String str, List<HttpHeader> list, Continuation<? super ti.c> continuation) {
        C2439a c2439a;
        WebSocket webSocketNewWebSocket;
        pi.b bVar;
        if (continuation instanceof C2439a) {
            c2439a = (C2439a) continuation;
            int i11 = c2439a.f114512r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2439a.f114512r = i11 - Integer.MIN_VALUE;
            } else {
                c2439a = new C2439a(continuation);
            }
        } else {
            c2439a = new C2439a(continuation);
        }
        Object obj = c2439a.f114510p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c2439a.f114512r;
        if (i12 == 0) {
            t.b(obj);
            pi.b bVar2 = new pi.b(ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null));
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            webSocketNewWebSocket = this.webSocketFactory.newWebSocket(new Request.Builder().url(str).headers(ri.b.a(list)).build(), new d(completableDeferredCompletableDeferred$default, bVar2));
            c2439a.f114508n = bVar2;
            c2439a.f114509o = webSocketNewWebSocket;
            c2439a.f114512r = 1;
            if (completableDeferredCompletableDeferred$default.await(c2439a) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = bVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webSocketNewWebSocket = (WebSocket) c2439a.f114509o;
            bVar = (pi.b) c2439a.f114508n;
            t.b(obj);
        }
        bVar.a(new b(webSocketNewWebSocket));
        return new c(bVar, webSocketNewWebSocket);
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ti/a$c", "Lti/c;", "", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/k;", "data", "Ljn0/h0;", "send", "(Lokio/k;)V", InquiryField.StringField.TYPE, "(Ljava/lang/String;)V", "close", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements ti.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pi.b<String> f114514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebSocket f114515b;

        c(pi.b<String> bVar, WebSocket webSocket) {
            this.f114514a = bVar;
            this.f114515b = webSocket;
        }

        @Override // ti.c
        public void close() {
            this.f114515b.close(1000, null);
        }

        @Override // ti.c
        public Object receive(Continuation<? super String> continuation) {
            return this.f114514a.receive(continuation);
        }

        @Override // ti.c
        public void send(k data) {
            s.k(data, "data");
            if (this.f114515b.send(data)) {
                return;
            }
            SendChannel.DefaultImpls.close$default(this.f114514a, null, 1, null);
        }

        @Override // ti.c
        public void send(String string) {
            s.k(string, "string");
            if (this.f114515b.send(string)) {
                return;
            }
            SendChannel.DefaultImpls.close$default(this.f114514a, null, 1, null);
        }
    }

    public a() {
        this(new OkHttpClient());
    }
}
