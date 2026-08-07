package androidx.work;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b#\u0018\u0000 <2\u00020\u0001:\u0003#%!B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\r\u001a\u00020\f8G¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b!\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b,\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b4\u0010:R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b0\u00108R\u0017\u0010\u0016\u001a\u00020\f8G¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b;\u0010\u001e¨\u0006="}, d2 = {"Landroidx/work/r0;", "", "Ljava/util/UUID;", "id", "Landroidx/work/r0$c;", "state", "", "", "tags", "Landroidx/work/g;", "outputData", ReactProgressBarViewManager.PROP_PROGRESS, "", "runAttemptCount", "generation", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "", "initialDelayMillis", "Landroidx/work/r0$b;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/r0$c;Ljava/util/Set;Landroidx/work/g;Landroidx/work/g;IILandroidx/work/e;JLandroidx/work/r0$b;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/UUID;", "c", "()Ljava/util/UUID;", "b", "Landroidx/work/r0$c;", "j", "()Landroidx/work/r0$c;", "Ljava/util/Set;", "l", "()Ljava/util/Set;", DateTokenConverter.CONVERTER_KEY, "Landroidx/work/g;", "f", "()Landroidx/work/g;", "e", "h", "I", IntegerTokenConverter.CONVERTER_KEY, "g", "Landroidx/work/e;", "()Landroidx/work/e;", "J", "()J", "Landroidx/work/r0$b;", "()Landroidx/work/r0$b;", "k", "m", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> tags;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g outputData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final g progress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int runAttemptCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int generation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final e constraints;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long initialDelayMillis;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final b periodicityInfo;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long nextScheduleTimeMillis;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int stopReason;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/work/r0$b;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long repeatIntervalMillis;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long flexIntervalMillis;

        public b(long j11, long j12) {
            this.repeatIntervalMillis = j11;
            this.flexIntervalMillis = j12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && p013kotlin.jvm.internal.s.f(b.class, other.getClass())) {
                b bVar = (b) other;
                if (bVar.repeatIntervalMillis == this.repeatIntervalMillis && bVar.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.repeatIntervalMillis) * 31) + Long.hashCode(this.flexIntervalMillis);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + CoreConstants.CURLY_RIGHT;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/work/r0$c;", "", "<init>", "(Ljava/lang/String;I)V", "", "isFinished", "()Z", "ENQUEUED", DebugCoroutineInfoImplKt.RUNNING, "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public r0(UUID id2, c state, Set<String> tags, g outputData, g progress, int i11, int i12, e constraints, long j11, b bVar, long j12, int i13) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(tags, "tags");
        p013kotlin.jvm.internal.s.k(outputData, "outputData");
        p013kotlin.jvm.internal.s.k(progress, "progress");
        p013kotlin.jvm.internal.s.k(constraints, "constraints");
        this.id = id2;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i11;
        this.generation = i12;
        this.constraints = constraints;
        this.initialDelayMillis = j11;
        this.periodicityInfo = bVar;
        this.nextScheduleTimeMillis = j12;
        this.stopReason = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p013kotlin.jvm.internal.s.f(r0.class, other.getClass())) {
            return false;
        }
        r0 r0Var = (r0) other;
        if (this.runAttemptCount == r0Var.runAttemptCount && this.generation == r0Var.generation && p013kotlin.jvm.internal.s.f(this.id, r0Var.id) && this.state == r0Var.state && p013kotlin.jvm.internal.s.f(this.outputData, r0Var.outputData) && p013kotlin.jvm.internal.s.f(this.constraints, r0Var.constraints) && this.initialDelayMillis == r0Var.initialDelayMillis && p013kotlin.jvm.internal.s.f(this.periodicityInfo, r0Var.periodicityInfo) && this.nextScheduleTimeMillis == r0Var.nextScheduleTimeMillis && this.stopReason == r0Var.stopReason && p013kotlin.jvm.internal.s.f(this.tags, r0Var.tags)) {
            return p013kotlin.jvm.internal.s.f(this.progress, r0Var.progress);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getOutputData() {
        return this.outputData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + Long.hashCode(this.initialDelayMillis)) * 31;
        b bVar = this.periodicityInfo;
        return ((((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.nextScheduleTimeMillis)) * 31) + Integer.hashCode(this.stopReason);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    public final Set<String> l() {
        return this.tags;
    }

    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }
}
