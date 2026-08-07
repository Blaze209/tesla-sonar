package ef0;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.tesla.logging.g f62901d = com.tesla.logging.g.h("BleWakeLock");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f62902e = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile PowerManager.WakeLock f62905c;

    public j(Context context, String str) {
        this.f62903a = context.getApplicationContext();
        this.f62904b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z11) {
        if (z11) {
            return;
        }
        f62901d.n(this.f62904b + " revoked by system");
    }

    public void b(long j11) {
        e();
        PowerManager powerManager = (PowerManager) this.f62903a.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, this.f62904b);
            if (Build.VERSION.SDK_INT >= 33) {
                wakeLockNewWakeLock.setStateListener(f62902e, new PowerManager.WakeLockStateListener() { // from class: ef0.i
                    @Override // android.os.PowerManager.WakeLockStateListener
                    public final void onStateChanged(boolean z11) {
                        this.f62900a.d(z11);
                    }
                });
            }
            this.f62905c = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire(j11);
            f62901d.j(this.f62904b + " acquired (" + j11 + "ms timeout)");
        }
    }

    public boolean c() {
        PowerManager.WakeLock wakeLock = this.f62905c;
        return wakeLock != null && wakeLock.isHeld();
    }

    public void e() {
        PowerManager.WakeLock wakeLock = this.f62905c;
        this.f62905c = null;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        wakeLock.release();
        f62901d.j(this.f62904b + " released");
    }
}
