package z10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0006R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lz10/g;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/ExecutorService;", "", "tag", "Ljava/lang/Runnable;", "runnable", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Runnable;)V", "", "reportsOnDiagnostic", "e", "(ZLjava/lang/String;Ljava/lang/Runnable;)V", "Lz10/g$a;", "exceptionHandler", "c", "(Ljava/lang/Runnable;Lz10/g$a;)V", "Ljava/util/concurrent/Callable;", "callable", "Ljava/util/concurrent/Future;", "h", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "k", "b", "Ljava/util/concurrent/ExecutorService;", "executor", "", "count", "I", "getThreadCount", "()I", "j", "(I)V", "threadCount", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ExecutorService executor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f126492a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static int threadCount = d.f126471a.n();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz10/g$a;", "", "", "t", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a(Throwable t11);
    }

    private g() {
    }

    public static final void c(final Runnable runnable, final a exceptionHandler) {
        try {
            i().execute(new Runnable() { // from class: z10.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.g(runnable, exceptionHandler);
                }
            });
        } catch (Exception e11) {
            if (exceptionHandler != null) {
                exceptionHandler.a(e11);
            }
        }
    }

    public static final void d(String tag, Runnable runnable) {
        e(false, tag, runnable);
    }

    public static final void e(final boolean reportsOnDiagnostic, final String tag, Runnable runnable) {
        if (tag == null) {
            tag = "Source not provided";
        }
        c(runnable, new a() { // from class: z10.e
            @Override // z10.g.a
            public final void a(Throwable th2) {
                g.f(reportsOnDiagnostic, tag, th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z11, String loggerTag, Throwable th2) {
        s.k(loggerTag, "$loggerTag");
        String localizedMessage = th2 != null ? th2.getLocalizedMessage() : null;
        if (localizedMessage == null) {
            localizedMessage = "No message provided.";
        }
        if (z11) {
            h20.g.h(loggerTag, localizedMessage, th2);
        } else {
            h20.g.b(loggerTag, localizedMessage, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Runnable runnable, a aVar) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                if (aVar != null) {
                    aVar.a(th2);
                }
            }
        }
    }

    public static final Future<?> h(Callable<?> callable) {
        s.k(callable, "callable");
        Future<?> futureSubmit = i().submit(callable);
        s.j(futureSubmit, "getExecutor().submit(callable)");
        return futureSubmit;
    }

    private static final synchronized ExecutorService i() {
        ExecutorService executorService;
        try {
            if (executor == null) {
                executor = Executors.newScheduledThreadPool(threadCount);
            }
            executorService = executor;
            s.h(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public static final void j(int i11) {
        if (i11 >= 2) {
            threadCount = i11;
        }
    }

    public static final ExecutorService k() {
        ExecutorService executorService = executor;
        if (executorService == null) {
            return null;
        }
        s.h(executorService);
        executorService.shutdown();
        ExecutorService executorService2 = executor;
        executor = null;
        return executorService2;
    }
}
