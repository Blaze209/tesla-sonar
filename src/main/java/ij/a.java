package ij;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f78194b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f78195c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f78196a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f78197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f78198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f78199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private ThreadFactory f78200d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private e f78201e = e.f78215d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f78202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f78203g;

        b(boolean z11) {
            this.f78197a = z11;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f78202f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f78202f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f78198b, this.f78199c, this.f78203g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f78200d, this.f78202f, this.f78201e, this.f78197a));
            if (this.f78203g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f78202f = str;
            return this;
        }

        public b c(int i11) {
            this.f78198b = i11;
            this.f78199c = i11;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: ij.a$c$a, reason: collision with other inner class name */
        class C1657a extends Thread {
            C1657a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new C1657a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f78205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f78206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f78207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f78208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f78209e = new AtomicInteger();

        /* JADX INFO: renamed from: ij.a$d$a, reason: collision with other inner class name */
        class RunnableC1658a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f78210a;

            RunnableC1658a(Runnable runnable) {
                this.f78210a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f78208d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f78210a.run();
                } catch (Throwable th2) {
                    d.this.f78207c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z11) {
            this.f78205a = threadFactory;
            this.f78206b = str;
            this.f78207c = eVar;
            this.f78208d = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f78205a.newThread(new RunnableC1658a(runnable));
            threadNewThread.setName("glide-" + this.f78206b + "-thread-" + this.f78209e.getAndIncrement());
            return threadNewThread;
        }
    }

    a(ExecutorService executorService) {
        this.f78196a = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f78195c == 0) {
            f78195c = Math.min(4, ij.b.a());
        }
        return f78195c;
    }

    public static b d() {
        return new b(true).c(a()).b("animation");
    }

    public static a e() {
        return d().a();
    }

    public static b f() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a g() {
        return f().a();
    }

    public static b h() {
        return new b(false).c(b()).b("source");
    }

    public static a i() {
        return h().a();
    }

    public static a j() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f78194b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f78215d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, @NonNull TimeUnit timeUnit) {
        return this.f78196a.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f78196a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f78196a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
        return (T) this.f78196a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f78196a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f78196a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f78196a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f78196a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f78196a.submit(runnable);
    }

    public String toString() {
        return this.f78196a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) {
        return this.f78196a.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) {
        return (T) this.f78196a.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t11) {
        return this.f78196a.submit(runnable, t11);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f78196a.submit(callable);
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f78212a = new C1659a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f78213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f78214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f78215d;

        class b implements e {
            b() {
            }

            @Override // ij.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        class c implements e {
            c() {
            }

            @Override // ij.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f78213b = bVar;
            f78214c = new c();
            f78215d = bVar;
        }

        void a(Throwable th2);

        /* JADX INFO: renamed from: ij.a$e$a, reason: collision with other inner class name */
        class C1659a implements e {
            C1659a() {
            }

            @Override // ij.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
