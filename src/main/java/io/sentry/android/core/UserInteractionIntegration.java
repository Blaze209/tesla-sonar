package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class UserInteractionIntegration implements io.sentry.o1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f79344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.z0 f79345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f79346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f79347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f79348e;

    public UserInteractionIntegration(Application application, io.sentry.util.u uVar) {
        this.f79344a = (Application) io.sentry.util.y.c(application, "Application is required");
        this.f79347d = uVar.d("androidx.core.view.GestureDetectorCompat", this.f79346c);
        this.f79348e = uVar.d("androidx.lifecycle.Lifecycle", this.f79346c);
    }

    private void c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f79346c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f79345b == null || this.f79346c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f79345b, this.f79346c), this.f79346c));
    }

    private void o(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f79346c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f79344a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f79346c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        this.f79346c = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79345b = (io.sentry.z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        boolean z11 = this.f79346c.isEnableUserInteractionBreadcrumbs() || this.f79346c.isEnableUserInteractionTracing();
        ILogger logger = this.f79346c.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z11));
        if (z11) {
            if (!this.f79347d) {
                q7Var.getLogger().c(b7.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f79344a.registerActivityLifecycleCallbacks(this);
            this.f79346c.getLogger().c(b7Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.p.a("UserInteraction");
            if (this.f79348e) {
                Activity activityB = h1.c().b();
                if ((activityB instanceof LifecycleOwner) && ((LifecycleOwner) activityB).getLifecycle().getState() == Lifecycle.State.RESUMED) {
                    c(activityB);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
