package sk0;

import bl0.v;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import dl0.n;
import fl0.GMTDate;
import java.net.Proxy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okio.j;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wk0.HttpRequestData;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u00105R\"\u0010:\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0006078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lsk0/d;", "Lrk0/b;", "Lsk0/c;", "config", "<init>", "(Lsk0/c;)V", "Lokhttp3/OkHttpClient;", "engine", "Lokhttp3/Request;", "engineRequest", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lwk0/g;", "c0", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwk0/d;", "requestData", "b0", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;Lwk0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Response;", "response", "Lfl0/b;", "requestTime", "", "body", "J", "(Lokhttp3/Response;Lfl0/b;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lwk0/g;", "Lio/ktor/client/plugins/f$a;", "timeoutExtension", "T", "(Lio/ktor/client/plugins/f$a;)Lokhttp3/OkHttpClient;", "data", "o1", "(Lwk0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "close", "()V", "e", "Lsk0/c;", "e0", "()Lsk0/c;", "", "Lrk0/d;", "f", "Ljava/util/Set;", "Z0", "()Ljava/util/Set;", "supportedCapabilities", "g", "Lkotlin/coroutines/CoroutineContext;", "requestsJob", "h", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "clientCache", "j", "c", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends rk0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c f111343j = new c(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Lazy<OkHttpClient> f111344k = m.b(b.f111352c);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sk0.c config;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<rk0.d<?>> supportedCapabilities;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext requestsJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<io.ktor.client.plugins.f.a, OkHttpClient> clientCache;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f111350n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f111350n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineContext.Element element = d.this.requestsJob.get(Job.INSTANCE);
                    s.h(element);
                    this.f111350n = 1;
                    if (((Job) element).join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                Iterator it = d.this.clientCache.entrySet().iterator();
                while (it.hasNext()) {
                    OkHttpClient okHttpClient = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                    okHttpClient.connectionPool().evictAll();
                    okHttpClient.dispatcher().executorService().shutdown();
                }
                return h0.f84049a;
            } catch (Throwable th2) {
                Iterator it2 = d.this.clientCache.entrySet().iterator();
                while (it2.hasNext()) {
                    OkHttpClient okHttpClient2 = (OkHttpClient) ((Map.Entry) it2.next()).getValue();
                    okHttpClient2.connectionPool().evictAll();
                    okHttpClient2.dispatcher().executorService().shutdown();
                }
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/OkHttpClient;", "b", "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<OkHttpClient> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f111352c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            return new OkHttpClient.Builder().build();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsk0/d$c;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClientPrototype$delegate", "Lkotlin/Lazy;", "a", "()Lokhttp3/OkHttpClient;", "okHttpClientPrototype", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OkHttpClient a() {
            return (OkHttpClient) d.f111344k.getValue();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: sk0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C2376d extends p013kotlin.jvm.internal.p implements l<io.ktor.client.plugins.f.a, OkHttpClient> {
        C2376d(Object obj) {
            super(1, obj, d.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke(io.ktor.client.plugins.f.a aVar) {
            return ((d) this.receiver).T(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/OkHttpClient;", "it", "Ljn0/h0;", "a", "(Lokhttp3/OkHttpClient;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<OkHttpClient, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f111353c = new e();

        e() {
            super(1);
        }

        public final void a(OkHttpClient it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(OkHttpClient okHttpClient) {
            a(okHttpClient);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0}, l = {61, 68, 70}, m = "execute", n = {"this", "data"}, s = {"L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111354n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111355o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f111356p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f111358r;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111356p = obj;
            this.f111358r |= Integer.MIN_VALUE;
            return d.this.o1(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {103}, m = "executeHttpRequest", n = {"this", "callContext", "requestData", "requestTime"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111359n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111360o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f111361p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f111362q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f111363r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f111365t;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111363r = obj;
            this.f111365t |= Integer.MIN_VALUE;
            return d.this.b0(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ResponseBody f111366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ResponseBody responseBody) {
            super(1);
            this.f111366c = responseBody;
        }

        public final void a(Throwable th2) {
            ResponseBody responseBody = this.f111366c;
            if (responseBody != null) {
                responseBody.close();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {92}, m = "executeWebSocketRequest", n = {"this", "callContext", "requestTime", "session"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111367n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111368o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f111369p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f111370q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f111371r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f111373t;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111371r = obj;
            this.f111373t |= Integer.MIN_VALUE;
            return d.this.c0(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sk0.c config) {
        super("ktor-okhttp");
        s.k(config, "config");
        this.config = config;
        this.supportedCapabilities = d1.i(io.ktor.client.plugins.f.INSTANCE, vk0.a.f119531a);
        this.clientCache = dl0.g.a(new C2376d(this), e.f111353c, getConfig().getClientCacheSize());
        CoroutineContext.Element element = super.getCoroutineContext().get(Job.INSTANCE);
        s.h(element);
        CoroutineContext coroutineContextA = n.a((Job) element);
        this.requestsJob = coroutineContextA;
        this.coroutineContext = super.getCoroutineContext().plus(coroutineContextA);
        BuildersKt.launch(GlobalScope.INSTANCE, super.getCoroutineContext(), CoroutineStart.ATOMIC, new a(null));
    }

    private final wk0.g J(Response response, GMTDate requestTime, Object body, CoroutineContext callContext) {
        return new wk0.g(new v(response.code(), response.message()), requestTime, sk0.h.c(response.headers()), sk0.h.d(response.protocol()), body, callContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient T(io.ktor.client.plugins.f.a timeoutExtension) {
        OkHttpClient preconfigured = getConfig().getPreconfigured();
        if (preconfigured == null) {
            preconfigured = f111343j.a();
        }
        OkHttpClient.Builder builderNewBuilder = preconfigured.newBuilder();
        builderNewBuilder.dispatcher(new Dispatcher());
        getConfig().d().invoke(builderNewBuilder);
        Proxy proxy = getConfig().getProxy();
        if (proxy != null) {
            builderNewBuilder.proxy(proxy);
        }
        if (timeoutExtension != null) {
            sk0.e.h(builderNewBuilder, timeoutExtension);
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b0(OkHttpClient okHttpClient, Request request, CoroutineContext coroutineContext, HttpRequestData dVar, Continuation<? super wk0.g> continuation) {
        g gVar;
        GMTDate bVar;
        d dVar2;
        io.ktor.utils.io.g gVarA;
        j jVarSource;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f111365t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f111365t = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f111363r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f111365t;
        if (i12 == 0) {
            t.b(obj);
            GMTDate bVarB = fl0.a.b(null, 1, null);
            gVar.f111359n = this;
            gVar.f111360o = coroutineContext;
            gVar.f111361p = dVar;
            gVar.f111362q = bVarB;
            gVar.f111365t = 1;
            Object objB = sk0.h.b(okHttpClient, request, dVar, gVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objB;
            bVar = bVarB;
            dVar2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (GMTDate) gVar.f111362q;
            dVar = (HttpRequestData) gVar.f111361p;
            coroutineContext = (CoroutineContext) gVar.f111360o;
            dVar2 = (d) gVar.f111359n;
            t.b(obj);
        }
        Response response = (Response) obj;
        ResponseBody responseBodyBody = response.body();
        CoroutineContext.Element element = coroutineContext.get(Job.INSTANCE);
        s.h(element);
        ((Job) element).invokeOnCompletion(new h(responseBodyBody));
        if (responseBodyBody == null || (jVarSource = responseBodyBody.getSource()) == null || (gVarA = sk0.e.i(jVarSource, coroutineContext, dVar)) == null) {
            gVarA = io.ktor.utils.io.g.INSTANCE.a();
        }
        return dVar2.J(response, bVar, gVarA, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c0(OkHttpClient okHttpClient, Request request, CoroutineContext coroutineContext, Continuation<? super wk0.g> continuation) {
        i iVar;
        d dVar;
        GMTDate bVar;
        sk0.f fVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f111373t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f111373t = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f111371r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f111373t;
        if (i12 == 0) {
            t.b(obj);
            GMTDate bVarB = fl0.a.b(null, 1, null);
            WebSocket.Factory webSocketFactory = getConfig().getWebSocketFactory();
            if (webSocketFactory == null) {
                webSocketFactory = okHttpClient;
            }
            sk0.f fVar2 = new sk0.f(okHttpClient, webSocketFactory, request, coroutineContext);
            fVar2.e();
            CompletableDeferred<Response> completableDeferredC = fVar2.c();
            iVar.f111367n = this;
            iVar.f111368o = coroutineContext;
            iVar.f111369p = bVarB;
            iVar.f111370q = fVar2;
            iVar.f111373t = 1;
            Object objAwait = completableDeferredC.await(iVar);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            dVar = this;
            bVar = bVarB;
            obj = objAwait;
            fVar = fVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (sk0.f) iVar.f111370q;
            bVar = (GMTDate) iVar.f111369p;
            coroutineContext = (CoroutineContext) iVar.f111368o;
            dVar = (d) iVar.f111367n;
            t.b(obj);
        }
        return dVar.J((Response) obj, bVar, fVar, coroutineContext);
    }

    @Override // rk0.b, rk0.a
    public Set<rk0.d<?>> Z0() {
        return this.supportedCapabilities;
    }

    @Override // rk0.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        CoroutineContext.Element element = this.requestsJob.get(Job.INSTANCE);
        s.i(element, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((CompletableJob) element).complete();
    }

    @Override // rk0.a
    /* JADX INFO: renamed from: e0, reason: from getter */
    public sk0.c getConfig() {
        return this.config;
    }

    @Override // rk0.b, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // rk0.a
    public Object o1(HttpRequestData dVar, Continuation<? super wk0.g> continuation) {
        f fVar;
        d dVar2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f111358r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f111358r = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objB = fVar2.f111356p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar2.f111358r;
        if (i12 == 0) {
            t.b(objB);
            fVar2.f111354n = this;
            fVar2.f111355o = dVar;
            fVar2.f111358r = 1;
            objB = rk0.l.b(fVar2);
            if (objB != coroutine_suspended) {
                dVar2 = this;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                t.b(objB);
                return objB;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objB);
            return objB;
        }
        dVar = (HttpRequestData) fVar2.f111355o;
        dVar2 = (d) fVar2.f111354n;
        t.b(objB);
        HttpRequestData dVar3 = dVar;
        CoroutineContext coroutineContext = (CoroutineContext) objB;
        Request requestF = sk0.e.f(dVar3, coroutineContext);
        OkHttpClient okHttpClient = dVar2.clientCache.get(dVar3.c(io.ktor.client.plugins.f.INSTANCE));
        if (okHttpClient == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        if (wk0.e.b(dVar3)) {
            fVar2.f111354n = null;
            fVar2.f111355o = null;
            fVar2.f111358r = 2;
            Object objC0 = dVar2.c0(okHttpClient, requestF, coroutineContext, fVar2);
            if (objC0 != coroutine_suspended) {
                return objC0;
            }
        } else {
            fVar2.f111354n = null;
            fVar2.f111355o = null;
            fVar2.f111358r = 3;
            Object objB0 = dVar2.b0(okHttpClient, requestF, coroutineContext, dVar3, fVar2);
            if (objB0 != coroutine_suspended) {
                return objB0;
            }
        }
        return coroutine_suspended;
    }
}
