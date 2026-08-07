package kotlinx.coroutines.flow;

import jn0.h0;
import kotlinx.coroutines.flow.internal.CombineKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.q;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flows$inlined;
    final /* synthetic */ p $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(Flow[] flowArr, p pVar) {
        this.$flows$inlined = flowArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, Continuation<? super h0> continuation) {
        Flow[] flowArr = this.$flows$inlined;
        s.p();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        s.p();
        Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$5$1, new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null), continuation);
        return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, Continuation continuation) {
        q.c(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1
            int label;
            /* synthetic */ Object result;

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.collect(null, this);
            }
        };
        q.c(5);
        Flow[] flowArr = this.$flows$inlined;
        s.p();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        s.p();
        FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null);
        q.c(0);
        CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$5$1, flowKt__ZipKt$combine$5$2, continuation);
        q.c(1);
        return h0.f84049a;
    }
}
