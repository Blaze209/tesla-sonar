package kotlinx.coroutines.flow;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a)\u0010\u0012\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aX\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\b\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001aV\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001b2$\b\n\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001dH\u0087\b¢\u0006\u0004\b \u0010!\u001a^\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\b\b\u0010\u001f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\"H\u0087\b¢\u0006\u0004\b#\u0010$\u001a&\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H¢\u0006\u0004\b&\u0010'\u001a.\u0010&\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0087H¢\u0006\u0004\b&\u0010+\u001a&\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H¢\u0006\u0004\b-\u0010'\u001a.\u0010-\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0087H¢\u0006\u0004\b-\u0010/\u001a \u00101\u001a\u000200\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H¢\u0006\u0004\b1\u0010'\"\"\u00102\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"\"\u00109\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "cancellable", "(Lkotlinx/coroutines/flow/SharedFlow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "flowOn", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "conflate", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "distinctUntilChanged", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ljn0/h0;", "cancel", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/concurrent/CancellationException;)V", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "action", "catch", "(Lkotlinx/coroutines/flow/SharedFlow;Lwn0/q;)Lkotlinx/coroutines/flow/Flow;", "", "retries", "Lkotlin/Function2;", "", "predicate", "retry", "(Lkotlinx/coroutines/flow/SharedFlow;JLwn0/p;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "retryWhen", "(Lkotlinx/coroutines/flow/SharedFlow;Lwn0/r;)Lkotlinx/coroutines/flow/Flow;", "", "toList", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "destination", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toSet", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "count", "isActive", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LintKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.LintKt$retry$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<Throwable, Continuation<? super Boolean>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(true);
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @jn0.e
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @jn0.e
    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m560catch(SharedFlow<? extends T> sharedFlow, q<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super h0>, ? extends Object> qVar) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return FlowKt.m548catch(sharedFlow, qVar);
    }

    @jn0.e
    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, Continuation<? super Integer> continuation) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        p013kotlin.jvm.internal.q.c(0);
        Object objCount = FlowKt.count(sharedFlow, continuation);
        p013kotlin.jvm.internal.q.c(1);
        return objCount;
    }

    @jn0.e
    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final CoroutineContext getCoroutineContext(FlowCollector<?> flowCollector) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }

    @jn0.e
    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j11, p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j11, pVar);
    }

    static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Long.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            pVar = new AnonymousClass1(null);
        }
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j11, pVar);
    }

    @jn0.e
    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, r<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> rVar) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return FlowKt.retryWhen(sharedFlow, rVar);
    }

    @jn0.e
    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, Continuation<? super List<? extends T>> continuation) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        p013kotlin.jvm.internal.q.c(0);
        Object list$default = FlowKt__CollectionKt.toList$default(sharedFlow, null, continuation, 1, null);
        p013kotlin.jvm.internal.q.c(1);
        return list$default;
    }

    @jn0.e
    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Continuation<? super Set<? extends T>> continuation) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        p013kotlin.jvm.internal.q.c(0);
        Object set$default = FlowKt__CollectionKt.toSet$default(sharedFlow, null, continuation, 1, null);
        p013kotlin.jvm.internal.q.c(1);
        return set$default;
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, Continuation<?> continuation) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        p013kotlin.jvm.internal.q.c(0);
        FlowKt.toList(sharedFlow, list, continuation);
        p013kotlin.jvm.internal.q.c(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, Continuation<?> continuation) {
        s.i(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        p013kotlin.jvm.internal.q.c(0);
        FlowKt.toSet(sharedFlow, set, continuation);
        p013kotlin.jvm.internal.q.c(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }
}
