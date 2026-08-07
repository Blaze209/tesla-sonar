package r90;

import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.List;
import jn0.t;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@jn0.e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0097@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lr90/e;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", AnalyticsContext.Flow, "Lkotlin/Function0;", "produceValue", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lwn0/a;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/flow/Flow;", "b", "Lwn0/a;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "value", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e<T> implements StateFlow<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Flow<T> flow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<T> produceValue;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.utils.FlowToStateFlow", f = "StateFlows.kt", i = {0}, l = {44}, m = "collect", n = {"collectorJob"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f107383n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f107384o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ e<T> f107385p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f107386q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f107385p = eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f107384o = obj;
            this.f107386q |= Integer.MIN_VALUE;
            return this.f107385p.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Flow<? extends T> flow, wn0.a<? extends T> produceValue) {
        s.k(flow, "flow");
        s.k(produceValue, "produceValue");
        this.flow = flow;
        this.produceValue = produceValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @InternalCoroutinesApi
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        a aVar;
        Job job;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f107386q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f107386q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.f107384o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f107386q;
        if (i12 == 0) {
            t.b(obj);
            Job job2 = (Job) aVar.getContext().get(Job.INSTANCE);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.flow);
            aVar.f107383n = job2;
            aVar.f107386q = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            job = job2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) aVar.f107383n;
            t.b(obj);
        }
        while (true) {
            if (job != null) {
                JobKt.ensureActive(job);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return v.e(getValue());
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        return this.produceValue.invoke();
    }
}
