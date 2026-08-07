package kf;

import androidx.p003lifecycle.s0;
import be.h;
import ce.t;
import ce.u;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0012*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0018B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020,0\r8\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u0010)R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b-\u0010)¨\u00065"}, d2 = {"Lkf/o;", "Lbe/h;", "ComponentStateT", "Lce/t;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Ljn0/h0;", "j", "()V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/Flow;", "componentStateFlow", "g", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;)V", "state", IntegerTokenConverter.CONVERTER_KEY, "(Lbe/h;)V", "", "isInteractionBlocked", "m", "(Z)V", "a", "Landroidx/lifecycle/s0;", "k", "()Landroidx/lifecycle/s0;", "<set-?>", "b", "Lce/u;", "h", "()Ljava/lang/Boolean;", "l", "(Ljava/lang/Boolean;)V", "Lkotlinx/coroutines/channels/Channel;", "c", "Lkotlinx/coroutines/channels/Channel;", "submitChannel", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "submitFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkf/j;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiStateFlow", "f", "uiStateFlow", "Lkf/i;", "uiEventChannel", "uiEventFlow", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o<ComponentStateT extends be.h<?>> implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u isInteractionBlocked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Channel<ComponentStateT> submitChannel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Flow<ComponentStateT> submitFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<j> _uiStateFlow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Flow<j> uiStateFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Channel<i> uiEventChannel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Flow<i> uiEventFlow;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f86023j = {o0.f(new z(o.class, "isInteractionBlocked", "isInteractionBlocked()Ljava/lang/Boolean;", 0))};

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"Lbe/h;", "ComponentStateT", "state", "Ljn0/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.ui.SubmitHandler$initialize$2", f = "SubmitHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<ComponentStateT, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86032n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f86033o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ o<ComponentStateT> f86034p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o<ComponentStateT> oVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f86034p = oVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ComponentStateT componentstatet, Continuation<? super h0> continuation) {
            return ((b) create(componentstatet, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f86034p, continuation);
            bVar.f86033o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f86032n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            be.h hVar = (be.h) this.f86033o;
            if (p013kotlin.jvm.internal.s.f((j) ((o) this.f86034p)._uiStateFlow.getValue(), j.c.f86015a)) {
                if (hVar.isValid()) {
                    ((o) this.f86034p).submitChannel.mo85trySendJP2dKIU(hVar);
                }
                this.f86034p.j();
            }
            return h0.f84049a;
        }
    }

    public o(s0 savedStateHandle) {
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.isInteractionBlocked = new u("IS_INTERACTION_BLOCKED");
        Channel<ComponentStateT> channelA = le.b.a();
        this.submitChannel = channelA;
        this.submitFlow = FlowKt.receiveAsFlow(channelA);
        MutableStateFlow<j> MutableStateFlow = StateFlowKt.MutableStateFlow(j.b.f86014a);
        this._uiStateFlow = MutableStateFlow;
        this.uiStateFlow = MutableStateFlow;
        Channel<i> channelA2 = le.b.a();
        this.uiEventChannel = channelA2;
        this.uiEventFlow = FlowKt.receiveAsFlow(channelA2);
    }

    private final Boolean h() {
        return (Boolean) this.isInteractionBlocked.getValue(this, f86023j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        j jVar;
        Boolean boolH = h();
        if (boolH == null) {
            jVar = j.b.f86014a;
        } else if (p013kotlin.jvm.internal.s.f(boolH, Boolean.TRUE)) {
            jVar = j.a.f86013a;
        } else {
            if (!p013kotlin.jvm.internal.s.f(boolH, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = j.b.f86014a;
        }
        this._uiStateFlow.tryEmit(jVar);
    }

    private final void l(Boolean bool) {
        this.isInteractionBlocked.setValue(this, f86023j[0], bool);
    }

    public final Flow<ComponentStateT> d() {
        return this.submitFlow;
    }

    public final Flow<i> e() {
        return this.uiEventFlow;
    }

    public final Flow<j> f() {
        return this.uiStateFlow;
    }

    public final void g(CoroutineScope coroutineScope, Flow<? extends ComponentStateT> componentStateFlow) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(componentStateFlow, "componentStateFlow");
        Boolean boolH = h();
        if (boolH != null) {
            m(boolH.booleanValue());
        }
        FlowKt.launchIn(FlowKt.onEach(componentStateFlow, new b(this, null)), coroutineScope);
    }

    public final void i(ComponentStateT state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!state.getIsInputValid()) {
            this.uiEventChannel.mo85trySendJP2dKIU(i.a.f86012a);
            return;
        }
        if (state.isValid()) {
            this.submitChannel.mo85trySendJP2dKIU(state);
        } else if (state.getIsReady()) {
            j();
        } else {
            this._uiStateFlow.tryEmit(j.c.f86015a);
        }
    }

    @Override // ce.t
    /* JADX INFO: renamed from: k, reason: from getter */
    public s0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final void m(boolean isInteractionBlocked) {
        l(Boolean.valueOf(isInteractionBlocked));
        j();
    }
}
