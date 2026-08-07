package kotlinx.coroutines.reactive;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.e;
import jn0.g;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.CancellableKt;
import nr0.c;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u000b\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004R\u0019\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/reactive/FlowSubscription;", "T", "Lnr0/c;", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljn0/h0;", "Lkotlinx/coroutines/flow/Flow;", AnalyticsContext.Flow, "Lnr0/b;", "subscriber", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlinx/coroutines/flow/Flow;Lnr0/b;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/Continuation;", "createInitialContinuation", "()Lkotlin/coroutines/Continuation;", "flowProcessing", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeFlow", "cancel", "()V", "", "n", "request", "(J)V", "Lkotlinx/coroutines/flow/Flow;", "Lnr0/b;", "", "cancellationRequested", "Z", "Lkotlinx/atomicfu/AtomicLong;", "requested", "Lkotlinx/atomicfu/AtomicRef;", "producer", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlowSubscription<T> extends AbstractCoroutine<h0> implements c {
    private volatile boolean cancellationRequested;
    public final Flow<T> flow;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;
    public final nr0.b<? super T> subscriber;
    private static final /* synthetic */ AtomicLongFieldUpdater requested$volatile$FU = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater producer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "flowProcessing", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowSubscription<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FlowSubscription<T> flowSubscription, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = flowSubscription;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.flowProcessing(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowSubscription(Flow<? extends T> flow, nr0.b<? super T> bVar, CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.flow = flow;
        this.subscriber = bVar;
        this.producer$volatile = createInitialContinuation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object consumeFlow(Continuation<? super h0> continuation) {
        Object objCollect = this.flow.collect(new FlowCollector(this) { // from class: kotlinx.coroutines.reactive.FlowSubscription.consumeFlow.2
            final /* synthetic */ FlowSubscription<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t11, Continuation<? super h0> continuation2) {
                this.this$0.subscriber.onNext(t11);
                if (FlowSubscription.getRequested$volatile$FU().decrementAndGet(this.this$0) > 0) {
                    JobKt.ensureActive(this.this$0.getCoroutineContext());
                    return h0.f84049a;
                }
                FlowSubscription<T> flowSubscription = this.this$0;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation2), 1);
                cancellableContinuationImpl.initCancellability();
                FlowSubscription.getProducer$volatile$FU().set(flowSubscription, cancellableContinuationImpl);
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation2);
                }
                return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    private final Continuation<h0> createInitialContinuation() {
        final CoroutineContext coroutineContext = getCoroutineContext();
        return new Continuation<h0>() { // from class: kotlinx.coroutines.reactive.FlowSubscription$createInitialContinuation$$inlined$Continuation$1
            @Override // p013kotlin.coroutines.Continuation
            /* JADX INFO: renamed from: getContext, reason: from getter */
            public CoroutineContext get$context() {
                return coroutineContext;
            }

            @Override // p013kotlin.coroutines.Continuation
            public void resumeWith(Object result) throws Throwable {
                CancellableKt.startCoroutineCancellable(new FlowSubscription$createInitialContinuation$1$1(this), this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object flowProcessing(Continuation<? super h0> continuation) {
        AnonymousClass1 anonymousClass1;
        FlowSubscription flowSubscription;
        FlowSubscription flowSubscription2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(obj);
            try {
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                if (consumeFlow(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowSubscription2 = this;
                flowSubscription2.subscriber.onComplete();
                return h0.f84049a;
            } catch (Throwable th2) {
                th = th2;
                flowSubscription = this;
                if (flowSubscription.cancellationRequested || flowSubscription.isActive() || th != flowSubscription.getCancellationException()) {
                    flowSubscription.subscriber.onError(th);
                }
                return h0.f84049a;
            }
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        flowSubscription = (FlowSubscription) anonymousClass1.L$0;
        try {
            t.b(obj);
            flowSubscription2 = flowSubscription;
            try {
                flowSubscription2.subscriber.onComplete();
            } catch (Throwable th3) {
                CoroutineExceptionHandlerKt.handleCoroutineException(flowSubscription2.getCoroutineContext(), th3);
            }
            return h0.f84049a;
        } catch (Throwable th4) {
            th = th4;
            if (flowSubscription.cancellationRequested) {
                try {
                    flowSubscription.subscriber.onError(th);
                } catch (Throwable th5) {
                    g.a(th, th5);
                    CoroutineExceptionHandlerKt.handleCoroutineException(flowSubscription.getCoroutineContext(), th);
                }
            } else {
                flowSubscription.subscriber.onError(th);
            }
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ long getAndUpdate$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l<? super Long, Long> lVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
        while (true) {
            long j11 = atomicLongFieldUpdater2.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            Object obj2 = obj;
            if (atomicLongFieldUpdater3.compareAndSet(obj2, j11, lVar.invoke(Long.valueOf(j11)).longValue())) {
                return j11;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            obj = obj2;
        }
    }

    private final /* synthetic */ Object getProducer$volatile() {
        return this.producer$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getProducer$volatile$FU() {
        return producer$volatile$FU;
    }

    private final /* synthetic */ long getRequested$volatile() {
        return this.requested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getRequested$volatile$FU() {
        return requested$volatile$FU;
    }

    private final /* synthetic */ void setProducer$volatile(Object obj) {
        this.producer$volatile = obj;
    }

    private final /* synthetic */ void setRequested$volatile(long j11) {
        this.requested$volatile = j11;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @e
    public /* synthetic */ void cancel() throws Throwable {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // nr0.c
    public void request(long n11) {
        long j11;
        long j12;
        Continuation continuation;
        if (n11 <= 0) {
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = requested$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = j11 + n11;
            if (j12 <= 0) {
                j12 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        if (j11 <= 0) {
            do {
                continuation = (Continuation) producer$volatile$FU.getAndSet(this, null);
            } while (continuation == null);
            s.Companion companion = s.INSTANCE;
            continuation.resumeWith(s.b(h0.f84049a));
        }
    }
}
