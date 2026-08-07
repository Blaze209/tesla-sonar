package sk0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010#\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b+\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101R&\u0010B\u001a\b\u0012\u0004\u0012\u0002060=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bA\u0010&\u001a\u0004\b0\u0010@¨\u0006C"}, d2 = {"Lsk0/f;", "", "Lokhttp3/WebSocketListener;", "Lokhttp3/OkHttpClient;", "engine", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "Lokhttp3/Request;", "engineRequest", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/WebSocket$Factory;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;)V", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Ljn0/h0;", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "Lokio/k;", "bytes", "onMessage", "(Lokhttp3/WebSocket;Lokio/k;)V", "", "text", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "", "code", AnalyticsAttribute.Reason, "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosing", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "e", "()V", "a", "Lokhttp3/OkHttpClient;", "b", "Lokhttp3/WebSocket$Factory;", "c", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/CompletableDeferred;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CompletableDeferred;", "self", "()Lkotlinx/coroutines/CompletableDeferred;", "originResponse", "Lkotlinx/coroutines/channels/Channel;", "Lpl0/b;", "f", "Lkotlinx/coroutines/channels/Channel;", "_incoming", "Lpl0/a;", "g", "_closeReason", "Lkotlinx/coroutines/channels/SendChannel;", "h", "Lkotlinx/coroutines/channels/SendChannel;", "()Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing$annotations", "outgoing", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends WebSocketListener implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient engine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WebSocket.Factory webSocketFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CompletableDeferred<f> self;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CompletableDeferred<Response> originResponse;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Channel<pl0.b> _incoming;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CompletableDeferred<pl0.a> _closeReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SendChannel<pl0.b> outgoing;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ActorScope;", "Lpl0/b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ActorScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", i = {0, 1, 1}, l = {62, 66}, m = "invokeSuspend", n = {"$this$actor", "websocket", "closeReason"}, s = {"L$0", "L$0", "L$1"})
    static final class a extends SuspendLambda implements p<ActorScope<pl0.b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111402n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111403o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f111404p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f111405q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Request f111407s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Request request, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f111407s = request;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ActorScope<pl0.b> actorScope, Continuation<? super h0> continuation) {
            return ((a) create(actorScope, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = f.this.new a(this.f111407s, continuation);
            aVar.f111405q = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        
            if (r10 == r0) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:24:0x0083). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sk0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(OkHttpClient engine, WebSocket.Factory webSocketFactory, Request engineRequest, CoroutineContext coroutineContext) {
        s.k(engine, "engine");
        s.k(webSocketFactory, "webSocketFactory");
        s.k(engineRequest, "engineRequest");
        s.k(coroutineContext, "coroutineContext");
        this.engine = engine;
        this.webSocketFactory = webSocketFactory;
        this.coroutineContext = coroutineContext;
        this.self = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.originResponse = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this._incoming = ChannelKt.Channel$default(0, null, null, 7, null);
        this._closeReason = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.outgoing = ActorKt.actor$default(this, null, 0, null, null, new a(engineRequest, null), 15, null);
    }

    public final CompletableDeferred<Response> c() {
        return this.originResponse;
    }

    public SendChannel<pl0.b> d() {
        return this.outgoing;
    }

    public final void e() {
        this.self.complete(this);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int code, String reason) {
        Object objValueOf;
        s.k(webSocket, "webSocket");
        s.k(reason, "reason");
        super.onClosed(webSocket, code, reason);
        short s11 = (short) code;
        this._closeReason.complete(new pl0.a(s11, reason));
        SendChannel.DefaultImpls.close$default(this._incoming, null, 1, null);
        SendChannel<pl0.b> sendChannelD = d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebSocket session closed with code ");
        pl0.a.EnumC2192a enumC2192aA = pl0.a.EnumC2192a.INSTANCE.a(s11);
        if (enumC2192aA == null || (objValueOf = enumC2192aA.toString()) == null) {
            objValueOf = Integer.valueOf(code);
        }
        sb2.append(objValueOf);
        sb2.append(CoreConstants.DOT);
        sendChannelD.close(new CancellationException(sb2.toString()));
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int code, String reason) {
        s.k(webSocket, "webSocket");
        s.k(reason, "reason");
        super.onClosing(webSocket, code, reason);
        short s11 = (short) code;
        this._closeReason.complete(new pl0.a(s11, reason));
        try {
            ChannelsKt.trySendBlocking(d(), new pl0.b.C2194b(new pl0.a(s11, reason)));
        } catch (Throwable unused) {
        }
        SendChannel.DefaultImpls.close$default(this._incoming, null, 1, null);
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable t11, Response response) {
        s.k(webSocket, "webSocket");
        s.k(t11, "t");
        super.onFailure(webSocket, t11, response);
        this._closeReason.completeExceptionally(t11);
        this.originResponse.completeExceptionally(t11);
        this._incoming.close(t11);
        d().close(t11);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, k bytes) {
        s.k(webSocket, "webSocket");
        s.k(bytes, "bytes");
        super.onMessage(webSocket, bytes);
        ChannelsKt.trySendBlocking(this._incoming, new pl0.b.a(true, bytes.J()));
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        s.k(webSocket, "webSocket");
        s.k(response, "response");
        super.onOpen(webSocket, response);
        this.originResponse.complete(response);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String text) {
        s.k(webSocket, "webSocket");
        s.k(text, "text");
        super.onMessage(webSocket, text);
        Channel<pl0.b> channel = this._incoming;
        byte[] bytes = text.getBytes(p013kotlin.text.d.UTF_8);
        s.j(bytes, "getBytes(...)");
        ChannelsKt.trySendBlocking(channel, new pl0.b.d(true, bytes));
    }
}
