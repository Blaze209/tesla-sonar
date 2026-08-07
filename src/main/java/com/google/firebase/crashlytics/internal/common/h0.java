package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 {

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f43977b;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.h0$a$a, reason: collision with other inner class name */
        class C0692a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f43978a;

            C0692a(Runnable runnable) {
                this.f43978a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.d
            public void a() {
                this.f43978a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f43976a = str;
            this.f43977b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0692a(runnable));
            threadNewThread.setName(this.f43976a + this.f43977b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f43981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f43982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f43983d;

        b(String str, ExecutorService executorService, long j11, TimeUnit timeUnit) {
            this.f43980a = str;
            this.f43981b = executorService;
            this.f43982c = j11;
            this.f43983d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.d
        public void a() {
            try {
                bv.g.f().b("Executing shutdown hook for " + this.f43980a);
                this.f43981b.shutdown();
                if (this.f43981b.awaitTermination(this.f43982c, this.f43983d)) {
                    return;
                }
                bv.g.f().b(this.f43980a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f43981b.shutdownNow();
            } catch (InterruptedException unused) {
                bv.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f43980a));
                this.f43981b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j11, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j11, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
