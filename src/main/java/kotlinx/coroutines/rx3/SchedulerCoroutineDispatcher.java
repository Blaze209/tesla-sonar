package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlinx/coroutines/rx3/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lio/reactivex/rxjava3/core/t;", "scheduler", "<init>", "(Lio/reactivex/rxjava3/core/t;)V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ljn0/h0;", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lio/reactivex/rxjava3/core/t;", "getScheduler", "()Lio/reactivex/rxjava3/core/t;", "kotlinx-coroutines-rx3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SchedulerCoroutineDispatcher extends CoroutineDispatcher implements Delay {
    private final t scheduler;

    public SchedulerCoroutineDispatcher(t tVar) {
        this.scheduler = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleResumeAfterDelay$lambda$1(CancellableContinuation cancellableContinuation, SchedulerCoroutineDispatcher schedulerCoroutineDispatcher) {
        cancellableContinuation.resumeUndispatched(schedulerCoroutineDispatcher, h0.f84049a);
    }

    @Override // kotlinx.coroutines.Delay
    @jn0.e
    public Object delay(long j11, Continuation<? super h0> continuation) {
        return Delay.DefaultImpls.delay(this, j11, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo574dispatch(CoroutineContext context, Runnable block) {
        this.scheduler.scheduleDirect(block);
    }

    public boolean equals(Object other) {
        return (other instanceof SchedulerCoroutineDispatcher) && ((SchedulerCoroutineDispatcher) other).scheduler == this.scheduler;
    }

    public final t getScheduler() {
        return this.scheduler;
    }

    public int hashCode() {
        return System.identityHashCode(this.scheduler);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, CoroutineContext context) {
        final am0.b bVarScheduleDirect = this.scheduler.scheduleDirect(block, timeMillis, TimeUnit.MILLISECONDS);
        return new DisposableHandle() { // from class: kotlinx.coroutines.rx3.o
            @Override // kotlinx.coroutines.DisposableHandle
            public final void dispose() {
                bVarScheduleDirect.dispose();
            }
        };
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo575scheduleResumeAfterDelay(long timeMillis, final CancellableContinuation<? super h0> continuation) {
        RxAwaitKt.disposeOnCancellation(continuation, this.scheduler.scheduleDirect(new Runnable() { // from class: kotlinx.coroutines.rx3.n
            @Override // java.lang.Runnable
            public final void run() {
                SchedulerCoroutineDispatcher.scheduleResumeAfterDelay$lambda$1(continuation, this);
            }
        }, timeMillis, TimeUnit.MILLISECONDS));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return this.scheduler.toString();
    }
}
