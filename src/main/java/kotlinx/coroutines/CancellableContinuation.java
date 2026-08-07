package kotlinx.coroutines;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0006\u001a\u0004\u0018\u00010\u0004\"\b\b\u0001\u0010\b*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tH'¢\u0006\u0004\b\u0006\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004H'¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH'¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\f2\u0018\u0010\u001d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u001bj\u0002`\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\f*\u00020 2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\f*\u00020 2\u0006\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001bH'¢\u0006\u0004\b%\u0010&JC\u0010%\u001a\u00020\f\"\b\b\u0001\u0010\b*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tH&¢\u0006\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006,"}, d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "value", "", "idempotent", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "Ljn0/h0;", "onCancellation", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "(Ljava/lang/Object;)V", "initCancellability", "()V", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "invokeOnCancellation", "(Lwn0/l;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "resume", "(Ljava/lang/Object;Lwn0/l;)V", "(Ljava/lang/Object;Lwn0/q;)V", "isActive", "()Z", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CancellableContinuation<T> extends Continuation<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return cancellableContinuation.cancel(th2);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i11, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i11 & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable cause);

    @InternalCoroutinesApi
    void completeResume(Object token);

    @InternalCoroutinesApi
    void initCancellability();

    void invokeOnCancellation(l<? super Throwable, h0> handler);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @jn0.e
    void resume(T value, l<? super Throwable, h0> onCancellation);

    <R extends T> void resume(R value, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation);

    @ExperimentalCoroutinesApi
    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t11);

    @ExperimentalCoroutinesApi
    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2);

    @InternalCoroutinesApi
    Object tryResume(T value, Object idempotent);

    @InternalCoroutinesApi
    <R extends T> Object tryResume(R value, Object idempotent, q<? super Throwable, ? super R, ? super CoroutineContext, h0> onCancellation);

    @InternalCoroutinesApi
    Object tryResumeWithException(Throwable exception);
}
