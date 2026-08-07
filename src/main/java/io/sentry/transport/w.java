package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.n5;
import io.sentry.o5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class w extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f81403f = io.sentry.l.i(2000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f81404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n5 f81405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f81406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o5 f81407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f81408e;

    static final class a<T> implements Future<T> {
        a() {
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

    public w(int i11, int i12, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, o5 o5Var) {
        super(i11, i11, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f81405b = null;
        this.f81408e = new b0();
        this.f81404a = i12;
        this.f81406c = iLogger;
        this.f81407d = o5Var;
    }

    public boolean a() {
        n5 n5Var = this.f81405b;
        return n5Var != null && this.f81407d.now().b(n5Var) < f81403f;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f81408e.a();
        }
    }

    public boolean b() {
        return this.f81408e.b() < this.f81404a;
    }

    void d(long j11) {
        try {
            this.f81408e.d(j11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            this.f81406c.a(b7.ERROR, "Failed to wait till idle", e11);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (!b()) {
            this.f81405b = this.f81407d.now();
            this.f81406c.c(b7.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        this.f81408e.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e11) {
            this.f81408e.a();
            this.f81405b = this.f81407d.now();
            this.f81406c.a(b7.WARNING, "Submit rejected by thread pool executor", e11);
            return new a();
        }
    }
}
