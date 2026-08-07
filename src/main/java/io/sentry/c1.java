package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes9.dex */
public interface c1 {
    void a();

    Future<?> b(Runnable runnable, long j11);

    void c(long j11);

    boolean isClosed();

    Future<?> submit(Runnable runnable);
}
