package ul;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lul/b;", "", "<init>", "()V", "Ljava/lang/Runnable;", "task", "Ljn0/h0;", "b", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "frameThreadFactory", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "c", "Ljava/util/concurrent/ExecutorService;", "executor", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f116429a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ThreadFactory frameThreadFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ExecutorService executor;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: ul.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return b.c(runnable);
            }
        };
        frameThreadFactory = threadFactory;
        executor = Executors.newCachedThreadPool(threadFactory);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void b(Runnable task) {
        s.k(task, "task");
        executor.execute(task);
    }
}
