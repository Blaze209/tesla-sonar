package i0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import j0.n;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<ScheduledExecutorService> f74006b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f74007a;

    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return i0.c.e();
            }
            if (Looper.myLooper() != null) {
                return new e(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f74008a;

        b(Runnable runnable) {
            this.f74008a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f74008a.run();
            return null;
        }
    }

    private static class c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<androidx.concurrent.futures.c.a<V>> f74010a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f74011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<V> f74012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s<V> f74013d;

        class a implements androidx.concurrent.futures.c.InterfaceC0146c<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f74014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f74015b;

            /* JADX INFO: renamed from: i0.e$c$a$a, reason: collision with other inner class name */
            class RunnableC1547a implements Runnable {
                RunnableC1547a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f74010a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f74014a.removeCallbacks(c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f74014a = handler;
                this.f74015b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public Object a(@NonNull androidx.concurrent.futures.c.a<V> aVar) {
                aVar.a(new RunnableC1547a(), i0.c.b());
                c.this.f74010a.set(aVar);
                return "HandlerScheduledFuture-" + this.f74015b.toString();
            }
        }

        c(Handler handler, long j11, Callable<V> callable) {
            this.f74011b = j11;
            this.f74012c = callable;
            this.f74013d = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return this.f74013d.cancel(z11);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f74013d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f74011b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f74013d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f74013d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            androidx.concurrent.futures.c.a andSet = this.f74010a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f74012c.call());
                } catch (Exception e11) {
                    andSet.f(e11);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j11, @NonNull TimeUnit timeUnit) {
            return this.f74013d.get(j11, timeUnit);
        }
    }

    e(@NonNull Handler handler) {
        this.f74007a = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f74007a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        if (!this.f74007a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
        return schedule(new b(runnable), j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public ScheduledFuture<?> scheduleAtFixedRate(@NonNull Runnable runnable, long j11, long j12, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public ScheduledFuture<?> scheduleWithFixedDelay(@NonNull Runnable runnable, long j11, long j12, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public <V> ScheduledFuture<V> schedule(@NonNull Callable<V> callable, long j11, @NonNull TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j11, timeUnit);
        c cVar = new c(this.f74007a, jUptimeMillis, callable);
        return this.f74007a.postAtTime(cVar, jUptimeMillis) ? cVar : n.o(a());
    }
}
