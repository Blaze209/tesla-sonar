package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.o1, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.h0 f79275e = new io.sentry.h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.z0 f79277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f79278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.n f79279d = new io.sentry.android.core.internal.util.n(io.sentry.android.core.internal.util.f.b(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f79276a = (Context) io.sentry.util.y.c(g1.g(context), "Context is required");
    }

    private void B(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f79278c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f79278c.getLogger().b(b7.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(long j11, Configuration configuration) {
        if (this.f79277b != null) {
            io.sentry.protocol.e.b bVarA = io.sentry.android.core.internal.util.o.a(this.f79276a.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.e eVar = new io.sentry.e(j11);
            eVar.z("navigation");
            eVar.u("device.orientation");
            eVar.v("position", lowerCase);
            eVar.w(b7.INFO);
            io.sentry.h0 h0Var = new io.sentry.h0();
            h0Var.k("android:configuration", configuration);
            this.f79277b.d(eVar, h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(long j11, int i11) {
        if (this.f79277b != null) {
            io.sentry.e eVar = new io.sentry.e(j11);
            eVar.z("system");
            eVar.u("device.event");
            eVar.x("Low memory");
            eVar.v("action", "LOW_MEMORY");
            eVar.v("level", Integer.valueOf(i11));
            eVar.w(b7.WARNING);
            this.f79277b.d(eVar, f79275e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f79276a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f79278c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(b7.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f79278c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(b7.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        this.f79277b = (io.sentry.z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79278c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f79278c.isEnableAppComponentBreadcrumbs()));
        if (this.f79278c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f79276a.registerComponentCallbacks(this);
                q7Var.getLogger().c(b7Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.p.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f79278c.setEnableAppComponentBreadcrumbs(false);
                q7Var.getLogger().b(b7.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        B(new Runnable() { // from class: io.sentry.android.core.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79755a.p(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i11) {
        if (i11 >= 40 && !this.f79279d.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            B(new Runnable() { // from class: io.sentry.android.core.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79790a.t(jCurrentTimeMillis, i11);
                }
            });
        }
    }
}
