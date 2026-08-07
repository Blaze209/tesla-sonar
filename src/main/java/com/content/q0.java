package com.content;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.f;
import f30.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import s10.a;
import s10.e;
import s10.g;
import s10.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 >2\u00020\u0001:\u0001?By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J+\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010/R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010/R\u0016\u0010=\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/reactnativestripesdk/q0;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf30/h0;", "stripe", "", "publishableKey", "stripeAccountId", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "paymentIntentClientSecret", "Lcom/stripe/android/model/l;", "confirmPaymentParams", "setupIntentClientSecret", "Lcom/stripe/android/model/m;", "confirmSetupParams", "handleNextActionPaymentIntentClientSecret", "handleNextActionSetupIntentClientSecret", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lf30/h0;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/stripe/android/model/l;Ljava/lang/String;Lcom/stripe/android/model/m;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/payments/paymentlauncher/b;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/payments/paymentlauncher/b;", "clientSecret", "Ljn0/h0;", "m", "(Ljava/lang/String;Ljava/lang/String;)V", "l", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextAction", "", "k", "(Lcom/stripe/android/model/StripeIntent$NextActionType;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "n", "Lf30/h0;", "o", "Ljava/lang/String;", "p", "q", "Lcom/facebook/react/bridge/Promise;", "r", "s", "Lcom/stripe/android/model/l;", "t", "u", "Lcom/stripe/android/model/m;", "v", "w", "x", "Lcom/stripe/android/payments/paymentlauncher/b;", "paymentLauncher", "y", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q0 extends Fragment {

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final h0 stripe;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String publishableKey;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String stripeAccountId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Promise promise;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String paymentIntentClientSecret;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ConfirmPaymentIntentParams confirmPaymentParams;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String setupIntentClientSecret;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final ConfirmSetupIntentParams confirmSetupParams;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final String handleNextActionPaymentIntentClientSecret;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String handleNextActionSetupIntentClientSecret;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.payments.paymentlauncher.b paymentLauncher;

    /* JADX INFO: renamed from: com.reactnativestripesdk.q0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/reactnativestripesdk/q0$a;", "", "<init>", "()V", "Lcom/reactnativestripesdk/q0;", "fragment", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "a", "(Lcom/reactnativestripesdk/q0;Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/bridge/Promise;)V", "Lf30/h0;", "stripe", "", "publishableKey", "stripeAccountId", "paymentIntentClientSecret", "Lcom/stripe/android/model/l;", "confirmPaymentParams", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactApplicationContext;Lf30/h0;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/stripe/android/model/l;)Lcom/reactnativestripesdk/q0;", "setupIntentClientSecret", "Lcom/stripe/android/model/m;", "confirmSetupParams", "e", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lf30/h0;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/stripe/android/model/m;)Lcom/reactnativestripesdk/q0;", "handleNextActionPaymentIntentClientSecret", "b", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lf30/h0;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)Lcom/reactnativestripesdk/q0;", "handleNextActionSetupIntentClientSecret", "c", "TAG", "Ljava/lang/String;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(q0 fragment, ReactApplicationContext context, Promise promise) {
            Activity currentActivity = context.getCurrentActivity();
            u uVar = currentActivity instanceof u ? (u) currentActivity : null;
            if (uVar == null) {
                promise.resolve(e.f());
                return;
            }
            try {
                uVar.getSupportFragmentManager().r().e(fragment, "payment_launcher_fragment").g();
            } catch (IllegalStateException e11) {
                promise.resolve(e.d(s10.d.Failed.toString(), e11.getMessage()));
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }

        public final q0 b(ReactApplicationContext context, h0 stripe, String publishableKey, String stripeAccountId, Promise promise, String handleNextActionPaymentIntentClientSecret) {
            s.k(context, "context");
            s.k(stripe, "stripe");
            s.k(publishableKey, "publishableKey");
            s.k(promise, "promise");
            s.k(handleNextActionPaymentIntentClientSecret, "handleNextActionPaymentIntentClientSecret");
            q0 q0Var = new q0(context, stripe, publishableKey, stripeAccountId, promise, null, null, null, null, handleNextActionPaymentIntentClientSecret, null, 1504, null);
            a(q0Var, context, promise);
            return q0Var;
        }

        public final q0 c(ReactApplicationContext context, h0 stripe, String publishableKey, String stripeAccountId, Promise promise, String handleNextActionSetupIntentClientSecret) {
            s.k(context, "context");
            s.k(stripe, "stripe");
            s.k(publishableKey, "publishableKey");
            s.k(promise, "promise");
            s.k(handleNextActionSetupIntentClientSecret, "handleNextActionSetupIntentClientSecret");
            q0 q0Var = new q0(context, stripe, publishableKey, stripeAccountId, promise, null, null, null, null, null, handleNextActionSetupIntentClientSecret, 992, null);
            a(q0Var, context, promise);
            return q0Var;
        }

        public final q0 d(ReactApplicationContext context, h0 stripe, String publishableKey, String stripeAccountId, Promise promise, String paymentIntentClientSecret, ConfirmPaymentIntentParams confirmPaymentParams) {
            s.k(context, "context");
            s.k(stripe, "stripe");
            s.k(publishableKey, "publishableKey");
            s.k(promise, "promise");
            s.k(paymentIntentClientSecret, "paymentIntentClientSecret");
            s.k(confirmPaymentParams, "confirmPaymentParams");
            q0 q0Var = new q0(context, stripe, publishableKey, stripeAccountId, promise, paymentIntentClientSecret, confirmPaymentParams, null, null, null, null, 1920, null);
            a(q0Var, context, promise);
            return q0Var;
        }

        public final q0 e(ReactApplicationContext context, h0 stripe, String publishableKey, String stripeAccountId, Promise promise, String setupIntentClientSecret, ConfirmSetupIntentParams confirmSetupParams) {
            s.k(context, "context");
            s.k(stripe, "stripe");
            s.k(publishableKey, "publishableKey");
            s.k(promise, "promise");
            s.k(setupIntentClientSecret, "setupIntentClientSecret");
            s.k(confirmSetupParams, "confirmSetupParams");
            q0 q0Var = new q0(context, stripe, publishableKey, stripeAccountId, promise, null, null, setupIntentClientSecret, confirmSetupParams, null, null, 1632, null);
            a(q0Var, context, promise);
            return q0Var;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48905a;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f48905a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/q0$c", "Lf30/a;", "Lcom/stripe/android/model/u0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/u0;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements f30.a<PaymentIntent> {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48907a;

            static {
                int[] iArr = new int[StripeIntent.Status.values().length];
                try {
                    iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StripeIntent.Status.Processing.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresAction.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StripeIntent.Status.Canceled.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f48907a = iArr;
            }
        }

        c() {
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentIntent result) {
            s.k(result, "result");
            StripeIntent.Status status = result.getStatus();
            switch (status == null ? -1 : a.f48907a[status.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    q0.this.promise.resolve(i.d("paymentIntent", i.v(result)));
                    break;
                case 5:
                    if (!q0.this.k(result.P0())) {
                        PaymentIntent.Error lastPaymentError = result.getLastPaymentError();
                        if (lastPaymentError == null) {
                            q0.this.promise.resolve(e.d(s10.a.Canceled.toString(), "The payment has been canceled"));
                        } else {
                            q0.this.promise.resolve(e.a(s10.a.Canceled.toString(), lastPaymentError));
                        }
                    } else {
                        q0.this.promise.resolve(i.d("paymentIntent", i.v(result)));
                    }
                    break;
                case 6:
                    q0.this.promise.resolve(e.a(s10.a.Failed.toString(), result.getLastPaymentError()));
                    break;
                case 7:
                    q0.this.promise.resolve(e.a(s10.a.Canceled.toString(), result.getLastPaymentError()));
                    break;
                default:
                    q0.this.promise.resolve(e.d(s10.a.Unknown.toString(), "unhandled error: " + result.getStatus()));
                    break;
            }
            q0 q0Var = q0.this;
            g.d(q0Var, q0Var.context);
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            q0.this.promise.resolve(e.c(s10.a.Failed.toString(), e11));
            q0 q0Var = q0.this;
            g.d(q0Var, q0Var.context);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/q0$d", "Lf30/a;", "Lcom/stripe/android/model/d1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/d1;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements f30.a<SetupIntent> {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48909a;

            static {
                int[] iArr = new int[StripeIntent.Status.values().length];
                try {
                    iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StripeIntent.Status.Processing.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresAction.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StripeIntent.Status.Canceled.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f48909a = iArr;
            }
        }

        d() {
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SetupIntent result) {
            s.k(result, "result");
            StripeIntent.Status status = result.getStatus();
            switch (status == null ? -1 : a.f48909a[status.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    q0.this.promise.resolve(i.d("setupIntent", i.y(result)));
                    break;
                case 5:
                    if (!q0.this.k(result.P0())) {
                        SetupIntent.Error lastSetupError = result.getLastSetupError();
                        if (lastSetupError == null) {
                            q0.this.promise.resolve(e.d(s10.b.Canceled.toString(), "Setup has been canceled"));
                        } else {
                            q0.this.promise.resolve(e.b(s10.b.Canceled.toString(), lastSetupError));
                        }
                    } else {
                        q0.this.promise.resolve(i.d("setupIntent", i.y(result)));
                    }
                    break;
                case 6:
                    q0.this.promise.resolve(e.b(s10.b.Failed.toString(), result.getLastSetupError()));
                    break;
                case 7:
                    q0.this.promise.resolve(e.b(s10.b.Canceled.toString(), result.getLastSetupError()));
                    break;
                default:
                    q0.this.promise.resolve(e.d(s10.b.Unknown.toString(), "unhandled error: " + result.getStatus()));
                    break;
            }
            q0 q0Var = q0.this;
            g.d(q0Var, q0Var.context);
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            q0.this.promise.resolve(e.c(s10.b.Failed.toString(), e11));
            q0 q0Var = q0.this;
            g.d(q0Var, q0Var.context);
        }
    }

    public /* synthetic */ q0(ReactApplicationContext reactApplicationContext, h0 h0Var, String str, String str2, Promise promise, String str3, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str4, ConfirmSetupIntentParams confirmSetupIntentParams, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, h0Var, str, str2, promise, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : confirmPaymentIntentParams, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : confirmSetupIntentParams, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : str6);
    }

    private final com.stripe.android.payments.paymentlauncher.b i() {
        return com.stripe.android.payments.paymentlauncher.b.INSTANCE.a(this, this.publishableKey, this.stripeAccountId, new com.stripe.android.payments.paymentlauncher.b.c() { // from class: com.reactnativestripesdk.p0
            @Override // com.stripe.android.payments.paymentlauncher.b.c
            public final void a(f fVar) throws Exception {
                q0.j(this.f48866a, fVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(q0 q0Var, f paymentResult) throws Exception {
        s.k(paymentResult, "paymentResult");
        if (!(paymentResult instanceof f.c)) {
            if (paymentResult instanceof f.a) {
                q0Var.promise.resolve(e.d(a.Canceled.toString(), null));
                g.d(q0Var, q0Var.context);
                return;
            } else {
                if (!(paymentResult instanceof f.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                q0Var.promise.resolve(e.e(a.Failed.toString(), ((f.d) paymentResult).getThrowable()));
                g.d(q0Var, q0Var.context);
                return;
            }
        }
        String str = q0Var.paymentIntentClientSecret;
        if (str != null) {
            q0Var.l(str, q0Var.stripeAccountId);
            return;
        }
        String str2 = q0Var.handleNextActionPaymentIntentClientSecret;
        if (str2 != null) {
            q0Var.l(str2, q0Var.stripeAccountId);
            return;
        }
        String str3 = q0Var.setupIntentClientSecret;
        if (str3 != null) {
            q0Var.m(str3, q0Var.stripeAccountId);
            return;
        }
        String str4 = q0Var.handleNextActionSetupIntentClientSecret;
        if (str4 == null) {
            throw new Exception("Failed to create Payment Launcher. No client secret provided.");
        }
        q0Var.m(str4, q0Var.stripeAccountId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(StripeIntent.NextActionType nextAction) {
        switch (nextAction == null ? -1 : b.f48905a[nextAction.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
    }

    private final void l(String clientSecret, String stripeAccountId) {
        this.stripe.p(clientSecret, stripeAccountId, v.e("payment_method"), new c());
    }

    private final void m(String clientSecret, String stripeAccountId) {
        this.stripe.s(clientSecret, stripeAccountId, v.e("payment_method"), new d());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Exception {
        s.k(inflater, "inflater");
        com.stripe.android.payments.paymentlauncher.b bVarI = i();
        this.paymentLauncher = bVarI;
        if (this.paymentIntentClientSecret != null && this.confirmPaymentParams != null) {
            if (bVarI == null) {
                s.B("paymentLauncher");
                bVarI = null;
            }
            bVarI.a(this.confirmPaymentParams);
        } else if (this.setupIntentClientSecret != null && this.confirmSetupParams != null) {
            if (bVarI == null) {
                s.B("paymentLauncher");
                bVarI = null;
            }
            bVarI.c(this.confirmSetupParams);
        } else if (this.handleNextActionPaymentIntentClientSecret != null) {
            if (bVarI == null) {
                s.B("paymentLauncher");
                bVarI = null;
            }
            bVarI.b(this.handleNextActionPaymentIntentClientSecret);
        } else {
            if (this.handleNextActionSetupIntentClientSecret == null) {
                throw new Exception("Invalid parameters provided to PaymentLauncher. Ensure that you are providing the correct client secret and setup params (if necessary).");
            }
            if (bVarI == null) {
                s.B("paymentLauncher");
                bVarI = null;
            }
            bVarI.d(this.handleNextActionSetupIntentClientSecret);
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public q0(ReactApplicationContext context, h0 stripe, String publishableKey, String str, Promise promise, String str2, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str3, ConfirmSetupIntentParams confirmSetupIntentParams, String str4, String str5) {
        s.k(context, "context");
        s.k(stripe, "stripe");
        s.k(publishableKey, "publishableKey");
        s.k(promise, "promise");
        this.context = context;
        this.stripe = stripe;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.promise = promise;
        this.paymentIntentClientSecret = str2;
        this.confirmPaymentParams = confirmPaymentIntentParams;
        this.setupIntentClientSecret = str3;
        this.confirmSetupParams = confirmSetupIntentParams;
        this.handleNextActionPaymentIntentClientSecret = str4;
        this.handleNextActionSetupIntentClientSecret = str5;
    }
}
