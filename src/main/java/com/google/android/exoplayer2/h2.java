package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PowerManager f40006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f40007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40009d;

    public h2(Context context) {
        this.f40006a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f40007b;
        if (wakeLock == null) {
            return;
        }
        if (this.f40008c && this.f40009d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z11) {
        if (z11 && this.f40007b == null) {
            PowerManager powerManager = this.f40006a;
            if (powerManager == null) {
                ts.u.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f40007b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f40008c = z11;
        c();
    }

    public void b(boolean z11) {
        this.f40009d = z11;
        c();
    }
}
