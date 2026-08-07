package com.stripe.android;

import a70.DefaultReturnUrl;
import a70.Unvalidated;
import a70.j;
import android.content.Context;
import android.content.Intent;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.n;
import f30.PaymentIntentResult;
import f30.SetupIntentResult;
import f30.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.o;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ,2\u00020\u0001:\u00015Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J(\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J(\u0010/\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b5\u00104J$\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001a2\u0006\u00102\u001a\u000201H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J$\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u001a2\u0006\u00102\u001a\u000201H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00108J(\u0010=\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0019\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010AR\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\\R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010`R \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lcom/stripe/android/b;", "Lf30/p;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", "publishableKeyProvider", "Lz60/g;", "stripeRepository", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lz60/a;", "alipayRepository", "uiContext", "<init>", "(Landroid/content/Context;Lwn0/a;Lz60/g;ZLkotlin/coroutines/CoroutineContext;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lz60/a;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/model/l;", "confirmStripeIntentParams", "Lw30/l$c;", "requestOptions", "Ljn0/s;", "Lcom/stripe/android/model/u0;", "m", "(Lcom/stripe/android/model/l;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/m;", "Lcom/stripe/android/model/d1;", "n", "(Lcom/stripe/android/model/m;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/view/n;", "host", "", "requestCode", "", "throwable", "Ljn0/h0;", "o", "(Lcom/stripe/android/view/n;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "returnUrl", "q", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/n;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/n;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Intent;", "data", "c", "(ILandroid/content/Intent;)Z", "a", "Lf30/q;", "b", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf30/g0;", "e", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "p", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/a;", "Lz60/g;", "Z", "Lw30/c;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "f", "Lz60/a;", "g", "Lkotlin/coroutines/CoroutineContext;", "La70/b;", "h", "La70/b;", "failureMessageFactory", "La70/g;", IntegerTokenConverter.CONVERTER_KEY, "La70/g;", "paymentIntentFlowResultProcessor", "La70/j;", "j", "La70/j;", "setupIntentFlowResultProcessor", "La70/a;", "k", "La70/a;", "defaultReturnUrl", "l", "isInstantApp", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/a$a;", "Landroidx/activity/result/ActivityResultLauncher;", "paymentRelayLauncher", "Lkotlin/Function1;", "Lcom/stripe/android/a;", "Lwn0/l;", "paymentRelayStarterFactory", "", "Ljava/util/Map;", "threeDs1IntentReturnUrlMap", "Li70/h;", "Li70/h;", "nextActionHandlerRegistry", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f49620r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final List<String> f49621s = v.e("payment_method");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f49622t = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z60.a alipayRepository;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext uiContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a70.b failureMessageFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a70.g paymentIntentFlowResultProcessor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final j setupIntentFlowResultProcessor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final DefaultReturnUrl defaultReturnUrl;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isInstantApp;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<a.AbstractC0787a> paymentRelayLauncher;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l<n, a> paymentRelayStarterFactory;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> threeDs1IntentReturnUrlMap;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i70.h nextActionHandlerRegistry;

    /* JADX INFO: renamed from: com.stripe.android.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/b$a;", "", "<init>", "()V", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "", "c", "(Lcom/stripe/android/model/StripeIntent;)I", "Lcom/stripe/android/model/n;", "params", "b", "(Lcom/stripe/android/model/n;)I", "", "CHALLENGE_DELAY", "J", "a", "()J", "PAYMENT_REQUEST_CODE", "I", "SETUP_REQUEST_CODE", "SOURCE_REQUEST_CODE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f49622t;
        }

        public final /* synthetic */ int b(com.stripe.android.model.n params) {
            s.k(params, "params");
            if (params instanceof ConfirmPaymentIntentParams) {
                return 50000;
            }
            if (params instanceof ConfirmSetupIntentParams) {
                return 50001;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final /* synthetic */ int c(StripeIntent intent) {
            s.k(intent, "intent");
            return intent instanceof PaymentIntent ? 50000 : 50001;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "confirmPaymentIntent-0E7RQCE", n = {}, s = {})
    static final class C0795b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f49639n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f49641p;

        C0795b(Continuation<? super C0795b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49639n = obj;
            this.f49641p |= Integer.MIN_VALUE;
            Object objM = b.this.m(null, null, this);
            return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : jn0.s.a(objM);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "confirmSetupIntent-0E7RQCE", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f49642n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f49644p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49642n = obj;
            this.f49644p |= Integer.MIN_VALUE;
            Object objN = b.this.n(null, null, this);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : jn0.s.a(objN);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {}, l = {357}, m = "getPaymentIntentResult-gIAlu-s", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f49645n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f49647p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49645n = obj;
            this.f49647p |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {}, l = {369}, m = "getSetupIntentResult-gIAlu-s", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f49648n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f49650p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49648n = obj;
            this.f49650p |= Integer.MIN_VALUE;
            Object objE = b.this.e(null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : jn0.s.a(objE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.StripePaymentController$handleError$2", f = "StripePaymentController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49651n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n f49653p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Throwable f49654q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f49655r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n nVar, Throwable th2, int i11, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f49653p = nVar;
            this.f49654q = th2;
            this.f49655r = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new f(this.f49653p, this.f49654q, this.f49655r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f49651n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ((a) b.this.paymentRelayStarterFactory.invoke(this.f49653p)).a(new a.AbstractC0787a.ErrorArgs(StripeException.INSTANCE.b(this.f49654q), this.f49655r));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/n;", "host", "Lcom/stripe/android/a;", "a", "(Lcom/stripe/android/view/n;)Lcom/stripe/android/a;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements l<n, a> {
        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke(n host) {
            s.k(host, "host");
            ActivityResultLauncher activityResultLauncher = b.this.paymentRelayLauncher;
            return activityResultLauncher != null ? new a.c(activityResultLauncher) : new a.b(host);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {152, 160, 178, 185}, m = "startConfirmAndAuth", n = {"this", "host", "confirmStripeIntentParams", "requestOptions", "returnUrl", "this", "host", "confirmStripeIntentParams", "requestOptions", "returnUrl"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49657n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49658o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f49659p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f49660q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f49661r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f49662s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f49664u;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49662s = obj;
            this.f49664u |= Integer.MIN_VALUE;
            return b.this.d(null, null, null, this);
        }
    }

    public b(Context context, wn0.a<String> publishableKeyProvider, z60.g stripeRepository, boolean z11, CoroutineContext workContext, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, z60.a alipayRepository, CoroutineContext uiContext) {
        s.k(context, "context");
        s.k(publishableKeyProvider, "publishableKeyProvider");
        s.k(stripeRepository, "stripeRepository");
        s.k(workContext, "workContext");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(alipayRepository, "alipayRepository");
        s.k(uiContext, "uiContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeRepository = stripeRepository;
        this.enableLogging = z11;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.alipayRepository = alipayRepository;
        this.uiContext = uiContext;
        this.failureMessageFactory = new a70.b(context);
        o30.d.Companion companion = o30.d.INSTANCE;
        this.paymentIntentFlowResultProcessor = new a70.g(context, publishableKeyProvider, stripeRepository, companion.a(z11), workContext);
        this.setupIntentFlowResultProcessor = new j(context, publishableKeyProvider, stripeRepository, companion.a(z11), workContext);
        this.defaultReturnUrl = DefaultReturnUrl.INSTANCE.a(context);
        boolean zC = xs.a.c(context);
        this.isInstantApp = zC;
        this.paymentRelayStarterFactory = new g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.threeDs1IntentReturnUrlMap = linkedHashMap;
        this.nextActionHandlerRegistry = i70.a.INSTANCE.a(context, paymentAnalyticsRequestFactory, z11, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.A(), zC, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(wn0.a tmp0) {
        s.k(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(ConfirmPaymentIntentParams confirmPaymentIntentParams, w30.l.Options options, Continuation<? super jn0.s<PaymentIntent>> continuation) {
        C0795b c0795b;
        if (continuation instanceof C0795b) {
            c0795b = (C0795b) continuation;
            int i11 = c0795b.f49641p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0795b.f49641p = i11 - Integer.MIN_VALUE;
            } else {
                c0795b = new C0795b(continuation);
            }
        } else {
            c0795b = new C0795b(continuation);
        }
        Object obj = c0795b.f49639n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c0795b.f49641p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        z60.g gVar = this.stripeRepository;
        ConfirmPaymentIntentParams confirmPaymentIntentParamsM2 = confirmPaymentIntentParams.m2(true);
        List<String> list = f49621s;
        c0795b.f49641p = 1;
        Object objK = gVar.k(confirmPaymentIntentParamsM2, options, list, c0795b);
        return objK == coroutine_suspended ? coroutine_suspended : objK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(ConfirmSetupIntentParams confirmSetupIntentParams, w30.l.Options options, Continuation<? super jn0.s<SetupIntent>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f49644p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f49644p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f49642n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f49644p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        z60.g gVar = this.stripeRepository;
        ConfirmSetupIntentParams confirmSetupIntentParamsM2 = confirmSetupIntentParams.m2(true);
        List<String> list = f49621s;
        cVar.f49644p = 1;
        Object objP = gVar.p(confirmSetupIntentParamsM2, options, list, cVar);
        return objP == coroutine_suspended ? coroutine_suspended : objP;
    }

    private final Object o(n nVar, int i11, Throwable th2, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new f(nVar, th2, i11, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    private final void q(String returnUrl) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (s.f(returnUrl, this.defaultReturnUrl.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else {
            paymentAnalyticsEvent = returnUrl == null ? PaymentAnalyticsEvent.ConfirmReturnUrlNull : PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // f30.p
    public boolean a(int requestCode, Intent data) {
        return requestCode == 50001 && data != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f30.p
    public Object b(Intent intent, Continuation<? super jn0.s<PaymentIntentResult>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f49647p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f49647p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f49645n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f49647p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        a70.g gVar = this.paymentIntentFlowResultProcessor;
        Unvalidated unvalidatedB = Unvalidated.INSTANCE.b(intent);
        dVar.f49647p = 1;
        Object objP = gVar.p(unvalidatedB, dVar);
        return objP == coroutine_suspended ? coroutine_suspended : objP;
    }

    @Override // f30.p
    public boolean c(int requestCode, Intent data) {
        return requestCode == 50000 && data != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r2 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r2 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        if (r5.p(r10, r2, r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        if (r5.o(r10, r11, r6, r0) == r1) goto L57;
     */
    @Override // f30.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.stripe.android.view.n r10, com.stripe.android.model.n r11, w30.l.Options r12, p013kotlin.coroutines.Continuation<? super jn0.h0> r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.d(com.stripe.android.view.n, com.stripe.android.model.n, w30.l$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f30.p
    public Object e(Intent intent, Continuation<? super jn0.s<SetupIntentResult>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f49650p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f49650p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f49648n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f49650p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        j jVar = this.setupIntentFlowResultProcessor;
        Unvalidated unvalidatedB = Unvalidated.INSTANCE.b(intent);
        eVar.f49650p = 1;
        Object objP = jVar.p(unvalidatedB, eVar);
        return objP == coroutine_suspended ? coroutine_suspended : objP;
    }

    public Object p(n nVar, StripeIntent stripeIntent, w30.l.Options options, Continuation<? super h0> continuation) {
        Object objD = this.nextActionHandlerRegistry.a(stripeIntent).d(nVar, stripeIntent, options, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }

    public /* synthetic */ b(Context context, final wn0.a aVar, z60.g gVar, boolean z11, CoroutineContext coroutineContext, w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, z60.a aVar2, CoroutineContext coroutineContext2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        boolean z12 = (i11 & 8) != 0 ? false : z11;
        CoroutineContext io2 = (i11 & 16) != 0 ? Dispatchers.getIO() : coroutineContext;
        w30.c oVar = (i11 & 32) != 0 ? new o(o30.d.INSTANCE.a(z12), io2) : cVar;
        if ((i11 & 64) != 0) {
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(applicationContext, new Provider() { // from class: f30.l0
                @Override // javax.inject.Provider
                public final Object get() {
                    return com.stripe.android.b.g(aVar);
                }
            });
        } else {
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
        this(context, aVar, gVar, z12, io2, oVar, paymentAnalyticsRequestFactory2, (i11 & 128) != 0 ? new z60.b(gVar) : aVar2, (i11 & 256) != 0 ? Dispatchers.getMain() : coroutineContext2);
    }
}
