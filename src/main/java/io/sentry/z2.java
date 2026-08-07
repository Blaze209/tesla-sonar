package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes9.dex */
final class z2 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z2 f81627a = new z2();

    private z2() {
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public static c1 f() {
        return f81627a;
    }

    @Override // io.sentry.c1
    public void a() {
    }

    @Override // io.sentry.c1
    public Future<?> b(Runnable runnable, long j11) {
        return new FutureTask(new Callable() { // from class: io.sentry.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return z2.e();
            }
        });
    }

    @Override // io.sentry.c1
    public void c(long j11) {
    }

    @Override // io.sentry.c1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.c1
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.y2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return z2.d();
            }
        });
    }
}
