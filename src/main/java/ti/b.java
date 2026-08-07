package ti;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ii.v;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001$B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012.\b\u0002\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R:\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lti/b;", "Lti/g;", "Lti/c;", "webSocketConnection", "Lti/g$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "Lti/f;", "frameType", "<init>", "(Lti/c;Lti/g$b;JLwn0/l;Lti/f;)V", "Ljn0/h0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageMap", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)V", "Lii/v$a;", "D", "Lii/f;", "request", "k", "(Lii/f;)V", "l", "c", "J", "Lwn0/l;", "e", "Lti/f;", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long connectionAcknowledgeTimeoutMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f frameType;

    /* JADX INFO: renamed from: ti.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", i = {0, 0}, l = {31, 38}, m = "connectionInit", n = {"this", "message"}, s = {"L$0", "L$1"})
    static final class C2441b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f114525n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f114526o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114527p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f114529r;

        C2441b(Continuation<? super C2441b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114527p = obj;
            this.f114529r |= Integer.MIN_VALUE;
            return b.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114530n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114530n;
            if (i11 == 0) {
                t.b(obj);
                b bVar = b.this;
                this.f114530n = 1;
                obj = bVar.e(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            Map map = (Map) obj;
            Object obj2 = map.get("type");
            if (s.f(obj2, "connection_ack")) {
                return h0.f84049a;
            }
            if (s.f(obj2, "connection_error")) {
                throw new ApolloNetworkException("Connection error:\n" + map, null, 2, null);
            }
            System.out.println((Object) ("unknown message while waiting for connection_ack: '" + obj2));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(ti.c webSocketConnection, g.b listener, long j11, l<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, f frameType) {
        super(webSocketConnection, listener);
        s.k(webSocketConnection, "webSocketConnection");
        s.k(listener, "listener");
        s.k(connectionPayload, "connectionPayload");
        s.k(frameType, "frameType");
        this.connectionAcknowledgeTimeoutMs = j11;
        this.connectionPayload = connectionPayload;
        this.frameType = frameType;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r5, r8, r0) == r1) goto L25;
     */
    @Override // ti.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ti.b.C2441b
            if (r0 == 0) goto L13
            r0 = r8
            ti.b$b r0 = (ti.b.C2441b) r0
            int r1 = r0.f114529r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114529r = r1
            goto L18
        L13:
            ti.b$b r0 = new ti.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f114527p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f114529r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r8)
            goto L86
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f114526o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.f114525n
            ti.b r4 = (ti.b) r4
            jn0.t.b(r8)
            goto L63
        L40:
            jn0.t.b(r8)
            java.lang.String r8 = "type"
            java.lang.String r2 = "connection_init"
            kotlin.Pair r8 = jn0.x.a(r8, r2)
            kotlin.Pair[] r8 = new p013kotlin.Pair[]{r8}
            java.util.Map r2 = p013kotlin.collections.v0.o(r8)
            wn0.l<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> r8 = r7.connectionPayload
            r0.f114525n = r7
            r0.f114526o = r2
            r0.f114529r = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L62
            goto L85
        L62:
            r4 = r7
        L63:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L6c
            java.lang.String r5 = "payload"
            r2.put(r5, r8)
        L6c:
            ti.f r8 = r4.frameType
            r4.h(r2, r8)
            long r5 = r4.connectionAcknowledgeTimeoutMs
            ti.b$c r8 = new ti.b$c
            r2 = 0
            r8.<init>(r2)
            r0.f114525n = r2
            r0.f114526o = r2
            r0.f114529r = r3
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.withTimeout(r5, r8, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ti.g
    public void d(Map<String, ? extends Object> messageMap) {
        s.k(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        if (s.f(obj, "data")) {
            g.b bVar = getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            Object obj2 = messageMap.get("id");
            s.i(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get(StatusResponse.PAYLOAD);
            s.i(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            bVar.d((String) obj2, (Map) obj3);
            return;
        }
        if (s.f(obj, AnalyticsAttribute.Error)) {
            Object obj4 = messageMap.get("id");
            if (obj4 instanceof String) {
                getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().a((String) obj4, (Map) messageMap.get(StatusResponse.PAYLOAD));
                return;
            } else {
                getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().b((Map) messageMap.get(StatusResponse.PAYLOAD));
                return;
            }
        }
        if (s.f(obj, "complete")) {
            g.b bVar2 = getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            Object obj5 = messageMap.get("id");
            s.i(obj5, "null cannot be cast to non-null type kotlin.String");
            bVar2.c((String) obj5);
        }
    }

    @Override // ti.g
    public <D extends v.a> void k(ii.f<D> request) {
        s.k(request, "request");
        h(v0.m(x.a("type", "start"), x.a("id", request.getRequestUuid().toString()), x.a(StatusResponse.PAYLOAD, ji.b.INSTANCE.j(request))), this.frameType);
    }

    @Override // ti.g
    public <D extends v.a> void l(ii.f<D> request) {
        s.k(request, "request");
        h(v0.m(x.a("type", "stop"), x.a("id", request.getRequestUuid().toString())), this.frameType);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R:\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lti/b$a;", "Lti/g$a;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "Lti/f;", "frameType", "<init>", "(JLwn0/l;Lti/f;)V", "Lti/c;", "webSocketConnection", "Lti/g$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lti/g;", "a", "(Lti/c;Lti/g$b;Lkotlinx/coroutines/CoroutineScope;)Lti/g;", "J", "b", "Lwn0/l;", "c", "Lti/f;", "getName", "()Ljava/lang/String;", "name", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long connectionAcknowledgeTimeoutMs;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final l<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final f frameType;

        /* JADX INFO: renamed from: ti.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2440a extends SuspendLambda implements l<Continuation, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114524n;

            C2440a(Continuation<? super C2440a> continuation) {
                super(1, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new C2440a(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f114524n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return null;
            }

            @Override // wn0.l
            public final Object invoke(Continuation continuation) {
                return ((C2440a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j11, l<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, f frameType) {
            s.k(connectionPayload, "connectionPayload");
            s.k(frameType, "frameType");
            this.connectionAcknowledgeTimeoutMs = j11;
            this.connectionPayload = connectionPayload;
            this.frameType = frameType;
        }

        @Override // ti.g.a
        public g a(ti.c webSocketConnection, g.b listener, CoroutineScope scope) {
            s.k(webSocketConnection, "webSocketConnection");
            s.k(listener, "listener");
            s.k(scope, "scope");
            return new b(webSocketConnection, listener, this.connectionAcknowledgeTimeoutMs, this.connectionPayload, this.frameType);
        }

        @Override // ti.g.a
        public String getName() {
            return "graphql-ws";
        }

        public /* synthetic */ a(long j11, l lVar, f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 10000L : j11, (i11 & 2) != 0 ? new C2440a(null) : lVar, (i11 & 4) != 0 ? f.Text : fVar);
        }
    }
}
