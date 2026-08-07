package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006#"}, d2 = {"Lkotlinx/coroutines/rx3/DispatcherScheduler;", "Lio/reactivex/rxjava3/core/t;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Lam0/b;", "scheduleDirect", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lam0/b;", "Lio/reactivex/rxjava3/core/t$c;", "createWorker", "()Lio/reactivex/rxjava3/core/t$c;", "Ljn0/h0;", "shutdown", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CompletableJob;", "schedulerJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/atomicfu/AtomicLong;", "workerCounter", "DispatcherWorker", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DispatcherScheduler extends t {
    private static final /* synthetic */ AtomicLongFieldUpdater workerCounter$volatile$FU = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter$volatile");
    public final CoroutineDispatcher dispatcher;
    private final CompletableJob schedulerJob;
    private final CoroutineScope scope;
    private volatile /* synthetic */ long workerCounter$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R0\u0010(\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160&\u0012\u0006\u0012\u0004\u0018\u00010'0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lkotlinx/coroutines/rx3/DispatcherScheduler$DispatcherWorker;", "Lio/reactivex/rxjava3/core/t$c;", "", "counter", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/Job;", "parentJob", "<init>", "(JLkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/Job;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Lam0/b;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lam0/b;", "", "isDisposed", "()Z", "Ljn0/h0;", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "J", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CompletableJob;", "workerJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CoroutineScope;", "workerScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "blockChannel", "Lkotlinx/coroutines/channels/Channel;", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DispatcherWorker extends t.c {
        private final Channel<wn0.l<Continuation<? super h0>, Object>> blockChannel;
        private final long counter;
        private final CoroutineDispatcher dispatcher;
        private final CompletableJob workerJob;
        private final CoroutineScope workerScope;

        /* JADX INFO: renamed from: kotlinx.coroutines.rx3.DispatcherScheduler$DispatcherWorker$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.rx3.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", i = {0, 1}, l = {183, 78}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$0", "L$0"})
        static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
            Object L$0;
            Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return DispatcherWorker.this.new AnonymousClass1(continuation);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004a  */
            /* JADX WARN: Code duplicated, block: B:21:0x004b  */
            /* JADX WARN: Code duplicated, block: B:24:0x0056 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x003e, B:22:0x004e, B:24:0x0056, B:27:0x0069, B:14:0x002d, B:17:0x003a), top: B:36:0x0008 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x003e, B:22:0x004e, B:24:0x0056, B:27:0x0069, B:14:0x002d, B:17:0x003a), top: B:36:0x0008 }] */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
            
                if (r7.invoke(r6) == r0) goto L26;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:8:0x0019). Please report as a decompilation issue!!! */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r6.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r4 = r6.L$0
                    kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
                    jn0.t.b(r7)     // Catch: java.lang.Throwable -> L1b
                L19:
                    r7 = r1
                    goto L3e
                L1b:
                    r7 = move-exception
                    goto L72
                L1d:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L25:
                    java.lang.Object r1 = r6.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r4 = r6.L$0
                    kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
                    jn0.t.b(r7)     // Catch: java.lang.Throwable -> L1b
                    goto L4e
                L31:
                    jn0.t.b(r7)
                    kotlinx.coroutines.rx3.DispatcherScheduler$DispatcherWorker r7 = kotlinx.coroutines.rx3.DispatcherScheduler.DispatcherWorker.this
                    kotlinx.coroutines.channels.Channel r4 = kotlinx.coroutines.rx3.DispatcherScheduler.DispatcherWorker.access$getBlockChannel$p(r7)
                    kotlinx.coroutines.channels.ChannelIterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L1b
                L3e:
                    r6.L$0 = r4     // Catch: java.lang.Throwable -> L1b
                    r6.L$1 = r7     // Catch: java.lang.Throwable -> L1b
                    r6.label = r3     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r1 = r7.hasNext(r6)     // Catch: java.lang.Throwable -> L1b
                    if (r1 != r0) goto L4b
                    goto L68
                L4b:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L4e:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L1b
                    boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L1b
                    if (r7 == 0) goto L69
                    java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L1b
                    wn0.l r7 = (wn0.l) r7     // Catch: java.lang.Throwable -> L1b
                    r6.L$0 = r4     // Catch: java.lang.Throwable -> L1b
                    r6.L$1 = r1     // Catch: java.lang.Throwable -> L1b
                    r6.label = r2     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L1b
                    if (r7 != r0) goto L19
                L68:
                    return r0
                L69:
                    jn0.h0 r7 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L1b
                    r7 = 0
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
                    jn0.h0 r7 = jn0.h0.f84049a
                    return r7
                L72:
                    throw r7     // Catch: java.lang.Throwable -> L73
                L73:
                    r0 = move-exception
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.DispatcherScheduler.DispatcherWorker.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        public DispatcherWorker(long j11, CoroutineDispatcher coroutineDispatcher, Job job) {
            this.counter = j11;
            this.dispatcher = coroutineDispatcher;
            CompletableJob completableJobSupervisorJob = SupervisorKt.SupervisorJob(job);
            this.workerJob = completableJobSupervisorJob;
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob.plus(coroutineDispatcher));
            this.workerScope = CoroutineScope;
            this.blockChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Runnable schedule$lambda$1(final DispatcherWorker dispatcherWorker, final wn0.l lVar) {
            return new Runnable() { // from class: kotlinx.coroutines.rx3.c
                @Override // java.lang.Runnable
                public final void run() {
                    DispatcherScheduler.DispatcherWorker.schedule$lambda$1$lambda$0(this.f89250a, lVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void schedule$lambda$1$lambda$0(DispatcherWorker dispatcherWorker, wn0.l lVar) {
            dispatcherWorker.blockChannel.mo85trySendJP2dKIU(lVar);
        }

        @Override // am0.b
        public void dispose() {
            SendChannel.DefaultImpls.close$default(this.blockChannel, null, 1, null);
            Job.DefaultImpls.cancel$default((Job) this.workerJob, (CancellationException) null, 1, (Object) null);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return !CoroutineScopeKt.isActive(this.workerScope);
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable block, long delay, TimeUnit unit) {
            return RxSchedulerKt.scheduleTask(this.workerScope, block, unit.toMillis(delay), new wn0.l() { // from class: kotlinx.coroutines.rx3.d
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return DispatcherScheduler.DispatcherWorker.schedule$lambda$1(this.f89252a, (wn0.l) obj);
                }
            });
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.dispatcher);
            sb2.append(" (worker ");
            sb2.append(this.counter);
            sb2.append(", ");
            sb2.append(isDisposed() ? "disposed" : "active");
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        }
    }

    public DispatcherScheduler(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.schedulerJob = completableJobSupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(coroutineDispatcher));
        this.workerCounter$volatile = 1L;
    }

    private final /* synthetic */ long getWorkerCounter$volatile() {
        return this.workerCounter$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable scheduleDirect$lambda$1(final DispatcherScheduler dispatcherScheduler, final wn0.l lVar) {
        return new Runnable() { // from class: kotlinx.coroutines.rx3.a
            @Override // java.lang.Runnable
            public final void run() {
                DispatcherScheduler.scheduleDirect$lambda$1$lambda$0(this.f89247a, lVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleDirect$lambda$1$lambda$0(DispatcherScheduler dispatcherScheduler, wn0.l lVar) {
        BuildersKt__Builders_commonKt.launch$default(dispatcherScheduler.scope, null, null, new DispatcherScheduler$scheduleDirect$1$1$1(lVar, null), 3, null);
    }

    private final /* synthetic */ void setWorkerCounter$volatile(long j11) {
        this.workerCounter$volatile = j11;
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new DispatcherWorker(workerCounter$volatile$FU.getAndIncrement(this), this.dispatcher, this.schedulerJob);
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable block, long delay, TimeUnit unit) {
        return RxSchedulerKt.scheduleTask(this.scope, block, unit.toMillis(delay), new wn0.l() { // from class: kotlinx.coroutines.rx3.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return DispatcherScheduler.scheduleDirect$lambda$1(this.f89249a, (wn0.l) obj);
            }
        });
    }

    @Override // io.reactivex.rxjava3.core.t
    public void shutdown() {
        Job.DefaultImpls.cancel$default((Job) this.schedulerJob, (CancellationException) null, 1, (Object) null);
    }

    public String toString() {
        return this.dispatcher.getName();
    }
}
