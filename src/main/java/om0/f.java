package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j f98106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j f98107d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final c f98110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static boolean f98111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final a f98112i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadFactory f98113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a> f98114b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final TimeUnit f98109f = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f98108e = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f98115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f98116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final am0.a f98117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f98118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Future<?> f98119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ThreadFactory f98120f;

        a(long j11, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j11) : 0L;
            this.f98115a = nanos;
            this.f98116b = new ConcurrentLinkedQueue<>();
            this.f98117c = new am0.a();
            this.f98120f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f.f98107d);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f98118d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f98119e = scheduledFutureScheduleWithFixedDelay;
        }

        static void a(ConcurrentLinkedQueue<c> concurrentLinkedQueue, am0.a aVar) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.g() > jC) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    aVar.e(cVar);
                }
            }
        }

        static long c() {
            return System.nanoTime();
        }

        c b() {
            if (this.f98117c.isDisposed()) {
                return f.f98110g;
            }
            while (!this.f98116b.isEmpty()) {
                c cVarPoll = this.f98116b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f98120f);
            this.f98117c.b(cVar);
            return cVar;
        }

        void d(c cVar) {
            cVar.h(c() + this.f98115a);
            this.f98116b.offer(cVar);
        }

        void e() {
            this.f98117c.dispose();
            Future<?> future = this.f98119e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f98118d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f98116b, this.f98117c);
        }
    }

    static final class b extends t.c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f98122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f98123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f98124d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final am0.a f98121a = new am0.a();

        b(a aVar) {
            this.f98122b = aVar;
            this.f98123c = aVar.b();
        }

        @Override // am0.b
        public void dispose() {
            if (this.f98124d.compareAndSet(false, true)) {
                this.f98121a.dispose();
                if (f.f98111h) {
                    this.f98123c.a(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f98122b.d(this.f98123c);
                }
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f98124d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98122b.d(this.f98123c);
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            return this.f98121a.isDisposed() ? dm0.c.INSTANCE : this.f98123c.a(runnable, j11, timeUnit, this.f98121a);
        }
    }

    static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f98125c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f98125c = 0L;
        }

        public long g() {
            return this.f98125c;
        }

        public void h(long j11) {
            this.f98125c = j11;
        }
    }

    static {
        c cVar = new c(new j("RxCachedThreadSchedulerShutdown"));
        f98110g = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        j jVar = new j("RxCachedThreadScheduler", iMax);
        f98106c = jVar;
        f98107d = new j("RxCachedWorkerPoolEvictor", iMax);
        f98111h = Boolean.getBoolean("rx3.io-scheduled-release");
        a aVar = new a(0L, null, jVar);
        f98112i = aVar;
        aVar.e();
    }

    public f() {
        this(f98106c);
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new b(this.f98114b.get());
    }

    @Override // io.reactivex.rxjava3.core.t
    public void shutdown() {
        AtomicReference<a> atomicReference = this.f98114b;
        a aVar = f98112i;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.e();
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public void start() {
        a aVar = new a(f98108e, f98109f, this.f98113a);
        if (androidx.camera.view.i.a(this.f98114b, f98112i, aVar)) {
            return;
        }
        aVar.e();
    }

    public f(ThreadFactory threadFactory) {
        this.f98113a = threadFactory;
        this.f98114b = new AtomicReference<>(f98112i);
        start();
    }
}
