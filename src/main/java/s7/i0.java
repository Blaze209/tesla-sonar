package s7;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f110425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f110426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f110427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f110428d = new ThreadLocal<>();

    public i0(long j11) {
        i(j11);
    }

    public static long h(long j11) {
        return q0.s1(j11, 1000000L, 90000L);
    }

    public static long k(long j11) {
        return q0.s1(j11, 90000L, 1000000L);
    }

    public static long l(long j11) {
        return k(j11) % 8589934592L;
    }

    public synchronized long a(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f110425a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.f(this.f110428d.get())).longValue();
                }
                this.f110426b = jLongValue - j11;
                notifyAll();
            }
            this.f110427c = j11;
            return j11 + this.f110426b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f110427c;
            if (j12 != -9223372036854775807L) {
                long jK = k(j12);
                long j13 = (4294967296L + jK) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j11;
                j11 += j13 * 8589934592L;
                if (Math.abs(j14 - jK) < Math.abs(j11 - jK)) {
                    j11 = j14;
                }
            }
            return a(h(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f110427c;
            if (j12 != -9223372036854775807L) {
                long jK = k(j12);
                long j13 = jK / 8589934592L;
                long j14 = (j13 * 8589934592L) + j11;
                j11 += (j13 + 1) * 8589934592L;
                if (j14 >= jK) {
                    j11 = j14;
                }
            }
            return a(h(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        long j11;
        j11 = this.f110425a;
        if (j11 == Long.MAX_VALUE || j11 == 9223372036854775806L) {
            j11 = -9223372036854775807L;
        }
        return j11;
    }

    public synchronized long e() {
        long j11;
        try {
            j11 = this.f110427c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != -9223372036854775807L ? j11 + this.f110426b : d();
    }

    public synchronized long f() {
        return this.f110426b;
    }

    public synchronized boolean g() {
        return this.f110426b != -9223372036854775807L;
    }

    public synchronized void i(long j11) {
        this.f110425a = j11;
        this.f110426b = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f110427c = -9223372036854775807L;
    }

    public synchronized void j(boolean z11, long j11, long j12) {
        try {
            a.h(this.f110425a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z11) {
                this.f110428d.set(Long.valueOf(j11));
            } else {
                long jElapsedRealtime = 0;
                long j13 = j12;
                while (!g()) {
                    if (j12 == 0) {
                        wait();
                    } else {
                        a.h(j13 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j13);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j12 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j12 + " milliseconds");
                        }
                        j13 = j12 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
