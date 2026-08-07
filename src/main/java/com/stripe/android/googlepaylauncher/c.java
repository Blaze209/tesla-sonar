package com.stripe.android.googlepaylauncher;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.core.exception.StripeException;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B)\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001f\u00100¨\u00062"}, d2 = {"Lcom/stripe/android/googlepaylauncher/c;", "Lcom/stripe/android/googlepaylauncher/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "La60/d;", AnalyticsAttribute.Environment, "Lf30/i$a;", "billingAddressParameters", "", "existingPaymentMethodRequired", "allowCreditCards", "La60/h;", "paymentsClientFactory", "Lh70/h;", "errorReporter", "Lo30/d;", "logger", "<init>", "(Landroid/content/Context;La60/d;Lf30/i$a;ZZLa60/h;Lh70/h;Lo30/d;)V", "Lcom/stripe/android/googlepaylauncher/h$e;", "googlePayConfig", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/h$e;Lo30/d;Lh70/h;)V", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "isReady", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroid/content/Context;", "c", "La60/d;", DateTokenConverter.CONVERTER_KEY, "Lf30/i$a;", "Z", "f", "g", "La60/h;", "h", "Lh70/h;", IntegerTokenConverter.CONVERTER_KEY, "Lo30/d;", "Lf30/i;", "j", "Lf30/i;", "googlePayJsonFactory", "Lcom/stripe/android/googlepaylauncher/e;", "k", "Lkotlin/Lazy;", "()Lcom/stripe/android/googlepaylauncher/e;", "googlePayAvailabilityClient", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a60.d environment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f30.i.BillingAddressParameters billingAddressParameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean existingPaymentMethodRequired;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowCreditCards;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a60.h paymentsClientFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final f30.i googlePayJsonFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy googlePayAvailabilityClient;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/googlepaylauncher/e;", "b", "()Lcom/stripe/android/googlepaylauncher/e;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<e> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return l.INSTANCE.a().a(c.this.paymentsClientFactory.a(c.this.environment));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReady$1", f = "GooglePayRepository.kt", i = {}, l = {85, 85}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<FlowCollector<? super Boolean>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50763n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f50764o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = c.this.new b(continuation);
            bVar.f50764o = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f50763n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f50764o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r5)
                goto L37
            L22:
                jn0.t.b(r5)
                java.lang.Object r5 = r4.f50764o
                r1 = r5
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.stripe.android.googlepaylauncher.c r5 = com.stripe.android.googlepaylauncher.c.this
                r4.f50764o = r1
                r4.f50763n = r3
                java.lang.Object r5 = com.stripe.android.googlepaylauncher.c.c(r5, r4)
                if (r5 != r0) goto L37
                goto L42
            L37:
                r3 = 0
                r4.f50764o = r3
                r4.f50763n = r2
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super h0> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.DefaultGooglePayRepository", f = "GooglePayRepository.kt", i = {0}, l = {109}, m = "isReadyAsync", n = {"this"}, s = {"L$0"})
    static final class C0850c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50766n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f50767o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f50769q;

        C0850c(Continuation<? super C0850c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50767o = obj;
            this.f50769q |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    public c(Context context, a60.d environment, f30.i.BillingAddressParameters billingAddressParameters, boolean z11, boolean z12, a60.h paymentsClientFactory, h70.h errorReporter, o30.d logger) {
        s.k(context, "context");
        s.k(environment, "environment");
        s.k(billingAddressParameters, "billingAddressParameters");
        s.k(paymentsClientFactory, "paymentsClientFactory");
        s.k(errorReporter, "errorReporter");
        s.k(logger, "logger");
        this.context = context;
        this.environment = environment;
        this.billingAddressParameters = billingAddressParameters;
        this.existingPaymentMethodRequired = z11;
        this.allowCreditCards = z12;
        this.paymentsClientFactory = paymentsClientFactory;
        this.errorReporter = errorReporter;
        this.logger = logger;
        this.googlePayJsonFactory = new f30.i(context, false, 2, null);
        this.googlePayAvailabilityClient = m.b(new a());
    }

    private final e d() {
        return (e) this.googlePayAvailabilityClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(Continuation<? super Boolean> continuation) {
        C0850c c0850c;
        Object objB;
        c cVar;
        Object objB2;
        if (continuation instanceof C0850c) {
            c0850c = (C0850c) continuation;
            int i11 = c0850c.f50769q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0850c.f50769q = i11 - Integer.MIN_VALUE;
            } else {
                c0850c = new C0850c(continuation);
            }
        } else {
            c0850c = new C0850c(continuation);
        }
        C0850c c0850c2 = c0850c;
        Object objA = c0850c2.f50767o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c0850c2.f50769q;
        if (i12 == 0) {
            t.b(objA);
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(IsReadyToPayRequest.fromJson(this.googlePayJsonFactory.c(this.billingAddressParameters, Boxing.boxBoolean(this.existingPaymentMethodRequired), Boxing.boxBoolean(this.allowCreditCards)).toString()));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                h70.h.b.a(this.errorReporter, h70.h.f.GOOGLE_PAY_JSON_REQUEST_PARSING, StripeException.INSTANCE.b(thE), null, 4, null);
                this.logger.error("Google Pay json parsing failed.", thE);
                return Boxing.boxBoolean(false);
            }
            s.j(objB, "getOrElse(...)");
            IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) objB;
            try {
                e eVarD = d();
                c0850c2.f50766n = this;
                c0850c2.f50769q = 1;
                objA = eVarD.a(isReadyToPayRequest, c0850c2);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = this;
            } catch (Throwable th3) {
                th = th3;
                cVar = this;
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB2 = jn0.s.b(t.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) c0850c2.f50766n;
            try {
                t.b(objA);
            } catch (Throwable th4) {
                th = th4;
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                objB2 = jn0.s.b(t.a(th));
            }
        }
        objB2 = jn0.s.b(Boxing.boxBoolean(((Boolean) objA).booleanValue()));
        Throwable thE2 = jn0.s.e(objB2);
        if (thE2 != null) {
            h70.h.b.a(cVar.errorReporter, h70.h.d.GOOGLE_PAY_IS_READY_API_CALL, StripeException.INSTANCE.b(thE2), null, 4, null);
            cVar.logger.error("Google Pay check failed.", thE2);
        }
        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
        if (jn0.s.g(objB2)) {
            objB2 = boolBoxBoolean;
        }
        boolean zBooleanValue = ((Boolean) objB2).booleanValue();
        cVar.logger.info("Google Pay ready? " + zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.stripe.android.googlepaylauncher.l
    public Flow<Boolean> isReady() {
        return FlowKt.flow(new b(null));
    }

    public /* synthetic */ c(Context context, a60.d dVar, f30.i.BillingAddressParameters aVar, boolean z11, boolean z12, a60.h hVar, h70.h hVar2, o30.d dVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, aVar, z11, z12, (i11 & 32) != 0 ? new a60.a(context) : hVar, hVar2, (i11 & 128) != 0 ? o30.d.INSTANCE.b() : dVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, h.Config googlePayConfig, o30.d logger, h70.h errorReporter) {
        s.k(context, "context");
        s.k(googlePayConfig, "googlePayConfig");
        s.k(logger, "logger");
        s.k(errorReporter, "errorReporter");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this(applicationContext, googlePayConfig.getEnvironment(), com.stripe.android.googlepaylauncher.a.b(googlePayConfig.getBillingAddressConfig()), googlePayConfig.getExistingPaymentMethodRequired(), googlePayConfig.getAllowCreditCards(), new a60.a(context), errorReporter, logger);
    }
}
