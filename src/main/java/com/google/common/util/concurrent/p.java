package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
class p<V> implements s<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final s<?> f43822b = new p(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f43823c = new r(p.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f43824a;

    static final class a<V> extends com.google.common.util.concurrent.a.f<V> {
        a(Throwable th2) {
            N(th2);
        }
    }

    p(V v11) {
        this.f43824a = v11;
    }

    @Override // com.google.common.util.concurrent.s
    public void b(Runnable runnable, Executor executor) {
        ou.p.n(runnable, "Runnable was null.");
        ou.p.n(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            f43823c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f43824a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f43824a + "]]";
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        ou.p.m(timeUnit);
        return get();
    }
}
