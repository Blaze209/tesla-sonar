package io.sentry;

import com.google.android.gms.common.Scopes;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a1 f80548a = v2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile z0 f80549b = t2.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x0 f80550c = new d4(q7.empty());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f80551d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f80552e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f80553f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final io.sentry.util.a f80554g = new io.sentry.util.a();

    public interface a<T extends q7> {
        void a(T t11);
    }

    private static void A(q7 q7Var) {
        io.sentry.opentelemetry.a.c(q7Var, new io.sentry.util.u());
        if (k7.OFF == q7Var.getOpenTelemetryMode()) {
            q7Var.setSpanFactory(new p());
        }
        D(q7Var);
        io.sentry.opentelemetry.a.a(q7Var);
    }

    private static void B(q7 q7Var) {
        io.sentry.util.o.c(q7Var);
        io.sentry.util.o.b(q7Var);
    }

    private static void C(q7 q7Var) {
        if (q7Var.isDebug() && (q7Var.getLogger() instanceof m2)) {
            q7Var.setLogger(new v8());
        }
    }

    private static void D(q7 q7Var) {
        u().close();
        if (k7.OFF == q7Var.getOpenTelemetryMode()) {
            f80548a = new o();
        } else {
            f80548a = q4.a(new io.sentry.util.u(), m2.e());
        }
    }

    public static Boolean E() {
        return r().w();
    }

    public static boolean F() {
        return r().isEnabled();
    }

    public static boolean G() {
        return r().k();
    }

    private static void H(q7 q7Var) {
        try {
            q7Var.getExecutorService().submit(new f2(q7Var));
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.DEBUG, "Failed to move previous session.", th2);
        }
    }

    private static void I(final q7 q7Var) {
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.e5
                @Override // java.lang.Runnable
                public final void run() {
                    f5.d(q7Var);
                }
            });
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    private static boolean J(q7 q7Var) {
        if (q7Var.isEnableExternalConfiguration()) {
            q7Var.merge(e0.g(io.sentry.config.g.a(), q7Var.getLogger()));
        }
        String dsn = q7Var.getDsn();
        if (!q7Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            k();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        q7Var.retrieveParsedDsn();
        return true;
    }

    private static y8 K(q7 q7Var) {
        z8 z8Var = new z8("app.launch", Scopes.PROFILE);
        z8Var.B(true);
        return q7Var.getInternalTracesSampler().a(new c4(z8Var, null, Double.valueOf(io.sentry.util.d0.a().c()), null));
    }

    public static void L() {
        r().h();
    }

    public static i1 M(z8 z8Var, b9 b9Var) {
        return r().v(z8Var, b9Var);
    }

    public static /* synthetic */ void a(q7 q7Var) {
        String cacheDirPathWithoutDsn = q7Var.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                io.sentry.util.i.a(file);
                if (q7Var.isEnableAppStartProfiling() || q7Var.isStartProfilerOnAppStart()) {
                    if (!q7Var.isStartProfilerOnAppStart() && !q7Var.isTracingEnabled()) {
                        q7Var.getLogger().c(b7.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        g5 g5Var = new g5(q7Var, q7Var.isEnableAppStartProfiling() ? K(q7Var) : new y8(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f80552e));
                            try {
                                q7Var.getSerializer().a(g5Var, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th6) {
                q7Var.getLogger().a(b7.ERROR, "Unable to create app start profiling config file. ", th6);
            }
        }
    }

    public static /* synthetic */ void d(q7 q7Var) {
        for (s0 s0Var : q7Var.getOptionsObservers()) {
            s0Var.k(q7Var.getRelease());
            s0Var.h(q7Var.getProguardUuid());
            s0Var.i(q7Var.getSdkVersion());
            s0Var.f(q7Var.getDist());
            s0Var.g(q7Var.getEnvironment());
            s0Var.e(q7Var.getTags());
            s0Var.j(q7Var.getSessionReplay().l());
        }
        io.sentry.cache.t tVarFindPersistingScopeObserver = q7Var.findPersistingScopeObserver();
        if (tVarFindPersistingScopeObserver != null) {
            tVarFindPersistingScopeObserver.C();
        }
    }

    public static /* synthetic */ void f(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f80553f - TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.i.a(file2);
            }
        }
    }

    public static void h(e eVar, h0 h0Var) {
        r().d(eVar, h0Var);
    }

    private static <T extends q7> void i(a<T> aVar, T t11) {
        try {
            aVar.a(t11);
        } catch (Throwable th2) {
            t11.getLogger().a(b7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    public static io.sentry.protocol.x j(r6 r6Var, h0 h0Var) {
        return r().D(r6Var, h0Var);
    }

    public static void k() {
        d1 d1VarA = f80554g.a();
        try {
            z0 z0VarR = r();
            f80549b = t2.i();
            u().close();
            z0VarR.a(false);
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

    public static void l(f4 f4Var) {
        m(null, f4Var);
    }

    public static void m(h4 h4Var, f4 f4Var) {
        r().A(h4Var, f4Var);
    }

    public static void n() {
        r().l();
    }

    private static void o(q7 q7Var, z0 z0Var) {
        try {
            q7Var.getExecutorService().submit(new p3(q7Var, z0Var));
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    public static void p(long j11) {
        r().b(j11);
    }

    public static z0 q(String str) {
        return r().E(str);
    }

    public static z0 r() {
        return s(true);
    }

    public static z0 s(boolean z11) {
        if (f80551d) {
            return f80549b;
        }
        z0 z0Var = u().get();
        if (z0Var != null && !z0Var.z()) {
            return z0Var;
        }
        if (!z11) {
            return t2.i();
        }
        z0 z0VarE = f80549b.E("getCurrentScopes");
        u().a(z0VarE);
        return z0VarE;
    }

    public static x0 t() {
        return f80550c;
    }

    private static a1 u() {
        return f80548a;
    }

    private static void v(final q7 q7Var, c1 c1Var) {
        try {
            c1Var.submit(new Runnable() { // from class: io.sentry.z4
                @Override // java.lang.Runnable
                public final void run() {
                    f5.a(q7Var);
                }
            });
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th2);
        }
    }

    public static <T extends q7> void w(k3<T> k3Var, a<T> aVar, boolean z11) {
        T tB = k3Var.b();
        i(aVar, tB);
        x(tB, z11);
    }

    private static void x(final q7 q7Var, boolean z11) {
        d1 d1VarA = f80554g.a();
        try {
            if (!q7Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.a0.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + q7Var.getClass().getName());
            }
            if (!J(q7Var)) {
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = q7Var.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z11 = boolIsGlobalHubMode.booleanValue();
            }
            q7Var.getLogger().c(b7.INFO, "GlobalHubMode: '%s'", String.valueOf(z11));
            f80551d = z11;
            z(q7Var);
            x0 x0Var = f80550c;
            if (io.sentry.util.o.d(x0Var.getOptions(), q7Var, F())) {
                if (F()) {
                    q7Var.getLogger().c(b7.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                r().a(true);
                x0Var.E(q7Var);
                f80549b = new o4(new d4(q7Var), new d4(q7Var), x0Var, "Sentry.init");
                C(q7Var);
                A(q7Var);
                u().a(f80549b);
                y(q7Var);
                x0Var.w(new l5(q7Var));
                if (q7Var.getExecutorService().isClosed()) {
                    q7Var.setExecutorService(new v6(q7Var));
                    q7Var.getExecutorService().a();
                }
                try {
                    q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.y4
                        @Override // java.lang.Runnable
                        public final void run() {
                            q7Var.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    q7Var.getLogger().a(b7.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e11);
                }
                H(q7Var);
                for (o1 o1Var : q7Var.getIntegrations()) {
                    try {
                        o1Var.n(p4.g(), q7Var);
                    } catch (Throwable th2) {
                        q7Var.getLogger().a(b7.WARNING, "Failed to register the integration " + o1Var.getClass().getName(), th2);
                    }
                }
                I(q7Var);
                o(q7Var, p4.g());
                v(q7Var, q7Var.getExecutorService());
                ILogger logger = q7Var.getLogger();
                b7 b7Var = b7.DEBUG;
                logger.c(b7Var, "Using openTelemetryMode %s", q7Var.getOpenTelemetryMode());
                q7Var.getLogger().c(b7Var, "Using span factory %s", q7Var.getSpanFactory().getClass().getName());
                q7Var.getLogger().c(b7Var, "Using scopes storage %s", f80548a.getClass().getName());
            } else {
                q7Var.getLogger().c(b7.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th3) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static void y(q7 q7Var) {
        ILogger logger = q7Var.getLogger();
        b7 b7Var = b7.INFO;
        logger.c(b7Var, "Initializing SDK with DSN: '%s'", q7Var.getDsn());
        String outboxPath = q7Var.getOutboxPath();
        if (outboxPath != null) {
            final File file = new File(outboxPath);
            q7Var.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.a5
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return Boolean.valueOf(file.mkdirs());
                }
            });
        } else {
            logger.c(b7Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath != null) {
            final File file2 = new File(cacheDirPath);
            q7Var.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.b5
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return Boolean.valueOf(file2.mkdirs());
                }
            });
            if (q7Var.getEnvelopeDiskCache() instanceof io.sentry.transport.s) {
                q7Var.setEnvelopeDiskCache(io.sentry.cache.f.r(q7Var));
            }
        }
        String profilingTracesDirPath = q7Var.getProfilingTracesDirPath();
        if ((q7Var.isProfilingEnabled() || q7Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file3 = new File(profilingTracesDirPath);
            q7Var.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.c5
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return Boolean.valueOf(file3.mkdirs());
                }
            });
            try {
                q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.d5
                    @Override // java.lang.Runnable
                    public final void run() {
                        f5.f(file3);
                    }
                });
            } catch (RejectedExecutionException e11) {
                q7Var.getLogger().a(b7.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e11);
            }
        }
        io.sentry.internal.modules.b modulesLoader = q7Var.getModulesLoader();
        if (!q7Var.isSendModules()) {
            q7Var.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            q7Var.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(q7Var.getLogger()), new io.sentry.internal.modules.f(q7Var.getLogger())), q7Var.getLogger()));
        }
        if (q7Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            q7Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(q7Var.getLogger()));
        }
        io.sentry.util.d.a(q7Var, q7Var.getDebugMetaLoader().a());
        if (q7Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            q7Var.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (q7Var.getPerformanceCollectors().isEmpty()) {
            q7Var.addPerformanceCollector(new p1());
        }
        if (q7Var.isEnableBackpressureHandling() && io.sentry.util.a0.c()) {
            if (q7Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                q7Var.setBackpressureMonitor(new io.sentry.backpressure.a(q7Var, p4.g()));
            }
            q7Var.getBackpressureMonitor().start();
        }
        B(q7Var);
        q7Var.getLogger().c(b7.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(q7Var.isContinuousProfilingEnabled()), q7Var.getProfileLifecycle());
    }

    private static void z(q7 q7Var) {
        if (q7Var.getFatalLogger() instanceof m2) {
            q7Var.setFatalLogger(new v8());
        }
    }
}
