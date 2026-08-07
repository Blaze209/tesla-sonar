package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import jn0.t;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u001b\u0010\u0012\u001a\u00020\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0012\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0018\u0010\tJ\u0012\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097@¢\u0006\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00168&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0014\u001a\u0004\b%\u0010!¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ljn0/h0;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "()V", "", "", "(Ljava/lang/Throwable;)Z", "poll", "receiveOrNull", "isClosedForReceive", "()Z", "isClosedForReceive$annotations", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReceiveChannel<E> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        public static <E> SelectClause1<E> getOnReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
            s.i(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }

        @jn0.e
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        @DelicateCoroutinesApi
        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void isEmpty$annotations() {
        }

        @jn0.e
        public static <E> E poll(ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objMo523tryReceivePtdJZtk = receiveChannel.mo523tryReceivePtdJZtk();
            if (ChannelResult.m540isSuccessimpl(objMo523tryReceivePtdJZtk)) {
                return (E) ChannelResult.m536getOrThrowimpl(objMo523tryReceivePtdJZtk);
            }
            Throwable thM534exceptionOrNullimpl = ChannelResult.m534exceptionOrNullimpl(objMo523tryReceivePtdJZtk);
            if (thM534exceptionOrNullimpl == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM534exceptionOrNullimpl);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @jn0.e
        public static <E> Object receiveOrNull(ReceiveChannel<? extends E> receiveChannel, Continuation<? super E> continuation) {
            AnonymousClass1 anonymousClass1;
            Object objMo522receiveCatchingJP2dKIU;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i11 = anonymousClass1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = anonymousClass1.label;
            if (i12 == 0) {
                t.b(obj);
                anonymousClass1.label = 1;
                objMo522receiveCatchingJP2dKIU = receiveChannel.mo522receiveCatchingJP2dKIU(anonymousClass1);
                if (objMo522receiveCatchingJP2dKIU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objMo522receiveCatchingJP2dKIU = ((ChannelResult) obj).getHolder();
            }
            return ChannelResult.m535getOrNullimpl(objMo522receiveCatchingJP2dKIU);
        }

        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return receiveChannel.cancel(th2);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {770}, m = "receiveOrNull", n = {}, s = {})
    static final class AnonymousClass1<E> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.receiveOrNull(null, this);
        }
    }

    @jn0.e
    /* synthetic */ void cancel();

    void cancel(CancellationException cause);

    @jn0.e
    /* synthetic */ boolean cancel(Throwable cause);

    SelectClause1<E> getOnReceive();

    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator<E> iterator();

    @jn0.e
    E poll();

    Object receive(Continuation<? super E> continuation);

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo522receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation);

    @jn0.e
    Object receiveOrNull(Continuation<? super E> continuation);

    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo523tryReceivePtdJZtk();
}
