package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WifiManager f40072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f40073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40075d;

    public i2(Context context) {
        this.f40072a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f40073b;
        if (wifiLock == null) {
            return;
        }
        if (this.f40074c && this.f40075d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z11) {
        if (z11 && this.f40073b == null) {
            WifiManager wifiManager = this.f40072a;
            if (wifiManager == null) {
                ts.u.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f40073b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f40074c = z11;
        c();
    }

    public void b(boolean z11) {
        this.f40075d = z11;
        c();
    }
}
