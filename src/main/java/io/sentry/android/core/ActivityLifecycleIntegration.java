package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.a9;
import io.sentry.b7;
import io.sentry.b9;
import io.sentry.d4;
import io.sentry.e3;
import io.sentry.f4;
import io.sentry.i7;
import io.sentry.n5;
import io.sentry.q7;
import io.sentry.q8;
import io.sentry.r8;
import io.sentry.y8;
import io.sentry.z8;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class ActivityLifecycleIntegration implements io.sentry.o1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f79233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f79234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.z0 f79235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f79236d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f79239g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.g1 f79242j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f79249q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f79237e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f79238f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f79240h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.sentry.g0 f79241i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.g1> f79243k = new WeakHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.g1> f79244l = new WeakHashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.android.core.performance.b> f79245m = new WeakHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n5 f79246n = new i7(new Date(0), 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Future<?> f79247o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.i1> f79248p = new WeakHashMap<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.sentry.util.a f79250r = new io.sentry.util.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f79251s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.sentry.util.a f79252t = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, z0 z0Var, i iVar) {
        this.f79233a = (Application) io.sentry.util.y.c(application, "Application is required");
        this.f79234b = (z0) io.sentry.util.y.c(z0Var, "BuildInfoProvider is required");
        this.f79249q = (i) io.sentry.util.y.c(iVar, "ActivityFramesTracker is required");
        if (z0Var.d() >= 29) {
            this.f79239g = true;
        }
    }

    private String D0(boolean z11) {
        return z11 ? "app.start.cold" : "app.start.warm";
    }

    private String G0(io.sentry.g1 g1Var) {
        String description = g1Var.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return g1Var.getDescription() + " - Deadline Exceeded";
    }

    public static /* synthetic */ void H(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, io.sentry.i1 i1Var) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f79249q.k(activity, i1Var.i());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f79236d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private String H0(String str) {
        return str + " full display";
    }

    public static /* synthetic */ void I(io.sentry.i1 i1Var, io.sentry.x0 x0Var, io.sentry.i1 i1Var2) {
        if (i1Var2 == i1Var) {
            x0Var.u();
        }
    }

    private String J0(String str) {
        return str + " initial display";
    }

    private boolean K0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean O0(Activity activity) {
        return this.f79248p.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(io.sentry.g1 g1Var, io.sentry.g1 g1Var2) {
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        io.sentry.android.core.performance.i iVarL = hVarQ.l();
        io.sentry.android.core.performance.i iVarR = hVarQ.r();
        if (iVarL.m() && iVarL.l()) {
            iVarL.s();
        }
        if (iVarR.m() && iVarR.l()) {
            iVarR.s();
        }
        k0();
        io.sentry.d1 d1VarA = this.f79252t.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f79236d;
            if (sentryAndroidOptions == null || g1Var2 == null) {
                r0(g1Var2);
                if (this.f79251s) {
                    r0(g1Var);
                }
            } else {
                n5 n5VarNow = sentryAndroidOptions.getDateProvider().now();
                long millis = TimeUnit.NANOSECONDS.toMillis(n5VarNow.b(g1Var2.r()));
                Long lValueOf = Long.valueOf(millis);
                io.sentry.e2.a aVar = io.sentry.e2.a.MILLISECOND;
                g1Var2.n("time_to_initial_display", lValueOf, aVar);
                if (g1Var != null && this.f79251s) {
                    this.f79251s = false;
                    g1Var2.n("time_to_full_display", Long.valueOf(millis), aVar);
                    g1Var.n("time_to_full_display", Long.valueOf(millis), aVar);
                    s0(g1Var, n5VarNow);
                }
                s0(g1Var2, n5VarNow);
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

    private void T0(q8 q8Var) {
        q8Var.g("auto.ui.activity");
    }

    private void U0(Activity activity) {
        Boolean boolValueOf;
        n5 n5Var;
        n5 n5Var2;
        final io.sentry.i1 i1Var;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f79235c == null || O0(activity)) {
            return;
        }
        if (!this.f79237e) {
            this.f79248p.put(activity, e3.s());
            if (this.f79236d.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.j0.h(this.f79235c);
                return;
            }
            return;
        }
        Y0();
        final String strY0 = y0(activity);
        io.sentry.android.core.performance.i iVarM = io.sentry.android.core.performance.h.q().m(this.f79236d);
        y8 y8Var = null;
        if (g1.s() && iVarM.m()) {
            n5 n5VarG = iVarM.g();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.q().n() == io.sentry.android.core.performance.h.a.COLD);
            n5Var = n5VarG;
        } else {
            boolValueOf = null;
            n5Var = null;
        }
        b9 b9Var = new b9();
        long deadlineTimeout = this.f79236d.getDeadlineTimeout();
        b9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.f79236d.isEnableActivityLifecycleTracingAutoFinish()) {
            b9Var.t(this.f79236d.getIdleTimeout());
            b9Var.i(true);
        }
        b9Var.v(true);
        b9Var.u(new a9() { // from class: io.sentry.android.core.p
            @Override // io.sentry.a9
            public final void a(io.sentry.i1 i1Var2) {
                ActivityLifecycleIntegration.H(this.f79657a, weakReference, strY0, i1Var2);
            }
        });
        if (this.f79240h || n5Var == null || boolValueOf == null) {
            n5Var2 = this.f79246n;
        } else {
            y8 y8VarK = io.sentry.android.core.performance.h.q().k();
            io.sentry.android.core.performance.h.q().y(null);
            y8Var = y8VarK;
            n5Var2 = n5Var;
        }
        b9Var.h(n5Var2);
        b9Var.r(y8Var != null);
        T0(b9Var);
        io.sentry.i1 i1VarV = this.f79235c.v(new z8(strY0, io.sentry.protocol.h0.COMPONENT, "ui.load", y8Var), b9Var);
        q8 q8Var = new q8();
        T0(q8Var);
        if (this.f79240h || n5Var == null || boolValueOf == null) {
            i1Var = i1VarV;
        } else {
            i1Var = i1VarV;
            this.f79242j = i1Var.p(D0(boolValueOf.booleanValue()), z0(boolValueOf.booleanValue()), n5Var, io.sentry.n1.SENTRY, q8Var);
            k0();
        }
        String strJ0 = J0(strY0);
        io.sentry.n1 n1Var = io.sentry.n1.SENTRY;
        n5 n5Var3 = n5Var2;
        final io.sentry.g1 g1VarP = i1Var.p("ui.load.initial_display", strJ0, n5Var3, n1Var, q8Var);
        this.f79243k.put(activity, g1VarP);
        if (this.f79238f && this.f79241i != null && this.f79236d != null) {
            final io.sentry.g1 g1VarP2 = i1Var.p("ui.load.full_display", H0(strY0), n5Var3, n1Var, q8Var);
            try {
                this.f79244l.put(activity, g1VarP2);
                this.f79247o = this.f79236d.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79698a.n0(g1VarP2, g1VarP);
                    }
                }, 25000L);
            } catch (RejectedExecutionException e11) {
                this.f79236d.getLogger().a(b7.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e11);
            }
        }
        this.f79235c.s(new f4() { // from class: io.sentry.android.core.r
            @Override // io.sentry.f4
            public final void a(io.sentry.x0 x0Var) {
                this.f79713a.T(x0Var, i1Var);
            }
        });
        this.f79248p.put(activity, i1Var);
    }

    private void Y0() {
        for (Map.Entry<Activity, io.sentry.i1> entry : this.f79248p.entrySet()) {
            w0(entry.getValue(), this.f79243k.get(entry.getKey()), this.f79244l.get(entry.getKey()));
        }
    }

    private void b0() {
        Future<?> future = this.f79247o;
        if (future != null) {
            future.cancel(false);
            this.f79247o = null;
        }
    }

    private void c0() {
        this.f79240h = false;
        this.f79246n = new i7(new Date(0L), 0L);
        this.f79245m.clear();
    }

    private void c1(Activity activity, boolean z11) {
        if (this.f79237e && z11) {
            w0(this.f79248p.get(activity), null, null);
        }
    }

    private void k0() {
        n5 n5VarD = io.sentry.android.core.performance.h.q().m(this.f79236d).d();
        if (!this.f79237e || n5VarD == null) {
            return;
        }
        s0(this.f79242j, n5VarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(io.sentry.g1 g1Var, io.sentry.g1 g1Var2) {
        if (g1Var == null || g1Var.isFinished()) {
            return;
        }
        g1Var.h(G0(g1Var));
        n5 n5VarQ = g1Var2 != null ? g1Var2.q() : null;
        if (n5VarQ == null) {
            n5VarQ = g1Var.r();
        }
        t0(g1Var, n5VarQ, r8.DEADLINE_EXCEEDED);
    }

    private void r0(io.sentry.g1 g1Var) {
        if (g1Var == null || g1Var.isFinished()) {
            return;
        }
        g1Var.g();
    }

    private void s0(io.sentry.g1 g1Var, n5 n5Var) {
        t0(g1Var, n5Var, null);
    }

    public static /* synthetic */ void t(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.x0 x0Var, io.sentry.i1 i1Var, io.sentry.i1 i1Var2) {
        if (i1Var2 == null) {
            activityLifecycleIntegration.getClass();
            x0Var.s(i1Var);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f79236d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", i1Var.getName());
            }
        }
    }

    private void t0(io.sentry.g1 g1Var, n5 n5Var, r8 r8Var) {
        if (g1Var == null || g1Var.isFinished()) {
            return;
        }
        if (r8Var == null) {
            r8Var = g1Var.getStatus() != null ? g1Var.getStatus() : r8.OK;
        }
        g1Var.f(r8Var, n5Var);
    }

    private void u0(io.sentry.g1 g1Var, r8 r8Var) {
        if (g1Var == null || g1Var.isFinished()) {
            return;
        }
        g1Var.m(r8Var);
    }

    private void w0(final io.sentry.i1 i1Var, io.sentry.g1 g1Var, io.sentry.g1 g1Var2) {
        if (i1Var == null || i1Var.isFinished()) {
            return;
        }
        u0(g1Var, r8.DEADLINE_EXCEEDED);
        n0(g1Var2, g1Var);
        b0();
        r8 status = i1Var.getStatus();
        if (status == null) {
            status = r8.OK;
        }
        i1Var.m(status);
        io.sentry.z0 z0Var = this.f79235c;
        if (z0Var != null) {
            z0Var.s(new f4() { // from class: io.sentry.android.core.n
                @Override // io.sentry.f4
                public final void a(io.sentry.x0 x0Var) {
                    this.f79617a.e0(x0Var, i1Var);
                }
            });
        }
    }

    private String y0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String z0(boolean z11) {
        return z11 ? "Cold Start" : "Warm Start";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(final io.sentry.x0 x0Var, final io.sentry.i1 i1Var) {
        x0Var.O(new d4.c() { // from class: io.sentry.android.core.s
            @Override // io.sentry.d4.c
            public final void a(io.sentry.i1 i1Var2) {
                ActivityLifecycleIntegration.t(this.f79735a, x0Var, i1Var, i1Var2);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f79233a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f79236d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f79249q.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(final io.sentry.x0 x0Var, final io.sentry.i1 i1Var) {
        x0Var.O(new d4.c() { // from class: io.sentry.android.core.o
            @Override // io.sentry.d4.c
            public final void a(io.sentry.i1 i1Var2) {
                ActivityLifecycleIntegration.I(i1Var, x0Var, i1Var2);
            }
        });
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        this.f79236d = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79235c = (io.sentry.z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        this.f79237e = K0(this.f79236d);
        this.f79241i = this.f79236d.getFullyDisplayedReporter();
        this.f79238f = this.f79236d.isEnableTimeToFullDisplayTracing();
        this.f79233a.registerActivityLifecycleCallbacks(this);
        this.f79236d.getLogger().c(b7.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.p.a("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.g0 g0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f79239g) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.d1 d1VarA = this.f79250r.a();
        try {
            if (this.f79235c != null && (sentryAndroidOptions = this.f79236d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.k.a(activity);
                this.f79235c.s(new f4() { // from class: io.sentry.android.core.j
                    @Override // io.sentry.f4
                    public final void a(io.sentry.x0 x0Var) {
                        x0Var.z(strA);
                    }
                });
            }
            U0(activity);
            final io.sentry.g1 g1Var = this.f79243k.get(activity);
            final io.sentry.g1 g1Var2 = this.f79244l.get(activity);
            this.f79240h = true;
            if (this.f79237e && g1Var != null && g1Var2 != null && (g0Var = this.f79241i) != null) {
                g0Var.b(new io.sentry.g0.a() { // from class: io.sentry.android.core.k
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        io.sentry.d1 d1VarA = this.f79250r.a();
        try {
            io.sentry.android.core.performance.b bVarRemove = this.f79245m.remove(activity);
            if (bVarRemove != null) {
                bVarRemove.a();
            }
            if (this.f79237e) {
                u0(this.f79242j, r8.CANCELLED);
                io.sentry.g1 g1Var = this.f79243k.get(activity);
                io.sentry.g1 g1Var2 = this.f79244l.get(activity);
                u0(g1Var, r8.DEADLINE_EXCEEDED);
                n0(g1Var2, g1Var);
                b0();
                c1(activity, true);
                this.f79242j = null;
                this.f79243k.remove(activity);
                this.f79244l.remove(activity);
            }
            this.f79248p.remove(activity);
            if (this.f79248p.isEmpty() && !activity.isChangingConfigurations()) {
                c0();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        io.sentry.d1 d1VarA = this.f79250r.a();
        try {
            if (!this.f79239g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = this.f79245m.get(activity);
        if (bVar != null) {
            io.sentry.i1 i1Var = this.f79242j;
            if (i1Var == null) {
                i1Var = this.f79248p.get(activity);
            }
            bVar.b(i1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f79245m.get(activity);
        if (bVar != null) {
            io.sentry.i1 i1Var = this.f79242j;
            if (i1Var == null) {
                i1Var = this.f79248p.get(activity);
            }
            bVar.c(i1Var);
            bVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f79245m.put(activity, bVar);
        if (this.f79240h) {
            return;
        }
        io.sentry.z0 z0Var = this.f79235c;
        n5 n5VarNow = z0Var != null ? z0Var.getOptions().getDateProvider().now() : x.a();
        this.f79246n = n5VarNow;
        bVar.g(n5VarNow);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.f79240h = true;
        io.sentry.z0 z0Var = this.f79235c;
        this.f79246n = z0Var != null ? z0Var.getOptions().getDateProvider().now() : x.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f79245m.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f79236d;
            bVar.h(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : x.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        io.sentry.d1 d1VarA = this.f79250r.a();
        try {
            if (!this.f79239g) {
                onActivityPostStarted(activity);
            }
            if (this.f79237e) {
                final io.sentry.g1 g1Var = this.f79243k.get(activity);
                final io.sentry.g1 g1Var2 = this.f79244l.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.r.d(activity, new Runnable() { // from class: io.sentry.android.core.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79600a.P0(g1Var2, g1Var);
                        }
                    }, this.f79234b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79610a.P0(g1Var2, g1Var);
                        }
                    });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        io.sentry.d1 d1VarA = this.f79250r.a();
        try {
            if (!this.f79239g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f79237e) {
                this.f79249q.f(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
