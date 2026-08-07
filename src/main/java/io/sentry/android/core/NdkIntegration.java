package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class NdkIntegration implements io.sentry.o1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f79288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f79289b;

    public NdkIntegration(Class<?> cls) {
        this.f79288a = cls;
    }

    private void c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f79289b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f79288a;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.f79289b.getLogger().c(b7.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e11) {
            this.f79289b.getLogger().a(b7.ERROR, "Failed to invoke the SentryNdk.close method.", e11);
        } catch (Throwable th2) {
            this.f79289b.getLogger().a(b7.ERROR, "Failed to close SentryNdk.", th2);
        } finally {
            c(this.f79289b);
        }
    }

    @Override // io.sentry.o1
    public final void n(io.sentry.z0 z0Var, q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79289b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f79289b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f79288a == null) {
            c(this.f79289b);
            return;
        }
        if (this.f79289b.getCacheDirPath() == null) {
            this.f79289b.getLogger().c(b7.ERROR, "No cache dir path is defined in options.", new Object[0]);
            c(this.f79289b);
            return;
        }
        try {
            this.f79288a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f79289b);
            this.f79289b.getLogger().c(b7Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.p.a("Ndk");
        } catch (NoSuchMethodException e11) {
            c(this.f79289b);
            this.f79289b.getLogger().a(b7.ERROR, "Failed to invoke the SentryNdk.init method.", e11);
        } catch (Throwable th2) {
            c(this.f79289b);
            this.f79289b.getLogger().a(b7.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
