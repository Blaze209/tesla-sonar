package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f10356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.p f10357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10359d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f10360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f10361b;

        public a(Context context) {
            this.f10360a = context;
        }

        public void a(boolean z11, boolean z12) {
            if (z11 && this.f10361b == null) {
                WifiManager wifiManager = (WifiManager) this.f10360a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    s7.t.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f10361b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f10361b;
            if (wifiLock == null) {
                return;
            }
            if (z11 && z12) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public k3(Context context, Looper looper, s7.j jVar) {
        this.f10356a = new a(context.getApplicationContext());
        this.f10357b = jVar.c(looper, null);
    }

    public void c(final boolean z11) {
        if (this.f10358c == z11) {
            return;
        }
        this.f10358c = z11;
        final boolean z12 = this.f10359d;
        this.f10357b.g(new Runnable() { // from class: androidx.media3.exoplayer.i3
            @Override // java.lang.Runnable
            public final void run() {
                this.f10303a.f10356a.a(z11, z12);
            }
        });
    }

    public void d(final boolean z11) {
        if (this.f10359d == z11) {
            return;
        }
        this.f10359d = z11;
        if (this.f10358c) {
            this.f10357b.g(new Runnable() { // from class: androidx.media3.exoplayer.j3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10337a.f10356a.a(true, z11);
                }
            });
        }
    }
}
