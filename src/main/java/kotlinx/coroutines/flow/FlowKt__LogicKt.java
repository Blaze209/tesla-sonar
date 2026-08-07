package kotlinx.coroutines.flow;

import jn0.t;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.j0;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aD\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001aD\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\t\u0010\b\u001aD\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "any", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "all", "none", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__LogicKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = "all", n = {"foundCounterExample", "collector$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.all(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = "any", n = {"found", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C47631<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47631(Continuation<? super C47631> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.any(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$none$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {}, l = {107}, m = "none", n = {}, s = {})
    static final class C47641<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C47641(Continuation<? super C47641> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.none(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object all(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        j0 j0Var;
        AbortFlowException e11;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(obj);
            j0 j0Var2 = new j0();
            FlowCollector<? super Object> flowKt__LogicKt$all$$inlined$collectWhile$1 = new FlowKt__LogicKt$all$$inlined$collectWhile$1<>(pVar, j0Var2);
            try {
                anonymousClass1.L$0 = j0Var2;
                anonymousClass1.L$1 = flowKt__LogicKt$all$$inlined$collectWhile$1;
                anonymousClass1.label = 1;
                if (flow.collect(flowKt__LogicKt$all$$inlined$collectWhile$1, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j0Var = j0Var2;
            } catch (AbortFlowException e12) {
                j0Var = j0Var2;
                e11 = e12;
                flowCollector = flowKt__LogicKt$all$$inlined$collectWhile$1;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__LogicKt$all$$inlined$collectWhile$1) anonymousClass1.L$1;
            j0Var = (j0) anonymousClass1.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        return Boxing.boxBoolean(!j0Var.f86523a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object any(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Boolean> continuation) {
        C47631 c47631;
        j0 j0Var;
        AbortFlowException e11;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof C47631) {
            c47631 = (C47631) continuation;
            int i11 = c47631.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47631.label = i11 - Integer.MIN_VALUE;
            } else {
                c47631 = new C47631(continuation);
            }
        } else {
            c47631 = new C47631(continuation);
        }
        Object obj = c47631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47631.label;
        if (i12 == 0) {
            t.b(obj);
            j0 j0Var2 = new j0();
            FlowCollector<? super Object> flowKt__LogicKt$any$$inlined$collectWhile$1 = new FlowKt__LogicKt$any$$inlined$collectWhile$1<>(pVar, j0Var2);
            try {
                c47631.L$0 = j0Var2;
                c47631.L$1 = flowKt__LogicKt$any$$inlined$collectWhile$1;
                c47631.label = 1;
                if (flow.collect(flowKt__LogicKt$any$$inlined$collectWhile$1, c47631) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j0Var = j0Var2;
            } catch (AbortFlowException e12) {
                j0Var = j0Var2;
                e11 = e12;
                flowCollector = flowKt__LogicKt$any$$inlined$collectWhile$1;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47631.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__LogicKt$any$$inlined$collectWhile$1) c47631.L$1;
            j0Var = (j0) c47631.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47631.getContext());
            }
        }
        return Boxing.boxBoolean(j0Var.f86523a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object none(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super Boolean> continuation) {
        C47641 c47641;
        if (continuation instanceof C47641) {
            c47641 = (C47641) continuation;
            int i11 = c47641.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47641.label = i11 - Integer.MIN_VALUE;
            } else {
                c47641 = new C47641(continuation);
            }
        } else {
            c47641 = new C47641(continuation);
        }
        Object objAny = c47641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47641.label;
        if (i12 == 0) {
            t.b(objAny);
            c47641.label = 1;
            objAny = FlowKt.any(flow, pVar, c47641);
            if (objAny == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objAny);
        }
        return Boxing.boxBoolean(!((Boolean) objAny).booleanValue());
    }
}
