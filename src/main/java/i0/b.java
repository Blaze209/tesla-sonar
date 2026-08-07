package i0;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class b implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Executor f74001b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f74002a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f74003a = new AtomicInteger(0);

        a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: i0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f74003a.getAndIncrement())));
            return thread;
        }
    }

    static Executor a() {
        if (f74001b != null) {
            return f74001b;
        }
        synchronized (b.class) {
            try {
                if (f74001b == null) {
                    f74001b = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f74001b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f74002a.execute(runnable);
    }
}
