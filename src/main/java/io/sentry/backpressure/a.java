package io.sentry.backpressure;

import io.sentry.b7;
import io.sentry.c1;
import io.sentry.d1;
import io.sentry.q7;
import io.sentry.z0;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f80300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f80301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f80302c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Future<?> f80303d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f80304e = new io.sentry.util.a();

    public a(q7 q7Var, z0 z0Var) {
        this.f80300a = q7Var;
        this.f80301b = z0Var;
    }

    private boolean c() {
        return this.f80301b.k();
    }

    private void d(int i11) {
        c1 executorService = this.f80300a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        d1 d1VarA = this.f80304e.a();
        try {
            try {
                this.f80303d = executorService.b(this, i11);
            } catch (RejectedExecutionException e11) {
                this.f80300a.getLogger().a(b7.WARNING, "Backpressure monitor reschedule task rejected", e11);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f80302c;
    }

    void b() {
        if (c()) {
            if (this.f80302c > 0) {
                this.f80300a.getLogger().c(b7.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f80302c = 0;
        } else {
            int i11 = this.f80302c;
            if (i11 < 10) {
                this.f80302c = i11 + 1;
                this.f80300a.getLogger().c(b7.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f80302c));
            }
        }
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future<?> future = this.f80303d;
        if (future != null) {
            d1 d1VarA = this.f80304e.a();
            try {
                future.cancel(true);
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th2) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(10000);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(500);
    }
}
