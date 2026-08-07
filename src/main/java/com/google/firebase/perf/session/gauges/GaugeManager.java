package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import yu.t;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private com.google.firebase.perf.v1.b applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final t<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final t<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final t<l> memoryGaugeCollector;
    private String sessionId;
    private final pw.k transportManager;
    private static final kw.a logger = kw.a.e();
    private static final GaugeManager instance = new GaugeManager();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44509a;

        static {
            int[] iArr = new int[com.google.firebase.perf.v1.b.values().length];
            f44509a = iArr;
            try {
                iArr[com.google.firebase.perf.v1.b.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44509a[com.google.firebase.perf.v1.b.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new t(new yv.b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // yv.b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), pw.k.k(), com.google.firebase.perf.config.a.g(), null, new t(new yv.b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // yv.b
            public final Object get() {
                return GaugeManager.c();
            }
        }), new t(new yv.b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // yv.b
            public final Object get() {
                return GaugeManager.b();
            }
        }));
    }

    public static /* synthetic */ l b() {
        return new l();
    }

    public static /* synthetic */ c c() {
        return new c();
    }

    private long getCpuGaugeCollectionFrequencyMs(com.google.firebase.perf.v1.b bVar) {
        long jY;
        int i11 = a.f44509a[bVar.ordinal()];
        if (i11 != 1) {
            jY = i11 != 2 ? -1L : this.configResolver.z();
        } else {
            jY = this.configResolver.y();
        }
        if (c.f(jY)) {
            return -1L;
        }
        return jY;
    }

    private GaugeMetadata getGaugeMetadata() {
        return GaugeMetadata.newBuilder().c(this.gaugeMetadataManager.a()).d(this.gaugeMetadataManager.b()).e(this.gaugeMetadataManager.c()).build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(com.google.firebase.perf.v1.b bVar) {
        long jB;
        int i11 = a.f44509a[bVar.ordinal()];
        if (i11 != 1) {
            jB = i11 != 2 ? -1L : this.configResolver.C();
        } else {
            jB = this.configResolver.B();
        }
        if (l.e(jB)) {
            return -1L;
        }
        return jB;
    }

    private boolean startCollectingCpuMetrics(long j11, com.google.firebase.perf.util.l lVar) {
        if (j11 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().i(j11, lVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j11, com.google.firebase.perf.util.l lVar) {
        if (j11 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().h(j11, lVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncFlush(String str, com.google.firebase.perf.v1.b bVar) {
        GaugeMetric.b bVarNewBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().f44516a.isEmpty()) {
            bVarNewBuilder.b(this.cpuGaugeCollector.get().f44516a.poll());
        }
        while (!this.memoryGaugeCollector.get().f44539b.isEmpty()) {
            bVarNewBuilder.a(this.memoryGaugeCollector.get().f44539b.poll());
        }
        bVarNewBuilder.h(str);
        this.transportManager.v(bVarNewBuilder.build(), bVar);
    }

    public void collectGaugeMetricOnce(com.google.firebase.perf.util.l lVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), lVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, com.google.firebase.perf.v1.b bVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.v(GaugeMetric.newBuilder().h(str).c(getGaugeMetadata()).build(), bVar);
        return true;
    }

    public void startCollectingGauges(ow.a aVar, final com.google.firebase.perf.v1.b bVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(bVar, aVar.d());
        if (jStartCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strH = aVar.h();
        this.sessionId = strH;
        this.applicationProcessState = bVar;
        try {
            long j11 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44525a.syncFlush(strH, bVar);
                }
            }, j11, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.j("Unable to start collecting Gauges: " + e11.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final com.google.firebase.perf.v1.b bVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().j();
        this.memoryGaugeCollector.get().i();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f44522a.syncFlush(str, bVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, com.google.firebase.perf.util.l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    GaugeManager(t<ScheduledExecutorService> tVar, pw.k kVar, com.google.firebase.perf.config.a aVar, i iVar, t<c> tVar2, t<l> tVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = tVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = tVar2;
        this.memoryGaugeCollector = tVar3;
    }

    private long startCollectingGauges(com.google.firebase.perf.v1.b bVar, com.google.firebase.perf.util.l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(bVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(bVar);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
