package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause2;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@ObsoleteCoroutinesApi
@jn0.e
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0011\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0015J&\u0010 \u001a\u00020\u00102\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00100\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0011\u0010\b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010(\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020\u00148\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "broadcast", "<init>", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "()V", "value", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ljn0/h0;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "", "", "(Ljava/lang/Throwable;)Z", "element", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "close", "Lkotlin/Function1;", "handler", "invokeOnClose", "(Lwn0/l;)V", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "getValue", "()Ljava/lang/Object;", "getValueOrNull", "valueOrNull", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    private final BroadcastChannelImpl<E> broadcast;

    private ConflatedBroadcastChannel(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.broadcast = broadcastChannelImpl;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(CancellationException cause) {
        this.broadcast.cancel(cause);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return this.broadcast.close(cause);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this.broadcast.getOnSend();
    }

    public final E getValue() {
        return this.broadcast.getValue();
    }

    public final E getValueOrNull() {
        return this.broadcast.getValueOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo586invokeOnClose(l<? super Throwable, h0> handler) {
        this.broadcast.mo586invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.broadcast.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @jn0.e
    public boolean offer(E element) {
        return this.broadcast.offer(element);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this.broadcast.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e11, Continuation<? super h0> continuation) {
        return this.broadcast.send(e11, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo85trySendJP2dKIU(E element) {
        return this.broadcast.mo85trySendJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @jn0.e
    public /* synthetic */ boolean cancel(Throwable cause) {
        return this.broadcast.cancel(cause);
    }

    public ConflatedBroadcastChannel() {
        this(new BroadcastChannelImpl(-1));
    }

    public ConflatedBroadcastChannel(E e11) {
        this();
        mo85trySendJP2dKIU(e11);
    }
}
