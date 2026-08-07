package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.n3;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.o1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q1 f79284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ILogger f79285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f79286c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final io.sentry.util.a f79287d = new io.sentry.util.a();

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String p(q7 q7Var) {
            return q7Var.getOutboxPath();
        }
    }

    public static /* synthetic */ void c(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, io.sentry.z0 z0Var, q7 q7Var, String str) {
        io.sentry.d1 d1VarA = envelopeFileObserverIntegration.f79287d.a();
        try {
            if (!envelopeFileObserverIntegration.f79286c) {
                envelopeFileObserverIntegration.t(z0Var, q7Var, str);
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

    public static EnvelopeFileObserverIntegration o() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    private void t(io.sentry.z0 z0Var, q7 q7Var, String str) {
        q1 q1Var = new q1(str, new n3(z0Var, q7Var.getEnvelopeReader(), q7Var.getSerializer(), q7Var.getLogger(), q7Var.getFlushTimeoutMillis(), q7Var.getMaxQueueSize()), q7Var.getLogger(), q7Var.getFlushTimeoutMillis());
        this.f79284a = q1Var;
        try {
            q1Var.startWatching();
            q7Var.getLogger().c(b7.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.p.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.d1 d1VarA = this.f79287d.a();
        try {
            this.f79286c = true;
            if (d1VarA != null) {
                d1VarA.close();
            }
            q1 q1Var = this.f79284a;
            if (q1Var != null) {
                q1Var.stopWatching();
                ILogger iLogger = this.f79285b;
                if (iLogger != null) {
                    iLogger.c(b7.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
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
    public final void n(final io.sentry.z0 z0Var, final q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        io.sentry.util.y.c(q7Var, "SentryOptions is required");
        this.f79285b = q7Var.getLogger();
        final String strP = p(q7Var);
        if (strP == null) {
            this.f79285b.c(b7.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f79285b.c(b7.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strP);
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.r1
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.c(this.f79715a, z0Var, q7Var, strP);
                }
            });
        } catch (Throwable th2) {
            this.f79285b.a(b7.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    abstract String p(q7 q7Var);
}
