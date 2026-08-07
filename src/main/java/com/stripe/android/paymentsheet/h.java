package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.s0;
import b80.BacsMandateData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import ezvcard.property.Gender;
import f30.PaymentConfiguration;
import javax.inject.Provider;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n70.ExternalPaymentMethodInput;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ¢\u00012\u00020\u0001:\u0004acegB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b'\u0010&J \u0010,\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u001b2\u0006\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b4\u00105J-\u0010<\u001a\u00020;2\u0006\u00106\u001a\u00020\u000b2\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00052\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\"H\u0002¢\u0006\u0004\bN\u0010OJ#\u0010Q\u001a\u00020\u001b2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001bH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001bH\u0002¢\u0006\u0004\bU\u0010TJ\u000f\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u001bH\u0002¢\u0006\u0004\bY\u0010TJ\u000f\u0010Z\u001a\u00020\u001bH\u0002¢\u0006\u0004\bZ\u0010TJ\u000f\u0010[\u001a\u00020VH\u0002¢\u0006\u0004\b[\u0010XJ\u0015\u0010]\u001a\u0004\u0018\u00010\\*\u00020*H\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R&\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001e\u0010y\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001e\u0010\u007f\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010xR\u0017\u0010\u0082\u0001\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u001b\u0010\u0087\u0001\u001a\u00020V8\u0006¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0081\u0001\u001a\u0005\b\u0086\u0001\u0010XR\u001f\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u008d\u00018\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R0\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R-\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001e2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u000e¢\u0006\u000f\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0005\b\u009c\u0001\u0010!R\u001c\u0010¡\u0001\u001a\u00020V*\u00030\u009e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001¨\u0006£\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/h;", "", "Lcom/stripe/android/paymentsheet/i;", "intentConfirmationInterceptor", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "Lcom/stripe/android/payments/paymentlauncher/b;", "paymentLauncherFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "bacsMandateConfirmationLauncherFactory", "Lb60/e;", "googlePayPaymentMethodLauncherFactory", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lh70/h;", "errorReporter", "Lz30/j;", "logger", "<init>", "(Lcom/stripe/android/paymentsheet/i;Lwn0/l;Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;Lb60/e;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/s0;Lh70/h;Lz30/j;)V", "Lh/b;", "activityResultCaller", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Ljn0/h0;", "P", "(Lh/b;Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/stripe/android/paymentsheet/h$b;", "arguments", Gender.UNKNOWN, "(Lcom/stripe/android/paymentsheet/h$b;)V", "Lcom/stripe/android/paymentsheet/r;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Gender.OTHER, "(Lcom/stripe/android/paymentsheet/h$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "Lcom/stripe/android/paymentsheet/p$d;", "paymentMethod", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "x", "(Lcom/stripe/android/paymentsheet/p$d;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/p$b;", "confirmationOption", "w", "(Lcom/stripe/android/paymentsheet/p$b;)V", "Lcom/stripe/android/paymentsheet/p$c;", "googlePay", "I", "(Lcom/stripe/android/paymentsheet/p$c;Lcom/stripe/android/model/StripeIntent;)V", "factory", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "activityLauncher", "Lcom/stripe/android/paymentsheet/p$c$a;", "config", "Lcom/stripe/android/googlepaylauncher/h;", "y", "(Lb60/e;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/paymentsheet/p$c$a;)Lcom/stripe/android/googlepaylauncher/h;", "Lcom/stripe/android/paymentsheet/p$a;", "H", "(Lcom/stripe/android/paymentsheet/p$a;)V", "Lcom/stripe/android/payments/paymentlauncher/a;", "result", Gender.NONE, "(Lcom/stripe/android/payments/paymentlauncher/a;)V", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "J", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;)V", "Lcom/stripe/android/payments/paymentlauncher/f;", "K", "(Lcom/stripe/android/payments/paymentlauncher/f;)V", "Lcom/stripe/android/googlepaylauncher/h$g;", "L", "(Lcom/stripe/android/googlepaylauncher/h$g;)V", Gender.MALE, "(Lcom/stripe/android/paymentsheet/r;)V", "action", "X", "(Lwn0/l;)V", "W", "()V", "R", "", Gender.FEMALE, "()Z", "V", "Q", "E", "Lcom/stripe/android/model/u0;", "t", "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/u0;", "a", "Lcom/stripe/android/paymentsheet/i;", "b", "Lwn0/l;", "c", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", DateTokenConverter.CONVERTER_KEY, "Lb60/e;", "e", "Lkotlinx/coroutines/CoroutineScope;", "f", "Landroidx/lifecycle/s0;", "g", "Lh70/h;", "h", "Lz30/j;", "Lcom/stripe/android/paymentsheet/g;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/g;", "intentConfirmationDefinition", "j", "Lcom/stripe/android/payments/paymentlauncher/b;", "paymentLauncher", "Ln70/i;", "k", "Landroidx/activity/result/ActivityResultLauncher;", "externalPaymentMethodLauncher", "Lb80/c;", "l", "Lb80/c;", "bacsMandateConfirmationLauncher", "m", "googlePayPaymentMethodLauncher", "n", "Z", "hasReloadedWhileAwaitingPreConfirm", "o", "hasReloadedWhileAwaitingConfirm", "p", "C", "hasReloadedFromProcessDeath", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/h$e;", "q", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_state", "Lkotlinx/coroutines/flow/StateFlow;", "r", "Lkotlinx/coroutines/flow/StateFlow;", "D", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "Ln70/f;", "value", "B", "()Ln70/f;", "T", "(Ln70/f;)V", "deferredIntentConfirmationType", "A", "()Lcom/stripe/android/paymentsheet/h$b;", "S", "currentArguments", "Lcom/stripe/android/paymentsheet/y$m;", "G", "(Lcom/stripe/android/paymentsheet/y$m;)Z", "isProcessingPayment", "s", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53069t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.i intentConfirmationInterceptor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ActivityResultLauncher<PaymentLauncherContract.a>, com.stripe.android.payments.paymentlauncher.b> paymentLauncherFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b60.e googlePayPaymentMethodLauncherFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z30.j logger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.g intentConfirmationDefinition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.payments.paymentlauncher.b paymentLauncher;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<ExternalPaymentMethodInput> externalPaymentMethodLauncher;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private b80.c bacsMandateConfirmationLauncher;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> googlePayPaymentMethodLauncher;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean hasReloadedWhileAwaitingPreConfirm;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean hasReloadedWhileAwaitingConfirm;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean hasReloadedFromProcessDeath;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<e> _state;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<e> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler$1", f = "IntentConfirmationHandler.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53088n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53088n;
            if (i11 == 0) {
                jn0.t.b(obj);
                io0.b.Companion companion = io0.b.INSTANCE;
                long jS = io0.d.s(1, io0.e.SECONDS);
                this.f53088n = 1;
                if (DelayKt.m506delayVtjQ1oo(jS, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            if (h.this._state.getValue() instanceof e.b) {
                h.this.M(new com.stripe.android.paymentsheet.r.Canceled(n70.n.None));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/h$b;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/p;", "confirmationOption", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/p;)V", "a", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/p;)Lcom/stripe/android/paymentsheet/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/StripeIntent;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/StripeIntent;", "b", "Lcom/stripe/android/paymentsheet/p;", "c", "()Lcom/stripe/android/paymentsheet/p;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent intent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.paymentsheet.p confirmationOption;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.h$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Args((StripeIntent) parcel.readParcelable(Args.class.getClassLoader()), (com.stripe.android.paymentsheet.p) parcel.readParcelable(Args.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(StripeIntent intent, com.stripe.android.paymentsheet.p confirmationOption) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            p013kotlin.jvm.internal.s.k(confirmationOption, "confirmationOption");
            this.intent = intent;
            this.confirmationOption = confirmationOption;
        }

        public static /* synthetic */ Args b(Args args, StripeIntent stripeIntent, com.stripe.android.paymentsheet.p pVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                stripeIntent = args.intent;
            }
            if ((i11 & 2) != 0) {
                pVar = args.confirmationOption;
            }
            return args.a(stripeIntent, pVar);
        }

        public final Args a(StripeIntent intent, com.stripe.android.paymentsheet.p confirmationOption) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            p013kotlin.jvm.internal.s.k(confirmationOption, "confirmationOption");
            return new Args(intent, confirmationOption);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.stripe.android.paymentsheet.p getConfirmationOption() {
            return this.confirmationOption;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final StripeIntent getIntent() {
            return this.intent;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return p013kotlin.jvm.internal.s.f(this.intent, args.intent) && p013kotlin.jvm.internal.s.f(this.confirmationOption, args.confirmationOption);
        }

        public int hashCode() {
            return (this.intent.hashCode() * 31) + this.confirmationOption.hashCode();
        }

        public String toString() {
            return "Args(intent=" + this.intent + ", confirmationOption=" + this.confirmationOption + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.intent, flags);
            parcel.writeParcelable(this.confirmationOption, flags);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/h$d;", "", "Lcom/stripe/android/paymentsheet/i;", "intentConfirmationInterceptor", "Ljavax/inject/Provider;", "Lf30/o;", "paymentConfigurationProvider", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "bacsMandateConfirmationLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/h;", "stripePaymentLauncherAssistedFactory", "Lb60/e;", "googlePayPaymentMethodLauncherFactory", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lkotlin/Function0;", "", "statusBarColor", "Lh70/h;", "errorReporter", "Lz30/j;", "logger", "<init>", "(Lcom/stripe/android/paymentsheet/i;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;Lcom/stripe/android/payments/paymentlauncher/h;Lb60/e;Landroidx/lifecycle/s0;Lwn0/a;Lh70/h;Lz30/j;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/stripe/android/paymentsheet/h;", DateTokenConverter.CONVERTER_KEY, "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentsheet/h;", "a", "Lcom/stripe/android/paymentsheet/i;", "b", "Ljavax/inject/Provider;", "c", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "Lcom/stripe/android/payments/paymentlauncher/h;", "e", "Lb60/e;", "f", "Landroidx/lifecycle/s0;", "g", "Lwn0/a;", "h", "Lh70/h;", IntegerTokenConverter.CONVERTER_KEY, "Lz30/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.paymentsheet.i intentConfirmationInterceptor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Provider<PaymentConfiguration> paymentConfigurationProvider;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.payments.paymentlauncher.h stripePaymentLauncherAssistedFactory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b60.e googlePayPaymentMethodLauncherFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final s0 savedStateHandle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<Integer> statusBarColor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final h70.h errorReporter;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final z30.j logger;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "hostActivityLauncher", "Lcom/stripe/android/payments/paymentlauncher/b;", "a", "(Landroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<ActivityResultLauncher<PaymentLauncherContract.a>, com.stripe.android.payments.paymentlauncher.b> {

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.h$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
            static final class C1008a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ d f53102c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1008a(d dVar) {
                    super(0);
                    this.f53102c = dVar;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return ((PaymentConfiguration) this.f53102c.paymentConfigurationProvider.get()).getPublishableKey();
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
            static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ d f53103c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d dVar) {
                    super(0);
                    this.f53103c = dVar;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return ((PaymentConfiguration) this.f53103c.paymentConfigurationProvider.get()).getStripeAccountId();
                }
            }

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.payments.paymentlauncher.b invoke(ActivityResultLauncher<PaymentLauncherContract.a> hostActivityLauncher) {
                p013kotlin.jvm.internal.s.k(hostActivityLauncher, "hostActivityLauncher");
                return d.this.stripePaymentLauncherAssistedFactory.a(new C1008a(d.this), new b(d.this), (Integer) d.this.statusBarColor.invoke(), true, hostActivityLauncher);
            }
        }

        public d(com.stripe.android.paymentsheet.i intentConfirmationInterceptor, Provider<PaymentConfiguration> paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.h stripePaymentLauncherAssistedFactory, b60.e eVar, s0 savedStateHandle, wn0.a<Integer> statusBarColor, h70.h errorReporter, z30.j jVar) {
            p013kotlin.jvm.internal.s.k(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            p013kotlin.jvm.internal.s.k(paymentConfigurationProvider, "paymentConfigurationProvider");
            p013kotlin.jvm.internal.s.k(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            p013kotlin.jvm.internal.s.k(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
            p013kotlin.jvm.internal.s.k(statusBarColor, "statusBarColor");
            p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
            this.intentConfirmationInterceptor = intentConfirmationInterceptor;
            this.paymentConfigurationProvider = paymentConfigurationProvider;
            this.bacsMandateConfirmationLauncherFactory = bacsMandateConfirmationLauncherFactory;
            this.stripePaymentLauncherAssistedFactory = stripePaymentLauncherAssistedFactory;
            this.googlePayPaymentMethodLauncherFactory = eVar;
            this.savedStateHandle = savedStateHandle;
            this.statusBarColor = statusBarColor;
            this.errorReporter = errorReporter;
            this.logger = jVar;
        }

        public final h d(CoroutineScope scope) {
            p013kotlin.jvm.internal.s.k(scope, "scope");
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar = this.bacsMandateConfirmationLauncherFactory;
            b60.e eVar = this.googlePayPaymentMethodLauncherFactory;
            com.stripe.android.paymentsheet.i iVar = this.intentConfirmationInterceptor;
            h70.h hVar = this.errorReporter;
            return new h(iVar, new a(), bVar, eVar, scope, this.savedStateHandle, hVar, this.logger);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e;", "", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/h$e$a;", "Lcom/stripe/android/paymentsheet/h$e$b;", "Lcom/stripe/android/paymentsheet/h$e$c;", "Lcom/stripe/android/paymentsheet/h$e$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.h$e$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e$a;", "Lcom/stripe/android/paymentsheet/h$e;", "Lcom/stripe/android/paymentsheet/r;", "result", "<init>", "(Lcom/stripe/android/paymentsheet/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/paymentsheet/r;", "()Lcom/stripe/android/paymentsheet/r;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Complete implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.stripe.android.paymentsheet.r result;

            public Complete(com.stripe.android.paymentsheet.r result) {
                p013kotlin.jvm.internal.s.k(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.stripe.android.paymentsheet.r getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Complete) && p013kotlin.jvm.internal.s.f(this.result, ((Complete) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "Complete(result=" + this.result + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e$b;", "Lcom/stripe/android/paymentsheet/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f53105a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 296413718;
            }

            public String toString() {
                return "Confirming";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e$c;", "Lcom/stripe/android/paymentsheet/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f53106a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -43337784;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.h$e$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e$d;", "Lcom/stripe/android/paymentsheet/h$e;", "Lcom/stripe/android/paymentsheet/p;", "confirmationOption", "", "inPreconfirmFlow", "<init>", "(Lcom/stripe/android/paymentsheet/p;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/paymentsheet/p;", "()Lcom/stripe/android/paymentsheet/p;", "b", "Z", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Preconfirming implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.stripe.android.paymentsheet.p confirmationOption;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean inPreconfirmFlow;

            public Preconfirming(com.stripe.android.paymentsheet.p pVar, boolean z11) {
                this.confirmationOption = pVar;
                this.inPreconfirmFlow = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.stripe.android.paymentsheet.p getConfirmationOption() {
                return this.confirmationOption;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getInPreconfirmFlow() {
                return this.inPreconfirmFlow;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Preconfirming)) {
                    return false;
                }
                Preconfirming preconfirming = (Preconfirming) other;
                return p013kotlin.jvm.internal.s.f(this.confirmationOption, preconfirming.confirmationOption) && this.inPreconfirmFlow == preconfirming.inPreconfirmFlow;
            }

            public int hashCode() {
                com.stripe.android.paymentsheet.p pVar = this.confirmationOption;
                return ((pVar == null ? 0 : pVar.hashCode()) * 31) + Boolean.hashCode(this.inPreconfirmFlow);
            }

            public String toString() {
                return "Preconfirming(confirmationOption=" + this.confirmationOption + ", inPreconfirmFlow=" + this.inPreconfirmFlow + ")";
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53109a;

        static {
            int[] iArr = new int[y.GooglePayConfiguration.c.values().length];
            try {
                iArr[y.GooglePayConfiguration.c.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f53109a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "<anonymous>", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler$firstInstanceOf$2", f = "IntentConfirmationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements wn0.p<Object, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53110n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f53111o;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.f53111o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f53110n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return Boxing.boxBoolean(this.f53111o instanceof e.Complete);
        }

        @Override // wn0.p
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((g) create(obj, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.h$h, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler", f = "IntentConfirmationHandler.kt", i = {}, l = {740}, m = "awaitIntentResult", n = {}, s = {})
    static final class C1009h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f53112n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f53114p;

        C1009h(Continuation<? super C1009h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53112n = obj;
            this.f53114p |= Integer.MIN_VALUE;
            return h.this.u(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.l<com.stripe.android.payments.paymentlauncher.f, h0> {
        i(Object obj) {
            super(1, obj, h.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final void a(com.stripe.android.payments.paymentlauncher.f p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((h) this.receiver).K(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.payments.paymentlauncher.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler", f = "IntentConfirmationHandler.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m = "confirmIntent", n = {"this", "paymentMethod", AnalyticsAttribute.Intent}, s = {"L$0", "L$1", "L$2"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53115n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53116o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f53117p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f53118q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f53120s;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53118q = obj;
            this.f53120s |= Integer.MIN_VALUE;
            return h.this.x(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/b;", "launcher", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/paymentlauncher/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.payments.paymentlauncher.b, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.n<com.stripe.android.paymentsheet.g.a> f53122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p.d f53123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StripeIntent f53124f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.paymentsheet.n<com.stripe.android.paymentsheet.g.a> nVar, com.stripe.android.paymentsheet.p.d dVar, StripeIntent stripeIntent) {
            super(1);
            this.f53122d = nVar;
            this.f53123e = dVar;
            this.f53124f = stripeIntent;
        }

        public final void a(com.stripe.android.payments.paymentlauncher.b launcher) {
            p013kotlin.jvm.internal.s.k(launcher, "launcher");
            h.this.T(((com.stripe.android.paymentsheet.n.Launch) this.f53122d).getDeferredIntentConfirmationType());
            h.this.V();
            h.this.intentConfirmationDefinition.c(launcher, (com.stripe.android.paymentsheet.g.a) ((com.stripe.android.paymentsheet.n.Launch) this.f53122d).b(), this.f53123e, this.f53124f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.payments.paymentlauncher.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler$onBacsMandateResult$1", f = "IntentConfirmationHandler.kt", i = {}, l = {DownloaderService.STATUS_FILE_ERROR}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53125n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.bacs.c f53127p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f53127p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new l(this.f53127p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53125n;
            if (i11 == 0) {
                jn0.t.b(obj);
                h.this.R();
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = this.f53127p;
                if (cVar instanceof com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.C1026c) {
                    Args argsA = h.this.A();
                    com.stripe.android.paymentsheet.p confirmationOption = argsA != null ? argsA.getConfirmationOption() : null;
                    com.stripe.android.paymentsheet.p.BacsPaymentMethod bacsPaymentMethod = confirmationOption instanceof com.stripe.android.paymentsheet.p.BacsPaymentMethod ? (com.stripe.android.paymentsheet.p.BacsPaymentMethod) confirmationOption : null;
                    if (bacsPaymentMethod != null) {
                        h hVar = h.this;
                        Args argsB = Args.b(argsA, null, new com.stripe.android.paymentsheet.p.d.New(bacsPaymentMethod.getInitializationMode(), bacsPaymentMethod.getShippingDetails(), bacsPaymentMethod.getCreateParams(), null, false), 1, null);
                        this.f53125n = 1;
                        if (hVar.v(argsB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (cVar instanceof com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.d) {
                    h.this.M(new com.stripe.android.paymentsheet.r.Canceled(n70.n.ModifyPaymentDetails));
                } else if (cVar instanceof com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.a) {
                    h.this.M(new com.stripe.android.paymentsheet.r.Canceled(n70.n.None));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler$onGooglePayResult$1", f = "IntentConfirmationHandler.kt", i = {}, l = {561}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53128n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.googlepaylauncher.h.g f53129o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ h f53130p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.googlepaylauncher.h.g gVar, h hVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f53129o = gVar;
            this.f53130p = hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new m(this.f53129o, this.f53130p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53128n;
            if (i11 == 0) {
                jn0.t.b(obj);
                com.stripe.android.googlepaylauncher.h.g gVar = this.f53129o;
                if (gVar instanceof com.stripe.android.googlepaylauncher.h.g.Completed) {
                    Args argsA = this.f53130p.A();
                    com.stripe.android.paymentsheet.p confirmationOption = argsA != null ? argsA.getConfirmationOption() : null;
                    com.stripe.android.paymentsheet.p.GooglePay googlePay = confirmationOption instanceof com.stripe.android.paymentsheet.p.GooglePay ? (com.stripe.android.paymentsheet.p.GooglePay) confirmationOption : null;
                    if (googlePay != null) {
                        com.stripe.android.googlepaylauncher.h.g gVar2 = this.f53129o;
                        h hVar = this.f53130p;
                        Args argsB = Args.b(argsA, null, new com.stripe.android.paymentsheet.p.d.Saved(googlePay.getInitializationMode(), googlePay.getShippingDetails(), ((com.stripe.android.googlepaylauncher.h.g.Completed) gVar2).getPaymentMethod(), null), 1, null);
                        this.f53128n = 1;
                        if (hVar.v(argsB, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (gVar instanceof com.stripe.android.googlepaylauncher.h.g.Failed) {
                    this.f53130p.M(new com.stripe.android.paymentsheet.r.Failed(((com.stripe.android.googlepaylauncher.h.g.Failed) this.f53129o).getError(), ((com.stripe.android.googlepaylauncher.h.g.Failed) this.f53129o).getErrorCode() == 3 ? x30.d.a(f30.d0.f63963o0) : x30.d.a(f30.d0.f63975u0), new com.stripe.android.paymentsheet.o.GooglePay(((com.stripe.android.googlepaylauncher.h.g.Failed) this.f53129o).getErrorCode())));
                } else if (gVar instanceof com.stripe.android.googlepaylauncher.h.g.a) {
                    this.f53130p.M(new com.stripe.android.paymentsheet.r.Canceled(n70.n.InformCancellation));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class n extends p013kotlin.jvm.internal.p implements wn0.l<com.stripe.android.payments.paymentlauncher.a, h0> {
        n(Object obj) {
            super(1, obj, h.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final void a(com.stripe.android.payments.paymentlauncher.a p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((h) this.receiver).N(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.payments.paymentlauncher.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class o implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        o() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.payments.paymentlauncher.f p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            h.this.K(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, h.this, h.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class p implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        p() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.googlepaylauncher.h.g p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            h.this.L(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, h.this, h.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/paymentsheet/h$q", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher<BacsMandateConfirmationContract.Args> f53134b;

        q(ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher) {
            this.f53134b = activityResultLauncher;
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            p013kotlin.jvm.internal.s.k(owner, "owner");
            h.this.paymentLauncher = null;
            h.this.externalPaymentMethodLauncher = null;
            h.this.bacsMandateConfirmationLauncher = null;
            h.this.googlePayPaymentMethodLauncher = null;
            this.f53134b.d();
            super.onDestroy(owner);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class r implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        r() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            h.this.J(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, h.this, h.class, "onBacsMandateResult", "onBacsMandateResult(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationHandler$start$1", f = "IntentConfirmationHandler.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class s extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53136n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Args f53138p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Args args, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f53138p = args;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new s(this.f53138p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53136n;
            if (i11 == 0) {
                jn0.t.b(obj);
                h hVar = h.this;
                Args args = this.f53138p;
                this.f53136n = 1;
                if (hVar.O(args, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(com.stripe.android.paymentsheet.i intentConfirmationInterceptor, wn0.l<? super ActivityResultLauncher<PaymentLauncherContract.a>, ? extends com.stripe.android.payments.paymentlauncher.b> paymentLauncherFactory, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, b60.e eVar, CoroutineScope coroutineScope, s0 savedStateHandle, h70.h errorReporter, z30.j jVar) {
        Object preconfirming;
        p013kotlin.jvm.internal.s.k(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        p013kotlin.jvm.internal.s.k(paymentLauncherFactory, "paymentLauncherFactory");
        p013kotlin.jvm.internal.s.k(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.bacsMandateConfirmationLauncherFactory = bacsMandateConfirmationLauncherFactory;
        this.googlePayPaymentMethodLauncherFactory = eVar;
        this.coroutineScope = coroutineScope;
        this.savedStateHandle = savedStateHandle;
        this.errorReporter = errorReporter;
        this.logger = jVar;
        this.intentConfirmationDefinition = new com.stripe.android.paymentsheet.g(intentConfirmationInterceptor, paymentLauncherFactory);
        boolean zF = F();
        this.hasReloadedWhileAwaitingPreConfirm = zF;
        boolean zE = E();
        this.hasReloadedWhileAwaitingConfirm = zE;
        this.hasReloadedFromProcessDeath = zF || zE;
        if (zF) {
            Args argsA = A();
            preconfirming = new e.Preconfirming(argsA != null ? argsA.getConfirmationOption() : null, true);
        } else {
            preconfirming = zE ? e.b.f53105a : e.c.f53106a;
        }
        MutableStateFlow<e> MutableStateFlow = StateFlowKt.MutableStateFlow(preconfirming);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        if (zE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Args A() {
        return (Args) this.savedStateHandle.f("IntentConfirmationArguments");
    }

    private final n70.f B() {
        return (n70.f) this.savedStateHandle.f("DeferredIntentConfirmationType");
    }

    private final boolean E() {
        Boolean bool = (Boolean) this.savedStateHandle.f("AwaitingPaymentResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean F() {
        Boolean bool = (Boolean) this.savedStateHandle.f("AwaitingPreConfirmResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean G(y.m mVar) {
        if (mVar instanceof y.m.PaymentIntent) {
            return true;
        }
        if (mVar instanceof y.m.SetupIntent) {
            return false;
        }
        if (mVar instanceof y.m.DeferredIntent) {
            return ((y.m.DeferredIntent) mVar).getIntentConfiguration().getMode() instanceof y.n.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void H(com.stripe.android.paymentsheet.p.BacsPaymentMethod confirmationOption) {
        Object objB;
        BacsMandateData bacsMandateDataA = BacsMandateData.INSTANCE.a(confirmationOption);
        if (bacsMandateDataA == null) {
            M(new com.stripe.android.paymentsheet.r.Failed(new IllegalArgumentException("Given payment selection could not be converted to Bacs data!"), x30.d.a(n70.x.f93523k0), com.stripe.android.paymentsheet.o.d.f53214a));
            return;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            b80.c cVar = this.bacsMandateConfirmationLauncher;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            objB = jn0.s.b(cVar);
            if (jn0.s.h(objB)) {
                this._state.setValue(new e.Preconfirming(confirmationOption, true));
                W();
                ((b80.c) objB).a(bacsMandateDataA, confirmationOption.getAppearance());
            }
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                M(new com.stripe.android.paymentsheet.r.Failed(thE, x30.d.a(n70.x.f93523k0), com.stripe.android.paymentsheet.o.d.f53214a));
            }
            jn0.s.a(objB);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
    }

    private final void I(com.stripe.android.paymentsheet.p.GooglePay googlePay, StripeIntent intent) {
        Object objB;
        Object objB2;
        String merchantCurrencyCode;
        if (googlePay.getConfig().getMerchantCurrencyCode() == null && !G(googlePay.getInitializationMode())) {
            z30.j jVar = this.logger;
            if (jVar != null) {
                jVar.a("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            }
            M(new com.stripe.android.paymentsheet.r.Failed(new IllegalStateException("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"), x30.d.a(n70.x.f93523k0), com.stripe.android.paymentsheet.o.e.f53215a));
            return;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher = this.googlePayPaymentMethodLauncher;
            if (activityResultLauncher == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            objB = jn0.s.b(activityResultLauncher);
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                M(new com.stripe.android.paymentsheet.r.Failed(thE, x30.d.a(n70.x.f93523k0), com.stripe.android.paymentsheet.o.d.f53214a));
                return;
            }
            ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher2 = (ActivityResultLauncher) objB;
            try {
                b60.e eVar = this.googlePayPaymentMethodLauncherFactory;
                if (eVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objB2 = jn0.s.b(eVar);
                Throwable thE2 = jn0.s.e(objB2);
                if (thE2 != null) {
                    M(new com.stripe.android.paymentsheet.r.Failed(thE2, x30.d.a(n70.x.f93523k0), com.stripe.android.paymentsheet.o.d.f53214a));
                    return;
                }
                com.stripe.android.paymentsheet.p.GooglePay.Config config = googlePay.getConfig();
                com.stripe.android.googlepaylauncher.h hVarY = y((b60.e) objB2, activityResultLauncher2, config);
                W();
                this._state.setValue(new e.Preconfirming(googlePay, true));
                PaymentIntent paymentIntentT = t(intent);
                if ((paymentIntentT == null || (merchantCurrencyCode = paymentIntentT.getCurrency()) == null) && (merchantCurrencyCode = config.getMerchantCurrencyCode()) == null) {
                    merchantCurrencyCode = "";
                }
                String str = merchantCurrencyCode;
                long jLongValue = 0;
                if (intent instanceof PaymentIntent) {
                    Long amount = ((PaymentIntent) intent).getAmount();
                    if (amount != null) {
                        jLongValue = amount.longValue();
                    }
                } else {
                    if (!(intent instanceof SetupIntent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Long customAmount = config.getCustomAmount();
                    if (customAmount != null) {
                        jLongValue = customAmount.longValue();
                    }
                }
                hVarY.g(str, jLongValue, intent.getId(), config.getCustomLabel());
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB2 = jn0.s.b(jn0.t.a(th2));
            }
        } catch (Throwable th3) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c result) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new l(result, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(com.stripe.android.payments.paymentlauncher.f result) {
        com.stripe.android.paymentsheet.r.Failed failed;
        com.stripe.android.paymentsheet.r canceled;
        Args argsA = A();
        if (argsA != null) {
            if (result instanceof com.stripe.android.payments.paymentlauncher.f.c) {
                canceled = new com.stripe.android.paymentsheet.r.Succeeded(argsA.getIntent(), null);
            } else if (result instanceof com.stripe.android.payments.paymentlauncher.f.d) {
                com.stripe.android.payments.paymentlauncher.f.d dVar = (com.stripe.android.payments.paymentlauncher.f.d) result;
                failed = new com.stripe.android.paymentsheet.r.Failed(dVar.getThrowable(), l30.a.b(dVar.getThrowable()), com.stripe.android.paymentsheet.o.a.f53211a);
            } else {
                if (!(result instanceof com.stripe.android.payments.paymentlauncher.f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                canceled = new com.stripe.android.paymentsheet.r.Canceled(n70.n.None);
            }
            M(canceled);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Arguments should have been initialized before handling EPM result!");
        failed = new com.stripe.android.paymentsheet.r.Failed(illegalStateException, l30.a.b(illegalStateException), com.stripe.android.paymentsheet.o.a.f53211a);
        canceled = failed;
        M(canceled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(com.stripe.android.googlepaylauncher.h.g result) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new m(result, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(com.stripe.android.paymentsheet.r result) {
        T(null);
        S(null);
        this._state.setValue(new e.Complete(result));
        Q();
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(com.stripe.android.payments.paymentlauncher.a result) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Args argsA = A();
            if (argsA == null) {
                throw new IllegalStateException("Arguments should have been initialized before handling payment result!");
            }
            com.stripe.android.paymentsheet.p confirmationOption = argsA.getConfirmationOption();
            com.stripe.android.paymentsheet.p.d dVar = confirmationOption instanceof com.stripe.android.paymentsheet.p.d ? (com.stripe.android.paymentsheet.p.d) confirmationOption : null;
            if (dVar == null) {
                throw new IllegalStateException("Cannot confirm intent with non payment method confirmation option");
            }
            objB = jn0.s.b(this.intentConfirmationDefinition.f(dVar, B(), argsA.getIntent(), result));
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                objB = new com.stripe.android.paymentsheet.r.Failed(thE, l30.a.b(thE), com.stripe.android.paymentsheet.o.d.f53214a);
            }
            M((com.stripe.android.paymentsheet.r) objB);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(Args args, Continuation<? super h0> continuation) {
        com.stripe.android.paymentsheet.p confirmationOption = args.getConfirmationOption();
        if (confirmationOption instanceof com.stripe.android.paymentsheet.p.GooglePay) {
            I((com.stripe.android.paymentsheet.p.GooglePay) confirmationOption, args.getIntent());
        } else {
            if (!(confirmationOption instanceof com.stripe.android.paymentsheet.p.BacsPaymentMethod)) {
                Object objV = v(args, continuation);
                return objV == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objV : h0.f84049a;
            }
            H((com.stripe.android.paymentsheet.p.BacsPaymentMethod) confirmationOption);
        }
        return h0.f84049a;
    }

    private final void Q() {
        this.savedStateHandle.k("AwaitingPaymentResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        this.savedStateHandle.k("AwaitingPreConfirmResult");
    }

    private final void S(Args args) {
        this.savedStateHandle.n("IntentConfirmationArguments", args);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(n70.f fVar) {
        this.savedStateHandle.n("DeferredIntentConfirmationType", fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        this.savedStateHandle.n("AwaitingPaymentResult", Boolean.TRUE);
    }

    private final void W() {
        this.savedStateHandle.n("AwaitingPreConfirmResult", Boolean.TRUE);
    }

    private final void X(wn0.l<? super com.stripe.android.payments.paymentlauncher.b, h0> action) {
        h0 h0Var;
        com.stripe.android.payments.paymentlauncher.b bVar = this.paymentLauncher;
        if (bVar != null) {
            action.invoke(bVar);
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            M(new com.stripe.android.paymentsheet.r.Failed(new IllegalArgumentException("No 'PaymentLauncher' instance was created before starting confirmation. Did you call register?"), x30.d.g(n70.x.f93523k0, new Object[0], null, 4, null), com.stripe.android.paymentsheet.o.b.f53212a));
        }
    }

    private final PaymentIntent t(StripeIntent stripeIntent) {
        if (stripeIntent instanceof PaymentIntent) {
            return (PaymentIntent) stripeIntent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(Args args, Continuation<? super h0> continuation) {
        S(args);
        this._state.setValue(e.b.f53105a);
        com.stripe.android.paymentsheet.p confirmationOption = args.getConfirmationOption();
        if (confirmationOption instanceof com.stripe.android.paymentsheet.p.ExternalPaymentMethod) {
            w((com.stripe.android.paymentsheet.p.ExternalPaymentMethod) confirmationOption);
        } else {
            if (confirmationOption instanceof com.stripe.android.paymentsheet.p.d) {
                Object objX = x((com.stripe.android.paymentsheet.p.d) confirmationOption, args.getIntent(), continuation);
                return objX == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX : h0.f84049a;
            }
            h70.h.b.a(this.errorReporter, h70.h.f.INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION, StripeException.INSTANCE.b(new IllegalStateException("Attempting to confirm intent for invalid confirmation option: " + confirmationOption)), null, 4, null);
            M(new com.stripe.android.paymentsheet.r.Failed(new IllegalStateException("Attempted to confirm invalid " + o0.b(confirmationOption.getClass()).c() + " confirmation type"), x30.d.a(n70.x.f93523k0), com.stripe.android.paymentsheet.o.d.f53214a));
        }
        return h0.f84049a;
    }

    private final void w(com.stripe.android.paymentsheet.p.ExternalPaymentMethod confirmationOption) {
        V();
        n70.j.f93418a.b(confirmationOption.getType(), confirmationOption.getBillingDetails(), new i(this), this.externalPaymentMethodLauncher, this.errorReporter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(com.stripe.android.paymentsheet.p.d dVar, StripeIntent stripeIntent, Continuation<? super h0> continuation) {
        j jVar;
        h hVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f53120s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f53120s = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objA = jVar.f53118q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f53120s;
        if (i12 == 0) {
            jn0.t.b(objA);
            com.stripe.android.paymentsheet.g gVar = this.intentConfirmationDefinition;
            jVar.f53115n = this;
            jVar.f53116o = dVar;
            jVar.f53117p = stripeIntent;
            jVar.f53120s = 1;
            objA = gVar.a(dVar, stripeIntent, jVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            hVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripeIntent = (StripeIntent) jVar.f53117p;
            dVar = (com.stripe.android.paymentsheet.p.d) jVar.f53116o;
            hVar = (h) jVar.f53115n;
            jn0.t.b(objA);
        }
        com.stripe.android.paymentsheet.n nVar = (com.stripe.android.paymentsheet.n) objA;
        if (nVar instanceof com.stripe.android.paymentsheet.n.Launch) {
            hVar.X(hVar.new k(nVar, dVar, stripeIntent));
        } else if (nVar instanceof com.stripe.android.paymentsheet.n.Fail) {
            com.stripe.android.paymentsheet.n.Fail fail = (com.stripe.android.paymentsheet.n.Fail) nVar;
            hVar.M(new com.stripe.android.paymentsheet.r.Failed(fail.getCause(), fail.getMessage(), com.stripe.android.paymentsheet.o.f.f53216a));
        } else if (nVar instanceof com.stripe.android.paymentsheet.n.Complete) {
            hVar.M(new com.stripe.android.paymentsheet.r.Succeeded(stripeIntent, ((com.stripe.android.paymentsheet.n.Complete) nVar).getDeferredIntentConfirmationType()));
        }
        return h0.f84049a;
    }

    private final com.stripe.android.googlepaylauncher.h y(b60.e factory, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityLauncher, com.stripe.android.paymentsheet.p.GooglePay.Config config) {
        CoroutineScope coroutineScope = this.coroutineScope;
        y.GooglePayConfiguration.c environment = config.getEnvironment();
        return factory.a(coroutineScope, new com.stripe.android.googlepaylauncher.h.Config((environment == null ? -1 : f.f53109a[environment.ordinal()]) == 1 ? a60.d.Production : a60.d.Test, config.getMerchantCountryCode(), config.getMerchantName(), config.getBillingDetailsCollectionConfiguration().d(), config.getBillingDetailsCollectionConfiguration().j(), false, false, 96, null), new com.stripe.android.googlepaylauncher.h.f() { // from class: n70.l
            @Override // com.stripe.android.googlepaylauncher.h.f
            public final void a(boolean z11) {
                com.stripe.android.paymentsheet.h.z(z11);
            }
        }, activityLauncher, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(boolean z11) {
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getHasReloadedFromProcessDeath() {
        return this.hasReloadedFromProcessDeath;
    }

    public final StateFlow<e> D() {
        return this.state;
    }

    public final void P(h.b activityResultCaller, LifecycleOwner lifecycleOwner) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        this.paymentLauncher = this.intentConfirmationDefinition.b(activityResultCaller, new n(this));
        this.externalPaymentMethodLauncher = activityResultCaller.registerForActivityResult(new ExternalPaymentMethodContract(this.errorReporter), new o());
        ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(new BacsMandateConfirmationContract(), new r());
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.bacsMandateConfirmationLauncher = this.bacsMandateConfirmationLauncherFactory.a(activityResultLauncherRegisterForActivityResult);
        this.googlePayPaymentMethodLauncher = activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new p());
        lifecycleOwner.getLifecycle().a(new q(activityResultLauncherRegisterForActivityResult));
    }

    public final void U(Args arguments) {
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        e value = this._state.getValue();
        if ((value instanceof e.Preconfirming) || (value instanceof e.b)) {
            return;
        }
        this._state.setValue(new e.Preconfirming(arguments.getConfirmationOption(), false));
        S(arguments);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new s(arguments, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(Continuation<? super com.stripe.android.paymentsheet.r> continuation) {
        C1009h c1009h;
        if (continuation instanceof C1009h) {
            c1009h = (C1009h) continuation;
            int i11 = c1009h.f53114p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1009h.f53114p = i11 - Integer.MIN_VALUE;
            } else {
                c1009h = new C1009h(continuation);
            }
        } else {
            c1009h = new C1009h(continuation);
        }
        Object objFirst = c1009h.f53112n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1009h.f53114p;
        if (i12 == 0) {
            jn0.t.b(objFirst);
            e value = this._state.getValue();
            if (value instanceof e.c) {
                return null;
            }
            if (value instanceof e.Complete) {
                return ((e.Complete) value).getResult();
            }
            if (!(value instanceof e.Preconfirming ? true : value instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            MutableStateFlow<e> mutableStateFlow = this._state;
            g gVar = new g(null);
            c1009h.f53114p = 1;
            objFirst = FlowKt.first(mutableStateFlow, gVar, c1009h);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objFirst);
        }
        if (objFirst != null) {
            return ((e.Complete) objFirst).getResult();
        }
        throw new NullPointerException("null cannot be cast to non-null type com.stripe.android.paymentsheet.IntentConfirmationHandler.State.Complete");
    }
}
