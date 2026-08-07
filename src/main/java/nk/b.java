package nk;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractExecutorService {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class<?> f95071h = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f95073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f95074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Runnable> f95075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f95076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f95077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f95078g;

    private class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f95075d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    qk.a.y(b.f95071h, "%s: Worker has nothing to run", b.this.f95072a);
                }
            } finally {
                int iDecrementAndGet = b.this.f95077f.decrementAndGet();
                if (b.this.f95075d.isEmpty()) {
                    qk.a.z(b.f95071h, "%s: worker finished; %d workers left", b.this.f95072a, Integer.valueOf(iDecrementAndGet));
                } else {
                    b.this.g();
                }
            }
        }

        private a() {
        }
    }

    public b(String str, int i11, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.f95072a = str;
        this.f95073b = executor;
        this.f95074c = i11;
        this.f95075d = blockingQueue;
        this.f95076e = new a();
        this.f95077f = new AtomicInteger(0);
        this.f95078g = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i11 = this.f95077f.get();
        while (i11 < this.f95074c) {
            int i12 = i11 + 1;
            if (this.f95077f.compareAndSet(i11, i12)) {
                qk.a.A(f95071h, "%s: starting worker %d of %d", this.f95072a, Integer.valueOf(i12), Integer.valueOf(this.f95074c));
                this.f95073b.execute(this.f95076e);
                return;
            } else {
                qk.a.y(f95071h, "%s: race in startWorkerIfNeeded; retrying", this.f95072a);
                i11 = this.f95077f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f95075d.offer(runnable)) {
            throw new RejectedExecutionException(this.f95072a + " queue is full, size=" + this.f95075d.size());
        }
        int size = this.f95075d.size();
        int i11 = this.f95078g.get();
        if (size > i11 && this.f95078g.compareAndSet(i11, size)) {
            qk.a.z(f95071h, "%s: max pending work in queue = %d", this.f95072a, Integer.valueOf(size));
        }
        g();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
