package kotlinx.coroutines.flow;

import com.fourthline.analytics.internal.AnalyticsContext;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.q;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002*\b\u0004\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0086H¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001aF\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002$\b\u0004\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0087H¢\u0006\u0004\b\u0002\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "launchIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "action", "collectIndexed", "(Lkotlinx/coroutines/flow/Flow;Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "collectLatest", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", AnalyticsContext.Flow, "emitAll", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass3<T> implements FlowCollector<T> {
        final /* synthetic */ p<T, Continuation<? super h0>, Object> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar) {
            this.$action = pVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t11, Continuation<? super h0> continuation) {
            Object objInvoke = this.$action.invoke(t11, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : h0.f84049a;
        }

        public Object emit$$forInline(T t11, final Continuation<? super h0> continuation) {
            q.c(4);
            new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            q.c(5);
            this.$action.invoke(t11, continuation);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "index", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements FlowCollector<T> {
        final /* synthetic */ wn0.q<Integer, T, Continuation<? super h0>, Object> $action;
        private int index;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(wn0.q<? super Integer, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar) {
            this.$action = qVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t11, Continuation<? super h0> continuation) {
            wn0.q<Integer, T, Continuation<? super h0>, Object> qVar = this.$action;
            int i11 = this.index;
            this.index = i11 + 1;
            if (i11 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = qVar.invoke(Boxing.boxInt(i11), t11, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : h0.f84049a;
        }

        public Object emit$$forInline(T t11, final Continuation<? super h0> continuation) {
            q.c(4);
            new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            q.c(5);
            wn0.q<Integer, T, Continuation<? super h0>, Object> qVar = this.$action;
            int i11 = this.index;
            this.index = i11 + 1;
            if (i11 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            qVar.invoke(Integer.valueOf(i11), t11, continuation);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Flow<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Flow<? extends T> flow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_launchIn = flow;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_launchIn, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                Flow<T> flow = this.$this_launchIn;
                this.label = 1;
                if (FlowKt.collect(flow, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final Object collect(Flow<?> flow, Continuation<? super h0> continuation) {
        Object objCollect = flow.collect(NopCollector.INSTANCE, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    @jn0.e
    private static final /* synthetic */ <T> Object collect$$forInline(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(pVar);
        q.c(0);
        flow.collect(anonymousClass3, continuation);
        q.c(1);
        return h0.f84049a;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, wn0.q<? super Integer, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super h0> continuation) {
        Object objCollect = flow.collect(new AnonymousClass2(qVar), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, wn0.q<? super Integer, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super h0> continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(qVar);
        q.c(0);
        flow.collect(anonymousClass2, continuation);
        q.c(1);
        return h0.f84049a;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objCollect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, pVar), 0, null, 2, null), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, Continuation<? super h0> continuation) {
        FlowKt.ensureActive(flowCollector);
        Object objCollect = flow.collect(flowCollector, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flow, null), 3, null);
    }

    @jn0.e
    public static final /* synthetic */ <T> Object collect(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objCollect = flow.collect(new AnonymousClass3(pVar), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }
}
