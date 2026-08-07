package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.u;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import lw.f;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final kw.a f44386r = kw.a.e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile a f44387s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f44388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Activity, d> f44389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Activity, c> f44390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f44391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f44392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<b>> f44393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<InterfaceC0695a> f44394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f44395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f44396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f44397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f44398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f44399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f44400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f44401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.firebase.perf.v1.b f44402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f44403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f44404q;

    /* JADX INFO: renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    public interface InterfaceC0695a {
        void a();
    }

    public interface b {
        void onUpdateAppState(com.google.firebase.perf.v1.b bVar);
    }

    a(k kVar, com.google.firebase.perf.util.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    public static a b() {
        if (f44387s == null) {
            synchronized (a.class) {
                try {
                    if (f44387s == null) {
                        f44387s = new a(k.k(), new com.google.firebase.perf.util.a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f44387s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f44394g) {
            try {
                for (InterfaceC0695a interfaceC0695a : this.f44394g) {
                    if (interfaceC0695a != null) {
                        interfaceC0695a.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f44391d.get(activity);
        if (trace == null) {
            return;
        }
        this.f44391d.remove(activity);
        g<f.a> gVarE = this.f44389b.get(activity).e();
        if (!gVarE.d()) {
            f44386r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, gVarE.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f44397j.K()) {
            TraceMetric.b bVarD = TraceMetric.newBuilder().l(str).j(lVar.e()).k(lVar.d(lVar2)).d(SessionManager.getInstance().perfSession().a());
            int andSet = this.f44395h.getAndSet(0);
            synchronized (this.f44392e) {
                try {
                    bVarD.f(this.f44392e);
                    if (andSet != 0) {
                        bVarD.h(com.google.firebase.perf.util.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f44392e.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f44396i.x(bVarD.build(), com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f44397j.K()) {
            d dVar = new d(activity);
            this.f44389b.put(activity, dVar);
            if (activity instanceof u) {
                c cVar = new c(this.f44398k, this.f44396i, this, dVar);
                this.f44390c.put(activity, cVar);
                ((u) activity).getSupportFragmentManager().l1(cVar, true);
            }
        }
    }

    private void q(com.google.firebase.perf.v1.b bVar) {
        this.f44402o = bVar;
        synchronized (this.f44393f) {
            try {
                Iterator<WeakReference<b>> it = this.f44393f.iterator();
                while (it.hasNext()) {
                    b bVar2 = it.next().get();
                    if (bVar2 != null) {
                        bVar2.onUpdateAppState(this.f44402o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.firebase.perf.v1.b a() {
        return this.f44402o;
    }

    public void d(@NonNull String str, long j11) {
        synchronized (this.f44392e) {
            try {
                Long l11 = this.f44392e.get(str);
                if (l11 == null) {
                    this.f44392e.put(str, Long.valueOf(j11));
                } else {
                    this.f44392e.put(str, Long.valueOf(l11.longValue() + j11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i11) {
        this.f44395h.addAndGet(i11);
    }

    public boolean f() {
        return this.f44404q;
    }

    protected boolean h() {
        return this.f44399l;
    }

    public synchronized void i(Context context) {
        if (this.f44403p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f44403p = true;
        }
    }

    public void j(InterfaceC0695a interfaceC0695a) {
        synchronized (this.f44394g) {
            this.f44394g.add(interfaceC0695a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f44393f) {
            this.f44393f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f44389b.remove(activity);
        if (this.f44390c.containsKey(activity)) {
            ((u) activity).getSupportFragmentManager().E1(this.f44390c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f44388a.isEmpty()) {
                this.f44400m = this.f44398k.a();
                this.f44388a.put(activity, Boolean.TRUE);
                if (this.f44404q) {
                    q(com.google.firebase.perf.v1.b.FOREGROUND);
                    l();
                    this.f44404q = false;
                } else {
                    n(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString(), this.f44401n, this.f44400m);
                    q(com.google.firebase.perf.v1.b.FOREGROUND);
                }
            } else {
                this.f44388a.put(activity, Boolean.TRUE);
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
        try {
            if (h() && this.f44397j.K()) {
                if (!this.f44389b.containsKey(activity)) {
                    o(activity);
                }
                this.f44389b.get(activity).c();
                Trace trace = new Trace(c(activity), this.f44396i, this.f44398k, this);
                trace.start();
                this.f44391d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f44388a.containsKey(activity)) {
                this.f44388a.remove(activity);
                if (this.f44388a.isEmpty()) {
                    this.f44401n = this.f44398k.a();
                    n(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString(), this.f44400m, this.f44401n);
                    q(com.google.firebase.perf.v1.b.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f44393f) {
            this.f44393f.remove(weakReference);
        }
    }

    a(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, boolean z11) {
        this.f44388a = new WeakHashMap<>();
        this.f44389b = new WeakHashMap<>();
        this.f44390c = new WeakHashMap<>();
        this.f44391d = new WeakHashMap<>();
        this.f44392e = new HashMap();
        this.f44393f = new HashSet();
        this.f44394g = new HashSet();
        this.f44395h = new AtomicInteger(0);
        this.f44402o = com.google.firebase.perf.v1.b.BACKGROUND;
        this.f44403p = false;
        this.f44404q = true;
        this.f44396i = kVar;
        this.f44398k = aVar;
        this.f44397j = aVar2;
        this.f44399l = z11;
    }
}
