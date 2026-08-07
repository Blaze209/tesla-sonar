package kotlinx.coroutines.intrinsics;

import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import wn0.a;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u000b\u001a%\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\u0010\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "Ljn0/h0;", "startCoroutineCancellable", "(Lwn0/l;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lwn0/p;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "fatalCompletion", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V", "Lkotlin/Function0;", "block", "runSafely", "(Lkotlin/coroutines/Continuation;Lwn0/a;)V", "", "e", "dispatcherFailure", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CancellableKt {
    private static final void dispatcherFailure(Continuation<?> continuation, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        s.Companion companion = s.INSTANCE;
        continuation.resumeWith(s.b(t.a(th2)));
        throw th2;
    }

    private static final void runSafely(Continuation<?> continuation, a<h0> aVar) throws Throwable {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            dispatcherFailure(continuation, th2);
        }
    }

    @InternalCoroutinesApi
    public static final <T> void startCoroutineCancellable(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(lVar, continuation));
            s.Companion companion = s.INSTANCE;
            DispatchedContinuationKt.resumeCancellableWith(continuationIntercepted, s.b(h0.f84049a));
        } catch (Throwable th2) {
            dispatcherFailure(continuation, th2);
        }
    }

    public static final <R, T> void startCoroutineCancellable(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r11, Continuation<? super T> continuation) {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(pVar, r11, continuation));
            s.Companion companion = s.INSTANCE;
            DispatchedContinuationKt.resumeCancellableWith(continuationIntercepted, s.b(h0.f84049a));
        } catch (Throwable th2) {
            dispatcherFailure(continuation, th2);
        }
    }

    public static final void startCoroutineCancellable(Continuation<? super h0> continuation, Continuation<?> continuation2) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
            s.Companion companion = s.INSTANCE;
            DispatchedContinuationKt.resumeCancellableWith(continuationIntercepted, s.b(h0.f84049a));
        } catch (Throwable th2) {
            dispatcherFailure(continuation2, th2);
        }
    }
}
