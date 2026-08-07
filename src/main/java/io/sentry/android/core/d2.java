package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.r4;
import io.sentry.s3;
import io.sentry.s7;
import io.sentry.w6;
import io.sentry.z6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
final class d2 {
    static void a(Context context, SentryAndroidOptions sentryAndroidOptions, z0 z0Var) {
        List<String> listF;
        List<String> listF2;
        List<String> listF3;
        List<String> listF4;
        io.sentry.util.y.c(context, "The application context is required.");
        io.sentry.util.y.c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleB = b(context, sentryAndroidOptions.getLogger(), z0Var);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundleB != null) {
                sentryAndroidOptions.setDebug(d(bundleB, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strH = h(bundleB, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strH != null) {
                        sentryAndroidOptions.setDiagnosticLevel(b7.valueOf(strH.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(bundleB, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(bundleB, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dE = e(bundleB, logger, "io.sentry.sample-rate");
                    if (dE != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dE));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(bundleB, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(g(bundleB, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(d(bundleB, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strH2 = h(bundleB, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zD = d(bundleB, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zD || (strH2 != null && strH2.isEmpty())) {
                    sentryAndroidOptions.getLogger().c(b7.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strH2 == null) {
                    sentryAndroidOptions.getLogger().c(b7.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zD);
                sentryAndroidOptions.setDsn(strH2);
                sentryAndroidOptions.setEnableNdk(d(bundleB, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(bundleB, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(h(bundleB, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(h(bundleB, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(g(bundleB, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) g(bundleB, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(bundleB, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(bundleB, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(bundleB, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(d(bundleB, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(d(bundleB, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (d(bundleB, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.m1.LOW);
                }
                sentryAndroidOptions.setForceInit(d(bundleB, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(d(bundleB, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dE2 = e(bundleB, logger, "io.sentry.traces.sample-rate");
                    if (dE2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dE2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(d(bundleB, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(bundleB, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(bundleB, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dE3 = e(bundleB, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dE3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dE3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dE4 = e(bundleB, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dE4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dE4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strH3 = h(bundleB, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strH3 != null) {
                    sentryAndroidOptions.setProfileLifecycle(s3.valueOf(strH3.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(d(bundleB, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(d(bundleB, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(bundleB, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jG = g(bundleB, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jG != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jG));
                }
                List<String> listF5 = f(bundleB, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundleB.containsKey("io.sentry.traces.trace-propagation-targets") && listF5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listF5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listF5);
                }
                sentryAndroidOptions.setEnableFramesTracking(d(bundleB, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(h(bundleB, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.r sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.r("", "");
                }
                sdkVersion.i(i(bundleB, logger, "io.sentry.sdk.name", sdkVersion.f()));
                sdkVersion.k(i(bundleB, logger, "io.sentry.sdk.version", sdkVersion.h()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(d(bundleB, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List<String> listF6 = f(bundleB, logger, "io.sentry.gradle-plugin-integrations");
                if (listF6 != null) {
                    Iterator<String> it = listF6.iterator();
                    while (it.hasNext()) {
                        z6.d().a(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(d(bundleB, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(d(bundleB, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(d(bundleB, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(d(bundleB, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(d(bundleB, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(d(bundleB, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(g(bundleB, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().q() == null) {
                    double dE5 = e(bundleB, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dE5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().N(Double.valueOf(dE5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().l() == null) {
                    double dE6 = e(bundleB, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dE6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().J(Double.valueOf(dE6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().C(d(bundleB, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().B(d(bundleB, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().A(d(bundleB, logger, "io.sentry.session-replay.debug", false));
                String strH4 = h(bundleB, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strH4 != null) {
                    if ("canvas".equals(strH4.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().L(r4.CANVAS);
                    } else {
                        sentryAndroidOptions.getSessionReplay().L(r4.PIXEL_COPY);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().g().isEmpty() && (listF4 = f(bundleB, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listF4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it2 = listF4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = it2.next().trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().F(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().h().isEmpty() && (listF3 = f(bundleB, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listF3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it3 = listF3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = it3.next().trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().G(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().E(d(bundleB, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().v()));
                if (sentryAndroidOptions.getSessionReplay().j().size() == s7.i().size() && (listF2 = f(bundleB, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<String> it4 = listF2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = it4.next().trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().H(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().k().size() == s7.i().size() && (listF = f(bundleB, logger, "io.sentry.session-replay.network-response-headers")) != null && !listF.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<String> it5 = listF.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = it5.next().trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().I(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(f(bundleB, logger, "io.sentry.ignored-errors"));
                List<String> listF7 = f(bundleB, logger, "io.sentry.in-app-includes");
                if (listF7 != null && !listF7.isEmpty()) {
                    Iterator<String> it6 = listF7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude(it6.next());
                    }
                }
                List<String> listF8 = f(bundleB, logger, "io.sentry.in-app-excludes");
                if (listF8 != null && !listF8.isEmpty()) {
                    Iterator<String> it7 = listF8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude(it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().c(d(bundleB, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().b()));
                w6 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.i(d(bundleB, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                feedbackOptions.l(d(bundleB, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                feedbackOptions.h(d(bundleB, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                feedbackOptions.k(d(bundleB, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                feedbackOptions.m(d(bundleB, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                feedbackOptions.j(d(bundleB, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
            }
            sentryAndroidOptions.getLogger().c(b7.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(b7.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    private static Bundle b(Context context, ILogger iLogger, z0 z0Var) {
        if (z0Var == null) {
            z0Var = new z0(iLogger);
        }
        ApplicationInfo applicationInfoH = g1.h(context, z0Var);
        if (applicationInfoH != null) {
            return applicationInfoH.metaData;
        }
        return null;
    }

    static boolean c(Context context, ILogger iLogger) {
        io.sentry.util.y.c(context, "The application context is required.");
        try {
            Bundle bundleB = b(context, iLogger, null);
            if (bundleB != null) {
                return d(bundleB, iLogger, "io.sentry.auto-init", true);
            }
            return true;
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
            return true;
        }
    }

    private static boolean d(Bundle bundle, ILogger iLogger, String str, boolean z11) {
        boolean z12 = bundle.getBoolean(str, z11);
        iLogger.c(b7.DEBUG, str + " read: " + z12, new Object[0]);
        return z12;
    }

    private static double e(Bundle bundle, ILogger iLogger, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.c(b7.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    private static List<String> f(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.c(b7.DEBUG, str + " read: " + string, new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long g(Bundle bundle, ILogger iLogger, String str, long j11) {
        long j12 = bundle.getInt(str, (int) j11);
        iLogger.c(b7.DEBUG, str + " read: " + j12, new Object[0]);
        return j12;
    }

    private static String h(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(b7.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }

    private static String i(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(b7.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }
}
