package com.zxcpoiu.incallmanager;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager f58881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f58882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PowerManager.WakeLock f58883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PowerManager.WakeLock f58884d;

    public l(Context context) {
        this.f58882b = null;
        this.f58883c = null;
        this.f58884d = null;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f58881a = powerManager;
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(805306394, "InCallWakeLockUtils");
        this.f58882b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = this.f58881a.newWakeLock(1, "InCallWakeLockUtils");
        this.f58884d = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock3 = this.f58881a.newWakeLock(805306394, "InCallWakeLockUtils");
        this.f58883c = wakeLockNewWakeLock3;
        wakeLockNewWakeLock3.setReferenceCounted(false);
    }

    private boolean a(PowerManager.WakeLock wakeLock) {
        return b(wakeLock, 0L);
    }

    private boolean b(PowerManager.WakeLock wakeLock, long j11) {
        synchronized (wakeLock) {
            try {
                if (wakeLock.isHeld()) {
                    return false;
                }
                if (j11 > 0) {
                    wakeLock.acquire(j11);
                } else {
                    wakeLock.acquire();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(PowerManager.WakeLock wakeLock) {
        synchronized (wakeLock) {
            try {
                if (!wakeLock.isHeld()) {
                    return false;
                }
                wakeLock.release();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        boolean zA = a(this.f58884d);
        Log.d("InCallWakeLockUtils", "acquirePartialWakeLock(). sta=" + zA);
        return zA;
    }

    public boolean e(long j11) {
        boolean zB = b(this.f58883c, j11);
        Log.d("InCallWakeLockUtils", String.format("acquirePokeFullWakeLockReleaseAfter() timeout=%s, sta=%s", Long.valueOf(j11), Boolean.valueOf(zB)));
        return zB;
    }

    public boolean f() {
        boolean zC = c(this.f58884d);
        Log.d("InCallWakeLockUtils", "releasePartialWakeLock(). sta=" + zC);
        return zC;
    }
}
