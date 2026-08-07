package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.g1;
import io.sentry.android.core.h1;
import io.sentry.android.core.internal.util.r;
import io.sentry.android.core.z0;
import io.sentry.d1;
import io.sentry.j1;
import io.sentry.m2;
import io.sentry.n0;
import io.sentry.y8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class h extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static volatile h f79677p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static long f79676o = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final io.sentry.util.a f79678q = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f79679a = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j1 f79686h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n0 f79687i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y8 f79688j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f79689k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f79690l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f79691m = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f79692n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f79681c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f79682d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f79683e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<ContentProvider, i> f79684f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<c> f79685g = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f79680b = g1.s();

    public enum a {
        UNKNOWN,
        COLD,
        WARM
    }

    public static /* synthetic */ void a(h hVar) {
        if (hVar.f79691m.get() == 0) {
            hVar.f79680b = false;
            j1 j1Var = hVar.f79686h;
            if (j1Var != null && j1Var.isRunning()) {
                hVar.f79686h.close();
                hVar.f79686h = null;
            }
            n0 n0Var = hVar.f79687i;
            if (n0Var == null || !n0Var.isRunning()) {
                return;
            }
            hVar.f79687i.a(true);
            hVar.f79687i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.g
            @Override // java.lang.Runnable
            public final void run() {
                h.a(this.f79675a);
            }
        });
    }

    public static h q() {
        if (f79677p == null) {
            d1 d1VarA = f79678q.a();
            try {
                if (f79677p == null) {
                    f79677p = new h();
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
        return f79677p;
    }

    public void e(c cVar) {
        this.f79685g.add(cVar);
    }

    public i g() {
        i iVar = new i();
        iVar.q("Process Initialization", this.f79681c.h(), this.f79681c.j(), f79676o);
        return iVar;
    }

    public List<c> h() {
        ArrayList arrayList = new ArrayList(this.f79685g);
        Collections.sort(arrayList);
        return arrayList;
    }

    public n0 i() {
        return this.f79687i;
    }

    public j1 j() {
        return this.f79686h;
    }

    public y8 k() {
        return this.f79688j;
    }

    public i l() {
        return this.f79681c;
    }

    public i m(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f79679a != a.UNKNOWN && this.f79680b) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVarL = l();
                if (iVarL.m() && iVarL.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return iVarL;
                }
            }
            i iVarR = r();
            if (iVarR.m() && iVarR.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                return iVarR;
            }
        }
        return new i();
    }

    public a n() {
        return this.f79679a;
    }

    public i o() {
        return this.f79683e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        h1.c().d(activity);
        if (this.f79691m.incrementAndGet() == 1 && !this.f79692n.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j11 = jUptimeMillis - this.f79681c.j();
            if (!this.f79680b || j11 > TimeUnit.MINUTES.toMillis(1L)) {
                this.f79679a = a.WARM;
                this.f79690l = true;
                this.f79681c.o();
                this.f79681c.r();
                this.f79681c.p(jUptimeMillis);
                f79676o = jUptimeMillis;
                this.f79684f.clear();
                this.f79683e.o();
            } else {
                this.f79679a = bundle == null ? a.COLD : a.WARM;
            }
        }
        this.f79680b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        h1.c().a(activity);
        if (this.f79691m.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f79680b = false;
        this.f79690l = true;
        this.f79692n.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        h1.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        h1.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        h1.c().d(activity);
        if (this.f79692n.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            r.d(activity, new Runnable() { // from class: io.sentry.android.core.performance.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79673a.u();
                }
            }, new z0(m2.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79674a.u();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        h1.c().a(activity);
    }

    public List<i> p() {
        ArrayList arrayList = new ArrayList(this.f79684f.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public i r() {
        return this.f79682d;
    }

    public boolean s() {
        return this.f79680b;
    }

    public void t() {
        this.f79690l = false;
        this.f79684f.clear();
        this.f79685g.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void u() {
        if (!this.f79692n.getAndSet(true)) {
            h hVarQ = q();
            hVarQ.r().s();
            hVarQ.l().s();
        }
    }

    public void v(Application application) {
        if (this.f79689k) {
            return;
        }
        boolean z11 = true;
        this.f79689k = true;
        if (!this.f79680b && !g1.s()) {
            z11 = false;
        }
        this.f79680b = z11;
        application.registerActivityLifecycleCallbacks(f79677p);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f79672a.f();
            }
        });
    }

    public void w(n0 n0Var) {
        this.f79687i = n0Var;
    }

    public void x(j1 j1Var) {
        this.f79686h = j1Var;
    }

    public void y(y8 y8Var) {
        this.f79688j = y8Var;
    }

    public boolean z() {
        return this.f79690l && this.f79680b;
    }
}
