package com.google.firebase.perf.metrics;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ProcessLifecycleOwner;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.e;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, w {
    private static volatile AppStartTrace C;
    private static ExecutorService D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f44452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f44453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f44454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TraceMetric.b f44455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f44456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f44457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f44458h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f44460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f44461k;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ow.a f44471u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    private static final l f44450z = new com.google.firebase.perf.util.a().a();
    private static final long A = TimeUnit.MINUTES.toMicros(1);
    private static final long B = TimeUnit.MILLISECONDS.toMicros(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44451a = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44459i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f44462l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f44463m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f44464n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f44465o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l f44466p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private l f44467q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l f44468r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l f44469s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private l f44470t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f44472v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f44473w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final b f44474x = new b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f44475y = false;

    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.h(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppStartTrace f44477a;

        public c(AppStartTrace appStartTrace) {
            this.f44477a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44477a.f44462l == null) {
                this.f44477a.f44463m = new l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppStartTrace(@NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.config.a aVar2, @NonNull ExecutorService executorService) {
        this.f44452b = kVar;
        this.f44453c = aVar;
        this.f44454d = aVar2;
        D = executorService;
        this.f44455e = TraceMetric.newBuilder().l("_experiment_app_start_ttid");
        this.f44460j = l.f(Process.getStartElapsedRealtime());
        n nVar = (n) f.l().j(n.class);
        this.f44461k = nVar != null ? l.f(nVar.b()) : null;
    }

    static /* synthetic */ int h(AppStartTrace appStartTrace) {
        int i11 = appStartTrace.f44473w;
        appStartTrace.f44473w = i11 + 1;
        return i11;
    }

    @NonNull
    private l i() {
        l lVar = this.f44461k;
        return lVar != null ? lVar : f44450z;
    }

    public static AppStartTrace j() {
        return C != null ? C : k(k.k(), new com.google.firebase.perf.util.a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace k(k kVar, com.google.firebase.perf.util.a aVar) {
        if (C == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (C == null) {
                        C = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, 10 + A, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return C;
    }

    @NonNull
    private l l() {
        l lVar = this.f44460j;
        return lVar != null ? lVar : i();
    }

    public static boolean m(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        TraceMetric.b bVarK = TraceMetric.newBuilder().l(com.google.firebase.perf.util.c.APP_START_TRACE_NAME.toString()).j(i().e()).k(i().d(this.f44465o));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TraceMetric.newBuilder().l(com.google.firebase.perf.util.c.ON_CREATE_TRACE_NAME.toString()).j(i().e()).k(i().d(this.f44462l)).build());
        if (this.f44464n != null) {
            TraceMetric.b bVarNewBuilder = TraceMetric.newBuilder();
            bVarNewBuilder.l(com.google.firebase.perf.util.c.ON_START_TRACE_NAME.toString()).j(this.f44462l.e()).k(this.f44462l.d(this.f44464n));
            arrayList.add(bVarNewBuilder.build());
            TraceMetric.b bVarNewBuilder2 = TraceMetric.newBuilder();
            bVarNewBuilder2.l(com.google.firebase.perf.util.c.ON_RESUME_TRACE_NAME.toString()).j(this.f44464n.e()).k(this.f44464n.d(this.f44465o));
            arrayList.add(bVarNewBuilder2.build());
        }
        bVarK.c(arrayList).d(this.f44471u.a());
        this.f44452b.x((TraceMetric) bVarK.build(), com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND);
    }

    private void o(final TraceMetric.b bVar) {
        if (this.f44468r == null || this.f44469s == null || this.f44470t == null) {
            return;
        }
        D.execute(new Runnable() { // from class: lw.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f90832a.f44452b.x(bVar.build(), com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND);
            }
        });
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f44470t != null) {
            return;
        }
        this.f44470t = this.f44453c.a();
        this.f44455e.e(TraceMetric.newBuilder().l("_experiment_onDrawFoQ").j(l().e()).k(l().d(this.f44470t)).build());
        if (this.f44460j != null) {
            this.f44455e.e(TraceMetric.newBuilder().l("_experiment_procStart_to_classLoad").j(l().e()).k(l().d(i())).build());
        }
        this.f44455e.i("systemDeterminedForeground", this.f44475y ? "true" : "false");
        this.f44455e.h("onDrawCount", this.f44473w);
        this.f44455e.d(this.f44471u.a());
        o(this.f44455e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.f44468r != null) {
            return;
        }
        this.f44468r = this.f44453c.a();
        this.f44455e.j(l().e()).k(l().d(this.f44468r));
        o(this.f44455e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f44469s != null) {
            return;
        }
        this.f44469s = this.f44453c.a();
        this.f44455e.e(TraceMetric.newBuilder().l("_experiment_preDrawFoQ").j(l().e()).k(l().d(this.f44469s)).build());
        o(this.f44455e);
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    private void t() {
        l lVar = this.f44463m;
        if (lVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || lVar.c() > B) {
            this.f44472v = true;
        }
        this.f44463m = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            t();
            if (!this.f44472v && this.f44462l == null) {
                this.f44475y = this.f44475y || m(this.f44456f);
                this.f44457g = new WeakReference<>(activity);
                this.f44462l = this.f44453c.a();
                if (l().d(this.f44462l) > A) {
                    this.f44459i = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f44472v || this.f44459i || !this.f44454d.h() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f44474x);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f44472v && !this.f44459i) {
                boolean zH = this.f44454d.h();
                if (zH && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f44474x);
                    e.c(viewFindViewById, new Runnable() { // from class: lw.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f90828a.p();
                        }
                    });
                    h.a(viewFindViewById, new Runnable() { // from class: lw.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f90829a.q();
                        }
                    }, new Runnable() { // from class: lw.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f90830a.r();
                        }
                    });
                }
                if (this.f44465o != null) {
                    return;
                }
                this.f44458h = new WeakReference<>(activity);
                this.f44465o = this.f44453c.a();
                this.f44471u = SessionManager.getInstance().perfSession();
                kw.a.e().a("onResume(): " + activity.getClass().getName() + ": " + i().d(this.f44465o) + " microseconds");
                D.execute(new Runnable() { // from class: lw.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90831a.n();
                    }
                });
                if (!zH) {
                    u();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f44472v && this.f44464n == null && !this.f44459i) {
            this.f44464n = this.f44453c.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @k0(Lifecycle.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f44472v || this.f44459i || this.f44467q != null) {
            return;
        }
        this.f44467q = this.f44453c.a();
        this.f44455e.e(TraceMetric.newBuilder().l("_experiment_firstBackgrounding").j(l().e()).k(l().d(this.f44467q)).build());
    }

    @k0(Lifecycle.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f44472v || this.f44459i || this.f44466p != null) {
            return;
        }
        this.f44466p = this.f44453c.a();
        this.f44455e.e(TraceMetric.newBuilder().l("_experiment_firstForegrounding").j(l().e()).k(l().d(this.f44466p)).build());
    }

    public synchronized void s(@NonNull Context context) {
        try {
            if (this.f44451a) {
                return;
            }
            ProcessLifecycleOwner.l().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f44475y = this.f44475y || m(applicationContext);
                this.f44451a = true;
                this.f44456f = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void u() {
        if (this.f44451a) {
            ProcessLifecycleOwner.l().getLifecycle().d(this);
            ((Application) this.f44456f).unregisterActivityLifecycleCallbacks(this);
            this.f44451a = false;
        }
    }
}
