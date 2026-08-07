package y20;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a{\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "PropsT", "StateT", "OutputT", "Lkotlinx/coroutines/flow/Flow;", "Ly20/h;", "Ly20/r;", "actionSink", "Lkotlin/Function1;", "handler", "Ljn0/h0;", "a", "(Lkotlinx/coroutines/flow/Flow;Ly20/h;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "action", "b", "(Ly20/h;Ly20/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a<T> implements FlowCollector<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f124738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f124739b;

        public a(h hVar, wn0.l lVar) {
            this.f124738a = hVar;
            this.f124739b = lVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t11, Continuation<? super h0> continuation) {
            Object objM = w.m(this.f124738a, (r) this.f124739b.invoke(t11), continuation);
            return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* JADX INFO: renamed from: y20.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u0007\u001a\u00020\u0006*\u00180\u0005R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"y20/y$b", "Ly20/r;", "", "toString", "()Ljava/lang/String;", "Ly20/r$c;", "Ljn0/h0;", "a", "(Ly20/r$c;)V", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class sendAndAwaitApplication<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r<PropsT, StateT, OutputT> f124740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<h0> f124741d;

        /* JADX WARN: Multi-variable type inference failed */
        sendAndAwaitApplication(r<? super PropsT, StateT, ? extends OutputT> rVar, CancellableContinuation<? super h0> cancellableContinuation) {
            this.f124740c = rVar;
            this.f124741d = cancellableContinuation;
        }

        @Override // y20.r
        public void a(r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            p013kotlin.jvm.internal.s.k(cVar, "<this>");
            if (this.f124741d.isActive()) {
                this.f124740c.a(cVar);
                CancellableContinuation<h0> cancellableContinuation = this.f124741d;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(h0.f84049a));
            }
        }

        public String toString() {
            return "sendAndAwaitApplication(" + this.f124740c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static final <T, PropsT, StateT, OutputT> Object a(Flow<? extends T> flow, h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, wn0.l<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> lVar, Continuation<? super h0> continuation) {
        Object objCollect = flow.collect(new a(hVar, lVar), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    public static final <PropsT, StateT, OutputT> Object b(h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, r<? super PropsT, StateT, ? extends OutputT> rVar, Continuation<? super h0> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.b(new sendAndAwaitApplication(rVar, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }
}
