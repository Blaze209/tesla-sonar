package com.google.android.gms.internal.identity;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class zzfd {
    public static boolean zza(CountDownLatch countDownLatch, long j11, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z11 = false;
        try {
            long nanos = timeUnit.toNanos(30L);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z11) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }
}
