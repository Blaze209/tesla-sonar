package sk0;

import bl0.o;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.utils.io.j;
import java.io.Closeable;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.HttpMethod;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wk0.HttpRequestData;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokio/j;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lwk0/d;", "requestData", "Lio/ktor/utils/io/g;", IntegerTokenConverter.CONVERTER_KEY, "(Lokio/j;Lkotlin/coroutines/CoroutineContext;Lwk0/d;)Lio/ktor/utils/io/g;", "", "cause", "request", "g", "(Ljava/lang/Throwable;Lwk0/d;)Ljava/lang/Throwable;", "callContext", "Lokhttp3/Request;", "f", "(Lwk0/d;Lkotlin/coroutines/CoroutineContext;)Lokhttp3/Request;", "Lcl0/b;", "Lokhttp3/RequestBody;", "e", "(Lcl0/b;Lkotlin/coroutines/CoroutineContext;)Lokhttp3/RequestBody;", "Lokhttp3/OkHttpClient$Builder;", "Lio/ktor/client/plugins/f$a;", "timeoutAttributes", "h", "(Lokhttp3/OkHttpClient$Builder;Lio/ktor/client/plugins/f$a;)Lokhttp3/OkHttpClient$Builder;", "ktor-client-okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<io.ktor.utils.io.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ cl0.b f111374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(cl0.b bVar) {
            super(0);
            this.f111374c = bVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.ktor.utils.io.g invoke() {
            return ((cl0.b.c) this.f111374c).d();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<io.ktor.utils.io.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f111375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ cl0.b f111376d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "Ljn0/h0;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<io.ktor.utils.io.u, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f111377n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f111378o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ cl0.b f111379p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(cl0.b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f111379p = bVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.utils.io.u uVar, Continuation<? super h0> continuation) {
                return ((a) create(uVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f111379p, continuation);
                aVar.f111378o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f111377n;
                if (i11 == 0) {
                    t.b(obj);
                    io.ktor.utils.io.u uVar = (io.ktor.utils.io.u) this.f111378o;
                    cl0.b.d dVar = (cl0.b.d) this.f111379p;
                    j channel = uVar.getChannel();
                    this.f111377n = 1;
                    if (dVar.d(channel, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CoroutineContext coroutineContext, cl0.b bVar) {
            super(0);
            this.f111375c = coroutineContext;
            this.f111376d = bVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.ktor.utils.io.g invoke() {
            return io.ktor.utils.io.p.c(GlobalScope.INSTANCE, this.f111375c, false, new a(this.f111376d, null), 2, null).getChannel();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements p<String, String, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Request.Builder f111380c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Request.Builder builder) {
            super(2);
            this.f111380c = builder;
        }

        public final void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            if (s.f(key, o.f17654a.h())) {
                return;
            }
            this.f111380c.addHeader(key, value);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(String str, String str2) {
            a(str, str2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "Ljn0/h0;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {155}, m = "invokeSuspend", n = {"$this$writer", "$this$use$iv", "source", "lastRead"}, s = {"L$0", "L$1", "L$4", "L$5"})
    static final class d extends SuspendLambda implements p<io.ktor.utils.io.u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111381n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111382o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f111383p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f111384q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f111385r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f111386s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f111387t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ okio.j f111388u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f111389v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ HttpRequestData f111390w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Ljn0/h0;", "a", "(Ljava/nio/ByteBuffer;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<ByteBuffer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l0 f111391c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ okio.j f111392d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ HttpRequestData f111393e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, okio.j jVar, HttpRequestData dVar) {
                super(1);
                this.f111391c = l0Var;
                this.f111392d = jVar;
                this.f111393e = dVar;
            }

            public final void a(ByteBuffer buffer) throws Throwable {
                s.k(buffer, "buffer");
                try {
                    this.f111391c.f86527a = this.f111392d.read(buffer);
                } catch (Throwable th2) {
                    throw e.g(th2, this.f111393e);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(ByteBuffer byteBuffer) throws Throwable {
                a(byteBuffer);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(okio.j jVar, CoroutineContext coroutineContext, HttpRequestData dVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f111388u = jVar;
            this.f111389v = coroutineContext;
            this.f111390w = dVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.u uVar, Continuation<? super h0> continuation) {
            return ((d) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f111388u, this.f111389v, this.f111390w, continuation);
            dVar.f111387t = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:46:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:48:0x0085). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            h0 h0Var;
            io.ktor.utils.io.u uVar;
            CoroutineContext coroutineContext;
            HttpRequestData dVar;
            l0 l0Var;
            okio.j jVar;
            Closeable closeable;
            d dVar2 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = dVar2.f111386s;
            Throwable th3 = null;
            try {
                try {
                    if (i11 == 0) {
                        t.b(obj);
                        io.ktor.utils.io.u uVar2 = (io.ktor.utils.io.u) dVar2.f111387t;
                        okio.j jVar2 = dVar2.f111388u;
                        uVar = uVar2;
                        coroutineContext = dVar2.f111389v;
                        dVar = dVar2.f111390w;
                        l0Var = new l0();
                        jVar = jVar2;
                        closeable = jVar;
                        if (jVar.isOpen() || !JobKt.isActive(coroutineContext) || l0Var.f86527a < 0) {
                            h0Var = h0.f84049a;
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (Throwable th4) {
                                    th3 = th4;
                                }
                            }
                        } else {
                            j channel = uVar.getChannel();
                            a aVar = new a(l0Var, jVar, dVar);
                            dVar2.f111387t = uVar;
                            dVar2.f111381n = closeable;
                            dVar2.f111382o = coroutineContext;
                            dVar2.f111383p = dVar;
                            dVar2.f111384q = jVar;
                            dVar2.f111385r = l0Var;
                            dVar2.f111386s = 1;
                            if (j.a.a(channel, 0, aVar, dVar2, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (th3 == null) {
                            throw th3;
                        }
                        s.h(h0Var);
                        return h0.f84049a;
                    }
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l0 l0Var2 = (l0) dVar2.f111385r;
                    okio.j jVar3 = (okio.j) dVar2.f111384q;
                    HttpRequestData dVar3 = (HttpRequestData) dVar2.f111383p;
                    CoroutineContext coroutineContext2 = (CoroutineContext) dVar2.f111382o;
                    Closeable closeable2 = (Closeable) dVar2.f111381n;
                    io.ktor.utils.io.u uVar3 = (io.ktor.utils.io.u) dVar2.f111387t;
                    t.b(obj);
                    jVar = jVar3;
                    dVar = dVar3;
                    coroutineContext = coroutineContext2;
                    closeable = closeable2;
                    uVar = uVar3;
                    l0Var = l0Var2;
                    uVar.getChannel().flush();
                    dVar2 = this;
                    if (jVar.isOpen()) {
                    }
                    h0Var = h0.f84049a;
                    if (closeable != null) {
                        closeable.close();
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    Closeable closeable3 = closeable;
                    if (closeable3 != null) {
                        try {
                            closeable3.close();
                        } catch (Throwable th6) {
                            jn0.g.a(th2, th6);
                        }
                    }
                    th3 = th2;
                    h0Var = null;
                }
            } catch (Throwable th7) {
                th2 = th7;
            }
            if (th3 == null) {
                throw th3;
            }
            s.h(h0Var);
            return h0.f84049a;
        }
    }

    public static final RequestBody e(cl0.b bVar, CoroutineContext callContext) {
        s.k(bVar, "<this>");
        s.k(callContext, "callContext");
        if (bVar instanceof cl0.b.a) {
            byte[] bArrD = ((cl0.b.a) bVar).getBytes();
            return RequestBody.INSTANCE.create(bArrD, MediaType.INSTANCE.parse(String.valueOf(bVar.getContentType())), 0, bArrD.length);
        }
        if (bVar instanceof cl0.b.c) {
            return new i(bVar.getContentLength(), new a(bVar));
        }
        if (bVar instanceof cl0.b.d) {
            return new i(bVar.getContentLength(), new b(callContext, bVar));
        }
        if (bVar instanceof cl0.b.AbstractC0400b) {
            return RequestBody.INSTANCE.create(new byte[0], (MediaType) null, 0, 0);
        }
        throw new UnsupportedContentTypeException(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Request f(HttpRequestData dVar, CoroutineContext coroutineContext) {
        Request.Builder builder = new Request.Builder();
        builder.url(dVar.getUrl().getUrlString());
        rk0.l.c(dVar.getHeaders(), dVar.getBody(), new c(builder));
        builder.method(dVar.getMethod().getValue(), HttpMethod.permitsRequestBody(dVar.getMethod().getValue()) ? e(dVar.getBody(), coroutineContext) : null);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable g(Throwable th2, HttpRequestData dVar) {
        return th2 instanceof SocketTimeoutException ? io.ktor.client.plugins.g.b(dVar, th2) : th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient.Builder h(OkHttpClient.Builder builder, io.ktor.client.plugins.f.a aVar) {
        Long lC = aVar.get_connectTimeoutMillis();
        if (lC != null) {
            builder.connectTimeout(io.ktor.client.plugins.g.d(lC.longValue()), TimeUnit.MILLISECONDS);
        }
        Long lE = aVar.get_socketTimeoutMillis();
        if (lE != null) {
            long jLongValue = lE.longValue();
            long jD = io.ktor.client.plugins.g.d(jLongValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.readTimeout(jD, timeUnit);
            builder.writeTimeout(io.ktor.client.plugins.g.d(jLongValue), timeUnit);
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.g i(okio.j jVar, CoroutineContext coroutineContext, HttpRequestData dVar) {
        return io.ktor.utils.io.p.c(GlobalScope.INSTANCE, coroutineContext, false, new d(jVar, coroutineContext, dVar, null), 2, null).getChannel();
    }
}
