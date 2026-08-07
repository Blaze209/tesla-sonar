package rk0;

import io.ktor.client.engine.ClientEngineClosedException;
import java.io.Closeable;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wk0.HttpRequestData;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000b\u0010\u001d\u001a\u00020\u001c8BX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lrk0/a;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lwk0/d;", "data", "Lwk0/g;", "o1", "(Lwk0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lok0/a;", "client", "Ljn0/h0;", "j3", "(Lok0/a;)V", "requestData", "checkExtensions", "(Lwk0/d;)V", "executeWithinCallContext", "(Lwk0/d;)Lwk0/g;", "Lrk0/f;", "getConfig", "()Lrk0/f;", "config", "", "Lrk0/d;", "Z0", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a extends CoroutineScope, Closeable {

    /* JADX INFO: renamed from: rk0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C2307a {

        /* JADX INFO: renamed from: rk0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", i = {0, 0}, l = {91, 100}, m = "executeWithinCallContext", n = {"$this", "requestData"}, s = {"L$0", "L$1"})
        static final class C2308a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f108511n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f108512o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f108513p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f108514q;

            C2308a(Continuation<? super C2308a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f108513p = obj;
                this.f108514q |= Integer.MIN_VALUE;
                return C2307a.e(null, null, this);
            }
        }

        /* JADX INFO: renamed from: rk0.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lwk0/g;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lwk0/g;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super wk0.g>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f108515n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ a f108516o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ HttpRequestData f108517p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, HttpRequestData dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f108516o = aVar;
                this.f108517p = dVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f108516o, this.f108517p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f108515n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                if (C2307a.f(this.f108516o)) {
                    throw new ClientEngineClosedException(null, 1, null);
                }
                a aVar = this.f108516o;
                HttpRequestData dVar = this.f108517p;
                this.f108515n = 1;
                Object objO1 = aVar.o1(dVar, this);
                return objO1 == coroutine_suspended ? coroutine_suspended : objO1;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super wk0.g> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: rk0.a$a$c */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "content", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", i = {0, 0}, l = {70, 82}, m = "invokeSuspend", n = {"$this$intercept", "requestData"}, s = {"L$0", "L$1"})
        static final class c extends SuspendLambda implements q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f108518n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f108519o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f108520p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ ok0.a f108521q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f108522r;

            /* JADX INFO: renamed from: rk0.a$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            static final class C2309a extends u implements wn0.l<Throwable, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ok0.a f108523c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ yk0.c f108524d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2309a(ok0.a aVar, yk0.c cVar) {
                    super(1);
                    this.f108523c = aVar;
                    this.f108524d = cVar;
                }

                public final void a(Throwable th2) {
                    if (th2 != null) {
                        this.f108523c.getMonitor().a(p028zk0.b.c(), this.f108524d);
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                    a(th2);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ok0.a aVar, a aVar2, Continuation<? super c> continuation) {
                super(3, continuation);
                this.f108521q = aVar;
                this.f108522r = aVar2;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                c cVar = new c(this.f108521q, this.f108522r, continuation);
                cVar.f108519o = eVar;
                cVar.f108520p = obj;
                return cVar.invokeSuspend(h0.f84049a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
            
                if (r3.d(r5, r9) == r0) goto L23;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rk0.a.C2307a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(a aVar, HttpRequestData dVar) {
            for (d<?> dVar2 : dVar.g()) {
                if (!aVar.Z0().contains(dVar2)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + dVar2).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static Object e(a aVar, HttpRequestData dVar, Continuation<? super wk0.g> continuation) {
            C2308a c2308a;
            if (continuation instanceof C2308a) {
                c2308a = (C2308a) continuation;
                int i11 = c2308a.f108514q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c2308a.f108514q = i11 - Integer.MIN_VALUE;
                } else {
                    c2308a = new C2308a(continuation);
                }
            } else {
                c2308a = new C2308a(continuation);
            }
            Object objB = c2308a.f108513p;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = c2308a.f108514q;
            if (i12 == 0) {
                t.b(objB);
                Job jobD = dVar.getExecutionContext();
                c2308a.f108511n = aVar;
                c2308a.f108512o = dVar;
                c2308a.f108514q = 1;
                objB = h.b(aVar, jobD, c2308a);
                if (objB != coroutine_suspended) {
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(objB);
                return objB;
            }
            dVar = (HttpRequestData) c2308a.f108512o;
            aVar = (a) c2308a.f108511n;
            t.b(objB);
            a aVar2 = aVar;
            CoroutineContext coroutineContext = (CoroutineContext) objB;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(aVar2, coroutineContext.plus(new i(coroutineContext)), null, new b(aVar2, dVar, null), 2, null);
            c2308a.f108511n = null;
            c2308a.f108512o = null;
            c2308a.f108514q = 2;
            Object objAwait = deferredAsync$default.await(c2308a);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean f(a aVar) {
            Job job = (Job) aVar.getCoroutineContext().get(Job.INSTANCE);
            return !(job != null ? job.isActive() : false);
        }

        public static Set<d<?>> g(a aVar) {
            return d1.d();
        }

        public static void h(a aVar, ok0.a client) {
            s.k(client, "client");
            client.getSendPipeline().l(wk0.h.INSTANCE.a(), new c(client, aVar, null));
        }
    }

    Set<d<?>> Z0();

    f getConfig();

    void j3(ok0.a client);

    Object o1(HttpRequestData dVar, Continuation<? super wk0.g> continuation);
}
