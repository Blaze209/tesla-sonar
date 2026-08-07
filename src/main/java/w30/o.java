package w30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lw30/o;", "Lw30/c;", "Lw30/j0;", "stripeNetworkClient", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lo30/d;", "logger", "<init>", "(Lw30/j0;Lkotlin/coroutines/CoroutineContext;Lo30/d;)V", "()V", "(Lo30/d;Lkotlin/coroutines/CoroutineContext;)V", "Lw30/b;", "request", "Ljn0/h0;", "a", "(Lw30/b;)V", "Lw30/j0;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "Lo30/d;", DateTokenConverter.CONVERTER_KEY, "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 stripeNetworkClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1", f = "DefaultAnalyticsRequestExecutor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120667n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f120668o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AnalyticsRequest f120670q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AnalyticsRequest analyticsRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f120670q = analyticsRequest;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = o.this.new b(this.f120670q, continuation);
            bVar.f120668o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120667n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    o oVar = o.this;
                    AnalyticsRequest analyticsRequest = this.f120670q;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    j0 j0Var = oVar.stripeNetworkClient;
                    this.f120667n = 1;
                    obj = j0Var.a(analyticsRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                objB = jn0.s.b((l0) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            o oVar2 = o.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                oVar2.logger.error("Exception while making analytics request", thE);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public o(j0 stripeNetworkClient, CoroutineContext workContext, o30.d logger) {
        p013kotlin.jvm.internal.s.k(stripeNetworkClient, "stripeNetworkClient");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
        this.logger = logger;
    }

    @Override // w30.c
    public void a(AnalyticsRequest request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        this.logger.info("Event: " + request.h().get("event"));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new b(request, null), 3, null);
    }

    public o() {
        this(o30.d.INSTANCE.b(), Dispatchers.getIO());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(o30.d logger, CoroutineContext workContext) {
        this(new r(workContext, null, null, 0, logger, 14, null), workContext, logger);
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }
}
