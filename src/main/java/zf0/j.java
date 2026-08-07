package zf0;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/StateFlow;", "Lzf0/w;", "Lkotlinx/coroutines/flow/Flow;", "a", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lzf0/w;", "state", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lzf0/w;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", f = "CameraController.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    static final class a extends SuspendLambda implements wn0.q<FlowCollector<? super w>, w, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f128219n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f128220o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f128221p;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super w> flowCollector, w wVar, Continuation<? super Boolean> continuation) {
            a aVar = new a(continuation);
            aVar.f128220o = flowCollector;
            aVar.f128221p = wVar;
            return aVar.invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w wVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f128219n;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f128220o;
                w wVar2 = (w) this.f128221p;
                this.f128220o = wVar2;
                this.f128219n = 1;
                if (flowCollector.emit(wVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wVar = wVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.f128220o;
                jn0.t.b(obj);
            }
            return Boxing.boxBoolean(!(wVar instanceof w.Closed));
        }
    }

    public static final Flow<w> a(StateFlow<? extends w> stateFlow) {
        p013kotlin.jvm.internal.s.k(stateFlow, "<this>");
        return FlowKt.transformWhile(stateFlow, new a(null));
    }
}
