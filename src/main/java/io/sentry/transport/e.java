package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.a4;
import io.sentry.b7;
import io.sentry.h0;
import io.sentry.o5;
import io.sentry.p5;
import io.sentry.q7;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f81368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.cache.g f81369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f81370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f81371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f81372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f81373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Runnable f81374g;

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81375a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i11 = this.f81375a;
            this.f81375a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p5 f81376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h0 f81377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.cache.g f81378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c0 f81379d = c0.a();

        c(p5 p5Var, h0 h0Var, io.sentry.cache.g gVar) {
            this.f81376a = (p5) io.sentry.util.y.c(p5Var, "Envelope is required.");
            this.f81377b = h0Var;
            this.f81378c = (io.sentry.cache.g) io.sentry.util.y.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, c0 c0Var, io.sentry.hints.p pVar) {
            e.this.f81370c.getLogger().c(b7.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(c0Var.d()));
            pVar.d(c0Var.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.f(cVar.f81376a.b().a())) {
                e.this.f81370c.getLogger().c(b7.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.a();
                e.this.f81370c.getLogger().c(b7.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(c cVar, boolean z11, p5 p5Var, Object obj, Class cls) {
            if (z11) {
                cVar.getClass();
            } else {
                io.sentry.util.v.a(cls, obj, e.this.f81370c.getLogger());
                e.this.f81370c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, p5Var);
            }
        }

        public static /* synthetic */ void e(c cVar, boolean z11, Object obj, Class cls) {
            if (z11) {
                cVar.getClass();
            } else {
                io.sentry.util.v.a(cls, obj, e.this.f81370c.getLogger());
                e.this.f81370c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f81376a);
            }
        }

        private c0 j() {
            c0 c0Var = this.f81379d;
            this.f81376a.b().d(null);
            final boolean zF3 = this.f81378c.f3(this.f81376a, this.f81377b);
            io.sentry.util.n.k(this.f81377b, io.sentry.hints.f.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    e.c.b(this.f81383a, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f81372e.isConnected()) {
                io.sentry.util.n.l(this.f81377b, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).e(true);
                    }
                }, new io.sentry.util.n.b() { // from class: io.sentry.transport.l
                    @Override // io.sentry.util.n.b
                    public final void a(Object obj, Class cls) {
                        e.c.e(this.f81389a, zF3, obj, cls);
                    }
                });
                return c0Var;
            }
            final p5 p5VarE = e.this.f81370c.getClientReportRecorder().e(this.f81376a);
            try {
                p5VarE.b().d(io.sentry.l.k(e.this.f81370c.getDateProvider().now().f()));
                c0 c0VarH = e.this.f81373f.h(p5VarE);
                if (c0VarH.d()) {
                    this.f81378c.M1(this.f81376a);
                    return c0VarH;
                }
                String str = "The transport failed to send the envelope with response code " + c0VarH.c();
                e.this.f81370c.getLogger().c(b7.ERROR, str, new Object[0]);
                if (c0VarH.c() >= 400 && c0VarH.c() != 429 && !zF3) {
                    io.sentry.util.n.j(this.f81377b, io.sentry.hints.k.class, new io.sentry.util.n.c() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.n.c
                        public final void accept(Object obj) {
                            e.this.f81370c.getClientReportRecorder().d(io.sentry.clientreport.f.NETWORK_ERROR, p5VarE);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e11) {
                io.sentry.util.n.l(this.f81377b, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).e(true);
                    }
                }, new io.sentry.util.n.b() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.n.b
                    public final void a(Object obj, Class cls) {
                        e.c.d(this.f81386a, zF3, p5VarE, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f81374g = this;
            final c0 c0VarJ = this.f81379d;
            try {
                c0VarJ = j();
                e.this.f81370c.getLogger().c(b7.DEBUG, "Envelope flushed", new Object[0]);
                io.sentry.util.n.k(this.f81377b, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        e.c.a(this.f81381a, c0VarJ, (io.sentry.hints.p) obj);
                    }
                });
                e.this.f81374g = null;
            } catch (Throwable th2) {
                try {
                    e.this.f81370c.getLogger().b(b7.ERROR, th2, "Envelope submission failed", new Object[0]);
                    throw th2;
                } catch (Throwable th3) {
                    io.sentry.util.n.k(this.f81377b, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.f
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            e.c.a(this.f81381a, c0VarJ, (io.sentry.hints.p) obj);
                        }
                    });
                    e.this.f81374g = null;
                    throw th3;
                }
            }
        }
    }

    public e(q7 q7Var, a0 a0Var, r rVar, a4 a4Var) {
        this(I(q7Var.getMaxQueueSize(), q7Var.getEnvelopeDiskCache(), q7Var.getLogger(), q7Var.getDateProvider()), q7Var, a0Var, rVar, new o(q7Var, a4Var, a0Var));
    }

    private static w I(int i11, final io.sentry.cache.g gVar, final ILogger iLogger, o5 o5Var) {
        return new w(1, i11, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.p(gVar, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, o5Var);
    }

    private static void J(h0 h0Var, final boolean z11) {
        io.sentry.util.n.k(h0Var, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).d(false);
            }
        });
        io.sentry.util.n.k(h0Var, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).e(z11);
            }
        });
    }

    public static /* synthetic */ void n(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.a();
        eVar.f81370c.getLogger().c(b7.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void p(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.n.h(cVar.f81377b, io.sentry.hints.e.class)) {
                gVar.f3(cVar.f81376a, cVar.f81377b);
            }
            J(cVar.f81377b, true);
            iLogger.c(b7.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    @Override // io.sentry.transport.q
    public void a(boolean z11) {
        this.f81371d.close();
        this.f81368a.shutdown();
        this.f81370c.getLogger().c(b7.DEBUG, "Shutting down", new Object[0]);
        if (z11) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f81370c.getFlushTimeoutMillis();
            if (this.f81368a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f81370c.getLogger().c(b7.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f81368a.shutdownNow();
            if (this.f81374g != null) {
                this.f81368a.getRejectedExecutionHandler().rejectedExecution(this.f81374g, this.f81368a);
            }
        } catch (InterruptedException unused) {
            this.f81370c.getLogger().c(b7.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.q
    public void a0(p5 p5Var, h0 h0Var) {
        io.sentry.cache.g gVarA = this.f81369b;
        boolean z11 = false;
        if (io.sentry.util.n.h(h0Var, io.sentry.hints.e.class)) {
            gVarA = s.a();
            this.f81370c.getLogger().c(b7.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z11 = true;
        }
        p5 p5VarC = this.f81371d.C(p5Var, h0Var);
        if (p5VarC == null) {
            if (z11) {
                this.f81369b.M1(p5Var);
                return;
            }
            return;
        }
        if (io.sentry.util.n.h(h0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            p5VarC = this.f81370c.getClientReportRecorder().e(p5VarC);
        }
        Future<?> futureSubmit = this.f81368a.submit(new c(p5VarC, h0Var, gVarA));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.n.k(h0Var, io.sentry.hints.g.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    e.n(this.f81363a, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f81370c.getClientReportRecorder().d(io.sentry.clientreport.f.QUEUE_OVERFLOW, p5VarC);
        }
    }

    @Override // io.sentry.transport.q
    public void b(long j11) {
        this.f81368a.d(j11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(false);
    }

    @Override // io.sentry.transport.q
    public boolean k() {
        return (this.f81371d.J() || this.f81368a.a()) ? false : true;
    }

    @Override // io.sentry.transport.q
    public a0 q() {
        return this.f81371d;
    }

    public e(w wVar, q7 q7Var, a0 a0Var, r rVar, o oVar) {
        this.f81374g = null;
        this.f81368a = (w) io.sentry.util.y.c(wVar, "executor is required");
        this.f81369b = (io.sentry.cache.g) io.sentry.util.y.c(q7Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f81370c = (q7) io.sentry.util.y.c(q7Var, "options is required");
        this.f81371d = (a0) io.sentry.util.y.c(a0Var, "rateLimiter is required");
        this.f81372e = (r) io.sentry.util.y.c(rVar, "transportGate is required");
        this.f81373f = (o) io.sentry.util.y.c(oVar, "httpConnection is required");
    }
}
