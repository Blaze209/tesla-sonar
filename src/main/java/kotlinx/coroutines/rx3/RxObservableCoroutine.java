package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.p;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020$2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00040\"H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040'2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b0\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R,\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006058VX\u0096\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0019\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u000b\u0010A\u001a\u00020@8\u0002X\u0082\u0004¨\u0006B"}, d2 = {"Lkotlinx/coroutines/rx3/RxObservableCoroutine;", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljn0/h0;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/rxjava3/core/p;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/rxjava3/core/p;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "element", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "selectResult", "processResultSelectSend", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "elem", "", "doLockedNext", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "unlockAndCheckCompleted", "()V", "cause", "", "handled", "doLockedSignalCompleted", "(Ljava/lang/Throwable;Z)V", "signalCompleted", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "", "invokeOnClose", "(Lwn0/l;)Ljava/lang/Void;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "onCompleted", "(Ljn0/h0;)V", "onCancelled", "Lio/reactivex/rxjava3/core/p;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "onSend", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "isClosedForSend", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_signal", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RxObservableCoroutine<T> extends AbstractCoroutine<h0> implements ProducerScope<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _signal$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RxObservableCoroutine.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;
    private final Mutex mutex;
    private final p<T> subscriber;

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxObservableCoroutine$registerSelectForSend$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxObservableCoroutine$registerSelectForSend$1", f = "RxObservable.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ RxObservableCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RxObservableCoroutine<T> rxObservableCoroutine, SelectInstance<?> selectInstance, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = rxObservableCoroutine;
            this.$select = selectInstance;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$select, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                Mutex mutex = ((RxObservableCoroutine) this.this$0).mutex;
                this.label = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            SelectInstance<?> selectInstance = this.$select;
            RxObservableCoroutine<T> rxObservableCoroutine = this.this$0;
            h0 h0Var = h0.f84049a;
            if (!selectInstance.trySelect(rxObservableCoroutine, h0Var)) {
                Mutex.DefaultImpls.unlock$default(((RxObservableCoroutine) this.this$0).mutex, null, 1, null);
            }
            return h0Var;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxObservableCoroutine$send$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxObservableCoroutine", f = "RxObservable.kt", i = {0, 0}, l = {113}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class C47861 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RxObservableCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47861(RxObservableCoroutine<T> rxObservableCoroutine, Continuation<? super C47861> continuation) {
            super(continuation);
            this.this$0 = rxObservableCoroutine;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    public RxObservableCoroutine(CoroutineContext coroutineContext, p<T> pVar) {
        super(coroutineContext, false, true);
        this.subscriber = pVar;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    private final Throwable doLockedNext(T elem) {
        if (!isActive()) {
            doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
            return getCancellationException();
        }
        try {
            this.subscriber.onNext(elem);
            unlockAndCheckCompleted();
            return null;
        } catch (Throwable th2) {
            UndeliverableException undeliverableException = new UndeliverableException(th2);
            boolean zClose = close(undeliverableException);
            unlockAndCheckCompleted();
            if (zClose) {
                return undeliverableException;
            }
            RxCancellableKt.handleUndeliverableException(undeliverableException, get$context());
            return getCancellationException();
        }
    }

    private final void doLockedSignalCompleted(Throwable cause, boolean handled) {
        try {
            if (_signal$volatile$FU.get(this) != -2) {
                _signal$volatile$FU.set(this, -2);
                Throwable th2 = cause != null ? cause : null;
                if (th2 == null) {
                    try {
                        this.subscriber.onComplete();
                    } catch (Exception e11) {
                        RxCancellableKt.handleUndeliverableException(e11, get$context());
                    }
                } else if ((th2 instanceof UndeliverableException) && !handled) {
                    RxCancellableKt.handleUndeliverableException(cause, get$context());
                } else if (th2 != getCancellationException() || !this.subscriber.isDisposed()) {
                    try {
                        this.subscriber.onError(cause);
                    } catch (Exception e12) {
                        jn0.g.a(cause, e12);
                        RxCancellableKt.handleUndeliverableException(cause, get$context());
                    }
                }
            }
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        } catch (Throwable th3) {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
            throw th3;
        }
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private final /* synthetic */ int get_signal$volatile() {
        return this._signal$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object processResultSelectSend(Object element, Object selectResult) throws Throwable {
        s.i(element, "null cannot be cast to non-null type T of kotlinx.coroutines.rx3.RxObservableCoroutine");
        Throwable thDoLockedNext = doLockedNext(element);
        if (thDoLockedNext == null) {
            return this;
        }
        throw thDoLockedNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForSend(SelectInstance<?> select, Object element) {
        if (Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            select.selectInRegistrationPhase(h0.f84049a);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(this, select, null), 3, null);
        }
    }

    private final /* synthetic */ void set_signal$volatile(int i11) {
        this._signal$volatile = i11;
    }

    private final void signalCompleted(Throwable cause, boolean handled) {
        if (_signal$volatile$FU.compareAndSet(this, 0, -1) && Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(cause, handled);
        }
    }

    private final void unlockAndCheckCompleted() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        if (isActive() || !Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return;
        }
        doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return cancelCoroutine(cause);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel<T> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<T, SendChannel<T>> getOnSend() {
        RxObservableCoroutine$onSend$1 rxObservableCoroutine$onSend$1 = RxObservableCoroutine$onSend$1.INSTANCE;
        s.i(rxObservableCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) u0.g(rxObservableCoroutine$onSend$1, 3);
        RxObservableCoroutine$onSend$2 rxObservableCoroutine$onSend$2 = RxObservableCoroutine$onSend$2.INSTANCE;
        s.i(rxObservableCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, qVar, (q) u0.g(rxObservableCoroutine$onSend$2, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public /* bridge */ /* synthetic */ void mo586invokeOnClose(wn0.l lVar) {
        invokeOnClose((wn0.l<? super Throwable, h0>) lVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @jn0.e
    public boolean offer(T t11) {
        return ProducerScope.DefaultImpls.offer(this, t11);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable cause, boolean handled) {
        signalCompleted(cause, handled);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(T t11, Continuation<? super h0> continuation) throws Throwable {
        C47861 c47861;
        RxObservableCoroutine<T> rxObservableCoroutine;
        if (continuation instanceof C47861) {
            c47861 = (C47861) continuation;
            int i11 = c47861.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47861.label = i11 - Integer.MIN_VALUE;
            } else {
                c47861 = new C47861(this, continuation);
            }
        } else {
            c47861 = new C47861(this, continuation);
        }
        Object obj = c47861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47861.label;
        if (i12 == 0) {
            t.b(obj);
            Mutex mutex = this.mutex;
            c47861.L$0 = this;
            c47861.L$1 = t11;
            c47861.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, c47861, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            rxObservableCoroutine = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t11 = (T) c47861.L$1;
            rxObservableCoroutine = (RxObservableCoroutine) c47861.L$0;
            t.b(obj);
        }
        Throwable thDoLockedNext = rxObservableCoroutine.doLockedNext(t11);
        if (thDoLockedNext == null) {
            return h0.f84049a;
        }
        throw thDoLockedNext;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo85trySendJP2dKIU(T element) {
        if (!Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return ChannelResult.INSTANCE.m544failurePtdJZtk();
        }
        Throwable thDoLockedNext = doLockedNext(element);
        return thDoLockedNext == null ? ChannelResult.INSTANCE.m545successJP2dKIU(h0.f84049a) : ChannelResult.INSTANCE.m543closedJP2dKIU(thDoLockedNext);
    }

    public Void invokeOnClose(wn0.l<? super Throwable, h0> handler) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(h0 value) {
        signalCompleted(null, false);
    }
}
