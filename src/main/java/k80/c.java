package k80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.y;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import w70.j;
import w80.Amount;
import w80.n;
import wn0.q;
import wn0.s;
import wn0.u;
import x30.d;
import x70.BuyButtonState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,¨\u0006-"}, d2 = {"Lk80/c;", "", "Lcom/stripe/android/paymentsheet/y$h;", "config", "", "isProcessingPayment", "Lkotlinx/coroutines/flow/StateFlow;", "Lx70/c;", "currentScreenFlow", "buttonsEnabledFlow", "Lw80/b;", "amountFlow", "Lw70/j;", "selectionFlow", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "customPrimaryButtonUiStateFlow", "cvcCompleteFlow", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(Lcom/stripe/android/paymentsheet/y$h;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/a;)V", "amount", "Lx30/c;", "e", "(Lw80/b;)Lx30/c;", "f", "()Lx30/c;", AnalyticsContext.Screen, "complete", "selection", "g", "(Lx70/c;ZLw70/j;)Z", "Lkotlinx/coroutines/flow/Flow;", "h", "()Lkotlinx/coroutines/flow/Flow;", IntegerTokenConverter.CONVERTER_KEY, "a", "Lcom/stripe/android/paymentsheet/y$h;", "b", "Z", "c", "Lkotlinx/coroutines/flow/StateFlow;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y.Configuration config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isProcessingPayment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<x70.c> currentScreenFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> buttonsEnabledFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Amount> amountFlow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<j> selectionFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<PrimaryButton.UIState> customPrimaryButtonUiStateFlow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> cvcCompleteFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onClick;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "Ljn0/h0;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCompleteFlow$$inlined$flatMapLatest$1", f = "PrimaryButtonUiStateMapper.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements q<FlowCollector<? super PrimaryButton.UIState>, Flow<? extends PrimaryButton.UIState>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85362n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f85363o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f85364p;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85362n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f85363o;
                Flow flow = (Flow) this.f85364p;
                this.f85362n = 1;
                if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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

        @Override // wn0.q
        public final Object invoke(FlowCollector<? super PrimaryButton.UIState> flowCollector, Flow<? extends PrimaryButton.UIState> flow, Continuation<? super h0> continuation) {
            a aVar = new a(continuation);
            aVar.f85363o = flowCollector;
            aVar.f85364p = flow;
            return aVar.invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lx70/c;", AnalyticsContext.Screen, "", "buttonsEnabled", "Lw80/b;", "amount", "Lw70/j;", "selection", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "customPrimaryButton", "cvcComplete", "Lkotlinx/coroutines/flow/Flow;", "<anonymous>", "(Lx70/c;ZLw80/b;Lw70/j;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;Z)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCompleteFlow$1", f = "PrimaryButtonUiStateMapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements u<x70.c, Boolean, Amount, j, PrimaryButton.UIState, Boolean, Continuation<? super Flow<? extends PrimaryButton.UIState>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85365n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f85366o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ boolean f85367p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f85368q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f85369r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f85370s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f85371t;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<PrimaryButton.UIState> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f85373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.UIState f85374b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f85375c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Amount f85376d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f85377e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ j f85378f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ x70.c f85379g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f85380h;

            /* JADX INFO: renamed from: k80.c$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class C1816a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f85381a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ PrimaryButton.UIState f85382b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ c f85383c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Amount f85384d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f85385e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ j f85386f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ x70.c f85387g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f85388h;

                /* JADX INFO: renamed from: k80.c$b$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCompleteFlow$1$invokeSuspend$$inlined$map$1$2", f = "PrimaryButtonUiStateMapper.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                public static final class C1817a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f85389n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f85390o;

                    public C1817a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f85389n = obj;
                        this.f85390o |= Integer.MIN_VALUE;
                        return C1816a.this.emit(null, this);
                    }
                }

                public C1816a(FlowCollector flowCollector, PrimaryButton.UIState uIState, c cVar, Amount amount, boolean z11, j jVar, x70.c cVar2, boolean z12) {
                    this.f85381a = flowCollector;
                    this.f85382b = uIState;
                    this.f85383c = cVar;
                    this.f85384d = amount;
                    this.f85385e = z11;
                    this.f85386f = jVar;
                    this.f85387g = cVar2;
                    this.f85388h = z12;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    C1817a c1817a;
                    x30.c cVarE;
                    j jVar;
                    if (continuation instanceof C1817a) {
                        c1817a = (C1817a) continuation;
                        int i11 = c1817a.f85390o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c1817a.f85390o = i11 - Integer.MIN_VALUE;
                        } else {
                            c1817a = new C1817a(continuation);
                        }
                    } else {
                        c1817a = new C1817a(continuation);
                    }
                    Object obj2 = c1817a.f85389n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c1817a.f85390o;
                    if (i12 == 0) {
                        t.b(obj2);
                        FlowCollector flowCollector = this.f85381a;
                        BuyButtonState buyButtonState = (BuyButtonState) obj;
                        PrimaryButton.UIState uIState = this.f85382b;
                        if (uIState == null) {
                            BuyButtonState.BuyButtonOverride buyButtonOverride = buyButtonState.getBuyButtonOverride();
                            if (buyButtonOverride == null || (cVarE = buyButtonOverride.getLabel()) == null) {
                                cVarE = this.f85383c.e(this.f85384d);
                            }
                            wn0.a aVar = this.f85383c.onClick;
                            boolean z11 = this.f85385e && (jVar = this.f85386f) != null && this.f85383c.g(this.f85387g, this.f85388h, jVar);
                            BuyButtonState.BuyButtonOverride buyButtonOverride2 = buyButtonState.getBuyButtonOverride();
                            uIState = new PrimaryButton.UIState(cVarE, aVar, z11, buyButtonOverride2 != null ? buyButtonOverride2.getLockEnabled() : true);
                            if (!buyButtonState.getVisible()) {
                                uIState = null;
                            }
                        }
                        c1817a.f85390o = 1;
                        if (flowCollector.emit(uIState, c1817a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj2);
                    }
                    return h0.f84049a;
                }
            }

            public a(Flow flow, PrimaryButton.UIState uIState, c cVar, Amount amount, boolean z11, j jVar, x70.c cVar2, boolean z12) {
                this.f85373a = flow;
                this.f85374b = uIState;
                this.f85375c = cVar;
                this.f85376d = amount;
                this.f85377e = z11;
                this.f85378f = jVar;
                this.f85379g = cVar2;
                this.f85380h = z12;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super PrimaryButton.UIState> flowCollector, Continuation continuation) {
                Object objCollect = this.f85373a.collect(new C1816a(flowCollector, this.f85374b, this.f85375c, this.f85376d, this.f85377e, this.f85378f, this.f85379g, this.f85380h), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(7, continuation);
        }

        public final Object a(x70.c cVar, boolean z11, Amount amount, j jVar, PrimaryButton.UIState uIState, boolean z12, Continuation<? super Flow<PrimaryButton.UIState>> continuation) {
            b bVar = c.this.new b(continuation);
            bVar.f85366o = cVar;
            bVar.f85367p = z11;
            bVar.f85368q = amount;
            bVar.f85369r = jVar;
            bVar.f85370s = uIState;
            bVar.f85371t = z12;
            return bVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f85365n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            x70.c cVar = (x70.c) this.f85366o;
            boolean z11 = this.f85367p;
            Amount amount = (Amount) this.f85368q;
            j jVar = (j) this.f85369r;
            return new a(cVar.o(), (PrimaryButton.UIState) this.f85370s, c.this, amount, z11, jVar, cVar, this.f85371t);
        }

        @Override // wn0.u
        public /* bridge */ /* synthetic */ Object k(x70.c cVar, Boolean bool, Amount amount, j jVar, PrimaryButton.UIState uIState, Boolean bool2, Continuation<? super Flow<? extends PrimaryButton.UIState>> continuation) {
            return a(cVar, bool.booleanValue(), amount, jVar, uIState, bool2.booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: k80.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lx70/c;", AnalyticsContext.Screen, "", "buttonsEnabled", "Lw70/j;", "selection", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "customPrimaryButton", "<anonymous>", "(Lx70/c;ZLw70/j;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCustomFlow$1", f = "PrimaryButtonUiStateMapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1818c extends SuspendLambda implements s<x70.c, Boolean, j, PrimaryButton.UIState, Continuation<? super PrimaryButton.UIState>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f85393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ boolean f85394p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f85395q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f85396r;

        C1818c(Continuation<? super C1818c> continuation) {
            super(5, continuation);
        }

        public final Object a(x70.c cVar, boolean z11, j jVar, PrimaryButton.UIState uIState, Continuation<? super PrimaryButton.UIState> continuation) {
            C1818c c1818c = c.this.new C1818c(continuation);
            c1818c.f85393o = cVar;
            c1818c.f85394p = z11;
            c1818c.f85395q = jVar;
            c1818c.f85396r = uIState;
            return c1818c.invokeSuspend(h0.f84049a);
        }

        @Override // wn0.s
        public /* bridge */ /* synthetic */ Object d(x70.c cVar, Boolean bool, j jVar, PrimaryButton.UIState uIState, Continuation<? super PrimaryButton.UIState> continuation) {
            return a(cVar, bool.booleanValue(), jVar, uIState, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f85392n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            x70.c cVar = (x70.c) this.f85393o;
            boolean z11 = this.f85394p;
            j jVar = (j) this.f85395q;
            PrimaryButton.UIState uIState = (PrimaryButton.UIState) this.f85396r;
            if (uIState == null) {
                uIState = new PrimaryButton.UIState(c.this.f(), c.this.onClick, z11 && jVar != null, false);
                if (!cVar.getShowsContinueButton() && (jVar == null || !jVar.b())) {
                    return null;
                }
            }
            return uIState;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(y.Configuration config, boolean z11, StateFlow<? extends x70.c> currentScreenFlow, StateFlow<Boolean> buttonsEnabledFlow, StateFlow<Amount> amountFlow, StateFlow<? extends j> selectionFlow, StateFlow<PrimaryButton.UIState> customPrimaryButtonUiStateFlow, StateFlow<Boolean> cvcCompleteFlow, wn0.a<h0> onClick) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(currentScreenFlow, "currentScreenFlow");
        p013kotlin.jvm.internal.s.k(buttonsEnabledFlow, "buttonsEnabledFlow");
        p013kotlin.jvm.internal.s.k(amountFlow, "amountFlow");
        p013kotlin.jvm.internal.s.k(selectionFlow, "selectionFlow");
        p013kotlin.jvm.internal.s.k(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        p013kotlin.jvm.internal.s.k(cvcCompleteFlow, "cvcCompleteFlow");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        this.config = config;
        this.isProcessingPayment = z11;
        this.currentScreenFlow = currentScreenFlow;
        this.buttonsEnabledFlow = buttonsEnabledFlow;
        this.amountFlow = amountFlow;
        this.selectionFlow = selectionFlow;
        this.customPrimaryButtonUiStateFlow = customPrimaryButtonUiStateFlow;
        this.cvcCompleteFlow = cvcCompleteFlow;
        this.onClick = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x30.c e(Amount amount) {
        x30.c cVarA;
        x30.c cVarB;
        String primaryButtonLabel = this.config.getPrimaryButtonLabel();
        if (primaryButtonLabel != null && (cVarB = d.b(primaryButtonLabel)) != null) {
            return cVarB;
        }
        if (this.isProcessingPayment) {
            return (amount == null || (cVarA = amount.a()) == null) ? d.a(x.U) : cVarA;
        }
        return d.a(n.C0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x30.c f() {
        x30.c cVarB;
        String primaryButtonLabel = this.config.getPrimaryButtonLabel();
        return (primaryButtonLabel == null || (cVarB = d.b(primaryButtonLabel)) == null) ? d.a(n.f121526o) : cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(x70.c screen, boolean complete, j selection) {
        PaymentMethod paymentMethod;
        PaymentMethod.p pVar = null;
        x70.c.j jVar = screen instanceof x70.c.j ? (x70.c.j) screen : null;
        if (!((jVar != null ? jVar.getCvcRecollectionState() : null) instanceof x70.c.j.b.C2661b)) {
            return true;
        }
        j.Saved saved = selection instanceof j.Saved ? (j.Saved) selection : null;
        if (saved != null && (paymentMethod = saved.getPaymentMethod()) != null) {
            pVar = paymentMethod.type;
        }
        if (pVar == PaymentMethod.p.Card) {
            return complete;
        }
        return true;
    }

    public final Flow<PrimaryButton.UIState> h() {
        return FlowKt.transformLatest(i80.c.a(this.currentScreenFlow, this.buttonsEnabledFlow, this.amountFlow, this.selectionFlow, this.customPrimaryButtonUiStateFlow, this.cvcCompleteFlow, new b(null)), new a(null));
    }

    public final Flow<PrimaryButton.UIState> i() {
        return FlowKt.combine(this.currentScreenFlow, this.buttonsEnabledFlow, this.selectionFlow, this.customPrimaryButtonUiStateFlow, new C1818c(null));
    }
}
