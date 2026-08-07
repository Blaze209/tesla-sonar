package c0;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class l implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f18358c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18359a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private ThreadPoolExecutor f18360b = b();

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f18361a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f18361a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f18358c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: c0.k
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                y0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    void d() {
        synchronized (this.f18359a) {
            try {
                if (!this.f18360b.isShutdown()) {
                    this.f18360b.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(@NonNull androidx.camera.core.impl.g0 g0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        u5.h.g(g0Var);
        synchronized (this.f18359a) {
            try {
                if (this.f18360b.isShutdown()) {
                    this.f18360b = b();
                }
                threadPoolExecutor = this.f18360b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, g0Var.b().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        u5.h.g(runnable);
        synchronized (this.f18359a) {
            this.f18360b.execute(runnable);
        }
    }
}
