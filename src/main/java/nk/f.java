package nk;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f95081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask<V> f95082b;

    public f(Handler handler, Callable<V> callable) {
        this.f95081a = handler;
        this.f95082b = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f95082b.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f95082b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f95082b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f95082b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f95082b.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        return this.f95082b.get(j11, timeUnit);
    }

    public f(Handler handler, Runnable runnable, V v11) {
        this.f95081a = handler;
        this.f95082b = new FutureTask<>(runnable, v11);
    }
}
