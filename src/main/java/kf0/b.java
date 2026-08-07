package kf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkf0/b;", "", "", "throttleIntervalMs", "<init>", "(J)V", "", "errorSignature", "Lkf0/b$a;", "a", "(Ljava/lang/String;)Lkf0/b$a;", "J", "b", "lastErrorTime", "c", "Ljava/lang/String;", "lastErrorSignature", "", DateTokenConverter.CONVERTER_KEY, "I", "skippedCount", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long throttleIntervalMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastErrorTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String lastErrorSignature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int skippedCount;

    /* JADX INFO: renamed from: kf0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"Lkf0/b$a;", "", "", "shouldLog", "", "skippedCount", "<init>", "(ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "I", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ThrottleResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldLog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int skippedCount;

        public ThrottleResult(boolean z11, int i11) {
            this.shouldLog = z11;
            this.skippedCount = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShouldLog() {
            return this.shouldLog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSkippedCount() {
            return this.skippedCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThrottleResult)) {
                return false;
            }
            ThrottleResult throttleResult = (ThrottleResult) other;
            return this.shouldLog == throttleResult.shouldLog && this.skippedCount == throttleResult.skippedCount;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.shouldLog) * 31) + Integer.hashCode(this.skippedCount);
        }

        public String toString() {
            return "ThrottleResult(shouldLog=" + this.shouldLog + ", skippedCount=" + this.skippedCount + ")";
        }
    }

    public b(long j11) {
        this.throttleIntervalMs = j11;
    }

    public final ThrottleResult a(String errorSignature) {
        s.k(errorSignature, "errorSignature");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (s.f(errorSignature, this.lastErrorSignature) && jCurrentTimeMillis - this.lastErrorTime <= this.throttleIntervalMs) {
            this.skippedCount++;
            return new ThrottleResult(false, 0);
        }
        int i11 = s.f(this.lastErrorSignature, errorSignature) ? this.skippedCount : 0;
        this.lastErrorTime = jCurrentTimeMillis;
        this.lastErrorSignature = errorSignature;
        this.skippedCount = 0;
        return new ThrottleResult(true, i11);
    }

    public /* synthetic */ b(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10000L : j11);
    }
}
