package com.oney.WebRTCModule;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f46055a = Executors.newSingleThreadExecutor();

    public static void a(Runnable runnable) {
        f46055a.execute(runnable);
    }

    public static <T> Future<T> b(Callable<T> callable) {
        return f46055a.submit(callable);
    }
}
