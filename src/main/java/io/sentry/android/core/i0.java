package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.ILogger;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b3;
import io.sentry.b7;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.f3;
import io.sentry.h3;
import io.sentry.h4;
import io.sentry.k7;
import io.sentry.t4;
import io.sentry.w4;
import io.sentry.x4;
import java.io.File;
import java.util.ArrayList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
final class i0 {
    static File f(Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    private static String g(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + Marker.ANY_NON_NULL_MARKER + str;
    }

    static void h(SentryAndroidOptions sentryAndroidOptions, Context context, z0 z0Var, io.sentry.util.u uVar, i iVar, boolean z11) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.s)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.d(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof io.sentry.h2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.e(context, sentryAndroidOptions, z0Var, io.sentry.android.core.internal.util.f.b()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.t(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new l1(context, z0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new g2(sentryAndroidOptions, iVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, z0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new t0(context, sentryAndroidOptions, z0Var));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.u) {
            sentryAndroidOptions.setTransportGate(new o0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.b(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof h3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.q(sentryAndroidOptions));
        }
        io.sentry.util.r<Boolean> rVarF = uVar.f("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zD = uVar.d("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(rVarF));
            if (zD && uVar.d("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zD && uVar.d("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.j.e());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof b3) {
            sentryAndroidOptions.setSocketTagger(l0.c());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new c0());
            sentryAndroidOptions.addPerformanceCollector(new w(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new r2(sentryAndroidOptions, (io.sentry.android.core.internal.util.c0) io.sentry.util.y.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof io.sentry.g2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.n(sentryAndroidOptions));
        }
        if (z11 && (sentryAndroidOptions.getReplayController().getReplayBreadcrumbConverter() instanceof io.sentry.o2)) {
            sentryAndroidOptions.getReplayController().p(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        io.sentry.d1 d1VarA = io.sentry.android.core.performance.h.f79678q.a();
        try {
            io.sentry.j1 j1VarJ = hVarQ.j();
            io.sentry.n0 n0VarI = hVarQ.i();
            hVarQ.x(null);
            hVarQ.w(null);
            if (d1VarA != null) {
                d1VarA.close();
            }
            l(sentryAndroidOptions, context, z0Var, j1VarJ, n0VarI, sentryAndroidOptions.getCompositePerformanceCollector());
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

    static void i(Context context, final SentryAndroidOptions sentryAndroidOptions, z0 z0Var, io.sentry.util.u uVar, i iVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        io.sentry.util.r rVar = new io.sentry.util.r(new io.sentry.util.r.a() { // from class: io.sentry.android.core.e0
            @Override // io.sentry.util.r.a
            public final Object a() {
                return Boolean.valueOf(io.sentry.android.core.cache.d.H(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new w4(new t4() { // from class: io.sentry.android.core.f0
            @Override // io.sentry.t4
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), rVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(uVar.g("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.o());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new x4(new t4() { // from class: io.sentry.android.core.g0
            @Override // io.sentry.t4
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), rVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(r0.a(context, z0Var));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, z0Var, iVar));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, uVar));
            if (z11) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(b7.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z12) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, z0Var));
        if (z13) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.n.b());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z14) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().g(new SentryAndroidOptions.a());
    }

    static void j(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, z0 z0Var) {
        io.sentry.util.y.c(context, "The context is required.");
        final Context contextG = g1.g(context);
        io.sentry.util.y.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.y.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setFatalLogger(new y());
        sentryAndroidOptions.setDefaultScopeType(h4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(k7.OFF);
        sentryAndroidOptions.setDateProvider(new n2());
        sentryAndroidOptions.setRuntimeManager(new io.sentry.android.core.internal.util.h());
        sentryAndroidOptions.getLogs().d(new b0());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.c0(contextG, iLogger, z0Var));
        d2.a(contextG, sentryAndroidOptions, z0Var);
        sentryAndroidOptions.setCacheDirPath((String) sentryAndroidOptions.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.d0
            @Override // io.sentry.util.runtime.a.InterfaceC1708a
            public final Object run() {
                return i0.f(contextG).getAbsolutePath();
            }
        }));
        k(sentryAndroidOptions, contextG, z0Var);
        y0.C().I(sentryAndroidOptions);
    }

    private static void k(SentryAndroidOptions sentryAndroidOptions, final Context context, z0 z0Var) {
        PackageInfo packageInfoP = g1.p(context, z0Var);
        if (packageInfoP != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(g(packageInfoP, g1.q(packageInfoP, z0Var)));
            }
            String str = packageInfoP.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId((String) sentryAndroidOptions.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.h0
                    @Override // io.sentry.util.runtime.a.InterfaceC1708a
                    public final Object run() {
                        return t1.a(context);
                    }
                }));
            } catch (RuntimeException e11) {
                sentryAndroidOptions.getLogger().a(b7.ERROR, "Could not generate distinct Id.", e11);
            }
        }
    }

    private static void l(SentryAndroidOptions sentryAndroidOptions, Context context, z0 z0Var, io.sentry.j1 j1Var, io.sentry.n0 n0Var, io.sentry.i iVar) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(io.sentry.i2.g());
            if (n0Var != null) {
                n0Var.a(true);
            }
            if (j1Var != null) {
                sentryAndroidOptions.setTransactionProfiler(j1Var);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new n0(context, sentryAndroidOptions, z0Var, (io.sentry.android.core.internal.util.c0) io.sentry.util.y.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(f3.c());
        if (j1Var != null) {
            j1Var.close();
        }
        if (n0Var == null) {
            sentryAndroidOptions.setContinuousProfiler(new v(z0Var, (io.sentry.android.core.internal.util.c0) io.sentry.util.y.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            return;
        }
        sentryAndroidOptions.setContinuousProfiler(n0Var);
        io.sentry.protocol.x xVarD = n0Var.d();
        if (!n0Var.isRunning() || xVarD.equals(io.sentry.protocol.x.f81078b)) {
            return;
        }
        iVar.f(xVarD.toString());
    }
}
