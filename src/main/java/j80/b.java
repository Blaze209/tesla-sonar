package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import n70.DisplayableSavedPaymentMethod;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001/Bé\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R(\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0004\u0012\u00020\u00140\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00104R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010AR \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010,R \u0010I\u001a\b\u0012\u0004\u0012\u00020E0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lj80/b;", "Lj80/i;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "Lu60/e;", "paymentMethodMetadata", "Lw70/j;", "selection", "", "editing", "canRemove", "canEdit", "Lkotlin/Function0;", "Ljn0/h0;", "toggleEdit", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "providePaymentMethodName", "Ln70/g;", "onSelectPaymentMethod", "onDeletePaymentMethod", "onEditPaymentMethod", "navigateBack", "isLiveMode", "Lkotlin/coroutines/CoroutineContext;", "dispatcher", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lu60/e;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/a;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;ZLkotlin/coroutines/CoroutineContext;)V", "paymentMethod", "g", "(Ln70/g;)V", "withDelay", "h", "(Z)V", "Lj80/i$b;", "viewAction", "a", "(Lj80/i$b;)V", "close", "()V", "Lkotlinx/coroutines/flow/StateFlow;", "b", "Lu60/e;", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lwn0/a;", "Lwn0/l;", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "Z", "n", "()Z", "Lkotlinx/coroutines/CoroutineScope;", "m", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasNavigatedBack", "o", "displayableSavedPaymentMethods", "Lj80/i$a;", "p", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "q", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements i {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f82810r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<PaymentMethod>> paymentMethods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethodMetadata paymentMethodMetadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w70.j> selection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> editing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> canEdit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> toggleEdit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, x30.c> providePaymentMethodName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<DisplayableSavedPaymentMethod, h0> onSelectPaymentMethod;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<DisplayableSavedPaymentMethod, h0> onDeletePaymentMethod;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<DisplayableSavedPaymentMethod, h0> onEditPaymentMethod;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Boolean, h0> navigateBack;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean hasNavigatedBack;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<DisplayableSavedPaymentMethod>> displayableSavedPaymentMethods;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<i.State> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$1", f = "ManageScreenInteractor.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82827n;

        /* JADX INFO: renamed from: j80.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj80/i$a;", "state", "Ljn0/h0;", "a", "(Lj80/i$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1734a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f82829a;

            C1734a(b bVar) {
                this.f82829a = bVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.State state, Continuation<? super h0> continuation) {
                if (!state.getIsEditing() && !state.getCanEdit() && state.d().size() == 1) {
                    this.f82829a.g((DisplayableSavedPaymentMethod) v.o0(state.d()));
                }
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f82827n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<i.State> state = b.this.getState();
                C1734a c1734a = new C1734a(b.this);
                this.f82827n = 1;
                if (state.collect(c1734a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: j80.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$2", f = "ManageScreenInteractor.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    static final class C1735b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82830n;

        /* JADX INFO: renamed from: j80.b$b$a */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "Ljn0/h0;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f82832a;

            a(b bVar) {
                this.f82832a = bVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<PaymentMethod> list, Continuation<? super h0> continuation) {
                if (list.isEmpty()) {
                    this.f82832a.h(false);
                }
                return h0.f84049a;
            }
        }

        C1735b(Continuation<? super C1735b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new C1735b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f82830n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = b.this.paymentMethods;
                a aVar = new a(b.this);
                this.f82830n = 1;
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
            return ((C1735b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: j80.b$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj80/b$c;", "", "<init>", "()V", "Lw70/j;", "selection", "", "Ln70/g;", "displayableSavedPaymentMethods", "c", "(Lw70/j;Ljava/util/List;)Ln70/g;", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "Ln70/b;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/f0;", "savedPaymentMethodMutator", "Lj80/i;", "b", "(Lk80/a;Lu60/e;Ln70/b;Lcom/stripe/android/paymentsheet/f0;)Lj80/i;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j80.b$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
            a(Object obj) {
                super(0, obj, f0.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                o();
                return h0.f84049a;
            }

            public final void o() {
                ((f0) this.receiver).x();
            }
        }

        /* JADX INFO: renamed from: j80.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "it", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1736b extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82833c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1736b(k80.a aVar) {
                super(1);
                this.f82833c = aVar;
            }

            public final void a(DisplayableSavedPaymentMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                w70.j.Saved saved = new w70.j.Saved(it.getPaymentMethod(), null, null, 6, null);
                this.f82833c.Q(saved);
                this.f82833c.getEventReporter().h(saved);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "it", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1737c extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f0 f82834c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1737c(f0 f0Var) {
                super(1);
                this.f82834c = f0Var;
            }

            public final void a(DisplayableSavedPaymentMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f82834c.u(it.getPaymentMethod());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.b$c$d */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "it", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f0 f82835c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(f0 f0Var) {
                super(1);
                this.f82835c = f0Var;
            }

            public final void a(DisplayableSavedPaymentMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f82835c.s(it.getPaymentMethod());
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.b$c$e */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "withDelay", "Ljn0/h0;", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
        static final class e extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82836c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(k80.a aVar) {
                super(1);
                this.f82836c = aVar;
            }

            public final void a(boolean z11) {
                if (z11) {
                    this.f82836c.getNavigationHandler().k();
                } else {
                    this.f82836c.getNavigationHandler().i();
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Boolean bool) {
                a(bool.booleanValue());
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DisplayableSavedPaymentMethod c(w70.j selection, List<DisplayableSavedPaymentMethod> displayableSavedPaymentMethods) {
            Object obj = null;
            if (selection == null ? true : selection instanceof w70.j.ExternalPaymentMethod ? true : p013kotlin.jvm.internal.s.f(selection, w70.j.c.f121146b) ? true : p013kotlin.jvm.internal.s.f(selection, w70.j.d.f121147b) ? true : selection instanceof w70.j.e) {
                return null;
            }
            if (!(selection instanceof w70.j.Saved)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((w70.j.Saved) selection).getPaymentMethod().id;
            for (Object obj2 : displayableSavedPaymentMethods) {
                if (p013kotlin.jvm.internal.s.f(((DisplayableSavedPaymentMethod) obj2).getPaymentMethod().id, str)) {
                    obj = obj2;
                    break;
                }
            }
            return (DisplayableSavedPaymentMethod) obj;
        }

        public final i b(k80.a viewModel, PaymentMethodMetadata paymentMethodMetadata, n70.b customerStateHolder, f0 savedPaymentMethodMutator) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
            p013kotlin.jvm.internal.s.k(customerStateHolder, "customerStateHolder");
            p013kotlin.jvm.internal.s.k(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            StateFlow<List<PaymentMethod>> stateFlowC = customerStateHolder.c();
            StateFlow<w70.j> stateFlowC2 = viewModel.C();
            StateFlow<Boolean> stateFlowN = savedPaymentMethodMutator.n();
            StateFlow<Boolean> stateFlowL = savedPaymentMethodMutator.l();
            return new b(stateFlowC, paymentMethodMetadata, stateFlowC2, stateFlowN, savedPaymentMethodMutator.m(), stateFlowL, new a(savedPaymentMethodMutator), savedPaymentMethodMutator.q(), new C1736b(viewModel), new C1737c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.getStripeIntent().getIsLiveMode(), null, PKIFailureInfo.certRevoked, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "Ln70/g;", "a", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends PaymentMethod>, List<? extends DisplayableSavedPaymentMethod>> {
        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<DisplayableSavedPaymentMethod> invoke(List<PaymentMethod> paymentMethods) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            List<PaymentMethod> list = paymentMethods;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q.a((PaymentMethod) it.next(), bVar.providePaymentMethodName, bVar.paymentMethodMetadata));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Ln70/g;", "displayablePaymentMethods", "Lw70/j;", "paymentSelection", "", "editing", "canRemove", "canEdit", "Lj80/i$a;", "a", "(Ljava/util/List;Lw70/j;ZZZ)Lj80/i$a;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.s<List<? extends DisplayableSavedPaymentMethod>, w70.j, Boolean, Boolean, Boolean, i.State> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f82838c = new e();

        e() {
            super(5);
        }

        public final i.State a(List<DisplayableSavedPaymentMethod> displayablePaymentMethods, w70.j jVar, boolean z11, boolean z12, boolean z13) {
            p013kotlin.jvm.internal.s.k(displayablePaymentMethods, "displayablePaymentMethods");
            return new i.State(displayablePaymentMethods, z11 ? null : b.INSTANCE.c(jVar, displayablePaymentMethods), z11, z12, z13);
        }

        @Override // wn0.s
        public /* bridge */ /* synthetic */ i.State d(List<? extends DisplayableSavedPaymentMethod> list, w70.j jVar, Boolean bool, Boolean bool2, Boolean bool3) {
            return a(list, jVar, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(StateFlow<? extends List<PaymentMethod>> paymentMethods, PaymentMethodMetadata paymentMethodMetadata, StateFlow<? extends w70.j> selection, StateFlow<Boolean> editing, StateFlow<Boolean> canRemove, StateFlow<Boolean> canEdit, wn0.a<h0> toggleEdit, wn0.l<? super String, ? extends x30.c> providePaymentMethodName, wn0.l<? super DisplayableSavedPaymentMethod, h0> onSelectPaymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> onDeletePaymentMethod, wn0.l<? super DisplayableSavedPaymentMethod, h0> onEditPaymentMethod, wn0.l<? super Boolean, h0> navigateBack, boolean z11, CoroutineContext dispatcher) {
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        p013kotlin.jvm.internal.s.k(editing, "editing");
        p013kotlin.jvm.internal.s.k(canRemove, "canRemove");
        p013kotlin.jvm.internal.s.k(canEdit, "canEdit");
        p013kotlin.jvm.internal.s.k(toggleEdit, "toggleEdit");
        p013kotlin.jvm.internal.s.k(providePaymentMethodName, "providePaymentMethodName");
        p013kotlin.jvm.internal.s.k(onSelectPaymentMethod, "onSelectPaymentMethod");
        p013kotlin.jvm.internal.s.k(onDeletePaymentMethod, "onDeletePaymentMethod");
        p013kotlin.jvm.internal.s.k(onEditPaymentMethod, "onEditPaymentMethod");
        p013kotlin.jvm.internal.s.k(navigateBack, "navigateBack");
        p013kotlin.jvm.internal.s.k(dispatcher, "dispatcher");
        this.paymentMethods = paymentMethods;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.selection = selection;
        this.editing = editing;
        this.canEdit = canEdit;
        this.toggleEdit = toggleEdit;
        this.providePaymentMethodName = providePaymentMethodName;
        this.onSelectPaymentMethod = onSelectPaymentMethod;
        this.onDeletePaymentMethod = onDeletePaymentMethod;
        this.onEditPaymentMethod = onEditPaymentMethod;
        this.navigateBack = navigateBack;
        this.isLiveMode = z11;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.coroutineScope = CoroutineScope;
        this.hasNavigatedBack = new AtomicBoolean(false);
        StateFlow<List<DisplayableSavedPaymentMethod>> stateFlowM = r90.g.m(paymentMethods, new d());
        this.displayableSavedPaymentMethods = stateFlowM;
        this.state = r90.g.e(stateFlowM, selection, editing, canRemove, canEdit, e.f82838c);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C1735b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(DisplayableSavedPaymentMethod paymentMethod) {
        this.onSelectPaymentMethod.invoke(paymentMethod);
        h(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean withDelay) {
        if (this.hasNavigatedBack.getAndSet(true)) {
            return;
        }
        this.navigateBack.invoke(Boolean.valueOf(withDelay));
    }

    @Override // j80.i
    public void a(i.b viewAction) {
        p013kotlin.jvm.internal.s.k(viewAction, "viewAction");
        if (viewAction instanceof i.b.SelectPaymentMethod) {
            g(((i.b.SelectPaymentMethod) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof i.b.DeletePaymentMethod) {
            this.onDeletePaymentMethod.invoke(((i.b.DeletePaymentMethod) viewAction).getPaymentMethod());
        } else if (viewAction instanceof i.b.EditPaymentMethod) {
            this.onEditPaymentMethod.invoke(((i.b.EditPaymentMethod) viewAction).getPaymentMethod());
        } else if (p013kotlin.jvm.internal.s.f(viewAction, i.b.d.f82957a)) {
            this.toggleEdit.invoke();
        }
    }

    @Override // j80.i
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    @Override // j80.i
    public StateFlow<i.State> getState() {
        return this.state;
    }

    @Override // j80.i
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    public /* synthetic */ b(StateFlow stateFlow, PaymentMethodMetadata paymentMethodMetadata, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, StateFlow stateFlow5, wn0.a aVar, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.l lVar4, wn0.l lVar5, boolean z11, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateFlow, paymentMethodMetadata, stateFlow2, stateFlow3, stateFlow4, stateFlow5, aVar, lVar, lVar2, lVar3, lVar4, lVar5, z11, (i11 & PKIFailureInfo.certRevoked) != 0 ? Dispatchers.getDefault() : coroutineContext);
    }
}
