package c80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0012\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u0015\u0010 ¨\u0006%"}, d2 = {"Lc80/i;", "Lc80/e;", "", "lastFour", "Lcom/stripe/android/model/h;", "cardBrand", "cvc", "", "isTestMode", "Lkotlinx/coroutines/flow/StateFlow;", "processing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/h;Ljava/lang/String;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V", "Ljn0/h0;", "b", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "Lcom/stripe/android/model/h;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lc80/g;", "f", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_viewState", "g", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "Lc80/c;", "h", "cvcCompletionState", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String lastFour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.model.h cardBrand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String cvc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isTestMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> processing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<CvcRecollectionViewState> _viewState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<CvcRecollectionViewState> viewState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c80.c> cvcCompletionState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionInteractor$1", f = "CvcRecollectionInteractor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18955n;

        /* JADX INFO: renamed from: c80.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "processing", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C0386a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f18957a;

            C0386a(i iVar) {
                this.f18957a = iVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                Object value;
                MutableStateFlow mutableStateFlow = this.f18957a._viewState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, CvcRecollectionViewState.b((CvcRecollectionViewState) value, null, false, null, !z11, 7, null)));
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18955n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlow = i.this.processing;
                C0386a c0386a = new C0386a(i.this);
                this.f18955n = 1;
                if (stateFlow.collect(c0386a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc80/i$b;", "Lc80/e$a;", "<init>", "()V", "Lc80/a;", "args", "Lkotlinx/coroutines/flow/StateFlow;", "", "processing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lc80/e;", "a", "(Lc80/a;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)Lc80/e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18958a = new b();

        private b() {
        }

        @Override // c80.e.a
        public e a(Args args, StateFlow<Boolean> processing, CoroutineScope coroutineScope) {
            s.k(args, "args");
            s.k(processing, "processing");
            s.k(coroutineScope, "coroutineScope");
            return new i(args.getLastFour(), args.getCardBrand(), args.getCvc(), args.getIsTestMode(), processing, coroutineScope);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc80/g;", "state", "Lc80/c;", "a", "(Lc80/g;)Lc80/c;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<CvcRecollectionViewState, c80.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f18959c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c80.c invoke(CvcRecollectionViewState state) {
            s.k(state, "state");
            return state.getCvcState().getIsValid() ? new c80.c.Completed(state.getCvcState().getCvc()) : c80.c.b.f18933a;
        }
    }

    public i(String lastFour, com.stripe.android.model.h cardBrand, String cvc, boolean z11, StateFlow<Boolean> processing, CoroutineScope coroutineScope) {
        s.k(lastFour, "lastFour");
        s.k(cardBrand, "cardBrand");
        s.k(cvc, "cvc");
        s.k(processing, "processing");
        s.k(coroutineScope, "coroutineScope");
        this.lastFour = lastFour;
        this.cardBrand = cardBrand;
        this.cvc = cvc;
        this.isTestMode = z11;
        this.processing = processing;
        MutableStateFlow<CvcRecollectionViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(new CvcRecollectionViewState(lastFour, z11, new CvcState(cvc, cardBrand), !processing.getValue().booleanValue()));
        this._viewState = MutableStateFlow;
        this.viewState = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(null), 3, null);
        this.cvcCompletionState = r90.g.m(MutableStateFlow, c.f18959c);
    }

    @Override // c80.e
    public StateFlow<CvcRecollectionViewState> a() {
        return this.viewState;
    }

    @Override // c80.e
    public void b(String cvc) {
        CvcRecollectionViewState value;
        CvcRecollectionViewState cvcRecollectionViewState;
        s.k(cvc, "cvc");
        MutableStateFlow<CvcRecollectionViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
            cvcRecollectionViewState = value;
        } while (!mutableStateFlow.compareAndSet(value, CvcRecollectionViewState.b(cvcRecollectionViewState, null, false, cvcRecollectionViewState.getCvcState().f(cvc), false, 11, null)));
    }

    @Override // c80.e
    public StateFlow<c80.c> c() {
        return this.cvcCompletionState;
    }
}
