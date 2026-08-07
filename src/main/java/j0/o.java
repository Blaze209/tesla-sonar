package j0;

import androidx.annotation.NonNull;
import c0.y0;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
abstract class o<V> implements s<V> {

    static class a<V> extends o<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Throwable f82320a;

        a(@NonNull Throwable th2) {
            this.f82320a = th2;
        }

        @Override // j0.o, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f82320a);
        }

        @NonNull
        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f82320a + "]]";
        }
    }

    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        b(@NonNull Throwable th2) {
            super(th2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(@NonNull TimeUnit timeUnit) {
            return 0L;
        }
    }

    static final class c<V> extends o<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final o<Object> f82321b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V f82322a;

        c(V v11) {
            this.f82322a = v11;
        }

        @Override // j0.o, java.util.concurrent.Future
        public V get() {
            return this.f82322a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f82322a + "]]";
        }
    }

    o() {
    }

    public static <V> s<V> a() {
        return c.f82321b;
    }

    @Override // com.google.common.util.concurrent.s
    public void b(@NonNull Runnable runnable, @NonNull Executor executor) {
        u5.h.g(runnable);
        u5.h.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            y0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j11, @NonNull TimeUnit timeUnit) {
        u5.h.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
