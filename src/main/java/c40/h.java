package c40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, d2 = {"Lc40/h;", "Lc40/n;", "Lc40/e;", "elementsSessionManager", "Lcom/stripe/android/paymentsheet/repositories/b;", "customerRepository", "Lh70/h;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lc40/e;Lcom/stripe/android/paymentsheet/repositories/b;Lh70/h;Lkotlin/coroutines/CoroutineContext;)V", "Lc40/j;", "", "Lcom/stripe/android/model/v0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentMethodId", "Lcom/stripe/android/model/a1;", "params", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lc40/e;", "Lcom/stripe/android/paymentsheet/repositories/b;", "c", "Lh70/h;", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e elementsSessionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.repositories.b customerRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$detachPaymentMethod$2", f = "CustomerSessionPaymentMethodDataSource.kt", i = {}, l = {58, 59}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super j<PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18678n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f18680p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18680p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new a(this.f18680p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
            if (r9 == r0) goto L20;
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
                int r1 = r8.f18678n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L18
                jn0.s r9 = (jn0.s) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L18
                goto L68
            L18:
                r9 = move-exception
                goto L72
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                jn0.t.b(r9)
                jn0.s r9 = (jn0.s) r9
                java.lang.Object r9 = r9.getValue()
                goto L3e
            L2c:
                jn0.t.b(r9)
                c40.h r9 = c40.h.this
                c40.e r9 = c40.h.f(r9)
                r8.f18678n = r3
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L3e
                goto L67
            L3e:
                c40.h r1 = c40.h.this
                java.lang.String r4 = r8.f18680p
                boolean r5 = jn0.s.h(r9)
                if (r5 == 0) goto L78
                c40.a r9 = (c40.CachedCustomerEphemeralKey) r9     // Catch: java.lang.Throwable -> L18
                com.stripe.android.paymentsheet.repositories.b r1 = c40.h.c(r1)     // Catch: java.lang.Throwable -> L18
                com.stripe.android.paymentsheet.repositories.b$a r5 = new com.stripe.android.paymentsheet.repositories.b$a     // Catch: java.lang.Throwable -> L18
                java.lang.String r6 = r9.getCustomerId()     // Catch: java.lang.Throwable -> L18
                java.lang.String r7 = r9.getEphemeralKey()     // Catch: java.lang.Throwable -> L18
                java.lang.String r9 = r9.getCustomerSessionClientSecret()     // Catch: java.lang.Throwable -> L18
                r5.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L18
                r8.f18678n = r2     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = r1.b(r5, r4, r3, r8)     // Catch: java.lang.Throwable -> L18
                if (r9 != r0) goto L68
            L67:
                return r0
            L68:
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L18
                com.stripe.android.model.v0 r9 = (com.stripe.android.model.PaymentMethod) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = jn0.s.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L7c
            L72:
                jn0.s$a r0 = jn0.s.INSTANCE
                java.lang.Object r9 = jn0.t.a(r9)
            L78:
                java.lang.Object r9 = jn0.s.b(r9)
            L7c:
                c40.j r9 = c40.k.c(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: c40.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super j<PaymentMethod>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$retrievePaymentMethods$2", f = "CustomerSessionPaymentMethodDataSource.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super j<List<? extends PaymentMethod>>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18681n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new b(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super j<List<? extends PaymentMethod>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super j<List<PaymentMethod>>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18681n;
            if (i11 == 0) {
                t.b(obj);
                e eVar = h.this.elementsSessionManager;
                this.f18681n = 1;
                objB = eVar.b(this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objB = ((s) obj).getValue();
            }
            if (s.h(objB)) {
                try {
                    objB2 = s.b(((CustomerSessionElementsSession) objB).getCustomer().a());
                } catch (Throwable th2) {
                    s.Companion companion = s.INSTANCE;
                    objB = t.a(th2);
                    objB2 = s.b(objB);
                }
            } else {
                objB2 = s.b(objB);
            }
            return k.c(objB2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super j<List<PaymentMethod>>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionPaymentMethodDataSource$updatePaymentMethod$2", f = "CustomerSessionPaymentMethodDataSource.kt", i = {}, l = {31, 32}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super j<PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18683n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f18685p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a1 f18686q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, a1 a1Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f18685p = str;
            this.f18686q = a1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new c(this.f18685p, this.f18686q, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (r9 == r0) goto L20;
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
                int r1 = r8.f18683n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L18
                jn0.s r9 = (jn0.s) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L18
                goto L6a
            L18:
                r9 = move-exception
                goto L74
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                jn0.t.b(r9)
                jn0.s r9 = (jn0.s) r9
                java.lang.Object r9 = r9.getValue()
                goto L3e
            L2c:
                jn0.t.b(r9)
                c40.h r9 = c40.h.this
                c40.e r9 = c40.h.f(r9)
                r8.f18683n = r3
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L3e
                goto L69
            L3e:
                c40.h r1 = c40.h.this
                java.lang.String r3 = r8.f18685p
                com.stripe.android.model.a1 r4 = r8.f18686q
                boolean r5 = jn0.s.h(r9)
                if (r5 == 0) goto L7a
                c40.a r9 = (c40.CachedCustomerEphemeralKey) r9     // Catch: java.lang.Throwable -> L18
                com.stripe.android.paymentsheet.repositories.b r1 = c40.h.c(r1)     // Catch: java.lang.Throwable -> L18
                com.stripe.android.paymentsheet.repositories.b$a r5 = new com.stripe.android.paymentsheet.repositories.b$a     // Catch: java.lang.Throwable -> L18
                java.lang.String r6 = r9.getCustomerId()     // Catch: java.lang.Throwable -> L18
                java.lang.String r7 = r9.getEphemeralKey()     // Catch: java.lang.Throwable -> L18
                java.lang.String r9 = r9.getCustomerSessionClientSecret()     // Catch: java.lang.Throwable -> L18
                r5.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L18
                r8.f18683n = r2     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = r1.a(r5, r3, r4, r8)     // Catch: java.lang.Throwable -> L18
                if (r9 != r0) goto L6a
            L69:
                return r0
            L6a:
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L18
                com.stripe.android.model.v0 r9 = (com.stripe.android.model.PaymentMethod) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = jn0.s.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L7e
            L74:
                jn0.s$a r0 = jn0.s.INSTANCE
                java.lang.Object r9 = jn0.t.a(r9)
            L7a:
                java.lang.Object r9 = jn0.s.b(r9)
            L7e:
                c40.j r9 = c40.k.c(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: c40.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super j<PaymentMethod>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public h(e elementsSessionManager, com.stripe.android.paymentsheet.repositories.b customerRepository, h70.h errorReporter, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(elementsSessionManager, "elementsSessionManager");
        p013kotlin.jvm.internal.s.k(customerRepository, "customerRepository");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.elementsSessionManager = elementsSessionManager;
        this.customerRepository = customerRepository;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // c40.n
    public Object a(Continuation<? super j<List<PaymentMethod>>> continuation) {
        return BuildersKt.withContext(this.workContext, new b(null), continuation);
    }

    @Override // c40.n
    public Object b(String str, Continuation<? super j<PaymentMethod>> continuation) {
        return BuildersKt.withContext(this.workContext, new a(str, null), continuation);
    }

    @Override // c40.n
    public Object d(String str, Continuation<? super j<PaymentMethod>> continuation) {
        h70.h.b.a(this.errorReporter, h70.h.f.CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION, null, null, 6, null);
        return j.INSTANCE.a(new IllegalStateException("'attach' is not supported for `CustomerSession`!"), null);
    }

    @Override // c40.n
    public Object e(String str, a1 a1Var, Continuation<? super j<PaymentMethod>> continuation) {
        return BuildersKt.withContext(this.workContext, new c(str, a1Var, null), continuation);
    }
}
