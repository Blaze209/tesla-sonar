package ok0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import rk0.f;
import tk0.j;
import tk0.k;
import tk0.n;
import wk0.h;
import wn0.l;
import wn0.q;
import yk0.HttpResponseContainer;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010G\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010L\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010\u001e\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Lok0/a;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lrk0/a;", "engine", "Lok0/b;", "Lrk0/f;", "userConfig", "<init>", "(Lrk0/a;Lok0/b;)V", "", "manageEngine", "(Lrk0/a;Lok0/b;Z)V", "Lwk0/c;", "builder", "Lpk0/a;", "c", "(Lwk0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "Lrk0/a;", "o", "()Lrk0/a;", "b", "Lok0/b;", "Z", "Lkotlinx/coroutines/CompletableJob;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CompletableJob;", "clientJob", "Lkotlin/coroutines/CoroutineContext;", "e", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lwk0/f;", "f", "Lwk0/f;", "B", "()Lwk0/f;", "requestPipeline", "Lyk0/f;", "g", "Lyk0/f;", "C", "()Lyk0/f;", "responsePipeline", "Lwk0/h;", "h", "Lwk0/h;", "H", "()Lwk0/h;", "sendPipeline", "Lyk0/b;", IntegerTokenConverter.CONVERTER_KEY, "Lyk0/b;", "t", "()Lyk0/b;", "receivePipeline", "Ldl0/b;", "j", "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "k", "Lrk0/f;", "getEngineConfig", "()Lrk0/f;", "engineConfig", "Lal0/b;", "l", "Lal0/b;", "p", "()Lal0/b;", "monitor", "m", "n", "()Lok0/b;", "config", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements CoroutineScope, Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f97863n = AtomicIntegerFieldUpdater.newUpdater(a.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rk0.a engine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ok0.b<? extends f> userConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean manageEngine;
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob clientJob;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wk0.f requestPipeline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yk0.f responsePipeline;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h sendPipeline;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yk0.b receivePipeline;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final dl0.b attributes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f engineConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final al0.b monitor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ok0.b<f> config;

    /* JADX INFO: renamed from: ok0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class C2105a extends u implements l<Throwable, h0> {
        C2105a() {
            super(1);
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                CoroutineScopeKt.cancel$default(a.this.getEngine(), null, 1, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "call", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {144, 146}, m = "invokeSuspend", n = {"$this$intercept", "call"}, s = {"L$0", "L$1"})
    static final class b extends SuspendLambda implements q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97878n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f97879o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f97880p;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f97879o = eVar;
            bVar.f97880p = obj;
            return bVar.invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r3.d(r1, r8) == r0) goto L18;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f97878n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r9)
                goto L66
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f97880p
                java.lang.Object r3 = r8.f97879o
                hl0.e r3 = (hl0.e) r3
                jn0.t.b(r9)
                goto L50
            L24:
                jn0.t.b(r9)
                java.lang.Object r9 = r8.f97879o
                hl0.e r9 = (hl0.e) r9
                java.lang.Object r1 = r8.f97880p
                boolean r4 = r1 instanceof pk0.a
                if (r4 == 0) goto L69
                ok0.a r4 = ok0.a.this
                yk0.b r4 = r4.getReceivePipeline()
                jn0.h0 r5 = jn0.h0.f84049a
                r6 = r1
                pk0.a r6 = (pk0.a) r6
                yk0.c r6 = r6.e()
                r8.f97879o = r9
                r8.f97880p = r1
                r8.f97878n = r3
                java.lang.Object r3 = r4.d(r5, r6, r8)
                if (r3 != r0) goto L4d
                goto L65
            L4d:
                r7 = r3
                r3 = r9
                r9 = r7
            L50:
                yk0.c r9 = (yk0.c) r9
                r4 = r1
                pk0.a r4 = (pk0.a) r4
                r4.j(r9)
                r9 = 0
                r8.f97879o = r9
                r8.f97880p = r9
                r8.f97878n = r2
                java.lang.Object r9 = r3.d(r1, r8)
                if (r9 != r0) goto L66
            L65:
                return r0
            L66:
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            L69:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Error: HttpClientCall expected, but found "
                r9.append(r0)
                r9.append(r1)
                r0 = 40
                r9.append(r0)
                java.lang.Class r0 = r1.getClass()
                co0.d r0 = p013kotlin.jvm.internal.o0.b(r0)
                r9.append(r0)
                java.lang.String r0 = ")."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ok0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lok0/a;", "Ljn0/h0;", "a", "(Lok0/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f97882c = new c();

        c() {
            super(1);
        }

        public final void a(a install) {
            s.k(install, "$this$install");
            tk0.e.b(install);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "Lyk0/d;", "Lpk0/a;", "it", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Lyk0/d;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {177}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class d extends SuspendLambda implements q<hl0.e<HttpResponseContainer, pk0.a>, HttpResponseContainer, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97883n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f97884o;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hl0.e<HttpResponseContainer, pk0.a> eVar, HttpResponseContainer httpResponseContainer, Continuation<? super h0> continuation) {
            d dVar = a.this.new d(continuation);
            dVar.f97884o = eVar;
            return dVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            hl0.e eVar;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f97883n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (hl0.e) this.f97884o;
                try {
                    t.b(obj);
                    return h0.f84049a;
                } catch (Throwable th3) {
                    th2 = th3;
                    a.this.getMonitor().a(p028zk0.b.d(), new p028zk0.f(((pk0.a) eVar.b()).e(), th2));
                    throw th2;
                }
            }
            t.b(obj);
            hl0.e eVar2 = (hl0.e) this.f97884o;
            try {
                this.f97884o = eVar2;
                this.f97883n = 1;
                if (eVar2.c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return h0.f84049a;
            } catch (Throwable th4) {
                eVar = eVar2;
                th2 = th4;
                a.this.getMonitor().a(p028zk0.b.d(), new p028zk0.f(((pk0.a) eVar.b()).e(), th2));
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {191}, m = "execute$ktor_client_core", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f97886n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f97888p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97886n = obj;
            this.f97888p |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    public a(rk0.a engine, ok0.b<? extends f> userConfig) {
        s.k(engine, "engine");
        s.k(userConfig, "userConfig");
        this.engine = engine;
        this.userConfig = userConfig;
        this.closed = 0;
        CompletableJob completableJobJob = JobKt.Job((Job) engine.getCoroutineContext().get(Job.INSTANCE));
        this.clientJob = completableJobJob;
        this.coroutineContext = engine.getCoroutineContext().plus(completableJobJob);
        this.requestPipeline = new wk0.f(userConfig.getDevelopmentMode());
        yk0.f fVar = new yk0.f(userConfig.getDevelopmentMode());
        this.responsePipeline = fVar;
        h hVar = new h(userConfig.getDevelopmentMode());
        this.sendPipeline = hVar;
        this.receivePipeline = new yk0.b(userConfig.getDevelopmentMode());
        this.attributes = dl0.d.a(true);
        this.engineConfig = engine.getConfig();
        this.monitor = new al0.b();
        ok0.b<f> bVar = new ok0.b<>();
        this.config = bVar;
        if (this.manageEngine) {
            completableJobJob.invokeOnCompletion(new C2105a());
        }
        engine.j3(this);
        hVar.l(h.INSTANCE.b(), new b(null));
        ok0.b.i(bVar, n.INSTANCE, null, 2, null);
        ok0.b.i(bVar, tk0.a.INSTANCE, null, 2, null);
        if (userConfig.getUseDefaultTransformers()) {
            bVar.f("DefaultTransformers", c.f97882c);
        }
        ok0.b.i(bVar, io.ktor.client.plugins.e.INSTANCE, null, 2, null);
        ok0.b.i(bVar, io.ktor.client.plugins.b.INSTANCE, null, 2, null);
        if (userConfig.getFollowRedirects()) {
            ok0.b.i(bVar, io.ktor.client.plugins.d.INSTANCE, null, 2, null);
        }
        bVar.j(userConfig);
        if (userConfig.getUseDefaultTransformers()) {
            ok0.b.i(bVar, k.INSTANCE, null, 2, null);
        }
        io.ktor.client.plugins.a.c(bVar);
        bVar.g(this);
        fVar.l(yk0.f.INSTANCE.b(), new d(null));
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final wk0.f getRequestPipeline() {
        return this.requestPipeline;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final yk0.f getResponsePipeline() {
        return this.responsePipeline;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final h getSendPipeline() {
        return this.sendPipeline;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(wk0.c cVar, Continuation<? super pk0.a> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f97888p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f97888p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objD = eVar.f97886n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f97888p;
        if (i12 == 0) {
            t.b(objD);
            this.monitor.a(p028zk0.b.a(), cVar);
            wk0.f fVar = this.requestPipeline;
            Object objD2 = cVar.getBody();
            eVar.f97888p = 1;
            objD = fVar.d(cVar, objD2, eVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objD);
        }
        s.i(objD, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (pk0.a) objD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (f97863n.compareAndSet(this, 0, 1)) {
            dl0.b bVar = (dl0.b) this.attributes.e(j.a());
            Iterator<T> it = bVar.d().iterator();
            while (it.hasNext()) {
                dl0.a aVar = (dl0.a) it.next();
                s.i(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objE = bVar.e(aVar);
                if (objE instanceof Closeable) {
                    ((Closeable) objE).close();
                }
            }
            this.clientJob.complete();
            if (this.manageEngine) {
                this.engine.close();
            }
        }
    }

    public final dl0.b getAttributes() {
        return this.attributes;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final ok0.b<f> n() {
        return this.config;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final rk0.a getEngine() {
        return this.engine;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final al0.b getMonitor() {
        return this.monitor;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final yk0.b getReceivePipeline() {
        return this.receivePipeline;
    }

    public String toString() {
        return "HttpClient[" + this.engine + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(rk0.a engine, ok0.b<? extends f> userConfig, boolean z11) {
        this(engine, userConfig);
        s.k(engine, "engine");
        s.k(userConfig, "userConfig");
        this.manageEngine = z11;
    }
}
