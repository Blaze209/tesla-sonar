package pi;

import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0007\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0004\b\u0007\u0010\fJ \u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0096\u0001¢\u0006\u0004\b\u0007\u0010\u000fJ&\u0010\u0012\u001a\u00020\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\u0010H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096Aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00018\u0000H\u0097A¢\u0006\u0004\b!\u0010\u001dJ\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\"\u0010#J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001bJ$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u00020\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b)\u0010\u0013J\u0019\u0010*\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b*\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R&\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u00101\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00102R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u00108R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000068VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b<\u00108R&\u0010B\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000?0>8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Lpi/b;", "E", "Lkotlinx/coroutines/channels/Channel;", "wrapped", "<init>", "(Lkotlinx/coroutines/channels/Channel;)V", "Ljn0/h0;", "cancel", "()V", "", "cause", "", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "Lkotlin/Function1;", "handler", "invokeOnClose", "(Lwn0/l;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching-JP2dKIU", "receiveCatching", "receiveOrNull", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReceive-PtdJZtk", "tryReceive", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "a", "close", "Lkotlinx/coroutines/channels/Channel;", "b", "Lwn0/l;", "<set-?>", "c", "Z", "isClosed", "()Z", "isClosedForReceive", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "getOnReceiveOrNull", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b<E> implements Channel<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Channel<E> wrapped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l<? super Throwable, h0> handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    public b(Channel<E> wrapped) {
        s.k(wrapped, "wrapped");
        this.wrapped = wrapped;
    }

    public final void a(l<? super Throwable, h0> handler) {
        s.k(handler, "handler");
        this.handler = handler;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @jn0.e
    public /* synthetic */ void cancel() {
        this.wrapped.cancel();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        l<? super Throwable, h0> lVar;
        this.isClosed = true;
        boolean zClose = this.wrapped.close(cause);
        if (zClose && (lVar = this.handler) != null) {
            lVar.invoke(cause);
        }
        this.handler = null;
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        return this.wrapped.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        return this.wrapped.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        return this.wrapped.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this.wrapped.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo586invokeOnClose(l<? super Throwable, h0> handler) {
        s.k(handler, "handler");
        this.wrapped.mo586invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this.wrapped.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.wrapped.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this.wrapped.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return this.wrapped.iterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @jn0.e
    public boolean offer(E element) {
        return this.wrapped.offer(element);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @jn0.e
    public E poll() {
        return this.wrapped.poll();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return this.wrapped.receive(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo522receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        Object objMo522receiveCatchingJP2dKIU = this.wrapped.mo522receiveCatchingJP2dKIU(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objMo522receiveCatchingJP2dKIU;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @jn0.e
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return this.wrapped.receiveOrNull(continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e11, Continuation<? super h0> continuation) {
        return this.wrapped.send(e11, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo523tryReceivePtdJZtk() {
        return this.wrapped.mo523tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo85trySendJP2dKIU(E element) {
        return this.wrapped.mo85trySendJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public void cancel(CancellationException cause) {
        this.wrapped.cancel(cause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @jn0.e
    public /* synthetic */ boolean cancel(Throwable cause) {
        return this.wrapped.cancel(cause);
    }
}
