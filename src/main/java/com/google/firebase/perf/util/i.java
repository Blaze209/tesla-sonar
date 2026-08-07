package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f44556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeUnit f44558c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44559a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f44559a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44559a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44559a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j11, long j12, TimeUnit timeUnit) {
        this.f44556a = j11;
        this.f44557b = j12;
        this.f44558c = timeUnit;
    }

    public double a() {
        int i11 = a.f44559a[this.f44558c.ordinal()];
        if (i11 == 1) {
            return (this.f44556a / this.f44557b) * TimeUnit.SECONDS.toNanos(1L);
        }
        if (i11 != 2) {
            return i11 != 3 ? this.f44556a / this.f44558c.toSeconds(this.f44557b) : (this.f44556a / this.f44557b) * TimeUnit.SECONDS.toMillis(1L);
        }
        return (this.f44556a / this.f44557b) * TimeUnit.SECONDS.toMicros(1L);
    }
}
