package io.sentry;

import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes9.dex */
public class q7 {
    static final b7 DEFAULT_DIAGNOSTIC_LEVEL = b7.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private a beforeBreadcrumb;
    private b beforeEnvelopeCallback;
    private c beforeSend;
    private c beforeSendFeedback;
    private d beforeSendReplay;
    private e beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.h clientReportRecorder;
    private io.sentry.i compositePerformanceCollector;
    private m0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private n0 continuousProfiler;
    private f cron;
    private final io.sentry.util.r<o5> dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private h4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private b7 diagnosticLevel;
    private String dist;
    private String distinctId;
    private g distribution;
    private o0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.g envelopeDiskCache;
    private final io.sentry.util.r<p0> envelopeReader;
    private String environment;
    private final List<c0> eventProcessors;
    private c1 executorService;
    private final d0 experimental;
    private ILogger fatalLogger;
    private w6 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private g0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<f0> ignoredCheckIns;
    private List<f0> ignoredErrors;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<f0> ignoredSpanOrigins;
    private List<f0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private m1 initPriority;
    private n1 instrumenter;
    private final List<o1> integrations;
    private volatile x8 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private ILogger logger;
    private h logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private m maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.b modulesLoader;
    private final List<y0> observers;
    private i onDiscard;
    private j onOversizedEvent;
    private k7 openTelemetryMode;
    private final List<s0> optionsObservers;
    private final io.sentry.util.r<v> parsedDsn;
    private final List<t0> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private s3 profileLifecycle;
    private Double profileSessionSampleRate;
    private w0 profilerConverter;
    private Double profilesSampleRate;
    private k profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private l proxy;
    private int readTimeoutMillis;
    private String release;
    private y3 replayController;
    private io.sentry.util.runtime.a runtimeManager;
    private Double sampleRate;
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.r<e1> serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private s7 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private f1 socketTagger;
    private h1 spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private n tracesSampler;
    private j1 transactionProfiler;
    private k1 transportFactory;
    private io.sentry.transport.r transportGate;
    private l1 versionDetector;
    private final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters;

    public interface a {
        io.sentry.e a(io.sentry.e eVar, h0 h0Var);
    }

    public interface b {
        void c(p5 p5Var, h0 h0Var);
    }

    public interface c {
        r6 a(r6 r6Var, h0 h0Var);
    }

    public interface d {
    }

    public interface e {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f81122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f81123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f81124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f81125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f81126e;

        public Long a() {
            return this.f81122a;
        }

        public Long b() {
            return this.f81125d;
        }

        public Long c() {
            return this.f81123b;
        }

        public Long d() {
            return this.f81126e;
        }

        public String e() {
            return this.f81124c;
        }

        public void f(Long l11) {
            this.f81122a = l11;
        }

        public void g(Long l11) {
            this.f81125d = l11;
        }

        public void h(Long l11) {
            this.f81123b = l11;
        }

        public void i(Long l11) {
            this.f81126e = l11;
        }

        public void j(String str) {
            this.f81124c = str;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f81127a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f81128b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f81129c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f81130d = "https://sentry.io";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f81131e = null;
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f81132a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.sentry.logger.d f81133b = new io.sentry.logger.a();

        public io.sentry.logger.d a() {
            return this.f81133b;
        }

        public boolean b() {
            return this.f81132a;
        }

        public void c(boolean z11) {
            this.f81132a = z11;
        }

        public void d(io.sentry.logger.d dVar) {
            this.f81133b = dVar;
        }
    }

    public interface i {
    }

    public interface j {
    }

    public interface k {
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f81134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f81135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f81136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f81137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Proxy.Type f81138e;

        public l(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public String a() {
            return this.f81134a;
        }

        public String b() {
            return this.f81137d;
        }

        public String c() {
            return this.f81135b;
        }

        public Proxy.Type d() {
            return this.f81138e;
        }

        public String e() {
            return this.f81136c;
        }

        public l(String str, String str2, Proxy.Type type, String str3, String str4) {
            this.f81134a = str;
            this.f81135b = str2;
            this.f81138e = type;
            this.f81136c = str3;
            this.f81137d = str4;
        }
    }

    public enum m {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface n {
        Double a(c4 c4Var);
    }

    public q7() {
        this(false);
    }

    public static /* synthetic */ o5 a() {
        return new h5();
    }

    private void addPackageInfo() {
        z6.d().b("maven:io.sentry:sentry", "8.29.0");
    }

    public static /* synthetic */ v b(q7 q7Var) {
        return new v(q7Var.dsn);
    }

    public static /* synthetic */ p0 c(q7 q7Var) {
        q7Var.getClass();
        return new x(q7Var.serializer.a());
    }

    private io.sentry.protocol.r createSdkVersion() {
        io.sentry.protocol.r rVar = new io.sentry.protocol.r("sentry.java", "8.29.0");
        rVar.k("8.29.0");
        return rVar;
    }

    public static /* synthetic */ e1 d(q7 q7Var) {
        q7Var.getClass();
        return new b2(q7Var);
    }

    public static q7 empty() {
        return new q7(true);
    }

    private /* synthetic */ void lambda$new$4(io.sentry.protocol.x xVar, w6.b bVar) {
        this.logger.c(b7.WARNING, "showDialog() can only be called in Android.", new Object[0]);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(c0 c0Var) {
        this.eventProcessors.add(c0Var);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new f0(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new f0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new f0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new f0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(o1 o1Var) {
        this.integrations.add(o1Var);
    }

    public void addOptionsObserver(s0 s0Var) {
        this.optionsObservers.add(s0Var);
    }

    public void addPerformanceCollector(t0 t0Var) {
        this.performanceCollectors.add(t0Var);
    }

    public void addScopeObserver(y0 y0Var) {
        this.observers.add(y0Var);
    }

    boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public io.sentry.cache.t findPersistingScopeObserver() {
        for (y0 y0Var : this.observers) {
            if (y0Var instanceof io.sentry.cache.t) {
                return (io.sentry.cache.t) y0Var;
            }
        }
        return null;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public b getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public c getBeforeSend() {
        return this.beforeSend;
    }

    public c getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public d getBeforeSendReplay() {
        return null;
    }

    public e getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public io.sentry.i getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public m0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public n0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public f getCron() {
        return this.cron;
    }

    public o5 getDateProvider() {
        return this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public h4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public b7 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public g getDistribution() {
        return this.distribution;
    }

    public o0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public p0 getEnvelopeReader() {
        return this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<c0> getEventProcessors() {
        return this.eventProcessors;
    }

    public c1 getExecutorService() {
        return this.executorService;
    }

    public d0 getExperimental() {
        return this.experimental;
    }

    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    public w6 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public g0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<f0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<f0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<f0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<f0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public m1 getInitPriority() {
        return this.initPriority;
    }

    public n1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<o1> getIntegrations() {
        return this.integrations;
    }

    public x8 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            d1 d1VarA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new x8(this);
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
        return this.internalTracesSampler;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public h getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public m getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    public i getOnDiscard() {
        return null;
    }

    public j getOnOversizedEvent() {
        return null;
    }

    public k7 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<s0> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<t0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public s3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public w0 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public k getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public l getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public y3 getReplayController() {
        return this.replayController;
    }

    public io.sentry.util.runtime.a getRuntimeManager() {
        return this.runtimeManager;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<y0> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public e1 getSerializer() {
        return this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public s7 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public f1 getSocketTagger() {
        return this.socketTagger;
    }

    public h1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public n getTracesSampler() {
        return this.tracesSampler;
    }

    public j1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public k1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.r getTransportGate() {
        return this.transportGate;
    }

    public l1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<io.sentry.internal.viewhierarchy.a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d11;
        return this.profilesSampleRate == null && (d11 = this.profileSessionSampleRate) != null && d11.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d11 = this.profilesSampleRate;
        return d11 != null && d11.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(e0 e0Var) {
        if (e0Var.m() != null) {
            setDsn(e0Var.m());
        }
        if (e0Var.p() != null) {
            setEnvironment(e0Var.p());
        }
        if (e0Var.F() != null) {
            setRelease(e0Var.F());
        }
        if (e0Var.l() != null) {
            setDist(e0Var.l());
        }
        if (e0Var.H() != null) {
            setServerName(e0Var.H());
        }
        if (e0Var.E() != null) {
            setProxy(e0Var.E());
        }
        if (e0Var.o() != null) {
            setEnableUncaughtExceptionHandler(e0Var.o().booleanValue());
        }
        if (e0Var.y() != null) {
            setPrintUncaughtStackTrace(e0Var.y().booleanValue());
        }
        if (e0Var.L() != null) {
            setTracesSampleRate(e0Var.L());
        }
        if (e0Var.B() != null) {
            setProfilesSampleRate(e0Var.B());
        }
        if (e0Var.k() != null) {
            setDebug(e0Var.k().booleanValue());
        }
        if (e0Var.n() != null) {
            setEnableDeduplication(e0Var.n().booleanValue());
        }
        if (e0Var.G() != null) {
            setSendClientReports(e0Var.G().booleanValue());
        }
        if (e0Var.S() != null) {
            setForceInit(e0Var.S().booleanValue());
        }
        for (Map.Entry entry : new HashMap(e0Var.J()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(e0Var.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(e0Var.v()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(e0Var.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (e0Var.K() != null) {
            setTracePropagationTargets(new ArrayList(e0Var.K()));
        }
        Iterator it4 = new ArrayList(e0Var.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (e0Var.D() != null) {
            setProguardUuid(e0Var.D());
        }
        if (e0Var.q() != null) {
            setIdleTimeout(e0Var.q());
        }
        Iterator<String> it5 = e0Var.h().iterator();
        while (it5.hasNext()) {
            addBundleId(it5.next());
        }
        if (e0Var.R() != null) {
            setEnabled(e0Var.R().booleanValue());
        }
        if (e0Var.P() != null) {
            setEnablePrettySerializationOutput(e0Var.P().booleanValue());
        }
        if (e0Var.V() != null) {
            setSendModules(e0Var.V().booleanValue());
        }
        if (e0Var.r() != null) {
            setIgnoredCheckIns(new ArrayList(e0Var.r()));
        }
        if (e0Var.u() != null) {
            setIgnoredTransactions(new ArrayList(e0Var.u()));
        }
        if (e0Var.s() != null) {
            setIgnoredErrors(new ArrayList(e0Var.s()));
        }
        if (e0Var.N() != null) {
            setEnableBackpressureHandling(e0Var.N().booleanValue());
        }
        if (e0Var.x() != null) {
            setMaxRequestBodySize(e0Var.x());
        }
        if (e0Var.U() != null) {
            setSendDefaultPii(e0Var.U().booleanValue());
        }
        if (e0Var.M() != null) {
            setCaptureOpenTelemetryEvents(e0Var.M().booleanValue());
        }
        if (e0Var.Q() != null) {
            setEnableSpotlight(e0Var.Q().booleanValue());
        }
        if (e0Var.I() != null) {
            setSpotlightConnectionUrl(e0Var.I());
        }
        if (e0Var.T() != null) {
            setGlobalHubMode(e0Var.T());
        }
        if (e0Var.j() != null) {
            if (getCron() == null) {
                setCron(e0Var.j());
            } else {
                if (e0Var.j().a() != null) {
                    getCron().f(e0Var.j().a());
                }
                if (e0Var.j().c() != null) {
                    getCron().h(e0Var.j().c());
                }
                if (e0Var.j().e() != null) {
                    getCron().j(e0Var.j().e());
                }
                if (e0Var.j().b() != null) {
                    getCron().g(e0Var.j().b());
                }
                if (e0Var.j().d() != null) {
                    getCron().i(e0Var.j().d());
                }
            }
        }
        if (e0Var.O() != null) {
            getLogs().c(e0Var.O().booleanValue());
        }
        if (e0Var.A() != null) {
            setProfileSessionSampleRate(e0Var.A());
        }
        if (e0Var.C() != null) {
            setProfilingTracesDirPath(e0Var.C());
        }
        if (e0Var.z() != null) {
            setProfileLifecycle(e0Var.z());
        }
    }

    v retrieveParsedDsn() {
        return this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z11) {
        this.attachServerName = z11;
    }

    public void setAttachStacktrace(boolean z11) {
        this.attachStacktrace = z11;
    }

    public void setAttachThreads(boolean z11) {
        this.attachThreads = z11;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    public void setBeforeEnvelopeCallback(b bVar) {
        this.beforeEnvelopeCallback = bVar;
    }

    public void setBeforeSend(c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendFeedback(c cVar) {
        this.beforeSendFeedback = cVar;
    }

    public void setBeforeSendReplay(d dVar) {
    }

    public void setBeforeSendTransaction(e eVar) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z11) {
        this.captureOpenTelemetryEvents = z11;
    }

    public void setCompositePerformanceCollector(io.sentry.i iVar) {
        this.compositePerformanceCollector = iVar;
    }

    public void setConnectionStatusProvider(m0 m0Var) {
        this.connectionStatusProvider = m0Var;
    }

    public void setConnectionTimeoutMillis(int i11) {
        this.connectionTimeoutMillis = i11;
    }

    public void setContinuousProfiler(n0 n0Var) {
        if (this.continuousProfiler != i2.g() || n0Var == null) {
            return;
        }
        this.continuousProfiler = n0Var;
    }

    public void setCron(f fVar) {
        this.cron = fVar;
    }

    public void setDateProvider(o5 o5Var) {
        this.dateProvider.c(o5Var);
    }

    public void setDeadlineTimeout(long j11) {
        this.deadlineTimeout = j11;
    }

    public void setDebug(boolean z11) {
        this.debug = z11;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(h4 h4Var) {
        this.defaultScopeType = h4Var;
    }

    public void setDiagnosticLevel(b7 b7Var) {
        if (b7Var == null) {
            b7Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = b7Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    public void setDistributionController(o0 o0Var) {
        if (o0Var == null) {
            o0Var = j2.a();
        }
        this.distributionController = o0Var;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.f0.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z11) {
        this.enableAppStartProfiling = z11;
    }

    public void setEnableAutoSessionTracking(boolean z11) {
        this.enableAutoSessionTracking = z11;
    }

    public void setEnableBackpressureHandling(boolean z11) {
        this.enableBackpressureHandling = z11;
    }

    public void setEnableDeduplication(boolean z11) {
        this.enableDeduplication = z11;
    }

    public void setEnableEventSizeLimiting(boolean z11) {
        this.enableEventSizeLimiting = z11;
    }

    public void setEnableExternalConfiguration(boolean z11) {
        this.enableExternalConfiguration = z11;
    }

    public void setEnablePrettySerializationOutput(boolean z11) {
        this.enablePrettySerializationOutput = z11;
    }

    public void setEnableScopePersistence(boolean z11) {
        this.enableScopePersistence = z11;
    }

    public void setEnableScreenTracking(boolean z11) {
        this.enableScreenTracking = z11;
    }

    public void setEnableShutdownHook(boolean z11) {
        this.enableShutdownHook = z11;
    }

    public void setEnableSpotlight(boolean z11) {
        this.enableSpotlight = z11;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z11) {
        this.enableTimeToFullDisplayTracing = z11;
    }

    public void setEnableUncaughtExceptionHandler(boolean z11) {
        this.enableUncaughtExceptionHandler = z11;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z11) {
        this.enableUserInteractionBreadcrumbs = z11;
    }

    public void setEnableUserInteractionTracing(boolean z11) {
        this.enableUserInteractionTracing = z11;
    }

    public void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.s.a();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(p0 p0Var) {
        io.sentry.util.r<p0> rVar = this.envelopeReader;
        if (p0Var == null) {
            p0Var = k2.b();
        }
        rVar.c(p0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(c1 c1Var) {
        if (c1Var != null) {
            this.executorService = c1Var;
        }
    }

    public void setFatalLogger(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = m2.e();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(w6 w6Var) {
        this.feedbackOptions = w6Var;
    }

    public void setFlushTimeoutMillis(long j11) {
        this.flushTimeoutMillis = j11;
    }

    public void setForceInit(boolean z11) {
        this.forceInit = z11;
    }

    public void setFullyDisplayedReporter(g0 g0Var) {
        this.fullyDisplayedReporter = g0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l11) {
        this.idleTimeout = l11;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(m1 m1Var) {
        this.initPriority = m1Var;
    }

    @Deprecated
    public void setInstrumenter(n1 n1Var) {
        this.instrumenter = n1Var;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? m2.e() : new r(this, iLogger);
    }

    public void setLogs(h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j11) {
        this.maxAttachmentSize = j11;
    }

    public void setMaxBreadcrumbs(int i11) {
        this.maxBreadcrumbs = i11;
    }

    public void setMaxCacheItems(int i11) {
        this.maxCacheItems = i11;
    }

    public void setMaxDepth(int i11) {
        this.maxDepth = i11;
    }

    public void setMaxFeatureFlags(int i11) {
        this.maxFeatureFlags = i11;
    }

    public void setMaxQueueSize(int i11) {
        if (i11 > 0) {
            this.maxQueueSize = i11;
        }
    }

    public void setMaxRequestBodySize(m mVar) {
        this.maxRequestBodySize = mVar;
    }

    public void setMaxSpans(int i11) {
        this.maxSpans = i11;
    }

    public void setMaxTraceFileSize(long j11) {
        this.maxTraceFileSize = j11;
    }

    public void setModulesLoader(io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOnDiscard(i iVar) {
    }

    public void setOnOversizedEvent(j jVar) {
    }

    public void setOpenTelemetryMode(k7 k7Var) {
        this.openTelemetryMode = k7Var;
    }

    public void setPrintUncaughtStackTrace(boolean z11) {
        this.printUncaughtStackTrace = z11;
    }

    public void setProfileLifecycle(s3 s3Var) {
        this.profileLifecycle = s3Var;
        if (s3Var != s3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(b7.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d11) {
        if (io.sentry.util.c0.c(d11)) {
            this.profileSessionSampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(w0 w0Var) {
        this.profilerConverter = w0Var;
    }

    public void setProfilesSampleRate(Double d11) {
        if (io.sentry.util.c0.d(d11)) {
            this.profilesSampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(k kVar) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i11) {
        this.profilingTracesHz = i11;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z11) {
        this.propagateTraceparent = z11;
    }

    public void setProxy(l lVar) {
        this.proxy = lVar;
    }

    public void setReadTimeoutMillis(int i11) {
        this.readTimeoutMillis = i11;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(y3 y3Var) {
        if (y3Var == null) {
            y3Var = p2.a();
        }
        this.replayController = y3Var;
    }

    public void setRuntimeManager(io.sentry.util.runtime.a aVar) {
        this.runtimeManager = aVar;
    }

    public void setSampleRate(Double d11) {
        if (io.sentry.util.c0.f(d11)) {
            this.sampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.r rVar) {
        io.sentry.protocol.r rVarO = getSessionReplay().o();
        io.sentry.protocol.r rVar2 = this.sdkVersion;
        if (rVar2 != null && rVarO != null && rVar2.equals(rVarO)) {
            getSessionReplay().M(rVar);
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z11) {
        this.sendClientReports = z11;
        if (z11) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z11) {
        this.sendDefaultPii = z11;
    }

    public void setSendModules(boolean z11) {
        this.sendModules = z11;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(e1 e1Var) {
        io.sentry.util.r<e1> rVar = this.serializer;
        if (e1Var == null) {
            e1Var = a3.g();
        }
        rVar.c(e1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j11) {
        this.sessionFlushTimeoutMillis = j11;
    }

    public void setSessionReplay(s7 s7Var) {
        this.sessionReplay = s7Var;
    }

    public void setSessionTrackingIntervalMillis(long j11) {
        this.sessionTrackingIntervalMillis = j11;
    }

    public void setShutdownTimeoutMillis(long j11) {
        this.shutdownTimeoutMillis = j11;
    }

    public void setSocketTagger(f1 f1Var) {
        if (f1Var == null) {
            f1Var = b3.c();
        }
        this.socketTagger = f1Var;
    }

    public void setSpanFactory(h1 h1Var) {
        this.spanFactory = h1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z11) {
        this.startProfilerOnAppStart = z11;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z11) {
        this.traceOptionsRequests = z11;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z11) {
        this.traceSampling = z11;
    }

    public void setTracesSampleRate(Double d11) {
        if (io.sentry.util.c0.g(d11)) {
            this.tracesSampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(n nVar) {
        this.tracesSampler = nVar;
    }

    public void setTransactionProfiler(j1 j1Var) {
        if (this.transactionProfiler != f3.c() || j1Var == null) {
            return;
        }
        this.transactionProfiler = j1Var;
    }

    public void setTransportFactory(k1 k1Var) {
        if (k1Var == null) {
            k1Var = g3.b();
        }
        this.transportFactory = k1Var;
    }

    public void setTransportGate(io.sentry.transport.r rVar) {
        if (rVar == null) {
            rVar = io.sentry.transport.u.a();
        }
        this.transportGate = rVar;
    }

    public void setVersionDetector(l1 l1Var) {
        this.versionDetector = l1Var;
    }

    public void setViewHierarchyExporters(List<io.sentry.internal.viewhierarchy.a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private q7(boolean z11) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.l7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.b(this.f80748a);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = m2.e();
        this.fatalLogger = m2.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.m7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.d(this.f80770a);
            }
        });
        this.envelopeReader = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.n7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.c(this.f80795a);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = g3.b();
        this.transportGate = io.sentry.transport.u.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = z2.f();
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.s.a();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = m.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = f3.c();
        this.continuousProfiler = i2.g();
        this.profilerConverter = n2.b();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = n1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.d();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.o7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.a();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = g2.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = g0.a();
        this.connectionStatusProvider = new h2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = d3.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = p2.a();
        this.distributionController = j2.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = h4.ISOLATION;
        this.initPriority = m1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = k7.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = h3.b();
        this.profileLifecycle = s3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        this.logs = new h();
        this.socketTagger = b3.c();
        this.runtimeManager = new io.sentry.util.runtime.b();
        this.distribution = new g();
        io.sentry.protocol.r rVarCreateSdkVersion = createSdkVersion();
        this.experimental = new d0(z11, rVarCreateSdkVersion);
        this.sessionReplay = new s7(z11, rVarCreateSdkVersion);
        this.feedbackOptions = new w6(new w6.a() { // from class: io.sentry.p7
        });
        if (z11) {
            return;
        }
        setSpanFactory(l8.a(new io.sentry.util.u(), m2.e()));
        v6 v6Var = new v6(this);
        this.executorService = v6Var;
        v6Var.a();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new c2(this));
        copyOnWriteArrayList.add(new w(this));
        if (io.sentry.util.a0.c()) {
            copyOnWriteArrayList.add(new t7());
        }
        setSentryClientName("sentry.java/8.29.0");
        setSdkVersion(rVarCreateSdkVersion);
        addPackageInfo();
    }
}
