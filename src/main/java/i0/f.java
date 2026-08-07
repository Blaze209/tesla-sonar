package i0;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class f implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Executor f74018b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f74019a = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    f() {
    }

    static Executor a() {
        if (f74018b != null) {
            return f74018b;
        }
        synchronized (f.class) {
            try {
                if (f74018b == null) {
                    f74018b = new f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f74018b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f74019a.execute(runnable);
    }
}
