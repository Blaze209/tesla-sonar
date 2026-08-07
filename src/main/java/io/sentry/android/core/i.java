package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.b7;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.util.r<FrameMetricsAggregator> f79413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f79414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<io.sentry.protocol.x, Map<String, io.sentry.protocol.k>> f79415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Activity, b> f79416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c2 f79417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected io.sentry.util.a f79418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.r<Boolean> f79419g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f79420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f79421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f79422c;

        private b(int i11, int i12, int i13) {
            this.f79420a = i11;
            this.f79421b = i12;
            this.f79422c = i13;
        }
    }

    public i(io.sentry.util.u uVar, SentryAndroidOptions sentryAndroidOptions, c2 c2Var) {
        this.f79415c = new ConcurrentHashMap();
        this.f79416d = new WeakHashMap();
        this.f79418f = new io.sentry.util.a();
        this.f79419g = uVar.e("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.f79413a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.android.core.d
            @Override // io.sentry.util.r.a
            public final Object a() {
                return i.e();
            }
        });
        this.f79414b = sentryAndroidOptions;
        this.f79417e = c2Var;
    }

    public static /* synthetic */ void c(i iVar, Runnable runnable, String str) {
        iVar.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                iVar.f79414b.getLogger().c(b7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public static /* synthetic */ FrameMetricsAggregator e() {
        return new FrameMetricsAggregator();
    }

    private b g() {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (!i() || !this.f79419g.a().booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = this.f79413a.a().b();
        int i13 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i11 = 0;
            i12 = 0;
        } else {
            int i14 = 0;
            i11 = 0;
            i12 = 0;
            while (i13 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i13);
                int iValueAt = sparseIntArray.valueAt(i13);
                i14 += iValueAt;
                if (iKeyAt > 700) {
                    i12 += iValueAt;
                } else if (iKeyAt > 16) {
                    i11 += iValueAt;
                }
                i13++;
            }
            i13 = i14;
        }
        return new b(i13, i11, i12);
    }

    private b h(Activity activity) {
        b bVarG;
        b bVarRemove = this.f79416d.remove(activity);
        if (bVarRemove == null || (bVarG = g()) == null) {
            return null;
        }
        return new b(bVarG.f79420a - bVarRemove.f79420a, bVarG.f79421b - bVarRemove.f79421b, bVarG.f79422c - bVarRemove.f79422c);
    }

    private void j(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.j.e().a()) {
                runnable.run();
            } else {
                this.f79417e.b(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.c(this.f79389a, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f79414b.getLogger().c(b7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void l(Activity activity) {
        b bVarG = g();
        if (bVarG != null) {
            this.f79416d.put(activity, bVarG);
        }
    }

    public void f(final Activity activity) {
        io.sentry.d1 d1VarA = this.f79418f.a();
        try {
            if (!i()) {
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } else {
                j(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79383a.f79413a.a().a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                l(activity);
                if (d1VarA != null) {
                    d1VarA.close();
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

    public boolean i() {
        return this.f79419g.a().booleanValue() && this.f79414b.isEnableFramesTracking() && !this.f79414b.isEnablePerformanceV2();
    }

    public void k(final Activity activity, io.sentry.protocol.x xVar) {
        io.sentry.d1 d1VarA = this.f79418f.a();
        try {
            if (!i()) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            j(new Runnable() { // from class: io.sentry.android.core.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79406a.f79413a.a().c(activity);
                }
            }, null);
            b bVarH = h(activity);
            if (bVarH != null && (bVarH.f79420a != 0 || bVarH.f79421b != 0 || bVarH.f79422c != 0)) {
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(Integer.valueOf(bVarH.f79420a), "none");
                io.sentry.protocol.k kVar2 = new io.sentry.protocol.k(Integer.valueOf(bVarH.f79421b), "none");
                io.sentry.protocol.k kVar3 = new io.sentry.protocol.k(Integer.valueOf(bVarH.f79422c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", kVar);
                map.put("frames_slow", kVar2);
                map.put("frames_frozen", kVar3);
                this.f79415c.put(xVar, map);
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
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

    public void m() {
        io.sentry.d1 d1VarA = this.f79418f.a();
        try {
            if (i()) {
                j(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79386a.f79413a.a().e();
                    }
                }, "FrameMetricsAggregator.stop");
                this.f79413a.a().d();
            }
            this.f79415c.clear();
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

    public Map<String, io.sentry.protocol.k> n(io.sentry.protocol.x xVar) {
        io.sentry.d1 d1VarA = this.f79418f.a();
        try {
            if (!i()) {
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            Map<String, io.sentry.protocol.k> map = this.f79415c.get(xVar);
            this.f79415c.remove(xVar);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return map;
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

    public i(io.sentry.util.u uVar, SentryAndroidOptions sentryAndroidOptions) {
        this(uVar, sentryAndroidOptions, new c2());
    }
}
