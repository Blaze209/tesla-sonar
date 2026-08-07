package p020r2;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\"\u001e\u0010\r\u001a\u00020\b*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "c", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlin/coroutines/CoroutineContext;", "Lr2/f1;", "a", "(Lkotlin/coroutines/CoroutineContext;)Lr2/f1;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h1 {
    public static final f1 a(CoroutineContext coroutineContext) {
        f1 f1Var = (f1) coroutineContext.get(f1.INSTANCE);
        if (f1Var != null) {
            return f1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object b(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        return a(continuation.getContext()).B(new g1(lVar), continuation);
    }

    public static final <R> Object c(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        return a(continuation.getContext()).B(lVar, continuation);
    }
}
