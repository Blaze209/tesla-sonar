package com.stripe.android.payments.core.authentication.threeds2;

import a70.Unvalidated;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.transaction.m;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t80.ChallengeParameters;
import t80.InitChallengeArgs;
import t80.n;
import t80.p;
import w30.l;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001fBe\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010.J\u0018\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b4\u00105J0\u00108\u001a\u00020\u001c2\u0006\u00106\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00107\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0081@¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020:H\u0086@¢\u0006\u0004\b<\u0010=J0\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00107\u001a\u00020)2\u0006\u0010@\u001a\u00020#H\u0081@¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\"\u0010_\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010Y\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0017\u0010d\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/d;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "args", "Lz60/g;", "stripeRepository", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Ls80/a;", "threeDs2Service", "Lt80/p;", "messageVersionRegistry", "Lj70/d;", "challengeResultProcessor", "Lt80/n;", "initChallengeRepository", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Landroidx/lifecycle/s0;", "savedStateHandle", "", "isInstantApp", "<init>", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;Lz60/g;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ls80/a;Lt80/p;Lj70/d;Lt80/n;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/s0;Z)V", "Lcom/stripe/android/model/m1;", "stripe3ds2Fingerprint", "Lcom/stripe/android/payments/core/authentication/threeds2/a;", "h", "(Lcom/stripe/android/model/m1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt80/s;", "transaction", "Lw30/l$c;", "requestOptions", "", "timeout", "Ljn0/s;", "Lcom/stripe/android/model/l1;", "n", "(Lt80/s;Lcom/stripe/android/model/m1;Lw30/l$c;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fallbackRedirectUrl", "l", "(Ljava/lang/String;)Lcom/stripe/android/payments/core/authentication/threeds2/a;", "r", "()Lcom/stripe/android/payments/core/authentication/threeds2/a;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "challengeResult", "La70/c;", "o", "(Lcom/stripe/android/stripe3ds2/transaction/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "sourceId", "m", "(Lcom/stripe/android/model/l1;Lt80/s;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt80/m;", "Lcom/stripe/android/stripe3ds2/transaction/m;", "k", "(Lt80/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/l1$a;", "ares", "maxTimeout", "Lcom/stripe/android/payments/core/authentication/threeds2/a$b;", "q", "(Lcom/stripe/android/model/l1$a;Lt80/s;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "t", "Lz60/g;", "u", "Lw30/c;", "v", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "w", "Ls80/a;", "x", "Lt80/p;", "y", "Lj70/d;", "z", "Lt80/n;", "A", "Lkotlin/coroutines/CoroutineContext;", "B", "Landroidx/lifecycle/s0;", "C", "Z", "D", IntegerTokenConverter.CONVERTER_KEY, "()Z", "setHasCompleted", "(Z)V", "hasCompleted", "E", "Lw30/l$c;", "j", "()Lw30/l$c;", "threeDS2RequestOptions", Gender.FEMALE, "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends c1 {
    private static final a F = new a(null);
    public static final int G = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean isInstantApp;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean hasCompleted;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final l.Options threeDS2RequestOptions;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Stripe3ds2TransactionContract.Args args;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final s80.a threeDs2Service;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p messageVersionRegistry;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final j70.d challengeResultProcessor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n initChallengeRepository;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/d$a;", "", "<init>", "()V", "", "KEY_HAS_COMPLETED", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", i = {0, 0, 0, 0}, l = {108, 115}, m = "begin3ds2Auth", n = {"this", "stripe3ds2Fingerprint", "transaction", "timeout"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52123n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52124o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f52125p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f52126q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f52127r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f52129t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52127r = obj;
            this.f52129t |= Integer.MIN_VALUE;
            return d.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", i = {}, l = {140}, m = "perform3ds2AuthenticationRequest-yxL6bBk", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52130n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52132p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52130n = obj;
            this.f52132p |= Integer.MIN_VALUE;
            Object objN = d.this.n(null, null, null, 0, this);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : s.a(objN);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/l1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2", f = "Stripe3ds2TransactionViewModel.kt", i = {}, l = {141, 157}, m = "invokeSuspend", n = {}, s = {})
    static final class C0943d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super s<? extends Stripe3ds2AuthResult>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52133n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ t80.s f52134o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Stripe3ds2Fingerprint f52135p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f52136q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ d f52137r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ l.Options f52138s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0943d(t80.s sVar, Stripe3ds2Fingerprint m1Var, int i11, d dVar, l.Options cVar, Continuation<? super C0943d> continuation) {
            super(2, continuation);
            this.f52134o = sVar;
            this.f52135p = m1Var;
            this.f52136q = i11;
            this.f52137r = dVar;
            this.f52138s = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C0943d(this.f52134o, this.f52135p, this.f52136q, this.f52137r, this.f52138s, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends Stripe3ds2AuthResult>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<Stripe3ds2AuthResult>>) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        
            if (r14 == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f52133n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                jn0.t.b(r14)
                jn0.s r14 = (jn0.s) r14
                java.lang.Object r14 = r14.getValue()
                goto L6f
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                jn0.t.b(r14)
                goto L32
            L24:
                jn0.t.b(r14)
                t80.s r14 = r13.f52134o
                r13.f52133n = r3
                java.lang.Object r14 = r14.a(r13)
                if (r14 != r0) goto L32
                goto L6e
            L32:
                t80.c r14 = (t80.AuthenticationRequestParameters) r14
                com.stripe.android.model.k1 r3 = new com.stripe.android.model.k1
                com.stripe.android.model.m1 r1 = r13.f52135p
                java.lang.String r4 = r1.getSource()
                java.lang.String r5 = r14.getSdkAppId()
                java.lang.String r6 = r14.getSdkReferenceNumber()
                t80.q r1 = r14.getSdkTransactionId()
                java.lang.String r7 = r1.getValue()
                java.lang.String r8 = r14.getDeviceData()
                java.lang.String r9 = r14.getSdkEphemeralPublicKey()
                java.lang.String r10 = r14.getMessageVersion()
                int r11 = r13.f52136q
                r12 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                com.stripe.android.payments.core.authentication.threeds2.d r14 = r13.f52137r
                z60.g r14 = com.stripe.android.payments.core.authentication.threeds2.d.f(r14)
                w30.l$c r1 = r13.f52138s
                r13.f52133n = r2
                java.lang.Object r14 = r14.F(r3, r1, r13)
                if (r14 != r0) goto L6f
            L6e:
                return r0
            L6f:
                jn0.s r14 = jn0.s.a(r14)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.C0943d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<Stripe3ds2AuthResult>> continuation) {
            return ((C0943d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", i = {0}, l = {73}, m = "start3ds2Flow", n = {"this"}, s = {"L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52139n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f52140o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f52142q;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52140o = obj;
            this.f52142q |= Integer.MIN_VALUE;
            return d.this.p(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/payments/core/authentication/threeds2/a$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/payments/core/authentication/threeds2/a$b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$startChallengeFlow$2", f = "Stripe3ds2TransactionViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super com.stripe.android.payments.core.authentication.threeds2.a.StartChallenge>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Stripe3ds2AuthResult.Ares f52144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ t80.s f52145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f52146q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ d f52147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f52148s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Stripe3ds2AuthResult.Ares ares, t80.s sVar, int i11, d dVar, String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f52144o = ares;
            this.f52145p = sVar;
            this.f52146q = i11;
            this.f52147r = dVar;
            this.f52148s = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f52144o, this.f52145p, this.f52146q, this.f52147r, this.f52148s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52143n;
            if (i11 == 0) {
                t.b(obj);
                long jA = com.stripe.android.b.INSTANCE.a();
                this.f52143n = 1;
                if (DelayKt.delay(jA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            ChallengeParameters challengeParameters = new ChallengeParameters(this.f52144o.getThreeDSServerTransId(), this.f52144o.getAcsTransId(), null, this.f52144o.getAcsSignedContent(), null, 20, null);
            t80.s sVar = this.f52145p;
            int i12 = this.f52146q;
            String strP = this.f52147r.args.getStripeIntent().getClientSecret();
            if (strP == null) {
                strP = "";
            }
            return new com.stripe.android.payments.core.authentication.threeds2.a.StartChallenge(sVar.b(challengeParameters, i12, new IntentData(strP, this.f52148s, this.f52147r.getThreeDS2RequestOptions().getApiKey(), this.f52147r.getThreeDS2RequestOptions().getStripeAccount())));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.stripe.android.payments.core.authentication.threeds2.a.StartChallenge> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0073  */
    public d(Stripe3ds2TransactionContract.Args args, g stripeRepository, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, s80.a threeDs2Service, p messageVersionRegistry, j70.d challengeResultProcessor, n initChallengeRepository, CoroutineContext workContext, s0 savedStateHandle, boolean z11) {
        l.Options requestOptions;
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        p013kotlin.jvm.internal.s.k(threeDs2Service, "threeDs2Service");
        p013kotlin.jvm.internal.s.k(messageVersionRegistry, "messageVersionRegistry");
        p013kotlin.jvm.internal.s.k(challengeResultProcessor, "challengeResultProcessor");
        p013kotlin.jvm.internal.s.k(initChallengeRepository, "initChallengeRepository");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.threeDs2Service = threeDs2Service;
        this.messageVersionRegistry = messageVersionRegistry;
        this.challengeResultProcessor = challengeResultProcessor;
        this.initChallengeRepository = initChallengeRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z11;
        this.hasCompleted = savedStateHandle.e("key_next_step");
        String strB = args.getNextActionData().getPublishableKey();
        if (strB == null) {
            requestOptions = args.getRequestOptions();
        } else {
            String str = strB.length() <= 0 ? null : strB;
            if (str != null) {
                requestOptions = new l.Options(str, null, null, 6, null);
            } else {
                requestOptions = args.getRequestOptions();
            }
        }
        this.threeDS2RequestOptions = requestOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (r1 == r9) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.stripe.android.model.Stripe3ds2Fingerprint r21, p013kotlin.coroutines.Continuation<? super com.stripe.android.payments.core.authentication.threeds2.a> r22) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.h(com.stripe.android.model.m1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a l(String fallbackRedirectUrl) {
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fallback, null, null, null, null, null, 62, null));
        String id2 = this.args.getStripeIntent().getId();
        if (id2 == null) {
            id2 = "";
        }
        int iC = com.stripe.android.b.INSTANCE.c(this.args.getStripeIntent());
        String strP = this.args.getStripeIntent().getClientSecret();
        return new com.stripe.android.payments.core.authentication.threeds2.a.StartFallback(new PaymentBrowserAuthContract.Args(id2, iC, strP != null ? strP : "", fallbackRedirectUrl, null, this.args.getEnableLogging(), null, this.args.getRequestOptions().getStripeAccount(), true, false, this.args.getStatusBarColor(), this.threeDS2RequestOptions.getApiKey(), this.isInstantApp, null, false, 25152, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object n(t80.s sVar, Stripe3ds2Fingerprint m1Var, l.Options cVar, int i11, Continuation<? super s<Stripe3ds2AuthResult>> continuation) {
        c cVar2;
        if (continuation instanceof c) {
            cVar2 = (c) continuation;
            int i12 = cVar2.f52132p;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar2.f52132p = i12 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(continuation);
            }
        } else {
            cVar2 = new c(continuation);
        }
        c cVar3 = cVar2;
        Object objWithContext = cVar3.f52130n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = cVar3.f52132p;
        if (i13 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            C0943d c0943d = new C0943d(sVar, m1Var, i11, this, cVar, null);
            cVar3.f52132p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, c0943d, cVar3);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a r() {
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Frictionless, null, null, null, null, null, 62, null));
        return new com.stripe.android.payments.core.authentication.threeds2.a.Complete(new Unvalidated(this.args.getStripeIntent().getClientSecret(), 0, null, false, null, null, this.args.getRequestOptions().getStripeAccount(), 62, null));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final l.Options getThreeDS2RequestOptions() {
        return this.threeDS2RequestOptions;
    }

    public final Object k(InitChallengeArgs mVar, Continuation<? super m> continuation) {
        return this.initChallengeRepository.a(mVar, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    public final Object m(Stripe3ds2AuthResult stripe3ds2AuthResult, t80.s sVar, String str, int i11, Continuation<? super com.stripe.android.payments.core.authentication.threeds2.a> continuation) {
        String strY0;
        Stripe3ds2AuthResult.Ares ares = stripe3ds2AuthResult.getAres();
        if (ares != null) {
            if (!ares.d()) {
                return r();
            }
            Object objQ = q(ares, sVar, str, i11, continuation);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : (com.stripe.android.payments.core.authentication.threeds2.a) objQ;
        }
        if (stripe3ds2AuthResult.getFallbackRedirectUrl() != null) {
            return l(stripe3ds2AuthResult.getFallbackRedirectUrl());
        }
        Stripe3ds2AuthResult.ThreeDS2Error error = stripe3ds2AuthResult.getError();
        if (error != null) {
            strY0 = v.y0(v.p("Code: " + error.getErrorCode(), "Detail: " + error.getErrorDetail(), "Description: " + error.getErrorDescription(), "Component: " + error.getErrorComponent()), ", ", null, null, 0, null, null, 62, null);
            if (strY0 == null) {
                strY0 = "Invalid 3DS2 authentication response";
            }
        } else {
            strY0 = "Invalid 3DS2 authentication response";
        }
        return new com.stripe.android.payments.core.authentication.threeds2.a.Complete(new Unvalidated(null, 0, StripeException.INSTANCE.b(new RuntimeException("Error encountered during 3DS2 authentication request. " + strY0)), false, null, null, null, 123, null));
    }

    public final Object o(h hVar, Continuation<? super Unvalidated> continuation) {
        return this.challengeResultProcessor.a(hVar, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Continuation<? super com.stripe.android.payments.core.authentication.threeds2.a> continuation) {
        e eVar;
        Throwable th2;
        d dVar;
        Object objB;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f52142q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f52142q = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objH = eVar.f52140o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f52142q;
        if (i12 == 0) {
            t.b(objH);
            this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fingerprint, null, null, null, null, null, 62, null));
            try {
                s.Companion companion = s.INSTANCE;
                Stripe3ds2Fingerprint m1Var = new Stripe3ds2Fingerprint(this.args.getNextActionData());
                eVar.f52139n = this;
                eVar.f52142q = 1;
                objH = h(m1Var, eVar);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dVar = this;
            } catch (Throwable th3) {
                th2 = th3;
                dVar = this;
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) eVar.f52139n;
            try {
                t.b(objH);
            } catch (Throwable th4) {
                th2 = th4;
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
        }
        objB = s.b((com.stripe.android.payments.core.authentication.threeds2.a) objH);
        Throwable thE = s.e(objB);
        if (thE != null) {
            dVar.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(dVar.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed, null, null, null, null, null, 62, null));
            String str = null;
            int i13 = 0;
            objB = new com.stripe.android.payments.core.authentication.threeds2.a.Complete(new Unvalidated(str, i13, StripeException.INSTANCE.b(thE), false, null, null, null, 123, null));
        }
        dVar.savedStateHandle.n("key_next_step", Boxing.boxBoolean(true));
        dVar.hasCompleted = true;
        return objB;
    }

    public final Object q(Stripe3ds2AuthResult.Ares ares, t80.s sVar, String str, int i11, Continuation<? super com.stripe.android.payments.core.authentication.threeds2.a.StartChallenge> continuation) {
        return BuildersKt.withContext(this.workContext, new f(ares, sVar, i11, this, str, null), continuation);
    }
}
