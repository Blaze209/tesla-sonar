package r5;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f107024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107025b;

        /* JADX INFO: renamed from: r5.h$a$a, reason: collision with other inner class name */
        private static class C2274a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f107026a;

            C2274a(Runnable runnable, String str, int i11) {
                super(runnable, str);
                this.f107026a = i11;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f107026a);
                super.run();
            }
        }

        a(String str, int i11) {
            this.f107024a = str;
            this.f107025b = i11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C2274a(runnable, this.f107024a, this.f107025b);
        }
    }

    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f107027a;

        b(Handler handler) {
            this.f107027a = (Handler) u5.h.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f107027a.post((Runnable) u5.h.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f107027a + " is shutting down");
        }
    }

    private static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<T> f107028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Consumer<T> f107029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f107030c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Consumer f107031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f107032b;

            a(Consumer consumer, Object obj) {
                this.f107031a = consumer;
                this.f107032b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f107031a.accept(this.f107032b);
            }
        }

        c(Handler handler, Callable<T> callable, Consumer<T> consumer) {
            this.f107028a = callable;
            this.f107029b = consumer;
            this.f107030c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f107028a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f107030c.post(new a(this.f107029b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i11, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i12, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i11));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, Consumer<T> consumer) {
        executor.execute(new c(r5.b.a(), callable, consumer));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i11) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (ExecutionException e12) {
            throw new RuntimeException(e12);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
