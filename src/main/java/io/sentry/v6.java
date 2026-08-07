package io.sentry;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class v6 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f81511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f81512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f81513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q7 f81514d;

    private static final class b<T> implements Future<T> {
        private b() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j11, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81515a;

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i11 = this.f81515a;
            this.f81515a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    v6(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, q7 q7Var) {
        this.f81512b = new io.sentry.util.a();
        this.f81513c = new Runnable() { // from class: io.sentry.t6
            @Override // java.lang.Runnable
            public final void run() {
                v6.e();
            }
        };
        this.f81511a = scheduledThreadPoolExecutor;
        this.f81514d = q7Var;
    }

    public static /* synthetic */ void d(v6 v6Var) {
        v6Var.getClass();
        for (int i11 = 0; i11 < 40; i11++) {
            try {
                v6Var.f81511a.schedule(v6Var.f81513c, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        v6Var.f81511a.purge();
    }

    public static /* synthetic */ void e() {
    }

    private boolean f() {
        if (this.f81511a.getQueue().size() >= 271) {
            this.f81511a.purge();
        }
        return this.f81511a.getQueue().size() < 271;
    }

    @Override // io.sentry.c1
    public void a() {
        try {
            this.f81511a.submit(new Runnable() { // from class: io.sentry.u6
                @Override // java.lang.Runnable
                public final void run() {
                    v6.d(this.f81447a);
                }
            });
        } catch (RejectedExecutionException e11) {
            q7 q7Var = this.f81514d;
            if (q7Var != null) {
                q7Var.getLogger().a(b7.WARNING, "Prewarm task rejected from " + this.f81511a, e11);
            }
        }
    }

    @Override // io.sentry.c1
    public Future<?> b(Runnable runnable, long j11) {
        return this.f81511a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.c1
    public void c(long j11) {
        d1 d1VarA = this.f81512b.a();
        try {
            if (!this.f81511a.isShutdown()) {
                this.f81511a.shutdown();
                try {
                    if (!this.f81511a.awaitTermination(j11, TimeUnit.MILLISECONDS)) {
                        this.f81511a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f81511a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.c1
    public boolean isClosed() {
        d1 d1VarA = this.f81512b.a();
        try {
            boolean zIsShutdown = this.f81511a.isShutdown();
            if (d1VarA != null) {
                d1VarA.close();
            }
            return zIsShutdown;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.c1
    public Future<?> submit(Runnable runnable) {
        if (f()) {
            return this.f81511a.submit(runnable);
        }
        q7 q7Var = this.f81514d;
        if (q7Var != null) {
            q7Var.getLogger().c(b7.WARNING, "Task " + runnable + " rejected from " + this.f81511a, new Object[0]);
        }
        return new b();
    }

    public v6(q7 q7Var) {
        this(new ScheduledThreadPoolExecutor(1, new c()), q7Var);
    }

    public v6() {
        this(new ScheduledThreadPoolExecutor(1, new c()), null);
    }
}
