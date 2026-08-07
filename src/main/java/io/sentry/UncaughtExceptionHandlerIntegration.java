package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class UncaughtExceptionHandlerIntegration implements o1, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io.sentry.util.a f79212f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f79213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z0 f79214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q7 f79215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f79216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c9 f79217e;

    public static class a extends io.sentry.hints.d implements io.sentry.hints.l, io.sentry.hints.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<io.sentry.protocol.x> f79218d;

        public a(long j11, ILogger iLogger) {
            super(j11, iLogger);
            this.f79218d = new AtomicReference<>();
        }

        @Override // io.sentry.hints.f
        public boolean f(io.sentry.protocol.x xVar) {
            io.sentry.protocol.x xVar2 = this.f79218d.get();
            return xVar2 != null && xVar2.equals(xVar);
        }

        @Override // io.sentry.hints.f
        public void g(io.sentry.protocol.x xVar) {
            this.f79218d.set(xVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(c9.a.c());
    }

    static Throwable c(Thread thread, Throwable th2) {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.n(Boolean.FALSE);
        lVar.p("UncaughtExceptionHandler");
        return new ExceptionMechanismException(lVar, th2, thread);
    }

    private void o(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        p(uncaughtExceptionHandler, new HashSet());
    }

    private void p(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Set<Thread.UncaughtExceptionHandler> set) {
        if (uncaughtExceptionHandler == null) {
            q7 q7Var = this.f79215c;
            if (q7Var != null) {
                q7Var.getLogger().c(b7.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!set.add(uncaughtExceptionHandler)) {
            q7 q7Var2 = this.f79215c;
            if (q7Var2 != null) {
                q7Var2.getLogger().c(b7.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f79213a;
            if (this != uncaughtExceptionHandler2) {
                p(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.f79213a = this.f79213a;
            q7 q7Var3 = this.f79215c;
            if (q7Var3 != null) {
                q7Var3.getLogger().c(b7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d1 d1VarA = f79212f.a();
        try {
            if (this == this.f79217e.b()) {
                this.f79217e.a(this.f79213a);
                q7 q7Var = this.f79215c;
                if (q7Var != null) {
                    q7Var.getLogger().c(b7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                o(this.f79217e.b());
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

    @Override // io.sentry.o1
    public final void n(z0 z0Var, q7 q7Var) {
        if (this.f79216d) {
            q7Var.getLogger().c(b7.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f79216d = true;
        this.f79214b = (z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        q7 q7Var2 = (q7) io.sentry.util.y.c(q7Var, "SentryOptions is required");
        this.f79215c = q7Var2;
        ILogger logger = q7Var2.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f79215c.isEnableUncaughtExceptionHandler()));
        if (this.f79215c.isEnableUncaughtExceptionHandler()) {
            d1 d1VarA = f79212f.a();
            try {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.f79217e.b();
                if (uncaughtExceptionHandlerB != null) {
                    this.f79215c.getLogger().c(b7Var, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                    if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB;
                        if (uncaughtExceptionHandlerIntegration.f79214b == null || z0Var.B() != uncaughtExceptionHandlerIntegration.f79214b.B()) {
                            this.f79213a = uncaughtExceptionHandlerB;
                        } else {
                            this.f79213a = uncaughtExceptionHandlerIntegration.f79213a;
                        }
                    } else {
                        this.f79213a = uncaughtExceptionHandlerB;
                    }
                }
                this.f79217e.a(this);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                this.f79215c.getLogger().c(b7Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.p.a("UncaughtExceptionHandler");
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        q7 q7Var = this.f79215c;
        if (q7Var == null || this.f79214b == null) {
            return;
        }
        q7Var.getLogger().c(b7.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f79215c.getFlushTimeoutMillis(), this.f79215c.getLogger());
            r6 r6Var = new r6(c(thread, th2));
            r6Var.C0(b7.FATAL);
            if (this.f79214b.f() == null && r6Var.G() != null) {
                aVar.g(r6Var.G());
            }
            h0 h0VarE = io.sentry.util.n.e(aVar);
            boolean zEquals = this.f79214b.D(r6Var, h0VarE).equals(io.sentry.protocol.x.f81078b);
            io.sentry.hints.h hVarF = io.sentry.util.n.f(h0VarE);
            if ((!zEquals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVarF)) && !aVar.h()) {
                this.f79215c.getLogger().c(b7.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", r6Var.G());
            }
        } catch (Throwable th3) {
            this.f79215c.getLogger().a(b7.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f79213a != null) {
            this.f79215c.getLogger().c(b7.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f79213a.uncaughtException(thread, th2);
        } else if (this.f79215c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(c9 c9Var) {
        this.f79216d = false;
        this.f79217e = (c9) io.sentry.util.y.c(c9Var, "threadAdapter is required.");
    }
}
