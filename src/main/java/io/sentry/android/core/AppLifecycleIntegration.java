package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class AppLifecycleIntegration implements io.sentry.o1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f79280a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile b2 f79281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f79282c;

    private void c() {
        io.sentry.d1 d1VarA = this.f79280a.a();
        try {
            b2 b2Var = this.f79281b;
            this.f79281b = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            if (b2Var != null) {
                y0.C().J(b2Var);
                SentryAndroidOptions sentryAndroidOptions = this.f79282c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(b7.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c();
        y0.C().c0();
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79282c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f79282c.isEnableAutoSessionTracking()));
        this.f79282c.getLogger().c(b7Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f79282c.isEnableAppLifecycleBreadcrumbs()));
        if (this.f79282c.isEnableAutoSessionTracking() || this.f79282c.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.d1 d1VarA = this.f79280a.a();
            try {
                if (this.f79281b != null) {
                    if (d1VarA != null) {
                        d1VarA.close();
                    }
                } else {
                    this.f79281b = new b2(z0Var, this.f79282c.getSessionTrackingIntervalMillis(), this.f79282c.isEnableAutoSessionTracking(), this.f79282c.isEnableAppLifecycleBreadcrumbs());
                    y0.C().p(this.f79281b);
                    if (d1VarA != null) {
                        d1VarA.close();
                    }
                    q7Var.getLogger().c(b7Var, "AppLifecycleIntegration installed.", new Object[0]);
                    io.sentry.util.p.a("AppLifecycle");
                }
            } catch (Throwable th2) {
                if (d1VarA == null) {
                    throw th2;
                }
                try {
                    d1VarA.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
    }
}
