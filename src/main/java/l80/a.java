package l80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import f30.PaymentConfiguration;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.l;
import wn0.p;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\"\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Ll80/a;", "Ll80/c;", "Lz60/g;", "stripeRepository", "Ljavax/inject/Provider;", "Lf30/o;", "paymentConfigProvider", "Ll80/c$a;", "config", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lz60/g;Ljavax/inject/Provider;Ll80/c$a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "force", "Ljn0/h0;", "g", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$Status;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "c", "(Lkotlinx/coroutines/CoroutineScope;)V", "a", "b", "()V", "Lz60/g;", "Ljavax/inject/Provider;", "Ll80/c$a;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineDispatcher;", "", "e", "I", "attempts", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "pollingJob", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_state", "Lkotlinx/coroutines/flow/StateFlow;", "h", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements l80.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Provider<PaymentConfiguration> paymentConfigProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l80.c.Config config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int attempts;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Job pollingJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<StripeIntent.Status> _state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<StripeIntent.Status> state;

    /* JADX INFO: renamed from: l80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.polling.DefaultIntentStatusPoller", f = "DefaultIntentStatusPoller.kt", i = {}, l = {57}, m = "fetchIntentStatus", n = {}, s = {})
    static final class C1891a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f89696n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f89698p;

        C1891a(Continuation<? super C1891a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f89696n = obj;
            this.f89698p |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentConfiguration f89699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PaymentConfiguration paymentConfiguration) {
            super(0);
            this.f89699c = paymentConfiguration;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f89699c.getPublishableKey();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentConfiguration f89700c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PaymentConfiguration paymentConfiguration) {
            super(0);
            this.f89700c = paymentConfiguration;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f89700c.getStripeAccountId();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.polling.DefaultIntentStatusPoller", f = "DefaultIntentStatusPoller.kt", i = {0, 1}, l = {45, 49, 50}, m = "performPoll", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f89701n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f89702o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f89703p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f89705r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f89703p = obj;
            this.f89705r |= Integer.MIN_VALUE;
            return a.this.g(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.polling.DefaultIntentStatusPoller$startPolling$1", f = "DefaultIntentStatusPoller.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89706n;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89706n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = a.this;
                this.f89706n = 1;
                if (a.h(aVar, false, this, 1, null) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(g stripeRepository, Provider<PaymentConfiguration> paymentConfigProvider, l80.c.Config config, CoroutineDispatcher dispatcher) {
        s.k(stripeRepository, "stripeRepository");
        s.k(paymentConfigProvider, "paymentConfigProvider");
        s.k(config, "config");
        s.k(dispatcher, "dispatcher");
        this.stripeRepository = stripeRepository;
        this.paymentConfigProvider = paymentConfigProvider;
        this.config = config;
        this.dispatcher = dispatcher;
        MutableStateFlow<StripeIntent.Status> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(Continuation<? super StripeIntent.Status> continuation) {
        C1891a c1891a;
        Object objB;
        if (continuation instanceof C1891a) {
            c1891a = (C1891a) continuation;
            int i11 = c1891a.f89698p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1891a.f89698p = i11 - Integer.MIN_VALUE;
            } else {
                c1891a = new C1891a(continuation);
            }
        } else {
            c1891a = new C1891a(continuation);
        }
        C1891a c1891a2 = c1891a;
        Object obj = c1891a2.f89696n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1891a2.f89698p;
        if (i12 == 0) {
            t.b(obj);
            PaymentConfiguration paymentConfiguration = this.paymentConfigProvider.get();
            g gVar = this.stripeRepository;
            String clientSecret = this.config.getClientSecret();
            l.Options options = new l.Options(new b(paymentConfiguration), new c(paymentConfiguration));
            c1891a2.f89698p = 1;
            objB = g.a.b(gVar, clientSecret, options, null, c1891a2, 4, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objB = ((jn0.s) obj).getValue();
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        PaymentIntent paymentIntent = (PaymentIntent) objB;
        if (paymentIntent != null) {
            return paymentIntent.getStatus();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (h(r8, false, r0, 1, null) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof l80.a.d
            if (r0 == 0) goto L13
            r0 = r9
            l80.a$d r0 = (l80.a.d) r0
            int r1 = r0.f89705r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89705r = r1
            goto L18
        L13:
            l80.a$d r0 = new l80.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f89703p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f89705r
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            jn0.t.b(r9)
            goto L9e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f89701n
            l80.a r8 = (l80.a) r8
            jn0.t.b(r9)
            goto L92
        L41:
            java.lang.Object r8 = r0.f89702o
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            java.lang.Object r2 = r0.f89701n
            l80.a r2 = (l80.a) r2
            jn0.t.b(r9)
            goto L71
        L4d:
            jn0.t.b(r9)
            if (r8 != 0) goto L5c
            int r8 = r7.attempts
            l80.c$a r9 = r7.config
            int r9 = r9.getMaxAttempts()
            if (r8 >= r9) goto La1
        L5c:
            int r8 = r7.attempts
            int r8 = r8 + r6
            r7.attempts = r8
            kotlinx.coroutines.flow.MutableStateFlow<com.stripe.android.model.StripeIntent$Status> r8 = r7._state
            r0.f89701n = r7
            r0.f89702o = r8
            r0.f89705r = r6
            java.lang.Object r9 = r7.f(r0)
            if (r9 != r1) goto L70
            goto L9d
        L70:
            r2 = r7
        L71:
            r8.setValue(r9)
            int r8 = r2.attempts
            l80.c$a r9 = r2.config
            int r9 = r9.getMaxAttempts()
            if (r8 >= r9) goto La1
            int r8 = r2.attempts
            long r8 = l80.b.a(r8)
            r0.f89701n = r2
            r0.f89702o = r5
            r0.f89705r = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r8, r0)
            if (r8 != r1) goto L91
            goto L9d
        L91:
            r8 = r2
        L92:
            r0.f89701n = r5
            r0.f89705r = r3
            r9 = 0
            java.lang.Object r8 = h(r8, r9, r0, r6, r5)
            if (r8 != r1) goto L9e
        L9d:
            return r1
        L9e:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        La1:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l80.a.g(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object h(a aVar, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return aVar.g(z11, continuation);
    }

    @Override // l80.c
    public Object a(Continuation<? super StripeIntent.Status> continuation) {
        return f(continuation);
    }

    @Override // l80.c
    public void b() {
        Job job = this.pollingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.pollingJob = null;
    }

    @Override // l80.c
    public void c(CoroutineScope scope) {
        s.k(scope, "scope");
        this.pollingJob = BuildersKt__Builders_commonKt.launch$default(scope, this.dispatcher, null, new e(null), 2, null);
    }

    @Override // l80.c
    public StateFlow<StripeIntent.Status> getState() {
        return this.state;
    }
}
