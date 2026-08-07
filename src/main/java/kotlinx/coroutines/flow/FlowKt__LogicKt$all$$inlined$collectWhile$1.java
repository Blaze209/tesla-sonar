package kotlinx.coroutines.flow;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.q;
import wn0.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlowKt__LogicKt$all$$inlined$collectWhile$1<T> implements FlowCollector<T> {
    final /* synthetic */ j0 $foundCounterExample$inlined;
    final /* synthetic */ p $predicate$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1", f = "Logic.kt", i = {0}, l = {132}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LogicKt$all$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LogicKt$all$$inlined$collectWhile$1(p pVar, j0 j0Var) {
        this.$predicate$inlined = pVar;
        this.$foundCounterExample$inlined = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t11, Continuation<? super h0> continuation) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LogicKt$all$$inlined$collectWhile$1<T> flowKt__LogicKt$all$$inlined$collectWhile$1;
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
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(objInvoke);
            p pVar = this.$predicate$inlined;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            q.c(6);
            objInvoke = pVar.invoke(t11, anonymousClass1);
            q.c(7);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__LogicKt$all$$inlined$collectWhile$1 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LogicKt$all$$inlined$collectWhile$1 = (FlowKt__LogicKt$all$$inlined$collectWhile$1) anonymousClass1.L$0;
            t.b(objInvoke);
        }
        boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
        if (!zBooleanValue) {
            flowKt__LogicKt$all$$inlined$collectWhile$1.$foundCounterExample$inlined.f86523a = true;
        }
        if (zBooleanValue) {
            return h0.f84049a;
        }
        throw new AbortFlowException(flowKt__LogicKt$all$$inlined$collectWhile$1);
    }
}
