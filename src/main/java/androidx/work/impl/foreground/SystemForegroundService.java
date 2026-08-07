package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.p003lifecycle.b0;
import androidx.work.z;

/* JADX INFO: loaded from: classes3.dex */
public class SystemForegroundService extends b0 implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f14566e = z.i("SystemFgService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SystemForegroundService f14567f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    androidx.work.impl.foreground.a f14569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    NotificationManager f14570d;

    static class a {
        static void a(Service service, int i11, Notification notification, int i12) {
            service.startForeground(i11, notification, i12);
        }
    }

    static class b {
        static void a(Service service, int i11, Notification notification, int i12) {
            try {
                service.startForeground(i11, notification, i12);
            } catch (ForegroundServiceStartNotAllowedException e11) {
                z.e().l(SystemForegroundService.f14566e, "Unable to start foreground service", e11);
            } catch (SecurityException e12) {
                z.e().l(SystemForegroundService.f14566e, "Unable to start foreground service", e12);
            }
        }
    }

    private void f() {
        this.f14570d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f14569c = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i11, Notification notification) {
        this.f14570d.notify(i11, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i11) {
        this.f14568b = true;
        z.e().a(f14566e, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f14567f = null;
        stopSelf(i11);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i11, int i12, Notification notification) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            b.a(this, i11, notification, i12);
        } else if (i13 >= 29) {
            a.a(this, i11, notification, i12);
        } else {
            startForeground(i11, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i11) {
        this.f14570d.cancel(i11);
    }

    @Override // androidx.p003lifecycle.b0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f14567f = this;
        f();
    }

    @Override // androidx.p003lifecycle.b0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f14569c.l();
    }

    @Override // androidx.p003lifecycle.b0, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f14568b) {
            z.e().f(f14566e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f14569c.l();
            f();
            this.f14568b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f14569c.m(intent, i12);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i11) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f14569c.n(i11, 2048);
    }

    public void onTimeout(int i11, int i12) {
        this.f14569c.n(i11, i12);
    }
}
