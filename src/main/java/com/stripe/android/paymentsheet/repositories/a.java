package com.stripe.android.paymentsheet.repositories;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import f30.PaymentConfiguration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import w30.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b \u0010!J@\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010%\u001a\u00020$H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J4\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020$H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J,\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J4\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/a;", "Lcom/stripe/android/paymentsheet/repositories/b;", "Lz60/g;", "stripeRepository", "Ljavax/inject/Provider;", "Lf30/o;", "lazyPaymentConfig", "Lo30/d;", "logger", "Lh70/h;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "", "", "productUsageTokens", "<init>", "(Lz60/g;Ljavax/inject/Provider;Lo30/d;Lh70/h;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V", "", "Lcom/stripe/android/model/v0;", "allPaymentMethods", "n", "(Ljava/util/List;)Ljava/util/List;", "paymentMethods", "o", "Lcom/stripe/android/paymentsheet/repositories/b$a;", "customerInfo", "paymentMethodId", "Ljn0/s;", "m", "(Lcom/stripe/android/paymentsheet/repositories/b;Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/a0;", "e", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/v0$p;", "types", "", "silentlyFail", "c", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canRemoveDuplicates", "b", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/a1;", "params", "a", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz60/g;", "Ljavax/inject/Provider;", "Lo30/d;", "Lh70/h;", "Lkotlin/coroutines/CoroutineContext;", "f", "Ljava/util/Set;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements com.stripe.android.paymentsheet.repositories.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Provider<PaymentConfiguration> lazyPaymentConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsageTokens;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.repositories.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {0, 0}, l = {147}, m = "attachPaymentMethod-0E7RQCE", n = {"this", "paymentMethodId"}, s = {"L$0", "L$1"})
    static final class C1044a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53510n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53511o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f53512p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53514r;

        C1044a(Continuation<? super C1044a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53512p = obj;
            this.f53514r |= Integer.MIN_VALUE;
            Object objD = a.this.d(null, null, this);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : s.a(objD);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {111, 117, 127}, m = "detachPaymentMethod-BWLJW6A", n = {"this", "paymentMethodId", "this", "paymentMethodId", "this", "paymentMethodId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53516o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f53517p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53519r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53517p = obj;
            this.f53519r |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, null, false, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {0, 0, 0, 0, 2, 2, 2, 2}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "detachPaymentMethodAndDuplicates-BWLJW6A", n = {"$this$detachPaymentMethodAndDuplicates_u2dBWLJW6A", "customerInfo", "paymentMethodId", "$this$detachPaymentMethodAndDuplicates_BWLJW6A_u24lambda_u2411", "$this$detachPaymentMethodAndDuplicates_u2dBWLJW6A", "customerInfo", "paymentMethodId", "failureResults"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53520n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53521o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f53522p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f53523q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f53524r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f53526t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53524r = obj;
            this.f53526t |= Integer.MIN_VALUE;
            Object objM = a.this.m(null, null, null, this);
            return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : s.a(objM);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1", f = "CustomerApiRepository.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m = "invokeSuspend", n = {"id"}, s = {"L$1"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53527n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53528o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f53529p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f53530q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.repositories.b f53531r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.repositories.b.CustomerInfo f53532s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List<DuplicatePaymentMethodDetachFailureException.a> f53533t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PaymentMethod paymentMethod, com.stripe.android.paymentsheet.repositories.b bVar, com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, List<DuplicatePaymentMethodDetachFailureException.a> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f53530q = paymentMethod;
            this.f53531r = bVar;
            this.f53532s = customerInfo;
            this.f53533t = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f53530q, this.f53531r, this.f53532s, this.f53533t, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends PaymentMethod>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<PaymentMethod>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object value;
            List<DuplicatePaymentMethodDetachFailureException.a> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53529p;
            if (i11 == 0) {
                t.b(obj);
                String str2 = this.f53530q.id;
                if (str2 == null) {
                    return null;
                }
                com.stripe.android.paymentsheet.repositories.b bVar = this.f53531r;
                com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo = this.f53532s;
                List<DuplicatePaymentMethodDetachFailureException.a> list2 = this.f53533t;
                this.f53527n = list2;
                this.f53528o = str2;
                this.f53529p = 1;
                Object objB = bVar.b(customerInfo, str2, false, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                value = objB;
                list = list2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f53528o;
                list = (List) this.f53527n;
                t.b(obj);
                value = ((s) obj).getValue();
            }
            Throwable thE = s.e(value);
            if (thE != null) {
                list.add(new DuplicatePaymentMethodDetachFailureException.a(str, thE));
            }
            return s.a(value);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<PaymentMethod>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {}, l = {56}, m = "getPaymentMethods-BWLJW6A", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f53534n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f53536p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53534n = obj;
            this.f53536p |= Integer.MIN_VALUE;
            Object objC = a.this.c(null, null, false, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : s.a(objC);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2", f = "CustomerApiRepository.kt", i = {0}, l = {89}, m = "invokeSuspend", n = {"paymentMethods"}, s = {"L$0"})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends List<? extends PaymentMethod>>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53537n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f53538o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<PaymentMethod.p> f53539p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a f53540q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.repositories.b.CustomerInfo f53541r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f53542s;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.repositories.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$requests$2$1", f = "CustomerApiRepository.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        static final class C1045a extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends List<? extends PaymentMethod>>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f53543n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ a f53544o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.repositories.b.CustomerInfo f53545p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ PaymentMethod.p f53546q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1045a(a aVar, com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, PaymentMethod.p pVar, Continuation<? super C1045a> continuation) {
                super(2, continuation);
                this.f53544o = aVar;
                this.f53545p = customerInfo;
                this.f53546q = pVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1045a(this.f53544o, this.f53545p, this.f53546q, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends List<? extends PaymentMethod>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super s<? extends List<PaymentMethod>>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objC;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f53543n;
                if (i11 == 0) {
                    t.b(obj);
                    z60.g gVar = this.f53544o.stripeRepository;
                    ListPaymentMethodsParams listPaymentMethodsParams = new ListPaymentMethodsParams(this.f53545p.getId(), this.f53546q, Boxing.boxInt(100), null, null, 24, null);
                    Set<String> set = this.f53544o.productUsageTokens;
                    l.Options options = new l.Options(this.f53545p.getEphemeralKeySecret(), ((PaymentConfiguration) this.f53544o.lazyPaymentConfig.get()).getStripeAccountId(), null, 4, null);
                    this.f53543n = 1;
                    objC = gVar.C(listPaymentMethodsParams, set, options, this);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objC = ((s) obj).getValue();
                }
                a aVar = this.f53544o;
                Throwable thE = s.e(objC);
                if (thE != null) {
                    aVar.logger.error("Failed to retrieve payment methods.", thE);
                    h70.h.b.a(aVar.errorReporter, h70.h.d.GET_SAVED_PAYMENT_METHODS_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
                }
                a aVar2 = this.f53544o;
                if (s.h(objC)) {
                    h70.h.b.a(aVar2.errorReporter, h70.h.e.GET_SAVED_PAYMENT_METHODS_SUCCESS, null, null, 6, null);
                }
                return s.a(objC);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<? extends List<PaymentMethod>>> continuation) {
                return ((C1045a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(List<? extends PaymentMethod.p> list, a aVar, com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, boolean z11, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f53539p = list;
            this.f53540q = aVar;
            this.f53541r = customerInfo;
            this.f53542s = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f53539p, this.f53540q, this.f53541r, this.f53542s, continuation);
            fVar.f53538o = obj;
            return fVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends List<? extends PaymentMethod>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<? extends List<PaymentMethod>>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53537n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f53538o;
                List<PaymentMethod.p> list2 = this.f53539p;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (d1.i(PaymentMethod.p.Card, PaymentMethod.p.USBankAccount, PaymentMethod.p.SepaDebit).contains((PaymentMethod.p) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                a aVar = this.f53540q;
                com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo = this.f53541r;
                ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C1045a(aVar, customerInfo, (PaymentMethod.p) it.next(), null), 3, null));
                }
                ArrayList arrayList3 = new ArrayList();
                this.f53538o = arrayList3;
                this.f53537n = 1;
                Object objAwaitAll = AwaitKt.awaitAll(arrayList2, this);
                if (objAwaitAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = arrayList3;
                obj = objAwaitAll;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f53538o;
                t.b(obj);
            }
            a aVar2 = this.f53540q;
            boolean z11 = this.f53542s;
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                Object value = ((s) it2.next()).getValue();
                Throwable thE = s.e(value);
                if (thE == null) {
                    list.addAll(aVar2.n((List) value));
                } else if (!z11) {
                    return s.a(s.b(t.a(thE)));
                }
            }
            return s.a(s.b(list));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<? extends List<PaymentMethod>>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {}, l = {42}, m = "retrieveCustomer", n = {}, s = {})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f53547n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f53549p;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53547n = obj;
            this.f53549p |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {0, 0}, l = {164}, m = "updatePaymentMethod-BWLJW6A", n = {"this", "paymentMethodId"}, s = {"L$0", "L$1"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53550n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53551o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f53552p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53554r;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53552p = obj;
            this.f53554r |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    public a(z60.g stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, o30.d logger, h70.h errorReporter, CoroutineContext workContext, Set<String> productUsageTokens) {
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(lazyPaymentConfig, "lazyPaymentConfig");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(productUsageTokens, "productUsageTokens");
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.logger = logger;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object m(com.stripe.android.paymentsheet.repositories.b bVar, com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, String str, Continuation<? super s<PaymentMethod>> continuation) {
        c cVar;
        CoroutineScope CoroutineScope;
        Object objC;
        com.stripe.android.paymentsheet.repositories.b bVar2;
        String str2;
        Object next;
        String str3;
        List list;
        com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo2;
        com.stripe.android.paymentsheet.repositories.b bVar3;
        Object objB;
        com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo3 = customerInfo;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f53526t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f53526t = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f53524r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f53526t;
        if (i12 == 0) {
            t.b(obj);
            CoroutineScope = CoroutineScopeKt.CoroutineScope(this.workContext);
            List<? extends PaymentMethod.p> listE = v.e(PaymentMethod.p.Card);
            cVar.f53520n = bVar;
            cVar.f53521o = customerInfo3;
            cVar.f53522p = str;
            cVar.f53523q = CoroutineScope;
            cVar.f53526t = 1;
            objC = bVar.c(customerInfo3, listE, false, cVar);
            if (objC != coroutine_suspended) {
                bVar2 = bVar;
                str2 = str;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            CoroutineScope coroutineScope = (CoroutineScope) cVar.f53523q;
            String str4 = (String) cVar.f53522p;
            com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo4 = (com.stripe.android.paymentsheet.repositories.b.CustomerInfo) cVar.f53521o;
            com.stripe.android.paymentsheet.repositories.b bVar4 = (com.stripe.android.paymentsheet.repositories.b) cVar.f53520n;
            t.b(obj);
            Object value = ((s) obj).getValue();
            CoroutineScope = coroutineScope;
            str2 = str4;
            customerInfo3 = customerInfo4;
            objC = value;
            bVar2 = bVar4;
        } else {
            if (i12 == 2) {
                t.b(obj);
                return ((s) obj).getValue();
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return ((s) obj).getValue();
            }
            list = (List) cVar.f53523q;
            str3 = (String) cVar.f53522p;
            customerInfo2 = (com.stripe.android.paymentsheet.repositories.b.CustomerInfo) cVar.f53521o;
            bVar3 = (com.stripe.android.paymentsheet.repositories.b) cVar.f53520n;
            t.b(obj);
        }
        if (!list.isEmpty()) {
            s.Companion companion = s.INSTANCE;
            return s.b(t.a(new DuplicatePaymentMethodDetachFailureException(list)));
        }
        cVar.f53520n = null;
        cVar.f53521o = null;
        cVar.f53522p = null;
        cVar.f53523q = null;
        cVar.f53526t = 4;
        objB = bVar3.b(customerInfo2, str3, false, cVar);
        if (objB != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objB;
        Throwable thE = s.e(objC);
        if (thE != null) {
            return s.b(t.a(thE));
        }
        List list2 = (List) objC;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((PaymentMethod) next).id, str2));
        PaymentMethod paymentMethod = (PaymentMethod) next;
        if (paymentMethod == null) {
            cVar.f53520n = null;
            cVar.f53521o = null;
            cVar.f53522p = null;
            cVar.f53523q = null;
            cVar.f53526t = 2;
            Object objB2 = bVar2.b(customerInfo3, str2, false, cVar);
            if (objB2 != coroutine_suspended) {
                return objB2;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                PaymentMethod paymentMethod2 = (PaymentMethod) obj2;
                if (paymentMethod2.type == PaymentMethod.p.Card) {
                    PaymentMethod.Card card = paymentMethod2.card;
                    String str5 = card != null ? card.fingerprint : null;
                    PaymentMethod.Card card2 = paymentMethod.card;
                    if (p013kotlin.jvm.internal.s.f(str5, card2 != null ? card2.fingerprint : null) && !p013kotlin.jvm.internal.s.f(paymentMethod2.id, str2)) {
                        arrayList.add(obj2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(v.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo5 = customerInfo3;
                d dVar = new d((PaymentMethod) it2.next(), bVar2, customerInfo5, arrayList2, null);
                CoroutineScope coroutineScope2 = CoroutineScope;
                arrayList3.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, dVar, 3, null));
                arrayList2 = arrayList2;
                customerInfo3 = customerInfo5;
                CoroutineScope = coroutineScope2;
            }
            com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo6 = customerInfo3;
            ArrayList arrayList4 = arrayList2;
            cVar.f53520n = bVar2;
            cVar.f53521o = customerInfo6;
            cVar.f53522p = str2;
            cVar.f53523q = arrayList4;
            cVar.f53526t = 3;
            if (AwaitKt.awaitAll(arrayList3, cVar) != coroutine_suspended) {
                str3 = str2;
                list = arrayList4;
                customerInfo2 = customerInfo6;
                bVar3 = bVar2;
                if (!list.isEmpty()) {
                    s.Companion companion2 = s.INSTANCE;
                    return s.b(t.a(new DuplicatePaymentMethodDetachFailureException(list)));
                }
                cVar.f53520n = null;
                cVar.f53521o = null;
                cVar.f53522p = null;
                cVar.f53523q = null;
                cVar.f53526t = 4;
                objB = bVar3.b(customerInfo2, str3, false, cVar);
                if (objB != coroutine_suspended) {
                    return objB;
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    public final List<PaymentMethod> n(List<PaymentMethod> allPaymentMethods) {
        boolean z11;
        y60.a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(o(allPaymentMethods));
        Set setI = d1.i(y60.a.g.ApplePay, y60.a.g.GooglePay, y60.a.g.SamsungPay, y60.a.g.Link);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : allPaymentMethods) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (paymentMethod.type == PaymentMethod.p.Card) {
                Set set = setI;
                PaymentMethod.Card card = paymentMethod.card;
                if (v.g0(set, (card == null || (aVar = card.wallet) == null) ? null : aVar.getWalletType())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (!z11) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private final List<PaymentMethod> o(List<PaymentMethod> paymentMethods) {
        com.stripe.android.model.h hVar;
        y60.a aVar;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentMethods.iterator();
        while (true) {
            y60.a.g walletType = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            PaymentMethod paymentMethod = (PaymentMethod) next;
            if (paymentMethod.type == PaymentMethod.p.Card) {
                PaymentMethod.Card card = paymentMethod.card;
                if (card != null && (aVar = card.wallet) != null) {
                    walletType = aVar.getWalletType();
                }
                if (walletType == y60.a.g.Link) {
                    arrayList.add(next);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            PaymentMethod.Card card2 = ((PaymentMethod) obj).card;
            if (hashSet.add((card2 != null ? card2.last4 : null) + "-" + (card2 != null ? card2.expiryMonth : null) + "-" + (card2 != null ? card2.expiryYear : null) + "-" + ((card2 == null || (hVar = card2.brand) == null) ? null : hVar.getCode()))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.paymentsheet.repositories.b
    public Object a(com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, String str, a1 a1Var, Continuation<? super s<PaymentMethod>> continuation) {
        h hVar;
        Object objE;
        a aVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f53554r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f53554r = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.f53552p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f53554r;
        if (i12 == 0) {
            t.b(obj);
            z60.g gVar = this.stripeRepository;
            l.Options options = new l.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
            hVar.f53550n = this;
            hVar.f53551o = str;
            hVar.f53554r = 1;
            objE = gVar.e(str, a1Var, options, hVar);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) hVar.f53551o;
            aVar = (a) hVar.f53550n;
            t.b(obj);
            objE = ((s) obj).getValue();
        }
        Throwable thE = s.e(objE);
        if (thE != null) {
            aVar.logger.error("Failed to update payment method " + str + ".", thE);
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r0 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r0 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r0 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        r2 = r13;
        r1 = r15;
     */
    @Override // com.stripe.android.paymentsheet.repositories.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.stripe.android.paymentsheet.repositories.b.CustomerInfo r14, java.lang.String r15, boolean r16, p013kotlin.coroutines.Continuation<? super jn0.s<com.stripe.android.model.PaymentMethod>> r17) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.repositories.a.b(com.stripe.android.paymentsheet.repositories.b$a, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.paymentsheet.repositories.b
    public Object c(com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, List<? extends PaymentMethod.p> list, boolean z11, Continuation<? super s<? extends List<PaymentMethod>>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f53536p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f53536p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithContext = eVar.f53534n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f53536p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            f fVar = new f(list, this, customerInfo, z11, null);
            eVar.f53536p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, fVar, eVar);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.stripe.android.paymentsheet.repositories.b
    public Object d(com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, String str, Continuation<? super s<PaymentMethod>> continuation) {
        C1044a c1044a;
        Object objY;
        a aVar;
        String str2;
        if (continuation instanceof C1044a) {
            c1044a = (C1044a) continuation;
            int i11 = c1044a.f53514r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1044a.f53514r = i11 - Integer.MIN_VALUE;
            } else {
                c1044a = new C1044a(continuation);
            }
        } else {
            c1044a = new C1044a(continuation);
        }
        C1044a c1044a2 = c1044a;
        Object obj = c1044a2.f53512p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1044a2.f53514r;
        if (i12 == 0) {
            t.b(obj);
            z60.g gVar = this.stripeRepository;
            String id2 = customerInfo.getId();
            Set<String> set = this.productUsageTokens;
            l.Options options = new l.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
            c1044a2.f53510n = this;
            c1044a2.f53511o = str;
            c1044a2.f53514r = 1;
            objY = gVar.y(id2, set, str, options, c1044a2);
            if (objY == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
            str2 = str;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c1044a2.f53511o;
            aVar = (a) c1044a2.f53510n;
            t.b(obj);
            objY = ((s) obj).getValue();
        }
        Throwable thE = s.e(objY);
        if (thE != null) {
            aVar.logger.error("Failed to attach payment method " + str2 + ".", thE);
        }
        return objY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.paymentsheet.repositories.b
    public Object e(com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo, Continuation<? super Customer> continuation) {
        g gVar;
        Object objQ;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f53549p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f53549p = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f53547n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f53549p;
        if (i12 == 0) {
            t.b(obj);
            z60.g gVar2 = this.stripeRepository;
            String id2 = customerInfo.getId();
            Set<String> set = this.productUsageTokens;
            l.Options options = new l.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
            gVar.f53549p = 1;
            objQ = gVar2.q(id2, set, options, gVar);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objQ = ((s) obj).getValue();
        }
        if (s.g(objQ)) {
            return null;
        }
        return objQ;
    }
}
