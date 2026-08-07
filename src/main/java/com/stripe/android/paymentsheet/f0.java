package com.stripe.android.paymentsheet;

import androidx.p003lifecycle.d1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import g80.CustomerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u0001:\u0001CBß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u0010\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010\u0012\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J$\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010'\u001a\u00020\u0014H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020)H\u0082@¢\u0006\u0004\b0\u00101J,\u00104\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010.\u001a\u00020)2\u0006\u00103\u001a\u000202H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u001b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020)¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020)¢\u0006\u0004\b:\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR+\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u0004\u0012\u00020\u00160\u00138\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010JR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\bV\u0010J\u001a\u0004\bS\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bZ\u0010\\R#\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0^0\u00108\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bV\u0010WR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b4\u0010J\u001a\u0004\bR\u0010WR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000e0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010cR \u0010e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010J\u001a\u0004\bU\u0010W\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006f"}, d2 = {"Lcom/stripe/android/paymentsheet/f0;", "", "Lh80/t$a;", "editInteractorFactory", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lx70/b;", "navigationHandler", "Lcom/stripe/android/paymentsheet/repositories/b;", "customerRepository", "", "allowsRemovalOfLastSavedPaymentMethod", "Lkotlinx/coroutines/flow/StateFlow;", "Lw70/j;", "selection", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "providePaymentMethodName", "Lkotlin/Function0;", "Lx70/c;", "addFirstPaymentMethodScreenFactory", "Ljn0/h0;", "clearSelection", "isLiveModeProvider", "Ln70/b;", "customerStateHolder", "currentScreen", "isCbcEligible", "isGooglePayReady", "isLinkEnabled", "isNotPaymentFlow", "<init>", "(Lh80/t$a;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lx70/b;Lcom/stripe/android/paymentsheet/repositories/b;ZLkotlinx/coroutines/flow/StateFlow;Lwn0/l;Lwn0/a;Lwn0/a;Lwn0/a;Ln70/b;Lkotlinx/coroutines/flow/StateFlow;Lwn0/a;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Z)V", "paymentMethodId", "Ljn0/s;", "Lcom/stripe/android/model/v0;", "w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Ljava/lang/String;)V", "paymentMethod", "", "v", "(Lcom/stripe/android/model/v0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/h;", "brand", "r", "(Lcom/stripe/android/model/v0;Lcom/stripe/android/model/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "()V", "u", "(Lcom/stripe/android/model/v0;)V", "s", "a", "Lh80/t$a;", "b", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "c", "Lkotlinx/coroutines/CoroutineScope;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "e", "Lx70/b;", "f", "Lcom/stripe/android/paymentsheet/repositories/b;", "g", "Z", "h", "Lkotlinx/coroutines/flow/StateFlow;", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/l;", "q", "()Lwn0/l;", "j", "Lwn0/a;", "k", "l", "m", "Ln70/b;", "n", "o", "()Lkotlinx/coroutines/flow/StateFlow;", "canRemove", "Lk80/b;", "p", "Lkotlin/Lazy;", "()Lk80/b;", "paymentOptionsItemsMapper", "", "Lcom/stripe/android/paymentsheet/t;", "paymentOptionsItems", "canEdit", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_editing", "editing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f52809v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h80.t.a editInteractorFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EventReporter eventReporter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x70.b navigationHandler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.repositories.b customerRepository;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsRemovalOfLastSavedPaymentMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w70.j> selection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, x30.c> providePaymentMethodName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<x70.c> addFirstPaymentMethodScreenFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> clearSelection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> isLiveModeProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final n70.b customerStateHolder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<x70.c> currentScreen;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> canRemove;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentOptionsItemsMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<t>> paymentOptionsItems;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> canEdit;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _editing;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> editing;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$1", f = "SavedPaymentMethodMutator.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52830n;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j;", "selection", "Ljn0/h0;", "a", "(Lw70/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1002a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f52832a;

            C1002a(f0 f0Var) {
                this.f52832a = f0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(w70.j jVar, Continuation<? super h0> continuation) {
                if (jVar instanceof w70.j.Saved) {
                    this.f52832a.customerStateHolder.e(((w70.j.Saved) jVar).getPaymentMethod());
                }
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52830n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = f0.this.selection;
                C1002a c1002a = new C1002a(f0.this);
                this.f52830n = 1;
                if (stateFlow.collect(c1002a, this) == coroutine_suspended) {
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
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52833n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "canEdit", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f52835a;

            a(f0 f0Var) {
                this.f52835a = f0Var;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                if (!z11 && this.f52835a.n().getValue().booleanValue()) {
                    this.f52835a._editing.setValue(Boxing.boxBoolean(false));
                }
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52833n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<Boolean> stateFlowL = f0.this.l();
                a aVar = new a(f0.this);
                this.f52833n = 1;
                if (stateFlowL.collect(aVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$3", f = "SavedPaymentMethodMutator.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52836n;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "Ljn0/h0;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f52838a;

            a(f0 f0Var) {
                this.f52838a = f0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<PaymentMethod> list, Continuation<? super h0> continuation) {
                if (list.isEmpty() && this.f52838a.n().getValue().booleanValue()) {
                    this.f52838a._editing.setValue(Boxing.boxBoolean(false));
                }
                return h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52836n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<List<PaymentMethod>> stateFlowC = f0.this.customerStateHolder.c();
                a aVar = new a(f0.this);
                this.f52836n = 1;
                if (stateFlowC.collect(aVar, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$4", f = "SavedPaymentMethodMutator.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52839n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx70/c;", "currentScreen", "Ljn0/h0;", "a", "(Lx70/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f52841a;

            a(f0 f0Var) {
                this.f52841a = f0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(x70.c cVar, Continuation<? super h0> continuation) {
                if (cVar instanceof x70.c.k) {
                    this.f52841a._editing.setValue(Boxing.boxBoolean(false));
                }
                return h0.f84049a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52839n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = f0.this.currentScreen;
                a aVar = new a(f0.this);
                this.f52839n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/f0$e;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lcom/stripe/android/paymentsheet/f0;", "a", "(Lk80/a;)Lcom/stripe/android/paymentsheet/f0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu60/e;", "it", "", "a", "(Lu60/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<PaymentMethodMetadata, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f52842c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(PaymentMethodMetadata paymentMethodMetadata) {
                boolean z11 = false;
                if (paymentMethodMetadata != null && paymentMethodMetadata.getIsGooglePayReady()) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e$b */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lx30/c;", "a", "(Ljava/lang/String;)Lx30/c;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<String, x30.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f52843c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k80.a aVar) {
                super(1);
                this.f52843c = aVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x30.c invoke(String str) {
                x30.c displayName = null;
                if (str != null) {
                    PaymentMethodMetadata value = this.f52843c.x().getValue();
                    SupportedPaymentMethod supportedPaymentMethodG = value != null ? value.G(str) : null;
                    if (supportedPaymentMethodG != null) {
                        displayName = supportedPaymentMethodG.getDisplayName();
                    }
                }
                return x30.d.c(displayName);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx70/c;", "b", "()Lx70/c;"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.a<x70.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f52844c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k80.a aVar) {
                super(0);
                this.f52844c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x70.c invoke() {
                p008h80.i.Companion eVar = p008h80.i.INSTANCE;
                k80.a aVar = this.f52844c;
                PaymentMethodMetadata value = aVar.x().getValue();
                if (value != null) {
                    return new x70.c.b(eVar.a(aVar, value));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e$d */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f52845c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(k80.a aVar) {
                super(0);
                this.f52845c = aVar;
            }

            public final void b() {
                this.f52845c.Q(null);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class C1003e extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f52846c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1003e(k80.a aVar) {
                super(0);
                this.f52846c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                PaymentMethodMetadata value = this.f52846c.x().getValue();
                if (value != null) {
                    return Boolean.valueOf(value.getStripeIntent().getIsLiveMode());
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.f0$e$f */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class f extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f52847c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(k80.a aVar) {
                super(0);
                this.f52847c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                PaymentMethodMetadata value = this.f52847c.x().getValue();
                return Boolean.valueOf((value != null ? value.getCbcEligibility() : null) instanceof x80.a.Eligible);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a(k80.a viewModel) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            return new f0(viewModel.getEditInteractorFactory(), viewModel.getEventReporter(), d1.a(viewModel), viewModel.getWorkContext(), viewModel.getNavigationHandler(), viewModel.getCustomerRepository(), viewModel.getConfig().getAllowsRemovalOfLastSavedPaymentMethod(), viewModel.C(), new b(viewModel), new c(viewModel), new d(viewModel), new C1003e(viewModel), viewModel.getCustomerStateHolder(), viewModel.getNavigationHandler().f(), new f(viewModel), r90.g.m(viewModel.x(), a.f52842c), viewModel.getLinkHandler().g(), !viewModel.getIsCompleteFlow());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "canRemove", "", "Lcom/stripe/android/paymentsheet/t;", "items", "a", "(ZLjava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, List<? extends t>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f52848c = new f();

        f() {
            super(2);
        }

        public final Boolean a(boolean z11, List<? extends t> items) {
            boolean z12;
            p013kotlin.jvm.internal.s.k(items, "items");
            if (z11) {
                z12 = true;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    if (obj instanceof t.SavedPaymentMethod) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((t.SavedPaymentMethod) it.next()).f()) {
                                z12 = true;
                            }
                        }
                    }
                }
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, List<? extends t> list) {
            return a(bool.booleanValue(), list);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg80/a;", "customerState", "", "a", "(Lg80/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<CustomerState, Boolean> {
        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(CustomerState customerState) {
            boolean z11 = false;
            if (customerState != null) {
                f0 f0Var = f0.this;
                boolean canRemovePaymentMethods = customerState.getPermissions().getCanRemovePaymentMethods();
                int size = customerState.d().size();
                if (size != 0) {
                    if (size != 1) {
                        z11 = canRemovePaymentMethods;
                    } else if (f0Var.allowsRemovalOfLastSavedPaymentMethod && canRemovePaymentMethods) {
                        z11 = true;
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m = "modifyCardPaymentMethod-0E7RQCE", n = {"this", "brand", "currentCustomer"}, s = {"L$0", "L$1", "L$2"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52850n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52851o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f52852p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f52853q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f52855s;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52853q = obj;
            this.f52855s |= Integer.MIN_VALUE;
            Object objR = f0.this.r(null, null, this);
            return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : jn0.s.a(objR);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/n$a;", "event", "Ljn0/h0;", "a", "(Lh80/n$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<h80.n.a, h0> {
        i() {
            super(1);
        }

        public final void a(h80.n.a event) {
            p013kotlin.jvm.internal.s.k(event, "event");
            if (event instanceof h80.n.a.ShowBrands) {
                f0.this.eventReporter.f(EventReporter.a.Edit, ((h80.n.a.ShowBrands) event).getBrand());
            } else if (event instanceof h80.n.a.HideBrands) {
                f0.this.eventReporter.i(EventReporter.a.Edit, ((h80.n.a.HideBrands) event).getBrand());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h80.n.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/v0;", "method", "", "<anonymous>", "(Lcom/stripe/android/model/v0;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$modifyPaymentMethod$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<PaymentMethod, Continuation<? super Throwable>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52857n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f52858o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
            return ((j) create(paymentMethod, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = f0.this.new j(continuation);
            jVar.f52858o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52857n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            PaymentMethod paymentMethod = (PaymentMethod) this.f52858o;
            f0 f0Var = f0.this;
            this.f52857n = 1;
            Object objV = f0Var.v(paymentMethod, this);
            return objV == coroutine_suspended ? coroutine_suspended : objV;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/v0;", "method", "Lcom/stripe/android/model/h;", "brand", "Ljn0/s;", "<anonymous>", "(Lcom/stripe/android/model/v0;Lcom/stripe/android/model/h;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$modifyPaymentMethod$3", f = "SavedPaymentMethodMutator.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.q<PaymentMethod, com.stripe.android.model.h, Continuation<? super jn0.s<? extends PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52860n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f52861o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f52862p;

        k(Continuation<? super k> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentMethod paymentMethod, com.stripe.android.model.h hVar, Continuation<? super jn0.s<PaymentMethod>> continuation) {
            k kVar = f0.this.new k(continuation);
            kVar.f52861o = paymentMethod;
            kVar.f52862p = hVar;
            return kVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objR;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52860n;
            if (i11 == 0) {
                jn0.t.b(obj);
                PaymentMethod paymentMethod = (PaymentMethod) this.f52861o;
                com.stripe.android.model.h hVar = (com.stripe.android.model.h) this.f52862p;
                f0 f0Var = f0.this;
                this.f52861o = null;
                this.f52860n = 1;
                objR = f0Var.r(paymentMethod, hVar, this);
                if (objR == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objR = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objR);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk80/b;", "b", "()Lk80/b;"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.a<k80.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<Boolean> f52865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<Boolean> f52866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f52867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<Boolean> f52868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(StateFlow<Boolean> stateFlow, StateFlow<Boolean> stateFlow2, boolean z11, wn0.a<Boolean> aVar) {
            super(0);
            this.f52865d = stateFlow;
            this.f52866e = stateFlow2;
            this.f52867f = z11;
            this.f52868g = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k80.b invoke() {
            StateFlow<CustomerState> stateFlowA = f0.this.customerStateHolder.a();
            wn0.l<String, x30.c> lVarQ = f0.this.q();
            return new k80.b(stateFlowA, this.f52865d, this.f52866e, f0.this.m(), lVarQ, this.f52867f, this.f52868g);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethod$1", f = "SavedPaymentMethodMutator.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52869n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f52871p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f52871p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new m(this.f52871p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52869n;
            if (i11 == 0) {
                jn0.t.b(obj);
                f0.this.t(this.f52871p);
                f0 f0Var = f0.this;
                String str = this.f52871p;
                this.f52869n = 1;
                if (f0Var.w(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                ((jn0.s) obj).getValue();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m = "removePaymentMethodInEditScreen", n = {"this", "paymentMethodId"}, s = {"L$0", "L$1"})
    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52872n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52873o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f52874p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f52876r;

        n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52874p = obj;
            this.f52876r |= Integer.MIN_VALUE;
            return f0.this.v(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethodInEditScreen$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52877n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f52879p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f52879p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new o(this.f52879p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52877n;
            if (i11 == 0) {
                jn0.t.b(obj);
                f0.this.navigationHandler.i();
                this.f52877n = 1;
                if (DelayKt.delay(600L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            f0.this.t(this.f52879p);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {}, l = {161}, m = "removePaymentMethodInternal-gIAlu-s", n = {}, s = {})
    static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52880n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f52882p;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52880n = obj;
            this.f52882p |= Integer.MIN_VALUE;
            Object objW = f0.this.w(null, this);
            return objW == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : jn0.s.a(objW);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(h80.t.a editInteractorFactory, EventReporter eventReporter, CoroutineScope coroutineScope, CoroutineContext workContext, x70.b navigationHandler, com.stripe.android.paymentsheet.repositories.b customerRepository, boolean z11, StateFlow<? extends w70.j> selection, wn0.l<? super String, ? extends x30.c> providePaymentMethodName, wn0.a<? extends x70.c> addFirstPaymentMethodScreenFactory, wn0.a<h0> clearSelection, wn0.a<Boolean> isLiveModeProvider, n70.b customerStateHolder, StateFlow<? extends x70.c> currentScreen, wn0.a<Boolean> isCbcEligible, StateFlow<Boolean> isGooglePayReady, StateFlow<Boolean> isLinkEnabled, boolean z12) {
        p013kotlin.jvm.internal.s.k(editInteractorFactory, "editInteractorFactory");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(navigationHandler, "navigationHandler");
        p013kotlin.jvm.internal.s.k(customerRepository, "customerRepository");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        p013kotlin.jvm.internal.s.k(providePaymentMethodName, "providePaymentMethodName");
        p013kotlin.jvm.internal.s.k(addFirstPaymentMethodScreenFactory, "addFirstPaymentMethodScreenFactory");
        p013kotlin.jvm.internal.s.k(clearSelection, "clearSelection");
        p013kotlin.jvm.internal.s.k(isLiveModeProvider, "isLiveModeProvider");
        p013kotlin.jvm.internal.s.k(customerStateHolder, "customerStateHolder");
        p013kotlin.jvm.internal.s.k(currentScreen, "currentScreen");
        p013kotlin.jvm.internal.s.k(isCbcEligible, "isCbcEligible");
        p013kotlin.jvm.internal.s.k(isGooglePayReady, "isGooglePayReady");
        p013kotlin.jvm.internal.s.k(isLinkEnabled, "isLinkEnabled");
        this.editInteractorFactory = editInteractorFactory;
        this.eventReporter = eventReporter;
        this.coroutineScope = coroutineScope;
        this.workContext = workContext;
        this.navigationHandler = navigationHandler;
        this.customerRepository = customerRepository;
        this.allowsRemovalOfLastSavedPaymentMethod = z11;
        this.selection = selection;
        this.providePaymentMethodName = providePaymentMethodName;
        this.addFirstPaymentMethodScreenFactory = addFirstPaymentMethodScreenFactory;
        this.clearSelection = clearSelection;
        this.isLiveModeProvider = isLiveModeProvider;
        this.customerStateHolder = customerStateHolder;
        this.currentScreen = currentScreen;
        StateFlow<Boolean> stateFlowM = r90.g.m(customerStateHolder.a(), new g());
        this.canRemove = stateFlowM;
        this.paymentOptionsItemsMapper = jn0.m.b(new l(isGooglePayReady, isLinkEnabled, z12, isCbcEligible));
        StateFlow<List<t>> stateFlowC = p().c();
        this.paymentOptionsItems = stateFlowC;
        this.canEdit = r90.g.h(stateFlowM, stateFlowC, f.f52848c);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._editing = MutableStateFlow;
        this.editing = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new d(null), 3, null);
    }

    private final k80.b p() {
        return (k80.b) this.paymentOptionsItemsMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object r(PaymentMethod paymentMethod, com.stripe.android.model.h hVar, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        h hVar2;
        CustomerState customerState;
        Object value;
        com.stripe.android.model.h hVar3;
        f0 f0Var;
        if (continuation instanceof h) {
            hVar2 = (h) continuation;
            int i11 = hVar2.f52855s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar2.f52855s = i11 - Integer.MIN_VALUE;
            } else {
                hVar2 = new h(continuation);
            }
        } else {
            hVar2 = new h(continuation);
        }
        Object obj = hVar2.f52853q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar2.f52855s;
        if (i12 == 0) {
            jn0.t.b(obj);
            CustomerState value2 = this.customerStateHolder.a().getValue();
            if (value2 == null) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(new IllegalStateException("Could not update payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration")));
            }
            com.stripe.android.paymentsheet.repositories.b bVar = this.customerRepository;
            com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(value2.getId(), value2.getEphemeralKeySecret(), value2.getCustomerSessionClientSecret());
            String str = paymentMethod.id;
            p013kotlin.jvm.internal.s.h(str);
            a1 a1VarB = a1.Companion.b(a1.INSTANCE, null, null, new a1.a.c(hVar.getCode()), null, null, p013kotlin.collections.d1.c("PaymentSheet"), 27, null);
            hVar2.f52850n = this;
            hVar2.f52851o = hVar;
            hVar2.f52852p = value2;
            hVar2.f52855s = 1;
            Object objA = bVar.a(customerInfo, str, a1VarB, hVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerState = value2;
            value = objA;
            hVar3 = hVar;
            f0Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CustomerState customerState2 = (CustomerState) hVar2.f52852p;
            hVar3 = (com.stripe.android.model.h) hVar2.f52851o;
            f0Var = (f0) hVar2.f52850n;
            jn0.t.b(obj);
            value = ((jn0.s) obj).getValue();
            customerState = customerState2;
        }
        if (jn0.s.h(value)) {
            PaymentMethod paymentMethod2 = (PaymentMethod) value;
            f0Var.customerStateHolder.e(paymentMethod2);
            n70.b bVar2 = f0Var.customerStateHolder;
            List<PaymentMethod> listD = customerState.d();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listD, 10));
            for (PaymentMethod paymentMethod3 : listD) {
                String str2 = paymentMethod3.id;
                String str3 = paymentMethod2.id;
                if (str3 != null && str2 != null && p013kotlin.jvm.internal.s.f(str3, str2)) {
                    paymentMethod3 = paymentMethod2;
                }
                arrayList.add(paymentMethod3);
            }
            bVar2.d(CustomerState.b(customerState, null, null, null, arrayList, null, 23, null));
            f0Var.navigationHandler.i();
            f0Var.eventReporter.b(hVar3);
        }
        Throwable thE = jn0.s.e(value);
        if (thE != null) {
            f0Var.eventReporter.c(hVar3, thE);
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String paymentMethodId) {
        PaymentMethod paymentMethod;
        CustomerState value = this.customerStateHolder.a().getValue();
        if (value == null) {
            return;
        }
        n70.b bVar = this.customerStateHolder;
        List<PaymentMethod> listD = value.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (!p013kotlin.jvm.internal.s.f(((PaymentMethod) obj).id, paymentMethodId)) {
                arrayList.add(obj);
            }
        }
        bVar.d(CustomerState.b(value, null, null, null, arrayList, null, 23, null));
        PaymentMethod value2 = this.customerStateHolder.b().getValue();
        String str = null;
        if (p013kotlin.jvm.internal.s.f(value2 != null ? value2.id : null, paymentMethodId)) {
            this.customerStateHolder.e(null);
        }
        w70.j value3 = this.selection.getValue();
        w70.j.Saved saved = value3 instanceof w70.j.Saved ? (w70.j.Saved) value3 : null;
        if (saved != null && (paymentMethod = saved.getPaymentMethod()) != null) {
            str = paymentMethod.id;
        }
        if (p013kotlin.jvm.internal.s.f(str, paymentMethodId)) {
            this.clearSelection.invoke();
        }
        if (this.customerStateHolder.c().getValue().isEmpty() && (this.navigationHandler.f().getValue() instanceof x70.c.j)) {
            this.navigationHandler.l(p013kotlin.collections.v.e(this.addFirstPaymentMethodScreenFactory.invoke()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
        n nVar;
        String str;
        Object objW;
        f0 f0Var;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i11 = nVar.f52876r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f52876r = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object obj = nVar.f52874p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = nVar.f52876r;
        if (i12 == 0) {
            jn0.t.b(obj);
            str = paymentMethod.id;
            p013kotlin.jvm.internal.s.h(str);
            nVar.f52872n = this;
            nVar.f52873o = str;
            nVar.f52876r = 1;
            objW = w(str, nVar);
            if (objW == coroutine_suspended) {
                return coroutine_suspended;
            }
            f0Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nVar.f52873o;
            f0Var = (f0) nVar.f52872n;
            jn0.t.b(obj);
            objW = ((jn0.s) obj).getValue();
        }
        if (jn0.s.h(objW)) {
            BuildersKt__Builders_commonKt.launch$default(f0Var.coroutineScope, f0Var.workContext, null, f0Var.new o(str, null), 2, null);
        }
        return jn0.s.e(objW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(String str, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        p pVar;
        PaymentMethod paymentMethod;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i11 = pVar.f52882p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f52882p = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object obj = pVar.f52880n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pVar.f52882p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        CustomerState value = this.customerStateHolder.a().getValue();
        if (value == null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(new IllegalStateException("Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration")));
        }
        w70.j value2 = this.selection.getValue();
        String str2 = null;
        w70.j.Saved saved = value2 instanceof w70.j.Saved ? (w70.j.Saved) value2 : null;
        if (saved != null && (paymentMethod = saved.getPaymentMethod()) != null) {
            str2 = paymentMethod.id;
        }
        if (p013kotlin.jvm.internal.s.f(str2, str)) {
            this.clearSelection.invoke();
        }
        com.stripe.android.paymentsheet.repositories.b bVar = this.customerRepository;
        com.stripe.android.paymentsheet.repositories.b.CustomerInfo customerInfo = new com.stripe.android.paymentsheet.repositories.b.CustomerInfo(value.getId(), value.getEphemeralKeySecret(), value.getCustomerSessionClientSecret());
        boolean canRemoveDuplicates = value.getPermissions().getCanRemoveDuplicates();
        pVar.f52882p = 1;
        Object objB = bVar.b(customerInfo, str, canRemoveDuplicates, pVar);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    public final StateFlow<Boolean> l() {
        return this.canEdit;
    }

    public final StateFlow<Boolean> m() {
        return this.canRemove;
    }

    public final StateFlow<Boolean> n() {
        return this.editing;
    }

    public final StateFlow<List<t>> o() {
        return this.paymentOptionsItems;
    }

    public final wn0.l<String, x30.c> q() {
        return this.providePaymentMethodName;
    }

    public final void s(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        x70.b bVar = this.navigationHandler;
        h80.t.a aVar = this.editInteractorFactory;
        wn0.l<String, x30.c> lVar = this.providePaymentMethodName;
        PaymentMethod.p pVar = paymentMethod.type;
        bVar.m(new x70.c.f(aVar.a(paymentMethod, new i(), new j(null), new k(null), lVar.invoke(pVar != null ? pVar.code : null), this.canRemove.getValue().booleanValue(), this.isLiveModeProvider.invoke().booleanValue())));
    }

    public final void u(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        String str = paymentMethod.id;
        if (str == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.workContext, null, new m(str, null), 2, null);
    }

    public final void x() {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this._editing;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(!value.booleanValue())));
    }
}
