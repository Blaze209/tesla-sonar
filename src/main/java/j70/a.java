package j70;

import a70.Unvalidated;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.stripe3ds2.transaction.h;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w30.f0;
import w30.l;
import wn0.p;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001\u001eB=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)¨\u0006+"}, d2 = {"Lj70/a;", "Lj70/d;", "Lz60/g;", "stripeRepository", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lw30/f0;", "retryDelaySupplier", "Lo30/d;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lz60/g;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lw30/f0;Lo30/d;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/transaction/h;", "challengeResult", "Lw30/l$c;", "requestOptions", "", "remainingRetries", "", "f", "(Lcom/stripe/android/stripe3ds2/transaction/h;Lw30/l$c;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", AnalyticsAttribute.Error, "h", "(Lcom/stripe/android/stripe3ds2/transaction/h;Lw30/l$c;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "La70/c;", "a", "(Lcom/stripe/android/stripe3ds2/transaction/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz60/g;", "b", "Lw30/c;", "c", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", DateTokenConverter.CONVERTER_KEY, "Lw30/f0;", "e", "Lo30/d;", "Lkotlin/coroutines/CoroutineContext;", "g", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements j70.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1731a f82757g = new C1731a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f82758h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f0 retryDelaySupplier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: j70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj70/a$a;", "", "<init>", "()V", "", "MAX_RETRIES", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class C1731a {
        public /* synthetic */ C1731a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1731a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", f = "Stripe3ds2ChallengeResultProcessor.kt", i = {0, 0, 0, 0}, l = {147, 162}, m = "complete3ds2Auth", n = {"this", "challengeResult", "requestOptions", "remainingRetries"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f82765n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f82766o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f82767p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f82768q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82769r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82771t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f82769r = obj;
            this.f82771t |= Integer.MIN_VALUE;
            return a.this.f(null, null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", f = "Stripe3ds2ChallengeResultProcessor.kt", i = {0, 0, 0, 0}, l = {200, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE}, m = "onComplete3ds2AuthFailure", n = {"this", "challengeResult", "requestOptions", "remainingRetries"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f82772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f82773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f82774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f82775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82776r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82778t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f82776r = obj;
            this.f82778t |= Integer.MIN_VALUE;
            return a.this.h(null, null, 0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "La70/c;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)La70/c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2", f = "Stripe3ds2ChallengeResultProcessor.kt", i = {0}, l = {97}, m = "invokeSuspend", n = {"requestOptions"}, s = {"L$0"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super Unvalidated>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f82779n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f82780o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ h f82781p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a f82782q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f82781p = hVar;
            this.f82782q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f82781p, this.f82782q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l.Options options;
            Object objG;
            int i11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f82780o;
            int i13 = 1;
            if (i12 == 0) {
                t.b(obj);
                h hVar = this.f82781p;
                if (hVar instanceof h.Succeeded) {
                    this.f82782q.analyticsRequestExecutor.a(this.f82782q.paymentAnalyticsRequestFactory.p(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((h.Succeeded) this.f82781p).getUiTypeCode()));
                } else if (hVar instanceof h.Failed) {
                    this.f82782q.analyticsRequestExecutor.a(this.f82782q.paymentAnalyticsRequestFactory.p(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((h.Failed) this.f82781p).getUiTypeCode()));
                } else if (hVar instanceof h.Canceled) {
                    this.f82782q.analyticsRequestExecutor.a(this.f82782q.paymentAnalyticsRequestFactory.p(PaymentAnalyticsEvent.Auth3ds2ChallengeCanceled, ((h.Canceled) this.f82781p).getUiTypeCode()));
                } else if ((hVar instanceof h.ProtocolError) || (hVar instanceof h.RuntimeError)) {
                    this.f82782q.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.f82782q.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.Timeout) {
                    this.f82782q.analyticsRequestExecutor.a(this.f82782q.paymentAnalyticsRequestFactory.p(PaymentAnalyticsEvent.Auth3ds2ChallengeTimedOut, ((h.Timeout) this.f82781p).getUiTypeCode()));
                }
                w30.c cVar = this.f82782q.analyticsRequestExecutor;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.f82782q.paymentAnalyticsRequestFactory;
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.Auth3ds2ChallengePresented;
                com.stripe.android.stripe3ds2.transactions.d initialUiType = this.f82781p.getInitialUiType();
                String code = initialUiType != null ? initialUiType.getCode() : null;
                if (code == null) {
                    code = "";
                }
                cVar.a(paymentAnalyticsRequestFactory.p(paymentAnalyticsEvent, code));
                options = new l.Options(this.f82781p.getIntentData().getPublishableKey(), this.f82781p.getIntentData().getAccountId(), null, 4, null);
                a aVar = this.f82782q;
                h hVar2 = this.f82781p;
                this.f82779n = options;
                this.f82780o = 1;
                objG = a.g(aVar, hVar2, options, 0, this, 4, null);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.Options options2 = (l.Options) this.f82779n;
                t.b(obj);
                options = options2;
                objG = obj;
            }
            if (((Boolean) objG).booleanValue()) {
                h hVar3 = this.f82781p;
                if (!(hVar3 instanceof h.Succeeded)) {
                    if (!(hVar3 instanceof h.Failed)) {
                        if (hVar3 instanceof h.Canceled) {
                            i13 = 3;
                        } else if (!(hVar3 instanceof h.ProtocolError) && !(hVar3 instanceof h.RuntimeError)) {
                            if (!(hVar3 instanceof h.Timeout)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i13 = 4;
                        }
                    }
                    i11 = 2;
                }
                i11 = i13;
            } else {
                i11 = 2;
            }
            return new Unvalidated(this.f82781p.getIntentData().getClientSecret(), i11, null, false, null, null, options.getStripeAccount(), 60, null);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unvalidated> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(g stripeRepository, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, f0 retryDelaySupplier, o30.d logger, CoroutineContext workContext) {
        s.k(stripeRepository, "stripeRepository");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(retryDelaySupplier, "retryDelaySupplier");
        s.k(logger, "logger");
        s.k(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.logger = logger;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r11 == r0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.stripe.android.stripe3ds2.transaction.h r8, w30.l.Options r9, int r10, p013kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof j70.a.b
            if (r0 == 0) goto L14
            r0 = r11
            j70.a$b r0 = (j70.a.b) r0
            int r1 = r0.f82771t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f82771t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            j70.a$b r0 = new j70.a$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f82769r
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f82771t
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L51
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            jn0.t.b(r11)
            goto Lad
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r10 = r6.f82768q
            java.lang.Object r8 = r6.f82767p
            r9 = r8
            w30.l$c r9 = (w30.l.Options) r9
            java.lang.Object r8 = r6.f82766o
            com.stripe.android.stripe3ds2.transaction.h r8 = (com.stripe.android.stripe3ds2.transaction.h) r8
            java.lang.Object r1 = r6.f82765n
            j70.a r1 = (j70.a) r1
            jn0.t.b(r11)
            jn0.s r11 = (jn0.s) r11
            java.lang.Object r11 = r11.getValue()
        L4f:
            r4 = r10
            goto L71
        L51:
            jn0.t.b(r11)
            z60.g r11 = r7.stripeRepository
            com.stripe.android.stripe3ds2.transaction.n r1 = r8.getIntentData()
            java.lang.String r1 = r1.getSourceId()
            r6.f82765n = r7
            r6.f82766o = r8
            r6.f82767p = r9
            r6.f82768q = r10
            r6.f82771t = r3
            java.lang.Object r11 = r11.G(r1, r9, r6)
            if (r11 != r0) goto L6f
            goto Lac
        L6f:
            r1 = r7
            goto L4f
        L71:
            java.lang.Throwable r5 = jn0.s.e(r11)
            if (r5 != 0) goto L9b
            com.stripe.android.model.l1 r11 = (com.stripe.android.model.Stripe3ds2AuthResult) r11
            int r8 = 3 - r4
            o30.d r9 = r1.logger
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "3DS2 challenge completion request was successful. "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " retries attempted."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.debug(r8)
            java.lang.Boolean r8 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r8
        L9b:
            r10 = 0
            r6.f82765n = r10
            r6.f82766o = r10
            r6.f82767p = r10
            r6.f82771t = r2
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.h(r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lad
        Lac:
            return r0
        Lad:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            java.lang.Boolean r8 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j70.a.f(com.stripe.android.stripe3ds2.transaction.h, w30.l$c, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object g(a aVar, h hVar, l.Options options, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 3;
        }
        return aVar.f(hVar, options, i11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(h hVar, l.Options options, int i11, Throwable th2, Continuation<? super Boolean> continuation) {
        c cVar;
        a aVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f82778t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f82778t = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f82776r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = cVar.f82778t;
        if (i13 == 0) {
            t.b(obj);
            this.logger.error("3DS2 challenge completion request failed. Remaining retries: " + i11, th2);
            boolean isClientError = th2 instanceof StripeException ? ((StripeException) th2).getIsClientError() : false;
            if (i11 <= 0 || !isClientError) {
                this.logger.debug("Did not make a successful 3DS2 challenge completion request after retrying.");
                return Boxing.boxBoolean(false);
            }
            long jB = this.retryDelaySupplier.b(3, i11);
            cVar.f82772n = this;
            cVar.f82773o = hVar;
            cVar.f82774p = options;
            cVar.f82775q = i11;
            cVar.f82778t = 1;
            if (DelayKt.m506delayVtjQ1oo(jB, cVar) != coroutine_suspended) {
                aVar = this;
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        i11 = cVar.f82775q;
        options = (l.Options) cVar.f82774p;
        hVar = (h) cVar.f82773o;
        aVar = (a) cVar.f82772n;
        t.b(obj);
        cVar.f82772n = null;
        cVar.f82773o = null;
        cVar.f82774p = null;
        cVar.f82778t = 2;
        Object objF = aVar.f(hVar, options, i11 - 1, cVar);
        return objF == coroutine_suspended ? coroutine_suspended : objF;
    }

    @Override // j70.d
    public Object a(h hVar, Continuation<? super Unvalidated> continuation) {
        return BuildersKt.withContext(this.workContext, new d(hVar, this, null), continuation);
    }
}
