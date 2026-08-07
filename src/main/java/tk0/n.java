package tk0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltk0/n;", "", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl0.a<n> f114725b = new dl0.a<>("RequestLifecycle");

    /* JADX INFO: renamed from: tk0.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltk0/n$a;", "Ltk0/i;", "Ljn0/h0;", "Ltk0/n;", "<init>", "()V", "Lkotlin/Function1;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Ltk0/n;", "plugin", "Lok0/a;", "scope", "c", "(Ltk0/n;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<h0, n> {

        /* JADX INFO: renamed from: tk0.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "it", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
        static final class C2454a extends SuspendLambda implements wn0.q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114726n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f114727o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ok0.a f114728p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2454a(ok0.a aVar, Continuation<? super C2454a> continuation) {
                super(3, continuation);
                this.f114728p = aVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                C2454a c2454a = new C2454a(this.f114728p, continuation);
                c2454a.f114727o = eVar;
                return c2454a.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CompletableJob completableJob;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f114726n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableJob = (CompletableJob) this.f114727o;
                    try {
                        t.b(obj);
                        completableJob.complete();
                        return h0.f84049a;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            completableJob.completeExceptionally(th);
                            throw th;
                        } catch (Throwable th3) {
                            completableJob.complete();
                            throw th3;
                        }
                    }
                }
                t.b(obj);
                hl0.e eVar = (hl0.e) this.f114727o;
                CompletableJob completableJobSupervisorJob = SupervisorKt.SupervisorJob(((wk0.c) eVar.b()).getExecutionContext());
                CoroutineContext.Element element = this.f114728p.getCoroutineContext().get(Job.INSTANCE);
                p013kotlin.jvm.internal.s.h(element);
                o.c(completableJobSupervisorJob, (Job) element);
                try {
                    ((wk0.c) eVar.b()).m(completableJobSupervisorJob);
                    this.f114727o = completableJobSupervisorJob;
                    this.f114726n = 1;
                    if (eVar.c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableJob = completableJobSupervisorJob;
                    completableJob.complete();
                    return h0.f84049a;
                } catch (Throwable th4) {
                    th = th4;
                    completableJob = completableJobSupervisorJob;
                    completableJob.completeExceptionally(th);
                    throw th;
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(n plugin, ok0.a scope) {
            p013kotlin.jvm.internal.s.k(plugin, "plugin");
            p013kotlin.jvm.internal.s.k(scope, "scope");
            scope.getRequestPipeline().l(wk0.f.INSTANCE.a(), new C2454a(scope, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n a(wn0.l<? super h0, h0> block) {
            p013kotlin.jvm.internal.s.k(block, "block");
            return new n(null);
        }

        @Override // tk0.i
        public dl0.a<n> getKey() {
            return n.f114725b;
        }

        private Companion() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
