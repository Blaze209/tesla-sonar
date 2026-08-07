package io.sentry.android.replay.util;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012Jä\u0001\u0010\u001b\u001a^\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\u0018\u00010\u001a0\u0018\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u0015H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJü\u0001\u0010\u001b\u001a^\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\u0018\u00010\u001a0\u0018\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u00152\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001eJ\u0090\u0001\u0010\u001f\u001a\n \n*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u0015H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J¨\u0001\u0010\u001f\u001a\n \n*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u00152\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\u001f\u0010!J\u0010\u0010\"\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b$\u0010#JH\u0010&\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010%0%2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u008a\u0001\u0010&\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010%0%\"\u0010\b\u0000\u0010(*\n \n*\u0004\u0018\u00010\u00130\u00132*\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u00162\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b&\u0010)JP\u0010+\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010%0%2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u000e\u0010*\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b+\u0010,JP\u0010-\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010%0%2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u000e\u0010*\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b-\u0010,J4\u0010.\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u001a0\u0018H\u0096\u0001¢\u0006\u0004\b.\u0010/Jf\u00100\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b0\u00101Jr\u00100\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132*\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b0\u00102J\u001d\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lio/sentry/android/replay/util/k;", "Ljava/util/concurrent/ScheduledExecutorService;", "delegate", "Lio/sentry/q7;", "options", "<init>", "(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/q7;)V", "", "p0", "Ljava/util/concurrent/TimeUnit;", "kotlin.jvm.PlatformType", "p1", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Runnable;", "Ljn0/h0;", "execute", "(Ljava/lang/Runnable;)V", "", "T", "", "Ljava/util/concurrent/Callable;", "", "", "Ljava/util/concurrent/Future;", "", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "p2", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "V", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "p3", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "shutdownNow", "()Ljava/util/List;", "submit", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "task", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "shutdown", "()V", "a", "Ljava/util/concurrent/ScheduledExecutorService;", "b", "Lio/sentry/q7;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    public k(ScheduledExecutorService delegate, q7 options) {
        s.k(delegate, "delegate");
        s.k(options, "options");
        this.delegate = delegate;
        this.options = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, k kVar) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            ILogger logger = kVar.options.getLogger();
            b7 b7Var = b7.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to execute task ");
            sb2.append(runnable instanceof l ? ((l) runnable).getTaskName() : "");
            logger.a(b7Var, sb2.toString(), th2);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long p11, TimeUnit p12) {
        return this.delegate.awaitTermination(p11, p12);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable p11) {
        this.delegate.execute(p11);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p11) {
        return this.delegate.invokeAll(p11);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p11) {
        return (T) this.delegate.invokeAny(p11);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable p11, long p12, TimeUnit p13) {
        return this.delegate.schedule(p11, p12, p13);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable p11, long p12, long p13, TimeUnit p14) {
        return this.delegate.scheduleAtFixedRate(p11, p12, p13, p14);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable p11, long p12, long p13, TimeUnit p14) {
        return this.delegate.scheduleWithFixedDelay(p11, p12, p13, p14);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this) {
            if (!isShutdown()) {
                this.delegate.shutdown();
            }
            try {
                if (!awaitTermination(this.options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    shutdownNow();
                }
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable p11, T p12) {
        return this.delegate.submit(p11, p12);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p11, long p12, TimeUnit p13) {
        return this.delegate.invokeAll(p11, p12, p13);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p11, long p12, TimeUnit p13) {
        return (T) this.delegate.invokeAny(p11, p12, p13);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> p11, long p12, TimeUnit p13) {
        return this.delegate.schedule(p11, p12, p13);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> p11) {
        return this.delegate.submit(p11);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable task) {
        s.k(task, "task");
        String name = Thread.currentThread().getName();
        s.j(name, "getName(...)");
        if (t.b0(name, "SentryReplayIntegration", false, 2, null)) {
            task.run();
            return null;
        }
        try {
            return this.delegate.submit(new Runnable() { // from class: io.sentry.android.replay.util.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.b(task, this);
                }
            });
        } catch (Throwable th2) {
            ILogger logger = this.options.getLogger();
            b7 b7Var = b7.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to submit task ");
            sb2.append(task instanceof l ? ((l) task).getTaskName() : "");
            sb2.append(" to executor");
            logger.a(b7Var, sb2.toString(), th2);
            return null;
        }
    }
}
