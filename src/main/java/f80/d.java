package f80;

import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.j0;
import com.stripe.android.paymentsheet.y;
import f30.PaymentConfiguration;
import java.util.List;
import javax.inject.Provider;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import w30.l;
import wn0.p;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lf80/d;", "Lf80/b;", "Lz60/g;", "stripeRepository", "Ljavax/inject/Provider;", "Lf30/o;", "lazyPaymentConfig", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lz60/g;Ljavax/inject/Provider;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/model/j0;", "params", "", "elementsSessionFailure", "Ljn0/s;", "Lcom/stripe/android/model/h0;", "e", "(Lcom/stripe/android/model/j0;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/paymentsheet/y$j;", "customer", "", "", "externalPaymentMethods", "defaultPaymentMethodId", "a", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$j;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz60/g;", "b", "Ljavax/inject/Provider;", "c", "Lkotlin/coroutines/CoroutineContext;", "Lw30/l$c;", "f", "()Lw30/l$c;", "requestOptions", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements f80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Provider<PaymentConfiguration> lazyPaymentConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository", f = "ElementsSessionRepository.kt", i = {}, l = {73}, m = "fallback-0E7RQCE", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f64578n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f64580p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64578n = obj;
            this.f64580p |= Integer.MIN_VALUE;
            Object objE = d.this.e(null, null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : s.a(objE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository$fallback$2", f = "ElementsSessionRepository.kt", i = {}, l = {76, 83}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends ElementsSession>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64581n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j0 f64582o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f64583p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Throwable f64584q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, d dVar, Throwable th2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f64582o = j0Var;
            this.f64583p = dVar;
            this.f64584q = th2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f64582o, this.f64583p, this.f64584q, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends ElementsSession>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<ElementsSession>>) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            return r0;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f64581n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                jn0.s r6 = (jn0.s) r6
                java.lang.Object r6 = r6.getValue()
                goto L88
            L21:
                jn0.t.b(r6)
                com.stripe.android.model.j0 r6 = r5.f64582o
                boolean r1 = r6 instanceof com.stripe.android.model.j0.PaymentIntentType
                java.lang.String r4 = "payment_method"
                if (r1 == 0) goto L4d
                f80.d r6 = r5.f64583p
                z60.g r6 = f80.d.d(r6)
                com.stripe.android.model.j0 r1 = r5.f64582o
                com.stripe.android.model.j0$b r1 = (com.stripe.android.model.j0.PaymentIntentType) r1
                java.lang.String r1 = r1.getClientSecret()
                f80.d r2 = r5.f64583p
                w30.l$c r2 = f80.d.c(r2)
                java.util.List r4 = p013kotlin.collections.v.e(r4)
                r5.f64581n = r3
                java.lang.Object r6 = r6.m(r1, r2, r4, r5)
                if (r6 != r0) goto L88
                goto L71
            L4d:
                boolean r1 = r6 instanceof com.stripe.android.model.j0.SetupIntentType
                if (r1 == 0) goto L72
                f80.d r6 = r5.f64583p
                z60.g r6 = f80.d.d(r6)
                com.stripe.android.model.j0 r1 = r5.f64582o
                com.stripe.android.model.j0$c r1 = (com.stripe.android.model.j0.SetupIntentType) r1
                java.lang.String r1 = r1.getClientSecret()
                f80.d r3 = r5.f64583p
                w30.l$c r3 = f80.d.c(r3)
                java.util.List r4 = p013kotlin.collections.v.e(r4)
                r5.f64581n = r2
                java.lang.Object r6 = r6.g(r1, r3, r4, r5)
                if (r6 != r0) goto L88
            L71:
                return r0
            L72:
                boolean r0 = r6 instanceof com.stripe.android.model.j0.DeferredIntentType
                if (r0 == 0) goto La5
                jn0.s$a r0 = jn0.s.INSTANCE
                com.stripe.android.model.j0$a r6 = (com.stripe.android.model.j0.DeferredIntentType) r6
                f80.d r0 = r5.f64583p
                w30.l$c r0 = f80.d.c(r0)
                com.stripe.android.model.StripeIntent r6 = f80.c.a(r6, r0)
                java.lang.Object r6 = jn0.s.b(r6)
            L88:
                java.lang.Throwable r0 = r5.f64584q
                boolean r1 = jn0.s.h(r6)
                if (r1 == 0) goto L9c
                com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
                com.stripe.android.model.h0$b r1 = com.stripe.android.model.ElementsSession.INSTANCE
                com.stripe.android.model.StripeIntent r6 = f80.c.b(r6)
                com.stripe.android.model.h0 r6 = r1.a(r6, r0)
            L9c:
                java.lang.Object r6 = jn0.s.b(r6)
                jn0.s r6 = jn0.s.a(r6)
                return r6
            La5:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f80.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<ElementsSession>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository", f = "ElementsSessionRepository.kt", i = {0, 0}, l = {60, 66}, m = "get-yxL6bBk", n = {"this", "params"}, s = {"L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f64585n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f64586o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f64587p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f64589r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64587p = obj;
            this.f64589r |= Integer.MIN_VALUE;
            Object objA = d.this.a(null, null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    public d(g stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(lazyPaymentConfig, "lazyPaymentConfig");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(j0 j0Var, Throwable th2, Continuation<? super s<ElementsSession>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f64580p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f64580p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f64578n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f64580p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            b bVar = new b(j0Var, this, th2, null);
            aVar.f64580p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.Options f() {
        return new l.Options(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f80.b
    public Object a(y.m mVar, y.CustomerConfiguration customerConfiguration, List<String> list, String str, Continuation<? super s<ElementsSession>> continuation) {
        c cVar;
        j0 j0VarD;
        Object objH;
        d dVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f64589r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f64589r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f64587p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f64589r;
        if (i12 == 0) {
            t.b(obj);
            j0VarD = f80.c.d(mVar, customerConfiguration, list, str);
            g gVar = this.stripeRepository;
            l.Options optionsF = f();
            cVar.f64585n = this;
            cVar.f64586o = j0VarD;
            cVar.f64589r = 1;
            objH = gVar.H(j0VarD, optionsF, cVar);
            if (objH != coroutine_suspended) {
                dVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        j0VarD = (j0) cVar.f64586o;
        dVar = (d) cVar.f64585n;
        t.b(obj);
        objH = ((s) obj).getValue();
        Throwable thE = s.e(objH);
        if (thE == null) {
            return objH;
        }
        cVar.f64585n = null;
        cVar.f64586o = null;
        cVar.f64589r = 2;
        Object objE = dVar.e(j0VarD, thE, cVar);
        return objE == coroutine_suspended ? coroutine_suspended : objE;
    }
}
