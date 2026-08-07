package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th2) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th2);
    }

    @ObsoleteCoroutinesApi
    @jn0.e
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        return (R) ChannelsKt__DeprecatedKt.consume(broadcastChannel, lVar);
    }

    @jn0.e
    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, l<? super E, h0> lVar, Continuation<? super h0> continuation) {
        return ChannelsKt__DeprecatedKt.consumeEach(broadcastChannel, lVar, continuation);
    }

    public static final l<Throwable, h0> consumes(ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final l<Throwable, h0> consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, p<? super E, ? super Continuation<? super K>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, coroutineContext, pVar);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, p<? super E, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, coroutineContext, pVar);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, p<? super E, ? super Continuation<? super R>, ? extends Object> pVar) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, coroutineContext, pVar);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, q<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> qVar) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, coroutineContext, qVar);
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c11, Continuation<? super C> continuation) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c11, continuation);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c11, Continuation<? super C> continuation) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c11, continuation);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, Continuation<? super List<? extends E>> continuation) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, continuation);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, M m11, Continuation<? super M> continuation) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m11, continuation);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, Continuation<? super Set<E>> continuation) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, continuation);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e11) {
        return ChannelsKt__ChannelsKt.trySendBlocking(sendChannel, e11);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, lVar);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, l<? super E, h0> lVar, Continuation<? super h0> continuation) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, lVar, continuation);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, CoroutineContext coroutineContext, p<? super E, ? super R, ? extends V> pVar) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }
}
