package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.o3;
import io.sentry.p4;
import io.sentry.q7;
import io.sentry.u3;
import io.sentry.v3;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
final class n0 implements io.sentry.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f79620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f79621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f79622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f79623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.c1 f79624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z0 f79625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f79626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f79627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.c0 f79628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile v3 f79629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile k0 f79630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f79631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f79632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Date f79633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f79634p;

    public n0(Context context, SentryAndroidOptions sentryAndroidOptions, z0 z0Var, io.sentry.android.core.internal.util.c0 c0Var) {
        this(context, z0Var, c0Var, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void d() {
        if (this.f79626h) {
            return;
        }
        this.f79626h = true;
        if (!this.f79622d) {
            this.f79620b.c(b7.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f79621c;
        if (str == null) {
            this.f79620b.c(b7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i11 = this.f79623e;
        if (i11 <= 0) {
            this.f79620b.c(b7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i11));
        } else {
            this.f79630l = new k0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f79623e, this.f79628j, this.f79624f, this.f79620b);
        }
    }

    @SuppressLint({"NewApi"})
    private boolean e() {
        k0.c cVarJ;
        if (this.f79630l == null || (cVarJ = this.f79630l.j()) == null) {
            return false;
        }
        this.f79631m = cVarJ.f79593a;
        this.f79632n = cVarJ.f79594b;
        this.f79633o = cVarJ.f79595c;
        return true;
    }

    @SuppressLint({"NewApi"})
    private u3 f(String str, String str2, String str3, boolean z11, List<o3> list, q7 q7Var) {
        if (this.f79625g.d() < 22 || this.f79630l == null) {
            return null;
        }
        io.sentry.d1 d1VarA = this.f79634p.a();
        try {
            v3 v3Var = this.f79629k;
            if (v3Var == null || !v3Var.h().equals(str2)) {
                this.f79620b.c(b7.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            this.f79629k = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            this.f79620b.c(b7.DEBUG, "Transaction %s (%s) finished.", str, str3);
            k0.b bVarG = this.f79630l.g(false, list);
            this.f79627i.set(false);
            if (bVarG == null) {
                return null;
            }
            long j11 = bVarG.f79588a - this.f79631m;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(v3Var);
            v3Var.k(Long.valueOf(bVarG.f79588a), Long.valueOf(this.f79631m), Long.valueOf(bVarG.f79589b), Long.valueOf(this.f79632n));
            Long lS = q7Var instanceof SentryAndroidOptions ? o1.k(this.f79619a, (SentryAndroidOptions) q7Var).s() : null;
            String string = lS != null ? Long.toString(lS.longValue()) : WebrtcBuildVersion.maint_version;
            String[] strArr = Build.SUPPORTED_ABIS;
            return new u3(bVarG.f79590c, this.f79633o, arrayList, str, str2, str3, Long.toString(j11), this.f79625g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[0], new Callable() { // from class: io.sentry.android.core.m0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return io.sentry.android.core.internal.util.m.a().c();
                }
            }, this.f79625g.b(), this.f79625g.c(), this.f79625g.e(), this.f79625g.f(), string, q7Var.getProguardUuid(), q7Var.getRelease(), q7Var.getEnvironment(), (bVarG.f79592e || z11) ? "timeout" : "normal", bVarG.f79591d);
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

    @Override // io.sentry.j1
    public void a(io.sentry.i1 i1Var) {
        if (this.f79627i.get() && this.f79629k == null) {
            io.sentry.d1 d1VarA = this.f79634p.a();
            try {
                if (this.f79627i.get() && this.f79629k == null) {
                    this.f79629k = new v3(i1Var, Long.valueOf(this.f79631m), Long.valueOf(this.f79632n));
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
    }

    @Override // io.sentry.j1
    public u3 b(io.sentry.i1 i1Var, List<o3> list, q7 q7Var) {
        return f(i1Var.getName(), i1Var.i().toString(), i1Var.e().p().toString(), false, list, q7Var);
    }

    @Override // io.sentry.j1
    public void close() {
        n0 n0Var;
        v3 v3Var = this.f79629k;
        if (v3Var != null) {
            n0Var = this;
            n0Var.f(v3Var.i(), v3Var.h(), v3Var.j(), true, null, p4.g().getOptions());
        } else {
            n0Var = this;
        }
        n0Var.f79627i.set(false);
        if (n0Var.f79630l != null) {
            n0Var.f79630l.f();
        }
    }

    @Override // io.sentry.j1
    public boolean isRunning() {
        return this.f79627i.get();
    }

    @Override // io.sentry.j1
    public void start() {
        if (this.f79625g.d() >= 22 && !this.f79627i.getAndSet(true)) {
            d();
            if (e()) {
                this.f79620b.c(b7.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.f79630l != null && this.f79630l.h()) {
                this.f79620b.c(b7.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            io.sentry.d1 d1VarA = this.f79634p.a();
            try {
                this.f79629k = null;
                if (d1VarA != null) {
                    d1VarA.close();
                }
                this.f79627i.set(false);
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

    public n0(Context context, z0 z0Var, io.sentry.android.core.internal.util.c0 c0Var, ILogger iLogger, String str, boolean z11, int i11, io.sentry.c1 c1Var) {
        this.f79626h = false;
        this.f79627i = new AtomicBoolean(false);
        this.f79630l = null;
        this.f79634p = new io.sentry.util.a();
        this.f79619a = (Context) io.sentry.util.y.c(g1.g(context), "The application context is required");
        this.f79620b = (ILogger) io.sentry.util.y.c(iLogger, "ILogger is required");
        this.f79628j = (io.sentry.android.core.internal.util.c0) io.sentry.util.y.c(c0Var, "SentryFrameMetricsCollector is required");
        this.f79625g = (z0) io.sentry.util.y.c(z0Var, "The BuildInfoProvider is required.");
        this.f79621c = str;
        this.f79622d = z11;
        this.f79623e = i11;
        this.f79624f = (io.sentry.c1) io.sentry.util.y.c(c1Var, "The ISentryExecutorService is required.");
        this.f79633o = io.sentry.l.d();
    }
}
