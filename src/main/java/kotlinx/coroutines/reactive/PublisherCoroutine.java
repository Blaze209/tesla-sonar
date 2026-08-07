package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import jn0.e;
import jn0.g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import nr0.c;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B7\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0019\u0010#\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020'2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b7\u0010!J\u000f\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\b8\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0016\u0010;\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R,\u0010E\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A0@8VX\u0096\u0004¢\u0006\f\u0012\u0004\bD\u0010\u001c\u001a\u0004\bB\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u000b\u0010L\u001a\u00020K8\u0002X\u0082\u0004¨\u0006M"}, d2 = {"Lkotlinx/coroutines/reactive/PublisherCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljn0/h0;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lnr0/c;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lnr0/b;", "subscriber", "Lkotlin/Function2;", "", "exceptionOnCancelHandler", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lnr0/b;Lwn0/p;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "element", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "selectResult", "processResultSelectSend", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "elem", "doLockedNext", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "unlockAndCheckCompleted", "()V", "cause", "", "handled", "doLockedSignalCompleted", "(Ljava/lang/Throwable;Z)V", "signalCompleted", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "", "invokeOnClose", "(Lwn0/l;)Ljava/lang/Void;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "n", "request", "(J)V", "value", "onCompleted", "(Ljn0/h0;)V", "onCancelled", "cancel", "Lnr0/b;", "Lwn0/p;", "cancelled", "Z", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "onSend", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "isClosedForSend", "()Z", "Lkotlinx/atomicfu/AtomicLong;", "_nRequested", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PublisherCoroutine<T> extends AbstractCoroutine<h0> implements ProducerScope<T>, c {
    private static final /* synthetic */ AtomicLongFieldUpdater _nRequested$volatile$FU = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;
    private final p<Throwable, CoroutineContext, h0> exceptionOnCancelHandler;
    private final Mutex mutex;
    private final nr0.b<T> subscriber;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectForSend$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectForSend$1", f = "Publish.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ PublisherCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PublisherCoroutine<? super T> publisherCoroutine, SelectInstance<?> selectInstance, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = publisherCoroutine;
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
                Mutex mutex = ((PublisherCoroutine) this.this$0).mutex;
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
            PublisherCoroutine<T> publisherCoroutine = this.this$0;
            h0 h0Var = h0.f84049a;
            if (!selectInstance.trySelect(publisherCoroutine, h0Var)) {
                Mutex.DefaultImpls.unlock$default(((PublisherCoroutine) this.this$0).mutex, null, 1, null);
            }
            return h0Var;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.PublisherCoroutine$send$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", i = {0, 0}, l = {128}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class C47801 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PublisherCoroutine<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C47801(PublisherCoroutine<? super T> publisherCoroutine, Continuation<? super C47801> continuation) {
            super(continuation);
            this.this$0 = publisherCoroutine;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublisherCoroutine(CoroutineContext coroutineContext, nr0.b<T> bVar, p<? super Throwable, ? super CoroutineContext, h0> pVar) {
        super(coroutineContext, false, true);
        this.subscriber = bVar;
        this.exceptionOnCancelHandler = pVar;
        this.mutex = MutexKt.Mutex(true);
    }

    private final Throwable doLockedNext(T elem) {
        long j11;
        long j12;
        if (elem == null) {
            unlockAndCheckCompleted();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        }
        if (!isActive()) {
            unlockAndCheckCompleted();
            return getCancellationException();
        }
        try {
            this.subscriber.onNext(elem);
            do {
                j11 = _nRequested$volatile$FU.get(this);
                if (j11 >= 0 && j11 != Long.MAX_VALUE) {
                    j12 = j11 - 1;
                }
                unlockAndCheckCompleted();
                return null;
            } while (!_nRequested$volatile$FU.compareAndSet(this, j11, j12));
            if (j12 == 0) {
                return null;
            }
            unlockAndCheckCompleted();
            return null;
        } catch (Throwable th2) {
            this.cancelled = true;
            boolean zClose = close(th2);
            unlockAndCheckCompleted();
            if (zClose) {
                return th2;
            }
            this.exceptionOnCancelHandler.invoke(th2, get$context());
            return getCancellationException();
        }
    }

    private final void doLockedSignalCompleted(Throwable cause, boolean handled) {
        try {
            if (_nRequested$volatile$FU.get(this) != -2) {
                _nRequested$volatile$FU.set(this, -2L);
                if (this.cancelled) {
                    if (cause != null && !handled) {
                        this.exceptionOnCancelHandler.invoke(cause, get$context());
                    }
                } else if (cause == null) {
                    try {
                        this.subscriber.onComplete();
                    } catch (Throwable th2) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), th2);
                    }
                } else {
                    try {
                        this.subscriber.onError(cause);
                    } catch (Throwable th3) {
                        if (th3 != cause) {
                            g.a(cause, th3);
                        }
                        CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), cause);
                    }
                }
            }
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        } catch (Throwable th4) {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
            throw th4;
        }
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private final /* synthetic */ long get_nRequested$volatile() {
        return this._nRequested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object processResultSelectSend(Object element, Object selectResult) throws Throwable {
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

    private final /* synthetic */ void set_nRequested$volatile(long j11) {
        this._nRequested$volatile = j11;
    }

    private final void signalCompleted(Throwable cause, boolean handled) {
        long j11;
        do {
            j11 = _nRequested$volatile$FU.get(this);
            if (j11 == -2) {
                return;
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
        } while (!_nRequested$volatile$FU.compareAndSet(this, j11, -1L));
        if (j11 == 0) {
            doLockedSignalCompleted(cause, handled);
        } else if (Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(cause, handled);
        }
    }

    private final void unlockAndCheckCompleted() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        if (isCompleted() && Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
        }
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public void cancel() throws Throwable {
        this.cancelled = true;
        super.cancel((CancellationException) null);
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
        PublisherCoroutine$onSend$1 publisherCoroutine$onSend$1 = PublisherCoroutine$onSend$1.INSTANCE;
        s.i(publisherCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) u0.g(publisherCoroutine$onSend$1, 3);
        PublisherCoroutine$onSend$2 publisherCoroutine$onSend$2 = PublisherCoroutine$onSend$2.INSTANCE;
        s.i(publisherCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, qVar, (q) u0.g(publisherCoroutine$onSend$2, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo586invokeOnClose(l lVar) {
        invokeOnClose((l<? super Throwable, h0>) lVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @e
    public boolean offer(T t11) {
        return ProducerScope.DefaultImpls.offer(this, t11);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable cause, boolean handled) {
        signalCompleted(cause, handled);
    }

    @Override // nr0.c
    public void request(long n11) {
        long j11;
        long j12;
        if (n11 <= 0) {
            cancelCoroutine(new IllegalArgumentException("non-positive subscription request " + n11));
            return;
        }
        do {
            j11 = _nRequested$volatile$FU.get(this);
            if (j11 < 0) {
                return;
            }
            long j13 = j11 + n11;
            j12 = (j13 < 0 || n11 == Long.MAX_VALUE) ? Long.MAX_VALUE : j13;
            if (j11 == j12) {
                return;
            }
        } while (!_nRequested$volatile$FU.compareAndSet(this, j11, j12));
        if (j11 == 0) {
            unlockAndCheckCompleted();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(T t11, Continuation<? super h0> continuation) throws Throwable {
        C47801 c47801;
        PublisherCoroutine<T> publisherCoroutine;
        if (continuation instanceof C47801) {
            c47801 = (C47801) continuation;
            int i11 = c47801.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47801.label = i11 - Integer.MIN_VALUE;
            } else {
                c47801 = new C47801(this, continuation);
            }
        } else {
            c47801 = new C47801(this, continuation);
        }
        Object obj = c47801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47801.label;
        if (i12 == 0) {
            t.b(obj);
            Mutex mutex = this.mutex;
            c47801.L$0 = this;
            c47801.L$1 = t11;
            c47801.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, c47801, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            publisherCoroutine = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t11 = (T) c47801.L$1;
            publisherCoroutine = (PublisherCoroutine) c47801.L$0;
            t.b(obj);
        }
        Throwable thDoLockedNext = publisherCoroutine.doLockedNext(t11);
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

    public Void invokeOnClose(l<? super Throwable, h0> handler) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(h0 value) {
        signalCompleted(null, false);
    }
}
