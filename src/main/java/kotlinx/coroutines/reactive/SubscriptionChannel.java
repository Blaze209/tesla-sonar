package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import kotlinx.coroutines.channels.BufferedChannel;
import nr0.c;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0013\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a8\u0002X\u0082\u0004R\u000b\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/reactive/SubscriptionChannel;", "T", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lnr0/b;", "", "request", "<init>", "(I)V", "Ljn0/h0;", "onReceiveEnqueued", "()V", "onReceiveDequeued", "onClosedIdempotent", "Lnr0/c;", "s", "onSubscribe", "(Lnr0/c;)V", "t", "onNext", "(Ljava/lang/Object;)V", "onComplete", "", "e", "onError", "(Ljava/lang/Throwable;)V", "I", "Lkotlinx/atomicfu/AtomicRef;", "_subscription", "Lkotlinx/atomicfu/AtomicInt;", "_requested", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SubscriptionChannel<T> extends BufferedChannel<T> implements nr0.b<T> {
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;
    private final int request;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _subscription$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _requested$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SubscriptionChannel.class, "_requested$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionChannel(int i11) {
        super(Integer.MAX_VALUE, null, 2, 0 == true ? 1 : 0);
        this.request = i11;
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Invalid request size: " + i11).toString());
    }

    private final /* synthetic */ int get_requested$volatile() {
        return this._requested$volatile;
    }

    private final /* synthetic */ Object get_subscription$volatile() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l<? super Integer, h0> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_requested$volatile(int i11) {
        this._requested$volatile = i11;
    }

    private final /* synthetic */ void set_subscription$volatile(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onClosedIdempotent() {
        c cVar = (c) _subscription$volatile$FU.getAndSet(this, null);
        if (cVar != null) {
            cVar.cancel();
        }
    }

    @Override // nr0.b
    public void onComplete() {
        close(null);
    }

    @Override // nr0.b
    public void onError(Throwable e11) {
        close(e11);
    }

    @Override // nr0.b
    public void onNext(T t11) {
        _requested$volatile$FU.decrementAndGet(this);
        mo85trySendJP2dKIU(t11);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onReceiveDequeued() {
        _requested$volatile$FU.incrementAndGet(this);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onReceiveEnqueued() {
        c cVar;
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _requested$volatile$FU;
        while (true) {
            int i12 = atomicIntegerFieldUpdater.get(this);
            cVar = (c) _subscription$volatile$FU.get(this);
            i11 = i12 - 1;
            if (cVar == null || i11 >= 0) {
                if (_requested$volatile$FU.compareAndSet(this, i12, i11)) {
                    return;
                }
            } else if (i12 == this.request || _requested$volatile$FU.compareAndSet(this, i12, this.request)) {
                break;
            }
        }
        cVar.request(this.request - i11);
    }

    @Override // nr0.b
    public void onSubscribe(c s11) {
        _subscription$volatile$FU.set(this, s11);
        while (!isClosedForSend()) {
            int i11 = _requested$volatile$FU.get(this);
            if (i11 >= this.request) {
                return;
            }
            if (_requested$volatile$FU.compareAndSet(this, i11, this.request)) {
                s11.request(this.request - i11);
                return;
            }
        }
        s11.cancel();
    }
}
