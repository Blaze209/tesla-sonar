package om0;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
final class e implements Callable<Void>, am0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final FutureTask<Void> f98100f = new FutureTask<>(em0.a.f63090b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f98101a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ExecutorService f98104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Thread f98105e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f98103c = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<Future<?>> f98102b = new AtomicReference<>();

    e(Runnable runnable, ExecutorService executorService) {
        this.f98101a = runnable;
        this.f98104d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f98105e = Thread.currentThread();
        try {
            this.f98101a.run();
            this.f98105e = null;
            e(this.f98104d.submit(this));
            return null;
        } catch (Throwable th2) {
            this.f98105e = null;
            tm0.a.r(th2);
            throw th2;
        }
    }

    void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f98103c.get();
            if (future2 == f98100f) {
                future.cancel(this.f98105e != Thread.currentThread());
                return;
            }
        } while (!androidx.camera.view.i.a(this.f98103c, future2, future));
    }

    @Override // am0.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f98103c;
        FutureTask<Void> futureTask = f98100f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f98105e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f98102b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f98105e != Thread.currentThread());
    }

    void e(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f98102b.get();
            if (future2 == f98100f) {
                future.cancel(this.f98105e != Thread.currentThread());
                return;
            }
        } while (!androidx.camera.view.i.a(this.f98102b, future2, future));
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f98103c.get() == f98100f;
    }
}
