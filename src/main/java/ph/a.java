package ph;

import di.g;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f102979a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f102980b;

    /* JADX INFO: renamed from: ph.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC2184a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f102981a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            g.h("TaskHelper", "newThread create coreSize=4 kat=2");
            return new Thread(runnable, "MspTaskHelper NEW #" + this.f102981a.getAndIncrement());
        }
    }

    static {
        try {
            ThreadPoolExecutor threadPoolExecutor = f102980b;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    public static ThreadPoolExecutor a() {
        if (f102980b == null) {
            synchronized (a.class) {
                try {
                    if (f102980b == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, f102979a, 2L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2184a());
                        f102980b = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f102980b;
    }

    public static void b(Runnable runnable) {
        a().execute(runnable);
    }
}
