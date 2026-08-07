package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferedChannel;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u00032\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00072\b\u0010\r\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00168\u0002X\u0082\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b9¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/rx3/SubscriptionChannel;", "T", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lio/reactivex/rxjava3/core/s;", "Lio/reactivex/rxjava3/core/l;", "<init>", "()V", "Ljn0/h0;", "onClosedIdempotent", "Lam0/b;", "sub", "onSubscribe", "(Lam0/b;)V", "t", "onSuccess", "(Ljava/lang/Object;)V", "onNext", "onComplete", "", "e", "onError", "(Ljava/lang/Throwable;)V", "Lkotlinx/atomicfu/AtomicRef;", "_subscription", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SubscriptionChannel<T> extends BufferedChannel<T> implements s<T>, io.reactivex.rxjava3.core.l<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _subscription$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    public SubscriptionChannel() {
        super(Integer.MAX_VALUE, null, 2, null);
    }

    private final /* synthetic */ Object get_subscription$volatile() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void set_subscription$volatile(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onClosedIdempotent() {
        am0.b bVar = (am0.b) _subscription$volatile$FU.getAndSet(this, null);
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        close(null);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable e11) {
        close(e11);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        mo85trySendJP2dKIU(t11);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b sub) {
        _subscription$volatile$FU.set(this, sub);
    }

    @Override // io.reactivex.rxjava3.core.l
    public void onSuccess(T t11) {
        mo85trySendJP2dKIU(t11);
        close(null);
    }
}
