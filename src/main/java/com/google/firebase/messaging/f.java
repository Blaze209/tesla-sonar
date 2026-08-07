package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f44280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0 f44282c;

    public f(Context context, l0 l0Var, ExecutorService executorService) {
        this.f44280a = executorService;
        this.f44281b = context;
        this.f44282c = l0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f44281b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f44281b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f44281b.getSystemService("notification")).notify(aVar.f44256b, aVar.f44257c, aVar.f44255a.c());
    }

    private h0 d() {
        h0 h0VarP = h0.p(this.f44282c.p("gcm.n.image"));
        if (h0VarP != null) {
            h0VarP.B(this.f44280a);
        }
        return h0VarP;
    }

    private void e(androidx.core.app.o.e eVar, h0 h0Var) {
        if (h0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(h0Var.t(), 5L, TimeUnit.SECONDS);
            eVar.u(bitmap);
            eVar.F(new androidx.core.app.o.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            h0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e11.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            h0Var.close();
        }
    }

    boolean a() {
        if (this.f44282c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        h0 h0VarD = d();
        d.a aVarE = d.e(this.f44281b, this.f44282c);
        e(aVarE.f44255a, h0VarD);
        c(aVarE);
        return true;
    }
}
