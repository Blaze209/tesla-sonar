package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import android.content.Context;
import android.os.Parcelable;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.x;
import androidx.p003lifecycle.y0;
import c60.LinkConfiguration;
import c80.CvcRecollectionData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.b0;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.ui.SepaMandateContract;
import com.stripe.android.paymentsheet.y;
import ezvcard.property.Gender;
import f30.PaymentConfiguration;
import g80.CustomerState;
import g80.Full;
import g80.LinkState;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import n70.n;
import n70.o;
import n70.q;
import n70.r;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w70.PaymentOption;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 T2\u00020\u0001:\u0003y»\u0001B\u0083\u0002\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0001\u0010!\u001a\u00020 \u0012\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\b\b\u0001\u00103\u001a\u00020 \u0012\b\b\u0001\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J'\u0010C\u001a\u00020B2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020F0EH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u001f\u0010L\u001a\u00020B2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020FH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020B2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020B2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ#\u0010Z\u001a\u00020B2\b\u0010W\u001a\u0004\u0018\u00010V2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010]\u001a\u00020B2\u0006\u0010J\u001a\u00020\\2\u0006\u0010K\u001a\u00020FH\u0002¢\u0006\u0004\b]\u0010^J\u001d\u0010c\u001a\u0004\u0018\u00010b*\u00020_2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bc\u0010dJ\u0013\u0010f\u001a\u00020e*\u00020VH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010jJ)\u0010l\u001a\u00020B2\u0006\u0010k\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bl\u0010mJ)\u0010o\u001a\u00020B2\u0006\u0010n\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bo\u0010mJ)\u0010r\u001a\u00020B2\u0006\u0010q\u001a\u00020p2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020BH\u0016¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020BH\u0016¢\u0006\u0004\by\u0010xJ!\u0010z\u001a\u00020B2\b\u0010J\u001a\u0004\u0018\u00010\\2\u0006\u0010K\u001a\u00020FH\u0007¢\u0006\u0004\bz\u0010^J\u0017\u0010|\u001a\u00020B2\u0006\u0010O\u001a\u00020{H\u0000¢\u0006\u0004\b|\u0010}J\u0016\u0010\u007f\u001a\u00020B2\u0006\u0010O\u001a\u00020~¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001e\u0010\u0083\u0001\u001a\u00020B2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J1\u0010\u0086\u0001\u001a\u00020B2\u0006\u0010W\u001a\u00020V2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X2\t\b\u0002\u0010\u0085\u0001\u001a\u00020 H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u008a\u0001\u001a\u00020B2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bo\u0010\u008c\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bl\u0010\u008d\u0001R\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bw\u0010\u008e\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bu\u0010\u008f\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0090\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R$\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010£\u0001R\u0015\u00103\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010\u009c\u0001R\u0015\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010¤\u0001R\u001e\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010§\u0001R\u001e\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bf\u0010§\u0001R\u0017\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010¬\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u0017\u0010¸\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010·\u0001R\u0019\u0010º\u0001\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010¹\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "Lcom/stripe/android/paymentsheet/y$k;", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "", "statusBarColor", "Lw70/h;", "paymentOptionFactory", "Ln70/o;", "paymentOptionCallback", "Ln70/q;", "paymentResultCallback", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/y$j;", "Ln70/r;", "prefsRepositoryFactory", "Lh/b;", "activityResultCaller", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/flowcontroller/f;", "viewModel", "Lcom/stripe/android/payments/paymentlauncher/h;", "paymentLauncherFactory", "Ljavax/inject/Provider;", "Lf30/o;", "lazyPaymentConfiguration", "", "enableLogging", "", "", "productUsage", "Lb60/e;", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "bacsMandateConfirmationLauncherFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/a;", "cvcRecollectionLauncherFactory", "Lcom/stripe/android/link/d;", "linkLauncher", "Lcom/stripe/android/paymentsheet/flowcontroller/c;", "configurationHandler", "Lcom/stripe/android/paymentsheet/i;", "intentConfirmationInterceptor", "Lh70/h;", "errorReporter", "initializedViaCompose", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lz30/j;", "logger", "Lr70/a;", "cvcRecollectionHandler", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/LifecycleOwner;Lwn0/a;Lw70/h;Ln70/o;Ln70/q;Lwn0/l;Lh/b;Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/f;Lcom/stripe/android/payments/paymentlauncher/h;Ljavax/inject/Provider;ZLjava/util/Set;Lb60/e;Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/a;Lcom/stripe/android/link/d;Lcom/stripe/android/paymentsheet/flowcontroller/c;Lcom/stripe/android/paymentsheet/i;Lh70/h;ZLkotlin/coroutines/CoroutineContext;Lz30/j;Lr70/a;)V", "Lcom/stripe/android/paymentsheet/y$m;", "mode", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "Lcom/stripe/android/paymentsheet/y$k$b;", "callback", "Ljn0/h0;", "p", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/y$k$b;)V", "Ljn0/s;", "Lg80/l;", "u", "()Ljava/lang/Object;", "Lw70/j$f;", "paymentSelection", "state", "s", "(Lw70/j$f;Lg80/l;)V", "Lcom/stripe/android/paymentsheet/r;", "result", "A", "(Lcom/stripe/android/paymentsheet/r;)V", "Lcom/stripe/android/paymentsheet/r$a;", "canceled", "x", "(Lcom/stripe/android/paymentsheet/r$a;)V", "Lcom/stripe/android/payments/paymentlauncher/f;", "paymentResult", "Ln70/f;", "deferredIntentConfirmationType", "y", "(Lcom/stripe/android/payments/paymentlauncher/f;Ln70/f;)V", "Lw70/j;", "q", "(Lw70/j;Lg80/l;)V", "Lcom/stripe/android/paymentsheet/o;", "", "cause", "Lq70/b;", "H", "(Lcom/stripe/android/paymentsheet/o;Ljava/lang/Throwable;)Lq70/b;", "Lcom/stripe/android/paymentsheet/b0;", "t", "(Lcom/stripe/android/payments/paymentlauncher/f;)Lcom/stripe/android/paymentsheet/b0;", "Lcom/stripe/android/paymentsheet/y$b;", "w", "()Lcom/stripe/android/paymentsheet/y$b;", "paymentIntentClientSecret", "c", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/y$k$b;)V", "setupIntentClientSecret", "b", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "a", "(Lcom/stripe/android/paymentsheet/y$n;Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/y$k$b;)V", "Lw70/g;", "e", "()Lw70/g;", DateTokenConverter.CONVERTER_KEY, "()V", "f", "r", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/b;", "z", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/b;)V", "Lcom/stripe/android/link/a;", "B", "(Lcom/stripe/android/link/a;)V", "Lcom/stripe/android/paymentsheet/s;", "paymentOptionResult", "C", "(Lcom/stripe/android/paymentsheet/s;)V", "shouldLog", "D", "(Lcom/stripe/android/payments/paymentlauncher/f;Ln70/f;Z)V", "Lcom/stripe/android/paymentsheet/ui/e;", "sepaMandateResult", Gender.FEMALE, "(Lcom/stripe/android/paymentsheet/ui/e;)V", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/LifecycleOwner;", "Lwn0/a;", "Lw70/h;", "Ln70/o;", "g", "Ln70/q;", "h", "Lwn0/l;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "j", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "k", "Lcom/stripe/android/paymentsheet/flowcontroller/f;", "l", "Z", "m", "Ljava/util/Set;", "n", "Lcom/stripe/android/link/d;", "o", "Lcom/stripe/android/paymentsheet/flowcontroller/c;", "Lh70/h;", "Lr70/a;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "Landroidx/activity/result/ActivityResultLauncher;", "paymentOptionActivityLauncher", "Lcom/stripe/android/paymentsheet/ui/SepaMandateContract$a;", "sepaMandateActivityLauncher", "Lc80/f;", "Lc80/f;", "cvcRecollectionLauncher", "Lcom/stripe/android/paymentsheet/flowcontroller/b;", "v", "Lcom/stripe/android/paymentsheet/flowcontroller/b;", "getFlowControllerComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/b;", "G", "(Lcom/stripe/android/paymentsheet/flowcontroller/b;)V", "flowControllerComponent", "Lcom/stripe/android/paymentsheet/h;", "Lcom/stripe/android/paymentsheet/h;", "intentConfirmationHandler", "()Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "CvcRecollectionException", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultFlowController implements y.k {

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f52884y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope viewModelScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Integer> statusBarColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w70.h paymentOptionFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o paymentOptionCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final q paymentResultCallback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<y.CustomerConfiguration, r> prefsRepositoryFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final EventReporter eventReporter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f viewModel;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsage;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.link.d linkLauncher;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.flowcontroller.c configurationHandler;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean initializedViaCompose;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final r70.a cvcRecollectionHandler;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<PaymentOptionContract.Args> paymentOptionActivityLauncher;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<SepaMandateContract.Args> sepaMandateActivityLauncher;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final c80.f cvcRecollectionLauncher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public com.stripe.android.paymentsheet.flowcontroller.b flowControllerComponent;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.h intentConfirmationHandler;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$CvcRecollectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$CvcRecollectionException$a;", "type", "<init>", "(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$CvcRecollectionException$a;)V", "a", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$CvcRecollectionException$a;", "getType", "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$CvcRecollectionException$a;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CvcRecollectionException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$CvcRecollectionException$a;", "", "<init>", "(Ljava/lang/String;I)V", "IncorrectSelection", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            IncorrectSelection;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52909a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.IncorrectSelection.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f52909a = iArr;
            }
        }

        public CvcRecollectionException(a type) {
            s.k(type, "type");
            this.type = type;
            if (b.f52909a[type.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.message = "PaymentSelection must be PaymentSelection.Saved for CVC recollection";
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        a() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.s sVar) {
            DefaultFlowController.this.C(sVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p(1, DefaultFlowController.this, DefaultFlowController.class, "onPaymentOptionResult", "onPaymentOptionResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        b() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.ui.e p11) {
            s.k(p11, "p0");
            DefaultFlowController.this.F(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p(1, DefaultFlowController.this, DefaultFlowController.class, "onSepaMandateResult", "onSepaMandateResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/ui/SepaMandateResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends p implements wn0.l<com.stripe.android.link.a, h0> {
        c(Object obj) {
            super(1, obj, DefaultFlowController.class, "onLinkActivityResult", "onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        public final void a(com.stripe.android.link.a p11) {
            s.k(p11, "p0");
            ((DefaultFlowController) this.receiver).B(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.link.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$d", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set<ActivityResultLauncher<? extends Parcelable>> f52912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DefaultFlowController f52913b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Set<? extends ActivityResultLauncher<? extends Parcelable>> set, DefaultFlowController defaultFlowController) {
            this.f52912a = set;
            this.f52913b = defaultFlowController;
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            s.k(owner, "owner");
            Iterator<T> it = this.f52912a.iterator();
            while (it.hasNext()) {
                ((ActivityResultLauncher) it.next()).d();
            }
            this.f52913b.linkLauncher.e();
            y.k.INSTANCE.d(null);
            com.stripe.android.paymentsheet.i.INSTANCE.b(null);
            n70.j.f93418a.c(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$5", f = "DefaultFlowController.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52914n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e;", "state", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/paymentsheet/h$e;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$5$1", f = "DefaultFlowController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<com.stripe.android.paymentsheet.h.e, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52916n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f52917o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ DefaultFlowController f52918p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DefaultFlowController defaultFlowController, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52918p = defaultFlowController;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.stripe.android.paymentsheet.h.e eVar, Continuation<? super h0> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f52918p, continuation);
                aVar.f52917o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52916n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                com.stripe.android.paymentsheet.h.e eVar = (com.stripe.android.paymentsheet.h.e) this.f52917o;
                if (!(eVar instanceof com.stripe.android.paymentsheet.h.e.c ? true : eVar instanceof com.stripe.android.paymentsheet.h.e.Preconfirming ? true : eVar instanceof com.stripe.android.paymentsheet.h.e.b) && (eVar instanceof com.stripe.android.paymentsheet.h.e.Complete)) {
                    this.f52918p.A(((com.stripe.android.paymentsheet.h.e.Complete) eVar).getResult());
                }
                return h0.f84049a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return DefaultFlowController.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52914n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow<com.stripe.android.paymentsheet.h.e> stateFlowD = DefaultFlowController.this.intentConfirmationHandler.D();
                a aVar = new a(DefaultFlowController.this, null);
                this.f52914n = 1;
                if (FlowKt.collectLatest(stateFlowD, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$f, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$f;", "", "<init>", "()V", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lh/b;", "activityResultCaller", "Lkotlin/Function0;", "", "statusBarColor", "Ln70/o;", "paymentOptionCallback", "Ln70/q;", "paymentResultCallback", "", "initializedViaCompose", "Lcom/stripe/android/paymentsheet/y$k;", "a", "(Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Lh/b;Lwn0/a;Ln70/o;Ln70/q;Z)Lcom/stripe/android/paymentsheet/y$k;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y.k a(f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, h.b activityResultCaller, wn0.a<Integer> statusBarColor, o paymentOptionCallback, q paymentResultCallback, boolean initializedViaCompose) {
            s.k(viewModelStoreOwner, "viewModelStoreOwner");
            s.k(lifecycleOwner, "lifecycleOwner");
            s.k(activityResultCaller, "activityResultCaller");
            s.k(statusBarColor, "statusBarColor");
            s.k(paymentOptionCallback, "paymentOptionCallback");
            s.k(paymentResultCallback, "paymentResultCallback");
            com.stripe.android.paymentsheet.flowcontroller.b bVarBuild = ((f) new ViewModelProvider(viewModelStoreOwner, new y0()).b(f.class)).getFlowControllerStateComponent().a().a(lifecycleOwner).d(activityResultCaller).c(statusBarColor).f(paymentOptionCallback).b(paymentResultCallback).e(initializedViaCompose).build();
            DefaultFlowController defaultFlowControllerA = bVarBuild.a();
            defaultFlowControllerA.G(bVarBuild);
            return defaultFlowControllerA;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52920b;

        static {
            int[] iArr = new int[w70.j.Saved.b.values().length];
            try {
                iArr[w70.j.Saved.b.GooglePay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w70.j.Saved.b.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52919a = iArr;
            int[] iArr2 = new int[n.values().length];
            try {
                iArr2[n.InformCancellation.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n.ModifyPaymentDetails.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f52920b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1", f = "DefaultFlowController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52921n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f52922o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ w70.j f52924q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Full f52925r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(w70.j jVar, Full full, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f52924q = jVar;
            this.f52925r = full;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = DefaultFlowController.this.new h(this.f52924q, this.f52925r, continuation);
            hVar.f52922o = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0076  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f52921n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            y.m mVarV = DefaultFlowController.this.v();
            if (mVarV == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w70.j jVar = this.f52924q;
            h0 h0Var = null;
            com.stripe.android.paymentsheet.p pVarA = jVar != null ? com.stripe.android.paymentsheet.q.a(jVar, mVarV, this.f52925r.getConfig()) : null;
            if (pVarA != null) {
                Full full = this.f52925r;
                DefaultFlowController defaultFlowController = DefaultFlowController.this;
                StripeIntent stripeIntentI = full.i();
                if (stripeIntentI == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                defaultFlowController.intentConfirmationHandler.U(new com.stripe.android.paymentsheet.h.Args(stripeIntentI, pVarA));
                h0Var = h0.f84049a;
            }
            if (h0Var == null) {
                w70.j jVar2 = this.f52924q;
                DefaultFlowController defaultFlowController2 = DefaultFlowController.this;
                if (jVar2 != null) {
                    str = "Cannot confirm using a " + o0.b(jVar2.getClass()).c() + " payment selection!";
                    if (str == null) {
                        str = "Cannot confirm without a payment selection!";
                    }
                } else {
                    str = "Cannot confirm without a payment selection!";
                }
                IllegalStateException illegalStateException = new IllegalStateException(str);
                if (jVar2 != null) {
                    h70.h.b.a(defaultFlowController2.errorReporter, h70.h.f.FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT, StripeException.INSTANCE.b(illegalStateException), null, 4, null);
                }
                defaultFlowController2.A(new com.stripe.android.paymentsheet.r.Failed(illegalStateException, l30.a.b(illegalStateException), com.stripe.android.paymentsheet.o.d.f53214a));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc80/d;", "cvcRecollectionData", "Ljn0/h0;", "a", "(Lc80/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<CvcRecollectionData, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Full f52927d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Full full) {
            super(1);
            this.f52927d = full;
        }

        public final void a(CvcRecollectionData cvcRecollectionData) {
            s.k(cvcRecollectionData, "cvcRecollectionData");
            DefaultFlowController.this.cvcRecollectionLauncher.a(cvcRecollectionData, DefaultFlowController.this.w(), this.f52927d.i().getIsLiveMode());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CvcRecollectionData cvcRecollectionData) {
            a(cvcRecollectionData);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class j implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        j() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b p11) {
            s.k(p11, "p0");
            DefaultFlowController.this.z(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p(1, DefaultFlowController.this, DefaultFlowController.class, "onCvcRecollectionResult", "onCvcRecollectionResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.a<Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f52929c = new k();

        k() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$onPaymentResult$1", f = "DefaultFlowController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52930n;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new l(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f52930n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            com.stripe.android.paymentsheet.k kVarC = y.k.INSTANCE.c();
            if (kVarC != null) {
                kVarC.i();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$onPaymentResult$2", f = "DefaultFlowController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52931n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.payments.paymentlauncher.f f52933p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.payments.paymentlauncher.f fVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f52933p = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return DefaultFlowController.this.new m(this.f52933p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f52931n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            DefaultFlowController.this.paymentResultCallback.a(DefaultFlowController.this.t(this.f52933p));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public DefaultFlowController(CoroutineScope viewModelScope, LifecycleOwner lifecycleOwner, wn0.a<Integer> statusBarColor, w70.h paymentOptionFactory, o paymentOptionCallback, q paymentResultCallback, wn0.l<y.CustomerConfiguration, r> prefsRepositoryFactory, h.b activityResultCaller, Context context, EventReporter eventReporter, f viewModel, com.stripe.android.payments.paymentlauncher.h paymentLauncherFactory, Provider<PaymentConfiguration> lazyPaymentConfiguration, boolean z11, Set<String> productUsage, b60.e googlePayPaymentMethodLauncherFactory, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a cvcRecollectionLauncherFactory, com.stripe.android.link.d linkLauncher, com.stripe.android.paymentsheet.flowcontroller.c configurationHandler, com.stripe.android.paymentsheet.i intentConfirmationInterceptor, h70.h errorReporter, boolean z12, CoroutineContext workContext, z30.j logger, r70.a cvcRecollectionHandler) {
        s.k(viewModelScope, "viewModelScope");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(statusBarColor, "statusBarColor");
        s.k(paymentOptionFactory, "paymentOptionFactory");
        s.k(paymentOptionCallback, "paymentOptionCallback");
        s.k(paymentResultCallback, "paymentResultCallback");
        s.k(prefsRepositoryFactory, "prefsRepositoryFactory");
        s.k(activityResultCaller, "activityResultCaller");
        s.k(context, "context");
        s.k(eventReporter, "eventReporter");
        s.k(viewModel, "viewModel");
        s.k(paymentLauncherFactory, "paymentLauncherFactory");
        s.k(lazyPaymentConfiguration, "lazyPaymentConfiguration");
        s.k(productUsage, "productUsage");
        s.k(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        s.k(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        s.k(cvcRecollectionLauncherFactory, "cvcRecollectionLauncherFactory");
        s.k(linkLauncher, "linkLauncher");
        s.k(configurationHandler, "configurationHandler");
        s.k(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        s.k(errorReporter, "errorReporter");
        s.k(workContext, "workContext");
        s.k(logger, "logger");
        s.k(cvcRecollectionHandler, "cvcRecollectionHandler");
        this.viewModelScope = viewModelScope;
        this.lifecycleOwner = lifecycleOwner;
        this.statusBarColor = statusBarColor;
        this.paymentOptionFactory = paymentOptionFactory;
        this.paymentOptionCallback = paymentOptionCallback;
        this.paymentResultCallback = paymentResultCallback;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.context = context;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
        this.enableLogging = z11;
        this.productUsage = productUsage;
        this.linkLauncher = linkLauncher;
        this.configurationHandler = configurationHandler;
        this.errorReporter = errorReporter;
        this.initializedViaCompose = z12;
        this.cvcRecollectionHandler = cvcRecollectionHandler;
        com.stripe.android.paymentsheet.h hVarD = new com.stripe.android.paymentsheet.h.d(intentConfirmationInterceptor, lazyPaymentConfiguration, bacsMandateConfirmationLauncherFactory, paymentLauncherFactory, googlePayPaymentMethodLauncherFactory, viewModel.getHandle(), k.f52929c, errorReporter, logger).d(CoroutineScopeKt.plus(viewModelScope, workContext));
        this.intentConfirmationHandler = hVarD;
        hVarD.P(activityResultCaller, lifecycleOwner);
        ActivityResultLauncher<PaymentOptionContract.Args> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(new PaymentOptionContract(), new a());
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.paymentOptionActivityLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<SepaMandateContract.Args> activityResultLauncherRegisterForActivityResult2 = activityResultCaller.registerForActivityResult(new SepaMandateContract(), new b());
        s.j(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.sepaMandateActivityLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncherRegisterForActivityResult3 = activityResultCaller.registerForActivityResult(new CvcRecollectionContract(), new j());
        s.j(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.cvcRecollectionLauncher = cvcRecollectionLauncherFactory.a(activityResultLauncherRegisterForActivityResult3);
        Set setI = d1.i(activityResultLauncherRegisterForActivityResult, activityResultLauncherRegisterForActivityResult2, activityResultLauncherRegisterForActivityResult3);
        linkLauncher.c(activityResultCaller, new c(this));
        lifecycleOwner.getLifecycle().a(new d(setI, this));
        BuildersKt__Builders_commonKt.launch$default(x.a(lifecycleOwner), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(com.stripe.android.paymentsheet.r result) {
        y.Configuration config;
        y.CustomerConfiguration customer = null;
        if (!(result instanceof com.stripe.android.paymentsheet.r.Succeeded)) {
            if (!(result instanceof com.stripe.android.paymentsheet.r.Failed)) {
                if (result instanceof com.stripe.android.paymentsheet.r.Canceled) {
                    x((com.stripe.android.paymentsheet.r.Canceled) result);
                    return;
                }
                return;
            } else {
                com.stripe.android.paymentsheet.r.Failed bVar = (com.stripe.android.paymentsheet.r.Failed) result;
                q70.b bVarH = H(bVar.getType(), bVar.getCause());
                if (bVarH != null) {
                    this.eventReporter.l(this.viewModel.getPaymentSelection(), bVarH);
                }
                D(new com.stripe.android.payments.paymentlauncher.f.d(bVar.getCause()), null, false);
                return;
            }
        }
        com.stripe.android.paymentsheet.r.Succeeded cVar = (com.stripe.android.paymentsheet.r.Succeeded) result;
        StripeIntent stripeIntentB = cVar.getIntent();
        w70.j paymentSelection = this.viewModel.getPaymentSelection();
        y.m mVarV = v();
        if (paymentSelection instanceof w70.j.e) {
            PaymentMethod paymentMethod = (mVarV == null || !i80.d.a((w70.j.e) paymentSelection, mVarV)) ? null : stripeIntentB.getPaymentMethod();
            paymentSelection = paymentMethod != null ? new w70.j.Saved(paymentMethod, null, null, 6, null) : null;
        } else if (paymentSelection instanceof w70.j.Saved) {
            w70.j.Saved.b walletType = ((w70.j.Saved) paymentSelection).getWalletType();
            int i11 = walletType == null ? -1 : g.f52919a[walletType.ordinal()];
            if (i11 == 1) {
                paymentSelection = w70.j.c.f121146b;
            } else if (i11 == 2) {
                paymentSelection = w70.j.d.f121147b;
            }
        }
        if (paymentSelection != null) {
            wn0.l<y.CustomerConfiguration, r> lVar = this.prefsRepositoryFactory;
            Full fullK = this.viewModel.k();
            if (fullK != null && (config = fullK.getConfig()) != null) {
                customer = config.getCustomer();
            }
            lVar.invoke(customer).c(paymentSelection);
        }
        this.eventReporter.r(this.viewModel.getPaymentSelection(), cVar.getDeferredIntentConfirmationType());
        D(com.stripe.android.payments.paymentlauncher.f.c.f52256c, cVar.getDeferredIntentConfirmationType(), false);
    }

    public static /* synthetic */ void E(DefaultFlowController defaultFlowController, com.stripe.android.payments.paymentlauncher.f fVar, n70.f fVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        defaultFlowController.D(fVar, fVar2, z11);
    }

    private final q70.b H(com.stripe.android.paymentsheet.o oVar, Throwable th2) {
        if (s.f(oVar, com.stripe.android.paymentsheet.o.a.f53211a)) {
            return q70.b.a.f104882a;
        }
        if (s.f(oVar, com.stripe.android.paymentsheet.o.f.f53216a)) {
            return new q70.b.Stripe(th2);
        }
        if (oVar instanceof com.stripe.android.paymentsheet.o.GooglePay) {
            return new q70.b.GooglePay(((com.stripe.android.paymentsheet.o.GooglePay) oVar).getErrorCode());
        }
        if (s.f(oVar, com.stripe.android.paymentsheet.o.d.f53214a) ? true : s.f(oVar, com.stripe.android.paymentsheet.o.e.f53215a) ? true : s.f(oVar, com.stripe.android.paymentsheet.o.b.f53212a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void p(y.m mode, y.Configuration configuration, y.k.b callback) {
        this.configurationHandler.e(this.viewModelScope, mode, configuration, this.initializedViaCompose, callback);
    }

    private final void q(w70.j paymentSelection, Full state) {
        LinkState linkState = state.getLinkState();
        if (linkState == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LinkConfiguration configuration = linkState.getConfiguration();
        if (paymentSelection instanceof w70.j.d) {
            this.linkLauncher.b(configuration);
        } else {
            r(paymentSelection, state);
        }
    }

    private final void s(w70.j.Saved paymentSelection, Full state) {
        w70.j paymentSelection2;
        if (paymentSelection.getPaymentMethod().type == PaymentMethod.p.SepaDebit && (paymentSelection2 = this.viewModel.getPaymentSelection()) != null && !paymentSelection2.getHasAcknowledgedSepaMandate()) {
            this.sepaMandateActivityLauncher.b(new SepaMandateContract.Args(state.getConfig().getMerchantDisplayName()));
        } else if (r70.a.C2279a.a(this.cvcRecollectionHandler, state.i(), paymentSelection, v(), null, 8, null)) {
            this.cvcRecollectionHandler.a(paymentSelection, new i(state));
        } else {
            r(paymentSelection, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 t(com.stripe.android.payments.paymentlauncher.f fVar) {
        if (fVar instanceof com.stripe.android.payments.paymentlauncher.f.c) {
            return b0.b.f52717a;
        }
        if (fVar instanceof com.stripe.android.payments.paymentlauncher.f.a) {
            return b0.a.f52716a;
        }
        if (fVar instanceof com.stripe.android.payments.paymentlauncher.f.d) {
            return new b0.Failed(((com.stripe.android.payments.paymentlauncher.f.d) fVar).getThrowable());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object u() {
        Full fullK = this.viewModel.k();
        if (fullK == null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(t.a(new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling presentPaymentOptions().")));
        }
        if (this.configurationHandler.i()) {
            return jn0.s.b(fullK);
        }
        jn0.s.Companion companion2 = jn0.s.INSTANCE;
        return jn0.s.b(t.a(new IllegalStateException("FlowController is not configured, or has a configuration update in flight.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y.m v() {
        com.stripe.android.paymentsheet.flowcontroller.c.ConfigureRequest previousConfigureRequest = this.viewModel.getPreviousConfigureRequest();
        if (previousConfigureRequest != null) {
            return previousConfigureRequest.getInitializationMode();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y.Appearance w() {
        y.Configuration config;
        y.Appearance appearance;
        Full fullK = this.viewModel.k();
        return (fullK == null || (config = fullK.getConfig()) == null || (appearance = config.getAppearance()) == null) ? new y.Appearance() : appearance;
    }

    private final void x(com.stripe.android.paymentsheet.r.Canceled canceled) {
        int i11 = g.f52920b[canceled.getAction().ordinal()];
        if (i11 == 1) {
            D(com.stripe.android.payments.paymentlauncher.f.a.f52255c, null, false);
        } else {
            if (i11 != 2) {
                return;
            }
            d();
        }
    }

    private final void y(com.stripe.android.payments.paymentlauncher.f paymentResult, n70.f deferredIntentConfirmationType) {
        if (paymentResult instanceof com.stripe.android.payments.paymentlauncher.f.c) {
            this.eventReporter.r(this.viewModel.getPaymentSelection(), deferredIntentConfirmationType);
        } else if (paymentResult instanceof com.stripe.android.payments.paymentlauncher.f.d) {
            this.eventReporter.l(this.viewModel.getPaymentSelection(), new q70.b.Stripe(((com.stripe.android.payments.paymentlauncher.f.d) paymentResult).getThrowable()));
        }
    }

    public final void B(com.stripe.android.link.a result) {
        Object objB;
        s.k(result, "result");
        if (result instanceof com.stripe.android.link.a.Canceled) {
            E(this, com.stripe.android.payments.paymentlauncher.f.a.f52255c, null, false, 6, null);
            return;
        }
        if (result instanceof com.stripe.android.link.a.Failed) {
            E(this, new com.stripe.android.payments.paymentlauncher.f.d(((com.stripe.android.link.a.Failed) result).getError()), null, false, 6, null);
            return;
        }
        if (!(result instanceof com.stripe.android.link.a.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Full fullK = this.viewModel.k();
            if (fullK == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            objB = jn0.s.b(fullK);
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                this.eventReporter.l(w70.j.d.f121147b, q70.b.c.f104886a);
                this.paymentResultCallback.a(new b0.Failed(thE));
            } else {
                w70.j.Saved saved = new w70.j.Saved(((com.stripe.android.link.a.Completed) result).getPaymentMethod(), w70.j.Saved.b.Link, null, 4, null);
                this.viewModel.m(saved);
                r(saved, (Full) objB);
            }
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
    }

    public final /* synthetic */ void C(com.stripe.android.paymentsheet.s paymentOptionResult) {
        List<PaymentMethod> listA;
        Full fullB;
        if (paymentOptionResult != null && (listA = paymentOptionResult.a()) != null) {
            Full fullK = this.viewModel.k();
            f fVar = this.viewModel;
            if (fullK != null) {
                CustomerState customer = fullK.getCustomer();
                fullB = Full.b(fullK, null, customer != null ? CustomerState.b(customer, null, null, null, listA, null, 23, null) : null, null, null, null, null, 61, null);
            } else {
                fullB = null;
            }
            fVar.o(fullB);
        }
        if (paymentOptionResult instanceof com.stripe.android.paymentsheet.s.Succeeded) {
            w70.j jVarD = ((com.stripe.android.paymentsheet.s.Succeeded) paymentOptionResult).getPaymentSelection();
            jVarD.d(true);
            this.viewModel.m(jVarD);
            this.paymentOptionCallback.a(this.paymentOptionFactory.b(jVarD));
            return;
        }
        if (paymentOptionResult instanceof com.stripe.android.paymentsheet.s.Failed) {
            o oVar = this.paymentOptionCallback;
            w70.j paymentSelection = this.viewModel.getPaymentSelection();
            oVar.a(paymentSelection != null ? this.paymentOptionFactory.b(paymentSelection) : null);
        } else if (paymentOptionResult instanceof com.stripe.android.paymentsheet.s.Canceled) {
            w70.j jVarD2 = ((com.stripe.android.paymentsheet.s.Canceled) paymentOptionResult).getPaymentSelection();
            this.viewModel.m(jVarD2);
            this.paymentOptionCallback.a(jVarD2 != null ? this.paymentOptionFactory.b(jVarD2) : null);
        } else if (paymentOptionResult == null) {
            this.viewModel.m(null);
            this.paymentOptionCallback.a(null);
        }
    }

    public final void D(com.stripe.android.payments.paymentlauncher.f paymentResult, n70.f deferredIntentConfirmationType, boolean shouldLog) {
        s.k(paymentResult, "paymentResult");
        if (shouldLog) {
            y(paymentResult, deferredIntentConfirmationType);
        }
        w70.j paymentSelection = this.viewModel.getPaymentSelection();
        if ((paymentResult instanceof com.stripe.android.payments.paymentlauncher.f.c) && paymentSelection != null && w70.k.a(paymentSelection)) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new l(null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(this.viewModelScope, null, null, new m(paymentResult, null), 3, null);
    }

    public final void F(com.stripe.android.paymentsheet.ui.e sepaMandateResult) {
        s.k(sepaMandateResult, "sepaMandateResult");
        if (!s.f(sepaMandateResult, com.stripe.android.paymentsheet.ui.e.a.f53785a)) {
            if (s.f(sepaMandateResult, com.stripe.android.paymentsheet.ui.e.b.f53786a)) {
                this.paymentResultCallback.a(b0.a.f52716a);
            }
        } else {
            w70.j paymentSelection = this.viewModel.getPaymentSelection();
            if (paymentSelection != null) {
                paymentSelection.d(true);
            }
            f();
        }
    }

    public final void G(com.stripe.android.paymentsheet.flowcontroller.b bVar) {
        s.k(bVar, "<set-?>");
        this.flowControllerComponent = bVar;
    }

    @Override // com.stripe.android.paymentsheet.y.k
    public void a(y.n intentConfiguration, y.Configuration configuration, y.k.b callback) {
        s.k(intentConfiguration, "intentConfiguration");
        s.k(callback, "callback");
        y.m.DeferredIntent deferredIntent = new y.m.DeferredIntent(intentConfiguration);
        if (configuration == null) {
            configuration = y.Configuration.INSTANCE.a(this.context);
        }
        p(deferredIntent, configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.y.k
    public void b(String setupIntentClientSecret, y.Configuration configuration, y.k.b callback) {
        s.k(setupIntentClientSecret, "setupIntentClientSecret");
        s.k(callback, "callback");
        y.m.SetupIntent setupIntent = new y.m.SetupIntent(setupIntentClientSecret);
        if (configuration == null) {
            configuration = y.Configuration.INSTANCE.a(this.context);
        }
        p(setupIntent, configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.y.k
    public void c(String paymentIntentClientSecret, y.Configuration configuration, y.k.b callback) {
        s.k(paymentIntentClientSecret, "paymentIntentClientSecret");
        s.k(callback, "callback");
        y.m.PaymentIntent paymentIntent = new y.m.PaymentIntent(paymentIntentClientSecret);
        if (configuration == null) {
            configuration = y.Configuration.INSTANCE.a(this.context);
        }
        p(paymentIntent, configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.y.k
    public void d() {
        Object objU = u();
        Throwable thE = jn0.s.e(objU);
        if (thE != null) {
            this.paymentResultCallback.a(new b0.Failed(thE));
            return;
        }
        PaymentOptionContract.Args args = new PaymentOptionContract.Args(Full.b((Full) objU, null, null, null, this.viewModel.getPaymentSelection(), null, null, 55, null), this.statusBarColor.invoke(), this.enableLogging, this.productUsage);
        Application applicationF = this.viewModel.f();
        r90.b bVar = r90.b.f107376a;
        androidx.core.app.d dVarA = androidx.core.app.d.a(applicationF, bVar.a(), bVar.b());
        s.j(dVarA, "makeCustomAnimation(...)");
        try {
            this.paymentOptionActivityLauncher.c(args, dVarA);
        } catch (IllegalStateException e11) {
            this.paymentResultCallback.a(new b0.Failed(new IllegalStateException("The host activity is not in a valid state (" + this.lifecycleOwner.getLifecycle().getState() + ").", e11)));
        }
    }

    @Override // com.stripe.android.paymentsheet.y.k
    public PaymentOption e() {
        w70.j paymentSelection = this.viewModel.getPaymentSelection();
        if (paymentSelection != null) {
            return this.paymentOptionFactory.b(paymentSelection);
        }
        return null;
    }

    @Override // com.stripe.android.paymentsheet.y.k
    public void f() {
        Full fullK = this.viewModel.k();
        if (fullK == null) {
            throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling confirm().");
        }
        if (!this.configurationHandler.i()) {
            E(this, new com.stripe.android.payments.paymentlauncher.f.d(new IllegalStateException("FlowController.confirm() can only be called if the most recent call to configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() has completed successfully.")), null, false, 6, null);
            return;
        }
        w70.j paymentSelection = this.viewModel.getPaymentSelection();
        boolean z11 = true;
        if (paymentSelection instanceof w70.j.d ? true : paymentSelection instanceof w70.j.e.LinkInline) {
            q(paymentSelection, fullK);
            return;
        }
        if (!(paymentSelection instanceof w70.j.c ? true : paymentSelection instanceof w70.j.ExternalPaymentMethod ? true : paymentSelection instanceof w70.j.e) && paymentSelection != null) {
            z11 = false;
        }
        if (z11) {
            r(paymentSelection, fullK);
        } else if (paymentSelection instanceof w70.j.Saved) {
            s((w70.j.Saved) paymentSelection, fullK);
        }
    }

    public final void r(w70.j paymentSelection, Full state) {
        s.k(state, "state");
        BuildersKt__Builders_commonKt.launch$default(this.viewModelScope, null, null, new h(paymentSelection, state, null), 3, null);
    }

    public final void z(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b result) {
        Object objB;
        s.k(result, "result");
        if ((result instanceof com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.a) || !(result instanceof com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.Confirmed)) {
            return;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Full fullK = this.viewModel.k();
            if (fullK == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            objB = jn0.s.b(fullK);
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                this.paymentResultCallback.a(new b0.Failed(thE));
                return;
            }
            Full full = (Full) objB;
            w70.j paymentSelection = this.viewModel.getPaymentSelection();
            h0 h0Var = null;
            w70.j.Saved saved = paymentSelection instanceof w70.j.Saved ? (w70.j.Saved) paymentSelection : null;
            if (saved != null) {
                w70.j.Saved saved2 = new w70.j.Saved(saved.getPaymentMethod(), saved.getWalletType(), new com.stripe.android.model.y0.Card(((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.Confirmed) result).getCvc(), null, null, 6, null));
                this.viewModel.m(saved2);
                r(saved2, full);
                h0Var = h0.f84049a;
            }
            if (h0Var == null) {
                this.paymentResultCallback.a(new b0.Failed(new CvcRecollectionException(CvcRecollectionException.a.IncorrectSelection)));
            }
            h70.h.b.a(this.errorReporter, h70.h.f.CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION, null, null, 6, null);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
    }
}
