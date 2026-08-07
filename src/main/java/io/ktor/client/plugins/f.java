package io.ktor.client.plugins;

import bl0.i0;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import tk0.i;
import tk0.j;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000b\rB'\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lio/ktor/client/plugins/f;", "", "", "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "f", "()Z", "a", "Ljava/lang/Long;", "b", "c", DateTokenConverter.CONVERTER_KEY, "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl0.a<f> f78495e = new dl0.a<>("TimeoutPlugin");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Long requestTimeoutMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Long connectTimeoutMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Long socketTimeoutMillis;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\fB-\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b\u001e\u0010\u001dR(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lio/ktor/client/plugins/f$a;", "", "", "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "value", "b", "(Ljava/lang/Long;)Ljava/lang/Long;", "Lio/ktor/client/plugins/f;", "a", "()Lio/ktor/client/plugins/f;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Long;", "_requestTimeoutMillis", "_connectTimeoutMillis", "c", "_socketTimeoutMillis", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "g", "(Ljava/lang/Long;)V", "f", "e", "h", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final dl0.a<a> f78500e = new dl0.a<>("TimeoutConfiguration");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Long _requestTimeoutMillis;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Long _connectTimeoutMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Long _socketTimeoutMillis;

        public /* synthetic */ a(Long l11, Long l12, Long l13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : l13);
        }

        private final Long b(Long value) {
            if (value == null || value.longValue() > 0) {
                return value;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }

        public final f a() {
            return new f(get_requestTimeoutMillis(), get_connectTimeoutMillis(), get_socketTimeoutMillis(), null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long get_connectTimeoutMillis() {
            return this._connectTimeoutMillis;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long get_requestTimeoutMillis() {
            return this._requestTimeoutMillis;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long get_socketTimeoutMillis() {
            return this._socketTimeoutMillis;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || a.class != other.getClass()) {
                return false;
            }
            a aVar = (a) other;
            return s.f(this._requestTimeoutMillis, aVar._requestTimeoutMillis) && s.f(this._connectTimeoutMillis, aVar._connectTimeoutMillis) && s.f(this._socketTimeoutMillis, aVar._socketTimeoutMillis);
        }

        public final void f(Long l11) {
            this._connectTimeoutMillis = b(l11);
        }

        public final void g(Long l11) {
            this._requestTimeoutMillis = b(l11);
        }

        public final void h(Long l11) {
            this._socketTimeoutMillis = b(l11);
        }

        public int hashCode() {
            Long l11 = this._requestTimeoutMillis;
            int iHashCode = (l11 != null ? l11.hashCode() : 0) * 31;
            Long l12 = this._connectTimeoutMillis;
            int iHashCode2 = (iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31;
            Long l13 = this._socketTimeoutMillis;
            return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
        }

        public a(Long l11, Long l12, Long l13) {
            this._requestTimeoutMillis = 0L;
            this._connectTimeoutMillis = 0L;
            this._socketTimeoutMillis = 0L;
            g(l11);
            f(l12);
            h(l13);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/plugins/f$b;", "Ltk0/i;", "Lio/ktor/client/plugins/f$a;", "Lio/ktor/client/plugins/f;", "Lrk0/d;", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Lio/ktor/client/plugins/f;", "plugin", "Lok0/a;", "scope", "c", "(Lio/ktor/client/plugins/f;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "", "INFINITE_TIMEOUT_MS", "J", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, f>, rk0.d<a> {

        /* JADX INFO: renamed from: io.ktor.client.plugins.f$b$a */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltk0/q;", "Lwk0/c;", "request", "Lpk0/a;", "<anonymous>", "(Ltk0/q;Lwk0/c;)Lpk0/a;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", i = {}, l = {146, 174}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements q<tk0.q, wk0.c, Continuation<? super pk0.a>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78504n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f78505o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78506p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ f f78507q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ok0.a f78508r;

            /* JADX INFO: renamed from: io.ktor.client.plugins.f$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            static final class C1672a extends u implements l<Throwable, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Job f78509c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1672a(Job job) {
                    super(1);
                    this.f78509c = job;
                }

                public final void a(Throwable th2) {
                    Job.DefaultImpls.cancel$default(this.f78509c, (CancellationException) null, 1, (Object) null);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                    a(th2);
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: io.ktor.client.plugins.f$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            static final class C1673b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f78510n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Long f78511o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ wk0.c f78512p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ Job f78513q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1673b(Long l11, wk0.c cVar, Job job, Continuation<? super C1673b> continuation) {
                    super(2, continuation);
                    this.f78511o = l11;
                    this.f78512p = cVar;
                    this.f78513q = job;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1673b(this.f78511o, this.f78512p, this.f78513q, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f78510n;
                    if (i11 == 0) {
                        t.b(obj);
                        long jLongValue = this.f78511o.longValue();
                        this.f78510n = 1;
                        if (DelayKt.delay(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.f78512p);
                    g.f78514a.trace("Request timeout: " + this.f78512p.getUrl());
                    Job job = this.f78513q;
                    String message = httpRequestTimeoutException.getMessage();
                    s.h(message);
                    JobKt.cancel(job, message, httpRequestTimeoutException);
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C1673b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, ok0.a aVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f78507q = fVar;
                this.f78508r = aVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(tk0.q qVar, wk0.c cVar, Continuation<? super pk0.a> continuation) {
                a aVar = new a(this.f78507q, this.f78508r, continuation);
                aVar.f78505o = qVar;
                aVar.f78506p = cVar;
                return aVar.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f78504n;
                if (i11 != 0) {
                    if (i11 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                tk0.q qVar = (tk0.q) this.f78505o;
                wk0.c cVar = (wk0.c) this.f78506p;
                if (i0.b(cVar.getUrl().getProtocol())) {
                    this.f78505o = null;
                    this.f78504n = 1;
                    Object objA = qVar.a(cVar, this);
                    if (objA != coroutine_suspended) {
                        return objA;
                    }
                } else {
                    cVar.getBody();
                    Companion companion = f.INSTANCE;
                    a aVar = (a) cVar.f(companion);
                    if (aVar == null && this.f78507q.f()) {
                        a aVar2 = new a(null, null, null, 7, null);
                        cVar.l(companion, aVar2);
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        f fVar = this.f78507q;
                        ok0.a aVar3 = this.f78508r;
                        Long l11 = aVar.get_connectTimeoutMillis();
                        if (l11 == null) {
                            l11 = fVar.connectTimeoutMillis;
                        }
                        aVar.f(l11);
                        Long l12 = aVar.get_socketTimeoutMillis();
                        if (l12 == null) {
                            l12 = fVar.socketTimeoutMillis;
                        }
                        aVar.h(l12);
                        Long l13 = aVar.get_requestTimeoutMillis();
                        if (l13 == null) {
                            l13 = fVar.requestTimeoutMillis;
                        }
                        aVar.g(l13);
                        Long l14 = aVar.get_requestTimeoutMillis();
                        if (l14 == null) {
                            l14 = fVar.requestTimeoutMillis;
                        }
                        if (l14 != null && l14.longValue() != Long.MAX_VALUE) {
                            cVar.getExecutionContext().invokeOnCompletion(new C1672a(BuildersKt__Builders_commonKt.launch$default(aVar3, null, null, new C1673b(l14, cVar, cVar.getExecutionContext(), null), 3, null)));
                        }
                    }
                    this.f78505o = null;
                    this.f78504n = 2;
                    Object objA2 = qVar.a(cVar, this);
                    if (objA2 != coroutine_suspended) {
                        return objA2;
                    }
                }
                return coroutine_suspended;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(f plugin, ok0.a scope) {
            s.k(plugin, "plugin");
            s.k(scope, "scope");
            ((e) j.b(scope, e.INSTANCE)).d(new a(plugin, scope, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f a(l<? super a, h0> block) {
            s.k(block, "block");
            a aVar = new a(null, null, null, 7, null);
            block.invoke(aVar);
            return aVar.a();
        }

        @Override // tk0.i
        public dl0.a<f> getKey() {
            return f.f78495e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(Long l11, Long l12, Long l13, DefaultConstructorMarker defaultConstructorMarker) {
        this(l11, l12, l13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        return (this.requestTimeoutMillis == null && this.connectTimeoutMillis == null && this.socketTimeoutMillis == null) ? false : true;
    }

    private f(Long l11, Long l12, Long l13) {
        this.requestTimeoutMillis = l11;
        this.connectTimeoutMillis = l12;
        this.socketTimeoutMillis = l13;
    }
}
