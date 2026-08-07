package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.g5;
import io.sentry.q7;
import io.sentry.v6;
import io.sentry.x8;
import io.sentry.y8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes9.dex */
public final class SentryPerformanceProvider extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f79319f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f79320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f79321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z0 f79322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f79323e = new io.sentry.util.a();

    public SentryPerformanceProvider() {
        z zVar = new z();
        this.f79321c = zVar;
        this.f79322d = new z0(zVar);
    }

    private void b(Context context, g5 g5Var, io.sentry.android.core.performance.h hVar) {
        if (!g5Var.f()) {
            this.f79321c.c(b7.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        v vVar = new v(this.f79322d, new io.sentry.android.core.internal.util.c0(context.getApplicationContext(), this.f79321c, this.f79322d), this.f79321c, g5Var.c(), g5Var.d(), new v6());
        hVar.x(null);
        hVar.w(vVar);
        this.f79321c.c(b7.DEBUG, "App start continuous profiling started.", new Object[0]);
        q7 q7VarEmpty = q7.empty();
        q7VarEmpty.setProfileSessionSampleRate(Double.valueOf(g5Var.f() ? 1.0d : 0.0d));
        vVar.b(g5Var.a(), new x8(q7VarEmpty));
    }

    private void c(Context context, g5 g5Var, io.sentry.android.core.performance.h hVar) {
        y8 y8Var = new y8(Boolean.valueOf(g5Var.l()), g5Var.e(), Boolean.valueOf(g5Var.i()), g5Var.b());
        hVar.y(y8Var);
        if (!y8Var.b().booleanValue() || !y8Var.e().booleanValue()) {
            this.f79321c.c(b7.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        n0 n0Var = new n0(context, this.f79322d, new io.sentry.android.core.internal.util.c0(context, this.f79321c, this.f79322d), this.f79321c, g5Var.c(), g5Var.j(), g5Var.d(), new v6());
        hVar.w(null);
        hVar.x(n0Var);
        this.f79321c.c(b7.DEBUG, "App start profiling started.", new Object[0]);
        n0Var.start();
    }

    private void d(io.sentry.android.core.performance.h hVar) {
        final Context context = getContext();
        if (context == null) {
            this.f79321c.c(b7.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File((File) new io.sentry.android.core.internal.util.h().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.p2
            @Override // io.sentry.util.runtime.a.InterfaceC1708a
            public final Object run() {
                return i0.f(context);
            }
        }), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    g5 g5Var = (g5) new io.sentry.b2(q7.empty()).c(bufferedReader, g5.class);
                    if (g5Var == null) {
                        this.f79321c.c(b7.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (g5Var.g() && g5Var.k()) {
                        b(context, g5Var, hVar);
                    } else if (!g5Var.j()) {
                        this.f79321c.c(b7.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (g5Var.h()) {
                        c(context, g5Var, hVar);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e11) {
                this.f79321c.a(b7.ERROR, "App start profiling config file not found. ", e11);
            } catch (Throwable th4) {
                this.f79321c.a(b7.ERROR, "Error reading app start profiling config file. ", th4);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void e(Context context, io.sentry.android.core.performance.h hVar) {
        hVar.r().p(f79319f);
        if (this.f79322d.d() >= 24) {
            hVar.l().p(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.f79320b = (Application) context;
        }
        Application application = this.f79320b;
        if (application == null) {
            return;
        }
        hVar.v(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        e(getContext(), hVarQ);
        d(hVarQ);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        io.sentry.d1 d1VarA = io.sentry.android.core.performance.h.f79678q.a();
        try {
            io.sentry.j1 j1VarJ = io.sentry.android.core.performance.h.q().j();
            if (j1VarJ != null) {
                j1VarJ.close();
            }
            io.sentry.n0 n0VarI = io.sentry.android.core.performance.h.q().i();
            if (n0VarI != null) {
                n0VarI.a(true);
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
