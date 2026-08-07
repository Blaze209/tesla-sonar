package io.sentry.util;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.h3;
import io.sentry.i2;
import io.sentry.n0;
import io.sentry.n2;
import io.sentry.q7;
import io.sentry.w0;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    private static String a(q7 q7Var) {
        String profilingTracesDirPath = q7Var.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            q7Var.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static w0 b(q7 q7Var) {
        if (!e(q7Var)) {
            return q7Var.getProfilerConverter();
        }
        w0 w0VarB = io.sentry.profiling.c.b();
        if (w0VarB instanceof n2) {
            q7Var.getLogger().c(b7.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
        } else {
            q7Var.setProfilerConverter(w0VarB);
            q7Var.getLogger().c(b7.INFO, "Successfully loaded profile converter", new Object[0]);
        }
        return q7Var.getProfilerConverter();
    }

    public static n0 c(q7 q7Var) {
        if (!f(q7Var)) {
            return q7Var.getContinuousProfiler();
        }
        try {
            n0 n0VarA = io.sentry.profiling.c.a(q7Var.getLogger(), a(q7Var), q7Var.getProfilingTracesHz(), q7Var.getExecutorService());
            if (n0VarA instanceof i2) {
                q7Var.getLogger().c(b7.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } else {
                q7Var.setContinuousProfiler(n0VarA);
                q7Var.getLogger().c(b7.INFO, "Successfully loaded profiler", new Object[0]);
            }
        } catch (Exception e11) {
            q7Var.getLogger().a(b7.ERROR, "Failed to create default profiling traces directory", e11);
        }
        return q7Var.getContinuousProfiler();
    }

    public static boolean d(q7 q7Var, q7 q7Var2, boolean z11) {
        if (a0.c() && (q7Var2.getVersionDetector() instanceof h3)) {
            q7Var2.setVersionDetector(new d2(q7Var2));
        }
        if (!q7Var2.getVersionDetector().a()) {
            return !z11 || q7Var == null || q7Var2.isForceInit() || q7Var.getInitPriority().ordinal() <= q7Var2.getInitPriority().ordinal();
        }
        q7Var2.getLogger().c(b7.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (a0.a() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }

    private static boolean e(q7 q7Var) {
        return a0.c() && q7Var.isContinuousProfilingEnabled() && (q7Var.getProfilerConverter() instanceof n2);
    }

    private static boolean f(q7 q7Var) {
        return a0.c() && q7Var.isContinuousProfilingEnabled() && (q7Var.getContinuousProfiler() instanceof i2);
    }
}
