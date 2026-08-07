package kotlinx.coroutines.selects;

import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.q;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a2\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0081H¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0081H¢\u0006\u0004\b\u0007\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Ljn0/h0;", "builder", "selectOld", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectUnbiasedOld", "T", "Lkotlinx/coroutines/CancellableContinuation;", "result", "resumeUndispatched", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", "", "exception", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(CancellableContinuation<? super T> cancellableContinuation, T t11) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, t11);
        } else {
            cancellableContinuation.resumeWith(s.b(t11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(CancellableContinuation<?> cancellableContinuation, Throwable th2) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th2);
        } else {
            s.Companion companion = s.INSTANCE;
            cancellableContinuation.resumeWith(s.b(t.a(th2)));
        }
    }

    public static final <R> Object selectOld(l<? super SelectBuilder<? super R>, h0> lVar, Continuation<? super R> continuation) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(continuation);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th2) {
            selectBuilderImpl.handleBuilderException(th2);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private static final <R> Object selectOld$$forInline(l<? super SelectBuilder<? super R>, h0> lVar, Continuation<? super R> continuation) {
        q.c(0);
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(continuation);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th2) {
            selectBuilderImpl.handleBuilderException(th2);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        q.c(1);
        return result;
    }

    public static final <R> Object selectUnbiasedOld(l<? super SelectBuilder<? super R>, h0> lVar, Continuation<? super R> continuation) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(continuation);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th2) {
            unbiasedSelectBuilderImpl.handleBuilderException(th2);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objInitSelectResult;
    }

    private static final <R> Object selectUnbiasedOld$$forInline(l<? super SelectBuilder<? super R>, h0> lVar, Continuation<? super R> continuation) {
        q.c(0);
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(continuation);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th2) {
            unbiasedSelectBuilderImpl.handleBuilderException(th2);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        q.c(1);
        return objInitSelectResult;
    }
}
