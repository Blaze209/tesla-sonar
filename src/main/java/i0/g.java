package i0;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class g implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Executor f74021b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f74022a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f74023a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f74023a.getAndIncrement())));
            return thread;
        }
    }

    g() {
    }

    static Executor a() {
        if (f74021b != null) {
            return f74021b;
        }
        synchronized (g.class) {
            try {
                if (f74021b == null) {
                    f74021b = new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f74021b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f74022a.execute(runnable);
    }
}
