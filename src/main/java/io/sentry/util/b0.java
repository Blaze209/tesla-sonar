package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicLong f81452c = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f81453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f81454b;

    public b0() {
        this(a(), a());
    }

    private static long a() {
        AtomicLong atomicLong;
        long j11;
        long j12;
        do {
            atomicLong = f81452c;
            j11 = atomicLong.get();
            long j13 = (j11 >> 12) ^ j11;
            long j14 = j13 ^ (j13 << 25);
            j12 = (j14 ^ (j14 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public void b(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            long j11 = (this.f81453a * 6364136223846793005L) + this.f81454b;
            this.f81453a = j11;
            bArr[i11] = (byte) ((((j11 >>> 22) ^ j11) >>> ((int) ((j11 >>> 61) + 22))) >>> 24);
        }
    }

    public double c() {
        long j11 = this.f81453a * 6364136223846793005L;
        long j12 = this.f81454b;
        long j13 = j11 + j12;
        long j14 = (((j13 >>> 22) ^ j13) >>> ((int) ((j13 >>> 61) + 22))) & 4294967295L;
        long j15 = (j13 * 6364136223846793005L) + j12;
        this.f81453a = j15;
        return (((j14 >>> 6) << 27) + (((((j15 >>> 22) ^ j15) >>> ((int) ((j15 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }

    public void d(long j11, long j12) {
        long j13 = (j12 << 1) | 1;
        this.f81454b = j13;
        this.f81453a = j13 + j11;
    }

    public b0(long j11, long j12) {
        d(j11, j12);
    }
}
