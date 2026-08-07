package k80;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.h;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.f0;
import com.stripe.android.paymentsheet.k;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.y;
import ezvcard.property.Gender;
import g80.WalletsState;
import g80.m;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p008h80.PaymentSheetTopBarState;
import p008h80.t;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import u60.PaymentMethodMetadata;
import w70.j;
import wn0.p;
import z80.p0;
import z80.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \u0094\u00012\u00020\u0001:\u0002\u0095\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b*\u0010\u001aJ\r\u0010+\u001a\u00020\u0018¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u0018H&¢\u0006\u0004\b,\u0010 J\u001b\u0010/\u001a\u00020\u00182\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H&¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b5\u0010GR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010UR\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bE\u0010ZR\u0017\u0010_\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b=\u0010^R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\bX\u0010ZR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00120W8\u0006¢\u0006\f\n\u0004\b?\u0010Y\u001a\u0004\bL\u0010ZR\u001c\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010UR\u001f\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0W8\u0006¢\u0006\f\n\u0004\b(\u0010Y\u001a\u0004\bc\u0010ZR\u001f\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0T8\u0006¢\u0006\f\n\u0004\b%\u0010U\u001a\u0004\bf\u0010gR\u0017\u0010l\u001a\u00020i8\u0006¢\u0006\f\n\u0004\bR\u0010j\u001a\u0004\b9\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010UR \u0010p\u001a\b\u0012\u0004\u0012\u00020m0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010Y\u001a\u0004\bo\u0010ZR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00120T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010UR \u0010t\u001a\b\u0012\u0004\u0012\u00020\u00120W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010Y\u001a\u0004\bs\u0010ZR\u0017\u0010y\u001a\u00020u8\u0006¢\u0006\f\n\u0004\b\u0019\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010~\u001a\u00020z8\u0006¢\u0006\f\n\u0004\b#\u0010{\u001a\u0004\b|\u0010}R\u001a\u0010\u0082\u0001\u001a\u00020\u007f8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0080\u0001\u001a\u0005\bP\u0010\u0081\u0001R#\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120W8\u0004X\u0084\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010Y\u001a\u0005\b\u0084\u0001\u0010ZR\u001e\u0010\u0087\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0086\u00010W8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010ZR\u001e\u0010\u0089\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0088\u00010W8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u001d\u0010\u008a\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0W8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010ZR\u001d\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0W8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010ZR\"\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018&@&X¦\u000e¢\u0006\u000e\u001a\u0005\bA\u0010\u008d\u0001\"\u0005\bq\u0010\u008e\u0001R\u0019\u0010\u0093\u0001\u001a\b0\u0090\u0001j\u0003`\u0091\u00018F¢\u0006\u0007\u001a\u0005\b1\u0010\u0092\u0001¨\u0006\u0096\u0001"}, d2 = {"Lk80/a;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/paymentsheet/y$h;", "config", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/repositories/b;", "customerRepository", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lcom/stripe/android/paymentsheet/k;", "linkHandler", "Lh80/t$a;", "editInteractorFactory", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "", "isCompleteFlow", "<init>", "(Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/b;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/s0;Lcom/stripe/android/paymentsheet/k;Lh80/t$a;Lh30/b$a;Z)V", "Lw70/j;", "selection", "Ljn0/h0;", Gender.OTHER, "(Lw70/j;)V", "Lu60/e;", "paymentMethodMetadata", Gender.NONE, "(Lu60/e;)V", "f", "()V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "state", "P", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;)V", "I", "Lw70/j$e$d;", "paymentSelection", "H", "(Lw70/j$e$d;)V", "Q", "G", "L", "Lx30/c;", AnalyticsAttribute.Error, "K", "(Lx30/c;)V", "s", "Lcom/stripe/android/paymentsheet/y$h;", "j", "()Lcom/stripe/android/paymentsheet/y$h;", "t", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "r", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "u", "Lcom/stripe/android/paymentsheet/repositories/b;", "l", "()Lcom/stripe/android/paymentsheet/repositories/b;", "v", "Lkotlin/coroutines/CoroutineContext;", Gender.FEMALE, "()Lkotlin/coroutines/CoroutineContext;", "w", "Landroidx/lifecycle/s0;", "B", "()Landroidx/lifecycle/s0;", "x", "Lcom/stripe/android/paymentsheet/k;", "()Lcom/stripe/android/paymentsheet/k;", "y", "Lh80/t$a;", "p", "()Lh80/t$a;", "z", "Lh30/b$a;", IntegerTokenConverter.CONVERTER_KEY, "()Lh30/b$a;", "A", "Z", "J", "()Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_paymentMethodMetadata", "Lkotlinx/coroutines/flow/StateFlow;", "C", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "Lx70/b;", "D", "Lx70/b;", "()Lx70/b;", "navigationHandler", "E", "processing", "_primaryButtonState", "getPrimaryButtonState", "primaryButtonState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "k", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "customPrimaryButtonUiState", "Lcom/stripe/android/paymentsheet/l;", "Lcom/stripe/android/paymentsheet/l;", "()Lcom/stripe/android/paymentsheet/l;", "mandateHandler", "Lz80/q0;", "_cvcControllerFlow", "n", "cvcControllerFlow", Gender.MALE, "_cvcRecollectionCompleteFlow", "o", "cvcRecollectionCompleteFlow", "Lq70/a;", "Lq70/a;", "g", "()Lq70/a;", "analyticsListener", "Ln70/b;", "Ln70/b;", "m", "()Ln70/b;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/f0;", "Lcom/stripe/android/paymentsheet/f0;", "()Lcom/stripe/android/paymentsheet/f0;", "savedPaymentMethodMutator", "R", "h", "buttonsEnabled", "Lg80/n;", "walletsState", "Lg80/m;", "walletsProcessingState", "primaryButtonUiState", "q", "Lcom/stripe/android/paymentsheet/m;", "()Lcom/stripe/android/paymentsheet/m;", "(Lcom/stripe/android/paymentsheet/m;)V", "newPaymentSelection", "", "Lcom/stripe/android/model/PaymentMethodCode;", "()Ljava/lang/String;", "initiallySelectedPaymentMethodType", "S", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a extends c1 {
    public static final int T = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean isCompleteFlow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final MutableStateFlow<PaymentMethodMetadata> _paymentMethodMetadata;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final StateFlow<PaymentMethodMetadata> paymentMethodMetadata;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final x70.b navigationHandler;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final StateFlow<j> selection;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final StateFlow<Boolean> processing;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final MutableStateFlow<PrimaryButton.a> _primaryButtonState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final StateFlow<PrimaryButton.a> primaryButtonState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final MutableStateFlow<PrimaryButton.UIState> customPrimaryButtonUiState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final l mandateHandler;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final MutableStateFlow<q0> _cvcControllerFlow;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final StateFlow<q0> cvcControllerFlow;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final MutableStateFlow<Boolean> _cvcRecollectionCompleteFlow;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final StateFlow<Boolean> cvcRecollectionCompleteFlow;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final q70.a analyticsListener;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final n70.b customerStateHolder;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final f0 savedPaymentMethodMutator;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final StateFlow<Boolean> buttonsEnabled;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final y.Configuration config;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final EventReporter eventReporter;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.repositories.b customerRepository;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k linkHandler;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final t.a editInteractorFactory;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final h30.b.a cardAccountRangeRepositoryFactory;

    /* JADX INFO: renamed from: k80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1", f = "BaseSheetViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    static final class C1812a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85334n;

        /* JADX INFO: renamed from: k80.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx70/c;", "it", "Ljn0/h0;", "a", "(Lx70/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1813a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f85336a;

            C1813a(a aVar) {
                this.f85336a = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(x70.c cVar, Continuation<? super h0> continuation) {
                this.f85336a.f();
                return h0.f84049a;
            }
        }

        C1812a(Continuation<? super C1812a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1812a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85334n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowDrop = FlowKt.drop(a.this.getNavigationHandler().f(), 1);
                C1813a c1813a = new C1813a(a.this);
                this.f85334n = 1;
                if (flowDrop.collect(c1813a, this) == coroutine_suspended) {
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
            return ((C1812a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<String> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return a.this.s();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx70/c;", "currentScreen", "Lkotlinx/coroutines/flow/StateFlow;", "", "a", "(Lx70/c;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<x70.c, StateFlow<? extends Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f85338c = new d();

        /* JADX INFO: renamed from: k80.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/g0;", "topBarState", "", "a", "(Lh80/g0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class C1814a extends u implements wn0.l<PaymentSheetTopBarState, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1814a f85339c = new C1814a();

            C1814a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(PaymentSheetTopBarState paymentSheetTopBarState) {
                boolean z11 = false;
                if (paymentSheetTopBarState != null && paymentSheetTopBarState.getIsEditing()) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        }

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<Boolean> invoke(x70.c currentScreen) {
            s.k(currentScreen, "currentScreen");
            return r90.g.m(currentScreen.c(), C1814a.f85339c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isProcessing", "isEditing", "a", "(ZZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f85340c = new e();

        e() {
            super(2);
        }

        public final Boolean a(boolean z11, boolean z12) {
            return Boolean.valueOf((z11 || z12) ? false : true);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool.booleanValue(), bool2.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx70/c;", "poppedScreen", "Ljn0/h0;", "a", "(Lx70/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.l<x70.c, h0> {
        f() {
            super(1);
        }

        public final void a(x70.c poppedScreen) {
            s.k(poppedScreen, "poppedScreen");
            a.this.getAnalyticsListener().h(poppedScreen);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(x70.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$updateCvcFlows$1", f = "BaseSheetViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85342n;

        /* JADX INFO: renamed from: k80.a$g$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1815a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f85344a;

            C1815a(a aVar) {
                this.f85344a = aVar;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                this.f85344a._cvcRecollectionCompleteFlow.setValue(Boxing.boxBoolean(z11));
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85342n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<Boolean> stateFlowIsComplete = a.this.n().getValue().isComplete();
                C1815a c1815a = new C1815a(a.this);
                this.f85342n = 1;
                if (stateFlowIsComplete.collect(c1815a, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(y.Configuration config, EventReporter eventReporter, com.stripe.android.paymentsheet.repositories.b customerRepository, CoroutineContext workContext, s0 savedStateHandle, k linkHandler, t.a editInteractorFactory, h30.b.a cardAccountRangeRepositoryFactory, boolean z11) {
        s.k(config, "config");
        s.k(eventReporter, "eventReporter");
        s.k(customerRepository, "customerRepository");
        s.k(workContext, "workContext");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(linkHandler, "linkHandler");
        s.k(editInteractorFactory, "editInteractorFactory");
        s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.config = config;
        this.eventReporter = eventReporter;
        this.customerRepository = customerRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.linkHandler = linkHandler;
        this.editInteractorFactory = editInteractorFactory;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.isCompleteFlow = z11;
        MutableStateFlow<PaymentMethodMetadata> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._paymentMethodMetadata = MutableStateFlow;
        this.paymentMethodMetadata = MutableStateFlow;
        x70.b bVar = new x70.b(d1.a(this), new f());
        this.navigationHandler = bVar;
        this.selection = savedStateHandle.i("selection", null);
        StateFlow<Boolean> stateFlowI = savedStateHandle.i("processing", Boolean.FALSE);
        this.processing = stateFlowI;
        MutableStateFlow<PrimaryButton.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._primaryButtonState = MutableStateFlow2;
        this.primaryButtonState = MutableStateFlow2;
        this.customPrimaryButtonUiState = StateFlowKt.MutableStateFlow(null);
        this.mandateHandler = l.INSTANCE.a(this);
        MutableStateFlow<q0> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new q0(new p0(), r90.g.n(h.Unknown), null, false, 12, null));
        this._cvcControllerFlow = MutableStateFlow3;
        this.cvcControllerFlow = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this._cvcRecollectionCompleteFlow = MutableStateFlow4;
        this.cvcRecollectionCompleteFlow = MutableStateFlow4;
        this.analyticsListener = new q70.a(savedStateHandle, eventReporter, bVar.f(), d1.a(this), new c());
        this.customerStateHolder = n70.b.INSTANCE.a(this);
        this.savedPaymentMethodMutator = f0.INSTANCE.a(this);
        this.buttonsEnabled = r90.g.h(stateFlowI, r90.g.l(bVar.f(), d.f85338c), e.f85340c);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new C1812a(null), 3, null);
    }

    private final void O(j selection) {
        h hVar;
        if (selection instanceof j.Saved) {
            j.Saved saved = (j.Saved) selection;
            if (saved.getPaymentMethod().type == PaymentMethod.p.Card) {
                MutableStateFlow<q0> mutableStateFlow = this._cvcControllerFlow;
                p0 p0Var = new p0();
                PaymentMethod.Card card = saved.getPaymentMethod().card;
                if (card == null || (hVar = card.brand) == null) {
                    hVar = h.Unknown;
                }
                mutableStateFlow.setValue(new q0(p0Var, r90.g.n(hVar), null, false, 12, null));
                BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new g(null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final f0 getSavedPaymentMethodMutator() {
        return this.savedPaymentMethodMutator;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final s0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final StateFlow<j> C() {
        return this.selection;
    }

    public abstract StateFlow<m> D();

    public abstract StateFlow<WalletsState> E();

    /* JADX INFO: renamed from: F, reason: from getter */
    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    public final void G() {
        if (this.processing.getValue().booleanValue()) {
            return;
        }
        if (this.navigationHandler.e()) {
            this.navigationHandler.i();
        } else {
            L();
        }
    }

    public abstract void H(j.e.USBankAccount paymentSelection);

    public abstract void I(j selection);

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getIsCompleteFlow() {
        return this.isCompleteFlow;
    }

    public abstract void K(x30.c error);

    public abstract void L();

    public abstract void M(com.stripe.android.paymentsheet.m mVar);

    protected final void N(PaymentMethodMetadata paymentMethodMetadata) {
        this._paymentMethodMetadata.setValue(paymentMethodMetadata);
    }

    public final void P(PrimaryButton.a state) {
        s.k(state, "state");
        this._primaryButtonState.setValue(state);
    }

    public final void Q(j selection) {
        if (selection instanceof j.e) {
            M(new com.stripe.android.paymentsheet.m.New((j.e) selection));
        } else if (selection instanceof j.ExternalPaymentMethod) {
            M(new com.stripe.android.paymentsheet.m.External((j.ExternalPaymentMethod) selection));
        }
        this.savedStateHandle.n("selection", selection);
        O(selection);
        f();
    }

    public abstract void f();

    /* JADX INFO: renamed from: g, reason: from getter */
    public final q70.a getAnalyticsListener() {
        return this.analyticsListener;
    }

    protected final StateFlow<Boolean> h() {
        return this.buttonsEnabled;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h30.b.a getCardAccountRangeRepositoryFactory() {
        return this.cardAccountRangeRepositoryFactory;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final y.Configuration getConfig() {
        return this.config;
    }

    public final MutableStateFlow<PrimaryButton.UIState> k() {
        return this.customPrimaryButtonUiState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final com.stripe.android.paymentsheet.repositories.b getCustomerRepository() {
        return this.customerRepository;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final n70.b getCustomerStateHolder() {
        return this.customerStateHolder;
    }

    public final StateFlow<q0> n() {
        return this.cvcControllerFlow;
    }

    public final StateFlow<Boolean> o() {
        return this.cvcRecollectionCompleteFlow;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final t.a getEditInteractorFactory() {
        return this.editInteractorFactory;
    }

    public abstract StateFlow<x30.c> q();

    /* JADX INFO: renamed from: r, reason: from getter */
    public final EventReporter getEventReporter() {
        return this.eventReporter;
    }

    public final String s() {
        String strD;
        com.stripe.android.paymentsheet.m newPaymentSelection = getNewPaymentSelection();
        if (newPaymentSelection != null && (strD = newPaymentSelection.d()) != null) {
            return strD;
        }
        PaymentMethodMetadata value = this.paymentMethodMetadata.getValue();
        s.h(value);
        return (String) v.o0(value.K());
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final k getLinkHandler() {
        return this.linkHandler;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final l getMandateHandler() {
        return this.mandateHandler;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final x70.b getNavigationHandler() {
        return this.navigationHandler;
    }

    /* JADX INFO: renamed from: w */
    public abstract com.stripe.android.paymentsheet.m getNewPaymentSelection();

    public final StateFlow<PaymentMethodMetadata> x() {
        return this.paymentMethodMetadata;
    }

    public abstract StateFlow<PrimaryButton.UIState> y();

    public final StateFlow<Boolean> z() {
        return this.processing;
    }
}
