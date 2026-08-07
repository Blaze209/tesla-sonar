package w30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.APIConnectionException;
import java.io.IOException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u001aB;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u001fH\u0081@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*¨\u0006+"}, d2 = {"Lw30/r;", "Lw30/j0;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lw30/n;", "connectionFactory", "Lw30/f0;", "retryDelaySupplier", "", "maxRetries", "Lo30/d;", "logger", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lw30/n;Lw30/f0;ILo30/d;)V", "Lw30/k0;", "request", "Lw30/l0;", "", "f", "(Lw30/k0;)Lw30/l0;", "BodyType", "Lw30/i0;", "connection", "baseUrl", "g", "(Lw30/i0;Ljava/lang/String;)Lw30/l0;", "a", "(Lw30/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remainingRetries", "", "retryResponseCodes", "Lkotlin/Function0;", "requester", "e", "(ILjava/lang/Iterable;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lw30/n;", "c", "Lw30/f0;", DateTokenConverter.CONVERTER_KEY, "I", "Lo30/d;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r implements j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f120678f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n connectionFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 retryDelaySupplier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxRetries;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw30/r$a;", "", "<init>", "()V", "", "DEFAULT_MAX_RETRIES", "I", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [BodyType] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"BodyType", "Lkotlinx/coroutines/CoroutineScope;", "Lw30/l0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lw30/l0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultStripeNetworkClient$executeInternal$2", f = "DefaultStripeNetworkClient.kt", i = {}, l = {50, 56}, m = "invokeSuspend", n = {}, s = {})
    static final class b<BodyType> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super l0<BodyType>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.a<l0<BodyType>> f120685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Iterable<Integer> f120686p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f120687q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ r f120688r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wn0.a<l0<BodyType>> aVar, Iterable<Integer> iterable, int i11, r rVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f120685o = aVar;
            this.f120686p = iterable;
            this.f120687q = i11;
            this.f120688r = rVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f120685o, this.f120686p, this.f120687q, this.f120688r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
        
            if (r8 == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f120684n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r8)
                goto L93
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                jn0.t.b(r8)
                goto L81
            L1f:
                jn0.t.b(r8)
                wn0.a<w30.l0<BodyType>> r8 = r7.f120685o
                java.lang.Object r8 = r8.invoke()
                w30.l0 r8 = (w30.l0) r8
                java.lang.Iterable<java.lang.Integer> r1 = r7.f120686p
                int r4 = r8.getCode()
                java.lang.Integer r4 = p013kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
                boolean r1 = p013kotlin.collections.v.g0(r1, r4)
                if (r1 == 0) goto L95
                int r1 = r7.f120687q
                if (r1 <= 0) goto L95
                w30.r r1 = r7.f120688r
                o30.d r1 = w30.r.b(r1)
                int r8 = r8.getCode()
                int r4 = r7.f120687q
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Request failed with code "
                r5.append(r6)
                r5.append(r8)
                java.lang.String r8 = ". Retrying up to "
                r5.append(r8)
                r5.append(r4)
                java.lang.String r8 = " more time(s)."
                r5.append(r8)
                java.lang.String r8 = r5.toString()
                r1.info(r8)
                w30.r r8 = r7.f120688r
                w30.f0 r8 = w30.r.c(r8)
                r1 = 3
                int r4 = r7.f120687q
                long r4 = r8.b(r1, r4)
                r7.f120684n = r3
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r4, r7)
                if (r8 != r0) goto L81
                goto L92
            L81:
                w30.r r8 = r7.f120688r
                int r1 = r7.f120687q
                int r1 = r1 - r3
                java.lang.Iterable<java.lang.Integer> r3 = r7.f120686p
                wn0.a<w30.l0<BodyType>> r4 = r7.f120685o
                r7.f120684n = r2
                java.lang.Object r8 = r8.e(r1, r3, r4, r7)
                if (r8 != r0) goto L93
            L92:
                return r0
            L93:
                w30.l0 r8 = (w30.l0) r8
            L95:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: w30.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super l0<BodyType>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw30/l0;", "", "b", "()Lw30/l0;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<l0<String>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f120690d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k0 k0Var) {
            super(0);
            this.f120690d = k0Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l0<String> invoke() {
            return r.this.f(this.f120690d);
        }
    }

    public r(CoroutineContext workContext, n connectionFactory, f0 retryDelaySupplier, int i11, o30.d logger) {
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(connectionFactory, "connectionFactory");
        p013kotlin.jvm.internal.s.k(retryDelaySupplier, "retryDelaySupplier");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.workContext = workContext;
        this.connectionFactory = connectionFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.maxRetries = i11;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0<String> f(k0 request) {
        return g(this.connectionFactory.a(request), request.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
    }

    private final <BodyType> l0<BodyType> g(i0<BodyType> connection, String baseUrl) throws Throwable {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            l0<BodyType> response = connection.getResponse();
            this.logger.info(response.toString());
            objB = jn0.s.b(response);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE == null) {
            return (l0) objB;
        }
        this.logger.error("Exception while making Stripe API request", thE);
        if (thE instanceof IOException) {
            throw APIConnectionException.INSTANCE.a((IOException) thE, baseUrl);
        }
        throw thE;
    }

    @Override // w30.j0
    public Object a(k0 k0Var, Continuation<? super l0<String>> continuation) {
        return e(this.maxRetries, k0Var.d(), new c(k0Var), continuation);
    }

    public final <BodyType> Object e(int i11, Iterable<Integer> iterable, wn0.a<l0<BodyType>> aVar, Continuation<? super l0<BodyType>> continuation) {
        return BuildersKt.withContext(this.workContext, new b(aVar, iterable, i11, this, null), continuation);
    }

    public /* synthetic */ r(CoroutineContext coroutineContext, n nVar, f0 f0Var, int i11, o30.d dVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Dispatchers.getIO() : coroutineContext, (i12 & 2) != 0 ? n.c.f120660a : nVar, (i12 & 4) != 0 ? new s() : f0Var, (i12 & 8) != 0 ? 3 : i11, (i12 & 16) != 0 ? o30.d.INSTANCE.b() : dVar);
    }
}
