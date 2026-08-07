package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j f98159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final ScheduledExecutorService f98160d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadFactory f98161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f98162b;

    static final class a extends t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f98163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final am0.a f98164b = new am0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f98165c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f98163a = scheduledExecutorService;
        }

        @Override // am0.b
        public void dispose() {
            if (this.f98165c) {
                return;
            }
            this.f98165c = true;
            this.f98164b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f98165c;
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (this.f98165c) {
                return dm0.c.INSTANCE;
            }
            m mVar = new m(tm0.a.t(runnable), this.f98164b);
            this.f98164b.b(mVar);
            try {
                mVar.a(j11 <= 0 ? this.f98163a.submit((Callable) mVar) : this.f98163a.schedule((Callable) mVar, j11, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e11) {
                dispose();
                tm0.a.r(e11);
                return dm0.c.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f98160d = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f98159c = new j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public p() {
        this(f98159c);
    }

    static ScheduledExecutorService a(ThreadFactory threadFactory) {
        return n.a(threadFactory);
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new a(this.f98162b.get());
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        l lVar = new l(tm0.a.t(runnable), true);
        try {
            lVar.b(j11 <= 0 ? this.f98162b.get().submit(lVar) : this.f98162b.get().schedule(lVar, j11, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e11) {
            tm0.a.r(e11);
            return dm0.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b schedulePeriodicallyDirect(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        Runnable runnableT = tm0.a.t(runnable);
        if (j12 > 0) {
            k kVar = new k(runnableT, true);
            try {
                kVar.b(this.f98162b.get().scheduleAtFixedRate(kVar, j11, j12, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e11) {
                tm0.a.r(e11);
                return dm0.c.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f98162b.get();
        e eVar = new e(runnableT, scheduledExecutorService);
        try {
            eVar.b(j11 <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j11, timeUnit));
            return eVar;
        } catch (RejectedExecutionException e12) {
            tm0.a.r(e12);
            return dm0.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public void shutdown() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f98162b;
        ScheduledExecutorService scheduledExecutorService = f98160d;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceA = null;
        do {
            scheduledExecutorService = this.f98162b.get();
            if (scheduledExecutorService != f98160d) {
                if (scheduledExecutorServiceA != null) {
                    scheduledExecutorServiceA.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceA == null) {
                scheduledExecutorServiceA = a(this.f98161a);
            }
        } while (!androidx.camera.view.i.a(this.f98162b, scheduledExecutorService, scheduledExecutorServiceA));
    }

    public p(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f98162b = atomicReference;
        this.f98161a = threadFactory;
        atomicReference.lazySet(a(threadFactory));
    }
}
