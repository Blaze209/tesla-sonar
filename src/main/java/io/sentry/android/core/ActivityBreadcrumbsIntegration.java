package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fourthline.analytics.internal.AnalyticsContext;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.o1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f79229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.z0 f79230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f79231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.a f79232d = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f79229a = (Application) io.sentry.util.y.c(application, "Application is required");
    }

    private void c(Activity activity, String str) {
        if (this.f79230b == null) {
            return;
        }
        io.sentry.e eVar = new io.sentry.e();
        eVar.z("navigation");
        eVar.v("state", str);
        eVar.v(AnalyticsContext.Screen, o(activity));
        eVar.u("ui.lifecycle");
        eVar.w(b7.INFO);
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.k("android:activity", activity);
        this.f79230b.d(eVar, h0Var);
    }

    private String o(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f79231c) {
            this.f79229a.unregisterActivityLifecycleCallbacks(this);
            io.sentry.z0 z0Var = this.f79230b;
            if (z0Var != null) {
                z0Var.getOptions().getLogger().c(b7.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79230b = (io.sentry.z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        this.f79231c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = q7Var.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f79231c));
        if (this.f79231c) {
            this.f79229a.registerActivityLifecycleCallbacks(this);
            q7Var.getLogger().c(b7Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.p.a("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        io.sentry.d1 d1VarA = this.f79232d.a();
        try {
            c(activity, "stopped");
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
