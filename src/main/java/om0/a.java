package om0;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
abstract class a extends AtomicReference<Future<?>> implements am0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f98058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final FutureTask<Void> f98059e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Runnable f98060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f98061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Thread f98062c;

    static {
        Runnable runnable = em0.a.f63090b;
        f98058d = new FutureTask<>(runnable, null);
        f98059e = new FutureTask<>(runnable, null);
    }

    a(Runnable runnable, boolean z11) {
        this.f98060a = runnable;
        this.f98061b = z11;
    }

    private void a(Future<?> future) {
        if (this.f98062c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f98061b);
        }
    }

    public final void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f98058d) {
                return;
            }
            if (future2 == f98059e) {
                a(future);
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // am0.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f98058d || future == (futureTask = f98059e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        a(future);
    }

    @Override // am0.b
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f98058d || future == f98059e;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future<?> future = get();
        if (future == f98058d) {
            str = "Finished";
        } else if (future == f98059e) {
            str = "Disposed";
        } else if (this.f98062c != null) {
            str = "Running on " + this.f98062c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
