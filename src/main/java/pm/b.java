package pm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0018"}, d2 = {"Lpm/b;", "Lpm/p;", "", "numCpuBoundThreads", "<init>", "(I)V", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "e", "g", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "f", "()Ljava/util/concurrent/ScheduledExecutorService;", "a", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "ioBoundExecutor", "decodeExecutor", "backgroundExecutor", "lightWeightBackgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundScheduledExecutorService", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor ioBoundExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Executor decodeExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor backgroundExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Executor lightWeightBackgroundExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService backgroundScheduledExecutorService;

    public b(int i11) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new b0(10, "FrescoIoBoundExecutor", true));
        p013kotlin.jvm.internal.s.j(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.ioBoundExecutor = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i11, new b0(10, "FrescoDecodeExecutor", true));
        p013kotlin.jvm.internal.s.j(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.decodeExecutor = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i11, new b0(10, "FrescoBackgroundExecutor", true));
        p013kotlin.jvm.internal.s.j(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.backgroundExecutor = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new b0(10, "FrescoLightWeightBackgroundExecutor", true));
        p013kotlin.jvm.internal.s.j(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.lightWeightBackgroundExecutor = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i11, new b0(10, "FrescoBackgroundExecutor", true));
        p013kotlin.jvm.internal.s.j(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.backgroundScheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // pm.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public Executor getLightWeightBackgroundExecutor() {
        return this.lightWeightBackgroundExecutor;
    }

    @Override // pm.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    @Override // pm.p
    /* JADX INFO: renamed from: c, reason: from getter */
    public Executor getIoBoundExecutor() {
        return this.ioBoundExecutor;
    }

    @Override // pm.p
    public Executor d() {
        return this.ioBoundExecutor;
    }

    @Override // pm.p
    public Executor e() {
        return this.ioBoundExecutor;
    }

    @Override // pm.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public ScheduledExecutorService getBackgroundScheduledExecutorService() {
        return this.backgroundScheduledExecutorService;
    }

    @Override // pm.p
    /* JADX INFO: renamed from: g, reason: from getter */
    public Executor getDecodeExecutor() {
        return this.decodeExecutor;
    }
}
