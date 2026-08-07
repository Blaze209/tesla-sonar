package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes3.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDelay(int i11) {
        long j11 = i11;
        this(j11, j11);
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j11 = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j11;
    }

    public FixedDelay(long j11, long j12) {
        this.nextDelay = j11;
        this.subsequentDelay = j12;
    }
}
