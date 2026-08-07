package z50;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z50.o, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lz50/o;", "", "", "initialDelayMs", "", "maxNumberOfRetries", "retryInterval", "<init>", "(JIJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "I", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PollTimingOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long initialDelayMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxNumberOfRetries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long retryInterval;

    public PollTimingOptions(long j11, int i11, long j12) {
        this.initialDelayMs = j11;
        this.maxNumberOfRetries = i11;
        this.retryInterval = j12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getInitialDelayMs() {
        return this.initialDelayMs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxNumberOfRetries() {
        return this.maxNumberOfRetries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getRetryInterval() {
        return this.retryInterval;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollTimingOptions)) {
            return false;
        }
        PollTimingOptions pollTimingOptions = (PollTimingOptions) other;
        return this.initialDelayMs == pollTimingOptions.initialDelayMs && this.maxNumberOfRetries == pollTimingOptions.maxNumberOfRetries && this.retryInterval == pollTimingOptions.retryInterval;
    }

    public int hashCode() {
        return (((Long.hashCode(this.initialDelayMs) * 31) + Integer.hashCode(this.maxNumberOfRetries)) * 31) + Long.hashCode(this.retryInterval);
    }

    public String toString() {
        return "PollTimingOptions(initialDelayMs=" + this.initialDelayMs + ", maxNumberOfRetries=" + this.maxNumberOfRetries + ", retryInterval=" + this.retryInterval + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PollTimingOptions(long j11, int i11, long j12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 1) != 0) {
            io0.b.Companion companion = io0.b.INSTANCE;
            j11 = io0.b.p(io0.d.r(1.75d, io0.e.SECONDS));
        }
        long j13 = j11;
        int i13 = (i12 & 2) != 0 ? 180 : i11;
        if ((i12 & 4) != 0) {
            io0.b.Companion companion2 = io0.b.INSTANCE;
            j12 = io0.b.p(io0.d.r(0.25d, io0.e.SECONDS));
        }
        this(j13, i13, j12);
    }
}
