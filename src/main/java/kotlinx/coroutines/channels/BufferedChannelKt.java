package kotlinx.coroutines.channels;

import jn0.h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aK\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\"\b\u0002\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$\"\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'\"\u0014\u0010*\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+\"\u0014\u0010/\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+\"\u0014\u00101\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00102\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010+\"\u001a\u00103\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00105\"\u0014\u00106\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010+\"\u0014\u00107\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+\"\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+\"\u0014\u00109\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010$\"\u0014\u0010:\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010$\"\u0014\u0010;\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010$\"\u0014\u0010<\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010$\"\u0014\u0010=\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010$\"\u0014\u0010>\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010$\"\u0014\u0010?\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010+\"\u0014\u0010@\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010+\"\u0014\u0010A\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010+\"\u0014\u0010B\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010+\"\u0014\u0010C\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010$\"\u0014\u0010D\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010$\"\u0014\u0010E\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010$\"\u0014\u0010F\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010$\"\u0014\u0010G\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010$\"\u0014\u0010H\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010'\"\u0014\u0010I\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010'\"\u0014\u0010J\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010'\"\u0019\u0010M\u001a\u00020\u0002*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0019\u0010P\u001a\u00020\u0015*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\"\u0019\u0010R\u001a\u00020\u0002*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010L\"\u0019\u0010U\u001a\u00020\u0012*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/ChannelSegment;", "createSegmentFunction", "()Lco0/h;", "id", "prev", "createSegment", "(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", "T", "Lkotlinx/coroutines/CancellableContinuation;", "value", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "Ljn0/h0;", "onCancellation", "", "tryResume0", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;Lwn0/q;)Z", "", "capacity", "initialBufferEnd", "(I)J", "counter", "closeStatus", "constructSendersAndCloseStatus", "(JI)J", "pauseEB", "constructEBCompletedAndPauseFlag", "(JZ)J", "", "NULL_SEGMENT", "Lkotlinx/coroutines/channels/ChannelSegment;", "SEGMENT_SIZE", "I", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "BUFFER_END_RENDEZVOUS", "J", "BUFFER_END_UNLIMITED", "Lkotlinx/coroutines/internal/Symbol;", "BUFFERED", "Lkotlinx/coroutines/internal/Symbol;", "IN_BUFFER", "RESUMING_BY_RCV", "RESUMING_BY_EB", "POISONED", "DONE_RCV", "INTERRUPTED_SEND", "INTERRUPTED_RCV", "CHANNEL_CLOSED", "getCHANNEL_CLOSED", "()Lkotlinx/coroutines/internal/Symbol;", "SUSPEND", "SUSPEND_NO_WAITER", "FAILED", "RESULT_RENDEZVOUS", "RESULT_BUFFERED", "RESULT_SUSPEND", "RESULT_SUSPEND_NO_WAITER", "RESULT_CLOSED", "RESULT_FAILED", "NO_RECEIVE_RESULT", "CLOSE_HANDLER_CLOSED", "CLOSE_HANDLER_INVOKED", "NO_CLOSE_CAUSE", "CLOSE_STATUS_ACTIVE", "CLOSE_STATUS_CANCELLATION_STARTED", "CLOSE_STATUS_CLOSED", "CLOSE_STATUS_CANCELLED", "SENDERS_CLOSE_STATUS_SHIFT", "SENDERS_COUNTER_MASK", "EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT", "EB_COMPLETED_COUNTER_MASK", "getSendersCounter", "(J)J", "sendersCounter", "getSendersCloseStatus", "(J)I", "sendersCloseStatus", "getEbCompletedCounter", "ebCompletedCounter", "getEbPauseExpandBuffers", "(J)Z", "ebPauseExpandBuffers", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BufferedChannelKt {
    private static final long BUFFER_END_RENDEZVOUS = 0;
    private static final long BUFFER_END_UNLIMITED = Long.MAX_VALUE;
    private static final int CLOSE_STATUS_ACTIVE = 0;
    private static final int CLOSE_STATUS_CANCELLATION_STARTED = 1;
    private static final int CLOSE_STATUS_CANCELLED = 3;
    private static final int CLOSE_STATUS_CLOSED = 2;
    private static final long EB_COMPLETED_COUNTER_MASK = 4611686018427387903L;
    private static final long EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT = 4611686018427387904L;
    private static final int RESULT_BUFFERED = 1;
    private static final int RESULT_CLOSED = 4;
    private static final int RESULT_FAILED = 5;
    private static final int RESULT_RENDEZVOUS = 0;
    private static final int RESULT_SUSPEND = 2;
    private static final int RESULT_SUSPEND_NO_WAITER = 3;
    private static final int SENDERS_CLOSE_STATUS_SHIFT = 60;
    private static final long SENDERS_COUNTER_MASK = 1152921504606846975L;
    private static final ChannelSegment<Object> NULL_SEGMENT = new ChannelSegment<>(-1, null, null, 0);
    public static final int SEGMENT_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
    public static final Symbol BUFFERED = new Symbol("BUFFERED");
    private static final Symbol IN_BUFFER = new Symbol("SHOULD_BUFFER");
    private static final Symbol RESUMING_BY_RCV = new Symbol("S_RESUMING_BY_RCV");
    private static final Symbol RESUMING_BY_EB = new Symbol("RESUMING_BY_EB");
    private static final Symbol POISONED = new Symbol("POISONED");
    private static final Symbol DONE_RCV = new Symbol("DONE_RCV");
    private static final Symbol INTERRUPTED_SEND = new Symbol("INTERRUPTED_SEND");
    private static final Symbol INTERRUPTED_RCV = new Symbol("INTERRUPTED_RCV");
    private static final Symbol CHANNEL_CLOSED = new Symbol("CHANNEL_CLOSED");
    private static final Symbol SUSPEND = new Symbol("SUSPEND");
    private static final Symbol SUSPEND_NO_WAITER = new Symbol("SUSPEND_NO_WAITER");
    private static final Symbol FAILED = new Symbol("FAILED");
    private static final Symbol NO_RECEIVE_RESULT = new Symbol("NO_RECEIVE_RESULT");
    private static final Symbol CLOSE_HANDLER_CLOSED = new Symbol("CLOSE_HANDLER_CLOSED");
    private static final Symbol CLOSE_HANDLER_INVOKED = new Symbol("CLOSE_HANDLER_INVOKED");
    private static final Symbol NO_CLOSE_CAUSE = new Symbol("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1<E> extends p implements wn0.p<Long, ChannelSegment<E>, ChannelSegment<E>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Long l11, Object obj) {
            return invoke(l11.longValue(), (ChannelSegment) obj);
        }

        public final ChannelSegment<E> invoke(long j11, ChannelSegment<E> channelSegment) {
            return BufferedChannelKt.createSegment(j11, channelSegment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructEBCompletedAndPauseFlag(long j11, boolean z11) {
        return (z11 ? EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT : 0L) + j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructSendersAndCloseStatus(long j11, int i11) {
        return (((long) i11) << 60) + j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> ChannelSegment<E> createSegment(long j11, ChannelSegment<E> channelSegment) {
        return new ChannelSegment<>(j11, channelSegment, channelSegment.getChannel(), 0);
    }

    public static final <E> co0.h<ChannelSegment<E>> createSegmentFunction() {
        return AnonymousClass1.INSTANCE;
    }

    public static final Symbol getCHANNEL_CLOSED() {
        return CHANNEL_CLOSED;
    }

    private static final long getEbCompletedCounter(long j11) {
        return j11 & EB_COMPLETED_COUNTER_MASK;
    }

    private static final boolean getEbPauseExpandBuffers(long j11) {
        return (j11 & EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT) != 0;
    }

    private static final int getSendersCloseStatus(long j11) {
        return (int) (j11 >> 60);
    }

    private static final long getSendersCounter(long j11) {
        return j11 & SENDERS_COUNTER_MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initialBufferEnd(int i11) {
        if (i11 != 0) {
            return i11 != Integer.MAX_VALUE ? i11 : BUFFER_END_UNLIMITED;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean tryResume0(CancellableContinuation<? super T> cancellableContinuation, T t11, q<? super Throwable, ? super T, ? super CoroutineContext, h0> qVar) {
        Object objTryResume = cancellableContinuation.tryResume(t11, null, qVar);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    static /* synthetic */ boolean tryResume0$default(CancellableContinuation cancellableContinuation, Object obj, q qVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            qVar = null;
        }
        return tryResume0(cancellableContinuation, obj, qVar);
    }
}
