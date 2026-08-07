package j0;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class b<I, O> extends d<O> implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j0.a<? super I, ? extends O> f82283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Boolean> f82284d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CountDownLatch f82285e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s<? extends I> f82286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile s<? extends O> f82287g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f82288a;

        a(s sVar) {
            this.f82288a = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.c(n.m(this.f82288a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e11) {
                    b.this.d(e11.getCause());
                }
            } finally {
                b.this.f82287g = null;
            }
        }
    }

    b(@NonNull j0.a<? super I, ? extends O> aVar, @NonNull s<? extends I> sVar) {
        this.f82283c = (j0.a) u5.h.g(aVar);
        this.f82286f = (s) u5.h.g(sVar);
    }

    private void g(Future<?> future, boolean z11) {
        if (future != null) {
            future.cancel(z11);
        }
    }

    private <E> void h(@NonNull BlockingQueue<E> blockingQueue, @NonNull E e11) {
        boolean z11 = false;
        while (true) {
            try {
                blockingQueue.put(e11);
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E i(@NonNull BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z11 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // j0.d, java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        if (!super.cancel(z11)) {
            return false;
        }
        h(this.f82284d, Boolean.valueOf(z11));
        g(this.f82286f, z11);
        g(this.f82287g, z11);
        return true;
    }

    @Override // j0.d, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            s<? extends I> sVar = this.f82286f;
            if (sVar != null) {
                sVar.get();
            }
            this.f82285e.await();
            s<? extends O> sVar2 = this.f82287g;
            if (sVar2 != null) {
                sVar2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.s<? extends I>, j0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.s<? extends I>, j0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.s<? extends I>, j0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r11;
        ?? r12 = (j0.a<? super I, ? extends O>) null;
        try {
            try {
                s<? extends O> sVarApply = this.f82283c.apply(n.m(this.f82286f));
                this.f82287g = sVarApply;
                if (isCancelled()) {
                    sVarApply.cancel(((Boolean) i(this.f82284d)).booleanValue());
                    this.f82287g = null;
                } else {
                    sVarApply.b(new a(sVarApply), i0.c.b());
                }
            } catch (UndeclaredThrowableException e11) {
                d(e11.getCause());
                r11 = r12;
            } catch (Exception e12) {
                d(e12);
                r11 = r12;
            } catch (Error e13) {
                d(e13);
                r11 = r12;
            } finally {
                this.f82283c = (j0.a<? super I, ? extends O>) r12;
                this.f82286f = (s<? extends I>) r12;
                this.f82285e.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e14) {
            d(e14.getCause());
        }
    }

    @Override // j0.d, java.util.concurrent.Future
    public O get(long j11, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j11 = timeUnit2.convert(j11, timeUnit);
                timeUnit = timeUnit2;
            }
            s<? extends I> sVar = this.f82286f;
            if (sVar != null) {
                long jNanoTime = System.nanoTime();
                sVar.get(j11, timeUnit);
                j11 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f82285e.await(j11, timeUnit)) {
                j11 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                s<? extends O> sVar2 = this.f82287g;
                if (sVar2 != null) {
                    sVar2.get(j11, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j11, timeUnit);
    }
}
