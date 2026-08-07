package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import c80.Args;
import c80.CvcRecollectionData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.y0;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import ezvcard.property.Gender;
import g80.Full;
import g80.WalletsState;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.o0;
import u60.PaymentMethodMetadata;
import v70.j0;
import w80.Amount;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0004à\u0001á\u0001B\u0083\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020$2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b1\u00100J\u001b\u00104\u001a\u00020$2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020$2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020$2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010<\u001a\u000206H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020$H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020$2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010E\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020$2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010K\u001a\u00020$2\u0006\u0010*\u001a\u00020I2\u0006\u0010J\u001a\u000202H\u0002¢\u0006\u0004\bK\u0010LJ)\u0010S\u001a\u00020$2\u0006\u0010N\u001a\u00020M2\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010W\u001a\u00020$2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020$2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010`\u001a\u00020$2\u0006\u0010]\u001a\u00020M2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020$2\u0006\u0010b\u001a\u00020)H\u0002¢\u0006\u0004\bc\u0010,J%\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020MH\u0082@¢\u0006\u0004\bl\u0010(J#\u0010o\u001a\u0004\u0018\u00010m2\b\u0010n\u001a\u0004\u0018\u00010m2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020$2\u0006\u0010q\u001a\u00020QH\u0002¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020$¢\u0006\u0004\bt\u0010@J\r\u0010u\u001a\u00020$¢\u0006\u0004\bu\u0010@J\u0019\u0010w\u001a\u00020$2\b\u0010v\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bw\u0010HJ\u0017\u0010y\u001a\u00020$2\u0006\u0010;\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020$H\u0016¢\u0006\u0004\b{\u0010@J \u0010\u0080\u0001\u001a\u00020$2\u0006\u0010}\u001a\u00020|2\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020$H\u0016¢\u0006\u0005\b\u0084\u0001\u0010@J\u001b\u0010\u0085\u0001\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0005\b\u0085\u0001\u00105J\u0013\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020Q0\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020Q0\u009f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R'\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010®\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R.\u0010n\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010m0\u009b\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b´\u0001\u0010\u009d\u0001\u0012\u0005\b·\u0001\u0010@\u001a\u0006\bµ\u0001\u0010¶\u0001R'\u00107\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0005\b¼\u0001\u00109R%\u0010¿\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010m0\u009f\u00018\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010¡\u0001\u001a\u0006\b¾\u0001\u0010£\u0001R+\u0010Æ\u0001\u001a\u0005\u0018\u00010À\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\bl\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u0017\u0010É\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bt\u0010È\u0001R(\u0010Ï\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0000X\u0081\u0004¢\u0006\u0016\n\u0005\b=\u0010Ë\u0001\u0012\u0005\bÎ\u0001\u0010@\u001a\u0006\bÌ\u0001\u0010Í\u0001R(\u0010Ò\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ð\u00010\u009f\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bu\u0010¡\u0001\u001a\u0006\bÑ\u0001\u0010£\u0001R&\u0010*\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001020\u009f\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bG\u0010¡\u0001\u001a\u0006\bÓ\u0001\u0010£\u0001R(\u0010Ö\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ô\u00010\u009f\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bj\u0010¡\u0001\u001a\u0006\bÕ\u0001\u0010£\u0001R)\u0010Ù\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010×\u00010\u009f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010¡\u0001\u001a\u0006\bØ\u0001\u0010£\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010Û\u0001R\u0017\u0010ß\u0001\u001a\u00020Q8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001¨\u0006â\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/c0;", "Lk80/a;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "args", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lg80/h;", "paymentSheetLoader", "Lcom/stripe/android/paymentsheet/repositories/b;", "customerRepository", "Ln70/r;", "prefsRepository", "Lo30/d;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lcom/stripe/android/paymentsheet/k;", "linkHandler", "Lcom/stripe/android/paymentsheet/h$d;", "intentConfirmationHandlerFactory", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "Lh80/t$a;", "editInteractorFactory", "Lh70/h;", "errorReporter", "Lr70/a;", "cvcRecollectionHandler", "Lc80/e$a;", "cvcRecollectionInteractorFactory", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lg80/h;Lcom/stripe/android/paymentsheet/repositories/b;Ln70/r;Lo30/d;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/s0;Lcom/stripe/android/paymentsheet/k;Lcom/stripe/android/paymentsheet/h$d;Lh30/b$a;Lh80/t$a;Lh70/h;Lr70/a;Lc80/e$a;)V", "Lcom/stripe/android/paymentsheet/k$a;", "processingState", "Ljn0/h0;", "z0", "(Lcom/stripe/android/paymentsheet/k$a;)V", "H0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", AnalyticsAttribute.Error, "C0", "(Ljava/lang/Throwable;)V", "Lg80/l;", "state", "D0", "(Lg80/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E0", "Lx30/c;", "userErrorMessage", "Q0", "(Lx30/c;)V", "Lcom/stripe/android/paymentsheet/c0$c;", "checkoutIdentifier", "T0", "(Lcom/stripe/android/paymentsheet/c0$c;)V", "Lw70/j;", "paymentSelection", "identifier", "l0", "(Lw70/j;Lcom/stripe/android/paymentsheet/c0$c;)V", "G0", "()V", "Lc80/c;", "completionState", "y0", "(Lc80/c;)V", "L0", "(Lw70/j;)Lw70/j;", "n0", "(Lw70/j;)V", "Lq70/b;", "message", "B0", "(Lq70/b;Lx30/c;)V", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Ln70/f;", "deferredIntentConfirmationType", "", "finishImmediately", "A0", "(Lcom/stripe/android/model/StripeIntent;Ln70/f;Z)V", "Lcom/stripe/android/paymentsheet/r;", "result", "N0", "(Lcom/stripe/android/paymentsheet/r;)V", "Lcom/stripe/android/paymentsheet/r$b;", "failure", "M0", "(Lcom/stripe/android/paymentsheet/r$b;)V", "stripeIntent", "Lcom/stripe/android/payments/paymentlauncher/f;", "paymentResult", "O0", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/paymentlauncher/f;)V", "throwable", "J0", "Lu60/e;", "paymentMethodMetadata", "Ln70/b;", "customerStateHolder", "", "Lx70/c;", "o0", "(Lu60/e;Ln70/b;)Ljava/util/List;", "j0", "Lw70/l;", "viewState", "I0", "(Lw70/l;Lcom/stripe/android/paymentsheet/c0$c;)Lw70/l;", "visible", "S0", "(Z)V", "k0", "m0", "selection", "I", "Lw70/j$e$d;", "H", "(Lw70/j$e$d;)V", "f", "Lh/b;", "activityResultCaller", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "P0", "(Lh/b;Landroidx/lifecycle/LifecycleOwner;)V", "K0", "(Lcom/stripe/android/payments/paymentlauncher/f;)V", "L", "K", "Lx70/c$j$b;", "u0", "()Lx70/c$j$b;", Gender.UNKNOWN, "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "p0", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "V", "Lg80/h;", "W", "Ln70/r;", "X", "Lo30/d;", "Y", "Lh70/h;", "Z", "Lr70/a;", "t0", "()Lr70/a;", "a0", "Lc80/e$a;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "b0", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_contentVisible", "Lkotlinx/coroutines/flow/StateFlow;", "c0", "Lkotlinx/coroutines/flow/StateFlow;", "s0", "()Lkotlinx/coroutines/flow/StateFlow;", "contentVisible", "Lk80/c;", "d0", "Lk80/c;", "primaryButtonUiStateMapper", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/b0;", "e0", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_paymentSheetResult", "Lkotlinx/coroutines/flow/SharedFlow;", "f0", "Lkotlinx/coroutines/flow/SharedFlow;", "w0", "()Lkotlinx/coroutines/flow/SharedFlow;", "paymentSheetResult", "g0", "x0", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getViewState$paymentsheet_release$annotations", "h0", "Lcom/stripe/android/paymentsheet/c0$c;", "r0", "()Lcom/stripe/android/paymentsheet/c0$c;", "setCheckoutIdentifier$paymentsheet_release", "i0", "q0", "buyButtonState", "Lcom/stripe/android/paymentsheet/m;", "Lcom/stripe/android/paymentsheet/m;", "w", "()Lcom/stripe/android/paymentsheet/m;", Gender.MALE, "(Lcom/stripe/android/paymentsheet/m;)V", "newPaymentSelection", "Lw70/c;", "Lw70/c;", "googlePayButtonType", "Lcom/stripe/android/googlepaylauncher/h$e;", "Lcom/stripe/android/googlepaylauncher/h$e;", "v0", "()Lcom/stripe/android/googlepaylauncher/h$e;", "getGooglePayLauncherConfig$paymentsheet_release$annotations", "googlePayLauncherConfig", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "y", "primaryButtonUiState", "q", "Lg80/n;", "E", "walletsState", "Lg80/m;", "D", "walletsProcessingState", "Lcom/stripe/android/paymentsheet/h;", "Lcom/stripe/android/paymentsheet/h;", "intentConfirmationHandler", "F0", "()Z", "isProcessingPaymentIntent", "c", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c0 extends k80.a {

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final PaymentSheetContractV2.Args args;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final g80.h paymentSheetLoader;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final n70.r prefsRepository;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final r70.a cvcRecollectionHandler;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final c80.e.a cvcRecollectionInteractorFactory;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _contentVisible;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> contentVisible;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final k80.c primaryButtonUiStateMapper;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<b0> _paymentSheetResult;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final SharedFlow<b0> paymentSheetResult;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<w70.l> viewState;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private c checkoutIdentifier;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w70.l> buyButtonState;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.paymentsheet.m newPaymentSelection;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final w70.c googlePayButtonType;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.googlepaylauncher.h.Config googlePayLauncherConfig;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<PrimaryButton.UIState> primaryButtonUiState;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<x30.c> error;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<WalletsState> walletsState;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<g80.m> walletsProcessingState;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.h intentConfirmationHandler;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$1", f = "PaymentSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52742n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.k f52743o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c0 f52744p;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.c0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/k$a;", "processingState", "Ljn0/h0;", "a", "(Lcom/stripe/android/paymentsheet/k$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C0999a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f52745a;

            C0999a(c0 c0Var) {
                this.f52745a = c0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.paymentsheet.k.a aVar, Continuation<? super h0> continuation) {
                this.f52745a.z0(aVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.paymentsheet.k kVar, c0 c0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f52743o = kVar;
            this.f52744p = c0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f52743o, this.f52744p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52742n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow<com.stripe.android.paymentsheet.k.a> flowF = this.f52743o.f();
                C0999a c0999a = new C0999a(this.f52744p);
                this.f52742n = 1;
                if (flowF.collect(c0999a, this) == coroutine_suspended) {
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
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$2", f = "PaymentSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52746n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c0.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52746n;
            if (i11 == 0) {
                jn0.t.b(obj);
                c0 c0Var = c0.this;
                this.f52746n = 1;
                if (c0Var.H0(this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/c0$c;", "", "<init>", "(Ljava/lang/String;I)V", "SheetTopWallet", "SheetBottomBuy", "None", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        SheetTopWallet,
        SheetBottomBuy,
        None;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/c0$d;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "starterArgsSupplier", "<init>", "(Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<PaymentSheetContractV2.Args> starterArgsSupplier;

        public d(wn0.a<PaymentSheetContractV2.Args> starterArgsSupplier) {
            p013kotlin.jvm.internal.s.k(starterArgsSupplier, "starterArgsSupplier");
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            p013kotlin.jvm.internal.s.k(extras, "extras");
            Application applicationA = z30.b.a(extras);
            c0 c0VarA = v70.j.a().a(applicationA).build().a().a(new j0(this.starterArgsSupplier.invoke())).b(v0.a(extras)).build().a();
            p013kotlin.jvm.internal.s.i(c0VarA, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
            return c0VarA;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52750b;

        static {
            int[] iArr = new int[y.GooglePayConfiguration.a.values().length];
            try {
                iArr[y.GooglePayConfiguration.a.Buy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Book.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Checkout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Donate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Order.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Subscribe.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Plain.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[y.GooglePayConfiguration.a.Pay.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f52749a = iArr;
            int[] iArr2 = new int[y.GooglePayConfiguration.c.values().length];
            try {
                iArr2[y.GooglePayConfiguration.c.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f52750b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {}, l = {713}, m = "awaitStripeIntent", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52751n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52753p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52751n = obj;
            this.f52753p |= Integer.MIN_VALUE;
            return c0.this.j0(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw70/l;", "viewState", "a", "(Lw70/l;)Lw70/l;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<w70.l, w70.l> {
        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w70.l invoke(w70.l lVar) {
            return c0.this.I0(lVar, c.SheetBottomBuy);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$confirmPaymentSelection$1", f = "PaymentSheetViewModel.kt", i = {0, 0}, l = {519}, m = "invokeSuspend", n = {"$this$launch", "option"}, s = {"L$0", "L$2"})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52755n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52756o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52757p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f52758q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ w70.j f52760s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(w70.j jVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f52760s = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = c0.this.new h(this.f52760s, continuation);
            hVar.f52758q = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0072  */
        /* JADX WARN: Code duplicated, block: B:21:0x0078  */
        /* JADX WARN: Code duplicated, block: B:23:0x009c  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
        /* JADX WARN: Instruction removed from duplicated block: B:21:0x0078, please report this as an issue */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h0 h0Var;
            com.stripe.android.paymentsheet.p pVar;
            c0 c0Var;
            w70.j jVar;
            String str;
            h70.h.f fVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52757p;
            if (i11 == 0) {
                jn0.t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f52758q;
                w70.j jVarL0 = c0.this.L0(this.f52760s);
                h0Var = null;
                com.stripe.android.paymentsheet.p pVarA = jVarL0 != null ? com.stripe.android.paymentsheet.q.a(jVarL0, c0.this.getArgs().getInitializationMode(), c0.this.getConfig()) : null;
                if (pVarA != null) {
                    c0 c0Var2 = c0.this;
                    this.f52758q = coroutineScope;
                    this.f52755n = c0Var2;
                    this.f52756o = pVarA;
                    this.f52757p = 1;
                    obj = c0Var2.j0(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar = pVarA;
                    c0Var = c0Var2;
                }
                if (h0Var == null) {
                    jVar = this.f52760s;
                    c0 c0Var3 = c0.this;
                    if (jVar != null) {
                        str = "Cannot confirm using a " + o0.b(jVar.getClass()).c() + " payment selection!";
                        if (str == null) {
                            str = "Cannot confirm without a payment selection!";
                        }
                    } else {
                        str = "Cannot confirm without a payment selection!";
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(str);
                    if (jVar != null || (fVar = h70.h.f.PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT) == null) {
                        fVar = h70.h.f.PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT;
                    }
                    h70.h.b.a(c0Var3.errorReporter, fVar, StripeException.INSTANCE.b(illegalStateException), null, 4, null);
                    c0Var3.N0(new com.stripe.android.paymentsheet.r.Failed(illegalStateException, l30.a.b(illegalStateException), com.stripe.android.paymentsheet.o.d.f53214a));
                }
                return h0.f84049a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = (com.stripe.android.paymentsheet.p) this.f52756o;
            c0Var = (c0) this.f52755n;
            jn0.t.b(obj);
            c0Var.intentConfirmationHandler.U(new com.stripe.android.paymentsheet.h.Args((StripeIntent) obj, pVar));
            h0Var = h0.f84049a;
            if (h0Var == null) {
                jVar = this.f52760s;
                c0 c0Var4 = c0.this;
                if (jVar != null) {
                    str = "Cannot confirm using a " + o0.b(jVar.getClass()).c() + " payment selection!";
                    if (str == null) {
                        str = "Cannot confirm without a payment selection!";
                    }
                } else {
                    str = "Cannot confirm without a payment selection!";
                }
                IllegalStateException illegalStateException2 = new IllegalStateException(str);
                if (jVar != null) {
                    fVar = h70.h.f.PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT;
                } else {
                    fVar = h70.h.f.PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT;
                }
                h70.h.b.a(c0Var4.errorReporter, fVar, StripeException.INSTANCE.b(illegalStateException2), null, 4, null);
                c0Var4.N0(new com.stripe.android.paymentsheet.r.Failed(illegalStateException2, l30.a.b(illegalStateException2), com.stripe.android.paymentsheet.o.d.f53214a));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/l;", "it", "Lx30/c;", "a", "(Lw70/l;)Lx30/c;"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<w70.l, x30.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f52761c = new i();

        i() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x30.c invoke(w70.l lVar) {
            w70.l.UserErrorMessage dVarA;
            if (lVar == null || (dVarA = lVar.getErrorMessage()) == null) {
                return null;
            }
            return dVarA.getMessage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<h0> {
        j() {
            super(0);
        }

        public final void b() {
            c0.this._paymentSheetResult.tryEmit(b0.b.f52717a);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE}, m = "handlePaymentSheetStateLoaded", n = {"this", "state"}, s = {"L$0", "L$1"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52763n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52764o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f52765p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f52767r;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52765p = obj;
            this.f52767r |= Integer.MIN_VALUE;
            return c0.this.D0(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {0, 0}, l = {332}, m = "initializeWithState", n = {"this", "state"}, s = {"L$0", "L$1"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52768n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52769o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f52770p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f52772r;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52770p = obj;
            this.f52772r |= Integer.MIN_VALUE;
            return c0.this.E0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$2", f = "PaymentSheetViewModel.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52773n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/h$e;", "state", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/paymentsheet/h$e;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$2$1", f = "PaymentSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<com.stripe.android.paymentsheet.h.e, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52775n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f52776o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0 f52777p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52777p = c0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.stripe.android.paymentsheet.h.e eVar, Continuation<? super h0> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f52777p, continuation);
                aVar.f52776o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f52775n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                com.stripe.android.paymentsheet.h.e eVar = (com.stripe.android.paymentsheet.h.e) this.f52776o;
                if (!(eVar instanceof com.stripe.android.paymentsheet.h.e.c)) {
                    if (eVar instanceof com.stripe.android.paymentsheet.h.e.Preconfirming) {
                        com.stripe.android.paymentsheet.h.e.Preconfirming dVar = (com.stripe.android.paymentsheet.h.e.Preconfirming) eVar;
                        if (dVar.getInPreconfirmFlow() && (dVar.getConfirmationOption() instanceof com.stripe.android.paymentsheet.p.GooglePay)) {
                            this.f52777p.S0(false);
                        } else {
                            this.f52777p.S0(true);
                        }
                        c0 c0Var = this.f52777p;
                        c0Var.T0(c0Var.getCheckoutIdentifier());
                    } else if (eVar instanceof com.stripe.android.paymentsheet.h.e.b) {
                        this.f52777p.S0(true);
                        if (!(this.f52777p.x0().getValue() instanceof w70.l.c)) {
                            c0 c0Var2 = this.f52777p;
                            c0Var2.T0(c0Var2.getCheckoutIdentifier());
                        }
                    } else if (eVar instanceof com.stripe.android.paymentsheet.h.e.Complete) {
                        this.f52777p.S0(true);
                        this.f52777p.N0(((com.stripe.android.paymentsheet.h.e.Complete) eVar).getResult());
                    }
                }
                return h0.f84049a;
            }
        }

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c0.this.new m(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52773n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<com.stripe.android.paymentsheet.h.e> stateFlowD = c0.this.intentConfirmationHandler.D();
                a aVar = new a(c0.this, null);
                this.f52773n = 1;
                if (FlowKt.collectLatest(stateFlowD, aVar, this) == coroutine_suspended) {
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
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc80/d;", "cvcRecollectionData", "Ljn0/h0;", "a", "(Lc80/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.l<CvcRecollectionData, h0> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$launchCvcRecollection$1$1", f = "PaymentSheetViewModel.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52779n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ c80.e f52780o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0 f52781p;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.c0$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class C1000a extends p013kotlin.jvm.internal.a implements wn0.p<c80.c, Continuation<? super h0>, Object>, SuspendFunction {
                C1000a(Object obj) {
                    super(2, obj, c0.class, "handleCvcCompletionState", "handleCvcCompletionState(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)V", 4);
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(c80.c cVar, Continuation<? super h0> continuation) {
                    return a.b((c0) this.receiver, cVar, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c80.e eVar, c0 c0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52780o = eVar;
                this.f52781p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object b(c0 c0Var, c80.c cVar, Continuation continuation) {
                c0Var.y0(cVar);
                return h0.f84049a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f52780o, this.f52781p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f52779n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    StateFlow<c80.c> stateFlowC = this.f52780o.c();
                    C1000a c1000a = new C1000a(this.f52781p);
                    this.f52779n = 1;
                    if (FlowKt.collectLatest(stateFlowC, c1000a, this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        n() {
            super(1);
        }

        public final void a(CvcRecollectionData cvcRecollectionData) {
            StripeIntent stripeIntentU;
            p013kotlin.jvm.internal.s.k(cvcRecollectionData, "cvcRecollectionData");
            c80.e.a aVar = c0.this.cvcRecollectionInteractorFactory;
            String strB = cvcRecollectionData.getLastFour();
            if (strB == null) {
                strB = "";
            }
            com.stripe.android.model.h hVarA = cvcRecollectionData.getBrand();
            PaymentMethodMetadata value = c0.this.x().getValue();
            boolean z11 = false;
            if (value != null && (stripeIntentU = value.getStripeIntent()) != null && !stripeIntentU.getIsLiveMode()) {
                z11 = true;
            }
            c80.e eVarA = aVar.a(new Args(strB, hVarA, "", z11), c0.this.z(), d1.a(c0.this));
            BuildersKt__Builders_commonKt.launch$default(d1.a(c0.this), null, null, new a(eVarA, c0.this, null), 3, null);
            c0.this.getNavigationHandler().m(new x70.c.d(eVarA));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CvcRecollectionData dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m = "loadPaymentSheetState", n = {"this"}, s = {"L$0"})
    static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52782n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f52783o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f52785q;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52783o = obj;
            this.f52785q |= Integer.MIN_VALUE;
            return c0.this.H0(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lg80/l;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$loadPaymentSheetState$result$1", f = "PaymentSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.s<? extends Full>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52786n;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c0.this.new p(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends Full>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super jn0.s<Full>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52786n;
            if (i11 == 0) {
                jn0.t.b(obj);
                g80.h hVar = c0.this.paymentSheetLoader;
                y.m mVarC = c0.this.getArgs().getInitializationMode();
                y.Configuration hVarA = c0.this.getArgs().getConfig();
                boolean zC = c0.this.intentConfirmationHandler.getHasReloadedFromProcessDeath();
                boolean zD = c0.this.getArgs().getInitializedViaCompose();
                this.f52786n = 1;
                objA = hVar.a(mVarC, hVarA, zC, zD, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objA);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super jn0.s<Full>> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$onPaymentResult$1", f = "PaymentSheetViewModel.kt", i = {}, l = {553}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52788n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.payments.paymentlauncher.f f52790p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(com.stripe.android.payments.paymentlauncher.f fVar, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f52790p = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c0.this.new q(this.f52790p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52788n;
            if (i11 == 0) {
                jn0.t.b(obj);
                c0 c0Var = c0.this;
                this.f52788n = 1;
                obj = c0Var.j0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            c0.this.O0((StripeIntent) obj, this.f52790p);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu60/e;", "it", "Lw80/b;", "a", "(Lu60/e;)Lw80/b;"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<PaymentMethodMetadata, Amount> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f52791c = new r();

        r() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Amount invoke(PaymentMethodMetadata eVar) {
            if (eVar != null) {
                return eVar.b();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EventReporter f52792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f52793d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(EventReporter eventReporter, c0 c0Var) {
            super(0);
            this.f52792c = eventReporter;
            this.f52793d = c0Var;
        }

        public final void b() {
            this.f52792c.k(this.f52793d.C().getValue());
            this.f52793d.k0();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/paymentsheet/c0$t", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t implements DefaultLifecycleObserver {
        t() {
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            p013kotlin.jvm.internal.s.k(owner, "owner");
            c0.this.getLinkHandler().n();
            super.onDestroy(owner);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/l;", "vs", "Lg80/m;", "a", "(Lw70/l;)Lg80/m;"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<w70.l, g80.m> {
        u() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g80.m invoke(w70.l lVar) {
            w70.l lVarI0 = c0.this.I0(lVar, c.SheetTopWallet);
            if (lVarI0 == null) {
                return null;
            }
            if (lVarI0 instanceof w70.l.Reset) {
                w70.l.UserErrorMessage dVarA = ((w70.l.Reset) lVarI0).getErrorMessage();
                return new g80.m.Idle(dVarA != null ? dVarA.getMessage() : null);
            }
            if (lVarI0 instanceof w70.l.c) {
                return g80.m.c.f67634a;
            }
            if (lVarI0 instanceof w70.l.FinishProcessing) {
                return new g80.m.a(((w70.l.FinishProcessing) lVarI0).b());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isLinkAvailable", "", "linkEmail", "buttonsEnabled", "Lu60/e;", "paymentMethodMetadata", "Lg80/n;", "a", "(Ljava/lang/Boolean;Ljava/lang/String;ZLu60/e;)Lg80/n;"}, k = 3, mv = {1, 9, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.r<Boolean, String, Boolean, PaymentMethodMetadata, WalletsState> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.k f52797d;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
            a(Object obj) {
                super(0, obj, c0.class, "checkoutWithGooglePay", "checkoutWithGooglePay()V", 0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                o();
                return h0.f84049a;
            }

            public final void o() {
                ((c0) this.receiver).m0();
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
            b(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.k.class, "launchLink", "launchLink()V", 0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                o();
                return h0.f84049a;
            }

            public final void o() {
                ((com.stripe.android.paymentsheet.k) this.receiver).h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(com.stripe.android.paymentsheet.k kVar) {
            super(4);
            this.f52797d = kVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x000d  */
        public final WalletsState a(Boolean bool, String str, boolean z11, PaymentMethodMetadata eVar) {
            boolean z12;
            WalletsState.Companion aVar = WalletsState.INSTANCE;
            if (eVar != null) {
                z12 = eVar.getIsGooglePayReady();
            }
            List<String> listK = eVar != null ? eVar.K() : null;
            if (listK == null) {
                listK = p013kotlin.collections.v.m();
            }
            return aVar.a(bool, str, z12, c0.this.googlePayButtonType, z11, listK, c0.this.getGooglePayLauncherConfig(), new a(c0.this), new b(this.f52797d), (eVar != null ? eVar.getStripeIntent() : null) instanceof SetupIntent);
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ WalletsState invoke(Boolean bool, String str, Boolean bool2, PaymentMethodMetadata eVar) {
            return a(bool, str, bool2.booleanValue(), eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(PaymentSheetContractV2.Args args, EventReporter eventReporter, g80.h paymentSheetLoader, com.stripe.android.paymentsheet.repositories.b customerRepository, n70.r prefsRepository, o30.d logger, CoroutineContext workContext, s0 savedStateHandle, com.stripe.android.paymentsheet.k linkHandler, com.stripe.android.paymentsheet.h.d intentConfirmationHandlerFactory, h30.b.a cardAccountRangeRepositoryFactory, h80.t.a editInteractorFactory, h70.h errorReporter, r70.a cvcRecollectionHandler, c80.e.a cvcRecollectionInteractorFactory) {
        w70.c cVar;
        com.stripe.android.googlepaylauncher.h.Config eVar;
        super(args.getConfig(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, true);
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        p013kotlin.jvm.internal.s.k(paymentSheetLoader, "paymentSheetLoader");
        p013kotlin.jvm.internal.s.k(customerRepository, "customerRepository");
        p013kotlin.jvm.internal.s.k(prefsRepository, "prefsRepository");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(linkHandler, "linkHandler");
        p013kotlin.jvm.internal.s.k(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(editInteractorFactory, "editInteractorFactory");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(cvcRecollectionHandler, "cvcRecollectionHandler");
        p013kotlin.jvm.internal.s.k(cvcRecollectionInteractorFactory, "cvcRecollectionInteractorFactory");
        this.args = args;
        this.paymentSheetLoader = paymentSheetLoader;
        this.prefsRepository = prefsRepository;
        this.logger = logger;
        this.errorReporter = errorReporter;
        this.cvcRecollectionHandler = cvcRecollectionHandler;
        this.cvcRecollectionInteractorFactory = cvcRecollectionInteractorFactory;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this._contentVisible = MutableStateFlow;
        this.contentVisible = MutableStateFlow;
        k80.c cVar2 = new k80.c(getConfig(), F0(), getNavigationHandler().f(), h(), r90.g.m(x(), r.f52791c), C(), k(), o(), new s(eventReporter, this));
        this.primaryButtonUiStateMapper = cVar2;
        MutableSharedFlow<b0> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._paymentSheetResult = mutableSharedFlowMutableSharedFlow$default;
        this.paymentSheetResult = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<w70.l> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.viewState = MutableStateFlow2;
        this.checkoutIdentifier = c.SheetBottomBuy;
        StateFlow<w70.l> stateFlowM = r90.g.m(MutableStateFlow2, new g());
        this.buyButtonState = stateFlowM;
        y.GooglePayConfiguration lVarJ = args.getConfig().getGooglePay();
        y.GooglePayConfiguration.a aVarB = lVarJ != null ? lVarJ.getButtonType() : null;
        switch (aVarB == null ? -1 : e.f52749a[aVarB.ordinal()]) {
            case -1:
            case 8:
                cVar = w70.c.Pay;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar = w70.c.Buy;
                break;
            case 2:
                cVar = w70.c.Book;
                break;
            case 3:
                cVar = w70.c.Checkout;
                break;
            case 4:
                cVar = w70.c.Donate;
                break;
            case 5:
                cVar = w70.c.Order;
                break;
            case 6:
                cVar = w70.c.Subscribe;
                break;
            case 7:
                cVar = w70.c.Plain;
                break;
        }
        this.googlePayButtonType = cVar;
        y.GooglePayConfiguration lVarB = args.b();
        if (lVarB == null) {
            eVar = null;
        } else if (lVarB.getCurrencyCode() != null || F0()) {
            eVar = new com.stripe.android.googlepaylauncher.h.Config(e.f52750b[lVarB.getEnvironment().ordinal()] == 1 ? a60.d.Production : a60.d.Test, lVarB.getCountryCode(), getConfig().getMerchantDisplayName(), args.getConfig().getBillingDetailsCollectionConfiguration().d(), args.getConfig().getBillingDetailsCollectionConfiguration().j(), false, false, 96, null);
        } else {
            logger.a("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            eVar = null;
        }
        this.googlePayLauncherConfig = eVar;
        this.primaryButtonUiState = FlowKt.stateIn(cVar2.h(), d1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), null);
        this.error = r90.g.m(stateFlowM, i.f52761c);
        this.walletsState = r90.g.f(linkHandler.g(), linkHandler.getLinkConfigurationCoordinator().d(), h(), x(), new v(linkHandler));
        this.walletsProcessingState = r90.g.m(MutableStateFlow2, new u());
        this.intentConfirmationHandler = intentConfirmationHandlerFactory.d(CoroutineScopeKt.plus(d1.a(this), workContext));
        g30.g.f67187a.c(this, savedStateHandle);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(linkHandler, this, null), 3, null);
        eventReporter.t(getConfig(), args.getInitializationMode() instanceof y.m.DeferredIntent);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), workContext, null, new b(null), 2, null);
    }

    private final void A0(StripeIntent intent, n70.f deferredIntentConfirmationType, boolean finishImmediately) {
        w70.j value = C().getValue();
        getEventReporter().r(value, deferredIntentConfirmationType);
        if (value != null && w70.k.a(value)) {
            getLinkHandler().i();
        }
        if (value instanceof w70.j.e) {
            PaymentMethod v0VarZ2 = intent.getPaymentMethod();
            boolean zA = i80.d.a((w70.j.e) value, this.args.getInitializationMode());
            value = null;
            PaymentMethod v0Var = zA ? v0VarZ2 : null;
            if (v0Var != null) {
                value = new w70.j.Saved(v0Var, null, null, 6, null);
            }
        }
        if (value != null) {
            this.prefsRepository.c(value);
        }
        if (finishImmediately) {
            this._paymentSheetResult.tryEmit(b0.b.f52717a);
        } else {
            this.viewState.setValue(new w70.l.FinishProcessing(new j()));
        }
    }

    private final void B0(q70.b error, x30.c message) {
        getEventReporter().l(C().getValue(), error);
        Q0(message);
    }

    private final void C0(Throwable error) {
        N(null);
        J0(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r2.E0(r7, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D0(g80.Full r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.c0.k
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.c0$k r0 = (com.stripe.android.paymentsheet.c0.k) r0
            int r1 = r0.f52767r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52767r = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.c0$k r0 = new com.stripe.android.paymentsheet.c0$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52765p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f52767r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r8)
            goto L85
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f52764o
            g80.l r7 = (g80.Full) r7
            java.lang.Object r2 = r0.f52763n
            com.stripe.android.paymentsheet.c0 r2 = (com.stripe.android.paymentsheet.c0) r2
            jn0.t.b(r8)
            goto L53
        L40:
            jn0.t.b(r8)
            com.stripe.android.paymentsheet.h r8 = r6.intentConfirmationHandler
            r0.f52763n = r6
            r0.f52764o = r7
            r0.f52767r = r4
            java.lang.Object r8 = r8.u(r0)
            if (r8 != r1) goto L52
            goto L84
        L52:
            r2 = r6
        L53:
            com.stripe.android.paymentsheet.r r8 = (com.stripe.android.paymentsheet.r) r8
            boolean r5 = r8 instanceof com.stripe.android.paymentsheet.r.Succeeded
            if (r5 == 0) goto L67
            com.stripe.android.paymentsheet.r$c r8 = (com.stripe.android.paymentsheet.r.Succeeded) r8
            com.stripe.android.model.StripeIntent r7 = r8.getIntent()
            n70.f r8 = r8.getDeferredIntentConfirmationType()
            r2.A0(r7, r8, r4)
            goto L74
        L67:
            g80.j r8 = r7.getValidationError()
            if (r8 == 0) goto L77
            g80.j r7 = r7.getValidationError()
            r2.C0(r7)
        L74:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        L77:
            r8 = 0
            r0.f52763n = r8
            r0.f52764o = r8
            r0.f52767r = r3
            java.lang.Object r7 = r2.E0(r7, r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.c0.D0(g80.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E0(Full lVar, Continuation<? super h0> continuation) {
        l lVar2;
        c0 c0Var;
        Throwable thA;
        if (continuation instanceof l) {
            lVar2 = (l) continuation;
            int i11 = lVar2.f52772r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar2.f52772r = i11 - Integer.MIN_VALUE;
            } else {
                lVar2 = new l(continuation);
            }
        } else {
            lVar2 = new l(continuation);
        }
        Object objU = lVar2.f52770p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = lVar2.f52772r;
        if (i12 == 0) {
            jn0.t.b(objU);
            getCustomerStateHolder().d(lVar.getCustomer());
            Q(lVar.getPaymentSelection());
            N(lVar.getPaymentMethodMetadata());
            getLinkHandler().m(lVar.getLinkState());
            com.stripe.android.paymentsheet.h hVar = this.intentConfirmationHandler;
            lVar2.f52768n = this;
            lVar2.f52769o = lVar;
            lVar2.f52772r = 1;
            objU = hVar.u(lVar2);
            if (objU == coroutine_suspended) {
                return coroutine_suspended;
            }
            c0Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (Full) lVar2.f52769o;
            c0Var = (c0) lVar2.f52768n;
            jn0.t.b(objU);
        }
        com.stripe.android.paymentsheet.r.Failed bVar = objU instanceof com.stripe.android.paymentsheet.r.Failed ? (com.stripe.android.paymentsheet.r.Failed) objU : null;
        c0Var.Q0((bVar == null || (thA = bVar.getCause()) == null) ? null : l30.a.b(thA));
        c0Var.getNavigationHandler().l(c0Var.o0(lVar.getPaymentMethodMetadata(), c0Var.getCustomerStateHolder()));
        BuildersKt__Builders_commonKt.launch$default(d1.a(c0Var), null, null, c0Var.new m(null), 3, null);
        return h0.f84049a;
    }

    private final void G0() {
        this.cvcRecollectionHandler.a(C().getValue(), new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r2.D0((g80.l) r7, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.c0.o
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.c0$o r0 = (com.stripe.android.paymentsheet.c0.o) r0
            int r1 = r0.f52785q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52785q = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.c0$o r0 = new com.stripe.android.paymentsheet.c0$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f52783o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f52785q
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            jn0.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f52782n
            com.stripe.android.paymentsheet.c0 r2 = (com.stripe.android.paymentsheet.c0) r2
            jn0.t.b(r7)
            goto L55
        L3d:
            jn0.t.b(r7)
            kotlin.coroutines.CoroutineContext r7 = r6.getWorkContext()
            com.stripe.android.paymentsheet.c0$p r2 = new com.stripe.android.paymentsheet.c0$p
            r2.<init>(r3)
            r0.f52782n = r6
            r0.f52785q = r5
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L54
            goto L6d
        L54:
            r2 = r6
        L55:
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Throwable r5 = jn0.s.e(r7)
            if (r5 != 0) goto L6e
            g80.l r7 = (g80.Full) r7
            r0.f52782n = r3
            r0.f52785q = r4
            java.lang.Object r7 = r2.D0(r7, r0)
            if (r7 != r1) goto L71
        L6d:
            return r1
        L6e:
            r2.C0(r5)
        L71:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.c0.H0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w70.l I0(w70.l viewState, c checkoutIdentifier) {
        if (this.checkoutIdentifier != checkoutIdentifier) {
            return null;
        }
        return viewState;
    }

    private final void J0(Throwable throwable) {
        this.logger.error("Payment Sheet error", throwable);
        this._paymentSheetResult.tryEmit(new b0.Failed(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w70.j L0(w70.j paymentSelection) {
        y0.Card card;
        if (!(paymentSelection instanceof w70.j.Saved) || !d0.c(this)) {
            return paymentSelection;
        }
        w70.j.Saved saved = (w70.j.Saved) paymentSelection;
        y0 paymentMethodOptionsParams = saved.getPaymentMethodOptionsParams();
        y0.Card card2 = paymentMethodOptionsParams instanceof y0.Card ? (y0.Card) paymentMethodOptionsParams : null;
        if (card2 == null) {
            card = new y0.Card(null, null, null, 7, null);
        } else {
            card = card2;
        }
        w70.j.Saved savedF = w70.j.Saved.f(saved, null, null, y0.Card.c(card, n().getValue().p().getValue(), null, null, null, 14, null), 3, null);
        Q(savedF);
        return savedF;
    }

    private final void M0(com.stripe.android.paymentsheet.r.Failed failure) {
        com.stripe.android.paymentsheet.o oVarC = failure.getType();
        if (p013kotlin.jvm.internal.s.f(oVarC, com.stripe.android.paymentsheet.o.f.f53216a)) {
            B0(new q70.b.Stripe(failure.getCause()), failure.getMessage());
            return;
        }
        if (p013kotlin.jvm.internal.s.f(oVarC, com.stripe.android.paymentsheet.o.a.f53211a)) {
            B0(q70.b.a.f104882a, failure.getMessage());
            return;
        }
        if (oVarC instanceof com.stripe.android.paymentsheet.o.GooglePay) {
            B0(new q70.b.GooglePay(((com.stripe.android.paymentsheet.o.GooglePay) failure.getType()).getErrorCode()), failure.getMessage());
        } else {
            if (p013kotlin.jvm.internal.s.f(oVarC, com.stripe.android.paymentsheet.o.b.f53212a)) {
                J0(failure.getCause());
                return;
            }
            if (p013kotlin.jvm.internal.s.f(oVarC, com.stripe.android.paymentsheet.o.e.f53215a) ? true : p013kotlin.jvm.internal.s.f(oVarC, com.stripe.android.paymentsheet.o.d.f53214a)) {
                K(failure.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(com.stripe.android.paymentsheet.r result) {
        if (result instanceof com.stripe.android.paymentsheet.r.Succeeded) {
            com.stripe.android.paymentsheet.r.Succeeded cVar = (com.stripe.android.paymentsheet.r.Succeeded) result;
            A0(cVar.getIntent(), cVar.getDeferredIntentConfirmationType(), false);
        } else if (result instanceof com.stripe.android.paymentsheet.r.Failed) {
            M0((com.stripe.android.paymentsheet.r.Failed) result);
        } else if ((result instanceof com.stripe.android.paymentsheet.r.Canceled) || result == null) {
            R0(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(StripeIntent stripeIntent, com.stripe.android.payments.paymentlauncher.f paymentResult) {
        if (paymentResult instanceof com.stripe.android.payments.paymentlauncher.f.c) {
            A0(stripeIntent, null, false);
            return;
        }
        if (paymentResult instanceof com.stripe.android.payments.paymentlauncher.f.d) {
            com.stripe.android.payments.paymentlauncher.f.d dVar = (com.stripe.android.payments.paymentlauncher.f.d) paymentResult;
            B0(new q70.b.Stripe(dVar.getThrowable()), l30.a.b(dVar.getThrowable()));
        } else if (paymentResult instanceof com.stripe.android.payments.paymentlauncher.f.a) {
            R0(this, null, 1, null);
        }
    }

    private final void Q0(x30.c userErrorMessage) {
        this.viewState.setValue(new w70.l.Reset(userErrorMessage != null ? new w70.l.UserErrorMessage(userErrorMessage) : null));
        getSavedStateHandle().n("processing", Boolean.FALSE);
    }

    static /* synthetic */ void R0(c0 c0Var, x30.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = null;
        }
        c0Var.Q0(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(boolean visible) {
        this._contentVisible.setValue(Boolean.valueOf(visible));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(c checkoutIdentifier) {
        this.checkoutIdentifier = checkoutIdentifier;
        getSavedStateHandle().n("processing", Boolean.TRUE);
        this.viewState.setValue(w70.l.c.f121196b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j0(Continuation<? super StripeIntent> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f52753p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f52753p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objFirst = fVar.f52751n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f52753p;
        if (i12 == 0) {
            jn0.t.b(objFirst);
            Flow flowFilterNotNull = FlowKt.filterNotNull(x());
            fVar.f52753p = 1;
            objFirst = FlowKt.first(flowFilterNotNull, fVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objFirst);
        }
        return ((PaymentMethodMetadata) objFirst).getStripeIntent();
    }

    private final void l0(w70.j paymentSelection, c identifier) {
        this.checkoutIdentifier = identifier;
        n0(paymentSelection);
    }

    private final void n0(w70.j paymentSelection) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), getWorkContext(), null, new h(paymentSelection, null), 2, null);
    }

    private final List<x70.c> o0(PaymentMethodMetadata paymentMethodMetadata, n70.b customerStateHolder) {
        if (getConfig().getPaymentMethodLayout() != y.o.Horizontal) {
            return j80.u.f83115a.a(this, paymentMethodMetadata, customerStateHolder);
        }
        return p013kotlin.collections.v.e(!customerStateHolder.c().getValue().isEmpty() ? new x70.c.j(p008h80.k.INSTANCE.a(this, paymentMethodMetadata, customerStateHolder, getSavedPaymentMethodMutator()), u0()) : new x70.c.b(p008h80.i.INSTANCE.a(this, paymentMethodMetadata)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(c80.c completionState) {
        y0.Card card;
        w70.j value = C().getValue();
        w70.j.Saved saved = value instanceof w70.j.Saved ? (w70.j.Saved) value : null;
        if (saved != null) {
            if (completionState instanceof c80.c.Completed) {
                card = new y0.Card(((c80.c.Completed) completionState).getCvc(), null, null, 6, null);
            } else {
                if (!p013kotlin.jvm.internal.s.f(completionState, c80.c.b.f18933a)) {
                    throw new NoWhenBranchMatchedException();
                }
                card = new y0.Card("", null, null, 6, null);
            }
            Q(new w70.j.Saved(saved.getPaymentMethod(), saved.getWalletType(), card));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, w70.l$d] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void z0(com.stripe.android.paymentsheet.k.a processingState) {
        h0 h0Var;
        int i11 = 1;
        ?? r11 = 0;
        if (p013kotlin.jvm.internal.s.f(processingState, com.stripe.android.paymentsheet.k.a.C1011a.f53159a)) {
            R0(this, null, 1, null);
            return;
        }
        if (processingState instanceof com.stripe.android.paymentsheet.k.a.PaymentMethodCollected) {
            Q(new w70.j.Saved(((com.stripe.android.paymentsheet.k.a.PaymentMethodCollected) processingState).getPaymentMethod(), w70.j.Saved.b.Link, null, 4, null));
            l0(C().getValue(), c.SheetTopWallet);
            return;
        }
        if (processingState instanceof com.stripe.android.paymentsheet.k.a.CompletedWithPaymentResult) {
            K0(((com.stripe.android.paymentsheet.k.a.CompletedWithPaymentResult) processingState).getResult());
            return;
        }
        if (processingState instanceof com.stripe.android.paymentsheet.k.a.d) {
            String strA = ((com.stripe.android.paymentsheet.k.a.d) processingState).a();
            K(strA != null ? x30.d.b(strA) : null);
            return;
        }
        if (p013kotlin.jvm.internal.s.f(processingState, com.stripe.android.paymentsheet.k.a.e.f53163a)) {
            T0(c.SheetTopWallet);
            return;
        }
        if (processingState instanceof com.stripe.android.paymentsheet.k.a.PaymentDetailsCollected) {
            w70.j jVarA = ((com.stripe.android.paymentsheet.k.a.PaymentDetailsCollected) processingState).getPaymentSelection();
            if (jVarA != null) {
                Q(jVarA);
                l0(C().getValue(), c.SheetBottomBuy);
                h0Var = h0.f84049a;
            }
            if (r11 != 0) {
                r11 = h0Var;
                return;
            } else {
                r11 = h0Var;
                l0(C().getValue(), c.SheetBottomBuy);
                return;
            }
        }
        if (p013kotlin.jvm.internal.s.f(processingState, com.stripe.android.paymentsheet.k.a.h.f53167a)) {
            this.checkoutIdentifier = c.SheetBottomBuy;
            this.viewState.setValue(new w70.l.Reset(r11, i11, r11));
        } else if (p013kotlin.jvm.internal.s.f(processingState, com.stripe.android.paymentsheet.k.a.i.f53168a)) {
            this.checkoutIdentifier = c.SheetBottomBuy;
            this.viewState.setValue(w70.l.c.f121196b);
        } else if (p013kotlin.jvm.internal.s.f(processingState, com.stripe.android.paymentsheet.k.a.b.f53160a)) {
            k0();
        }
    }

    @Override // k80.a
    public StateFlow<g80.m> D() {
        return this.walletsProcessingState;
    }

    @Override // k80.a
    public StateFlow<WalletsState> E() {
        return this.walletsState;
    }

    public final boolean F0() {
        return e0.b(this.args.getInitializationMode());
    }

    @Override // k80.a
    public void H(w70.j.e.USBankAccount paymentSelection) {
        p013kotlin.jvm.internal.s.k(paymentSelection, "paymentSelection");
        Q(paymentSelection);
        getEventReporter().k(C().getValue());
        k0();
    }

    @Override // k80.a
    public void I(w70.j selection) {
        if (p013kotlin.jvm.internal.s.f(selection, C().getValue())) {
            return;
        }
        Q(selection);
    }

    @Override // k80.a
    public void K(x30.c error) {
        Q0(error);
    }

    public void K0(com.stripe.android.payments.paymentlauncher.f paymentResult) {
        p013kotlin.jvm.internal.s.k(paymentResult, "paymentResult");
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), getWorkContext(), null, new q(paymentResult, null), 2, null);
    }

    @Override // k80.a
    public void L() {
        getEventReporter().onDismiss();
        this._paymentSheetResult.tryEmit(b0.a.f52716a);
    }

    @Override // k80.a
    public void M(com.stripe.android.paymentsheet.m mVar) {
        this.newPaymentSelection = mVar;
    }

    public final void P0(h.b activityResultCaller, LifecycleOwner lifecycleOwner) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        getLinkHandler().l(activityResultCaller);
        this.intentConfirmationHandler.P(activityResultCaller, lifecycleOwner);
        lifecycleOwner.getLifecycle().a(new t());
    }

    @Override // k80.a
    public void f() {
        if (this.viewState.getValue() instanceof w70.l.Reset) {
            this.viewState.setValue(new w70.l.Reset(null));
        }
    }

    public final void k0() {
        if (d0.d(this)) {
            G0();
        } else {
            l0(C().getValue(), c.SheetBottomBuy);
        }
    }

    public final void m0() {
        l0(w70.j.c.f121146b, c.SheetTopWallet);
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final PaymentSheetContractV2.Args getArgs() {
        return this.args;
    }

    @Override // k80.a
    public StateFlow<x30.c> q() {
        return this.error;
    }

    public final StateFlow<w70.l> q0() {
        return this.buyButtonState;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final c getCheckoutIdentifier() {
        return this.checkoutIdentifier;
    }

    public final StateFlow<Boolean> s0() {
        return this.contentVisible;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final r70.a getCvcRecollectionHandler() {
        return this.cvcRecollectionHandler;
    }

    public final x70.c.j.b u0() {
        return d0.a(this) ? new x70.c.j.b.C2661b(n()) : x70.c.j.b.a.f123037a;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final com.stripe.android.googlepaylauncher.h.Config getGooglePayLauncherConfig() {
        return this.googlePayLauncherConfig;
    }

    @Override // k80.a
    /* JADX INFO: renamed from: w, reason: from getter */
    public com.stripe.android.paymentsheet.m getNewPaymentSelection() {
        return this.newPaymentSelection;
    }

    public final SharedFlow<b0> w0() {
        return this.paymentSheetResult;
    }

    public final MutableStateFlow<w70.l> x0() {
        return this.viewState;
    }

    @Override // k80.a
    public StateFlow<PrimaryButton.UIState> y() {
        return this.primaryButtonUiState;
    }
}
