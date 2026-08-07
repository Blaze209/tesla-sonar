package ac;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f925d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f928c;

    /* JADX INFO: renamed from: ac.b$b, reason: collision with other inner class name */
    private static class ExecutorC0033b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ThreadLocal<Integer> f929a;

        private ExecutorC0033b() {
            this.f929a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f929a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f929a.remove();
                return iIntValue;
            }
            this.f929a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private int b() {
            Integer num = this.f929a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f929a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    private b() {
        this.f926a = !c() ? Executors.newCachedThreadPool() : ac.a.b();
        this.f927b = Executors.newSingleThreadScheduledExecutor();
        this.f928c = new ExecutorC0033b();
    }

    public static ExecutorService a() {
        return f925d.f926a;
    }

    static Executor b() {
        return f925d.f928c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
