package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.y0;
import com.stripe.android.model.z0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 A2\u00020\u0001:\u00015B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JD\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b#\u0010$J<\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b&\u0010'J$\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001e2\u0006\u0010%\u001a\u00020\u0007H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J;\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b/\u00100J<\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u0002012\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b3\u00104J4\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Lcom/stripe/android/paymentsheet/b;", "Lcom/stripe/android/paymentsheet/i;", "Lz60/g;", "stripeRepository", "", "isFlowController", "Lkotlin/Function0;", "", "publishableKeyProvider", "stripeAccountIdProvider", "<init>", "(Lz60/g;ZLwn0/a;Lwn0/a;)V", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/l$d;", "shippingValues", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/i$b;", "n", "(Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/v0;", "paymentMethod", "shouldSavePaymentMethod", "m", "(Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "Ljn0/s;", "k", "(Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln70/a;", "createIntentCallback", "o", "(Ln70/a;Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;ZLcom/stripe/android/model/l$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientSecret", "p", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent;", "q", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeferred", "Lcom/stripe/android/paymentsheet/i$b$b;", "h", "(Ljava/lang/String;Lcom/stripe/android/model/l$d;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;Z)Lcom/stripe/android/paymentsheet/i$b$b;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/stripe/android/model/l$d;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;)Lcom/stripe/android/paymentsheet/i$b$b;", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "b", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz60/g;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "e", "Lw30/l$c;", "l", "()Lw30/l$c;", "requestOptions", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f52678f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f52679g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f52680h = n70.x.f93523k0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isFlowController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> stripeAccountIdProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/b$a;", "", "<init>", "()V", "", "GENERIC_STRIPE_MESSAGE", "I", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE}, m = "createPaymentMethod-gIAlu-s", n = {}, s = {})
    static final class C0997b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52685n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52687p;

        C0997b(Continuation<? super C0997b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52685n = obj;
            this.f52687p |= Integer.MIN_VALUE;
            Object objK = b.this.k(null, this);
            return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : jn0.s.a(objK);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "handleDeferredIntent", n = {"this", "intentConfiguration", "paymentMethodOptionsParams", "shippingValues", "customerRequestedSave"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52688n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52689o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f52690p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f52691q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f52692r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f52693s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f52695u;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52693s = obj;
            this.f52695u |= Integer.MIN_VALUE;
            return b.this.n(null, null, null, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m = "handleDeferredIntentCreationFromPaymentMethod", n = {"this", "intentConfiguration", "paymentMethod", "paymentMethodOptionsParams", "shippingValues"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52696n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52697o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f52698p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f52699q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f52700r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f52701s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f52703u;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52701s = obj;
            this.f52703u |= Integer.MIN_VALUE;
            return b.this.o(null, null, null, null, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m = "handleDeferredIntentCreationSuccess", n = {"this", "clientSecret", "intentConfiguration", "paymentMethod", "paymentMethodOptionsParams", "shippingValues"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52705o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f52706p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f52707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f52708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f52709s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f52710t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f52712v;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52710t = obj;
            this.f52712v |= Integer.MIN_VALUE;
            return b.this.p(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {}, l = {342}, m = "retrieveStripeIntent-gIAlu-s", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52713n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52715p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52713n = obj;
            this.f52715p |= Integer.MIN_VALUE;
            Object objQ = b.this.q(null, this);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : jn0.s.a(objQ);
        }
    }

    public b(z60.g stripeRepository, boolean z11, wn0.a<String> publishableKeyProvider, wn0.a<String> stripeAccountIdProvider) {
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.stripeRepository = stripeRepository;
        this.isFlowController = z11;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
    }

    private final i.b.Confirm h(String clientSecret, ConfirmPaymentIntentParams.Shipping shippingValues, PaymentMethod paymentMethod, y0 paymentMethodOptionsParams, boolean isDeferred) {
        return new i.b.Confirm(f30.e.INSTANCE.a(clientSecret, shippingValues).a(paymentMethod, paymentMethodOptionsParams), isDeferred);
    }

    private final i.b.Confirm i(String clientSecret, ConfirmPaymentIntentParams.Shipping shippingValues, PaymentMethodCreateParams paymentMethodCreateParams, y0 paymentMethodOptionsParams) {
        f30.e<com.stripe.android.model.n> eVarA = f30.e.INSTANCE.a(clientSecret, shippingValues);
        String strK = paymentMethodCreateParams.k();
        return new i.b.Confirm(strK != null ? eVarA.c(strK, PaymentMethod.p.Link, paymentMethodOptionsParams) : eVarA.b(paymentMethodCreateParams, paymentMethodOptionsParams), false);
    }

    static /* synthetic */ i.b.Confirm j(b bVar, String str, ConfirmPaymentIntentParams.Shipping shipping, PaymentMethodCreateParams paymentMethodCreateParams, y0 y0Var, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            y0Var = null;
        }
        return bVar.i(str, shipping, paymentMethodCreateParams, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        C0997b c0997b;
        if (continuation instanceof C0997b) {
            c0997b = (C0997b) continuation;
            int i11 = c0997b.f52687p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0997b.f52687p = i11 - Integer.MIN_VALUE;
            } else {
                c0997b = new C0997b(continuation);
            }
        } else {
            c0997b = new C0997b(continuation);
        }
        Object obj = c0997b.f52685n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c0997b.f52687p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        z60.g gVar = this.stripeRepository;
        w30.l.Options optionsL = l();
        c0997b.f52687p = 1;
        Object objJ = gVar.j(paymentMethodCreateParams, optionsL, c0997b);
        return objJ == coroutine_suspended ? coroutine_suspended : objJ;
    }

    private final w30.l.Options l() {
        return new w30.l.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
    }

    private final Object m(y.n nVar, PaymentMethod paymentMethod, y0 y0Var, ConfirmPaymentIntentParams.Shipping shipping, boolean z11, Continuation<? super i.b> continuation) {
        n70.a aVarA = i.INSTANCE.a();
        if (aVarA != null) {
            return o(aVarA, nVar, paymentMethod, y0Var, z11, shipping, continuation);
        }
        throw new IllegalStateException((n70.a.class.getSimpleName() + " must be implemented when using IntentConfiguration with PaymentSheet").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r1 == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.stripe.android.paymentsheet.y.n r35, com.stripe.android.model.PaymentMethodCreateParams r36, com.stripe.android.model.y0 r37, com.stripe.android.model.ConfirmPaymentIntentParams.Shipping r38, boolean r39, p013kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.i.b> r40) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.b.n(com.stripe.android.paymentsheet.y$n, com.stripe.android.model.w0, com.stripe.android.model.y0, com.stripe.android.model.l$d, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object o(n70.a aVar, y.n nVar, PaymentMethod paymentMethod, y0 y0Var, boolean z11, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super i.b> continuation) {
        d dVar;
        b bVar;
        x30.c cVarG;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f52703u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f52703u = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f52701s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar2.f52703u;
        if (i12 == 0) {
            jn0.t.b(objA);
            dVar2.f52696n = this;
            dVar2.f52697o = nVar;
            dVar2.f52698p = paymentMethod;
            dVar2.f52699q = y0Var;
            dVar2.f52700r = shipping;
            dVar2.f52703u = 1;
            objA = aVar.a(paymentMethod, z11, dVar2);
            if (objA != coroutine_suspended) {
                bVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
            return objA;
        }
        shipping = (ConfirmPaymentIntentParams.Shipping) dVar2.f52700r;
        y0Var = (y0) dVar2.f52699q;
        paymentMethod = (PaymentMethod) dVar2.f52698p;
        nVar = (y.n) dVar2.f52697o;
        bVar = (b) dVar2.f52696n;
        jn0.t.b(objA);
        y0 y0Var2 = y0Var;
        PaymentMethod paymentMethod2 = paymentMethod;
        y.n nVar2 = nVar;
        com.stripe.android.paymentsheet.a aVar2 = (com.stripe.android.paymentsheet.a) objA;
        if (!(aVar2 instanceof com.stripe.android.paymentsheet.a.b)) {
            if (!(aVar2 instanceof com.stripe.android.paymentsheet.a.C0968a)) {
                throw new NoWhenBranchMatchedException();
            }
            com.stripe.android.paymentsheet.a.C0968a c0968a = (com.stripe.android.paymentsheet.a.C0968a) aVar2;
            Exception cause = c0968a.getCause();
            String displayMessage = c0968a.getDisplayMessage();
            if (displayMessage == null || (cVarG = x30.d.b(displayMessage)) == null) {
                cVarG = x30.d.g(f52680h, new Object[0], null, 4, null);
            }
            return new i.b.Fail(cause, cVarG);
        }
        com.stripe.android.paymentsheet.a.b bVar2 = (com.stripe.android.paymentsheet.a.b) aVar2;
        if (p013kotlin.jvm.internal.s.f(bVar2.getClientSecret(), "COMPLETE_WITHOUT_CONFIRMING_INTENT")) {
            return new i.b.Complete(true);
        }
        String clientSecret = bVar2.getClientSecret();
        dVar2.f52696n = null;
        dVar2.f52697o = null;
        dVar2.f52698p = null;
        dVar2.f52699q = null;
        dVar2.f52700r = null;
        dVar2.f52703u = 2;
        Object objP = bVar.p(clientSecret, nVar2, paymentMethod2, y0Var2, shipping, dVar2);
        return objP == coroutine_suspended ? coroutine_suspended : objP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, y.n nVar, PaymentMethod paymentMethod, y0 y0Var, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super i.b> continuation) {
        e eVar;
        Object objQ;
        b bVar;
        Object objB;
        Object objH;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f52712v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f52712v = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f52710t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f52712v;
        if (i12 == 0) {
            jn0.t.b(obj);
            eVar.f52704n = this;
            eVar.f52705o = str;
            eVar.f52706p = nVar;
            eVar.f52707q = paymentMethod;
            eVar.f52708r = y0Var;
            eVar.f52709s = shipping;
            eVar.f52712v = 1;
            objQ = q(str, eVar);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shipping = (ConfirmPaymentIntentParams.Shipping) eVar.f52709s;
            y0Var = (y0) eVar.f52708r;
            paymentMethod = (PaymentMethod) eVar.f52707q;
            nVar = (y.n) eVar.f52706p;
            str = (String) eVar.f52705o;
            b bVar2 = (b) eVar.f52704n;
            jn0.t.b(obj);
            objQ = ((jn0.s) obj).getValue();
            bVar = bVar2;
        }
        String str2 = str;
        PaymentMethod paymentMethod2 = paymentMethod;
        y0 y0Var2 = y0Var;
        ConfirmPaymentIntentParams.Shipping shipping2 = shipping;
        if (jn0.s.h(objQ)) {
            try {
                StripeIntent stripeIntent = (StripeIntent) objQ;
                if (stripeIntent.v3()) {
                    objH = new i.b.Complete(false);
                } else if (stripeIntent.f2()) {
                    String paymentMethodId = stripeIntent.getPaymentMethodId();
                    objH = (paymentMethodId == null || p013kotlin.jvm.internal.s.f(paymentMethodId, paymentMethod2.id)) ? new i.b.HandleNextAction(str2) : new i.b.Fail(new InvalidDeferredIntentUsageException(), x30.d.g(n70.x.J, new Object[0], null, 4, null));
                } else {
                    com.stripe.android.paymentsheet.d.f52798a.a(stripeIntent, nVar, bVar.isFlowController);
                    objH = bVar.h(str2, shipping2, paymentMethod2, y0Var2, true);
                }
                objB = jn0.s.b(objH);
            } catch (Throwable th2) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
        } else {
            objB = jn0.s.b(objQ);
        }
        Throwable thE = jn0.s.e(objB);
        return thE == null ? objB : new i.b.Fail(thE, x30.d.g(f52680h, new Object[0], null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(String str, Continuation<? super jn0.s<? extends StripeIntent>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f52715p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f52715p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f52713n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar2.f52715p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        z60.g gVar = this.stripeRepository;
        w30.l.Options optionsL = l();
        fVar2.f52715p = 1;
        Object objD = z60.g.a.d(gVar, str, optionsL, null, fVar2, 4, null);
        return objD == coroutine_suspended ? coroutine_suspended : objD;
    }

    @Override // com.stripe.android.paymentsheet.i
    public Object a(y.m mVar, PaymentMethod paymentMethod, y0 y0Var, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super i.b> continuation) {
        if (mVar instanceof y.m.DeferredIntent) {
            return m(((y.m.DeferredIntent) mVar).getIntentConfiguration(), paymentMethod, y0Var, shipping, (y0Var != null ? z0.a(y0Var) : null) == ConfirmPaymentIntentParams.c.OffSession, continuation);
        }
        if (mVar instanceof y.m.PaymentIntent) {
            return h(((y.m.PaymentIntent) mVar).getClientSecret(), shipping, paymentMethod, y0Var, false);
        }
        if (mVar instanceof y.m.SetupIntent) {
            return h(((y.m.SetupIntent) mVar).getClientSecret(), shipping, paymentMethod, y0Var, false);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.paymentsheet.i
    public Object b(y.m mVar, PaymentMethodCreateParams paymentMethodCreateParams, y0 y0Var, ConfirmPaymentIntentParams.Shipping shipping, boolean z11, Continuation<? super i.b> continuation) {
        if (mVar instanceof y.m.DeferredIntent) {
            return n(((y.m.DeferredIntent) mVar).getIntentConfiguration(), paymentMethodCreateParams, y0Var, shipping, z11, continuation);
        }
        if (mVar instanceof y.m.PaymentIntent) {
            return i(((y.m.PaymentIntent) mVar).getClientSecret(), shipping, paymentMethodCreateParams, y0Var);
        }
        if (mVar instanceof y.m.SetupIntent) {
            return j(this, ((y.m.SetupIntent) mVar).getClientSecret(), shipping, paymentMethodCreateParams, null, 8, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
