package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n70.k;
import n70.m;
import p010i90.d0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import u70.FormFieldValues;
import w70.j;
import wn0.l;
import wn0.p;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 J2\u00020\u0001:\u00010B÷\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u000e0\r\u0012\u001c\u0010\u0011\u001a\u0018\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00130\r\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00130\r\u0012\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u001a0\r\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010*R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R*\u0010\u0011\u001a\u0018\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00130\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00130\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00101R$\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u001a0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00101R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010,R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020!0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R \u0010I\u001a\b\u0012\u0004\u0012\u00020!0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lh80/i;", "Lh80/b;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "initiallySelectedPaymentMethodType", "Lkotlinx/coroutines/flow/StateFlow;", "Lw70/j;", "selection", "", "processing", "", "Lt60/g;", "supportedPaymentMethods", "Lkotlin/Function1;", "Ly70/a;", "createFormArguments", "Li90/d0;", "formElementsForCode", "Lkotlin/Function0;", "Ljn0/h0;", "clearErrorMessages", "reportFieldInteraction", "Lkotlin/Function2;", "Lu70/c;", "onFormFieldValuesChanged", "reportPaymentMethodTypeSelected", "Lz70/d;", "createUSBankAccountFormArguments", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "isLiveMode", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Ljava/util/List;Lwn0/l;Lwn0/l;Lwn0/a;Lwn0/l;Lwn0/p;Lwn0/l;Lwn0/l;Lkotlinx/coroutines/CoroutineScope;Z)V", "Lh80/b$a;", "j", "()Lh80/b$a;", "Lh80/b$b;", "viewAction", "a", "(Lh80/b$b;)V", "close", "()V", "Ljava/lang/String;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "e", "Lwn0/l;", "f", "g", "Lwn0/a;", "h", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/p;", "k", "l", "Lkotlinx/coroutines/CoroutineScope;", "m", "Z", "n", "()Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_selectedPaymentMethodCode", "o", "selectedPaymentMethodCode", "p", "_state", "q", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "r", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements p008h80.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f71092s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String initiallySelectedPaymentMethodType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<j> selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> processing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<SupportedPaymentMethod> supportedPaymentMethods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String, FormArguments> createFormArguments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<String, List<d0>> formElementsForCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> clearErrorMessages;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l<String, h0> reportFieldInteraction;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p<FormFieldValues, String, h0> onFormFieldValuesChanged;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l<String, h0> reportPaymentMethodTypeSelected;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l<String, p027z70.d> createUSBankAccountFormArguments;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> _selectedPaymentMethodCode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> selectedPaymentMethodCode;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<p008h80.b.State> _state;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p008h80.b.State> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$1", f = "AddPaymentMethodInteractor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71110n;

        /* JADX INFO: renamed from: h80.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j;", "it", "Ljn0/h0;", "a", "(Lw70/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1495a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f71112a;

            C1495a(i iVar) {
                this.f71112a = iVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, Continuation<? super h0> continuation) {
                this.f71112a.clearErrorMessages.invoke();
                return h0.f84049a;
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
            int i11 = this.f71110n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlow = i.this.selection;
                C1495a c1495a = new C1495a(i.this);
                this.f71110n = 1;
                if (stateFlow.collect(c1495a, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$2", f = "AddPaymentMethodInteractor.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71113n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newSelectedPaymentMethodCode", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f71115a;

            a(i iVar) {
                this.f71115a = iVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super h0> continuation) {
                this.f71115a._state.setValue(p008h80.b.State.b((p008h80.b.State) this.f71115a._state.getValue(), str, null, (FormArguments) this.f71115a.createFormArguments.invoke(str), (List) this.f71115a.formElementsForCode.invoke(str), null, false, (p027z70.d) this.f71115a.createUSBankAccountFormArguments.invoke(str), 50, null));
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f71113n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlow = i.this.selectedPaymentMethodCode;
                a aVar = new a(i.this);
                this.f71113n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$3", f = "AddPaymentMethodInteractor.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71116n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j;", "it", "Ljn0/h0;", "a", "(Lw70/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f71118a;

            a(i iVar) {
                this.f71118a = iVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, Continuation<? super h0> continuation) {
                this.f71118a._state.setValue(p008h80.b.State.b((p008h80.b.State) this.f71118a._state.getValue(), null, null, null, null, jVar, false, null, 111, null));
                return h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f71116n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlow = i.this.selection;
                a aVar = new a(i.this);
                this.f71116n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor$4", f = "AddPaymentMethodInteractor.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71119n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f71121a;

            a(i iVar) {
                this.f71121a = iVar;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                this.f71121a._state.setValue(p008h80.b.State.b((p008h80.b.State) this.f71121a._state.getValue(), null, null, null, null, null, z11, null, 95, null));
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f71119n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlow = i.this.processing;
                a aVar = new a(i.this);
                this.f71119n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: h80.i$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh80/i$e;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "Lh80/b;", "a", "(Lk80/a;Lu60/e;)Lh80/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: h80.i$e$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements l<String, FormArguments> {
            a(Object obj) {
                super(1, obj, k.class, "createFormArguments", "createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final FormArguments invoke(String p11) {
                s.k(p11, "p0");
                return ((k) this.receiver).a(p11);
            }
        }

        /* JADX INFO: renamed from: h80.i$e$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements l<String, List<? extends d0>> {
            b(Object obj) {
                super(1, obj, k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final List<d0> invoke(String p11) {
                s.k(p11, "p0");
                return ((k) this.receiver).b(p11);
            }
        }

        /* JADX INFO: renamed from: h80.i$e$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
            c(Object obj) {
                super(0, obj, k80.a.class, "clearErrorMessages", "clearErrorMessages()V", 0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                o();
                return h0.f84049a;
            }

            public final void o() {
                ((k80.a) this.receiver).f();
            }
        }

        /* JADX INFO: renamed from: h80.i$e$d */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class d extends p013kotlin.jvm.internal.p implements l<String, h0> {
            d(Object obj) {
                super(1, obj, q70.a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                o(str);
                return h0.f84049a;
            }

            public final void o(String p11) {
                s.k(p11, "p0");
                ((q70.a) this.receiver).f(p11);
            }
        }

        /* JADX INFO: renamed from: h80.i$e$e, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1496e extends p013kotlin.jvm.internal.p implements p<FormFieldValues, String, h0> {
            C1496e(Object obj) {
                super(2, obj, k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void a(FormFieldValues formFieldValues, String p11) {
                s.k(p11, "p1");
                ((k) this.receiver).c(formFieldValues, p11);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(FormFieldValues formFieldValues, String str) {
                a(formFieldValues, str);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: h80.i$e$f */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class f extends p013kotlin.jvm.internal.p implements l<String, h0> {
            f(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                o(str);
                return h0.f84049a;
            }

            public final void o(String p11) {
                s.k(p11, "p0");
                ((EventReporter) this.receiver).q(p11);
            }
        }

        /* JADX INFO: renamed from: h80.i$e$g */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/PaymentMethodCode;", "it", "Lz70/d;", "a", "(Ljava/lang/String;)Lz70/d;"}, k = 3, mv = {1, 9, 0})
        static final class g extends u implements l<String, p027z70.d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f71122c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ PaymentMethodMetadata f71123d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(k80.a aVar, PaymentMethodMetadata paymentMethodMetadata) {
                super(1);
                this.f71122c = aVar;
                this.f71123d = paymentMethodMetadata;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p027z70.d invoke(String it) {
                s.k(it, "it");
                return p027z70.d.INSTANCE.a(this.f71122c, this.f71123d, "payment_element", it);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p008h80.b a(k80.a viewModel, PaymentMethodMetadata paymentMethodMetadata) {
            s.k(viewModel, "viewModel");
            s.k(paymentMethodMetadata, "paymentMethodMetadata");
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            k kVarA = k.INSTANCE.a(viewModel, m.INSTANCE.a(viewModel, CoroutineScope), paymentMethodMetadata);
            return new i(viewModel.s(), viewModel.C(), viewModel.z(), paymentMethodMetadata.E(), new a(kVarA), new b(kVarA), new c(viewModel), new d(viewModel.getAnalyticsListener()), new C1496e(kVarA), new f(viewModel.getEventReporter()), new g(viewModel, paymentMethodMetadata), CoroutineScope, paymentMethodMetadata.getStripeIntent().getIsLiveMode());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(String initiallySelectedPaymentMethodType, StateFlow<? extends j> selection, StateFlow<Boolean> processing, List<SupportedPaymentMethod> supportedPaymentMethods, l<? super String, FormArguments> createFormArguments, l<? super String, ? extends List<? extends d0>> formElementsForCode, wn0.a<h0> clearErrorMessages, l<? super String, h0> reportFieldInteraction, p<? super FormFieldValues, ? super String, h0> onFormFieldValuesChanged, l<? super String, h0> reportPaymentMethodTypeSelected, l<? super String, p027z70.d> createUSBankAccountFormArguments, CoroutineScope coroutineScope, boolean z11) {
        s.k(initiallySelectedPaymentMethodType, "initiallySelectedPaymentMethodType");
        s.k(selection, "selection");
        s.k(processing, "processing");
        s.k(supportedPaymentMethods, "supportedPaymentMethods");
        s.k(createFormArguments, "createFormArguments");
        s.k(formElementsForCode, "formElementsForCode");
        s.k(clearErrorMessages, "clearErrorMessages");
        s.k(reportFieldInteraction, "reportFieldInteraction");
        s.k(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        s.k(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        s.k(createUSBankAccountFormArguments, "createUSBankAccountFormArguments");
        s.k(coroutineScope, "coroutineScope");
        this.initiallySelectedPaymentMethodType = initiallySelectedPaymentMethodType;
        this.selection = selection;
        this.processing = processing;
        this.supportedPaymentMethods = supportedPaymentMethods;
        this.createFormArguments = createFormArguments;
        this.formElementsForCode = formElementsForCode;
        this.clearErrorMessages = clearErrorMessages;
        this.reportFieldInteraction = reportFieldInteraction;
        this.onFormFieldValuesChanged = onFormFieldValuesChanged;
        this.reportPaymentMethodTypeSelected = reportPaymentMethodTypeSelected;
        this.createUSBankAccountFormArguments = createUSBankAccountFormArguments;
        this.coroutineScope = coroutineScope;
        this.isLiveMode = z11;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(initiallySelectedPaymentMethodType);
        this._selectedPaymentMethodCode = MutableStateFlow;
        this.selectedPaymentMethodCode = MutableStateFlow;
        MutableStateFlow<p008h80.b.State> MutableStateFlow2 = StateFlowKt.MutableStateFlow(j());
        this._state = MutableStateFlow2;
        this.state = MutableStateFlow2;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new d(null), 3, null);
    }

    private final p008h80.b.State j() {
        String value = this.selectedPaymentMethodCode.getValue();
        return new p008h80.b.State(value, this.supportedPaymentMethods, this.createFormArguments.invoke(value), this.formElementsForCode.invoke(value), this.selection.getValue(), this.processing.getValue().booleanValue(), this.createUSBankAccountFormArguments.invoke(value));
    }

    @Override // p008h80.b
    public void a(p008h80.b.AbstractC1489b viewAction) {
        s.k(viewAction, "viewAction");
        if (viewAction instanceof p008h80.b.AbstractC1489b.ReportFieldInteraction) {
            this.reportFieldInteraction.invoke(((p008h80.b.AbstractC1489b.ReportFieldInteraction) viewAction).getCode());
            return;
        }
        if (viewAction instanceof p008h80.b.AbstractC1489b.OnFormFieldValuesChanged) {
            p008h80.b.AbstractC1489b.OnFormFieldValuesChanged onFormFieldValuesChanged = (p008h80.b.AbstractC1489b.OnFormFieldValuesChanged) viewAction;
            this.onFormFieldValuesChanged.invoke(onFormFieldValuesChanged.getFormValues(), onFormFieldValuesChanged.getSelectedPaymentMethodCode());
        } else if (viewAction instanceof p008h80.b.AbstractC1489b.OnPaymentMethodSelected) {
            p008h80.b.AbstractC1489b.OnPaymentMethodSelected onPaymentMethodSelected = (p008h80.b.AbstractC1489b.OnPaymentMethodSelected) viewAction;
            if (s.f(this.selectedPaymentMethodCode.getValue(), onPaymentMethodSelected.getCode())) {
                return;
            }
            this._selectedPaymentMethodCode.setValue(onPaymentMethodSelected.getCode());
            this.reportPaymentMethodTypeSelected.invoke(onPaymentMethodSelected.getCode());
        }
    }

    @Override // p008h80.b
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    @Override // p008h80.b
    public StateFlow<p008h80.b.State> getState() {
        return this.state;
    }

    @Override // p008h80.b
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }
}
