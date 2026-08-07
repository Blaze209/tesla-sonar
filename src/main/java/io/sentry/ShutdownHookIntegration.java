package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class ShutdownHookIntegration implements o1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f79207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f79208b;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f79207a = (Runtime) io.sentry.util.y.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void c(ShutdownHookIntegration shutdownHookIntegration, q7 q7Var) {
        shutdownHookIntegration.f79207a.addShutdownHook(shutdownHookIntegration.f79208b);
        q7Var.getLogger().c(b7.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.p.a("ShutdownHook");
    }

    private void t(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e11) {
            String message = e11.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e11;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f79208b != null) {
            t(new Runnable() { // from class: io.sentry.g8
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f80606a;
                    shutdownHookIntegration.f79207a.removeShutdownHook(shutdownHookIntegration.f79208b);
                }
            });
        }
    }

    @Override // io.sentry.o1
    public void n(final z0 z0Var, final q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        io.sentry.util.y.c(q7Var, "SentryOptions is required");
        if (!q7Var.isEnableShutdownHook()) {
            q7Var.getLogger().c(b7.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f79208b = new Thread(new Runnable() { // from class: io.sentry.h8
                @Override // java.lang.Runnable
                public final void run() {
                    z0Var.b(q7Var.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            t(new Runnable() { // from class: io.sentry.i8
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.c(this.f80652a, q7Var);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
