package ac;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f920b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f923e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f924a = new b();

    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f921c = iAvailableProcessors;
        f922d = iAvailableProcessors + 1;
        f923e = (iAvailableProcessors * 2) + 1;
    }

    private a() {
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z11) {
        threadPoolExecutor.allowCoreThreadTimeOut(z11);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f922d, f923e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f920b.f924a;
    }
}
