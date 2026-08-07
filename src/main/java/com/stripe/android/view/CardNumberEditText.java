package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import ezvcard.property.Gender;
import f30.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0093\u0001\u0094\u0001Be\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0017BA\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u0015\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001cH\u0000¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b.\u0010/R\"\u0010\n\u001a\u00020\b8\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010I\u001a\u00020A2\u0006\u0010B\u001a\u00020A8\u0006@@X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010C\u0012\u0004\bH\u0010\u001e\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GRB\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001c0J2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001c0J8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010U\u001a\u00020A2\u0006\u0010B\u001a\u00020A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010C\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GRB\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001c0J2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001c0J8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010L\u001a\u0004\bW\u0010N\"\u0004\bX\u0010PR6\u0010a\u001a\b\u0012\u0004\u0012\u00020A0Z2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0Z8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`RN\u0010e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0Z\u0012\u0004\u0012\u00020\u001c0J2\u0018\u0010K\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0Z\u0012\u0004\u0012\u00020\u001c0J8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010L\u001a\u0004\bc\u0010N\"\u0004\bd\u0010PR(\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010r\u001a\u00020m2\u0006\u0010n\u001a\u00020m8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\b7\u0010qR\u0016\u0010t\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010pR \u0010{\u001a\u00020u8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010w\u0012\u0004\bz\u0010\u001e\u001a\u0004\bx\u0010yR.\u0010~\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u001c0J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010L\u001a\u0004\b9\u0010N\"\u0004\b}\u0010PR\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010&\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00198TX\u0094\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0084\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0015\u0010\u0092\u0001\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010q¨\u0006\u0095\u0001"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "workContext", "Lh30/b;", "cardAccountRangeRepository", "Lh30/p;", "staticCardAccountRanges", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lh30/b;Lh30/p;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Landroidx/lifecycle/f1;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "publishableKeySupplier", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lwn0/a;)V", "Ljn0/h0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "maxLength", "B", "(I)V", "newFormattedLength", "start", "addedDigits", "panLength", "w", "(IIII)I", "A", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "v", "Lkotlin/coroutines/CoroutineContext;", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "setWorkContext", "(Lkotlin/coroutines/CoroutineContext;)V", "Lh30/b;", "x", "Lw30/c;", "y", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "z", "Landroidx/lifecycle/f1;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/f1;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/f1;)V", "Lcom/stripe/android/model/h;", "value", "Lcom/stripe/android/model/h;", "getCardBrand", "()Lcom/stripe/android/model/h;", "setCardBrand$payments_core_release", "(Lcom/stripe/android/model/h;)V", "getCardBrand$annotations", "cardBrand", "Lkotlin/Function1;", "callback", "Lwn0/l;", "getBrandChangeCallback$payments_core_release", "()Lwn0/l;", "setBrandChangeCallback$payments_core_release", "(Lwn0/l;)V", "brandChangeCallback", "C", "getImplicitCardBrandForCbc$payments_core_release", "setImplicitCardBrandForCbc$payments_core_release", "implicitCardBrandForCbc", "D", "getImplicitCardBrandChangeCallback$payments_core_release", "setImplicitCardBrandChangeCallback$payments_core_release", "implicitCardBrandChangeCallback", "", "E", "Ljava/util/List;", "getPossibleCardBrands$payments_core_release", "()Ljava/util/List;", "setPossibleCardBrands$payments_core_release", "(Ljava/util/List;)V", "possibleCardBrands", Gender.FEMALE, "getPossibleCardBrandsCallback$payments_core_release", "setPossibleCardBrandsCallback$payments_core_release", "possibleCardBrandsCallback", "G", "Lwn0/a;", "getCompletionCallback$payments_core_release", "()Lwn0/a;", "setCompletionCallback$payments_core_release", "(Lwn0/a;)V", "completionCallback", "", "<set-?>", "H", "Z", "()Z", "isCardNumberValid", "I", "isCbcEligible", "Lh30/c;", "J", "Lh30/c;", "getAccountRangeService", "()Lh30/c;", "getAccountRangeService$annotations", "accountRangeService", "K", "setLoadingCallback$payments_core_release", "isLoadingCallback", "Lkotlinx/coroutines/Job;", "L", "Lkotlinx/coroutines/Job;", "loadingJob", "getPanLength$payments_core_release", "()I", "Lh30/f$c;", "getValidatedCardNumber$payments_core_release", "()Lh30/f$c;", "validatedCardNumber", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "getFormattedPanLength", "formattedPanLength", "Lh30/f$b;", "getUnvalidatedCardNumber", "()Lh30/f$b;", "unvalidatedCardNumber", "isValid", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberEditText extends StripeEditText {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private com.stripe.android.model.h cardBrand;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private /* synthetic */ wn0.l<? super com.stripe.android.model.h, jn0.h0> brandChangeCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private com.stripe.android.model.h implicitCardBrandForCbc;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private wn0.l<? super com.stripe.android.model.h, jn0.h0> implicitCardBrandChangeCallback;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private List<? extends com.stripe.android.model.h> possibleCardBrands;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private /* synthetic */ wn0.l<? super List<? extends com.stripe.android.model.h>, jn0.h0> possibleCardBrandsCallback;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private /* synthetic */ wn0.a<jn0.h0> completionCallback;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isCardNumberValid;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isCbcEligible;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final h30.c accountRangeService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private /* synthetic */ wn0.l<? super Boolean, jn0.h0> isLoadingCallback;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Job loadingJob;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private CoroutineContext workContext;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final h30.b cardAccountRangeRepository;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private androidx.p003lifecycle.f1 viewModelStoreOwner;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f54516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f54516c = context;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return PaymentConfiguration.INSTANCE.a(this.f54516c).getPublishableKey();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010-R\u0014\u0010/\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010-¨\u00060"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText$b;", "Lcom/stripe/android/view/v2;", "<init>", "(Lcom/stripe/android/view/CardNumberEditText;)V", "", "wasCardNumberValid", "c", "(Z)Z", "", "startPosition", "previousCount", "currentCount", "Lh30/f$b;", "cardNumber", DateTokenConverter.CONVERTER_KEY, "(IIILh30/f$b;)Z", "", "s", "start", "count", "after", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "a", "I", "latestChangeStart", "b", "latestInsertionSize", "Ljava/lang/Integer;", "newCursorPosition", "", "Ljava/lang/String;", "formattedNumber", "e", "Lh30/f$b;", "beforeCardNumber", "f", "Z", "isPastedPan", "()Z", "shouldUpdateAfterChange", "digitsAdded", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class b extends v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int latestChangeStart;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int latestInsertionSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Integer newCursorPosition;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String formattedNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private h30.f.Unvalidated beforeCardNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isPastedPan;

        public b() {
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        private final boolean a() {
            return CardNumberEditText.this.getUnvalidatedCardNumber().getLength() > this.beforeCardNumber.getLength();
        }

        private final boolean b() {
            return (a() || !CardNumberEditText.this.getIsLastKeyDelete()) && this.formattedNumber != null;
        }

        private final boolean c(boolean wasCardNumberValid) {
            if (wasCardNumberValid) {
                return false;
            }
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getIsMaxLength()) {
                return true;
            }
            return CardNumberEditText.this.z() && CardNumberEditText.this.getAccountRangeService().d() != null;
        }

        private final boolean d(int startPosition, int previousCount, int currentCount, h30.f.Unvalidated cardNumber) {
            return currentCount > previousCount && startPosition == 0 && cardNumber.getNormalized().length() >= 14;
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            if (b()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.formattedNumber);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(bo0.n.n(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.formattedNumber = null;
            this.newCursorPosition = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getLength() != CardNumberEditText.this.getPanLength$payments_core_release()) {
                if (!CardNumberEditText.this.getUnvalidatedCardNumber().i(CardNumberEditText.this.getPanLength$payments_core_release()) || CardNumberEditText.this.getUnvalidatedCardNumber().j()) {
                    CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                    cardNumberEditText2.isCardNumberValid = cardNumberEditText2.z();
                    CardNumberEditText.this.setShouldShowError(false);
                    return;
                } else {
                    CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                    cardNumberEditText3.isCardNumberValid = cardNumberEditText3.z();
                    CardNumberEditText.this.setShouldShowError(true);
                    return;
                }
            }
            boolean isCardNumberValid = CardNumberEditText.this.getIsCardNumberValid();
            CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
            cardNumberEditText4.isCardNumberValid = cardNumberEditText4.z();
            CardNumberEditText cardNumberEditText5 = CardNumberEditText.this;
            cardNumberEditText5.setShouldShowError(!cardNumberEditText5.z());
            if (CardNumberEditText.this.getAccountRangeService().d() == null && CardNumberEditText.this.getUnvalidatedCardNumber().getIsValidLuhn()) {
                CardNumberEditText.this.A();
            }
            if (c(isCardNumberValid)) {
                CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
            }
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            this.isPastedPan = false;
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.latestChangeStart = start;
            this.latestInsertionSize = after;
        }

        @Override // com.stripe.android.view.v2, android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            String string = s11 != null ? s11.toString() : null;
            if (string == null) {
                string = "";
            }
            h30.f.Unvalidated unvalidated = new h30.f.Unvalidated(string);
            CardNumberEditText.this.getAccountRangeService().h(unvalidated);
            boolean zD = d(start, before, count, unvalidated);
            this.isPastedPan = zD;
            if (zD) {
                CardNumberEditText.this.B(unvalidated.e(unvalidated.getLength()).length());
            }
            int length = this.isPastedPan ? unvalidated.getLength() : CardNumberEditText.this.getPanLength$payments_core_release();
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String strE = unvalidated.e(length);
            this.newCursorPosition = Integer.valueOf(cardNumberEditText.w(strE.length(), this.latestChangeStart, this.latestInsertionSize, length));
            this.formattedNumber = strE;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.CardNumberEditText$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/view/CardNumberEditText$c;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superSavedState", "", "isCbcEligible", "<init>", "(Landroid/os/Parcelable;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/os/Parcelable;", "getSuperSavedState", "()Landroid/os/Parcelable;", "b", "Z", "()Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavedState extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Parcelable superSavedState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCbcEligible;

        /* JADX INFO: renamed from: com.stripe.android.view.CardNumberEditText$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SavedState createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable, boolean z11) {
            super(parcelable);
            this.superSavedState = parcelable;
            this.isCbcEligible = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return p013kotlin.jvm.internal.s.f(this.superSavedState, savedState.superSavedState) && this.isCbcEligible == savedState.isCbcEligible;
        }

        public int hashCode() {
            Parcelable parcelable = this.superSavedState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + Boolean.hashCode(this.isCbcEligible);
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.superSavedState + ", isCbcEligible=" + this.isCbcEligible + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.superSavedState, flags);
            parcel.writeInt(this.isCbcEligible ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/stripe/android/view/CardNumberEditText$d", "Lh30/c$a;", "", "Lcom/stripe/android/model/a;", "accountRanges", "Ljn0/h0;", "a", "(Ljava/util/List;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements h30.c.a {
        d() {
        }

        @Override // h30.c.a
        public void a(List<AccountRange> accountRanges) {
            p013kotlin.jvm.internal.s.k(accountRanges, "accountRanges");
            CardNumberEditText.C(CardNumberEditText.this, 0, 1, null);
            List<AccountRange> list = accountRanges;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AccountRange) it.next()).b());
            }
            List<? extends com.stripe.android.model.h> listH0 = p013kotlin.collections.v.h0(arrayList);
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.W0(listH0);
            if (hVar == null) {
                hVar = com.stripe.android.model.h.Unknown;
            }
            cardNumberEditText.setCardBrand$payments_core_release(hVar);
            if (CardNumberEditText.this.isCbcEligible) {
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                com.stripe.android.model.h hVar2 = (com.stripe.android.model.h) p013kotlin.collections.v.q0(listH0);
                if (hVar2 == null) {
                    hVar2 = com.stripe.android.model.h.Unknown;
                }
                cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(hVar2);
                CardNumberEditText.this.setPossibleCardBrands$payments_core_release(listH0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(CardNumberEditText.this.isCbcEligible);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f54528c = new f();

        f() {
            super(1);
        }

        public final void a(com.stripe.android.model.h it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(com.stripe.android.model.h hVar) {
            a(hVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f54529c = new g();

        g() {
            super(0);
        }

        public final void b() {
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f54530c = new h();

        h() {
            super(1);
        }

        public final void a(com.stripe.android.model.h it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(com.stripe.android.model.h hVar) {
            a(hVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f54531c = new i();

        i() {
            super(1);
        }

        public final void a(boolean z11) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Boolean bool) {
            a(bool.booleanValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1", f = "CardNumberEditText.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54532n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f54534a;

            /* JADX INFO: renamed from: com.stripe.android.view.CardNumberEditText$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$1", f = "CardNumberEditText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1095a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f54535n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f54536o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ boolean f54537p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1095a(CardNumberEditText cardNumberEditText, boolean z11, Continuation<? super C1095a> continuation) {
                    super(2, continuation);
                    this.f54536o = cardNumberEditText;
                    this.f54537p = z11;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new C1095a(this.f54536o, this.f54537p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f54535n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    this.f54536o.y().invoke(Boxing.boxBoolean(this.f54537p));
                    return jn0.h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((C1095a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            a(CardNumberEditText cardNumberEditText) {
                this.f54534a = cardNumberEditText;
            }

            public final Object a(boolean z11, Continuation<? super jn0.h0> continuation) {
                Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C1095a(this.f54534a, z11, null), continuation);
                return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return CardNumberEditText.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54532n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<Boolean> stateFlowB = CardNumberEditText.this.cardAccountRangeRepository.b();
                a aVar = new a(CardNumberEditText.this);
                this.f54532n = 1;
                if (stateFlowB.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Lcom/stripe/android/view/a1;", "viewModel", "Ljn0/h0;", "a", "(Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/a1;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.p<LifecycleOwner, a1, jn0.h0> {

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$$inlined$launchAndCollect$default$1", f = "CardNumberEditText.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f54539n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f54540o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f54541p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Flow f54542q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f54543r;

            /* JADX INFO: renamed from: com.stripe.android.view.CardNumberEditText$k$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$2$invoke$$inlined$launchAndCollect$default$1$1", f = "CardNumberEditText.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1096a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f54544n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Flow f54545o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f54546p;

                /* JADX INFO: renamed from: com.stripe.android.view.CardNumberEditText$k$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class C1097a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardNumberEditText f54547a;

                    public C1097a(CardNumberEditText cardNumberEditText) {
                        this.f54547a = cardNumberEditText;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t11, Continuation<? super jn0.h0> continuation) {
                        boolean zBooleanValue = ((Boolean) t11).booleanValue();
                        this.f54547a.isCbcEligible = zBooleanValue;
                        List<AccountRange> listE = this.f54547a.getAccountRangeService().e();
                        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listE, 10));
                        Iterator<T> it = listE.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AccountRange) it.next()).b());
                        }
                        List<? extends com.stripe.android.model.h> listH0 = p013kotlin.collections.v.h0(arrayList);
                        if (zBooleanValue) {
                            CardNumberEditText cardNumberEditText = this.f54547a;
                            com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.q0(listH0);
                            if (hVar == null) {
                                hVar = com.stripe.android.model.h.Unknown;
                            }
                            cardNumberEditText.setImplicitCardBrandForCbc$payments_core_release(hVar);
                            this.f54547a.setPossibleCardBrands$payments_core_release(listH0);
                        } else {
                            CardNumberEditText cardNumberEditText2 = this.f54547a;
                            com.stripe.android.model.h hVar2 = (com.stripe.android.model.h) p013kotlin.collections.v.W0(listH0);
                            if (hVar2 == null) {
                                hVar2 = com.stripe.android.model.h.Unknown;
                            }
                            cardNumberEditText2.setCardBrand$payments_core_release(hVar2);
                        }
                        return jn0.h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1096a(Flow flow, Continuation continuation, CardNumberEditText cardNumberEditText) {
                    super(2, continuation);
                    this.f54545o = flow;
                    this.f54546p = cardNumberEditText;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new C1096a(this.f54545o, continuation, this.f54546p);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f54544n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        Flow flow = this.f54545o;
                        C1097a c1097a = new C1097a(this.f54546p);
                        this.f54544n = 1;
                        if (flow.collect(c1097a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    return jn0.h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((C1096a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow flow, Continuation continuation, CardNumberEditText cardNumberEditText) {
                super(2, continuation);
                this.f54541p = state;
                this.f54542q = flow;
                this.f54543r = cardNumberEditText;
                this.f54540o = lifecycleOwner;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f54540o, this.f54541p, this.f54542q, continuation, this.f54543r);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f54539n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f54540o;
                    Lifecycle.State state = this.f54541p;
                    C1096a c1096a = new C1096a(this.f54542q, null, this.f54543r);
                    this.f54539n = 1;
                    if (androidx.p003lifecycle.p0.b(lifecycleOwner, state, c1096a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        k() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, a1 viewModel) {
            p013kotlin.jvm.internal.s.k(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            StateFlow<Boolean> stateFlowI = viewModel.i();
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowI, null, cardNumberEditText), 3, null);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(LifecycleOwner lifecycleOwner, a1 a1Var) {
            a(lifecycleOwner, a1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/h;", "it", "Ljn0/h0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends com.stripe.android.model.h>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f54548c = new l();

        l() {
            super(1);
        }

        public final void a(List<? extends com.stripe.android.model.h> it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(List<? extends com.stripe.android.model.h> list) {
            a(list);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public static /* synthetic */ void C(CardNumberEditText cardNumberEditText, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.B(i11);
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + h30.f.INSTANCE.a(getPanLength$payments_core_release()).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h30.f.Unvalidated getUnvalidatedCardNumber() {
        return new h30.f.Unvalidated(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(wn0.a tmp0) {
        p013kotlin.jvm.internal.s.k(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CardNumberEditText this$0, View view, boolean z11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (z11 || !this$0.getUnvalidatedCardNumber().i(this$0.getPanLength$payments_core_release())) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z() {
        return getValidatedCardNumber$payments_core_release() != null;
    }

    public final /* synthetic */ void A() {
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataLoadedTooSlow, null, null, null, null, null, 62, null));
    }

    public final /* synthetic */ void B(int maxLength) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(f30.d0.f63936b, getText());
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    public final h30.c getAccountRangeService() {
        return this.accountRangeService;
    }

    public final wn0.l<com.stripe.android.model.h, jn0.h0> getBrandChangeCallback$payments_core_release() {
        return this.brandChangeCallback;
    }

    public final com.stripe.android.model.h getCardBrand() {
        return this.cardBrand;
    }

    public final wn0.a<jn0.h0> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final wn0.l<com.stripe.android.model.h, jn0.h0> getImplicitCardBrandChangeCallback$payments_core_release() {
        return this.implicitCardBrandChangeCallback;
    }

    /* JADX INFO: renamed from: getImplicitCardBrandForCbc$payments_core_release, reason: from getter */
    public final com.stripe.android.model.h getImplicitCardBrandForCbc() {
        return this.implicitCardBrandForCbc;
    }

    public final int getPanLength$payments_core_release() {
        AccountRange accountRangeD = this.accountRangeService.d();
        if (accountRangeD != null) {
            return accountRangeD.getPanLength();
        }
        AccountRange accountRangeB = this.accountRangeService.getStaticCardAccountRanges().b(getUnvalidatedCardNumber());
        if (accountRangeB != null) {
            return accountRangeB.getPanLength();
        }
        return 16;
    }

    public final List<com.stripe.android.model.h> getPossibleCardBrands$payments_core_release() {
        return this.possibleCardBrands;
    }

    public final wn0.l<List<? extends com.stripe.android.model.h>, jn0.h0> getPossibleCardBrandsCallback$payments_core_release() {
        return this.possibleCardBrandsCallback;
    }

    public final h30.f.Validated getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().l(getPanLength$payments_core_release());
    }

    /* JADX INFO: renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final androidx.p003lifecycle.f1 getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.loadingJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new j(null), 3, null);
        b1.a(this, this.viewModelStoreOwner, new k());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.loadingJob = null;
        this.accountRangeService.c();
        super.onDetachedFromWindow();
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable superState;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        this.isCbcEligible = savedState != null ? savedState.getIsCbcEligible() : false;
        if (savedState != null && (superState = savedState.getSuperState()) != null) {
            state = superState;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.isCbcEligible);
    }

    public final void setBrandChangeCallback$payments_core_release(wn0.l<? super com.stripe.android.model.h, jn0.h0> callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.brandChangeCallback = callback;
        callback.invoke(this.cardBrand);
    }

    public final void setCardBrand$payments_core_release(com.stripe.android.model.h value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        com.stripe.android.model.h hVar = this.cardBrand;
        this.cardBrand = value;
        if (value != hVar) {
            this.brandChangeCallback.invoke(value);
            C(this, 0, 1, null);
        }
    }

    public final void setCompletionCallback$payments_core_release(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(wn0.l<? super com.stripe.android.model.h, jn0.h0> callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.implicitCardBrandChangeCallback = callback;
        callback.invoke(this.implicitCardBrandForCbc);
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(com.stripe.android.model.h value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        com.stripe.android.model.h hVar = this.implicitCardBrandForCbc;
        this.implicitCardBrandForCbc = value;
        if (value != hVar) {
            this.implicitCardBrandChangeCallback.invoke(value);
            C(this, 0, 1, null);
        }
    }

    public final void setLoadingCallback$payments_core_release(wn0.l<? super Boolean, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.isLoadingCallback = lVar;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends com.stripe.android.model.h> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        List<? extends com.stripe.android.model.h> list = this.possibleCardBrands;
        this.possibleCardBrands = value;
        if (p013kotlin.jvm.internal.s.f(value, list)) {
            return;
        }
        this.possibleCardBrandsCallback.invoke(value);
        C(this, 0, 1, null);
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(wn0.l<? super List<? extends com.stripe.android.model.h>, jn0.h0> callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.possibleCardBrandsCallback = callback;
        callback.invoke(this.possibleCardBrands);
    }

    public final void setViewModelStoreOwner$payments_core_release(androidx.p003lifecycle.f1 f1Var) {
        this.viewModelStoreOwner = f1Var;
    }

    public final void setWorkContext(CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(coroutineContext, "<set-?>");
        this.workContext = coroutineContext;
    }

    public final /* synthetic */ int w(int newFormattedLength, int start, int addedDigits, int panLength) {
        int i11;
        Set<Integer> setA = h30.f.INSTANCE.a(panLength);
        boolean z11 = setA instanceof Collection;
        boolean z12 = false;
        if (z11 && setA.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it = setA.iterator();
            i11 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (start <= iIntValue && start + addedDigits >= iIntValue && (i11 = i11 + 1) < 0) {
                    p013kotlin.collections.v.w();
                }
            }
        }
        if (!z11 || !setA.isEmpty()) {
            Iterator<T> it2 = setA.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                if (addedDigits == 0 && start == iIntValue2 + 1) {
                    z12 = true;
                    break;
                }
            }
        }
        int i12 = start + addedDigits + i11;
        if (z12 && i12 > 0) {
            i12--;
        }
        return i12 <= newFormattedLength ? i12 : newFormattedLength;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsCardNumberValid() {
        return this.isCardNumberValid;
    }

    public final wn0.l<Boolean, jn0.h0> y() {
        return this.isLoadingCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i11, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, h30.b bVar, h30.p pVar, w30.c cVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, androidx.p003lifecycle.f1 f1Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? i.a.E : i11, coroutineContext, coroutineContext2, bVar, (i12 & 64) != 0 ? new h30.k() : pVar, cVar, paymentAnalyticsRequestFactory, (i12 & 512) != 0 ? null : f1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i11, CoroutineContext uiContext, CoroutineContext workContext, h30.b cardAccountRangeRepository, h30.p staticCardAccountRanges, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, androidx.p003lifecycle.f1 f1Var) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepository, "cardAccountRangeRepository");
        p013kotlin.jvm.internal.s.k(staticCardAccountRanges, "staticCardAccountRanges");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.workContext = workContext;
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.viewModelStoreOwner = f1Var;
        com.stripe.android.model.h hVar = com.stripe.android.model.h.Unknown;
        this.cardBrand = hVar;
        this.brandChangeCallback = f.f54528c;
        this.implicitCardBrandForCbc = hVar;
        this.implicitCardBrandChangeCallback = h.f54530c;
        this.possibleCardBrands = p013kotlin.collections.v.m();
        this.possibleCardBrandsCallback = l.f54548c;
        this.completionCallback = g.f54529c;
        this.accountRangeService = new h30.c(cardAccountRangeRepository, uiContext, this.workContext, staticCardAccountRanges, new d(), new e());
        this.isLoadingCallback = i.f54531c;
        setNumberOnlyInputType();
        setErrorMessage(getResources().getString(f30.d0.f63979w0));
        addTextChangedListener(new b());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.w0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CardNumberEditText.p(this.f55187a, view, z11);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
        C(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? i.a.E : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, Dispatchers.getMain(), Dispatchers.getIO(), new a(context));
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i11, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final wn0.a<String> aVar) {
        this(context, attributeSet, i11, coroutineContext, coroutineContext2, new h30.j(context).create(), new h30.k(), new w30.o(), new PaymentAnalyticsRequestFactory(context, new Provider() { // from class: com.stripe.android.view.v0
            @Override // javax.inject.Provider
            public final Object get() {
                return CardNumberEditText.o(aVar);
            }
        }), null, 512, null);
    }
}
