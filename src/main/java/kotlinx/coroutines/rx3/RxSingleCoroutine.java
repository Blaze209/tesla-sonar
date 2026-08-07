package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.v;
import kotlinx.coroutines.AbstractCoroutine;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/rx3/RxSingleCoroutine;", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/rxjava3/core/v;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/rxjava3/core/v;)V", "value", "Ljn0/h0;", "onCompleted", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "onCancelled", "(Ljava/lang/Throwable;Z)V", "Lio/reactivex/rxjava3/core/v;", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RxSingleCoroutine<T> extends AbstractCoroutine<T> {
    private final v<T> subscriber;

    public RxSingleCoroutine(CoroutineContext coroutineContext, v<T> vVar) {
        super(coroutineContext, false, true);
        this.subscriber = vVar;
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
        RxCancellableKt.handleUndeliverableException(cause, get$context());
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCompleted(T value) {
        try {
            this.subscriber.onSuccess(value);
        } catch (Throwable th2) {
            RxCancellableKt.handleUndeliverableException(th2, get$context());
        }
    }
}
