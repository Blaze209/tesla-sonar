package com.stripe.android.customersheet;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ch.qos.logback.core.spi.ComponentTracker;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001\u001eBg\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\tH\u0096@¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\tH\u0096@¢\u0006\u0004\b#\u0010\"J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b&\u0010'J \u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001c2\b\u0010)\u001a\u0004\u0018\u00010(H\u0096@¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u001cH\u0096@¢\u0006\u0004\b-\u0010\u001fJ\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH\u0096@¢\u0006\u0004\b.\u0010\u001fJ\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0080@¢\u0006\u0004\b/\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b5\u00106R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010C¨\u0006F"}, d2 = {"Lcom/stripe/android/customersheet/s;", "Lcom/stripe/android/customersheet/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/customersheet/c;", "customerEphemeralKeyProvider", "Lcom/stripe/android/customersheet/r;", "setupIntentClientSecretProvider", "", "", "paymentMethodTypes", "Lkotlin/Function0;", "", "timeProvider", "Lcom/stripe/android/paymentsheet/repositories/b;", "customerRepository", "Lkotlin/Function1;", "La40/a;", "Ln70/r;", "prefsRepositoryFactory", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Landroid/content/Context;Lcom/stripe/android/customersheet/c;Lcom/stripe/android/customersheet/r;Ljava/util/List;Lwn0/a;Lcom/stripe/android/paymentsheet/repositories/b;Lwn0/l;Lkotlin/coroutines/CoroutineContext;)V", "cacheDate", "", "m", "(J)Z", "Lcom/stripe/android/customersheet/b$c;", "Lcom/stripe/android/model/v0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethodId", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/stripe/android/model/a1;", "params", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/customersheet/b$b;", "paymentOption", "Ljn0/h0;", "u", "(Lcom/stripe/android/customersheet/b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "w", "l", "Landroid/content/Context;", "c", "Lcom/stripe/android/customersheet/c;", "Lcom/stripe/android/customersheet/r;", "Ljava/util/List;", "t", "()Ljava/util/List;", "f", "Lwn0/a;", "g", "Lcom/stripe/android/paymentsheet/repositories/b;", "h", "Lwn0/l;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/customersheet/a;", "j", "Lcom/stripe/android/customersheet/a;", "cachedCustomerEphemeralKey", "()Z", "canCreateSetupIntents", "k", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s implements com.stripe.android.customersheet.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50049l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List<PaymentMethod.p> f50050m = v.p(PaymentMethod.p.Card, PaymentMethod.p.USBankAccount);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.c customerEphemeralKeyProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r setupIntentClientSecretProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<String> paymentMethodTypes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Long> timeProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.repositories.b customerRepository;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<a40.a, n70.r> prefsRepositoryFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private volatile CachedCustomerEphemeralKey cachedCustomerEphemeralKey;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 1}, l = {84, 85}, m = "attachPaymentMethod", n = {"this", "paymentMethodId", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50060n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50061o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f50062p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50064r;

        b(Continuation<b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50062p = obj;
            this.f50064r |= Integer.MIN_VALUE;
            return s.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 1}, l = {104, 105}, m = "detachPaymentMethod", n = {"this", "paymentMethodId", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50065n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50066o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f50067p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50069r;

        c(Continuation<c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50067p = obj;
            this.f50069r |= Integer.MIN_VALUE;
            return s.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/customersheet/b$c;", "La40/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter$getCustomerEphemeralKey$2", f = "StripeCustomerAdapter.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super com.stripe.android.customersheet.b.c<a40.a>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50070n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f50071o;

        d(Continuation<d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = s.this.new d(continuation);
            dVar.f50071o = obj;
            return dVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super com.stripe.android.customersheet.b.c<a40.a>> continuation) {
            return invoke2(coroutineScope, (Continuation<com.stripe.android.customersheet.b.c<a40.a>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            s sVar;
            com.stripe.android.customersheet.b.c<a40.a> cVarB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50070n;
            if (i11 == 0) {
                t.b(obj);
                CachedCustomerEphemeralKey aVar = s.this.cachedCustomerEphemeralKey;
                s sVar2 = s.this;
                if (aVar == null || sVar2.m(aVar.getDate())) {
                    aVar = null;
                }
                if (aVar != null && (cVarB = aVar.b()) != null) {
                    return cVarB;
                }
                s sVar3 = s.this;
                com.stripe.android.customersheet.c cVar = sVar3.customerEphemeralKeyProvider;
                this.f50071o = sVar3;
                this.f50070n = 1;
                Object objA = cVar.a(this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sVar = sVar3;
                obj = objA;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) this.f50071o;
                t.b(obj);
            }
            CachedCustomerEphemeralKey aVar2 = new CachedCustomerEphemeralKey((com.stripe.android.customersheet.b.c) obj, ((Number) sVar.timeProvider.invoke()).longValue());
            sVar.cachedCustomerEphemeralKey = aVar2;
            return aVar2.b();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<com.stripe.android.customersheet.b.c<a40.a>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 1}, l = {63, 64}, m = "retrievePaymentMethods", n = {"this", "requestedTypes", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50073n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50074o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f50075p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50077r;

        e(Continuation<e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50075p = obj;
            this.f50077r |= Integer.MIN_VALUE;
            return s.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0}, l = {164, 166}, m = "retrieveSelectedPaymentOption", n = {"this"}, s = {"L$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50078n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f50079o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f50081q;

        f(Continuation<f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50079o = obj;
            this.f50081q |= Integer.MIN_VALUE;
            return s.this.v(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0}, l = {147, 149}, m = "setSelectedPaymentOption", n = {"this", "paymentOption"}, s = {"L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50082n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50083o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f50084p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50086r;

        g(Continuation<g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50084p = obj;
            this.f50086r |= Integer.MIN_VALUE;
            return s.this.u(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/customersheet/b$c;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter$setSelectedPaymentOption$2$1", f = "StripeCustomerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super com.stripe.android.customersheet.b.c<h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50087n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ n70.r f50088o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.b.AbstractC0802b f50089p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ s f50090q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n70.r rVar, com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b, s sVar, Continuation<h> continuation) {
            super(2, continuation);
            this.f50088o = rVar;
            this.f50089p = abstractC0802b;
            this.f50090q = sVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f50088o, this.f50089p, this.f50090q, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super com.stripe.android.customersheet.b.c<h0>> continuation) {
            return invoke2(coroutineScope, (Continuation<com.stripe.android.customersheet.b.c<h0>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f50087n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            n70.r rVar = this.f50088o;
            com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b = this.f50089p;
            if (rVar.a(abstractC0802b != null ? abstractC0802b.c() : null)) {
                return com.stripe.android.customersheet.b.c.INSTANCE.b(h0.f84049a);
            }
            return com.stripe.android.customersheet.b.c.INSTANCE.a(new IOException("Unable to persist payment option " + this.f50089p), this.f50090q.context.getString(x.f93523k0));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<com.stripe.android.customersheet.b.c<h0>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0}, l = {183, 184}, m = "setupIntentClientSecretForCustomerAttach", n = {"this"}, s = {"L$0"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50091n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f50092o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f50094q;

        i(Continuation<i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50092o = obj;
            this.f50094q |= Integer.MIN_VALUE;
            return s.this.w(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 0, 1}, l = {126, 127}, m = "updatePaymentMethod", n = {"this", "paymentMethodId", "params", "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50095n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50096o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f50097p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f50098q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f50100s;

        j(Continuation<j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50098q = obj;
            this.f50100s |= Integer.MIN_VALUE;
            return s.this.e(null, null, this);
        }
    }

    public s(Context context, com.stripe.android.customersheet.c customerEphemeralKeyProvider, r rVar, List<String> list, wn0.a<Long> timeProvider, com.stripe.android.paymentsheet.repositories.b customerRepository, wn0.l<a40.a, n70.r> prefsRepositoryFactory, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(customerEphemeralKeyProvider, "customerEphemeralKeyProvider");
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        p013kotlin.jvm.internal.s.k(customerRepository, "customerRepository");
        p013kotlin.jvm.internal.s.k(prefsRepositoryFactory, "prefsRepositoryFactory");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.context = context;
        this.customerEphemeralKeyProvider = customerEphemeralKeyProvider;
        this.setupIntentClientSecretProvider = rVar;
        this.paymentMethodTypes = list;
        this.timeProvider = timeProvider;
        this.customerRepository = customerRepository;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(long cacheDate) {
        return cacheDate + ComponentTracker.DEFAULT_TIMEOUT < this.timeProvider.invoke().longValue();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.stripe.android.customersheet.b
    public Object a(Continuation<com.stripe.android.customersheet.b.c<List<PaymentMethod>>> continuation) {
        e eVar;
        List listM;
        List<PaymentMethod.p> arrayList;
        s sVar;
        Object objC;
        s sVar2;
        com.stripe.android.customersheet.b.c.Companion aVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f50077r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f50077r = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objL = eVar.f50075p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f50077r;
        if (i12 != 0) {
            if (i12 == 1) {
                arrayList = (List) eVar.f50074o;
                sVar = (s) eVar.f50073n;
                t.b(objL);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (com.stripe.android.customersheet.b.c.Companion) eVar.f50074o;
                sVar2 = (s) eVar.f50073n;
                t.b(objL);
                objC = ((jn0.s) objL).getValue();
            }
            Throwable thE = jn0.s.e(objC);
            return thE == null ? aVar.b((List) objC) : com.stripe.android.customersheet.b.c.INSTANCE.a(thE, l30.a.a(thE, sVar2.context));
        }
        t.b(objL);
        List<String> listT = t();
        if (listT != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listT) {
                if (PaymentMethod.p.INSTANCE.a((String) obj) == null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
            if (arrayList3 != null) {
                return com.stripe.android.customersheet.b.c.INSTANCE.a(new IllegalStateException("Invalid payment method types provided (" + v.y0(arrayList3, null, null, null, 0, null, null, 63, null) + ")."), null);
            }
        }
        List<PaymentMethod.p> list = f50050m;
        ArrayList arrayList4 = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList4.add(((PaymentMethod.p) it.next()).code);
        }
        Set setR1 = v.r1(arrayList4);
        List<String> listT2 = t();
        if (listT2 == null || (listM = v.L0(listT2, setR1)) == null) {
            listM = v.m();
        }
        if (!listM.isEmpty()) {
            return com.stripe.android.customersheet.b.c.INSTANCE.a(new IllegalStateException("Unsupported payment method types provided (" + v.y0(listM, null, null, null, 0, null, null, 63, null) + ")."), null);
        }
        List<String> listT3 = t();
        if (listT3 == null || listT3.isEmpty()) {
            arrayList = f50050m;
        } else {
            List<String> listT4 = t();
            arrayList = new ArrayList<>();
            Iterator<T> it2 = listT4.iterator();
            while (it2.hasNext()) {
                PaymentMethod.p pVarA = PaymentMethod.p.INSTANCE.a((String) it2.next());
                if (pVarA != null) {
                    arrayList.add(pVarA);
                }
            }
        }
        eVar.f50073n = this;
        eVar.f50074o = arrayList;
        eVar.f50077r = 1;
        objL = l(eVar);
        if (objL != coroutine_suspended) {
            sVar = this;
        }
        return coroutine_suspended;
        com.stripe.android.customersheet.b.c cVar = (com.stripe.android.customersheet.b.c) objL;
        if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0805c)) {
            if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
            return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
        }
        com.stripe.android.customersheet.b.c.Companion aVar2 = com.stripe.android.customersheet.b.c.INSTANCE;
        a40.a aVar3 = (a40.a) ((com.stripe.android.customersheet.b.c.C0805c) cVar).a();
        com.stripe.android.paymentsheet.repositories.b bVar = sVar.customerRepository;
        com.stripe.android.paymentsheet.repositories.b.CustomerInfo aVar4 = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(aVar3.getCustomerId(), aVar3.getEphemeralKey(), null);
        eVar.f50073n = sVar;
        eVar.f50074o = aVar2;
        eVar.f50077r = 2;
        objC = bVar.c(aVar4, arrayList, false, eVar);
        if (objC != coroutine_suspended) {
            sVar2 = sVar;
            aVar = aVar2;
            Throwable thE2 = jn0.s.e(objC);
            if (thE2 == null) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0031, B:30:0x0092, B:32:0x0098, B:33:0x009f, B:26:0x0069), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0031, B:30:0x0092, B:32:0x0098, B:33:0x009f, B:26:0x0069), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.customersheet.b
    public Object b(String str, Continuation<com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
        c cVar;
        s sVar;
        Object objB;
        s sVar2;
        com.stripe.android.customersheet.b.c.Companion aVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f50069r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f50069r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objL = cVar.f50067p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f50069r;
        try {
            if (i12 == 0) {
                t.b(objL);
                cVar.f50065n = this;
                cVar.f50066o = str;
                cVar.f50069r = 1;
                objL = l(cVar);
                if (objL != coroutine_suspended) {
                    sVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                str = (String) cVar.f50066o;
                sVar = (s) cVar.f50065n;
                t.b(objL);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (com.stripe.android.customersheet.b.c.Companion) cVar.f50066o;
                sVar2 = (s) cVar.f50065n;
                t.b(objL);
                objB = ((jn0.s) objL).getValue();
            }
            Throwable thE = jn0.s.e(objB);
            return thE == null ? aVar.b((PaymentMethod) objB) : com.stripe.android.customersheet.b.c.INSTANCE.a(thE, l30.a.a(thE, sVar2.context));
            com.stripe.android.customersheet.b.c cVar2 = (com.stripe.android.customersheet.b.c) objL;
            if (!(cVar2 instanceof com.stripe.android.customersheet.b.c.C0805c)) {
                if (!(cVar2 instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar2;
                return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
            }
            com.stripe.android.customersheet.b.c.Companion aVar2 = com.stripe.android.customersheet.b.c.INSTANCE;
            a40.a aVar3 = (a40.a) ((com.stripe.android.customersheet.b.c.C0805c) cVar2).a();
            com.stripe.android.paymentsheet.repositories.b bVar = sVar.customerRepository;
            com.stripe.android.paymentsheet.repositories.b.CustomerInfo aVar4 = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(aVar3.getCustomerId(), aVar3.getEphemeralKey(), null);
            cVar.f50065n = sVar;
            cVar.f50066o = aVar2;
            cVar.f50069r = 2;
            objB = bVar.b(aVar4, str, false, cVar);
            if (objB != coroutine_suspended) {
                sVar2 = sVar;
                aVar = aVar2;
                Throwable thE2 = jn0.s.e(objB);
                if (thE2 == null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            return com.stripe.android.customersheet.b.c.INSTANCE.a(th2, null);
        }
    }

    @Override // com.stripe.android.customersheet.b
    public boolean c() {
        return this.setupIntentClientSecretProvider != null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.customersheet.b
    public Object d(String str, Continuation<com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
        b bVar;
        s sVar;
        Object objD;
        s sVar2;
        com.stripe.android.customersheet.b.c.Companion aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f50064r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f50064r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objL = bVar.f50062p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f50064r;
        if (i12 == 0) {
            t.b(objL);
            bVar.f50060n = this;
            bVar.f50061o = str;
            bVar.f50064r = 1;
            objL = l(bVar);
            if (objL != coroutine_suspended) {
                sVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = (String) bVar.f50061o;
            sVar = (s) bVar.f50060n;
            t.b(objL);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (com.stripe.android.customersheet.b.c.Companion) bVar.f50061o;
            sVar2 = (s) bVar.f50060n;
            t.b(objL);
            objD = ((jn0.s) objL).getValue();
        }
        Throwable thE = jn0.s.e(objD);
        return thE == null ? aVar.b((PaymentMethod) objD) : com.stripe.android.customersheet.b.c.INSTANCE.a(thE, l30.a.a(thE, sVar2.context));
        com.stripe.android.customersheet.b.c cVar = (com.stripe.android.customersheet.b.c) objL;
        if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0805c)) {
            if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
            return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
        }
        com.stripe.android.customersheet.b.c.Companion aVar2 = com.stripe.android.customersheet.b.c.INSTANCE;
        a40.a aVar3 = (a40.a) ((com.stripe.android.customersheet.b.c.C0805c) cVar).a();
        com.stripe.android.paymentsheet.repositories.b bVar2 = sVar.customerRepository;
        com.stripe.android.paymentsheet.repositories.b.CustomerInfo aVar4 = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(aVar3.getCustomerId(), aVar3.getEphemeralKey(), null);
        bVar.f50060n = sVar;
        bVar.f50061o = aVar2;
        bVar.f50064r = 2;
        objD = bVar2.d(aVar4, str, bVar);
        if (objD != coroutine_suspended) {
            sVar2 = sVar;
            aVar = aVar2;
            Throwable thE2 = jn0.s.e(objD);
            if (thE2 == null) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0031, B:30:0x009f, B:32:0x00a5, B:33:0x00ac, B:26:0x0076), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0031, B:30:0x009f, B:32:0x00a5, B:33:0x00ac, B:26:0x0076), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.customersheet.b
    public Object e(String str, a1 a1Var, Continuation<com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
        j jVar;
        Object obj;
        a1 a1Var2;
        s sVar;
        Object objA;
        com.stripe.android.customersheet.b.c.Companion aVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f50100s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f50100s = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj2 = jVar.f50098q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f50100s;
        try {
            if (i12 == 0) {
                t.b(obj2);
                jVar.f50095n = this;
                jVar.f50096o = str;
                jVar.f50097p = a1Var;
                jVar.f50100s = 1;
                Object objL = l(jVar);
                if (objL != coroutine_suspended) {
                    obj = objL;
                    a1Var2 = a1Var;
                    sVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                a1 a1Var3 = (a1) jVar.f50097p;
                str = (String) jVar.f50096o;
                s sVar2 = (s) jVar.f50095n;
                t.b(obj2);
                a1Var2 = a1Var3;
                sVar = sVar2;
                obj = obj2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (com.stripe.android.customersheet.b.c.Companion) jVar.f50096o;
                sVar = (s) jVar.f50095n;
                t.b(obj2);
                objA = ((jn0.s) obj2).getValue();
            }
            Throwable thE = jn0.s.e(objA);
            return thE == null ? aVar.b((PaymentMethod) objA) : com.stripe.android.customersheet.b.c.INSTANCE.a(thE, l30.a.a(thE, sVar.context));
            com.stripe.android.customersheet.b.c cVar = (com.stripe.android.customersheet.b.c) obj;
            if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0805c)) {
                if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
                return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
            }
            com.stripe.android.customersheet.b.c.Companion aVar2 = com.stripe.android.customersheet.b.c.INSTANCE;
            a40.a aVar3 = (a40.a) ((com.stripe.android.customersheet.b.c.C0805c) cVar).a();
            com.stripe.android.paymentsheet.repositories.b bVar = sVar.customerRepository;
            com.stripe.android.paymentsheet.repositories.b.CustomerInfo aVar4 = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(aVar3.getCustomerId(), aVar3.getEphemeralKey(), null);
            jVar.f50095n = sVar;
            jVar.f50096o = aVar2;
            jVar.f50097p = null;
            jVar.f50100s = 2;
            objA = bVar.a(aVar4, str, a1Var2, jVar);
            if (objA != coroutine_suspended) {
                aVar = aVar2;
                Throwable thE2 = jn0.s.e(objA);
                if (thE2 == null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            return com.stripe.android.customersheet.b.c.INSTANCE.a(th2, null);
        }
    }

    public final Object l(Continuation<com.stripe.android.customersheet.b.c<a40.a>> continuation) {
        return BuildersKt.withContext(this.workContext, new d(null), continuation);
    }

    @Override // com.stripe.android.customersheet.b
    public List<String> t() {
        return this.paymentMethodTypes;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.customersheet.b
    public Object u(com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b, Continuation<com.stripe.android.customersheet.b.c<h0>> continuation) {
        g gVar;
        s sVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f50086r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f50086r = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objL = gVar.f50084p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f50086r;
        try {
            if (i12 == 0) {
                t.b(objL);
                gVar.f50082n = this;
                gVar.f50083o = abstractC0802b;
                gVar.f50086r = 1;
                objL = l(gVar);
                if (objL != coroutine_suspended) {
                    sVar = this;
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(objL);
                return objL;
            }
            abstractC0802b = (com.stripe.android.customersheet.b.AbstractC0802b) gVar.f50083o;
            sVar = (s) gVar.f50082n;
            t.b(objL);
            com.stripe.android.customersheet.b.c cVar = (com.stripe.android.customersheet.b.c) objL;
            if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0805c)) {
                if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
                return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
            }
            com.stripe.android.customersheet.b.c.Companion aVar = com.stripe.android.customersheet.b.c.INSTANCE;
            n70.r rVarInvoke = sVar.prefsRepositoryFactory.invoke((a40.a) ((com.stripe.android.customersheet.b.c.C0805c) cVar).a());
            CoroutineContext coroutineContext = sVar.workContext;
            h hVar = new h(rVarInvoke, abstractC0802b, sVar, null);
            gVar.f50082n = null;
            gVar.f50083o = null;
            gVar.f50086r = 2;
            Object objWithContext = BuildersKt.withContext(coroutineContext, hVar, gVar);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        } catch (Throwable th2) {
            return com.stripe.android.customersheet.b.c.INSTANCE.a(th2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.customersheet.b
    public Object v(Continuation<com.stripe.android.customersheet.b.c<com.stripe.android.customersheet.b.AbstractC0802b>> continuation) {
        f fVar;
        s sVar;
        com.stripe.android.customersheet.b.c.Companion aVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f50081q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f50081q = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objL = fVar.f50079o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f50081q;
        try {
            if (i12 == 0) {
                t.b(objL);
                fVar.f50078n = this;
                fVar.f50081q = 1;
                objL = l(fVar);
                if (objL != coroutine_suspended) {
                    sVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                sVar = (s) fVar.f50078n;
                t.b(objL);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (com.stripe.android.customersheet.b.c.Companion) fVar.f50078n;
                t.b(objL);
            }
            return aVar.b(com.stripe.android.customersheet.b.AbstractC0802b.INSTANCE.b((w70.m) objL));
            com.stripe.android.customersheet.b.c cVar = (com.stripe.android.customersheet.b.c) objL;
            if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0805c)) {
                if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
                return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
            }
            com.stripe.android.customersheet.b.c.Companion aVar2 = com.stripe.android.customersheet.b.c.INSTANCE;
            n70.r rVarInvoke = sVar.prefsRepositoryFactory.invoke((a40.a) ((com.stripe.android.customersheet.b.c.C0805c) cVar).a());
            fVar.f50078n = aVar2;
            fVar.f50081q = 2;
            objL = rVarInvoke.b(true, false, fVar);
            if (objL != coroutine_suspended) {
                aVar = aVar2;
                return aVar.b(com.stripe.android.customersheet.b.AbstractC0802b.INSTANCE.b((w70.m) objL));
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            return com.stripe.android.customersheet.b.c.INSTANCE.a(th2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r6 == r1) goto L26;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(p013kotlin.coroutines.Continuation<com.stripe.android.customersheet.b.c<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.customersheet.s.i
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.customersheet.s$i r0 = (com.stripe.android.customersheet.s.i) r0
            int r1 = r0.f50094q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50094q = r1
            goto L18
        L13:
            com.stripe.android.customersheet.s$i r0 = new com.stripe.android.customersheet.s$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50092o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f50094q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r6)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f50091n
            com.stripe.android.customersheet.s r2 = (com.stripe.android.customersheet.s) r2
            jn0.t.b(r6)
            goto L4f
        L3c:
            jn0.t.b(r6)
            com.stripe.android.customersheet.r r6 = r5.setupIntentClientSecretProvider
            if (r6 == 0) goto L8d
            r0.f50091n = r5
            r0.f50094q = r4
            java.lang.Object r6 = r5.l(r0)
            if (r6 != r1) goto L4e
            goto L6e
        L4e:
            r2 = r5
        L4f:
            com.stripe.android.customersheet.b$c r6 = (com.stripe.android.customersheet.b.c) r6
            boolean r4 = r6 instanceof com.stripe.android.customersheet.b.c.C0805c
            if (r4 == 0) goto L72
            com.stripe.android.customersheet.b$c$c r6 = (com.stripe.android.customersheet.b.c.C0805c) r6
            java.lang.Object r6 = r6.a()
            a40.a r6 = (a40.a) r6
            com.stripe.android.customersheet.r r2 = r2.setupIntentClientSecretProvider
            java.lang.String r6 = r6.getCustomerId()
            r4 = 0
            r0.f50091n = r4
            r0.f50094q = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            com.stripe.android.customersheet.b$c r6 = (com.stripe.android.customersheet.b.c) r6
            return r6
        L72:
            boolean r0 = r6 instanceof com.stripe.android.customersheet.b.c.C0804b
            if (r0 == 0) goto L87
            com.stripe.android.customersheet.b$c$a r0 = com.stripe.android.customersheet.b.c.INSTANCE
            com.stripe.android.customersheet.b$c$b r6 = (com.stripe.android.customersheet.b.c.C0804b) r6
            java.lang.Throwable r1 = r6.getCause()
            java.lang.String r6 = r6.getDisplayMessage()
            com.stripe.android.customersheet.b$c r6 = r0.a(r1, r6)
            return r6
        L87:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L8d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "setupIntentClientSecretProvider cannot be null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.s.w(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
