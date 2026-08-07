package om0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t f98078d = vm0.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f98079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f98080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Executor f98081c;

    final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f98082a;

        a(b bVar) {
            this.f98082a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f98082a;
            bVar.f98085b.a(d.this.scheduleDirect(bVar));
        }
    }

    static final class b extends AtomicReference<Runnable> implements Runnable, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dm0.e f98084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dm0.e f98085b;

        b(Runnable runnable) {
            super(runnable);
            this.f98084a = new dm0.e();
            this.f98085b = new dm0.e();
        }

        @Override // am0.b
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f98084a.dispose();
                this.f98085b.dispose();
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                        lazySet(null);
                        this.f98084a.lazySet(dm0.b.DISPOSED);
                        dm0.e eVar = this.f98085b;
                    } finally {
                        lazySet(null);
                        this.f98084a.lazySet(dm0.b.DISPOSED);
                        this.f98085b.lazySet(dm0.b.DISPOSED);
                    }
                } catch (Throwable th2) {
                    tm0.a.r(th2);
                    throw th2;
                }
            }
        }
    }

    public d(Executor executor, boolean z11, boolean z12) {
        this.f98081c = executor;
        this.f98079a = z11;
        this.f98080b = z12;
    }

    @Override // io.reactivex.rxjava3.core.t
    public t.c createWorker() {
        return new c(this.f98081c, this.f98079a, this.f98080b);
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable runnable) {
        Runnable runnableT = tm0.a.t(runnable);
        try {
            if (this.f98081c instanceof ExecutorService) {
                l lVar = new l(runnableT, this.f98079a);
                lVar.b(((ExecutorService) this.f98081c).submit(lVar));
                return lVar;
            }
            if (this.f98079a) {
                c.b bVar = new c.b(runnableT, null);
                this.f98081c.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnableT);
            this.f98081c.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e11) {
            tm0.a.r(e11);
            return dm0.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b schedulePeriodicallyDirect(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        if (!(this.f98081c instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j11, j12, timeUnit);
        }
        try {
            k kVar = new k(tm0.a.t(runnable), this.f98079a);
            kVar.b(((ScheduledExecutorService) this.f98081c).scheduleAtFixedRate(kVar, j11, j12, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e11) {
            tm0.a.r(e11);
            return dm0.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public am0.b scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        Runnable runnableT = tm0.a.t(runnable);
        if (this.f98081c instanceof ScheduledExecutorService) {
            try {
                l lVar = new l(runnableT, this.f98079a);
                lVar.b(((ScheduledExecutorService) this.f98081c).schedule(lVar, j11, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e11) {
                tm0.a.r(e11);
                return dm0.c.INSTANCE;
            }
        }
        b bVar = new b(runnableT);
        bVar.f98084a.a(f98078d.scheduleDirect(new a(bVar), j11, timeUnit));
        return bVar;
    }

    public static final class c extends t.c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f98086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f98087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f98088c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f98090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f98091f = new AtomicInteger();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final am0.a f98092g = new am0.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final nm0.a<Runnable> f98089d = new nm0.a<>();

        static final class a extends AtomicBoolean implements Runnable, am0.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Runnable f98093a;

            a(Runnable runnable) {
                this.f98093a = runnable;
            }

            @Override // am0.b
            public void dispose() {
                lazySet(true);
            }

            @Override // am0.b
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f98093a.run();
                    lazySet(true);
                } catch (Throwable th2) {
                    try {
                        tm0.a.r(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        lazySet(true);
                        throw th3;
                    }
                }
            }
        }

        static final class b extends AtomicInteger implements Runnable, am0.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Runnable f98094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final am0.c f98095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            volatile Thread f98096c;

            b(Runnable runnable, am0.c cVar) {
                this.f98094a = runnable;
                this.f98095b = cVar;
            }

            void a() {
                am0.c cVar = this.f98095b;
                if (cVar != null) {
                    cVar.a(this);
                }
            }

            @Override // am0.b
            public void dispose() {
                while (true) {
                    int i11 = get();
                    if (i11 >= 2) {
                        return;
                    }
                    if (i11 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f98096c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f98096c = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // am0.b
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f98096c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f98096c = null;
                        return;
                    }
                    try {
                        this.f98094a.run();
                        this.f98096c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th2) {
                        try {
                            tm0.a.r(th2);
                            throw th2;
                        } catch (Throwable th3) {
                            this.f98096c = null;
                            if (compareAndSet(1, 2)) {
                                a();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: om0.d$c$c, reason: collision with other inner class name */
        final class RunnableC2108c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final dm0.e f98097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Runnable f98098b;

            RunnableC2108c(dm0.e eVar, Runnable runnable) {
                this.f98097a = eVar;
                this.f98098b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f98097a.a(c.this.schedule(this.f98098b));
            }
        }

        public c(Executor executor, boolean z11, boolean z12) {
            this.f98088c = executor;
            this.f98086a = z11;
            this.f98087b = z12;
        }

        void a() {
            nm0.a<Runnable> aVar = this.f98089d;
            int iAddAndGet = 1;
            while (!this.f98090e) {
                while (true) {
                    Runnable runnablePoll = aVar.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.f98090e) {
                        aVar.clear();
                        return;
                    }
                }
                if (this.f98090e) {
                    aVar.clear();
                    return;
                } else {
                    iAddAndGet = this.f98091f.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar.clear();
        }

        void b() {
            nm0.a<Runnable> aVar = this.f98089d;
            if (this.f98090e) {
                aVar.clear();
                return;
            }
            aVar.poll().run();
            if (this.f98090e) {
                aVar.clear();
            } else if (this.f98091f.decrementAndGet() != 0) {
                this.f98088c.execute(this);
            }
        }

        @Override // am0.b
        public void dispose() {
            if (this.f98090e) {
                return;
            }
            this.f98090e = true;
            this.f98092g.dispose();
            if (this.f98091f.getAndIncrement() == 0) {
                this.f98089d.clear();
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f98090e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98087b) {
                b();
            } else {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable) {
            am0.b aVar;
            if (this.f98090e) {
                return dm0.c.INSTANCE;
            }
            Runnable runnableT = tm0.a.t(runnable);
            if (this.f98086a) {
                aVar = new b(runnableT, this.f98092g);
                this.f98092g.b(aVar);
            } else {
                aVar = new a(runnableT);
            }
            this.f98089d.offer(aVar);
            if (this.f98091f.getAndIncrement() != 0) {
                return aVar;
            }
            try {
                this.f98088c.execute(this);
                return aVar;
            } catch (RejectedExecutionException e11) {
                this.f98090e = true;
                this.f98089d.clear();
                tm0.a.r(e11);
                return dm0.c.INSTANCE;
            }
        }

        @Override // io.reactivex.rxjava3.core.t.c
        public am0.b schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            if (j11 <= 0) {
                return schedule(runnable);
            }
            if (this.f98090e) {
                return dm0.c.INSTANCE;
            }
            dm0.e eVar = new dm0.e();
            dm0.e eVar2 = new dm0.e(eVar);
            m mVar = new m(new RunnableC2108c(eVar2, tm0.a.t(runnable)), this.f98092g);
            this.f98092g.b(mVar);
            Executor executor = this.f98088c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.a(((ScheduledExecutorService) executor).schedule((Callable) mVar, j11, timeUnit));
                } catch (RejectedExecutionException e11) {
                    this.f98090e = true;
                    tm0.a.r(e11);
                    return dm0.c.INSTANCE;
                }
            } else {
                mVar.a(new om0.c(d.f98078d.scheduleDirect(mVar, j11, timeUnit)));
            }
            eVar.a(mVar);
            return eVar2;
        }
    }
}
