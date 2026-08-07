package io.sentry.android.core;

import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.q7;
import io.sentry.w6;

/* JADX INFO: loaded from: classes9.dex */
public final class SentryAndroidOptions extends q7 {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private b beforeScreenshotCaptureCallback;
    private b beforeViewHierarchyCaptureCallback;
    private io.sentry.android.core.internal.util.c0 frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private s1 debugImagesLoader = f2.a();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private e2 ndkHandlerStrategy = e2.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean enableSystemEventBreadcrumbsExtras = false;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;

    static class a implements w6.a {
        a() {
        }
    }

    public interface b {
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.29.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private io.sentry.protocol.r createSdkVersion() {
        io.sentry.protocol.r rVarL = io.sentry.protocol.r.l(getSdkVersion(), "sentry.java.android", "8.29.0");
        rVarL.d("maven:io.sentry:sentry-android-core", "8.29.0");
        return rVarL;
    }

    public void enableAllAutoBreadcrumbs(boolean z11) {
        this.enableActivityLifecycleBreadcrumbs = z11;
        this.enableAppComponentBreadcrumbs = z11;
        this.enableSystemEventBreadcrumbs = z11;
        this.enableAppLifecycleBreadcrumbs = z11;
        this.enableNetworkEventBreadcrumbs = z11;
        setEnableUserInteractionBreadcrumbs(z11);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public b getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public b getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public s1 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public io.sentry.android.core.internal.util.c0 getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z11) {
        this.anrEnabled = z11;
    }

    public void setAnrReportInDebug(boolean z11) {
        this.anrReportInDebug = z11;
    }

    public void setAnrTimeoutIntervalMillis(long j11) {
        this.anrTimeoutIntervalMillis = j11;
    }

    public void setAttachAnrThreadDump(boolean z11) {
        this.attachAnrThreadDump = z11;
    }

    public void setAttachScreenshot(boolean z11) {
        this.attachScreenshot = z11;
    }

    public void setAttachViewHierarchy(boolean z11) {
        this.attachViewHierarchy = z11;
    }

    public void setBeforeScreenshotCaptureCallback(b bVar) {
    }

    public void setBeforeViewHierarchyCaptureCallback(b bVar) {
    }

    public void setCollectAdditionalContext(boolean z11) {
        this.collectAdditionalContext = z11;
    }

    public void setDebugImagesLoader(s1 s1Var) {
        if (s1Var == null) {
            s1Var = f2.a();
        }
        this.debugImagesLoader = s1Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z11) {
        this.enableActivityLifecycleBreadcrumbs = z11;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z11) {
        this.enableActivityLifecycleTracingAutoFinish = z11;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z11) {
        this.enableAppComponentBreadcrumbs = z11;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z11) {
        this.enableAppLifecycleBreadcrumbs = z11;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z11) {
        this.enableAutoActivityLifecycleTracing = z11;
    }

    public void setEnableAutoTraceIdGeneration(boolean z11) {
        this.enableAutoTraceIdGeneration = z11;
    }

    public void setEnableFramesTracking(boolean z11) {
        this.enableFramesTracking = z11;
    }

    public void setEnableNdk(boolean z11) {
        this.enableNdk = z11;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z11) {
        this.enableNetworkEventBreadcrumbs = z11;
    }

    public void setEnablePerformanceV2(boolean z11) {
        this.enablePerformanceV2 = z11;
    }

    public void setEnableRootCheck(boolean z11) {
        this.enableRootCheck = z11;
    }

    public void setEnableScopeSync(boolean z11) {
        this.enableScopeSync = z11;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z11) {
        this.enableSystemEventBreadcrumbs = z11;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z11) {
        this.enableSystemEventBreadcrumbsExtras = z11;
    }

    public void setFrameMetricsCollector(io.sentry.android.core.internal.util.c0 c0Var) {
        this.frameMetricsCollector = c0Var;
    }

    public void setNativeHandlerStrategy(e2 e2Var) {
        this.ndkHandlerStrategy = e2Var;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z11) {
        this.reportHistoricalAnrs = z11;
    }

    void setStartupCrashFlushTimeoutMillis(long j11) {
        this.startupCrashFlushTimeoutMillis = j11;
    }
}
