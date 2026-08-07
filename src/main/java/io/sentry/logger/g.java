package io.sentry.logger;

import io.sentry.b1;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.d1;
import io.sentry.d7;
import io.sentry.f7;
import io.sentry.q7;
import io.sentry.transport.b0;
import io.sentry.v6;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class g implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final io.sentry.util.a f80751h = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final q7 f80752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b1 f80753b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1 f80755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Future<?> f80756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f80757f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f80758g = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<d7> f80754c = new ConcurrentLinkedQueue();

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f();
        }
    }

    public g(q7 q7Var, b1 b1Var) {
        this.f80752a = q7Var;
        this.f80753b = b1Var;
        this.f80755d = new v6(q7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        h();
        d1 d1VarA = f80751h.a();
        try {
            if (this.f80754c.isEmpty()) {
                this.f80757f = false;
            } else {
                i(true, false);
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

    private void g() {
        ArrayList arrayList = new ArrayList(100);
        do {
            d7 d7VarPoll = this.f80754c.poll();
            if (d7VarPoll != null) {
                arrayList.add(d7VarPoll);
            }
            if (this.f80754c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f80753b.g(new f7(arrayList));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f80758g.a();
        }
    }

    private void h() {
        do {
            g();
        } while (this.f80754c.size() >= 100);
    }

    private void i(boolean z11, boolean z12) {
        if (!this.f80757f || z11) {
            d1 d1VarA = f80751h.a();
            try {
                Future<?> future = this.f80756e;
                if (z11 || future == null || future.isDone() || future.isCancelled()) {
                    this.f80757f = true;
                    try {
                        this.f80756e = this.f80755d.b(new b(), z12 ? 0 : 5000);
                    } catch (RejectedExecutionException e11) {
                        this.f80757f = false;
                        this.f80752a.getLogger().a(b7.WARNING, "Logs batch processor flush task rejected", e11);
                    }
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
    }

    @Override // io.sentry.logger.c
    public void a(boolean z11) {
        if (z11) {
            i(true, true);
            this.f80755d.submit(new Runnable() { // from class: io.sentry.logger.f
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = this.f80750a;
                    gVar.f80755d.c(gVar.f80752a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f80755d.c(this.f80752a.getShutdownTimeoutMillis());
            while (!this.f80754c.isEmpty()) {
                g();
            }
        }
    }

    @Override // io.sentry.logger.c
    public void b(long j11) {
        i(true, true);
        try {
            this.f80758g.d(j11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            this.f80752a.getLogger().a(b7.ERROR, "Failed to flush log events", e11);
            Thread.currentThread().interrupt();
        }
    }
}
