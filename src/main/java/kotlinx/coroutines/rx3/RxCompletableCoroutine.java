package kotlinx.coroutines.rx3;

import jn0.h0;
import kotlinx.coroutines.AbstractCoroutine;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/rx3/RxCompletableCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljn0/h0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/rxjava3/core/c;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/rxjava3/core/c;)V", "value", "onCompleted", "(Ljn0/h0;)V", "", "cause", "", "handled", "onCancelled", "(Ljava/lang/Throwable;Z)V", "Lio/reactivex/rxjava3/core/c;", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RxCompletableCoroutine extends AbstractCoroutine<h0> {
    private final io.reactivex.rxjava3.core.c subscriber;

    public RxCompletableCoroutine(CoroutineContext coroutineContext, io.reactivex.rxjava3.core.c cVar) {
        super(coroutineContext, false, true);
        this.subscriber = cVar;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable cause, boolean handled) {
        try {
            if (this.subscriber.a(cause)) {
                return;
            }
        } catch (Throwable th2) {
            jn0.g.a(cause, th2);
        }
        RxCancellableKt.handleUndeliverableException(cause, getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(h0 value) {
        try {
            this.subscriber.onComplete();
        } catch (Throwable th2) {
            RxCancellableKt.handleUndeliverableException(th2, getContext());
        }
    }
}
