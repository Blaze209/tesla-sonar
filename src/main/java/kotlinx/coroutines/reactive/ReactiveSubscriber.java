package kotlinx.coroutines.reactive;

import jn0.t;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import nr0.c;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0013J\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkotlinx/coroutines/reactive/ReactiveSubscriber;", "", "T", "Lnr0/b;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "", "requestSize", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;J)V", "takeNextOrNull", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "Ljn0/h0;", "onNext", "(Ljava/lang/Object;)V", "onComplete", "()V", "", "t", "onError", "(Ljava/lang/Throwable;)V", "Lnr0/c;", "s", "onSubscribe", "(Lnr0/c;)V", "makeRequest", "cancel", "J", "subscription", "Lnr0/c;", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lkotlinx/coroutines/channels/Channel;", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ReactiveSubscriber<T> implements nr0.b<T> {
    private final Channel<T> channel;
    private final long requestSize;
    private c subscription;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", i = {}, l = {125}, m = "takeNextOrNull", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ReactiveSubscriber<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReactiveSubscriber<T> reactiveSubscriber, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = reactiveSubscriber;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.takeNextOrNull(this);
        }
    }

    public ReactiveSubscriber(int i11, BufferOverflow bufferOverflow, long j11) {
        this.requestSize = j11;
        this.channel = kotlinx.coroutines.channels.ChannelKt.Channel$default(i11 == 0 ? 1 : i11, bufferOverflow, null, 4, null);
    }

    public final void cancel() {
        c cVar = this.subscription;
        if (cVar == null) {
            s.B("subscription");
            cVar = null;
        }
        cVar.cancel();
    }

    public final void makeRequest() {
        c cVar = this.subscription;
        if (cVar == null) {
            s.B("subscription");
            cVar = null;
        }
        cVar.request(this.requestSize);
    }

    @Override // nr0.b
    public void onComplete() {
        SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
    }

    @Override // nr0.b
    public void onError(Throwable t11) {
        this.channel.close(t11);
    }

    @Override // nr0.b
    public void onNext(T value) {
        if (ChannelResult.m540isSuccessimpl(this.channel.mo85trySendJP2dKIU(value))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + value + " was not added to channel because it was full, " + this.channel).toString());
    }

    @Override // nr0.b
    public void onSubscribe(c s11) {
        this.subscription = s11;
        makeRequest();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object takeNextOrNull(Continuation<? super T> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objMo522receiveCatchingJP2dKIU;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(obj);
            Channel<T> channel = this.channel;
            anonymousClass1.label = 1;
            objMo522receiveCatchingJP2dKIU = channel.mo522receiveCatchingJP2dKIU(anonymousClass1);
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
        Throwable thM534exceptionOrNullimpl = ChannelResult.m534exceptionOrNullimpl(objMo522receiveCatchingJP2dKIU);
        if (thM534exceptionOrNullimpl != null) {
            throw thM534exceptionOrNullimpl;
        }
        if (!(objMo522receiveCatchingJP2dKIU instanceof ChannelResult.Failed)) {
            return objMo522receiveCatchingJP2dKIU;
        }
        ChannelResult.m534exceptionOrNullimpl(objMo522receiveCatchingJP2dKIU);
        return null;
    }
}
