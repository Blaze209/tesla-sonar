package ts;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f115024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f115025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f115026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f115027d = new ThreadLocal<>();

    public m0(long j11) {
        h(j11);
    }

    public static long g(long j11) {
        return (j11 * 1000000) / 90000;
    }

    public static long i(long j11) {
        return (j11 * 90000) / 1000000;
    }

    public synchronized long a(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.f115024a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.e(this.f115027d.get())).longValue();
                }
                this.f115025b = jLongValue - j11;
                notifyAll();
            }
            this.f115026c = j11;
            return j11 + this.f115025b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f115026c;
            if (j12 != -9223372036854775807L) {
                long jI = i(j12);
                long j13 = (4294967296L + jI) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j11;
                j11 += j13 * 8589934592L;
                if (Math.abs(j14 - jI) < Math.abs(j11 - jI)) {
                    j11 = j14;
                }
            }
            return a(g(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c() {
        long j11;
        j11 = this.f115024a;
        if (j11 == Long.MAX_VALUE || j11 == 9223372036854775806L) {
            j11 = -9223372036854775807L;
        }
        return j11;
    }

    public synchronized long d() {
        long j11;
        try {
            j11 = this.f115026c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != -9223372036854775807L ? j11 + this.f115025b : c();
    }

    public synchronized long e() {
        return this.f115025b;
    }

    public synchronized boolean f() {
        return this.f115025b != -9223372036854775807L;
    }

    public synchronized void h(long j11) {
        this.f115024a = j11;
        this.f115025b = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f115026c = -9223372036854775807L;
    }
}
