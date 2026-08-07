package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    private static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f43833a;

        a(ExecutorService executorService) {
            this.f43833a = (ExecutorService) ou.p.m(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j11, TimeUnit timeUnit) {
            return this.f43833a.awaitTermination(j11, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f43833a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f43833a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f43833a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f43833a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f43833a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f43833a + "]";
        }
    }

    private static final class b extends a implements ScheduledExecutorService, u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f43834b;

        private static final class a<V> extends k.a<V> implements t<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledFuture<?> f43835b;

            a(s<V> sVar, ScheduledFuture<?> scheduledFuture) {
                super(sVar);
                this.f43835b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
            public boolean cancel(boolean z11) {
                boolean zCancel = super.cancel(z11);
                if (zCancel) {
                    this.f43835b.cancel(z11);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f43835b.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f43835b.compareTo(delayed);
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.w$b$b, reason: collision with other inner class name */
        private static final class RunnableC0691b extends com.google.common.util.concurrent.a.f<Void> implements Runnable {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Runnable f43836h;

            RunnableC0691b(Runnable runnable) {
                this.f43836h = (Runnable) ou.p.m(runnable);
            }

            @Override // com.google.common.util.concurrent.a
            protected String L() {
                return "task=[" + this.f43836h + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f43836h.run();
                } catch (Throwable th2) {
                    N(th2);
                    throw th2;
                }
            }
        }

        b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f43834b = (ScheduledExecutorService) ou.p.m(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<?> schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
            b0 b0VarQ = b0.Q(runnable, null);
            return new a(b0VarQ, this.f43834b.schedule(b0VarQ, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <V> t<V> schedule(Callable<V> callable, long j11, TimeUnit timeUnit) {
            b0 b0VarR = b0.R(callable);
            return new a(b0VarR, this.f43834b.schedule(b0VarR, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t<?> scheduleAtFixedRate(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            RunnableC0691b runnableC0691b = new RunnableC0691b(runnable);
            return new a(runnableC0691b, this.f43834b.scheduleAtFixedRate(runnableC0691b, j11, j12, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public t<?> scheduleWithFixedDelay(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
            RunnableC0691b runnableC0691b = new RunnableC0691b(runnable);
            return new a(runnableC0691b, this.f43834b.scheduleWithFixedDelay(runnableC0691b, j11, j12, timeUnit));
        }
    }

    public static /* synthetic */ void a(Executor executor, com.google.common.util.concurrent.a aVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e11) {
            aVar.N(e11);
        }
    }

    public static Executor b() {
        return g.INSTANCE;
    }

    public static u c(ExecutorService executorService) {
        if (executorService instanceof u) {
            return (u) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new b((ScheduledExecutorService) executorService) : new a(executorService);
    }

    static Executor d(final Executor executor, final com.google.common.util.concurrent.a<?> aVar) {
        ou.p.m(executor);
        ou.p.m(aVar);
        return executor == b() ? executor : new Executor() { // from class: com.google.common.util.concurrent.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                w.a(executor, aVar, runnable);
            }
        };
    }
}
