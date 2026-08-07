package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0002\u001a\u00020\u00018G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0014\"\u0004\b$\u0010\u0004¨\u0006%"}, d2 = {"Lokio/s;", "Lokio/s0;", "delegate", "<init>", "(Lokio/s0;)V", "b", "(Lokio/s0;)Lokio/s;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lokio/s0;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lokio/s0;", "clearTimeout", "()Lokio/s0;", "clearDeadline", "Ljn0/h0;", "throwIfReached", "()V", "cancel", "Ljava/util/concurrent/locks/Condition;", "condition", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "", "monitor", "waitUntilNotified", "(Ljava/lang/Object;)V", "a", "Lokio/s0;", "setDelegate", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class s extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private s0 delegate;

    public s(s0 delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s0 getDelegate() {
        return this.delegate;
    }

    @Override // okio.s0
    public void awaitSignal(Condition condition) throws InterruptedIOException {
        p013kotlin.jvm.internal.s.k(condition, "condition");
        this.delegate.awaitSignal(condition);
    }

    public final s b(s0 delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }

    @Override // okio.s0
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // okio.s0
    public s0 clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // okio.s0
    public s0 clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // okio.s0
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @Override // okio.s0
    /* JADX INFO: renamed from: hasDeadline */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // okio.s0
    public void throwIfReached() throws InterruptedIOException {
        this.delegate.throwIfReached();
    }

    @Override // okio.s0
    public s0 timeout(long timeout, TimeUnit unit) {
        p013kotlin.jvm.internal.s.k(unit, "unit");
        return this.delegate.timeout(timeout, unit);
    }

    @Override // okio.s0
    /* JADX INFO: renamed from: timeoutNanos */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @Override // okio.s0
    public void waitUntilNotified(Object monitor) throws InterruptedIOException {
        p013kotlin.jvm.internal.s.k(monitor, "monitor");
        this.delegate.waitUntilNotified(monitor);
    }

    @Override // okio.s0
    public s0 deadlineNanoTime(long deadlineNanoTime) {
        return this.delegate.deadlineNanoTime(deadlineNanoTime);
    }
}
