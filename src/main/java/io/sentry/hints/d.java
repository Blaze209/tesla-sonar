package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.b7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f80625a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f80626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f80627c;

    public d(long j11, ILogger iLogger) {
        this.f80626b = j11;
        this.f80627c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void a() {
        this.f80625a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean h() {
        try {
            return this.f80625a.await(this.f80626b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            this.f80627c.a(b7.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e11);
            return false;
        }
    }
}
